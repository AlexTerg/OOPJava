package HomeWorks.HomeWork_1;

public class Relation {
    private int firstPeople;
    private int secondPeople;
    private RelatEnum relationship;


    public enum RelatEnum {
        SON ("Сын"),
        DAUGHTER ("Дочь"),
        FATHER ("Отец"),
        MOTHER ("Мать"),
        SISTER ("Сестра"),
        BROTHER ("Брат");

        String translate;

        RelatEnum(String translate) {
            this.translate = translate;
        }

        public String getTranslate() {
            return this.translate;
        }

    }
    
    

    public Relation(int firstPeople, int secondPeople, RelatEnum relationship) {
        this.firstPeople = firstPeople;
        this.secondPeople = secondPeople;
        this.relationship = relationship;
    }



    public int getFirstPeople() {
        return this.firstPeople;
    }

    public void setFirstPeople(int firstPeople) {
        this.firstPeople = firstPeople;
    }

    public int getSecondPeople() {
        return this.secondPeople;
    }

    public void setSecondPeople(int secondPeople) {
        this.secondPeople = secondPeople;
    }

    public RelatEnum getRelationship() {
        return this.relationship;
    }

    public String getRelationshipTranslate() {
        return this.relationship.translate;
    }

    public void setRelationship(RelatEnum relationship) {
        this.relationship = relationship;
    }


    @Override
    public String toString() {
        return "{" +
            " firstPeople='" + getFirstPeople() + "'" +
            ", secondPeople='" + getSecondPeople() + "'" +
            ", relationship='" + getRelationship() + "'" +
            "}";
    }

}
