package HomeWorks.HomeWork_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        List<Notebook> laptops = new ArrayList<>();

        Notebook laptopFirst = new Notebook("Honor", "Magicbook", 1000.0);

        laptopFirst.addSpecifications(new Specifications(16, 512, "Windows", "gray"));
        laptops.add(laptopFirst);

        Notebook laptopSecond = new Notebook("Honor", "Magicbook", 750.0);
        laptopSecond.addSpecifications(new Specifications(8, 256, "Windows", "gray"));
        laptops.add(laptopSecond);

        Notebook laptopThrid = new Notebook("HP", "Pavilion", 1099.0);

        laptopThrid.addSpecifications(new Specifications(16, 512, "Windows", "silver"));
        laptops.add(laptopThrid);

        Notebook laptopFourth = new Notebook("HP", "Pavilion", 800.0);

        laptopFourth.addSpecifications(new Specifications(8, 256, "Windows", "white"));
        laptops.add(laptopFourth);

        Notebook laptopFifth = new Notebook("Apple", "Macintosh", 2000.0);

        laptopFifth.addSpecifications(new Specifications(8, 512, "macOS", "red"));
        laptops.add(laptopFifth);

        Notebook laptopSixth = new Notebook("Apple", "Macintosh", 1750.0);

        laptopSixth.addSpecifications(new Specifications(4, 256, "macOS", "black"));
        laptops.add(laptopSixth);

        System.out.println("Приветсвую тебя, мой юнный друг\nВыбери подходязий вариант из списка:");
        System.out.println("1 - Показать весь каталог\n2 - Выболнить поиск по фильтру");
        int num = Integer.parseInt(scn.nextLine());

        if (num == 1)
            viewLaptos(laptops);
        else if (num == 2)
            laptopFilter(laptops);
    }

    private static void viewLaptos(List<Notebook> laptops) {
        for (Notebook notebook : laptops) {
            System.out.println(notebook);
        }
    }

    private static void laptopFilter(List<Notebook> lpts) {
        System.out.println(
                "Введите цифру, соответствующую необходимому критерию:\n1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет");
        int num = Integer.parseInt(scn.nextLine());

        if (num == 1) {
            System.out.println("Введите объем озу: \nmin - для запроса минимального значения");
            String ram = scn.nextLine();
            if (ram.equals("min")) {
                int min = lpts.get(0).getSpecifications().get(0).getRam();
                for (Notebook notebook : lpts) {
                    if (notebook.getSpecifications().get(0).getRam() < min) {
                        min = notebook.getSpecifications().get(0).getRam();
                    }
                }
                System.out.println("Минимальный объем озу: " + min);
            }

            else if (isDigit(ram)) {
                for (Notebook notebook : lpts) {
                    for (Specifications spc : notebook.getSpecifications()) {
                        if (spc.getRam().equals(Integer.parseInt(ram)))
                            System.out.println(notebook);
                    }
                }
            } 
            else
                System.out.println("Некорректный ввод");
        }
        else if (num == 2) {
            System.out.println("Введите объем ЖД: \nmin - для запроса минимального значения");
            String hdd = scn.nextLine();
            if (hdd.equals("min")) {
                int min = lpts.get(0).getSpecifications().get(0).getHdd();
                for (Notebook notebook : lpts) {
                    if (notebook.getSpecifications().get(0).getHdd() < min) {
                        min = notebook.getSpecifications().get(0).getHdd();
                    }
                }
                System.out.println("Минимальный объем ЖД: " + min);
            }

            else if (isDigit(hdd)) {
                for (int i = 0; i < lpts.size(); i++) {
                    for (Specifications specification : lpts.get(i).getSpecifications()) {
                        if (specification.getHdd().equals(Integer.parseInt(hdd))) {
                            System.out.println(lpts.get(i));
                        }
                    }
                }
            }
            else 
                System.out.println("Некорректный ввод");
        }

        else if (num == 3) {
            System.out.println("Введите ос: ");
            String os = scn.nextLine().toLowerCase();
            for (int i = 0; i < lpts.size(); i++) {
                for (Specifications specification : lpts.get(i).getSpecifications()) {
                    if (specification.getOs().toLowerCase().equals(os)) {
                        System.out.println(lpts.get(i));
                    }
                }
            }
        }

        else if (num == 4) {
            System.out.println("Введите цвет: ");
            String color = scn.nextLine().toLowerCase();
            for (int i = 0; i < lpts.size(); i++) {
                for (Specifications specification : lpts.get(i).getSpecifications()) {
                    if (specification.getColor().toLowerCase().equals(color)) {
                        System.out.println(lpts.get(i));
                    }
                }
            }
        }

    }

    private static boolean isDigit(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
