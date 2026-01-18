public class Main {
    public static void main(String[] args){

        Book book1 = new Book(10, 50, 0, 5, 100, 5);

        book1.displaySales();


    }
}

class Book {
    private int totalSold;
    private double totalSales;
    private double totalDiscounts;
    private double itemCost;
    private int quantity;
    private int bulkDiscount;

    public Book(int totalSold, double totalSales, double totalDiscounts, double itemCost, int quantity, int bulkDiscount) {
        this.totalSold = totalSold;
        this.totalSales = totalSales;
        this.totalDiscounts = totalDiscounts;
        this.itemCost = itemCost;
        this.quantity = quantity;
        this.bulkDiscount = bulkDiscount;
    }

    public int getBulkDiscount() {
        return bulkDiscount;
    }

    public void setBulkDiscount(int bulkDiscount) {
        this.bulkDiscount = bulkDiscount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public double getTotalDiscounts() {
        return totalDiscounts;
    }

    public void setTotalDiscounts(double totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }

    public void registerSales(int n){
        if(n <= 0){
            System.out.println("Invalid item count");;
        }
        double currentSale = 0;
        double currentDiscount = 0;

        if ( n >= this.quantity) {
            currentSale = n * this.itemCost * (1 - this.bulkDiscount);
            currentDiscount = (n * this.itemCost) - currentSale;
        } else {
            currentSale = n * this.itemCost;
        }

        this.totalSales += currentSale;
        this.totalSold += n;
        this.totalDiscounts += currentDiscount;
    }

    public void displaySales(){
        System.out.println("Total items sold: " + this.totalSold);
        System.out.println("Gross profit: " + this.totalSales);
        System.out.println("Total discout: " + this.totalDiscounts);
    }
}
