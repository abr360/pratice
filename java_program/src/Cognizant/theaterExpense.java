import java.util.Scanner;
public class theaterExpense {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pizza=100;
        int puffs=25;
        int cool_Drink=10;
        
        System.out.print("Enter the number of pizza :");
        int n=sc.nextInt();
        System  .out.print("\nEnter the number of puffs :");
        int m=sc.nextInt();
        System.out.print("\nEnter the number of cool drinks :");
        int k=sc.nextInt();
        int total=(pizza*n)+(puffs*m)+(cool_Drink*k);
        System.out.println("The no of pizza bought:"+n);
        System.out.println("The no of puffs bought:"+m);
        System.out.println("The no of cool drinks bought:"+k);
        System.out.println("Total Price :"+total);
        System.out.println("Enjoy the Show !!!");
    }
} 
 