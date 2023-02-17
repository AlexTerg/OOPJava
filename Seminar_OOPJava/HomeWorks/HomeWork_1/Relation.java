package HomeWorks.HomeWork_1;

public class Relation {
    public int firstPeople;
    public int secondPeople;
    public String relationship;


    public Relation(int firstPeople, int secondPeople, String relationship) {
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

    public String getRelationship() {
        return this.relationship;
    }

    public void setRelationship(String relationship) {
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
