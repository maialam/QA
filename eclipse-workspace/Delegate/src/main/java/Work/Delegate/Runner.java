package Work.Delegate;

import java.util.ArrayList;

public class Runner {
	
	public static void main (String[] args) {
		
//		String s1 = "Hello";
//		
//		Delegate d1 = new Delegate("PC");
//		
//		Delegate d2 = new Delegate("Ed");
//		
//		d1.remove();
//		d2.changeStream();
//		
//		System.out.println(d1.name);
//		
//		d1.name = "Ax";
//		
//		System.out.println(d1.name);
//		
//		d1.techSkills = 6;
//		
//		System.out.println(d2.techSkills);
//		System.out.println(d1.techSkills);
		
		Person p1 = new Person("Tom", 21, "Software Developer");
		
		Person p2 = new Person("Malcolm", 23, "Lead Engineer");
		
		Person p3 = new Person("Ibrahim", 21, "defunct member of society");

		
		ArrayList<Person> staffMembers = new ArrayList<Person>();
		staffMembers.add(p1);
		staffMembers.add(p2);
		staffMembers.add(p3);
		
		
//		staffMembers.forEach(e -> e.returnData);
		
		p1.staffIntro();
		
	}

}
