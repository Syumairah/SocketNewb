import java.io.*;
import java.net.*;
import java.util.*;
 
class Client {
    
    public static void main(String argv[])
      {
	    
        try{
            String hostName = args[0];
        int portNumber = Integer.parseInt(args[1]);
            //establish socket connection to server
            Socket socketclient = new Socket(hostName, portNumber);
            PrintWriter out = new PrintWriter(firstSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(firstSocket.getInputStream()));
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            
        String userInput;
           writer.write("*** Hi from Client \n"); 
        while ((userInput = stdIn.readLine()) != null) 
        {
            System.out.println("received: " + in.readLine());
        }
        in.close();
        stdIn.close();
        firstSocket.close();
            
           
        }
	  }
 
}
