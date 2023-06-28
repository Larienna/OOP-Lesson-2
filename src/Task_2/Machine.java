package Task_2;
/*
Using IntelliJIDEA, create a project, package. Create a class Machine with fields year(int), color(String).
Create a default constructor, a constructor with 1 and 2 parameters.
Create a Main class in which to create instances by calling various constructors.
 */
public class Machine {
    int year;
    String colour;

    // calling different constructors.
    public Machine() {          // default
    this.year =3;
    this.colour = "Gold";
    }

    public Machine(int year) {  // with 1 parameter
        this.year = year;
        this.colour = "Yellow";
    }

    public Machine(int year, String colour) { // all parameters
        this.year = year;
        this.colour = colour;
    }
}
