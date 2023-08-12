package Library;

public class StudentHouse {

    Student[] students = new Student[100];
    int size = 0;

    public void addStudent(Student student){
        students[size] = student;
        size++;
    }

    public void printStudents(){
        for (int i = 0; i < size; i++) {
            System.out.println(students[i].getData());

        }
    }
}
