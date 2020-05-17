package VendingMachine;

public class MainCharacter {
    private int age = 30;
    private String name = "Bob";
    private String occupation = "Software Developer";
    private double money = 1000.00;

    public MainCharacter() {

    }

    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
