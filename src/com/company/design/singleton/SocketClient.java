package com.company.design.singleton;

public class SocketClient {

    private static SocketClient socketClient = null;

    private SocketClient(){

    }//기본적을 생성자로 생성할 수 없게 막아놓음

    public static SocketClient getInstance(){

        if(socketClient == null){
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect(){
        System.out.println("connect");
    }

}
