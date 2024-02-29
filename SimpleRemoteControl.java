

public class SimpleRemoteControl {
    Command[] onCommnads;
    Command[] offCommands;

    public SimpleRemoteControl() {
        // this.slot = slot;
        onCommnads = new Command[7];
        offCommands = new Command[7];

        for(int i = 0; i < 7; i++){
            onCommnads[i] = () -> { };
            offCommands[i] = () -> { };
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommnads[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommnads[slot].execute();
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }

    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-------- Remote Control --------\n");
        for(int i = 0; i < onCommnads.length; i++){
            stringBuffer.append("[slot] " + i + "]" + onCommnads[i].getClass().getName() + "         " + offCommands[i].getClass().getName()+ "\n");
        }
        return stringBuffer.toString();
    }
}
