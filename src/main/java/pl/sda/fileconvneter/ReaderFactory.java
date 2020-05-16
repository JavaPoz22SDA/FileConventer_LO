package pl.sda.fileconvneter;

public class ReaderFactory {

    public Reader produce(String filePath){

        if(filePath.endsWith(".json")){
            return new JSONReader();
        }
        if(filePath.endsWith(".xlsx")){
            return new ExcelReader();
        }
        /*
        TODO: CSVReader, ExcelReader ify
         */
        return null;
    }
}
