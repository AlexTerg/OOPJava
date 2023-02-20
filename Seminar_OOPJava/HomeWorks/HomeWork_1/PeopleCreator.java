package HomeWorks.HomeWork_1;

import java.time.LocalDate;

import HomeWorks.HomeWork_1.People.Gender;

public class PeopleCreator {

    private static PeopleCreator instance;
    People temp;
    
    public static PeopleCreator getInstance() {
        if (instance == null)
          instance = new PeopleCreator();
        instance.init();
        return instance;
      }
    
    
    private PeopleCreator() {

    }
    
    private void init() {

        temp = new People(0, null, null, null, null, null);

        temp.setBirthday(LocalDate.of(1900, 1, 1));
        temp.setBirthplace(null);
        temp.setFullName("");
        temp.setId(-1);
        temp.setGender(null);
        temp.setStatusAlive(true);

    }


    public PeopleCreator setBirthday(LocalDate birthday) {
        temp.setBirthday(birthday);
        return this;
    }

    public PeopleCreator setBirthplace(String birthplace) {
        temp.setBirthplace(birthplace);
        return this;
    }

    public PeopleCreator setName(String name) {
        temp.setFullName(name);
        return this;
    }

    public PeopleCreator setId(int id) {
        temp.setId(id);
        return this;
    }

    public PeopleCreator setGender(Gender gndr) {
        temp.setGender(gndr);
        return this;
    }

    public PeopleCreator setStatusAlive(Boolean alive) {
        temp.setStatusAlive(alive);
        return this;
    }

    public People create() {
        return temp;
    }
}   
