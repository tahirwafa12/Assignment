
public class App 
{
    public static void main( String[] args )
    {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("kitchen Light");
        TV tv = new TV("Guest Room");

        // set the light
        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
        // livingRoomLight.on();

        // set television
        remoteControl.setCommand(2, tv::on, tv::off);
        
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
    }
}
