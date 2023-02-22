package HomeWorks.HomeWork_1;

import java.time.LocalDate;

import HomeWorks.HomeWork_1.People.Gender;
import HomeWorks.HomeWork_1.Relation.RelatEnum;
import HomeWorks.HomeWork_1.SaveAs.Txt;

public class Main {
    public static void main(String[] args) {
        RepoPeople people = new RepoPeople();
        people.addDb(new People(0, "Александр", LocalDate.of(1926, 4, 22), "Москва", false, Gender.MALE));
        people.addDb(new People(1, "Сергей", LocalDate.of(1946, 12, 19), "Москва", true, Gender.MALE));
        people.addDb(new People(2, "Мария", LocalDate.of(1955, 6, 9), "Москва", true, Gender.FEMALE));
        people.addDb(new People(3, "Иван", LocalDate.of(1988, 7, 14), "Санкт-Петербург", true, Gender.MALE));
        people.addDb(new People(4, "Александра", LocalDate.of(1993, 11, 2), "Тула", true, Gender.FEMALE));
        people.addDb(new People(5, "Василий", LocalDate.of(1983, 9, 13), "Воронеж", false, Gender.MALE));

        People p1 = PeopleCreator
                .getInstance()
                .setId(6)
                .setBirthday(LocalDate.of(1970, 1, 4))
                .setBirthplace("Брянск")
                .setGender(Gender.MALE)
                .setName("Дмитрий")
                .create();

        people.addDb(p1);

        people.sort(new ComporatorName()); //сортировка по имени

        RepoRelation relation = new RepoRelation();
        relation.addDb(new Relation(1, 0, RelatEnum.SON));
        relation.addDb(new Relation(2, 0, RelatEnum.DAUGHTER));
        relation.addDb(new Relation(0, 1, RelatEnum.FATHER));
        relation.addDb(new Relation(0, 2, RelatEnum.FATHER));
        relation.addDb(new Relation(3, 4, RelatEnum.BROTHER));
        relation.addDb(new Relation(4, 3, RelatEnum.SISTER));
        relation.addDb(new Relation(5, 2, RelatEnum.DAUGHTER));
        relation.addDb(new Relation(2, 5, RelatEnum.MOTHER));

        Relation rel = RelationCreator
                    .getInstance()
                    .setFirstPeople(6)
                    .setRelationship(RelatEnum.FATHER)
                    .setSecondPeople(4)
                    .create();
        
        Relation rel2 = RelationCreator
                    .getInstance()
                    .setFirstPeople(4)
                    .setSecondPeople(6)
                    .setRelationship(RelatEnum.DAUGHTER)
                    .create();
           
        
        relation.addDb(rel);
        relation.addDb(rel2);

        Repo repo = new Repo(people, relation);

        var res = repo.getChild("Александр"); // проводим иследование(получаем всех детей по имени)
        var res2 = repo.getInfo("Иван"); // иследование показывает все родственные связи по имени
        var res3 = repo.getInfo("Александр", true); // иследует всех родственников с фильтром жив или нет
        var res4 = repo.getInfo(6);

        for (var p : people) { //проверка цикла
            System.out.println(p);
        }

        Notepad np = new Notepad();
        np.newFile();
        np.currentDocument().addText(res);
        np.SaveAs("file1", new Txt());

        System.out.println(res);
        System.out.println();
        System.out.println(res2);
        System.out.println();
        System.out.println(res3);
        System.out.println();
        System.out.println(res4);

    }
}
