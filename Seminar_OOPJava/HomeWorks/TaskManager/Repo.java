package HomeWorks.TaskManager;

import java.util.ArrayList;
import java.util.List;

import HomeWorks.TaskManager.SaveAs.TextFormat;

public class Repo {

    private List<Users> db = new ArrayList<>();
    private int index;

    public void SaveAs(String path, TextFormat format) {
        System.out.println(db);
        format.SaveAs(db, path);
    }

    public void addDb(Users usr) {
        db.add(usr);
        usr.setId(++index);
    }

    public void addDb(String[] user) {
        db.add(new Users(user[0], user[1], user[2]));
    }

    public List<Users> getDb() {
        return db;
    }

    public int size() {
        return db.size();
    }

    public Users get(int i) {
        return db.get(i);
    }

    public Users getUserTask(int id) {
        return db.get(id - 1);
    }

    public Users getUserTask(String name) {
        for (Users users : db) {
            if (users.equals(name))
                return getUserTask(users.getId());
        }
        return null;

    }

    public StringBuilder getUserTasks(String name) {
        StringBuilder sb = new StringBuilder();
        Users user = getUserTask(name);
        sb.append(String.format("{\n\"ID\": %d,\n\"Имя\": %s,\n \"Фамилия\": %s,\n \"Отчество\": %s\n", user.getId(),
                user.getFirstname(),
                user.getSurname(), user.getPatronymic()));
        for (Tasks task : user.getTask()) {
            sb.append(String.format("\"ID Задачи\": %d,\n[\"Текст задачи\": %s,\n%s\n%s]\n", task.getId(),
                    task.getText(), task.getDate(),
                    task.getTime()));
        }
        return sb;
    }

    public Tasks getUserTaskPriority(Users user, Priority priority) {
        for (Tasks task : user.getTask()) {
            if (task.getPriority().equals(priority))
                return task;
        }
        return null;
    }

    @Override
    public String toString() {
        return "{" +
                " db='" + getDb() + "'" +
                "}";
    }

}
