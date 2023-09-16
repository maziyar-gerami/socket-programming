package com.example.socketprogrammingclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client{
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;
    private String line ="";

    public Client(String address, int port){
        try {
            socket = new Socket(address, port);
            System.out.println("Connection Established");

            input = new DataInputStream(System.in);

            out = new DataOutputStream(socket.getOutputStream());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        while (true){
            try {
                line = input.readLine();
                out.writeUTF(line);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
public void close() throws IOException{
    input.close();;
    out.close();
    socket.close();
}  
}

