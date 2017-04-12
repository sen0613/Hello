package school.model;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class School {
    private String schoolID;
    private String name_full;
    private String city;
    private String state;
    private String country;

    public School() {}

    public School(String schoolID, String name_full, String city, String state, String country) {
        this.schoolID = schoolID;
        this.name_full = name_full;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(String schoolID) {
        this.schoolID = schoolID;
    }

    public String getName_full() {
        return name_full;
    }

    public void setName_full(String name_full) {
        this.name_full = name_full;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolID='" + schoolID + '\'' +
                ", name_full='" + name_full + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
