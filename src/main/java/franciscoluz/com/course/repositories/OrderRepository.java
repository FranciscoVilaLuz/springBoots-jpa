package franciscoluz.com.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import franciscoluz.com.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}