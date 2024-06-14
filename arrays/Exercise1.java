import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];
            
            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }
            
            // Your code goes here
            Boolean flag=true;
            for(int k=1;k<n;k++){
                if(d[k]<d[k-1])
                flag=false;
            }
            System.out.println(flag==true?"yes":"no");
        }
    }
}
