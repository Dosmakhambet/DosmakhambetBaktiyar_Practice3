package main.java.structural.adapter;

public class EuropiaAdapter implements DeviceApater{

    private Device device;

    EuropiaAdapter(Device device){
        this.device = device;
    }

    @Override
    public void charge() {
        System.out.print("Help to connect socket.");
        device.charge();
    }
}
