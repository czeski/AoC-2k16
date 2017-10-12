package czeski.adventofcode.puzzle.day01;

import junit.framework.TestCase;

public class PuzzleTest extends TestCase {

    public void testDay01Example1(){
        Puzzle puzzle = new Puzzle();
        puzzle.setInputPath("data/Day01/example1.txt");
        puzzle.start();

        assertEquals("5", puzzle.getResult());
    }

    public void testDay01Example2(){
        Puzzle puzzle = new Puzzle();
        puzzle.setInputPath("data/Day01/example2.txt");
        puzzle.start();

        assertEquals("2", puzzle.getResult());
    }

    public void testDay01Example3(){
        Puzzle puzzle = new Puzzle();
        puzzle.setInputPath("data/Day01/example3.txt");
        puzzle.start();

        assertEquals("12", puzzle.getResult());
    }
}
