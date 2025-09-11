package Qs_2;

public class Shape {
    public float calcArea(float side) {
        return side * side;
    }

    public int calcArea(int length, int breadth) {
        return length * breadth;
    }

    public float calcArea(float base, float height) {
        return (base * height) / 2;
    }
}
