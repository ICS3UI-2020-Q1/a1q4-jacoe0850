import java.util.Scanner;
/**
 *
 * @jacoe0850 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // asking for all the points and initiating their variables
    System.out.println("Please enter in the x coordinate of the first point");
    int x1 = input.nextInt();
    System.out.println("Please enter in the y coordinate of the first point");
    int y1 = input.nextInt();
    System.out.println("Please enter in the x coordinate of the second point");
    int x2 = input.nextInt();
    System.out.println("Please enter in the y coordinate of the second point");
    int y2 = input.nextInt();
    // calculating the slope and initiating variable slope
    int slope = (y2 - y1) / (x2 - x1);
    // saying the slope
System.out.println("The slope of your line would be " + slope + ".");
  }
}
