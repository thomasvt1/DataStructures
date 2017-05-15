
public class App {
	
	/*	studnr.	naam			leeftijd	geslacht
		01		Janice			25			v
		02 		Kermit 			18 			m
		03 		Gonzo 			8 			m
		04 		Swedish Chef 	35 			m
		05	 	Miss Piggy 		28 			v
	*/
	
	
	public static void main(String[] args) {
		Student s1 = new Student(1, 25, "Janice", "v");
		Student s2 = new Student(2, 18, "Kermit", "m");
		Student s3 = new Student(3, 8, "Gonzo", "m");
		Student s4 = new Student(4, 35, "Swedish Chef", "m");
		Student s5 = new Student(5, 28, "Miss Piggy", "v");
		
		Queue q = new Queue();
		
		System.out.println("Queue size: " + q.size());
		
		List l = new List();
		
		l.push(s1, 1);
		l.push(s2, 2);
		l.push(s3, 3);
		l.push(s4, 4);
		
		System.out.println(l.push(s5, 4));
		
		l.pop(2);
		
		l.printList();
		
		System.out.println("Queue size: " + l.size());
		
		SortedList s = new SortedList();
		
		s.printWoman();
		
		
	}
}