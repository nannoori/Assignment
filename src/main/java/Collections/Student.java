package Collections;

public class Student {

    private Integer Id;
    private String Name;
    private String City;

    public Student() {
    }

    public Student(Integer id, String name, String city) {
        Id = id;
        Name = name;
        City = city;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", city='" + City + '\'' +
                '}';
    }


}





