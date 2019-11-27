package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    private Visitor visitor;

    public Playground(String name, int rating, Double price) {
        super(name, rating, price);
    }

    public Boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() <= 15){
            return true;
        }
        return false;
    }

    @Override
    public Double priceFor(Visitor visitor) {
        return price;
    }
}
