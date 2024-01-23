/**
 * Armstrong_number
 */
public class Armstrong_number {

  public static void main(String[] args) {
    int n=3711;
    int n1 =n;
    int power =0;
    int sum=0;
    while (n1!=0) {
      power++;
      n1/=10;
    }
    n1=n;
    while (n1!=0) {
      sum+=(int)Math.pow(n1%10,power);
      n1/=10;
    }
    if (sum==n) {
      System.out.println(n+" is armstrong number");
    
    }
    else
    System.out.println(n+" not armastrong number");
  }
}