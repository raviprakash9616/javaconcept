import java.util.Scanner;
public class hello {
    public static void sumArray(int[] arr, int n) {
        int mini = 0;
        int max=0;
        for (int i = 0; i < n - 1; i++) {
            mini = mini + arr[i];
        }
        for (int i = 0; i < n ; i++) {
            max = max + arr[i];
        }
        System.out.print(mini+" "+max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No Element Of An Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Element Of An Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sumArray(arr, n);
    }
}
