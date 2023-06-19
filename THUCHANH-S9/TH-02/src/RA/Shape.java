package RA;

public class Shape {
    public String color = "red";
    public  boolean status = true;

    public Shape() {
    }

    public Shape(String color, boolean status) {
        this.color = color;
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", status=" + status +
                '}';
    }
}
