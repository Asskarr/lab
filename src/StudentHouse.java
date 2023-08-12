public class StudentHouse{
    String name;
    Student[] students= new Student[1000];
    int size = 0;

    public StudentHouse(String name) {
        this.name = name;
    }

    public StudentHouse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}