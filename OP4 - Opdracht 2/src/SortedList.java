
public class SortedList extends List {
	
	private Student start, end;
	
	private int size;
	
	public boolean push(Student s, int index) {
		//TODO:
		return false;	
	}
	
	public int size() {
		return size;
	}

	public Student head() {
		Student s = start;
		
		start = start.getNext();
		
		return s;
	}
	
	public Student tail() {
		//TODO: Get last student and remove it.
		
		Student x = end;
		
		Student s = start;
		while (s.getNext() != x)
			s = s.getNext();
		
		s.setNext(null);
		
		return x;
	}
	
	public Student pop(int index) {
		Student s = start;
		
		for (int i = 0; i < size; i++) {
			if (i == index) {
				
				Student x = start;
				while (x.getNext() != s)
					x = x.getNext();
				
				x.setNext(s.getNext());
				
				return s;
			}
			s = s.getNext();
		}
		
		return null;
	}
	
	public boolean peek(Student s) {
		//TODO: Returns student if exist.
		
		Student x = start;
		for (int i = 0; i < size; i++) {
			if (x.getStudentnummer() == s.getStudentnummer())
				return true;
		}
		
		return false;
	}
	
	public void printSortedList() {
		//TODO: Print all queue.
	}
}