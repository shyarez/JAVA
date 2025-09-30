//Q4- WAP to find the sum of 2 array
public class sum2array{
    public static void main(String args[]) {
        int a[] = {10,20,30};
        int b[] = {40,50,60};
        int c[] = new int[a.length];

        for (int i=0;i<a.length;i++) {
            c[i]=a[i]+b[i];
        }

        System.out.println("\nA:");
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+"\t");
        }
        System.out.println("\nB:");
        for(int i=0;i<b.length;i++) {
            System.out.print(b[i]+"\t");
        }

        System.out.println("\nsum of A & B:");
        for(int i=0; i<c.length;i++) {
            System.out.print(c[i]+"\t");
        }
    }
}
