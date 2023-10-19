package excercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.text.html.HTMLDocument.Iterator;
public class ArList {
	public static void main(String[] args) {
				List<String> ar = new ArrayList<String>();
				ar.add("White"); // adding elements to ArrayList
				ar.add("Black");
				ar.add("Blue");
				ar.add("Red");
				ar.add("Grey");
				ar.add("Green");
				ar.set(3, "Black"); // Updating element
				System.out.println(ar); // retrieving data
				ar.add(0,"pink");   // adding element in first position using index number
				 System.out.println(ar);
				 System.out.println(ar.get(5)); // retrieving data in 5th index number
				ar.remove(0); // removing element from ArrayList
				 System.out.println(ar);
				if(ar.contains("Black")) {	//finding element using contains
					System.out.println("found");
				}
				Collections.sort(ar); //sorting the elements
				System.out.println("after sorting: " +ar); //Retrieving the data after sorting
			}
}
