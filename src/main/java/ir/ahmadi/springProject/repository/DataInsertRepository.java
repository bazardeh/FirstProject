package ir.ahmadi.springProject.repository;

import ir.ahmadi.springProject.model.DataInsert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataInsertRepository extends JpaRepository<DataInsert, Long> {
}
