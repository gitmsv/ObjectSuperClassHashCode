package ua.jvdevpro.smlnk;

public class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWedht() {
        return width;
    }

    public void setWedht(double width) {
        this.width = width;
    }


    Rectangle(double length, double wedht) {
        this.length = length;
        this.width = wedht;
    }

    Rectangle() {
        super();
    }

    @Override
    public String toString() {
        return ("Rectangle: " + "length = " + length + " , " + "width = " + width);
    }

    @Override
    public void finalize() {
        System.out.println("Rectange destroed!!");
    }

    // Переопределенный метод equals() для сравнения по свойству класса (длинна и ширина);

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rectangle other = (Rectangle) obj;
        if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
            return false;
        if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
            return false;
        return true;

    }

    // хеш-код вычисляется на основании свойств класса;
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(length);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

}
