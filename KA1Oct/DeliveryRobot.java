package KA1Oct;

class DeliveryRobot extends Robot {

    private String deliveryItem;

    DeliveryRobot(int robotId, String robotName, int battery, String deliveryItem) {

        super(robotId, robotName, battery);

        this.deliveryItem = deliveryItem;
    }

    @Override
    public void performMission() {

        if (battery >= 20) {
            System.out.println("Delivery Robot is delivering: " + deliveryItem);
            battery = battery - 20;
        } else {
            System.out.println("Low battery! Please recharge.");
        }
    }

    @Override
    public void displayDetails() {

        super.displayDetails();

        System.out.println("Type       : Delivery Robot");
        System.out.println("Item       : " + deliveryItem);
    }
}