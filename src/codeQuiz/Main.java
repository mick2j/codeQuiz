package codeQuiz;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		double score = 0;
		Scanner sc = new Scanner(System.in);
		List<String> q = new ArrayList<>();
		q.add("Do you like Coding?");
		q.add("Strings store numbers?");
		q.add("Is Boolean a data type?");
		q.add("Does boolean store true and false?");
		q.add("Constructors make new blocks of code?");
		q.add("Data types store different kinds of data?");
		q.add("Array Lists are easier to modify than arrays?");
		q.add("Int data types store single numbers");
		q.add("Inheritance requires only one class?");
		q.add("The word continue can only be used in loops?");
		
		System.out.println("Welcome to my coding quiz");
		System.out.println(" Are you ready to begin? Y/N");
		String str = sc.next();
		 while ( str != "Y") {
			if (str != "Y" || str != "N") {
				System.out.println("Please enter Y or N");
				continue;
			}
			for (int i = 0; i < q.size(); i++) {
				System.out.println(q.get(i));
				String str1 = sc.next();
			}
			
			
			
			
		
		
		

		 }

	}
}
