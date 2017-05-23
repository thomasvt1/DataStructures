public class SortedList {
	
	private Student start, end;
	
	private int size = 0;
	
	public boolean push(Student s) {
		int index = s.getStudentnummer();
		System.out.println("Pushing [" + s.getNaam() + "] index: " + index);
		
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
		
		else if (index >= end.getStudentnummer()) {
			System.out.println("INDEX: " + index + " ||| size: " + size + " ||| name: " + s.getNaam());
			end.setNext(s);
			end = s;
			size++;
			return true;
		}
		
		Student x = start;
		
		while (s.getStudentnummer() > x.getStudentnummer()) {
			
			x = x.getNext();
		}
		
		Student a = start;
		
		while (a.getNext() != x) {
			a = a.getNext();
		}
		
		a.setNext(s);
		s.setNext(x);
		
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
	
	public boolean peek(Student s) {
		Student x = start;
		for (int i = 0; i < size; i++) {
			if (x.getStudentnummer() == s.getStudentnummer())
				return true;
			x = x.getNext();
		}
		
		return false;
	}
	
	public void printNames() {
		System.out.println("~~~~~~~~~~~~~~");
		Student s = start;
		
		while (s != null) {
			System.out.println(s.getNaam());
			s = s.getNext();
		}
		System.out.println("~~~~~~~~~~~~~~");
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