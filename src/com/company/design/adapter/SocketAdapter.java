package com.company.design.adapter;

public class SocketAdapter implements Electronic110V{
//추상이 핵심
    private  Electronic220V electronic220V;

    public SocketAdapter(Electronic220V electronic220V){
        this.electronic220V = electronic220V;
    }
    //implements가 110v임
    //220v를 220v에 설정


    @Override
    public void powerON() {
        electronic220V.connect(); // 220V가 110V로 콘센트 연결
        //connect()는
        //eletronic110v.powerON();
    }

}
