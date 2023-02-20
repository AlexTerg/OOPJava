package HomeWorks.HomeWork_1;

import java.util.ArrayList;
import java.util.List;

import HomeWorks.HomeWork_1.SaveAs.TextFormat;

public class Notepad {
    private List<Document> document;
    private int index;

    public Notepad() {
        document = new ArrayList<>();
        index = -1;
    }

    public void newFile() {
        document.add(new Document());
        index++;
    }

    public Document currentDocument() {
        return document.get(index);
    }

    public void SaveAs(String path, TextFormat format) {
        format.SaveAs(document.get(index), path);
    }
}
