package Task_4;

public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine();                                               // default
        Machine machine1 = new Machine(8);                                        // create class instances with 1 parameter
        Machine machine2 = new Machine(3, 320);                             // create class instances with 2 parameters
        Machine machine3 = new Machine(6, 230, 1200);                // create class instances with 3 parameters
        Machine machine4 = new Machine(15, 180, 2000, "Grey");  // full parameters class

        System.out.println("Year: " + machine.year + " Speed: " + machine.speed + " Weight: " + machine.weight + " Colour: " + machine.color);
        System.out.println("Year: " + machine1.year + " Speed: " + machine1.speed + " Weight: " + machine1.weight + " Colour: " + machine1.color);
        System.out.println("Year: " + machine2.year + " Speed: " + machine2.speed + " Weight: " + machine2.weight + " Colour: " + machine2.color);
        System.out.println("Year: " + machine3.year + " Speed: " + machine3.speed + " Weight: " + machine3.weight + " Colour: " + machine3.color);
        System.out.println("Year: " + machine4.year + " Speed: " + machine4.speed + " Weight: " + machine4.weight + " Colour: " + machine4.color);

    }
}
