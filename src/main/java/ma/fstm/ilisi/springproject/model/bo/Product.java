package ma.fstm.ilisi.springproject.model.bo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Product {
    private Long id;
    private String name;
    private String brand;
    private String madein;
    private double price;
    public Product() {
    }

    public Product(Long id, String name, String brand, String madein, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.madein = madein;
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getMadein() {
        return madein;
    }

    public double getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMadein(String madein) {
        this.madein = madein;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // other getters and setters are hidden for brevity
}