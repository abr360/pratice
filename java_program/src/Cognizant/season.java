
import java.util.Scanner;

public class season {
    public static void main(String[] args) {
        int[] spring={3,4,5};
        int[] summer={6,7,8};
        int[] autumn={9,10,11};
        int[] winter={12,1,2};
        int month;
        Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter the month");
        month=sc.nextInt();
        if((spring[0]==month)||(spring[1]==month)||(spring[2]==month)){
            System.out.println("spring");
        }
        else if((summer[0]==month)||(summer[1]==month)||(summer[2]==month)){
            System.out.println("summer");
        }
        else if((autumn[0]==month)||(autumn[1]==month)||(autumn[2]==month)){
            System.out.println("autumn");
        }
        else if((winter[0]==month)||(winter[1]==month)||(winter[2]==month)){
            System.out.println("winter");
        }
        else{
            System.out.println("invalid");
        }
        sc.close();
    }
}
