class PersonalComputer{
    private Computer computer = new Computer();
    private Monitor monitor = new Monitor();
    public void turnOn(){
        computer.turnOn();
        monitor.turnOn();
    }
    public void printInfo(){
        computer.printInfo();
        monitor.printInfo();
    }
}
class Monitor{
    private String monitor = "32 inch";
    private String color = "Black";
    private String power = "45W";
    public void turnOn(){ System.out.println("Turning on the monitor."); }
    public void printInfo(){
        System.out.println("The spec of the monitor");
        System.out.println(" Size: "+ monitor);
        System.out.println(" Color: "+ color);
        System.out.println(" Power: "+ power);
    }
}
class Computer{
    private String cpu = "Core i7";
    private String memory = "32GB";
    private String hd = "2TB";
    private String color = "White";
    private String power = "700W";
    public void turnOn(){ System.out.println("Turning on the computer."); }
    public void printInfo(){
        System.out.println("The spec of the computer");
        System.out.println(" CPU: "+ cpu);
        System.out.println(" Memory: "+ memory);
        System.out.println(" HDD: "+ hd);
        System.out.println(" Color: "+ color);
        System.out.println(" Power: "+ power);
    }
}
public class Homework5 {
    public static void main(String[] args){
        PersonalComputer pc = new PersonalComputer();
        pc.turnOn();
        pc.printInfo();
    }
}