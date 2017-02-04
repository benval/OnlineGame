import java.net.ServerSocket;

public class Server {

	public static void main(String[] args) throws Exception{
		ServerSocket listener = new ServerSocket(8902);
		System.out.println("Server is running.");
		try{
			while(true) {
				Game game = new Game();
				Player player1 = new Player(listener.accept(), 'X');
				Player player2 = new Player(listener.accept(), 'F');
			}
		} finally{
			listener.close();
		}
		
	}
	
}
