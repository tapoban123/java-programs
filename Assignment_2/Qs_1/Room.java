package Qs_1;

public class Room {
    private float length;
    private float width;
    private float height;

    public Room(float length, float width, float height) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public float getLength() {
        return this.length;
    }

    public float getWidth() {
        return this.width;
    }

    public float getHeight() {
        return this.height;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float calculateSurfaceArea() {
        float surfaceArea = 2 * (this.length * this.width + this.width * this.height + this.height * this.length);
        return surfaceArea;
    }

    public float calculateVolume() {
        float volume = this.length * this.width * this.height;
        return volume;
    }
}