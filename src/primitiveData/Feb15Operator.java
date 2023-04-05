package primitiveData;

public class Feb15Operator {

	public static void main(String[] args) {
		//Unary operator.One argument. 
		int a = 20;
		int b = 50;
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(--b);
		System.out.println(--b);
		System.out.println(b--);
		System.out.println(b);
		//binary operator.Two arguments
		short s = 20 + 30;
		short z = 30 - 20;
		int c = 20;
		int m = 2;
		int r = 30;
		int t = 4;
		int g = 90;
		int e = g++;
		int h = --g;
		int i = t;
		System.out.println(s);
		System.out.println(z);
		System.out.println(c/m);
		System.out.println(b/a);
		System.out.println(c);
		System.out.println(e);
		System.out.println(h);
		//Ternary operator,takes Three Arguments,single operator.
		//a>b?a:b
		System.out.println(c>m);
		System.out.println(c<m);
		System.out.println(c>=a);
		System.out.println(c<=a);
		System.out.println(c==a);
		System.out.println(c!=g);
		System.out.println(t==g);
		System.out.println(i);
				
		// Types of operator in java./Assignment operator = 
		 //Arthemetic Operator _ , +, *,/,%(reminder),++,_ _,
		// Modulas operator % (reminder)
		
		System.out.println(r%t);
	}
}
