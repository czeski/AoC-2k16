package czeski.adventofcode;


import java.io.*;

abstract public class AbstractPuzzle {
    protected String data;
    protected String result;
    protected String inputPath;

    private String loadData() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(getInputPath()));

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

    public String getResult(){
        return result;
    }

    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }
}
