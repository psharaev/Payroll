package payroll;

/**
 * @author Pavel Sharaev (mail@pechhenka.ru)
 */
public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(final Long id) {
        super("Could not find employee " + id);
    }
}
