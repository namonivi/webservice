package pizzaloop;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class pizzaDetails {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int PizzaId;
    private String name;
    private String img_url;
    private double price;

    public int getPizzaId() {
        return PizzaId;
    }

    public void setPizzaId(int pizzaId) {
        PizzaId = pizzaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
