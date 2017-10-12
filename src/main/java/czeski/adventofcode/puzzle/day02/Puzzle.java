package czeski.adventofcode.puzzle.day02;


import czeski.adventofcode.AbstractPuzzle;

import java.io.IOException;

public class Puzzle extends AbstractPuzzle{

    public Puzzle(){
        setInputPath("data/Day02/input.txt");
    }

    @Override
    public void run() throws IOException{
        int startPoint = 5;
        StringBuilder resultBuilder = new StringBuilder("");
        String line;

        while(null != (line = getDataBuffer().readLine()) && line.length() > 0){
            for (char direction: line.toCharArray()) {
                switch (direction){
                    case 'U':
                        startPoint = startPoint > 3 ? startPoint - 3 : startPoint;
                        break;
                    case 'R':
                        startPoint = startPoint % 3 != 0 ? startPoint + 1: startPoint;
                        break;
                    case 'D':
                        startPoint = startPoint < 7 ? startPoint + 3 : startPoint;;
                        break;
                    case 'L':
                        startPoint =  startPoint % 3 != 1 ? startPoint - 1: startPoint;;
                        break;
                }

            }

            resultBuilder.append(startPoint);
        }

        result = resultBuilder.toString();
    }


}
