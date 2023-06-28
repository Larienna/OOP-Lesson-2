package Task_5;
/*
Using Intelij IDEA, create a project, package.
Create the class MyArea, declare the constant PI = 3.14 in it and the static method areaOfCircle,
which should accept the radius and calculate the area of the circle using PI.
Create a Main class to run this method.
 */
public class MyArea {
    static final float PI = 3.14F; // create constant Pi
    int radius;

    static double areaOfCircle(int radius) {
        double area = PI * (radius * radius);
        return area;
    }
}
