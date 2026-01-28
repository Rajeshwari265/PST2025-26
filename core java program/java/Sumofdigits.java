package PST;
import java . util.Scanner;
public class Sumofdigits {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int num = Sc.nextInt();
		int sum = 0;
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("sum of the digits"+sum);

	}

}
