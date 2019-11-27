package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

import java.util.ArrayList;

public abstract class Attraction implements IReviewed, ITicketed {
    private ArrayList<Visitor> visitors;
    private String name;
    private int rating;
    private int visitCount;
    public Double price;

    public Attraction(String name, int rating, Double price) {
        this.name = name;
        this.rating = rating;
        this.visitCount = 0;
        this.visitors = new ArrayList<Visitor>();
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public Double defaultPrice(){
        return price;
    }
}
