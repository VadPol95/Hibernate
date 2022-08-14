import entity.Student;
import serviceImpl.StudentServiceImpl;

public class Main {
    public static void main(String[] args) {
        StudentServiceImpl service = new StudentServiceImpl();
//        System.out.println(service.findStudentByName("Arni"));
//        System.out.println(service.findStudentById(1));
        service.saveStudent(new Student("123",2000));
//        System.out.println(service.findAllStudents());
    }
}


