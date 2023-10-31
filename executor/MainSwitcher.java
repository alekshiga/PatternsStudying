package executor;

public class MainSwitcher {

    public static void main(String[] args) {
        Light light = new Light();

        Command switchOn = new TurnOnLightCommand(light);
        Command switchOff = new TurnOffLightCommand(light);

        LightSwitch Switcher = new LightSwitch(switchOn, switchOff);

        Switcher.switchOn();
        Switcher.switchOff();
    }

}
