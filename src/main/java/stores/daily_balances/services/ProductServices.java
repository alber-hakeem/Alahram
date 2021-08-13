package stores.daily_balances.services;

import stores.daily_balances.entity.Product;

import java.util.Collection;

public interface ProductServices {

    Collection<Product> getAllProducts();
    Collection<Product> getProductsByType(String type);
}
