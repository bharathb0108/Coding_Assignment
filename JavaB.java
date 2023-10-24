/* Enter a Roman Number as input and convert it to an integer. (ex IX = 9). */
import java.util.*;
public class JavaB{
	int input(char i)
	{   
	    if (i == 'I')
			return 1;
		if (i == 'V')
			return 5;
		if (i == 'X')
			return 10;
		if (i == 'L')
			return 50;
		if (i == 'C')
			return 100;
		if (i == 'D')
			return 500;
		if (i == 'M')
			return 1000;
		return -1;
	}
	int romanToInt(String str)
	{
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			int s1 = input(str.charAt(i));

			if (i + 1 < str.length()) {
				int s2 = input(str.charAt(i + 1));
				if (s1 >= s2) {
					result = result + s1;
				}
				else {
					result = result + s2 - s1;
					i++;
				}
			}
			else {
				result = result + s1;
			}
		}
		return result;
	}

	public static void main(String args[])
	{
		JavaB obj = new JavaB();
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Roman Numeral String: \n");  
        String str= sc.nextLine();
		System.out.println("Integer Equivalent of Roman Numeral is: "
						+ obj.romanToInt(str));
	}
}
