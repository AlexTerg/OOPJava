package HomeWorks.TaskManager;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private int id;
    private String firstname;
    private String surname;
    private String patronymic;
    private List<Tasks> task = new ArrayList<>();
    private int index;

    public void addTask(Tasks tsk) {
        task.add(tsk);
        tsk.setId(++index);
    }

    public Users(String firstname, String surname, String patronymic) {
        this.firstname = firstname;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public boolean equals(String str) {
        if (firstname.equals(str) || surname.equals(str) || patronymic.equals(str))
            return true;
        else return false;
        
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public List<Tasks> getTask() {
        return this.task;
    }

    public void setTask(List<Tasks> task) {
        this.task = task;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", firstname='" + getFirstname() + "'" +
            ", surname='" + getSurname() + "'" +
            ", patronymic='" + getPatronymic() + "'" +
            ", task='" + getTask() + "'" +
            "}";
    }

}
