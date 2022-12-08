package sophosfinalchallenge.bootcamp.FCS.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sophosfinalchallenge.bootcamp.FCS.entity.Product;
import sophosfinalchallenge.bootcamp.FCS.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImplementation implements  ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);

    }

    @Override
    public boolean deleteProductById(Long id) {
        return getProductById(id).map(product -> {
            productRepository.deleteById(id);
            return true;
        }).orElse(false);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }
}
