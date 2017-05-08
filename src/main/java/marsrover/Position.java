package marsrover;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position nextPositionForward(String direction, Planet planet) {
        int newX = 0;
        int newY = 0;
        if (direction.equals("north")) {
            newY = this.y + 1;
            if (newY > planet.giveMaxY()) {
                newY = planet.giveMinY();
            }
        }

        if (direction.equals("south")) {
            newY = this.y - 1;
            if (newY < planet.giveMinY()) {
                newY = planet.giveMaxY();
            }
        }
        if (direction.equals("east")) {
            newX = this.x + 1;
            if (newX > planet.giveMaxX()) {
                newX = planet.giveMinX();
            }
        }
        if (direction.equals("west")) {
            newX = this.x - 1;
            if (newX < planet.giveMinX()) {
                newX = planet.giveMaxX();
            }
        }
        return new Position(newX, newY);
    }

    public Position nextPositionBackward(String direction, Planet planet) {
        int newY = 0;
        int newX = 0;
        if (direction.equals("north")) {
            newY = this.y - 1;
            if (newY < planet.giveMinY()) {
                newY = planet.giveMaxY();
            }
        }
        if (direction.equals("south")) {
            newY = this.y + 1;
            if (newY > planet.giveMaxY()) {
                newY = planet.giveMinY();
            }
        }
        if (direction.equals("west")) {
            newX = this.x + 1;
            if (newX > planet.giveMaxX()) {
                newX = planet.giveMinX();
            }
        }
        if (direction.equals("east")) {
            newX = this.x - 1;
            if (newX < planet.giveMinX()) {
                newX = planet.giveMaxX();
            }
        }
        return new Position(newX, newY);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
