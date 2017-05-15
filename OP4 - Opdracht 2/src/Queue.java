
public class Queue {
	
	private Student start, end;
	
	private int size;
	
	public boolean push(Student s) {
		if (start == null) {
			start = s;
			end = s;
			size++;
			return true;
		}
			
		
		/*
		Student last = start;
		
		while (last.getNext() != null) {
			last = last.getNext();
		}
		*/
		
		end.setNext(s);
		end = s;
		
		size++;
		
		return true;
	}
	
	public int size() {
		return size;
	}
	
	public Student pop() {
		if (start == null)
			return null;
		
		Student first = start;
		
		start = first.getNext();
		
		size--;
		
		return first;
	}
	
	public boolean peek(Student s) {
		Student x = start;
		for (int i = 0; i < size; i ++) {
			if (x.getStudentnummer() == s.getStudentnummer())
				return true;
			x = x.getNext();
		}
		return false;
	}
	
	public void printQueue() {
		Student s = start;
		for (int i = 0; i < size; i ++) {
			s.printStudent();
			s = s.getNext();
		}
	}
	
	public void printMen() {
		Student s = start;
		for (int i = 0; i < size; i ++) {
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
