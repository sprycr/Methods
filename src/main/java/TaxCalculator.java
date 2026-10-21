public class TaxCalculator {
  public static double calculateTax(double itemPrice, double taxRate) {
    double tax = itemPrice * taxRate;
    return tax;
  }

  public static String calculateBracket(double salary) {
    String bracket="";
    if (salary>= 10000){
      bracket = "Group A";
    }
    else {
      bracket = "Group B";
    }
    return bracket;
  }

  public static void main(String[] args) {
    double itemPrice= 57.89;
    double taxRate = 0.05;
    double tax = calculateTax(itemPrice, taxRate); //catch the returned value
    System.out.println("Item price: " + itemPrice);
    System.out.println("The tax is " + tax);
    String myBracket = calculateBracket(12000);
    System.out.println("The salary bracket is " + myBracket);
  }
}
