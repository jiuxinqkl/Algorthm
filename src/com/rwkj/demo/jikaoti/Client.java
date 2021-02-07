package com.rwkj.demo.jikaoti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    Socket socket;
    BufferedReader in;
    PrintWriter out;
    public Client()
    {
        try
        {
            System.out.println("Try to Connect to 127.0.0.1:10000");
            socket = new Socket("127.0.0.1",10000);
            System.out.println("The Server Connected!");
            System.out.println("Please enter some Character:");
            BufferedReader line = new BufferedReader(new
                    InputStreamReader(System.in));
            out = new PrintWriter(socket.getOutputStream(),true);
            out.println(line.readLine());
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(in.readLine());
            out.close();
            in.close();
            socket.close();
        }catch(IOException e)
        {
            out.println("Wrong");
        }
    }
    public static void main(String[] args)
    {
        new Client();
    }
}
