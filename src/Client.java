import java.net.Socket;

public class Client {
private Socket socket;
private static int PORT = 8902;


	public Client (String serverAddress) throws Exception {
		socket = new Socket(serverAddress, PORT);
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String serverAddress = (args.length == 0) ? "localhost" : args[1];
		Client gameClient = new Client(serverAddress);
	}

}
