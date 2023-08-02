package zajavka.business;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zajavka.infrastructure.database.jparepositories.EmployeeDataJpaRepository;
import zajavka.infrastructure.database.model.EmployeeEntity;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class EmployeeService {
    private EmployeeDataJpaRepository employeeRepository;
    @Transactional
    public EmployeeEntity create(EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }
    public EmployeeEntity find(final Integer employeeId) {
        return employeeRepository.findById(employeeId)
                .orElseThrow(() -> new RuntimeException(
                        String.format("Employee with id: [%s] doesn't exist", employeeId)));
    }
    public EmployeeEntity find(final String name, final String surname) {
        return employeeRepository.findByNameAndSurname(name, surname)
                .orElseThrow(() -> new RuntimeException(
                        String.format("Employee with name: [%s], surname: [%s] doesn't exist", name, surname)));
    }
    public List<EmployeeEntity> findAll() {
        return employeeRepository.findAll();
    }
    @Transactional
    public void delete(final String name, final String surname) {
        employeeRepository.deleteByNameAndSurname(name, surname);
    }
    @Transactional
    public void deleteAll() {
        employeeRepository.deleteAll();
    }
}