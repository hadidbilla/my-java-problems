public class Functionprb_1 {
        double Area;

    double mathod (double radius)
        {
            Area=3.1416*radius*radius;
            return Area;
        }

        public static void main(String[] args) {
            Functionprb_1 p1=new Functionprb_1();
            System.out.println("Area of a circle :"+p1.mathod(7.0));
        }
}
