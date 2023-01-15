package payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import payroll.entity.Employee;

/**
 * @author Pavel Sharaev (mail@pechhenka.ru)
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
