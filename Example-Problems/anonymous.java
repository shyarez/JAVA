//Q5- WAP to see an anonymous array
public class anonymous {
    static void print_array(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String args[]){
    print_array(new int[] {11,22,33,44});
    }
    
}
