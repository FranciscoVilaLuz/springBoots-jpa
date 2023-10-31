package franciscoluz.com.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import franciscoluz.com.course.entities.OrderItem;
import franciscoluz.com.course.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{		

	
	
}
