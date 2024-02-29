public class TV {
    String location;
    int channel;

    public TV(String location){
        this.location = location;
    }

    public void on(){
        System.out.println("TV is on!");
    }

    public void off(){
        System.err.println("TV is off!");
    }

    public void setChannel(){
        this.channel = 5;
        System.out.println("Channel is set for Television");
    }
}
