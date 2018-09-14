package ir.ahmadi.springProject.repository;

import ir.ahmadi.springProject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookSubjectRepository extends JpaRepository<Student, Long> {
//    List<Book> findByPostId(Long postId, Pageable pageable);
}
