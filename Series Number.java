import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
             int n,i ,sum=0;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the value of n:");
        n=input.nextInt();
        for(i=2;i<=n;i+=2)
        {
            sum=sum+i;
        }
            System.out.println("The summation of series is:"+sum);
                                                                                                                                                                                                                

    }
}
  
