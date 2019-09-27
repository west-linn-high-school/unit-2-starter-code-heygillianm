import java.util.Random;

public class PhonenNumber
{
  public static void main (String [] args)
  {
    Random rand = new Random();

    final int DIGIT1GROUP1 = (int)(Math.random()*10+2);
    final int DIGIT2GROUP1 = (int)(Math.random()*9);
    final int DIGIT3GROUP1 = (int)(Math.random()*10);
    final int DIGIT1GROUP2 = (int)(Math.random()*10+2);
    final int DIGIT2GROUP2 = (int)(Math.random()*10);
    final int DIGIT3GROUP2 = (int)(Math.random()*10);
    final int DIGIT1GROUP3 = (int)(Math.random()*10);
    final int DIGIT2GROUP3 = (int)(Math.random()*10);
    final int DIGIT3GROUP3 = (int)(Math.random()*10);
    final int DIGIT4GROUP3 = (int)(Math.random()*10);

    System.out.println("Here is a random phone number:");
    System.out.println( "" + DIGIT1GROUP1 + DIGIT2GROUP1 + DIGIT3GROUP1 + "-" + DIGIT1GROUP2 + DIGIT2GROUP2 + DIGIT3GROUP2 + "-" + DIGIT1GROUP3 + DIGIT2GROUP3 + DIGIT3GROUP3 + DIGIT4GROUP3);

  }
}
