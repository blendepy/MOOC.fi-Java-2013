
import java.util.*;

public class Menu {

    private Scanner reader = new Scanner(System.in);
    private Airplane plane;
    private Routes route;

    public Menu() {

        this.plane = new Airplane();
        this.route = new Routes();
    }

    public void startAirportPanel() {
        System.out.println("Airport panel\n"
                + "--------------------");
        System.out.println("");

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String userInput = reader.nextLine();

            if (userInput.equalsIgnoreCase("x")) {
                break;
            } else if (userInput.equalsIgnoreCase("1")) {
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                System.out.print("Give plane capacity: ");
                int planeCapacity = Integer.parseInt(reader.nextLine());
                plane.addPlane(planeID, planeCapacity);
            } else if (userInput.equalsIgnoreCase("2")) {
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                System.out.print("Give departure airport code: ");
                String departure = reader.nextLine();
                System.out.print("Give destination airport code: ");
                String destination = reader.nextLine();
                route.addRoute(planeID, departure, destination);
            }
        }
    }

    public void startFlightService() {
        System.out.println("Flight service\n"
                + "------------");
        System.out.println("");

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String userInput = reader.nextLine();

            if (userInput.equalsIgnoreCase("x")) {
                break;
            } else if (userInput.equalsIgnoreCase("1")) {
                plane.printPlanes();
            } else if (userInput.equalsIgnoreCase("2")) {

                route.printRoutes(plane);
            } else if (userInput.equals("3")) {
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                System.out.println(plane.printPlaneInfo(planeID));
            }
        }
    }
}
