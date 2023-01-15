package payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import payroll.entity.Order;

/**
 * @author Pavel Sharaev (mail@pechhenka.ru)
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}