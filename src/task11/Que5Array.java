package task11;

public class Que5Array {

public static void main(String[] args) {
		// TODO Auto-generated method stub

	String[] arr = {"Rohit","Shikar","Virat","Dhoni"};   
	//Declaring 4 elements in the String array                                       
		          
	for(int i=0;i<=arr.length;i++) {       
		 
	System.out.println(arr[i]);   //So it will throw ArrayIndexOutOfBoundException  
		        
	}  
    }
}
---------------------------------------------------------------------------------------------------------------------\
OUTPUT:
Rohit
Shikar
Virat
Dhoni
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
	at guvitask11/task11.Que5Array.main(Que5Array.java:13)
