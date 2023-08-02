package zajavka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zajavka.business.EmployeeService;
import zajavka.infrastructure.configuration.ApplicationConfiguration;

public class EmployeeRunner {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        EmployeeService employeeService = context.getBean(EmployeeService.class);

    }
}
