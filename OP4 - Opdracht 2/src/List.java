
public class List {
	
	private Student start, end;
	
	private int size;
	
	public boolean push(Student s, int index) {
		if (indexInUse(index))
			return false;
		
		s.setIndex(index);
		
		if (start == null) {
			start = s;
			end = s;
		}
		else {
			end.setNext(s);
			end = s;
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
			if (s.getIndex() == index) {
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
			if (s.getIndex() == index)
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
		for (int i = 0; i < size; i++) {
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