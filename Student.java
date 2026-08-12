package studentmanagementsystem;

public class Student {

    private String id;
    private String name;
    private String age;
    private String course;

    public Student(String id, String name, String age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}