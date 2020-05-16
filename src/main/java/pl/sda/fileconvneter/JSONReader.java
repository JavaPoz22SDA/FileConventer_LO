package pl.sda.fileconvneter;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JSONReader implements Reader{

    private Path path;

    @Override
    public void read(String inputFilePath) {
        try {

            path = Paths.get(inputFilePath);
            byte[] bytes = Files.readAllBytes(path);
            System.out.println(bytes);
            String content = new String(bytes);

            JSONArray jsonArray = new JSONArray(content);

            for(int i=0; i<jsonArray.length(); i++){
                Object rawObject = jsonArray.get(i);
                JSONObject record = new JSONObject(rawObject.toString());
                System.out.println(jsonArray.get(i));
                System.out.println("Miasto: " + record.get("city"));
                for(String key: record.keySet()){
                    System.out.println(record.get(key));
                }
            }

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
