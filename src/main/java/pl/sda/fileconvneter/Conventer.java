package pl.sda.fileconvneter;

public class Conventer {

    public void convert(String sourceFilePath, String outputFilePath){

        ReaderFactory readerFactory = new ReaderFactory();
        Reader reader = readerFactory.produce(sourceFilePath);
        reader.read(sourceFilePath);
        if (reader instanceof JSONReader){
            System.out.println("Dziala, mam obiekt JSONReader");
        }

    }

}
