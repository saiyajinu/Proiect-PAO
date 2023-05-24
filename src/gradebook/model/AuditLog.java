package gradebook.model;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AuditLog {
    public static void log(String actionName) {
        try {
            File log = new File("audit.csv");
            log.createNewFile();
            List<String> oldFileContent = new ArrayList<String>();
            Scanner myReader = new Scanner(log);
            while (myReader.hasNextLine()) {
                oldFileContent.add(myReader.nextLine());
            }
            FileWriter fileWriter = new FileWriter("audit.csv");
            for (String e : oldFileContent){
                fileWriter.write(e);
                fileWriter.write('\n');
            }
            LocalDateTime date = LocalDateTime.now();
            fileWriter.write(actionName + ", " + date);
            fileWriter.close();
            myReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
