package HomeWorks.TaskManager;

import java.time.LocalDate;
import java.time.LocalTime;

public class Tasks {
    private int id;
    private LocalDate date;
    private LocalTime time;
    private String text;
    private Priority priority;


    public Tasks(LocalDate date, LocalTime time, String text, Priority priority) {
        this.date = date;
        this.time = time;
        this.text = text;
        this.priority = priority;
    }



    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return this.time.withNano(0);
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Priority getPriority() {
        return this.priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", date='" + getDate() + "'" +
            ", time='" + getTime() + "'" +
            ", text='" + getText() + "'" +
            ", priority='" + getPriority() + "'" +
            "}";
    }


}
