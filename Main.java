import java.util.Scanner;

public class Main{
  public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("1.Unisex \n2.Women \n3.Men \n4.Children \n5.Infants \nPick a category:");

    int category = scanner.nextInt();

    scanner.close();
    
  }
}
