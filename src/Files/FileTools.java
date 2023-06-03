package Files;

import java.io.*;

public class FileTools {
    public static String fileReader(String filePath){
    String fileContent = "";
    String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while((line = reader.readLine()) != null) {
                fileContent = fileContent + line + "\n";
            }
            reader.close();
            System.out.print(fileContent);
            return fileContent;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String processContent(String fileContent){
        return fileContent.toUpperCase();
    }

    public static void fileWriter(String filePath, String fileContent){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(fileContent);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
