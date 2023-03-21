package HomeWorks.Calculate.ILogger;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class NewLogger implements ILogger{

    @Override
    public void log(String msg) {
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            writer.write(String.format("%s : %s : ", LocalDate.now(), LocalTime.now().withNano(0)));
            writer.write(msg + "\n");
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
    
}
