package com.rwkj.demo.jikaoti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
    private ServerSocket ss;
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    public Server()
    {
        try
        {
            ss=new ServerSocket(10000);
            while(true)
            {
                socket = ss.accept();
                String RemoteIP = socket.getInetAddress().getHostAddress();
                String RemotePort = ":"+socket.getLocalPort();
                System.out.println("A client come in!IP:"+RemoteIP+RemotePort);
                in = new BufferedReader(new
                        InputStreamReader(socket.getInputStream()));
                String line = in.readLine();
                System.out.println("Cleint send is :" + line);
                out = new PrintWriter(socket.getOutputStream(),true);
                System.out.println("Your Message Received!");
                out.close();
                in.close();
                socket.close();
            }
        }catch (IOException e)
        {
            System.out.println("wrong");
        }
    }
    public static void main(String[] args)
    {
        new Server();
    }
}
