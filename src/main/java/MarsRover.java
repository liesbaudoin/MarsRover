/**
 * Created by Lies on 4-4-2017.
 */
public class MarsRover {
    private int x;
    private int y;
    private Planet planet;
    private String direction;

    public MarsRover(int x, int y, Planet planet, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.planet = planet;
    }

    public void forward() {
        if (direction.equals("north")) {
            y = y + 1;
            if (y > planet.giveMaxY()) {
                y = planet.giveMinY();
            }
        }

        if (direction.equals("south")) {
            y = y - 1;
            if (y < planet.giveMinY()) {
                y = planet.giveMaxY();
            }
        }
        if (direction.equals("east")) {
            x = x + 1;
            if (x > planet.giveMaxX()) {
                x = planet.giveMinX();
            }
        }
        if (direction.equals("west")) {
            x = x - 1;
            if (x < planet.giveMinX()) {
                x = planet.giveMaxX();
            }
        }

    }

    public void backward() {
        if (direction.equals("north")) {
            y = y - 1;
            if (y < planet.giveMinY()) {
                y = planet.giveMaxY();
            }
        }
        if (direction.equals("south")) {
            y = y + 1;
            if (y > planet.giveMaxY()) {
                y = planet.giveMinY();
            }
        }
        if (direction.equals("west")) {
            x = x + 1;
            if (x > planet.giveMaxX()) {
                x = planet.giveMinX();
            }
        }
        if (direction.equals("east")) {
            x = x - 1;
            if (x < planet.giveMinX()) {
                x = planet.giveMaxX();
            }
        }
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

private void stayPutWhenFacesObstacle(){
        if(planet.locationHasObstacle(x, y)){

    }
}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
