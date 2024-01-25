public class Person implements Payable, Comparable<Person>{
    private static int counterID = 0;

    private int id;
    private String name;
    private String surname;

    public Person() {
        this.id = ++counterID;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String Name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String Name){
        this.surname = surname;
    }

    public String toString(){
        return getId() + ". " + getName() + " " + getSurname();
    } //collect all data to one string

    public String getPosition(){
        return "Student";
    }

    public double getPaymentAmount() {
        return 0.00;
    }

    @Override
    public int compareTo(Person o){
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }
}