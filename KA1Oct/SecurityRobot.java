package KA1Oct;

class SecurityRobot extends Robot {

    private String securityArea;

    SecurityRobot(int robotId, String robotName, int battery, String securityArea) {

        super(robotId, robotName, battery);

        this.securityArea = securityArea;
    }

    @Override
    public void performMission() {

        if (battery >= 30) {
            System.out.println("Security Robot is monitoring: " + securityArea);
            battery = battery - 30;
        } else {
            System.out.println("Low battery! Please recharge.");
        }
    }

    @Override
    public void displayDetails() {

        super.displayDetails();

        System.out.println("Type       : Security Robot");
        System.out.println("Area       : " + securityArea);
    }
}
