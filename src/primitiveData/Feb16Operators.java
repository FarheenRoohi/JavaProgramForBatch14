package primitiveData;

public class Feb16Operators {

	public static void main(String[] args) {
		//Logic operators:-&&(and and,|| (or),
//&& and operator will return if both left and right sides are true
		//True True = true,
		//true False = false,
		//false true = False,
		//False false = False,
		int a = 20;
		int b = 30;
		int c = 40;
		System.out.println(a>b&&a>c);
		System.out.println(a<b&&b<c);
		System.out.println( a<b&&b>c);
		System.out.println(a>b&&b<c);
		// logical || (or)will return true if one of the value is true.
		//true false = true
		//false true = true
		//true true = true
		//false false = false
		System.out.println(a>b||b>c);
		System.out.println(c>b||a>c);
		System.out.println(c>a||c>b);
		System.out.println(b<a||b<c);
		//conditional operator :- ? :(question mark ,colon)
		int d = a>b?a:b;
		int e = a<b?a:b;
		int f = a>c?a:c;
		int g = c>a?a:b;
		int h = c>b?a:b;
		int j = b>c?b:c;
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(j);
		//Bitwise operator:- & | ^ << >> operators ,& (and),|(or)operator, ^ (x or)operator,<< (left shift),right shift operator >>
		// single & operatoeit will return true if both the numbers are 1.
		System.out.println(3&7);
		//| logical (or0 operator.
		// it will return true if one of the value is 1.
		System.out.println(3|5);
		// ^ (x or operator) it will return 1 if both number is not match.
		System.out.println(4^7);
		// left shift << operator :- it will shift two digits  from left side to right side by taking value as 00.
		
		//eg:- 5<<2
		//     4<<3
		System.out.println(5<<2);
		System.out.println(4<<3);
		//right shift  operator <<it will shift two digits from from right side  to left side by taking value as 00.
		System.out.println(5>>1);
		System.out.println(5>>2);
		System.out.println(7>>3);
		//Compound Assigning the operator:-   += , _= , *= , /= , %(reminder)%= .
		int z = 50;
		int m = 90;
		int n = 36;
		 z = z + 5;
		 m = m + n;
		 System.out.println(m);
		 System.out.println(z);
		 //instead of writing assigntment  in above way ,we  write compound assignment operator like this 
		  int o = 35;
		  int p = 20;
		  int q = 5;
		  o += 5;
		  p -=10;
		  q %=2;
		  o /=5;
		  p /=5;
		  p += 2;
		  System.out.println(o);
		  System.out.println(p);
		  System.out.println(q);
		  System.out.println(o);
		  System.out.println(p);
		  System.out.println(p);
			
		 
		 
		 
		 
		 
		 
			
		 
		 
		z = z + 5;
		
		
		
		
		
		
		
		
		
	}

}