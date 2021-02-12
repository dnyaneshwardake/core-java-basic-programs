package com.dnyanesh.fang.codes;

public class Test {
	public boolean balancedCheck(char[] expr) {
		Stack s = new Stack();
		for(int i=0; i<expr.length; i++) {
			if(expr[i]=='(') {
				s.push(expr[i]);
			}
			else if(expr[i] == ')') {
				int t=s.top();
				if(t == -1 || t != expr[i]) {
					return false;
				}
			}
			else {
				s.pop();
			}
		}
		if(s.top()==0){
			return true;
		}
	return true;
	}
	public static void main(String[] args) {
		String exp = "(())";
		char[] expr = exp.toCharArray();
		Test t = new Test();
		System.out.println(t.balancedCheck(expr));
	}
}