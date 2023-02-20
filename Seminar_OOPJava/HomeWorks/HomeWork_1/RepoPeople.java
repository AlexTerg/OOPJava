package HomeWorks.HomeWork_1;

import java.util.ArrayList;

public class RepoPeople {

    ArrayList<People> db = new ArrayList<>();

    public ArrayList<People> getDb() {
        return db;
    }

    public void addDb(People data) {
        db.add(data);
    }

    public People read(int i) {
        return db.get(i);
    }

    public People read(String name) {
        for (People people : db) {
            if (people.getFullName().equals(name))
                return people;
        }
        return null;
    }


    @Override
    public String toString() {
        return "{" +
            " db='" + getDb() + "'" +
            "}";
    }

}
