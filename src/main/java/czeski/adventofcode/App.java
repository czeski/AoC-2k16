package czeski.adventofcode;

public class App
{

    public static void main( String[] args )
    {
        if (args.length == 0){
            System.out.println("Usage: aoc [DAY]");
            System.out.println("Examples:");
            System.out.println("\taoc Day01 - executes code for Day01");
            System.out.println("\taoc Day01P2 - executes code for Day01 part 2");
            System.exit(0);
        }

        String className = args[0];

        try {
            Class dayClass = Class.forName("czeski.adventofcode.days." + className);
            AbstractDay day = (AbstractDay)dayClass.getConstructor(null).newInstance();
            day.start();
            System.out.println(day.getResult());
        }catch (ClassNotFoundException e){
            System.out.println("Code for class " + className + " does not exist");
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
