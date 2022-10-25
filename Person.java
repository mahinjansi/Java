
public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	static void personFunction (Person p) {
		p.setName("abcd");
		p.setAge(18);
	}

	static void changeInt(int a) {
		a = 10;
	}
	
	static void changePerson(Person pz) {
		pz = new Person("xyz", 33);
	}
	
	public static void main(String[] args) {
/*
		Person p = new Person("blah", 12);
		System.out.println(p);
		personFunction(p);
		System.out.println(p);
		changePerson(p);
		System.out.println(p);
		
		int abc = 31;
		System.out.println(abc);
		changeInt(abc);
		System.out.println(abc);
*/
		
		Person p1 = new Person("blah", 12), p2 = p1;
		System.out.println(p1);
		System.out.println(p2);
		personFunction(p1);
		System.out.println(p1);
		System.out.println(p2);
		p1 = new Person("dog", 332);
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
