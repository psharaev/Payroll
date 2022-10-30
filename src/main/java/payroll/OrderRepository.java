package payroll;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Pavel Sharaev (mail@pechhenka.ru)
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}