package HomeWorks.TaskManager;

import java.util.Scanner;


public class View{

    Scanner scn = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to Task Manager");
    }

    public int menu() {
        System.out.println("Выбирете вариант:\n 1 - Создать пользователя.\n2 - Выбрать пользователя");
        return scn.nextInt();
    }

    public String[] createUserInfo() {
        System.out.println("Введите имя фамилию отчество через пробел");
        String[] usr = scn.nextLine().split(" ");
        return usr;
    }

    public String[] createUser() {
        String[] user = scn.nextLine().split(" ");
        return user;
    }
}
