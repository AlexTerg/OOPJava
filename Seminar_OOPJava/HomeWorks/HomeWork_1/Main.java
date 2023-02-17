package HomeWorks.HomeWork_1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        RepoPeople people = new RepoPeople();
        people.addDb(new People(0, "Александр", LocalDate.of(1926, 4, 22), "Москва", "нет", "м"));
        people.addDb(new People(1, "Сергей", LocalDate.of(1946, 12, 19), "Москва", "да", "м"));
        people.addDb(new People(2, "Мария", LocalDate.of(1955, 6, 9), "Москва", "да", "ж"));
        people.addDb(new People(3, "Иван", LocalDate.of(1988, 7, 14), "Санкт-Петербург", "да", "м"));
        people.addDb(new People(4, "Александра", LocalDate.of(1993, 11, 2), "Тула", "да", "ж"));
        people.addDb(new People(5, "Василий", LocalDate.of(1983, 9, 13), "Воронеж", "нет", "м"));

        RepoRelation relation = new RepoRelation();
        relation.addDb(new Relation(1, 0, "Сын"));
        relation.addDb(new Relation(2, 0, "Дочь"));
        relation.addDb(new Relation(0, 1, "Отец"));
        relation.addDb(new Relation(0, 2, "Отец"));
        relation.addDb(new Relation(3, 4, "Брат"));
        relation.addDb(new Relation(4, 3, "Сестра"));
        relation.addDb(new Relation(5, 2, "Сын"));
        relation.addDb(new Relation(2, 5, "Мать"));

        Repo repo = new Repo(people, relation);

        var res = repo.getChild("Александра"); // проводим иследование(получаем всех детей по имени)
        var res2 = repo.getInfo("Иван"); // иследование показывает все родственные связи по имени
        System.out.println(res);
        System.out.println();
        System.out.println(res2);
    }
}
