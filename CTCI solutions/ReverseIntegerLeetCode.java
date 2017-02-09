import java.util.*;
// Line 18: java.lang.NumberFormatException: For input string: "9646324351"
// 2147483647
public class ReverseIntegerLeetCode 
{
    public static int reverse(int x) {
		int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);
		int INT_MAX = Integer.MAX_VALUE;
        int res = 0;
        while (x > 0) {
			if (INT_MAX / 10 < res || (INT_MAX - x % 10) < res * 10) {
                return 0;
            }
            res = res * 10 + x % 10;
			x /= 10;
        }
        
        return sign * res; 
    }
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int answer = reverse(number);
		System.out.println("answer::"+answer);
	}
}