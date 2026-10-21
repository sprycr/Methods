public class DoubleANumber {
  public static void tryToDouble(int number) {
    number = number*2;
    System.out.println("Inside method " + number);
  }
  public static int doubled(int number) {
    number = number * 2;
    return number;
  }

  public static void main(String[] args) {
    int myNum = 5;
    tryToDouble(5);
    System.out.println("After method " + myNum);
    System.out.println(doubled(myNum));
  }
}
