package shapes;

public class Square extends Quadrilateral {

    protected double side;

    public Square(double side) {
        super(side, side );
        this.side = side;
    }
//    protected int side;
//    public Square(int side){
//        super(side, side);
//        this.side = side;
// }
//
//    public int getArea(){
//        return side * side;
//    }
//
//    public int getPerimeter(){
//        return 4*side;
//    }


@Override
public double getPerimeter() {
        double perimeter = (side * 4);
        return perimeter;
}

    @Override
    public double getArea() {
        double area = side * side;
        return area;
    }

}
