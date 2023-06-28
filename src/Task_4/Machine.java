package Task_4;
/*
Using Intelij IDEA, create a project, package.
(Anew!) Create a class Machine with fields year(int), speed(double), weight(int) color(String).
Create a default constructor, a constructor with 1 parameter, 2nd, 3rd, 4th.
Overload constructors by calling a constructor from a constructor.
Create a Main class, where you can create instances of the Machine class with different parameters.
 */
public class Machine {
    int year;
    double speed;
    int weight;
    String color;

    public Machine() {
        this(7, 154.6, 4260, "Silver"); // call constructor inside another constructor
    }

    public Machine(int year) {

        this.year = year;
        speed = 150;
        weight = 2460;
        color = "White";
    }

    public Machine(int year, double speed) {
        this.year = year;
        this.speed = speed;
        weight = 3560;
        color = "Dark Red";
    }

    public Machine(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        color = "Green";
    }

    public Machine(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
