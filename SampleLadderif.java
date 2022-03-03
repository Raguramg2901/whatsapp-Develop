package org.test;

public class SampleLadderif {
	public static void main(String[] args) {
		int a = 100, b = 200, c = 500, d= 800;
		if (a>b & a>c & a>d) {
			System.out.println("A is Greater");
			
		}
		else if (b>a & b>c & b>d) {
			System.out.println("B is Greater ");
			
		}
		else if (c>a & c>b & c>d) {
			System.out.println("C is greater");
			
		}
		else {
			System.out.println("D is greater");
		}
		
		
	}

}
