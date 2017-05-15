
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
		
		return null;
	}
	
	public Student pop(int index) {
		//TOOD: Get student and remove.
		
		return null;
	}
	
	public boolean peek(Student s) {
		//TODO: Returns student if exist.
		
		return false;
	}
	
	public void printSortedList() {
		//TODO: Print all queue.
	}
}