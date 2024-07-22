import java.util.Scanner;

/**
 * pallindrome
 */
public class pallindrome {

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n,rev=0;
        while(n!=0)
        {
            int rem=n%10;
            rev=(rev*10)+rem;
            n/=10;

        }
        System.out.println(temp==rev?"Pallindrome":"Not a pallindrome");

    }
}