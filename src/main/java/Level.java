import java.util.ArrayList;

public class Level {

  ArrayList<String> levelArray = new ArrayList<>();

  private static String level1 =

  "##################################################\n"
+ "##################################################\n"
+ "##################################################\n"
+ "###..............................................#\n"
+ "###.............................$$$$$$$$$...tt...#\n"
+ "###...................k.........$$$$$$$$$...tt...#\n"
+ "##.......wwwwwwwww..............$$$$f$$$$........#\n"
+ "##.......wwwwwwwww..............$$$$$$$$$........#\n"
+ "##.......wwwwwwwww..............$$$$$$$$$........#\n"
+ "##.......wwwwwwwww...............$$..............#\n"
+ "##.......wwwwwwwww.........t.....$$..............#\n"
+ "##...............e...............$$..............#\n"
+ "##...............................$$..............#\n"
+ "##...............................$$..............#\n"
+ "2$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.......E......#\n"
+ "2$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$..............#\n"
+ "##......................e......................###\n"
+ "##.............................................###\n"
+ "##......................t.t.t.t.t.t.t.t........###\n"
+ "##......................t.t.t.t.t.t.t.t........###\n"
+ "##.........e............t.t.t.t.t.t.t.t........###\n"
+ "##......................t.t.t.t.t.t.t.t........###\n"
+ "##..........E...........t.t.t.t.t.t.t.t........###\n"
+ "##......................t.t.t.t.t.t.t.t........###\n"
+ "##......................t.t.t.t.t.t.t.t........###\n"
+ "##..............e..............................###\n"
+ "##.............................................###\n"
+ "##.............................................###\n"
+ "##################################################\n"
+ "##################################################\n";


private static String level2 =
"##################################################\n"
+ "##################################################\n"
+ "##################################################\n"
+ "###..............................................#\n"
+ "###..............................................#\n"
+ "###..............................................#\n"
+ "##.......wwwwwwwww...............................#\n"
+ "##.......wwwwwwwww...............................#\n"
+ "##.......wwwwwwwww...............................#\n"
+ "##.......wwwwwwwww...............................#\n"
+ "##.......wwwwwwwww...............................#\n"
+ "##...............................................#\n"
+ "##..........................e....................#\n"
+ "##...............................................#\n"
+ "#................................................1\n"
+ "#................................................1\n"
+ "##............................................t###\n"
+ "##t..........................................tt###\n"
+ "##tt.........................................tt###\n"
+ "##tt.........................................tt###\n"
+ "##tt.........................................tt###\n"
+ "##ttt.......................................ttt###\n"
+ "##ttt.t..................................t.tttt###\n"
+ "#ttttt.t.t............................t.t.ttttt###\n"
+ "##tttttt.t.t.........................t.t.tttttt###\n"
+ "##ttttttttttt.t...................t.ttttttttttt###\n"
+ "##ttttttttttt.t.t...............t.t.ttttttttttt###\n"
+ "##ttttttttttt.t.t.t.t.t.t.t.t.t.t.t.ttttttttttt###\n"
+ "#######tttttt.t.t.t.t.t.t.t.t.t.t.t.tttttt########\n"
+ "#######tttttt3t3t3t3t3t3t3t3t3t3t3t3tttttt########\n";

private static String level3 =
  "#######tttttt2t2t2t2t2t2t2t2t2t2t2t2tttttt########\n"
+ "#######tttttt.t.t.t.t.t.t.t.t.t.t.t.tttttt########\n"
+ "##ttttttttttt.t.t.t.t.t.t.t.t.t.t.t.ttttttttttt###\n"
+ "###tttt.........................................##\n"
+ "###tt............................................#\n"
+ "###t.............................................t\n"
+ "###..............................................t\n"
+ "##.......##################################......t\n"
+ "#........##################################......t\n"
+ "#........##################################......t\n"
+ "#........##################################......t\n"
+ "#........##################################......t\n"
+ "#................................................t\n"
+ "#................................................t\n"
+ "#................................................t\n"
+ "#................................................4\n"
+ "#..................................tttt..........4\n"
+ "##.................................twwwwwwwwwwwwww\n"
+ "##t................................twwwwwwwwwwwwww\n"
+ "##tt...............................twwwwwwwwwwwwww\n"
+ "##tt...............................twwwwwwwwwwwwww\n"
+ "##tt...............................twwwwwwwwwwwwww\n"
+ "##ttt..............................twwwwwwwwwwwwww\n"
+ "##ttt.t.........................wwwwwwwwwwwwwwwwww\n"
+ "#ttttt.t.t......................wwwwwwwwwwwwwwwwww\n"
+ "##tttttt.t.t...................twwwwwwwwwwwwwwwwww\n"
+ "##ttttttttttt.t...............ttwwwwwwwwwwwwwwwwww\n"
+ "##ttttttttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
+ "##ttttttttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
+ "#######tttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n";

private static String level4 =
  "##################################################\n"
+ "##################################################\n"
+ "##...............................................#\n"
+ "##...............................................t\n"
+ "##...............................................t\n"
+ "t................................................t\n"
+ "t................................................t\n"
+ "t................................................8\n"
+ "t................................................8\n"
+ "t................................................8\n"
+ "t................................................8\n"
+ "t................................................8\n"
+ "t................................................8\n"
+ "t................................................8\n"
+ "t................................................8\n"
+ "3................................................8\n"
+ "3..................................tttt..........8\n"
+ "wwwwwwwwwwwwwwww.................................8\n"
+ "wwwwwwwwwwwwwwww.................................8\n"
+ "wwwwwwwwwwwwwwww.................................8\n"
+ "wwwwwwwwwwwwwwww.................................8\n"
+ "wwwwwwwwwwwwwwww.................................8\n"
+ "wwwwwwwwwwwwwwww.................................8\n"
+ "wwwwwwwwwwwwwwwwww...............................8\n"
+ "wwwwwwwwwwwwwwwwww...............................8\n"
+ "wwwwwwwwwwwwwwwwww...............................8\n"
+ "wwwwwwwwwwwwwwwwww...........................ttttt\n"
+ "wwwwwwwwwwwwwwwwww...........................ttttt\n"
+ "wwwwwwwwwwwwwwwwww...........................ttttt\n"
+ "wwwwwwwwwwwwwwwwww555555555555555555555555555ttttt\n";

private static String level5 =
  "wwwwwwwwwwwwwwwwww444444444444444444444444444ttttt\n"
+ "wwwwwwwwwwwwwwwwww...........................ttttt\n"
+ "wwwwwwwwwwwwwwwwww...........................tttt#\n"
+ "wwwwwwwwwwwwwwwwww...........................tttt#\n"
+ "wwwwwwwwwwwwwwwwww...............................#\n"
+ "wwwwwwwwwwwwwwwwwwwwwwwww$$wwwwwwwwwwwwwwwwwwwwwww\n"
+ "wwwwwwwwwwwwwwwwww...............................t\n"
+ "t................................................t\n"
+ "t................................................t\n"
+ "t..................t.............................t\n"
+ "t................................................t\n"
+ "t................................................t\n"
+ "t.........................t......................t\n"
+ "t................................................t\n"
+ "t.......t........................................t\n"
+ "t................................................7\n"
+ "t................................................7\n"
+ "##################..................t............7\n"
+ "########$$$$$#####...............................7\n"
+ "##$$$###$###$#####...............................7\n"
+ "##$#$###$$$#$$$###...............................7\n"
+ "##$#$#####$###$###...............................7\n"
+ "##$#$$$$$$$###$###...............................7\n"
+ "##$###########$###...............................7\n"
+ "##$$$$$$$#####$###..................t............7\n"
+ "########$$####$###..........................######\n"
+ "6$$######$$###$###........................########\n"
+ "##$$$$$$$$$###$###......................##########\n"
+ "##############$$$$.....................###########\n"
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
+ "#######..........................................t\n"
+ "#######..........................................t\n"
+ "#######..........................................t\n"
+ "#######..........................................t\n"
+ "#######..........................................t\n"
+ "#######..........................................t\n"
+ "#######..........................................t\n"
+ "#######..........................................t\n"
+ "#######..........................................t\n"
+ "#######..........................................#\n"
+ "#######..........................................#\n"
+ "#######..........................................#\n"
+ "#######..........................................#\n"
+ "#######..........................................#\n"
+ "#######..........................................#\n"
+ "#######..........................................#\n"
+ "#######..........................................#\n"
+ "#######.....................................######\n"
+ "#######..........................................5\n"
+ "#######.................................##########\n"
+ "#######................................###########\n"
+ "##################################################\n";

private static String level7 =
  "tttt8888w888888888888888888888888888888###########\n"
+ "tttt....w........................................#\n"
+ "ttt.....w........................................#\n"
+ "tt......w........................................#\n"
+ "t.......w........................................#\n"
+ "wwwwwwwww..............ttttttttt.................#\n"
+ "tt...............................................#\n"
+ "tttt.............................................#\n"
+ "ttttt............................................#\n"
+ "tttttt...........................................#\n"
+ "ttttttt..........................................#\n"
+ "ttttttt..........................................#\n"
+ "tttttt...........................................#\n"
+ "ttttt............................................#\n"
+ "tttt.............................................#\n"
+ "5................................................#\n"
+ "5................................................#\n"
+ "5................................................#\n"
+ "5................................................#\n"
+ "5................................................#\n"
+ "5................................................#\n"
+ "5................................................#\n"
+ "5................................................#\n"
+ "5................................................#\n"
+ "5................................................#\n"
+ "#######.....................................######\n"
+ "#######..........................................#\n"
+ "#######.................................##########\n"
+ "#######................................###########\n"
+ "##################################################\n";


private static String level8 =
  "#ww| | | | | | | | | | | | | | | | | | | | | | |ww\n"
+ "#ww|||||||||||||||||||||||||||||||||||||||||||||ww\n"
+ "#ww|||||||||||||||||||||||||||||||||||||||||||||ww\n"
+ "tww|||||||||||||||||||||||||||||||||||||||||||||ww\n"
+ "tww|||||||||||||||||||||||||||||||||||||||||||||ww\n"
+ "twwwwwwwwwwwwwwwwwwwwzzzzzzzzwwwwwwwwwwwwwwwwwwwww\n"
+ "twwwwwwwwwwwwwwwwwww^++++++++^wwwwwwwwwwwwwwwwwwww\n"
+ "4.......w...........%++++++++%...................t\n"
+ "4.......w............++++++++....................t\n"
+ "4.......w............++++++++....................t\n"
+ "4.......w............++++++++....................t\n"
+ "4.......w............++++++++....................t\n"
+ "4.......w............++++++++....................t\n"
+ "4.......w............++++++++....................t\n"
+ "4.......w............++++++++....................t\n"
+ "4.......w............++++++++....................t\n"
+ "4.......w.......Itttt++++++++ttttI...............t\n"
+ "4.......w........++++++++++++++++................#\n"
+ "4.......w.......I++++++++++++++++I...............#\n"
+ "4.......w........++++++++++++++++................#\n"
+ "4.......w.......I++++++++++++++++I...............#\n"
+ "4.......w........++++++++++++++++................#\n"
+ "4.......w.......I++++++++++++++++I...............#\n"
+ "4.......w.........ttt++++++++ttt.................#\n"
+ "4.......w........................................#\n"
+ "4.......w...................................######\n"
+ "tttt....w........................................#\n"
+ "tttt....w...............................##########\n"
+ "tttt....w..............................###########\n"
+ "tttt7777w777777777777777777777777777777###########\n";


private static String level9 =
  "########ttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
+ "#######tttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
+ "#######tttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
+ "#######tttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
+ "#######tttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
+ "#######tttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
+ "#######tttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
+ "#######..........................................t\n"
+ "#######..........................................t\n"
+ "#######..........................................t\n"
+ "#######..........................................t\n"
+ "#######..........................................t\n"
+ "#######..........................................t\n"
+ "#######..........................................t\n"
+ "#######..........................................t\n"
+ "#######..........................................t\n"
+ "#######..........................................t\n"
+ "#######..........................................#\n"
+ "#######..........................................#\n"
+ "#######..........................................#\n"
+ "#######..........................................#\n"
+ "#######..........................................#\n"
+ "#######..........................................#\n"
+ "#######..........................................#\n"
+ "#######..........................................#\n"
+ "#######.....................................######\n"
+ "#######..........................................5\n"
+ "#######.................................##########\n"
+ "#######................................###########\n"
+ "##################################################\n";




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
    // levelArray.add(level7);
    levelArray.add(level8);
    // levelArray.add(level9);
  }

  public ArrayList returnLevelArray() {
    return levelArray;
  }

}
