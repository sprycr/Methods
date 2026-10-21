public class AreaCalculator {
  //calculate the area of a square
  public static double calculateArea(double side) {
    return side*side;
  }
  //calculate are of a rectangle
  public static double calculaterea(double length, double width) {
    return length * width;
    //this works because the number of parameters are different
  }
  //calculate area of a circle
  //public static double calculateArea(double radius) {
    //return 3.14259*radius*radius;
    //this doesn't work because the type and number of parameters is the same
  //}
  //calculate area of a circle
  public static double calculateArea(double radius, boolean isCircle) {
    if (isCircle){
      return Math.PI*radius*radius;
    }
    return 0;
    //this works because the number of parameters is the same, but the **type** of the parameters is different.
  }

  public static void main(String[] args) {
    System.out.println(calculateArea(5));
    System.out.println(calculaterea(10,13));
    System.out.println(calculateArea(12,true));
  }
}
