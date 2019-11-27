package attractions;

import people.Visitor;

public class Park extends Attraction {

    public Park(String name, int rating, Double price) {
        super(name, rating, price);
    }

    @Override
    public Double priceFor(Visitor visitor) {
        return 0.00;
    }
}
