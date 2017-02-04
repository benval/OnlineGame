import java.net.ServerSocket;

public class Server {

	public static void main(String[] args) throws Exception{
		ServerSocket listener = new ServerSocket(8902);
		System.out.println("Server is running.");
		try{
			while(true) {
				System.out.println("Hey");
			}
		} finally{
			listener.close();
		}
		
	}
	
}
