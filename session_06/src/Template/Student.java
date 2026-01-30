package Template;

import java.util.Date;

public class Student {
    // Thuộc tính
    protected String fullName;

     Date dateOfBirth;

     String country;

     boolean isKOL;
    // Phương thức


    public Student() {
    }

    public Student(String fullName, Date dateOfBirth, String country, boolean isKOL) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.isKOL = isKOL;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isKOL() {
        return isKOL;
    }

    public void setKOL(boolean KOL) {
        isKOL = KOL;
    }
}
