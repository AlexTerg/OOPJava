package HomeWorks.HomeWork_1;

import HomeWorks.HomeWork_1.Relation.RelatEnum;

public class RelationCreator {
    private static RelationCreator instance;
    Relation relation;

    public static RelationCreator getInstance() {
        if (instance == null) {
            instance = new RelationCreator();
        }
        instance.init();
        return instance;
    }

    private void init() {

        relation = new Relation(0, 0, null);

        relation.setFirstPeople(null);
        relation.setSecondPeople(null);
        relation.setRelationship(null);

    }

    public RelationCreator setFirstPeople(int id) {
        relation.setFirstPeople(id);
        return this;
    }

    public RelationCreator setSecondPeople(int id) {
        relation.setSecondPeople(id);
        return this;
    }

    public RelationCreator setRelationship(RelatEnum re) {
        relation.setRelationship(re);
        return this;
    }


    public Relation create() {
        return relation;
    }

}
