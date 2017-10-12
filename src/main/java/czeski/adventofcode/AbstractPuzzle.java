package czeski.adventofcode;


import java.io.*;

abstract public class AbstractPuzzle {
    private BufferedReader dataBuffer;
    protected String result;
    protected String inputPath;

    private void loadData() throws IOException{
        dataBuffer = new BufferedReader(new FileReader(getInputPath()));
    }

    public final void start(){
        try {
            loadData();
            run();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    protected abstract void run() throws IOException;

    public String getResult(){
        return result;
    }

    private String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    protected BufferedReader getDataBuffer() {
        return dataBuffer;
    }
}
