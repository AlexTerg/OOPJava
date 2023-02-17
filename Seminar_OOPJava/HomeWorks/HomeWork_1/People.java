package HomeWorks.HomeWork_1;

import java.time.LocalDate;

/**
 * People
 */
public class People {
    public int id;
    public String fullName;
    public LocalDate birthday;
    public String birthplace;
    public String statusAlive;
    public String gender;


    public People(int id, String fullName, LocalDate birthday, String birthplace, String statusAlive, String gender) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.birthplace = birthplace;
        this.statusAlive = statusAlive; 
        this.gender = gender;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getBirthplace() {
        return this.birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getStatusAlive() {
        return this.statusAlive;
    }

    public void setStatusAlive(String statusAlive) {
        this.statusAlive = statusAlive;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", fullName='" + getFullName() + "'" +
            ", birthday='" + getBirthday() + "'" +
            ", birthplace='" + getBirthplace() + "'" +
            ", statusAlive='" + getStatusAlive() + "'" +
            ", gender='" + getGender() + "'" +
            "}";
    }


    
}