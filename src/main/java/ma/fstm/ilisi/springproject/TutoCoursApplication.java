package ma.fstm.ilisi.springproject;

import ma.fstm.ilisi.springproject.model.bo.Product;
import ma.fstm.ilisi.springproject.model.dao.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TutoCoursApplication {


    public static void main(String[] args) {
        SpringApplication.run(TutoCoursApplication.class, args);
    }
    /*@Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(new Product(null, "test2", "test2", "test2", 2000));
        };
    }*/
}
