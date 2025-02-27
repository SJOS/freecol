## FreeCol 0.13.0 (July 9, 2022) ##

The FreeCol team are pleased to announce the release of FreeCol 0.13.0. All 0.11.x (x != 4) and 0.12.0 games should continue to work with 0.13.0, but not vice versa.

We hope you enjoy FreeCol 0.13.0. Onward to 1.0.

The FreeCol Team


### User-visible changes since 0.12.0-release ###

* In-game music by Alexander Zhelanov.
* New skins for the minimap and the unit info panel.
* New animated rivers.
* Major river tiles now gets the minor river production bonus twice.
* The rendering performance has been improved.
* Rendering quality can now be modified using a new option in the Preferences.
* More high resolution versions of existing images have been added.
* Better support for screens with low resolution.
* Adding two new mods for changing the skins for the minimap and the unit info panel.
* Multiplayer savegame loading has been fixed.
* Over 30 bugs fixed.


## FreeCol 0.12.0 (May 1, 2022) ##

The FreeCol team are pleased to announce the release of FreeCol 0.12.0.  Its been a while.  All 0.11.x (x != 4) games should continue to work with 0.12.0, but not vice versa.

We hope you enjoy FreeCol 0.12.0. Onward to 1.0.

The FreeCol Team


### Java Platform ###

FreeCol requires Java 11 at minimum.  Java 11 is a "Long Term Support" release, but later releases are also known to work.

#### Mac OS ####

Running FreeCol in Full-screen mode on OSX is known to be problematic and may not work well.  As far we can tell this is due to a problem with the Java there, which we are unable to fix.

#### Older Mods ####

Old saved games that use old versions of the mods may lose functionality with the new release.  Most of the packaged mods should continue to work (there are known problems with "convertUpgrade").  New games using the updated mods will work.



### User-visible changes since 0.11.6-release ###

#### New features ####

* Major graphics rework
    * New tile and building images from Misiulo
    * Support for high-DPI screens, customizable font size and high resolution versions of existing graphics
    * Support for animations, smooth map scrolling and other improvements to the graphics engine
* Many new maps, from Euzimar, piotrus, Mazim, organized by Blake
* A huge expansion of the name lists (regions, ships, colonies) from Marcin
* A unit may now be ordered to go to an unexplored tile, as long as there is an adjacent explored tile that the unit can reach (without requring transport)
* Display of European prices in several dialogs [IR#43](https://sourceforge.net/p/freecol/improvement-requests/43), from Brian Kim, Louise Zhang, Seongmin Park and Michael Jeffers
* Move all goods with a hot key [IR#199](https://sourceforge.net/p/freecol/improvement-requests/199/) from Brian Kim, Louise Zhang, Seongmin Park and Michael Jeffers
* Easier river editing in map editor through separate options for adding/removing and changing the river style
* There are now separate options controlling movement speed of your units, other friendly nation units, and other hostile nation units (formerly just your units and other nation units)
* Over 150 bugs fixed


#### Other improvements ####

* Added tool tip to explain the last sale price annotation on the native settlement panel
* Added "About FreeCol" button to the opening menu screen [IR#15](https://sourceforge.net/p/freecol/improvement-requests/15/)
* Added option to disable / enable region naming dialog. [IR#222](https://sourceforge.net/p/freecol/improvement-requests/222)
* Game options added to adjust trade bonus for native alarm. [BR#3092](https://sourceforge.net/p/freecol/bugs/3092/)


### Developer issues ###

* **Java 11 is required to build FreeCol.**
* Resource keys for same images in different resolution can now be added to support higher resolution images when zooming or using --gui-scale option.
* DOM is gone, and there was much rejoicing.


## FreeCol 0.11.6 (October 16, 2015) ##

### Common problems ###

Java 7 is no longer receiving active support, therefore this version of FreeCol switches to using Java 8 which is the currently supported release.  This will hopefully fix the problems that many Mac users have been experiencing.  If FreeCol 0.11.6 fails to run, check first if your installed Java libraries are up to date.

There has been significant effort trying to track down cases where the lower right corner panel (InfoPanel) disappears for unknown reasons (see [BR#2907](https://sourceforge.net/p/freecol/bugs/2907) and elsewhere).  If this is still occurring we are particularly interested in *reproducible* test cases with 0.11.6.


### Bugs ###

43 new bug reports have been made since 0.11.5 was released.  19 were fixed, 4 need more information, 3 were duplicates, 3 were invalid, 3 were rejected, 2 were quite minor and reclassified as improvement requests, leaving 9 definite new bugs.

At least 7 older bug reports were also closed, 2 were fixed and 5 went out of date.

There are now 50 open bug reports, many received partial fixes.
The majority of cases are still UI issues, but the proportion of reports that are blocked needing further information is rising.  Please remember, if you report a bug, check back to see if developers that are working on it have clarifying questions.  On the other hand, there has been useful progress on several "What Would Col1 Do?" issues, and more is anticipated in the next release thanks to a highly detailed play through of Col1 contributed by Mark Jackson.
Additionally, there are some open bug reports which require more media (images or sounds). Any help on these would be highly appreciated.

### User-visible changes since 0.11.5-release ###

#### New features ####

- The autosave directory now follows the save directory if it changes.
- New warning that distinguishes approaching colony food exhaustion from actual ongoing starvation.
- Lots of tweaks to the compact colony report.
- Better tool tips on the trade report.
- Added a link to the FreeCol manual on the About panel.
- All cargo (more than 100 units) can be dragged with the control key, contributed by Fenyo.
- Native settlements have roads as in Col1 (confirmation from Fenyo).
- Number of goods on a carrier is shown in InfoPanel at lower right, full stacks have bigger icons instead [IR#157](https://sourceforge.net/p/freecol/improvement-requests/157/), [PF#44](https://sourceforge.net/p/freecol/pending-features-for-freecol/44/).
- Active unit cargo should be selected by default when entering a colony [IR#22](https://sourceforge.net/p/freecol/improvement-requests/22/).
- Terrain bonus does not apply to settlement defence [PF#73](https://sourceforge.net/p/freecol/pending-features-for-freecol/73).
- Coronado only reveals minimal colonies in classic mode [PF#83](https://sourceforge.net/p/freecol/pending-features-for-freecol/83).

#### Bugs fixed ####

- Sentries now obey the client option and do not cause doubled moves [BR#2882](https://sourceforge.net/p/freecol/bugs/2882)
- TilePopup is now correctly shown near the tile when using keyboard or menu.
- Use of country name rather than an adjectival form in several places [BR#2888](https://sourceforge.net/p/freecol/bugs/2888).
- Abandoning a colony when units have it as a destination no longer hangs the game [BR#2889](https://sourceforge.net/p/freecol/bugs/2889).
- The window frame now correctly appears on second monitor in correct size when starting the game in windowed mode, see [BR#2803](https://sourceforge.net/p/freecol/bugs/2803).
- FreeColDialogs are correctly positioned now, also avoiding them being wrongly shown on primary monitor when the main window frame is on secondary monitor, see [BR#2803](https://sourceforge.net/p/freecol/bugs/2803).
- The classic colony report works again [BR#2898](https://sourceforge.net/p/freecol/bugs/2898).
- Cities of gold are named properly [BR#2903](https://sourceforge.net/p/freecol/bugs/2903).
- Colonies can be founded on native land [BR#2906](https://sourceforge.net/p/freecol/bugs/2906).
- FreeColDialog instances do not contain redundant shifted backgrounds anymore, contributed by Bernat, see [BR#2911](https://sourceforge.net/p/freecol/bugs/2911).
- Fixed TileInfoPanel to show information about the terrain cursor being on unexplored tiles.
- Fixed map display to consistently draw everything on partial updates, see [BR#2580](https://sourceforge.net/p/freecol/bugs/2580).
- --server option now only controls starting a stand alone server, --server-port controls the port independently.

#### Other improvements ####

- When characters are not supported by the "ShadowedBlack" font we provide (mostly used for panel headers) the game automatically falls back to using the normal game font, to prevent rectangle glyphs from being shown for non-latin characters.
- Map display is improved; the optional region borders and black map-grid are consistently shown everywhere now.

### Developer issues ###

- **Java 8 is now required to build FreeCol.**
- Developer documentation is now compiled and added as a pdf to the distributions.
- Integer, Select and Range options now validate their input.  Watch out for logged warnings of bad input.
- splash.jpg moved into ./build, and is built into FreeCol.jar, added --no-splash option.
- The game now tolerates modding in higher resolution tile images, see git.a85590de for more detailed explanation.

## FreeCol 0.11.5 (August 3, 2015) ##

### Common problems ###

There was a major reorganization of the translation subsystem.  This may have caused an increase in the number of untranslated texts appearing.  This should go away in time as the translators resynchronize.  Feel free to help at [translatewiki](https://translatewiki.net/wiki/Translating:FreeCol).

Autosaving may have been disabled in old savegames, as a bug([BR#2825](https://sourceforge.net/p/freecol/bugs/2825/)) with the autosave interval could not be fixed in a completely backwards compatible way.  Manually set the autosave interval if you have problems.

### Bugs ###

For the 0.11.5 release we only fixed the map generation bug which incompletely generated regions, which could hang the game for various reasons but most quickly when the display tile regions option was activated.

There are now less than fifty open bug reports.  The majority of cases are now UI issues, followed by reports that are blocked in the `What would Col1 do?' state.

<!---
Bug:
Dup:
Fixed:    2885
Invalid:
NeedInfo:
->IR:
OutOfDate:

[>2876]

Fixed:
->IR:
WontFix:
-->


### Changes since 0.11.4-release ###

#### Bugs fixed ####

- Map region generation has been fixed, see  [BR#2885](https://sourceforge.net/p/freecol/bugs/2885/).

### Changes since 0.11.3-release ###

#### New features ####

- Major improvements to map scaling, suitable for higher resolution displays [BR#2726](https://sourceforge.net/p/freecol/bugs/2726/).
- Overall scaling of most text, icons and many panels in the GUI is a new feature to help users with high resolution displays. This can now be set at the command line with the "--gui-scale *percentage*" option. See also  [BR#2726](https://sourceforge.net/p/freecol/bugs/2726/).
- The monarch now sometimes provides troops and gold when declaring war [PF#4](https://sourceforge.net/p/freecol/pending-features-for-freecol/4/).
- Native nations may support the REF or the player following a declaration of independence [PF#5](https://sourceforge.net/p/freecol/pending-features-for-freecol/5/).
- Added attack animations for artillery, damaged artillery, privateer and frigate [BR#2722](https://sourceforge.net/p/freecol/bugs/2722/).
- Added Col1-compatibility game option to auto-disembark units in colonies, [PF#54](https://sourceforge.net/p/freecol/pending-features-for-freecol/54/).
- Multi-season year mods from Fenyo.


#### Bugs fixed ####

- Bryce mod no longer duplicates requirements [BR#2816](https://sourceforge.net/p/freecol/bugs/2816/)
- Unblocked trade routes [BR#2819](https://sourceforge.net/p/freecol/bugs/2819/)
- Windowed mode can not be changed while panels are visible, mitigating but not really fixing [BR#2820](https://sourceforge.net/p/freecol/bugs/2820/).
- Temporary goods warning message disable works again [BR#2822](https://sourceforge.net/p/freecol/bugs/2822/).
- Military report REF units should aggregate correctly [BR#2823](https://sourceforge.net/p/freecol/bugs/2823/).
- Autosaves can be disabled again [BR#2825](https://sourceforge.net/p/freecol/bugs/2825/).
- Colonies are named before claiming the tile they are on (reverting an old behaviour),
but rejected suggested colony names are now recycled.
- Several cases of missing i18n fixed.
- Some panels, for example, Europe Panel have been made internally and externally resizable to prevent problems from wrongly cut off parts of the panel and its buttons [BR#2786](https://sourceforge.net/p/freecol/bugs/2786/).
- The WorkProductionPanel does not anymore cut off the top part of a forest or similar in the tile image it is showing, similar glitches have been fixed in other places.
- Fixed missing window frame icon after switching between windowed and fullscreen mode.
- Fixed colors for minimap in markovoss mod.
- Fixed partially wrong dialog background texture in Classic FreeCol UI mod.
- Fixed rare crash when loading a savegame with the map centered over a colony [BR#2875](https://sourceforge.net/p/freecol/bugs/2875/).
- Fixed font loading for languages needing localized glyph sets [BR#2877](https://sourceforge.net/p/freecol/bugs/2877/).


#### Other improvements ####

- Better preloading of resources and other code improvements to game startup.
- Code for resource management reorganized. This results in major savings of RAM [BR#2843](https://sourceforge.net/p/freecol/bugs/2823/) and is also including less, but more correct, thread synchronization.
- The size of the game in windowed mode now correctly adapts to the space used for task bar and window decorations.
- Several minor improvements in image quality (for example, dynamically drawing labels, building images, fixed icons, better scaling code).
- Some AI efficiency improvements.
- Improved where line breaks are added to text in InformationPanel.


#### Developer issues ###

- Updated project file and developer documentation for using NetBeans.
- Code for the major gui classes reorganized with less circular dependencies and not as large classes.
- Some code cleanup, like adding @override, reformatting and improving comments, contributed by calebrw.
- Most types of resource keys renamed to bring them into a consistent scheme.
- Large message renaming for consistency and ease of checking.
- Nation options now have a distinct tag that does not rely on capitalization.
- Other serialization naming consistency fixes.
- Added --headless command line option.