package Encapsulation.ClassBox;

public class Box {

    private double length;
    private double width;
    private  double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        if (length <= 0){
            throw new IllegalArgumentException("Length cannot be zero or negative");
        }else {
            this.length = length;
        }

    }

    private void setWidth(double width) {
        if (width <= 0){
            throw new IllegalArgumentException("Width cannot be zero or negative");
        }else {
            this.width = width;
        }

    }

    private void setHeight(double height) {
        if (height <= 0){
            throw new IllegalArgumentException("Height cannot be zero or negative");
        }else {
            this.height = height;
        }

    }

    public double calculateSurfaceArea(){

        // Surface Area = 2lw + 2lh + 2wh
        return (2 * this.length * this.width) + (2 * this.length * this.height) + (2 * this.width * this.height) ;
    }

    public double calculateLateralSurfaceArea(){

        //Lateral Surface Area = 2lh + 2wh
        return (2 * this.length * this.height) + (2 * this.width * this.height);
    }



    public double calculateVolume(){
        //Volume = lwh
        return this.length * this.width * this.height;
    }


}
