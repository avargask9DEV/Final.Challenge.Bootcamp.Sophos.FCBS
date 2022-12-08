package sophosfinalchallenge.bootcamp.FCS.service;

import sophosfinalchallenge.bootcamp.FCS.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {


    public Product createProduct(Product product);

    public List<Product> getAllProducts();

    public Optional<Product> getProductById(Long id);

    public boolean deleteProductById(Long id);


}
