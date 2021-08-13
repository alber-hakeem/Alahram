package stores.daily_balances.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stores.daily_balances.entity.Product;
import stores.daily_balances.repository.ProductRepository;

import java.util.Collection;

@Service
public class ProductServiceImpl implements ProductServices{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Collection<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Collection<Product> getProductsByType(String type) {
        return productRepository.getAllByType(type);
    }
}
