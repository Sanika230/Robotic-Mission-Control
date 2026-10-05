package KA1Oct;

import java.util.Scanner;

public class RobotMissionControl {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int MAX_ROBOTS = 10;

        Robot[] robots = new Robot[MAX_ROBOTS];

        int count = 0;

        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println("     ROBOT MISSION CONTROL");
            System.out.println("=================================");
            System.out.println("1. Register Robot");
            System.out.println("2. Display All Robots");
            System.out.println("3. Start Mission");
            System.out.println("4. Recharge Robot");
            System.out.println("5. Search Robot");
            System.out.println("6. Show Statistics");
            System.out.println("7. Exit");
            System.out.println("=================================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (count < MAX_ROBOTS) {

                        System.out.print("Enter Robot ID: ");
                        int id = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Robot Name: ");
                        String name = sc.nextLine();

                        System.out.println("\nSelect Robot Type:");
                        System.out.println("1. Delivery Robot");
                        System.out.println("2. Security Robot");
                        System.out.println("3. Rescue Robot");

                        System.out.print("Enter type: ");
                        int type = sc.nextInt();

                        System.out.print("Enter Battery: ");
                        int battery = sc.nextInt();

                        sc.nextLine();

                        if (type == 1) {

                            System.out.print("Enter Delivery Item: ");
                            String item = sc.nextLine();

                            robots[count] =
                                    new DeliveryRobot(id, name, battery, item);

                            count++;

                            System.out.println("Delivery Robot registered.");

                        } else if (type == 2) {

                            System.out.print("Enter Security Area: ");
                            String area = sc.nextLine();

                            robots[count] =
                                    new SecurityRobot(id, name, battery, area);

                            count++;

                            System.out.println("Security Robot registered.");

                        } else if (type == 3) {

                            System.out.print("Enter Rescue Location: ");
                            String location = sc.nextLine();

                            robots[count] =
                                    new RescueRobot(id, name, battery, location);

                            count++;

                            System.out.println("Rescue Robot registered.");

                        } else {

                            System.out.println("Invalid robot type.");
                        }

                    } else {

                        System.out.println("Robot storage is full.");
                    }

                    break;


                case 2:

                    if (count == 0) {

                        System.out.println("No robots registered.");

                    } else {

                        for (int i = 0; i < count; i++) {

                            System.out.println("\n------------------------");

                            robots[i].displayDetails();
                        }
                    }

                    break;


                case 3:

                    System.out.print("Enter Robot ID: ");
                    int missionId = sc.nextInt();

                    boolean missionFound = false;

                    for (int i = 0; i < count; i++) {

                        if (robots[i].getRobotId() == missionId) {

                            robots[i].performMission();

                            missionFound = true;

                            break;
                        }
                    }

                    if (!missionFound) {

                        System.out.println("Robot not found.");
                    }

                    break;


                case 4:

                    System.out.print("Enter Robot ID: ");
                    int rechargeId = sc.nextInt();

                    boolean rechargeFound = false;

                    for (int i = 0; i < count; i++) {

                        if (robots[i].getRobotId() == rechargeId) {

                            robots[i].recharge();

                            rechargeFound = true;

                            break;
                        }
                    }

                    if (!rechargeFound) {

                        System.out.println("Robot not found.");
                    }

                    break;


                case 5:

                    System.out.print("Enter Robot ID: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (robots[i].getRobotId() == searchId) {

                            robots[i].displayDetails();

                            found = true;

                            break;
                        }
                    }

                    if (!found) {

                        System.out.println("Robot not found.");
                    }

                    break;


                case 6:

                    System.out.println("\n===== STATISTICS =====");
                    System.out.println("Total Robots: "
                            + Robot.totalRobots);

                    System.out.println("Registered Robots: "
                            + count);

                    break;


                case 7:

                    System.out.println("Thank you for using Robot Mission Control.");

                    break;


                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}
