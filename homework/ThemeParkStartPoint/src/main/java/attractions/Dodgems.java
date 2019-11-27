package attractions;

import people.Visitor;

public class Dodgems extends Attraction {

    public Dodgems(String name, int rating, Double price) {
        super(name, rating, price);
    }

    @Override
    public Double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12){
            return price / 2;
        }
        return price;
    }
}
