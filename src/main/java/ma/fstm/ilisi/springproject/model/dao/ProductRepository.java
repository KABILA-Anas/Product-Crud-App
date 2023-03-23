package ma.fstm.ilisi.springproject.model.dao;

import ma.fstm.ilisi.springproject.model.bo.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}