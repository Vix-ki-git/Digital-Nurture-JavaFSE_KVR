import java.util.List;
import java.util.ArrayList;

public class StockMarket implements Stock {
    private List <Observer> olist = new ArrayList<>();
    private String name;
    private double price;

    public void setStock(String name, double price) {
        this.name = name;
        this.price = price;
        notifyObservers();
    }
    public void register(Observer o) {
        olist.add(o);
    }
    public void deregister(Observer o) {
        olist.remove(o);
    }

    public void notifyObservers() {
        for(Observer o: olist) {
            o.update(name, price);
        }
    }
}