package HomeWorks.HomeWork_1;

import HomeWorks.HomeWork_1.Relation.RelatEnum;

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
                    && (relation.getRelationship().equals(RelatEnum.SON)
                            || relation.getRelationship().equals(RelatEnum.DAUGHTER))) {
                sb.append(String.format("Имя: %s\nДата рождения: %s\nМесто рождения: %s\nПол: %s\n\n",
                        rp.getDb().get(relation.getFirstPeople()).getFullName(),
                        rp.getDb().get(relation.getFirstPeople()).getBirthday(),
                        rp.getDb().get(relation.getFirstPeople()).getBirthplace(),
                        rp.getDb().get(relation.getFirstPeople()).getGender()));
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
            if (relation.getSecondPeople() == idPeople) {
                sb.append(String.format(
                        "Имя: %s\nДата рождения: %s\nМесто рождения: %s\nПол: %s\nРодственная связь: %s\n\n",
                        rp.getDb().get(relation.getFirstPeople()).getFullName(),
                        rp.getDb().get(relation.getFirstPeople()).getBirthday(),
                        rp.getDb().get(relation.getFirstPeople()).getBirthplace(),
                        rp.getDb().get(relation.getFirstPeople()).getGender(),
                        relation.getRelationshipTranslate()));
            }
        }

        return sb;
    }

    public StringBuilder getInfo(String name, Boolean statusAlive) {
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
        for (int i = 0; i < rr.getDb().size(); i++) {
            int idFP = rr.getDb().get(i).getFirstPeople();
            if (rr.getDb().get(i).getSecondPeople() == idPeople
                    && rp.getDb().get(idFP).getStatusAlive() == statusAlive) {
                sb.append(String.format(
                        "Имя: %s\nДата рождения: %s\nМесто рождения: %s\nПол: %s\nЖив: %b\nРодственная связь: %s\n\n",
                        rp.getDb().get(rr.getDb().get(i).getFirstPeople()).getFullName(),
                        rp.getDb().get(rr.getDb().get(i).getFirstPeople()).getBirthday(),
                        rp.getDb().get(rr.getDb().get(i).getFirstPeople()).getBirthplace(),
                        rp.getDb().get(rr.getDb().get(i).getFirstPeople()).getGender(),
                        rp.getDb().get(rr.getDb().get(i).getFirstPeople()).getStatusAlive(),
                        rr.getDb().get(i).getRelationshipTranslate()));
            }
        }

        return sb;
    }

    public StringBuilder getInfo(int id) {
        StringBuilder sb = new StringBuilder();

        for (People people : rp.getDb()) {
            if (people.getId() == id) {
                // idPeople = people.getId();
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
        for (int i = 0; i < rr.getDb().size(); i++) {
            if (rr.getDb().get(i).getSecondPeople() == id) {
                sb.append(String.format(
                        "Имя: %s\nДата рождения: %s\nМесто рождения: %s\nПол: %s\nЖив: %b\nРодственная связь: %s\n\n",
                        rp.getDb().get(rr.getDb().get(i).getFirstPeople()).getFullName(),
                        rp.getDb().get(rr.getDb().get(i).getFirstPeople()).getBirthday(),
                        rp.getDb().get(rr.getDb().get(i).getFirstPeople()).getBirthplace(),
                        rp.getDb().get(rr.getDb().get(i).getFirstPeople()).getGender(),
                        rp.getDb().get(rr.getDb().get(i).getFirstPeople()).getStatusAlive(),
                        rr.getDb().get(i).getRelationshipTranslate()));
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

    @Override
    public String toString() {
        return "{" +
                " rp='" + getRp() + "'" +
                ", rr='" + getRr() + "'" +
                "}";
    }

}
