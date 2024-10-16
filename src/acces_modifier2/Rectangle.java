package acces_modifier2;

public class Rectangle {
    private double length;
    private double height;
    private double area;

    public void setLength(double length){
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than zero");
        }
        this.length = length;
        setArea();
    }

    public void setHeight(double height){
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than zero");
        }
        this.height = height;
        setArea();
    }

    public void setArea(){
        this.area = this.length * this.height;
    }

    @Override
    public String toString() {
        return "Rectangle [length: " + this.length
                + ", height: " + this.height
                + ", area: " + this.area + "]";
    }
}
