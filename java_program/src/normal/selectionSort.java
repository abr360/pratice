public class selectionSort {
    public static void main(String[] args) {
        int a[]={10 ,9 ,26 ,29 ,18 ,2 ,20 ,7 ,19 ,15};
        for (int i = 0; i < a.length; i++) {
            for(int j=i+1;j<a.length;j++){
                if(a[i]>=a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            
        }
        System.out.print("The selection sort array :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
            
        }
        System.out.println("");
    }
    
}
