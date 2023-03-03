package HomeWorks.TaskManager.SaveAs;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import HomeWorks.TaskManager.Tasks;
import HomeWorks.TaskManager.Users;

public class Json extends TextFormat {

    @Override
    public void SaveAs(List<Users> repo, String path) {

        StringBuilder sb = new StringBuilder();
        for (Users user : repo) {
            sb.append(String.format(
                    "{\n\t\"ID\": %d,\n\t\"Имя\": \"%s\",\n\t\"Фамилия\": \"%s\",\n\t\"Отчество\": \"%s\",\n\t\"Задачи\": [",
                    user.getId(), user.getFirstname(), user.getSurname(), user.getPatronymic()));
            for (Tasks task : user.getTask()) {
                sb.append(String.format(
                        "\n\t{\n\t\t\"ID\": %d,\n\t\t\"Задача\": \"%s\",\n\t\t\"Дата добавления\": \"%s\",\n\t\t\"Время добавления\": \"%s\",\n\t\t\"Приоритет\": \"%s\"\n\t},\n\t",
                        task.getId(),
                        task.getText(), task.getDate(), task.getTime(), task.getPriority()));
            }
            sb.append("]\n},\n");
        }
        try (FileWriter writer = new FileWriter(path + ".json", false)) {
            writer.write(sb.toString());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

}
