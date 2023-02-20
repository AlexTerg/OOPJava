package HomeWorks.HomeWork_1.SaveAs;

import java.io.FileWriter;
import java.io.IOException;

import HomeWorks.HomeWork_1.Document;

public class Txt extends TextFormat {

    public void SaveAs(Document document, String path) {
        try (FileWriter writer = new FileWriter(path + ".txt", false)) {
            writer.write(document.getText());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
