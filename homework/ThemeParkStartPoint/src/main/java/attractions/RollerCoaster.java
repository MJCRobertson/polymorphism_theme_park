package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

    private Visitor visitor;

    public RollerCoaster(String name, int rating, Double price) {
        super(name, rating, price);
    }

    public Boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 145){
            return true;
        }
        return false;
    }

    public Double priceFor(Visitor visitor) {
        if (visitor.getHeight() >= 200){
            return price * 2;
        }
        return price;
    }
}
