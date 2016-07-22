package server.ejb;

import server.bean.ClientB;
import server.bean.ClientManager;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.*;
import java.net.Socket;

/**
 * Created by Pavel on 29.02.2016.
 */
@Stateless
public class ClientEJB {
    @Inject
    ClientManager clientManager;

    public String startClient(ClientB clientB) {
        communicate(clientB.getMessage());
//        clientManager.startClient(clientB);
        return "success";
    }

//    public static void main (String args[]) {
//        new CommunicationTest().communicate();
//    }

    public void communicate(String message) {
        int serverPort = 6666;
        String address = "127.0.0.1";

        try (Socket socket = new Socket(address, serverPort);
             DataInputStream in = new DataInputStream(socket.getInputStream());
             DataOutputStream out = new DataOutputStream(socket.getOutputStream());
             BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in))) {

//            String line = keyboard.readLine();
            String line = message;
            out.writeUTF(line);
            out.flush();
            line = in.readUTF();
            System.out.println("Response: " + line);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
