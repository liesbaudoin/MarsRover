/**
 * Created by Lies on 4-4-2017.
 */
public class MarsRover {
    private Planet planet;
    private String direction;
    private Position position;

    public MarsRover(int x, int y, Planet planet, String direction) {
        position = new Position(x, y);
        this.direction = direction;
        this.planet = planet;
    }

    public void forward() {
        Position nextPosition = position.nextPositionForward(this.direction, this.planet);
        if (planet.locationHasObstacle(nextPosition.getX(), nextPosition.getY())) {
            return;
        }
            this.position = nextPosition;
        }



    public void backward() {
        Position nextPosition = this.position.nextPositionBackward(this.direction, this.planet);

        if (this.planet.locationHasObstacle(nextPosition.getX(), nextPosition.getY())) {
            return;
        }
        this.position = nextPosition;

    }

    public void left() {
        if (direction.equals("north")) {
            direction = "west";
            return;
        }
        if (direction.equals("south")) {
            direction = "east";
            return;
        }
        if (direction.equals("west")) {
            direction = "south";
            return;
        }
        if (direction.equals("east")) {
            direction = "north";
            return;
        }
    }

    public void right() {
        if (direction.equals("north")) {
            direction = "east";
            return;
        }
        if (direction.equals("south")) {
            direction = "west";
            return;
        }
        if (direction.equals("west")) {
            direction = "north";
            return;
        }
        if (direction.equals("east")) {
            direction = "south";
            return;
        }
    }


    public String getDirection() {
        return direction;
    }

    public int giveY() {
        return position.getY();
    }

    public int giveX() {
        return position.getX();
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
