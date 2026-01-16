public class Main {
    public static void main(String[] args){

        Worker worker1 = new Worker("Bob Dylan", 31, 23500d);
        System.out.println(worker1.getFullName() + " earns " + worker1.getSalary() + " a year.");

    }
}

class Worker {
    private String fullName;
    private int age;
    private double salary;

    public Worker(String fullName, int age, double salary) {
        this.fullName = fullName;
        this.age = age;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
