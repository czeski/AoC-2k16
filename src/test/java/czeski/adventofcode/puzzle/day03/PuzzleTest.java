package czeski.adventofcode.puzzle.day03;


import junit.framework.TestCase;

public class PuzzleTest extends TestCase{

    public void testExampleDay03(){
        Puzzle puzzle = new Puzzle();
        puzzle.setInputPath("data/Day03/example.txt");
        puzzle.start();

        assertEquals("0", puzzle.getResult());
    }
}
