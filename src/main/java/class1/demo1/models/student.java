package class1.demo1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;
import jakarta.persistence.Id;

@Entity
@Data
public class student {
    @Id
    @GeneratedValue
    Long Id;
    String Name;
    String RollNo;
    String Dept;
    int year;
    int DOB;
    float CGPA;
}
