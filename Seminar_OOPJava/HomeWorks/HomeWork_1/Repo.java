package HomeWorks.HomeWork_1;

public class Repo {
    RepoPeople rp;
    RepoRelation rr;

    public Repo(RepoPeople rp, RepoRelation rr) {
        this.rp = rp;
        this.rr = rr;
    }

    public StringBuilder getChild(String name) {
        StringBuilder sb = new StringBuilder();
        int idPeople = 0;
        int cnt = 0; // счетчик детей
        for (People people : rp.getDb()) {
            if (people.getFullName().equals(name)) {
                idPeople = people.getId();
                sb.append(String.format("ИМЯ: %s\nДАТА РОЖДЕНИЯ: %s\nМЕСТО РОЖДЕНИЯ: %s\n\n", people.getFullName(),
                        people.getBirthday(), people.getBirthplace()));
                break;
            }
        }

        if (sb.isEmpty()) {
            sb.append("Человека с таким именем нет");
            return sb;
        }

        sb.append("ДЕТИ:\n");

        for (Relation relation : rr.getDb()) {
            if (relation.getSecondPeople() == idPeople
                    && (relation.getRelationship().equals("Сын") || relation.getRelationship().equals("Дочь"))) {
                sb.append(String.format("Имя: %s\nДата рождения: %s\nМесто рождения: %s\nПол: %s\n\n",
                        rp.getDb().get(relation.firstPeople).getFullName(),
                        rp.getDb().get(relation.firstPeople).getBirthday(),
                        rp.getDb().get(relation.firstPeople).getBirthplace(),
                        rp.getDb().get(relation.firstPeople).getGender()));
                cnt++;
            }
        }

        if (cnt == 0)
            sb.append("Детей нет!");

        return sb;

    }

    public StringBuilder getInfo(String name) {
        StringBuilder sb = new StringBuilder();

        int idPeople = 0;
        for (People people : rp.getDb()) {
            if (people.getFullName().equals(name)) {
                idPeople = people.getId();
                sb.append(String.format("ИМЯ: %s\nДАТА РОЖДЕНИЯ: %s\nМЕСТО РОЖДЕНИЯ: %s\n\n", people.getFullName(),
                        people.getBirthday(), people.getBirthplace()));
                break;
            }
        }

        if (sb.isEmpty()) {
            sb.append("Человека с таким именем нет");
            return sb;
        }

        sb.append("РОДНЯ:\n");
        for (Relation relation : rr.getDb()) {
            if (relation.secondPeople == idPeople) {
                sb.append(String.format("Имя: %s\nДата рождения: %s\nМесто рождения: %s\nПол: %s\nРодственная связь: %s\n\n",
                rp.getDb().get(relation.firstPeople).getFullName(),
                rp.getDb().get(relation.firstPeople).getBirthday(),
                rp.getDb().get(relation.firstPeople).getBirthplace(),
                rp.getDb().get(relation.firstPeople).getGender(),
                relation.getRelationship()));
            }
        }

        return sb;
    }

    public RepoPeople getRp() {
        return this.rp;
    }

    public void setRp(RepoPeople rp) {
        this.rp = rp;
    }

    public RepoRelation getRr() {
        return this.rr;
    }

    public void setRr(RepoRelation rr) {
        this.rr = rr;
    }

}
