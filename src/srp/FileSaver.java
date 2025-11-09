package srp;

import java.io.FileWriter;
import java.io.IOException;

public class FileSaver implements ReportSaver {
    @Override
    public void save(String content) {
        try (FileWriter writer = new FileWriter("report.txt")) {
            writer.write(content);
            System.out.println("Report saved to report.txt");
        } catch (IOException e) {
            System.out.println("Error writing report file: " + e.getMessage());
        }
    }
}