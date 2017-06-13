package MethodOverloading;

public class Product {

	public long mul(long a, long b) {
		System.out.println("Product of two numbers is:");
		return (long) (a * b);

	}

	public long mul(long a, long b, long c) {
		System.out.println("Product of three numbers is:");
		this.mul(a, b);
		return (long) (a * b * c);

	}

	public static void main(String[] args) {
		Product m = new Product();

		System.out.println(m.mul(4, 9));
		System.out.println(m.mul(7, 8, 9));

	}
}
