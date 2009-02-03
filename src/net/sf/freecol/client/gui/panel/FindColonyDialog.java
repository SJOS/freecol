/**
 *  Copyright (C) 2002-2007  The FreeCol Team
 *
 *  This file is part of FreeCol.
 *
 *  FreeCol is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  FreeCol is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeCol.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.freecol.client.gui.panel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import net.sf.freecol.client.ClientOptions;
import net.sf.freecol.client.gui.Canvas;
import net.sf.freecol.client.gui.i18n.Messages;
import net.sf.freecol.common.model.Colony;
import net.sf.freecol.common.model.Player;
import cz.autel.dmi.HIGLayout;

/**
 * Finds a colony on the map.
 */
public final class FindColonyDialog extends FreeColDialog implements ListSelectionListener {

    private static final Logger logger = Logger.getLogger(FindColonyDialog.class.getName());

    private JButton okButton = new JButton(Messages.message("ok"));

    private List<Colony> knownColonies = new ArrayList<Colony>();

    private JList colonyList;


    /**
     * The constructor to use.
     */
    public FindColonyDialog(Canvas parent) {
        super(parent);

        for (Player player : getCanvas().getClient().getGame().getEuropeanPlayers()) {
            knownColonies.addAll(player.getColonies());
        }

        int comparator = ClientOptions.COLONY_COMPARATOR_NAME;
        Collections.sort(knownColonies, ClientOptions.getColonyComparator(comparator));

        HIGLayout layout = new HIGLayout(new int[] {0}, new int[] {0, 20, 0, 10, 0 });
        layout.setColumnWeight(1, 1);
        layout.setRowWeight(3, 1);
        setLayout(layout);

        JLabel header = new JLabel(Messages.message("menuBar.view.findColony"));
        header.setFont(smallHeaderFont);
        add(header, higConst.rc(1, 1, ""));

        colonyList = new JList(knownColonies.toArray(new Colony[knownColonies.size()]));
        JScrollPane listScroller = new JScrollPane(colonyList);
        listScroller.setPreferredSize(new Dimension(250, 250));
        colonyList.addListSelectionListener(this);
        add(listScroller, higConst.rc(3, 1));

        okButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    remove();
                }
            });
        add(okButton, higConst.rc(5, 1));

        setSize(getPreferredSize());
    }

    public void requestFocus() {
        okButton.requestFocus();
    }

    public void remove() {
        getCanvas().remove(this);
    }

    /**
     * This function analyses an event and calls the right methods to take care
     * of the user's requests.
     * 
     * @param event The incoming ActionEvent.
     */
    public void valueChanged(ListSelectionEvent e) {
        Colony colony = (Colony) colonyList.getSelectedValue();
        getCanvas().getGUI().setFocus(colony.getTile().getPosition());
    }

} 

