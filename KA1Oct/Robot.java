package KA1Oct;

 class Robot {
	 private int robotId;
	    private String robotName;
	    protected int battery;

	    static int totalRobots = 0;

	    final int MAX_BATTERY = 100;

	    Robot(int robotId, String robotName, int battery) {
	        this.robotId = robotId;
	        this.robotName = robotName;
	        this.battery = battery;

	        totalRobots++;
	    }

	    public int getRobotId() {
	        return robotId;
	    }

	    public String getRobotName() {
	        return robotName;
	    }

	    public int getBattery() {
	        return battery;
	    }

	    public void displayDetails() {
	        System.out.println("Robot ID   : " + robotId);
	        System.out.println("Robot Name : " + robotName);
	        System.out.println("Battery    : " + battery + "%");
	    }

	    public void performMission() {
	        System.out.println("Robot is performing a general mission.");
	    }

	    public void performMission(String location) {
	        System.out.println("Robot is going to " + location);
	    }

	    public void recharge() {
	        battery = MAX_BATTERY;
	        System.out.println("Robot fully recharged.");
	    }
}
