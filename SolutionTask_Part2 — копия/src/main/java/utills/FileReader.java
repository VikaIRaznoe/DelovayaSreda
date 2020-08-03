package utills;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Properties;

public class FileReader {

    public static String getValue(String value){
        String inputFile = "/src/test/resources/userData.properties";
        String workingDir = System.getProperty("user.dir");

        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(workingDir.substring(0, workingDir.length()) + inputFile));
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String data = properties.getProperty(value);
        try {
            data = new String(data.getBytes(), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}