package franciscoluz.com.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import franciscoluz.com.course.entities.Category;
import franciscoluz.com.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{		

	
	
}
