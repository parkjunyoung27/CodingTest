package com.company.design.singleton;

public class Aclazz {

    private SocketClient socketClient;

    public Aclazz(){
        this.socketClient = SocketClient.getInstance();

        //this.socketClient = new SocketClient();
        //싱글톤이 아니라 새롭게 가져오는 방법
        //이런식으로 하면 단 하나의 객체가 생성되는 것이 아니다.
    }

    public SocketClient getSocketClient() {

        return this.socketClient;
    }
}
