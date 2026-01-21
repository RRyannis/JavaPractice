import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SalesAssociate[] workforce = new SalesAssociate[3];
        for (int i = 0; i < workforce.length; i++){
            workforce[i] = new SalesAssociate("Jane Doe", 5000);
        }
        for (SalesAssociate salesperson: workforce){
            salesperson.writeOutput();
        }
    }
}

class SalesAssociate{
    private String name;
    private double sales;

    public SalesAssociate(String name, double sales){
        this.name = name;
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
    public void readInput(){
        System.out.print("Enter the name of a sales associate: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        System.out.print("Enter the associate's sales record: ");
        sales = scanner.nextDouble();
    }
    public void writeOutput(){
        System.out.println("Name: " + name);
        System.out.println("Sales: " + sales);
    }
}
