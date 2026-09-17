package class1.demo1;

import org.springframework.data.jpa.repository.JpaRepository;
import class1.demo1.models.student;

public interface studentrepository extends JpaRepository<student,Long> {
}
