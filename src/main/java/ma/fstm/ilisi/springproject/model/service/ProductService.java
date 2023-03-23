package ma.fstm.ilisi.springproject.model.service;

import java.util.List;
import java.util.Optional;

import ma.fstm.ilisi.springproject.model.bo.Product;
import ma.fstm.ilisi.springproject.model.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository repo;
    public List<Product> listAll(){
        return repo.findAll();
    }
    public void save(Product product) {
        repo.save(product);
    }
    public void delete(long id) {
        repo.deleteById(id);
    }
    public Optional<Product> get(Long id) {
        return repo.findById(id);
    }
}
