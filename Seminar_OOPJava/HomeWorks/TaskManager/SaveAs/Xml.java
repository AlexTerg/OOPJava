package HomeWorks.TaskManager.SaveAs;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import HomeWorks.TaskManager.Tasks;
import HomeWorks.TaskManager.Users;

public class Xml extends TextFormat {

    @Override
    public void SaveAs(List<Users> repo, String path) {

        StringBuilder sb = new StringBuilder("<?xml version=\"1.0\">\n");
        for (Users user : repo) {
            // System.out.println("csv" + user.toString());
            sb.append(String.format("<ФИО Фамилия=\"%s\" Имя=\"%s\" Отчество=\"%s\"/>\n", user.getFirstname(),
                    user.getSurname(), user.getPatronymic()));
            for (Tasks task : user.getTask()) {
                sb.append(String.format(
                        "<Задачи id=\"%d\" Описание=\"%s\" Дата публикации=\"%s\" Время публикации=\"%s\"/>\n",
                        task.getId(), task.getText(), task.getDate(), task.getTime()));
            }
        }

        try (FileWriter writer = new FileWriter(path + ".xml", false)) {
            writer.write(sb.toString());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

}
