package exercise5;

/**
 * Class Company
 * Task 4: Create a class Company with the following private data members: String name, double stockPrice. Implement a setter method for the stockPrice.
 * @author mngonk01
 */
public class Company {
    private String name;
    private double StockPrice;
    
    public Company(String name, double StockPrice){
            this.name = name;
            this.StockPrice = StockPrice;
}

public String getName(){
    return name;
} 
public double getStockPrice(){
    return StockPrice;
}
public void setStockPrice(double StockPrice){
    this.StockPrice = StockPrice;
}
@Override
public String toString() {
        return "Company{" + "name=" + name + ", StockPrice=" + StockPrice + '}';
    }
}
