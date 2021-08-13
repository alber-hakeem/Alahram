package stores.daily_balances.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stores.daily_balances.entity.Product;

import java.util.Collection;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Collection<Product> getAllByType(String type);
}
