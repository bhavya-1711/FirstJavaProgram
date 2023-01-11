package com.company;
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib..");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir..!");
    }
    @Override
    public void eat(){
        System.out.println("Eating..");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping..");
    }
}

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone{
    void ring(){
        System.out.println("Telephone is Ringing..");
    }
    void lift(){
        System.out.println("Lifting the telephone..");
    }
    void disconnect(){
        System.out.println("Disconnecting the telephone..");
    }
}
class Smartphone1 extends SmartTelephone{
    void insta(){
        System.out.println("using instagram");
    }
}

interface TvRemote{
    void switchOn();
    void switchOff();
    void increaseVolume();
    void decreaseVolume();

}
interface SmartTvRemote extends TvRemote{
    void OpenNetflix();
    void OpenYoutube();
    void Browse();
    void TalkToAlexa();

}
class Tv implements TvRemote{
    public void switchOn(){
        System.out.println("Switching on Tv");
    }
    public void switchOff(){
        System.out.println("Switching off Tv");
    }
    public void increaseVolume(){
        System.out.println("Increasing volume of Tv");
    }
    public void decreaseVolume(){
        System.out.println("decreasing Volume of Tv");
    }
    public void display(){
        System.out.println("displays the picture");
    }
}


public class cwh_60_ch11_ps {
    public static void main(String[] args) {
        // Q1 + Q2
         FountainPen f= new FountainPen();
         f.changeNib();
         f.refill();

         //Q3
        Human harry = new Human();
        harry.eat();

        //Q5
        Monkey m1 = new Human();
        m1.bite();
        m1.jump();
        //m1.speak(); --> cannot use speak method coz the reference is monkey which does not have speak method

        BasicAnimal harshita = new Human();
        //harshita.speak();-- error
        harshita.eat();
        harshita.sleep();

        //Q4
        SmartTelephone st= new Smartphone1();
      //  st.insta(); --> cannot use insta() method coz the reference is SmartTelephone which does not have insta method
        st.disconnect();
        st.lift();

        //Q6
        TvRemote tr = new Tv();
        tr.switchOff();
        tr.switchOn();
        tr.decreaseVolume();
        tr.increaseVolume();
       // tr.display(); //throws error no display method in interface TvRemote
       // SmartTvRemote str = new SmartTvRemote(); //throws error can't be instantiated.
       // TvRemote tv2 = new TvRemote() ; //throws error can't be instantiated
        Tv tv1=new Tv();
        tv1.display();



    }
}
