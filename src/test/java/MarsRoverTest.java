import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Lies on 4-4-2017.
 */
public class MarsRoverTest {
    private Planet planet;
    @Before
    public void setup(){
        this.planet = new Planet(5, 5);
    }

    @Test
    public void testForwardWhenDirectionIsNorth() {
        MarsRover marsrover = new MarsRover(0, 0,planet, "north");
        marsrover.forward();
        Assert.assertEquals(1,marsrover.getY());
    }

    @Test
    public void testForwardWhenDirectionIsSouth() {
        MarsRover marsrover = new MarsRover(0, 1,planet,  "south");
        marsrover.forward();
        Assert.assertEquals(0, marsrover.getY());
    }

    @Test
    public void testBackwardWhenDirectionIsNorth() {
        MarsRover marsrover = new MarsRover(0, 1,planet,  "north");
        marsrover.backward();
        Assert.assertEquals(0, marsrover.getY());
    }

    @Test
    public void testBackwardWhenDirectionIsSouth() {
        MarsRover marsrover = new MarsRover(0, 0,planet, "south");
        marsrover.backward();
        Assert.assertEquals(1, marsrover.getY());
    }

    @Test
    public void testForwardWhenDirectionIsWest() {
        MarsRover marsrover = new MarsRover(1, 0,planet,"west");
        marsrover.forward();
        Assert.assertEquals(0, marsrover.getX());
    }

    @Test
    public void testBackwardWhenDirectionIsWest() {
        MarsRover marsrover = new MarsRover(0, 0,planet,  "west");
        marsrover.backward();
        Assert.assertEquals(1, marsrover.getX());
    }
    @Test
    public void testForwardWhenDirectionIsEast() {
        MarsRover marsrover = new MarsRover(0, 0, planet,"east");
        marsrover.forward();
        Assert.assertEquals(1,marsrover.getX());
    }

    @Test
    public void testBackwardWhenDirectionIsEast() {
        MarsRover marsrover = new MarsRover(1, 0,planet, "east");
        marsrover.backward();
        Assert.assertEquals(0,marsrover.getX());
    }
    @Test
    public void testLeftWhenDirectionIsNorth(){
        MarsRover marsrover = new MarsRover(0, 0,planet,  "north");
        marsrover.left();
        Assert.assertEquals("west", marsrover.getDirection());
    }
    @Test
    public void testLeftWhenDirectionIsSouth(){
        MarsRover marsrover = new MarsRover(0, 0,planet,  "south");
        marsrover.left();
        Assert.assertEquals("east", marsrover.getDirection());
    }
    @Test
    public void testLeftWhenDirectionIsWest(){
        MarsRover marsrover = new MarsRover(0, 0,planet,  "west");
        marsrover.left();
        Assert.assertEquals("south", marsrover.getDirection());
    }
    @Test
    public void testLeftWhenDirectionIsEast(){
        MarsRover marsrover = new MarsRover(0, 0,planet, "east");
        marsrover.left();
        Assert.assertEquals("north", marsrover.getDirection());
    }

    @Test
    public void testRightWhenDirectionIsNorth(){
        MarsRover marsrover = new MarsRover(0, 0,planet,  "north");
        marsrover.right();
        Assert.assertEquals("east", marsrover.getDirection());
    }
    @Test
    public void testRightWhenDirectionIsSouth(){
        MarsRover marsrover = new MarsRover(0, 0,planet,  "south");
        marsrover.right();
        Assert.assertEquals("west", marsrover.getDirection());
    }
    @Test
    public void testRightWhenDirectionIsWest(){
        MarsRover marsrover = new MarsRover(0, 0,planet,  "west");
        marsrover.right();
        Assert.assertEquals("north", marsrover.getDirection());
    }
    @Test
    public void testRightWhenDirectionIsEast(){
        MarsRover marsrover = new MarsRover(0, 0, planet, "east");
        marsrover.right();
        Assert.assertEquals("south", marsrover.getDirection());
    }
    @Test
    public void testForwardWhenDirectionIsNorthOverEdge() {
        MarsRover marsrover = new MarsRover(0, 0,planet, "north");
        marsrover.setY(planet.giveMaxX());
        marsrover.forward();
        Assert.assertEquals(planet.giveMinY(), marsrover.getY());
    }
    @Test
    public void testForwardWhenDirectionIsSouthOverEdge() {
        MarsRover marsrover = new MarsRover(0, 0,planet,  "south");
        marsrover.setY(planet.giveMinY());
        marsrover.forward();
        Assert.assertEquals(planet.giveMaxY(), marsrover.getY());
    }
    @Test
    public void testForwardWhenDirectionIsEastOverEdge() {
        MarsRover marsrover = new MarsRover(0, 0,planet,"east");
        marsrover.setX(planet.giveMaxX());
        marsrover.forward();
        Assert.assertEquals(planet.giveMinX(), marsrover.getX());
    }
    @Test
    public void testForwardWhenDirectionIsWestOverEdge() {
        MarsRover marsrover = new MarsRover(0, 0,planet, "west");
        marsrover.setX(planet.giveMinX());
        marsrover.forward();
        Assert.assertEquals(planet.giveMaxY(), marsrover.getX());
    }
    @Test
    public void testBackwardWhenDirectionIsNorthOverEdge() {
        MarsRover marsrover = new MarsRover(0, 0,planet,"north");
        marsrover.setY(planet.giveMinY());
        marsrover.backward();
        Assert.assertEquals(planet.giveMaxY(), marsrover.getY());
    }
    @Test
    public void testBackwardWhenDirectionIsSouthOverEdge() {
        MarsRover marsrover = new MarsRover(0, 0, planet,"south");
        marsrover.setY(planet.giveMaxY());
        marsrover.backward();
        Assert.assertEquals(planet.giveMinY(), marsrover.getY());
    }
    @Test
    public void testBackwardWhenDirectionIsEastOverEdge() {
        MarsRover marsrover = new MarsRover(0, 0,planet,"east");
        marsrover.setX(planet.giveMinX());
        marsrover.backward();
        Assert.assertEquals(planet.giveMaxX(), marsrover.getX());
    }
    @Test
    public void testBackwardWhenDirectionIsWestOverEdge() {
        MarsRover marsrover = new MarsRover(0, 0,planet,"west");
        marsrover.setX(planet.giveMaxX());
        marsrover.backward();
        Assert.assertEquals(planet.giveMinX(), marsrover.getX());
    }
    @Test
    public void testRemainsAtLocationWhenFacesObstacle(){
        MarsRover marsRover = new MarsRover(0,0,planet,"east");
        planet.putObstacle(1,0);
        marsRover.forward();
        Assert.assertEquals(0, marsRover.getX());
    }
}
