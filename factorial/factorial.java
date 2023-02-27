import java.util.*;
public class factorial {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int factorial=1;
        for(int i=number; i>0; i--){
            factorial = factorial*i;
        }
        System.out.println("Factorial is : "+factorial);
        }
}