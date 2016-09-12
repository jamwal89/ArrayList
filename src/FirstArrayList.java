import java.util.Collections; 
import java.util.ArrayList;
import java.util.Scanner;
 
public class FirstArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean addBooks=true;
		
		ArrayList<String> BookList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		
		
			addBooks =true;
			while (addBooks){
				System.out.println("Enter the name of the Book");
				BookList.add(sc.nextLine());
				System.out.println("Do you want to enter the book");
				String answer = sc.nextLine();
				
				if( answer.equalsIgnoreCase("no")){
					addBooks=false;
				}
			}
			Collections.sort(BookList);
			
			for (String BookName : BookList) {
				 
			    System.out.println(BookName);
			}
		

	}

}
