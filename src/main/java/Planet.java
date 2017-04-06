/**
 * Created by Lies on 5-4-2017.
 */
public class Planet {
    private boolean[][] planet;

    public Planet(int maxX, int maxY) {
        planet = new boolean[maxX][maxY];
    }

    public int giveMaxX() {
        return planet.length -1;
    }
    public int giveMinX(){
        return 0;
    }

    public int giveMaxY() {
        return planet[0].length-1;
    }
    public int giveMinY(){
        return 0;
    }
    public void putObstacle(int x, int y){
        planet[x][y]=true;
    }
    public boolean locationHasObstacle(int x, int y){
        return planet[x][y] == true;
    }
}
