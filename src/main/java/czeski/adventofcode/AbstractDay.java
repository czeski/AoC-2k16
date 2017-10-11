package czeski.adventofcode;


import java.io.*;

abstract public class AbstractDay {
    protected String data;


    private String loadData() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("data/Day01/input.txt"));

        return bufferedReader.readLine();
    }

    public final void start(){
        try {
            data = loadData();
            run();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public abstract void run();
}
