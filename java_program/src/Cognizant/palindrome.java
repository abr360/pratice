public class palindrome {
    public static void main(String[] args) {
        int a=21212;
        int temp=a;
        int digit=0;
        while(temp>0){
            int sum=temp%10;
            digit=digit*10+sum;
            temp=temp/10;
        }
        System.out.println("The given number "+((a==digit)? a+" is palindrome":a+" is not plaindrome"));
    }
}
