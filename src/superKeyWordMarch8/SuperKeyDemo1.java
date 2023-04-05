package superKeyWordMarch8;

public class SuperKeyDemo1 {

	public static void main(String[] args) {
         Kitten k = new Kitten();
       //  k.print();
         k.display();
	}

}

class Animal{
	int a = 5;

}

class Cat extends Animal{// Animal is the immediate parent of Cat
	int a = 10;

	void print() {
		System.out.println("parent class a="+a); 
	}
}
class Kitten extends Cat{ // cat is the immediate parent of kitten
	int a = 20;
	
	void print() {
		System.out.println(" child class a ="+a);
	}
	void display() {
		super.print();// to call immediate  parent class method
		print();// same class
	}
	
}

