package ie.atu.week5;


import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
@Data
@Service
public class ProductService {

    private List<Product> productList = new ArrayList<>();
    public List<Product> getAllProducts() {
        return productList;
    }
    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }
}
