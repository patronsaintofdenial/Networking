import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class cli {
	public static void main(String args[]) throws UnknownHostException, IOException
	{ int num; int temp;
		Scanner sc = new Scanner(System.in);
		Socket s= new Socket("127.0.0.1" , 123); // IP address and port number 
		
		Scanner sc1= new Scanner( s.getInputStream()); // Get output from Server
		System.out.println("Enter any number");
		num = sc.nextInt();
		PrintStream p = new PrintStream(s.getOutputStream()); // Send the number to socket
		p.println(num); // Sending the number to server 
		temp = sc1.nextInt(); // Receiving the number from server 
		System.out.println(temp);
		
	}

}
