package balanced.brackets;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public String isBalanced(String brackets) {

		Stack<String> stack = new Stack<>();
		Map<String, String> match = new HashMap<>();
		match.put("]", "[");
		match.put(")", "(");
		match.put("}", "{");

		for (int i = 0; i < brackets.length(); i++) {
			if (match.values().contains("" + brackets.charAt(i))) {
				stack.push("" + brackets.charAt(i));

			} else {
				if (stack.size() <= 0 || !stack.pop().equals(match.get("" + brackets.charAt(i)))) {
					System.out.println("NO");
					return "NO";
				}
			}
		}
		
		if(stack.size()>0){
			System.out.println("NO");
			return "NO";
		}
		
		System.out.println("YES");
		return "YES";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BalancedBrackets bb = new BalancedBrackets();
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String s = in.next();
			bb.isBalanced(s);
		}
	}

}
