package ie.atu.week5;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    private List<Product> products = new ArrayList<>();


    @GetMapping("/getProducts")
    public List<Product> getProducts()
    {
        return products;
    }

    @PostMapping("/addProduct")
    public ResponseEntity<List> addProduct(@RequestBody Product product)
    {
        products.add(product);
        return ResponseEntity.ok(products);
    }

    @PutMapping("/{id}")
    public ResponseEntity<List> editProduct(@PathVariable int id, @RequestBody Product product)
    {
        for(int i = 0; i< products.size(); i++){
            if(products.get(i).getId() == id){
                products.set(i, product);
            }
        }
        return ResponseEntity.ok(products);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<List> deleteProduct(@PathVariable int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(id);
            }
        }
        return ResponseEntity.ok(products);
    }
}
