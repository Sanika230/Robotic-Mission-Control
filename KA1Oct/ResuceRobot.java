package KA1Oct;

class RescueRobot extends Robot {

    private String rescueLocation;

    RescueRobot(int robotId, String robotName, int battery, String rescueLocation) {

        super(robotId, robotName, battery);

        this.rescueLocation = rescueLocation;
    }

    @Override
    public void performMission() {

        if (battery >= 40) {
            System.out.println("Rescue Robot is performing rescue at: "
                    + rescueLocation);

            battery = battery - 40;
        } else {
            System.out.println("Low battery! Please recharge.");
        }
    }

    @Override
    public void displayDetails() {

        super.displayDetails();

        System.out.println("Type       : Rescue Robot");
        System.out.println("Location   : " + rescueLocation);
    }
}