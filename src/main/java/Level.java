public class Level {
  private static String level1 =



  "##################################################\n"
+ "#...##############################################\n"
+ "#...##############################################\n"
+ "#..............................................###\n"
+ "#...............................wwwwwwww....tt.###\n"
+ "#...............................wwwwwwww....tt.###\n"
+ "##......@$$$$$$$$$..............wwwwwwww.......###\n"
+ "##.......$$$$$$$$$..............wwwwwwww.......###\n"
+ "##.......$$$$f$$$$..............wwwwwwww.......###\n"
+ "##.......$$$$$$$$$..............wwwwwwww.......###\n"
+ "##.......$$$$$$$$$.........t...................###\n"
+ "##.............$$..............................###\n"
+ "##.............$$..............................###\n"
+ "##.............$$..............................###\n"
+ "##.............$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$?\n"
+ "##.............$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$?\n"
+ "##.............................................###\n"
+ "##.............................................###\n"
+ "##..t.t.t.t.t.t.t.t............................###\n"
+ "##..t.t.t.t.t.t.t.t............................###\n"
+ "##..t.t.t.t.t.t.t.t............................###\n"
+ "##..t.t.t.t.t.t.t.t............................###\n"
+ "##..t.t.t.t.t.t.t.t............................###\n"
+ "##..t.t.t.t.t.t.t.t............................###\n"
+ "##..t.t.t.t.t.t.t.t............................###\n"
+ "##.............................................###\n"
+ "##..............................................##\n"
+ "##.............................................###\n"
+ "##################################################\n"
+ "##################################################\n";

private static String level2 =
          "##################??###########\n"
        + "#........#.........#..........#\n"
        + "?.....$..#.........########...#\n"
        + "?..@...$#..........#.....##...#\n"
        + "#....$ $ .....................#\n"
        + "####.#....#...#####...........#\n"
        + "##...#........#####...........#\n"
        + "## $  $..............     ....#\n"
        + "######.....#.##...............#\n"
        + "    ##.....####################\n"
        + "    ########\n";

private static String level3 =
          "###############################\n"
        + "#.............................#\n"
        + "#.............................#\n"
        + "#............................#?\n"
        + "#.............................?\n"
        + "####.........................#?\n"
        + "##...#........................#\n"
        + "##................@...........#\n"
        + "######.....#.##.#..#..........#\n"
        + "    ##.....######???###########\n"
        + "    ########\n";

private static String level4 =
          "###############################\n"
        + "#.............................#\n"
        + "#.............................#\n"
        + "?.@...........................#\n"
        + "?.............................#\n"
        + "####..........................#\n"
        + "##...#........................#\n"
        + "##............................#\n"
        + "######.....#.##...............#\n"
        + "    ##.....######???###########\n"
        + "    ########\n";



  public static String getLevel(int _level) {
    switch(_level) {
      case 1: return level1;
      case 2: return level2;
      case 3: return level3;
      case 4: return level4;
    }
    return "chain is awesome";
  }
}
