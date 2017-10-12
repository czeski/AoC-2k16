package czeski.adventofcode.puzzle.day02;

import junit.framework.TestCase;

public class PuzzleTest extends TestCase {

    public void testExampleDay02(){
        Puzzle puzzle = new Puzzle();
        puzzle.setInputPath("data/Day02/example.txt");
        puzzle.start();

        assertEquals("1985", puzzle.getResult());
    }
}
