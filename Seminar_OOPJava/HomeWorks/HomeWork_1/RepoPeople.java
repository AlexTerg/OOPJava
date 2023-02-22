package HomeWorks.HomeWork_1;

import java.util.ArrayList;
import java.util.Iterator;

public class RepoPeople implements Iterable<People>{

    ArrayList<People> db = new ArrayList<>();

    int index = 0;

    public ArrayList<People> getDb() {
        return db;
    }

    public void addDb(People data) {
        db.add(data);
    }

    public People read(int i) {
        return db.get(i);
    }

    public void sort(ComporatorName cn) {
        db.sort(cn);
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
    
    // для работы в цикле

    @Override
    public Iterator<People> iterator() {
        return new PeopleIterator();
    }

    public class PeopleIterator implements Iterator<People> {

        private int index;
        
        @Override
        public boolean hasNext() {
            return index < db.size();
    
        }
    
        @Override
        public People next() {
            return db.get(index++);
        }
        
    }
}
