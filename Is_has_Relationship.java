package Casting;

class Pulsar extends Bike_pojo{
    public void PulsarStartDemo(){
        Engine PulsarEngine=new Engine();
        PulsarEngine.stop();
    }
}
class Engine{
    public void start(){
        System.out.println("Started:");
    }
    public void stop(){
        System.out.println("Stopped:");
    }
}
public class Is_has_Relationship {
    public static void main(String []args){
        Pulsar myPulsar=new Pulsar();
        myPulsar.setColor("Red");
        myPulsar.setMaxSpeed("120");
        myPulsar.bikeInfo();
        myPulsar.PulsarStartDemo();
    }
}
