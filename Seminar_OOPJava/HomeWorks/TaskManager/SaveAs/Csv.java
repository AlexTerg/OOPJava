package HomeWorks.TaskManager.SaveAs;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import HomeWorks.TaskManager.Tasks;
import HomeWorks.TaskManager.Users;

public class Csv extends TextFormat {

    @Override
    public void SaveAs(List<Users> repo, String path) {
        System.out.println(repo.toString());

        StringBuilder sb = new StringBuilder(
                "id;Имя;Фамилия;Отчество;id задачи;задача;дата добавления;время добавления\n");
        for (Users user : repo) {
            for (Tasks task : user.getTask()) {
                sb.append(String.format("%d;%s;%s;%s;%d;%s;%s;%s\n", user.getId(), user.getFirstname(),
                        user.getSurname(), user.getPatronymic(), task.getId(),
                        task.getText(), task.getDate(), task.getTime()));
            }
        }

        try (FileWriter writer = new FileWriter(path + ".csv", false)) {
            writer.write(sb.toString());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

}
