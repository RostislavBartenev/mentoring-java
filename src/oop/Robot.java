package oop;

class Robot {
    private int X;
    private int Y;
    Direction direction = Direction.UP;

    public Direction getDirection() {
        return this.direction;
    }

    public int getX() {
        return this.X;
    }

    public int getY() {
        return this.Y;
    }

    public void turnLeft() {
        switch (getDirection()) {
            case UP -> this.direction = Direction.LEFT;
            case LEFT -> this.direction = Direction.DOWN;
            case DOWN -> this.direction = Direction.RIGHT;
            case RIGHT -> this.direction = Direction.UP;
        }
    }
    public void turnRight() {
        switch (getDirection()) {
            case UP -> this.direction = Direction.RIGHT;
            case LEFT -> this.direction = Direction.UP;
            case DOWN -> this.direction = Direction.LEFT;
            case RIGHT -> this.direction = Direction.DOWN;
        }
    }
    public void stepForward() {
        switch (getDirection()) {
            case UP -> this.Y++;
            case LEFT -> this.X--;
            case DOWN -> this.Y--;
            case RIGHT -> this.X++;
        }
    }
}