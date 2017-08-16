import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ser 
{
public static void main(String args[]) throws IOException
{
	ServerSocket s1 = new ServerSocket ( 123 ); // To identify the client socket
	Socket s2 = s1.accept();
	Scanner sc = new Scanner(s2.getInputStream()); // Accept the number from the client
	int num;
	num = sc.nextInt();
	int temp = 2*num; // Modification as per requirement
	PrintStream p = new PrintStream(s2.getOutputStream()); 
	p.println(temp); // Send back the number to the client
}
}
