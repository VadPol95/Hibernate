package entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "fullname")
    private String fullname;
    @Column(name = "year_of_admission")
    private int yearOfAdmission;

    public Student(){}

    public Student(String fullname, int yearOfAdmission) {
        this.fullname = fullname;
        this.yearOfAdmission = yearOfAdmission;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", yearOfAdmission=" + yearOfAdmission +
                '}';
    }
}
