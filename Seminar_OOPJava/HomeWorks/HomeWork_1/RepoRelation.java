package HomeWorks.HomeWork_1;

import java.util.ArrayList;

public class RepoRelation {
    
    ArrayList<Relation> db = new ArrayList<>();

    public ArrayList<Relation> getDb() {
        return db;
    }

    public void addDb(Relation relation) {
        db.add(relation);
    }

    public Relation read(int i) {
        return db.get(i);
    }

    // public Relation read(String status) {
    //     for (Relation relation : db) {
    //         if (relation.relationship.equals(status)) return relation;
    //     }
    //     return null;
    // }
    

    @Override
    public String toString() {
        return "{" +
            " db='" + getDb() + "'" +
            "}";
    }

}
