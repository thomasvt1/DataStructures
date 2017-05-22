public class List {
	
	private Student start, end;
	
	private int size = 0;
	
	public boolean push(Student s, int index) {
		if (start == null) {
			start = s;
			end = s;
			size++;
			return true;
		}
		
		else if (index == 0) {
			Student x = start;
			start = s;
			s.setNext(x);
			size++;
			return true;
		}
		
		else if (index >= size) {
			System.out.println("INDEX: " + index + " ||| size: " + size + " ||| name: " + s.getNaam());
			end.setNext(s);
			end = s;
			size++;
			return true;
		}
		
		//Last resort: the to be added object is inside the list.
		
		Student x = start;
		
		System.out.println("~~ PRINTING INDEX START ~~");
		
		for (int i = 0; i != index -1; i++) {
			System.out.println("Index: " + i);
			x = x.getNext();
			
		}
		System.out.println("~~ PRINTING INDEX END ~~");


		
		Student a = x.getNext();
		
		x.setNext(s);
		s.setNext(a);
		
		
		if (index == 2) {
			System.out.println("----BEGIN INDEX TWO------");
			//a.printStudent();
			//x.printStudent();
			//s.printStudent();
			System.out.println("----END INDEX TWO------");
		}
		
		
		size++;
		
		return true;
	}
	
	public int size() {
		return size;
	}

	public Student head() {
		Student first = start;
		
		start = first.getNext();
		
		return first;
	}
	
	public Student tail() {
		Student s = end;
		
		end = null;
		
		return s;
	}
	
	public Student pop(int index) {
		Student s = start;
		for (int i = 0; i < size; i++) {
			if (i == index) {
				//Student does exist!
				Student joint = start;
				
				while (joint.getNext() != s) {
					joint = joint.getNext();
				}
				
				joint.setNext(s.getNext());
				size--;
				return s;
				
			}
			s = s.getNext();
		}
		return null;
	}
	
	private boolean indexInUse(int index) {
		Student s = start;
		for (int i = 0; i < size; i++) {
			if (i == index)
				return true;
			s = s.getNext();
		}
		return false;
	}
	
	public boolean peek(Student s) {
		Student x = start;
		for (int i = 0; i < size; i++) {
			if (x.getStudentnummer() == s.getStudentnummer())
				return true;
			x = x.getNext();
		}
		
		return false;
	}
	
	public void printList() {
		Student s = start;
		
		while (s != null) {
			s.printStudent();
			s = s.getNext();
		}
		
	}
	
	public void printMen() {
		Student s = start;
		for (int i = 0; i < size; i++) {
			if (s.getGeslacht().equalsIgnoreCase("M"))
				s.printStudent();
			s = s.getNext();
		}
	}
	
	public void printWoman() {
		Student s = start;
		for (int i = 0; i < size; i ++) {
			if (s.getGeslacht().equalsIgnoreCase("V"))
				s.printStudent();
			s = s.getNext();
		}
	}
}