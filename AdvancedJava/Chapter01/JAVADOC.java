/**
 * Represents a Point in the application.
 */
public class JAVADOC {
    int x;
    int y;

    JAVADOC(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the x-coordinate of the point.
     *
     * @return the x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Returns the y-coordinate of the point.
     *
     * @return the y-coordinate
     */
    public int getY() {
        return y;
    }

    public static void main(String[] args) {
        JAVADOC p = new JAVADOC(23, 45);
    }
}