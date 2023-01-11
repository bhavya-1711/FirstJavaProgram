package com.company;

interface Bicycle{
    int a=45;   //property is final
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHornk3g();
    void blowHornmhn();
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brakes...");
    }
    public void speedUp(int increment){
        System.out.println("speeding up...");
    }
    public void blowHornk3g(){
        System.out.println("Kabhi khushi kabhi gam pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Mai hoon na po po po po");
    }

}
public class cwh_54_interfaces {
    public static void main(String[] args) {
        AvonCycle cycleHarry= new AvonCycle();
        cycleHarry.applyBrake(1);
        //You cannot create properties in interfaces
        System.out.println(cycleHarry.a);
        //You cannot modify the properties in interfaces as they are final
        cycleHarry.blowHornk3g();
        cycleHarry.blowHornmhn();
        cycleHarry.blowHorn();


    }
}
