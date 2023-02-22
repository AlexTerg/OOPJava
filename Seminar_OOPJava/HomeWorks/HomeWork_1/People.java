package HomeWorks.HomeWork_1;

import java.time.LocalDate;

/**
 * People
 */
public class People {
    private int id;
    private String fullName;
    private LocalDate birthday;
    private String birthplace;
    private Boolean statusAlive;
    private Gender gender;

    public enum Gender {
        MALE ("Муж."),
        FEMALE ("Жен.");

        String translate;

        Gender(String translate) {
            this.translate = translate;
        }

        public String getTranslate() {
            return this.translate;
        }

    }


    public People(int id, String fullName, LocalDate birthday, String birthplace, Boolean statusAlive, Gender gender) {
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

    public Boolean getStatusAlive() {
        return this.statusAlive;
    }

    public void setStatusAlive(Boolean statusAlive) {
        this.statusAlive = statusAlive;
    }

    public String getGender() {
        return this.gender.translate;
    }

    public void setGender(Gender gender) {
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