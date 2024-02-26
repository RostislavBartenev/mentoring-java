package oop;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        moveRobot(robot, 3, 3);

        System.out.println("-----");

        String text = "Java 0123456789";
        byte[] bytes = text.getBytes();

        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(bytes);
        System.out.println(asciiCharSequence);

        System.out.println(asciiCharSequence.length());
        System.out.println(asciiCharSequence.charAt(0));
        System.out.println(asciiCharSequence.subSequence(2, 4));
        System.out.println(asciiCharSequence.subSequence(2));
        System.out.println(asciiCharSequence.delete(0, 4));

        System.out.println(asciiCharSequence);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();

        if (x < toX) {
            rotate(robot, Direction.RIGHT);
        } else if (x > toX) {
            rotate(robot, Direction.LEFT);
        }

        moveForward(robot, Math.abs(x - toX));

        if (y < toY) {
            rotate(robot, Direction.UP);
        } else if (y > toY) {
            rotate(robot, Direction.DOWN);
        }

        moveForward(robot, Math.abs(y - toY));

        System.out.println(robot.getX() + " " + robot.getY());
    }

    public static void rotate(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }

    public static void moveForward(Robot robot, int stepCount) {
        if (stepCount < 0) {
            throw new IllegalArgumentException("Колич шагов должно быть положительным");
        }

        for (int i = 0; i < stepCount; i++) {
            robot.stepForward();
        }
    }
}