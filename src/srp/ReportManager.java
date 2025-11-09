package srp;

import java.time.LocalDateTime;
import java.util.List;


public class ReportManager {

    private final DataCalculator calculator;
    private final ReportOutput output;
    private final ReportSaver saver;

    public ReportManager(List<Integer> data, ReportOutput output, ReportSaver saver) {
        this.calculator = new DataCalculator(data);
        this.output = output;
        this.saver = saver;
    }

    public void generateReport() {
        int sum = calculator.calculateSum();
        double avg = calculator.calculateAverage();
        String timestamp = LocalDateTime.now().toString();

        StringBuilder consoleReport = new StringBuilder();
        consoleReport.append("=== Report ===\n");
        consoleReport.append("Sum: ").append(sum).append("\n");
        consoleReport.append("Average: ").append(avg).append("\n");
        consoleReport.append("Generated at: ").append(timestamp).append("\n");
        output.print(consoleReport.toString());

        StringBuilder fileReport = new StringBuilder();
        fileReport.append("=== Report ===\n");
        fileReport.append("Sum: ").append(sum).append("\n");
        fileReport.append("Average: ").append(avg).append("\n");
        fileReport.append("Generated at: ").append(timestamp).append("\n");
        saver.save(fileReport.toString());
    }
}
