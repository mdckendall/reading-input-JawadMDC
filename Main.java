import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner newScanner = new Scanner(System.in);
    System.out.println("Enter a word:");
    String newString = newScanner.nextLine();
    
    //Your code will return the length of the entered String
    newScanner.close();
    System.out.println(newString.length());
  }
}
