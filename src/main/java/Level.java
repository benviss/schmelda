import java.util.ArrayList;

public class Level {

  ArrayList<String> levelArray = new ArrayList<>();

  // private static String levelBlank =
  //
  // "  ........................................\n"
  // + "........................................\n"
  // + "........................................\n"
  // + "........................................\n"
  // + "........................................\n"
  // + "........................................\n"
  // + "........................................\n"
  // + "........................................\n"
  // + "........................................\n"
  // + "........................................\n"
  // + "........................................\n"
  // + "........................................\n"
  // + "........................................\n"
  // + "........................................\n"
  // + "........................................\n"
  // + "........................................\n"
  // + "........................................\n"
  // + "........................................\n"
  // + "........................................\n"
  // + "........................................\n"
  // + "........................................\n";

  private static String level1 =

  "##################################################\n"
+ "##################################################\n"
+ "##gggggggggggggggggggggggggggggggggggggggggggggg##\n"
+ "#l..............................................c#\n"
+ "#l............................$$$$$$$$$...tt....c#\n"
+ "#l............................$$$$$$$$$...tt....c#\n"
+ "#l.......wwwwwwwww............$$$$f$$$$.........c#\n"
+ "#l.......wwwwwwwww............$$$$$$$$$.........c#\n"
+ "#l.......wwwwwwwww............$$$$$$$$$.........c#\n"
+ "#l.......wwwwwwwww...............$$.............c#\n"
+ "#l...............................$$.............c#\n"
+ "#l....................8......k...$$.............c#\n"
+ "#l...............................$$.............c#\n"
+ "2$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.............c#\n"
+ "2$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$......H......c#\n"
+ "#l..............................................c#\n"
+ "#l..............................................c#\n"
+ "#l...........e..........t.t.t.t.t.t.t.t.........c#\n"
+ "#l......................t.t.t.t.t.t.t.t.........c#\n"
+ "#l......................t.t.t.t.t.t.t.t.........c#\n"
+ "#l......................t.t.t.t.t.t.t.t.........c#\n"
+ "#l......................t.t.t.t.i.t.t.t.........c#\n"
+ "#l......................t.t.t.t.t.t.t.t.........c#\n"
+ "#l......................t.t.t.t.t.t.t.t.........c#\n"
+ "#l..............................................c#\n"
+ "#l..............................................c#\n"
+ "#l..............................................c#\n"
+ "##hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh##\n"
+ "##################################################\n";


private static String level2 =
  "##################################################\n"
+ "##################################################\n"
+ "##################################################\n"
+ "###..............................................#\n"
+ "###..$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.........#\n"
+ "###..$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.........#\n"
+ "##...$$..wwwwwwwww......N.........n...$$.........#\n"
+ "##...$$..wwwwwwwww....................$$.........#\n"
+ "##...$$..wwwwwwwww....................$$.........#\n"
+ "##...$$..wwwwwwwww................o...$$.........#\n"
+ "##...$$..wwwwwwwww....................$$.........#\n"
+ "##...$$........ttttttttt..............$$.........#\n"
+ "##...$$........ttttttttt..............$$.........#\n"
+ "##...$$..............tttttt...........$$.........#\n"
+ "#....$$m...............tttttttt.......$$$$$$$$$$$1\n"
+ "#....$$...........tttttt..ttttttt.....$$$$$$$$$$$1\n"
+ "##...$$.............tttttttttt.tttttttttttttttt###\n"
+ "##t..$$.....................ttttttttttttttttttt###\n"
+ "##tt.$$.........ttttttttt.ttttttttttttttttttttt###\n"
+ "##tt.$$...........tttt..ttttttttttttttttttttttt###\n"
+ "##tt.$$$$$$$$$$$$$..ttttttttttttttttttttttttttt###\n"
+ "##ttt$$$$$$$$$$$$$.........tttttttttttttttttttt###\n"
+ "##ttt.t.........$$..........ttttttttttttttttttt###\n"
+ "#ttttt.t.t......$$...M.......e........t.t.ttttt###\n"
+ "##tttttt.t.t....$$$$$$$..............t.t.tttttt###\n"
+ "##ttttttttttt.t.$$$$$$$...........t.ttttttttttt###\n"
+ "##ttttttttttt.t.t....$$.........t.t.ttttttttttt###\n"
+ "##ttttttttttt........$$.............ttttttttttt###\n"
+ "#######tttttt.......................tttttt########\n"
+ "#######tttttt3t3t333333333333333t3t3tttttt########\n";

private static String level3 =
  "######ltttttt2t2t222222222222222t2t2ttttttc#######\n"
+ "###gggatttttt.......................ttttttc#######\n"
+ "##ltttttttttt.t.t.t.t.t.t.t.t.t.t.t.ttttttbggggg##\n"
+ "##ltttt.........................................c#\n"
+ "##ltt...........................................bg\n"
+ "##lt.......m.....................................t\n"
+ "##l......shhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhr.......t\n"
+ "gga......c################################lttt...t\n"
+ "l........c################################ltttt..t\n"
+ "l........c################################lttttttt\n"
+ "l........c################################lttttttt\n"
+ "l........c################################lttttttt\n"
+ "l........bgggggggggggggggggggggggggggggggga.tttttt\n"
+ "l.................#............................ttt\n"
+ "l.................#......####....................t\n"
+ "l.................#..............................4\n"
+ "l.....n...........#........m.......tttt..........4\n"
+ "lhr...............#................twwwwwwwwwwwwww\n"
+ "##l...............#.....m..........twwwwwwwwwwwwww\n"
+ "##lt..............E................twwwwwwwwwwwwww\n"
+ "##lt...........#####...............twwwwwwwwwwwwww\n"
+ "##lt...............................twwwwwwwwwwwwww\n"
+ "##ltt..............................twwwwwwwwwwwwww\n"
+ "##ltt.t.............O...........wwwwwwwwwwwwwwwwww\n"
+ "##lttt.t.t......................wwwwwwwwwwwwwwwwww\n"
+ "##lttttt.t.t...................twwwwwwwwwwwwwwwwww\n"
+ "##ltttttttttt.t...............ttwwwwwwwwwwwwwwwwww\n"
+ "##ltttttttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
+ "##lhhhhrttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
+ "#######lttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n";

private static String level4 =
  "##################################################\n"
+ "##################################################\n"
+ "##...............................................#\n"
+ "##........q....................gg................t\n"
+ "##................gg...........##................t\n"
+ "t..............N..##...........hh................t\n"
+ "t....ggggggg......hh....................tttttttttt\n"
+ "t....#######............................t........8\n"
+ "t....#######......ggggggggggg...........t........8\n"
+ "t....hhhhhhh......###########......n....t........8\n"
+ "t.................###########...........t........8\n"
+ "t.................hhhhhhhhhhh....................8\n"
+ "t.......M.............................Q..........8\n"
+ "t.......gg....................gg........t........8\n"
+ "t.......##....................##........t........8\n"
+ "3.......hh..........M.........hh........t........8\n"
+ "3...........tttttttttttttt.........tttttt........8\n"
+ "wwwwwwwwwwwwwwww...................tt............8\n"
+ "wwwwwwwwwwwwwwww............gg...................8\n"
+ "wwwwwwwwwwwwwwww............##.....tt............8\n"
+ "wwwwwwwwwwwwwwww............##.....tt............8\n"
+ "wwwwwwwwwwwwwwww............##.....tt............8\n"
+ "wwwwwwwwwwwwwwww............##...................8\n"
+ "wwwwwwwwwwwwwwwwww..........##...................8\n"
+ "wwwwwwwwwwwwwwwwww..........##.........Q.........8\n"
+ "wwwwwwwwwwwwwwwwww..........##...................8\n"
+ "wwwwwwwwwwwwwwwwww..........##...............ttttt\n"
+ "wwwwwwwwwwwwwwwwww..........hh...............ttttt\n"
+ "wwwwwwwwwwwwwwwwww...........................ttttt\n"
+ "wwwwwwwwwwwwwwwwww555555555555555555555555555ttttt\n";

private static String level5 =
  "wwwwwwwwwwwwwwwwww444444444444444444444444444ttttt\n"
+ "wwwwwwwwwwwwwwwwww...........................ttttt\n"
+ "wwwwwwwwwwwwwwwwww..................t........tttt#\n"
+ "wwwwwwwwwwwwwwwwww...........t...............tttt#\n"
+ "wwwwwwwwwwwwwwwwww...t.....................t.....#\n"
+ "wwwwwwwwwwwwwwwwwwwwwwwww$$wwwwwwwwwwwwwwwwwwwwwww\n"
+ "wwwwwwwwwwwwwwwwww...............................t\n"
+ "t.....................................t..........t\n"
+ "t....t..................t........................t\n"
+ "t..........n.......t.......m..........t..........t\n"
+ "t.................................M..............t\n"
+ "t.......t........................................t\n"
+ "t..............t..........t.................t....t\n"
+ "t................N....t..........t...............t\n"
+ "t.......t.............................t..........t\n"
+ "t.............t.........t........................7\n"
+ "t.............................N...........Q......7\n"
+ "##################..................t............7\n"
+ "########E$$$$#####........t................t.....7\n"
+ "##$$$###$###$#####................t..............7\n"
+ "##$#$###$$$#$$$###......t........................7\n"
+ "##$#$#####$###$###..........q..........t.........7\n"
+ "##$#$$$$$$$###$###........t......................7\n"
+ "##$###########$###...............................7\n"
+ "##$$$E$$$#####$###..................t............7\n"
+ "########$$####$###....t.............O.......######\n"
+ "6$$######$$###e###........................########\n"
+ "##$$$$$$$$$###$###............t.........##########\n"
+ "##############$$$$...M.................###########\n"
+ "##################################################\n";

private static String level6 =
  "########ttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
+ "#######tttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
+ "#######tttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
+ "#######tttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
+ "#######tttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
+ "#######tttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
+ "#######tttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
+ "#######..........................................t\n"
+ "#######.............M............................t\n"
+ "#######...................................E......t\n"
+ "#######........N.........N.......................t\n"
+ "#######..........................................t\n"
+ "#######.............M............................t\n"
+ "#######........................hhhhhhhhhhhhhhhhhht\n"
+ "#######..........E......e......ggggggggggggggggggt\n"
+ "#######..............E.....E.....................t\n"
+ "#######......e....###.....................Q......t\n"
+ "#######.........M...........N......t.............#\n"
+ "#######......t.....................t......M......#\n"
+ "#######.................N.......N..t.............#\n"
+ "#######...........###..............t......m......#\n"
+ "#######.....................t.....ttttttttt......#\n"
+ "#######.........M.................t..............#\n"
+ "#######......t....................t...E...Q......#\n"
+ "#######..........k.....###........t.N...hhhhhhhhh#\n"
+ "#######...........................t.....ggggggggg#\n"
+ "#######..........t.............#..t.....E........5\n"
+ "#######........................#..t.....##########\n"
+ "#######...........................t....###########\n"
+ "##################################################\n";

private static String level7 =
  "tttt8888w888888888888888888888888888888###########\n"
+ "tttt....w.....Q....Q.......Q....Q...Q............#\n"
+ "ttt.....w........q....q........q.....q....q......#\n"
+ "tt......w........................m............N..#\n"
+ "t.......w........................................#\n"
+ "wwwwwwwww..............ttttttttt.................#\n"
+ "tt...............................................#\n"
+ "tttt.............................................#\n"
+ "ttttt........m......................t............#\n"
+ "tttttt.............n.............................#\n"
+ "ttttttt...n...t................t.................#\n"
+ "ttttttt.................................M........#\n"
+ "tttttt........M..................................#\n"
+ "ttttt................N.ttttttttt.................#\n"
+ "tttt.............................................#\n"
+ "5..............o............m...............t....#\n"
+ "5................................................#\n"
+ "5....N...........................................#\n"
+ "5...................t............................#\n"
+ "5........t..........................hhhhh........#\n"
+ "5.....................m..........n..#####........#\n"
+ "5...................................ggggg........#\n"
+ "5.....................................M..........#\n"
+ "5.........m...............wwwwww.................#\n"
+ "5......................N..wwwwww................#\n"
+ "#######........t..........wwwwww............######\n"
+ "#######..........................................#\n"
+ "#######............t....................##########\n"
+ "#######................................###########\n"
+ "##################################################\n";


private static String level8 =
  "  @                                               \n"
+ "###                                           ####\n"
+ "#ww                                           ww##\n"
+ "#ww                                           ww##\n"
+ "#ww                                           ww##\n"
+ "#ww                                           ww##\n"
+ "#ww                                           ww##\n"
+ "tww..................++++++++.................ww##\n"
+ "tww..................++++++++.................ww##\n"
+ "twwwwwwwwwwwwwwwwwwwwzzzzzzzzwwwwwwwwwwwwwwwwwwww#\n"
+ "twwwwwwwwwwwwwwwwwww^++++++++^wwwwwwwwwwwwwwwwwww#\n"
+ "4.......w...........%++++++++%...................t\n"
+ "4.......w..E.........++++++++.........E..........t\n"
+ "4.......w............++++++++....................t\n"
+ "4.......w......e...n.++++++++....e...............t\n"
+ "4.......w..........m.++++++++....................t\n"
+ "4.......w.......ftttt++++++++ttttf.......e.......t\n"
+ "4.......w..e.....++++++++++++++++M...............#\n"
+ "4.......w.......f++++++++++++++++f..........E....#\n"
+ "4.......w......M.++++++++++++++++................#\n"
+ "4.......w.......f++++++++++++++++f.....E.........#\n"
+ "4.......w........++++++++++++++++................#\n"
+ "4.......w.......f++++++++++++++++f.........e.....#\n"
+ "4.......w.E.......ttt++++++++ttt.......e.........#\n"
+ "4.......w................m.......................#\n"
+ "4.......w..e..........E.....................######\n"
+ "tttt....w.........................E..............#\n"
+ "tttt....w......E........................##########\n"
+ "tttt....w..............................###########\n"
+ "tttt7777w777777777777777777777777777777###########\n";


private static String level9 =
  "                        000                       \n"
+ "                        +e+                       \n"
+ "                        +++                       \n"
+ "                        +++                       \n"
+ "         ++++++++++++++++++                       \n"
+ "         +                                        \n"
+ "         +                                        \n"
+ "         +       +++++++++++++++++++              \n"
+ "         +       +                 +              \n"
+ "         +       +       +++++++++++              \n"
+ "         +       +     +++                        \n"
+ "         +++++++++     +                          \n"
+ "                       +                          \n"
+ "                      ++++++++++++                \n"
+ "                                 +                \n"
+ "                              ++++                \n"
+ "                              +  +                \n"
+ "                              +  +                \n"
+ "      ++++++++++++++++++++++++++++                \n"
+ "      +   +                                       \n"
+ "      ++++++++++++++++++                          \n"
+ "                       +                          \n"
+ "                     +++                          \n"
+ "                     +                            \n"
+ "                     +++++++++                    \n"
+ "                             +                    \n"
+ "                             +                    \n"
+ "                             +                    \n"
+ "                             +                    \n"
+ "                             +                    \n";

private static String level0 =
  "                                                  \n"
+ "                                                  \n"
+ "                                                  \n"
+ "                                                  \n"
+ "                                                  \n"
+ "                                                  \n"
+ "                                                  \n"
+ "                                                  \n"
+ "                  +++++++++++++++                 \n"
+ "                  +++++++++++++++                 \n"
+ "                  ++++ddddddd++++                 \n"
+ "                  ++++ddddddd++++                 \n"
+ "                  ++++dddBddd++++                 \n"
+ "                  ++++ddddddd++++                 \n"
+ "                  ++++ddddddd++++                 \n"
+ "                  +++++++++++++++                 \n"
+ "                  +++++++++++++++                 \n"
+ "                  +++++++++++++++                 \n"
+ "                  +++++++++++++++                 \n"
+ "                  +++++++++++++++                 \n"
+ "                        +++                       \n"
+ "                        +++                       \n"
+ "                        +++                       \n"
+ "                        +++                       \n"
+ "                        +++                       \n"
+ "                        +++                       \n"
+ "                        +++                       \n"
+ "                        +++                       \n"
+ "                        +++                       \n"
+ "                        000                       \n";



  public static String getLevel(int _level) {
    switch(_level) {
      case 1: return level1;
      case 2: return level2;
      case 3: return level3;
      case 4: return level4;
      case 5: return level5;
      case 6: return level6;
      case 7: return level7;
      case 8: return level8;
      case 9: return level9;
      case 0: return level0;

    }
    return "chain is awesome";
  }

  public Level() {

    levelArray.add(level1);
    levelArray.add(level2);
    levelArray.add(level3);
    levelArray.add(level4);
    levelArray.add(level5);
    levelArray.add(level6);
    levelArray.add(level7);
    levelArray.add(level8);
    levelArray.add(level9);
    levelArray.add(level0);
  }

  public ArrayList returnLevelArray() {
    return levelArray;
  }

}
