package zajavka.business;

import zajavka.infrastructure.database.model.EmployeeEntity;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

class EmployeeData {

    static EmployeeEntity someEmployee1() {
        return EmployeeEntity.builder()
            .name("Agnieszka")
            .surname("Pracownik")
            .salary(new BigDecimal("5910.73"))
            .since(ZonedDateTime.now())
            .build();
    }

    static EmployeeEntity someEmployee2() {
        return EmployeeEntity.builder()
            .name("Stefan")
            .surname("Nowacki")
            .salary(new BigDecimal("3455.12"))
            .since(ZonedDateTime.now())
            .build();
    }

    static EmployeeEntity someEmployee3() {
        return EmployeeEntity.builder()
            .name("Tomasz")
            .surname("Adamski")
            .salary(new BigDecimal("6112.42"))
            .since(ZonedDateTime.now())
            .build();
    }
}
