package czeski.adventofcode;


import java.io.*;

abstract public class AbstractPuzzle {
    protected String data;
    protected String result;

    private String loadData() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(getFilePath()));

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

    protected abstract String getFilePath();

    public String getResult(){
        return result;
    }
}
