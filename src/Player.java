import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Player extends Thread{
	char identifier;
	Socket socket;
	BufferedReader input;
	PrintWriter output;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Player(Socket socket, char identifier) {
		this.socket = socket;
		this.identifier = identifier;
	}

}
