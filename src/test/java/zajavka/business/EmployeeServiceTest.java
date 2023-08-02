package zajavka.business;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import zajavka.infrastructure.configuration.ApplicationConfiguration;
import zajavka.infrastructure.database.model.EmployeeEntity;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

@SpringJUnitConfig(classes = {ApplicationConfiguration.class})
class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    void firstTestForEmployeeFunctionality() {
        // given
        employeeService.create(someEmployee());
        // when
        List<EmployeeEntity> allEmployees = employeeService.findAll();
        // then
        Assertions.assertEquals(1, allEmployees.size());
    }
    private EmployeeEntity someEmployee() {
        return EmployeeEntity.builder()
                .name("Tomek")
                .surname("Romek")
                .salary(BigDecimal.valueOf(9547.11))
                .since(ZonedDateTime.now())
                .build();
    }

}