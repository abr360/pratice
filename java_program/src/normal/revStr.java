public class revStr{
    public static void main(String[] args) {
        String a="hello";
        String revStr = "";
        for(int i =a.length() - 1;i>=0;i--){
            revStr += a.charAt(i);
        }
        System.out.println(revStr);
    }
}