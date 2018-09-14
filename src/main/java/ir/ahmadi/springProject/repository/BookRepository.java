package ir.ahmadi.springProject.repository;

import ir.ahmadi.springProject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Student, Long> {

}
