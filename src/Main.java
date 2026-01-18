public class Main {
    public static void main(String[] args){

        Book book1 = new Book(10, 50, 0, 10, 5, 0.05);
        book1.registerSales(45);
        book1.displaySales();


    }
}

class Book {
    private int totalSold;
    private double totalSales;
    private double totalDiscounts;
    private double itemCost;
    private int bulkQuantity;
    private double bulkDiscount;

    public Book(int totalSold, double totalSales, double totalDiscounts, double itemCost, int quantity, double bulkDiscount) {
        this.totalSold = totalSold;
        this.totalSales = totalSales;
        this.totalDiscounts = totalDiscounts;
        this.itemCost = itemCost;
        this.bulkQuantity = quantity;
        this.bulkDiscount = bulkDiscount;
    }

    public double getBulkDiscount() {
        return bulkDiscount;
    }

    public void setBulkDiscount(int bulkDiscount) {
        this.bulkDiscount = bulkDiscount;
    }

    public int getBulkQuantity() {
        return bulkQuantity;
    }

    public void setBulkQuantity(int bulkQuantity) {
        this.bulkQuantity = bulkQuantity;
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
            System.out.println("Invalid item count");
            return;
        }
        double currentSale = 0;
        double currentDiscount = 0;

        if ( n >= this.bulkQuantity) {
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
        System.out.println("Total discount: " + this.totalDiscounts);
    }
}
