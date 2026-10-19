public class Greeter {
  public static void greetStudent(String name) {
    System.out.println("Welcome to the class, " + name + "!");
    System.out.println("Let's write some Java today.");
    System.out.println("----------------------------");
  }

  public static void main(String[] args) {
    System.out.println();
    greetStudent("Gianni");
    greetStudent("Caroline");
    greetStudent("Jazmir");

  }
}
