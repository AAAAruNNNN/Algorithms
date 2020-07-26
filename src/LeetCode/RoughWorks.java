package LeetCode;

import java.math.BigInteger;
import java.util.Arrays;

public class RoughWorks {
		public static void main(String args[])
		{
			int a = 0;
			int[] arr = {1,1,1,1,1};
			for (int i : arr)
				a ^= i;
			System.out.println(a);
			
			String s = "Hello";
			System.out.println(s.lastIndexOf("l"));
			for(char c = 'a'; c<'z'; c++)
				System.out.print(c);
//	        Regex rgx = new Regex("[^a-zA-Z0-9]");
	        System.out.println((int) '1');
	        System.out.println((int) '2');
	        
	        BigInteger bi1 = new BigInteger("314159265358979323847942847294724794724724727427424924724213284568365865428653852856562385685628356283563285638562365835778563865853827568563856285635846328563562856928365836575646587629638837653876475836583257834756356237658374745634858235683658475682943875638537562398345638475688347563459283474754665883348756382859465762643383279502884197169399375105820974944592"); 
	        BigInteger bi2 = new BigInteger("2718281828459045235360287471352662497757247093699959574966967627"); 

	        //BigInteger bigSum = bi1.add(bi2);

	        BigInteger bigProduct = bi1.multiply(bi2);

	        //System.out.println("Sum : " + bigSum);
	        System.out.println("Product : " + bigProduct);
	        //if(Math.ceil(3/2.) > 4)
	        System.out.println(1<<2);
	        System.out.println(Integer.toBinaryString((1<<2)-1));
	        System.out.println(6&4);
	        int t = 't';
	        if(t == 't')
	        	System.out.println("t is 't'" + true);
	        System.out.println('a'+1);
	        int[] vote = new int[5];
	        System.out.println(Arrays.toString(vote));
//	        
//	        String L43 = "String";
//	        String L44 = "String";
//	        L44 = 
	        char characterdigit = '1';
	        if(characterdigit == '1')
	        	System.out.println(Character.toUpperCase(characterdigit));
	        
		}
}
