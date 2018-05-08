package eq;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("1111", "Ghe", 22);
		Person p2 = new Person("1111", "Ghe", 22);
		System.out.println("p1==p2 : " + (p1 == p2));
		System.out.println("p1.equals(p2) : " + (p1.equals(p2)));
		System.out.println("p2.equals(p1) : " + (p2.equals(p1)));
		System.out.println("p1.equals(p1) : " + (p1.equals(p1)));
		p2.setAge(33);
		System.out.println("p2.equals(p1) (2): " + (p2.equals(p1)));
		Robot r = new Robot("xxx", "xxx");
		System.out.println("r.equals(p1) : " + (r.equals(p1)));

		System.out.println("p1.equals(r) : " + (p1.equals(r)));
		System.out.println(p1);
		System.out.println(p2);

	}

}
