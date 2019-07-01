import java.util.ArrayList;

public class ListofExceptions {
	public static void main(String[] args) {
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("Hello World");
		myList.add(48);
		myList.add("Goodbye World");

		for(int i=0; i<myList.size(); i++) {
			try {
				Integer castedValue = (Integer) myList.get(i);
				System.out.println(castedValue);
			}
			catch (ClassCastException e) {
				System.out.println("Error at Index: " + i + " - " + myList.get(i));
			}
		}
	}
}