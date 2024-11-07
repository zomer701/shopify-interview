import temp.Memory;
import temp.Moving;

import java.util.Scanner;

public class RobotMoving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        Memory memory = new Memory();
        Moving moving = new Moving(memory);

        while (true) {
            System.out.print("> ");
            command = scanner.nextLine().trim();

            if (command.equals("Q")) {
                System.out.println("Robot shutting down.");
                break;
            }

            switch (command) {
                case "M":
                    moving.execute();
                    moving.print();
                    break;
                case "L":
                    memory.changeTurn("L");
                    moving.print();
                    break;
                case "R":
                    memory.changeTurn("R");
                    moving.print();
                    break;
                case "?":
                    System.out.println("""
                            Command the robot with:
                              L - turn left
                              R - turn right
                              M - move forward
                              ? - this message
                              Q - quit
                            """);
                    break;
                default:
                    System.out.println("Unknown command: " + command);
                    break;
            }
        }

        scanner.close();
    }

}
