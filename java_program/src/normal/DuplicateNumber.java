import java.util.HashMap;
import java.util.Map;

public class DuplicateNumber {

    public static void main(String[] args) {
        int a[]={4,5,3,4,8,3,8};
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        for (int i = 0; i < a.length; i++) {
            if (m.containsKey(a[i])) {
                m.put(a[i],m.get(a[i])+1);
            }
            else{
              m.put(a[i], 1);
            }
            
        }
        System.out.print("The Duplicated number for arrays are :");
        for(Map.Entry<Integer,Integer> entry:m.entrySet()){
            if(entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
            }
        }
        System.out.println("");
    }
}

