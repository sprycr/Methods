public class ClassInfo {
  public static void printCourseHeader(String courseName, String instructor, int hours) {
    System.out.println("================");
    System.out.println("Course:     " + courseName);
    System.out.println("Instructor: " + instructor);
    System.out.println("Credits:    " + hours);
    System.out.println("================");

  }

  public static void main(String[] args) {
    System.out.println();
    printCourseHeader("Math 1061", "Jenna Reis", 4);
    printCourseHeader("IT 1050", "Dr. Jennifer", 2);
  }
}
