package shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        //Box 1
//    Rectangle box1 = new Rectangle(4, 5);
//    // Verifying that the area and perimeter is returning properly
//        System.out.println("The area is: " + box1.getArea());
//        System.out.println("The perimeter is: " + box1.getPerimeter());
//
//        //Box 2
//    Rectangle box2 = new Square(5);
//        System.out.println("The area is: " + box2.getArea());
//        System.out.println("The perimeter is: " + box2.getPerimeter());
//    }
        Measurable myShape;
        Square box1 = new Square(5);
        System.out.println("box1 = " + box1.getArea());
        System.out.println("box1 = " + box1.getPerimeter());

        Rectangle box2 = new Rectangle(5, 8);
        System.out.println("box1 = " + box2.getArea());
        System.out.println("box1 = " + box2.getPerimeter());
    }
}
