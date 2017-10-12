package czeski.adventofcode;

public class App
{

    public static void main( String[] args )
    {
        if (args.length == 0){
            System.out.println("Usage: aoc [DAY]");
            System.out.println("Examples:");
            System.out.println("\taoc Puzzle - executes code for Puzzle");
            System.out.println("\taoc Day01P2 - executes code for Puzzle part 2");
            System.exit(0);
        }

        String dayName = args[0];

        try {
            Class puzzleClass = Class.forName("czeski.adventofcode.puzzle." + dayName + ".Puzzle");
            AbstractPuzzle day = (AbstractPuzzle)puzzleClass.getConstructor(null).newInstance();
            day.start();
            System.out.println(day.getResult());
        }catch (ClassNotFoundException e){
            System.out.println("Code for class " + dayName + " does not exist");
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
