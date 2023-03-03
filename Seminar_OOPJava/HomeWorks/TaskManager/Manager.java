package HomeWorks.TaskManager;

import java.time.LocalDate;
import java.time.LocalTime;

import HomeWorks.TaskManager.SaveAs.Csv;
import HomeWorks.TaskManager.SaveAs.Json;
import HomeWorks.TaskManager.SaveAs.Xml;

public class Manager {

    public static void main(String[] args) {
        Repo repo = new Repo();

        Users usr1 = new Users("Иван", "Иванов", "Иванович");
        Users usr2 = new Users("Петр", "Петров", "Петрович");
        usr1.addTask(new Tasks(LocalDate.now(), LocalTime.now(), "Какая то задача", Priority.MIDDLE));
        usr1.addTask(new Tasks(LocalDate.now(), LocalTime.now(), "Какая то задача2", Priority.HIGHT));
        usr2.addTask(new Tasks(LocalDate.now(), LocalTime.now(), "Какая то задача3", Priority.LOW));

        repo.addDb(usr1);
        repo.addDb(usr2);

        Users user = repo.getUserTask("Иван");
        System.out.println(user.toString());

        System.out.println(repo.getUserTaskPriority(user, Priority.HIGHT));

        StringBuilder sb = repo.getUserTasks("Иван");
        System.out.println(sb);

        repo.SaveAs("test", new Csv());
        repo.SaveAs("test", new Json());
        repo.SaveAs("test", new Xml());

    }

}
