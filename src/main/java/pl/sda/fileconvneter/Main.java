package pl.sda.fileconvneter;

public class Main {
    public static void main(String[] args) {

        Conventer conventer = new Conventer();
        String sourceFilePath = "test.json";
        String outputFilePath = "test.xlsx";
        conventer.convert(sourceFilePath, outputFilePath);


    }
}
