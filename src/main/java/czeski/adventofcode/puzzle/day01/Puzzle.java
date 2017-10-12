package czeski.adventofcode.puzzle.day01;

import czeski.adventofcode.AbstractPuzzle;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Puzzle extends AbstractPuzzle {
    int x = 0 , y = 0;
    private static final char RIGHT = 'R';
    private static final char LEFT = 'L';
    // 0 North, 1 East, 2 South, 3 West
    int direction = 0;
    private static final int NORTH = 0;
    private static final int EAST = 1;
    private static final int SOUTH = 2;
    private static final int WEST = 3;


    public void run() {
        List<String> data = getCleanedData();
        int value = 0;

        for (String trace: data) {
            value = Integer.valueOf(trace.substring(1));

            switch (trace.charAt(0)){
                case RIGHT:
                    direction = direction == 3 ? 0 : direction + 1;
                    break;
                case LEFT:
                    direction = direction == 0 ? 3 : direction - 1;
                    break;
            }

            switch (direction){
                case NORTH:
                    y += value;
                    break;
                case SOUTH:
                    y -= value;
                    break;
                case EAST:
                    x += value;
                    break;
                case WEST:
                    x -= value;
                    break;

            }
        }

        result = String.valueOf(Math.abs(0 - x) + Math.abs(0 - y));
    }

    private List<String> getCleanedData(){
        List<String> cleanData = Arrays.asList(data.split(","));
        cleanData = cleanData.stream().map(x -> x.trim()).collect(Collectors.toList());

        return cleanData;
    }

    @Override
    protected String getFilePath() {
        return "data/Day01/input.txt";
    }
}
