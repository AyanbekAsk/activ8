package com.example.demo;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class week14client {
    public static void main (String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1",8081);
        DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
        DataInputStream fromClient = new DataInputStream(socket.getInputStream());
        Scanner in = new Scanner(socket.getInputStream());//то что получили
        Scanner input = new Scanner(System.in);


            //String s = input.nextLine();
            //toServer.writeUTF(s);


        String sk = fromClient.readUTF();
        System.out.println(sk);


    }
}
