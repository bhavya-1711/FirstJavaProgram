package com.company;

interface MyCamera{
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
interface MyWifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Caling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera,MyWifi{
    public void takeSnap(){
        System.out.println("taking snap");
    }
//    public void record4kVideo(){
//        System.out.println("Taking snap and recording in 4k ");
//    }
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
}

public class cwh_56_default_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4kVideo();
        //ms.greet(); -- throws an error because greet() is private and cant be accessed
        String[] ar = ms.getNetworks();
        for ( String item: ar) {
            System.out.println(item);
            
        }

    }
}
