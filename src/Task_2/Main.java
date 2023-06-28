package Task_2;

public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine(6, "Black");   // create class instances
        Machine machine1 = new Machine(3, "White");
        Machine machine2 = new Machine();                       // default
        Machine machine3 = new Machine(8);                 // create class instances with 1 parameter

        System.out.println(machine.colour + " " + machine.year);
        System.out.println(machine1.colour + " " + machine1.year);
        System.out.println(machine2.colour + " " + machine2.year);
        System.out.println(machine3.colour  + " " + machine3.year);

    }
}