public class Employee extends Person{
    private String position;
    private double salary; //adding only two unique variables

    public Employee(String name, String surname, String position, double salary){
        super(name, surname); //Taking some data from person class
        this.position = position;
        this.salary = salary;
    }

    public String toString(){
        return "Employee: " + super.toString(); //inherited fu
    }

    public String getPosition(){
        return position;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(){
        this.salary = salary;
    }

    public double getPaymentAmount(){
        return getSalary();
    }
}