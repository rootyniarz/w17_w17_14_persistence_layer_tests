package zajavka.infrastructure.database.jparepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zajavka.infrastructure.database.model.EmployeeEntity;

import java.util.Optional;

@Repository
public interface EmployeeDataJpaRepository extends JpaRepository<EmployeeEntity, Integer> {
    Optional<EmployeeEntity> findByNameAndSurname(String name, String surname);
    void deleteByNameAndSurname(String name, String surname);
}


