package pl.sda.fileconvneter;

public class ReaderFactory {

    public Reader produce(String filePath){

        if(filePath.endsWith(".json")){
            return new JSONReader();
        }
        /*
        TODO: CSVReader, ExcelReader ify
         */
        return null;
    }
}
