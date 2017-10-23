package czeski.adventofcode.puzzle.day03;

import czeski.adventofcode.AbstractPuzzle;

import java.io.IOException;

public class Puzzle extends AbstractPuzzle{
    public Puzzle() {
        setInputPath("data/Day03/input.txt");
    }

    @Override
    protected void run() throws IOException {
        String line;
        String[] sides;
        int a = 0, b = 0, c = 0;
        int amount = 0;

        while(null != (line = getDataBuffer().readLine()) && line.length() > 0){
            sides = line.split("\\s+");
            a = Integer.parseInt(sides[1].trim());
            b = Integer.parseInt(sides[2].trim());
            c = Integer.parseInt(sides[3].trim());

            if (a + b > c && a + c > b && b + c > a){
                amount++;
            }
        }

        result = String.valueOf(amount);
    }

}
