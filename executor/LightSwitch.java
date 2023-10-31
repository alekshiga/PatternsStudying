package executor;

public class LightSwitch {

    private Command switchOnCommand;
    private Command switchOffCommand;

    public LightSwitch(Command switchOnCommand, Command switchOffCommand) {
        this.switchOffCommand = switchOffCommand;
        this.switchOnCommand = switchOnCommand;
    }

    public void switchOn() {
        switchOnCommand.execute();
    }

    public void switchOff() {
        switchOffCommand.execute();
    }
}
