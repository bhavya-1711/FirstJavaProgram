package com.company;

interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good morning");
    }
    default public void record4kVideo(){
        greet();
        System.out.println("Recording in 4k..");
    }
}
interface MyWifi2{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyCamera2 ,MyWifi2 {
    public void takeSnap() {
        System.out.println("taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Harry", "Bhavya", "Harshita"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to.."+ network);
    }
    public void sampleMeth(){
        System.out.println("method of smartphone");
    }
}

public class cwh_59_polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2(); // this is a smartphone but ,use it as a camera
        //cam1.getNetworks(); -- not allowed
        //cam1.sampleMeth(); -- not allowed
        cam1.record4kVideo();

        MySmartPhone2 s = new MySmartPhone2();
        s.connectToNetwork("Bhavya");
        s.sampleMeth();
        s.recordVideo();
        s.record4kVideo();
        s.callNumber(6969);
    }
}
