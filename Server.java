import java.net.*
import java.io.*
    
public class Server {
  public static void main(String[] args) throws IOException {
    int port = 12345;
    ServerSocket = new ServerSocket(port);
    System.out.println("Server in ascolto sulla porta" + port);

  try {
    while(true) {
      Socket clientSocket = serverSocket.accept();
      printWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
      out.println("Ciao client");
      clientSocket.close();
    }
    finally {
    serverSocket.close();
  }
      
