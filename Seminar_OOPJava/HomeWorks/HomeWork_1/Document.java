package HomeWorks.HomeWork_1;

public class Document {
    StringBuilder sb;

    public void addText(String text) {
        sb = new StringBuilder();
        sb.append(text + "\n");
    }

    public void addText(StringBuilder text) {
        sb = new StringBuilder();
        sb.append(text + "\n");
    }

    public String getText() {
        return sb.toString();
    }

}
