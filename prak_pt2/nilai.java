package prak_pt2;

public class nilai {
    private static int x;
    private static int y;
    private static int z;

    // setter
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    // getter
    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static int getZ() {
        return z;
    }

    // Rumus
    public static int kelilingPersegi() {
        int total = getX() * getX();
        return total;
    }

    public static int luasPersegiPanjang() {
        int total = getX() * getY();
        return total;
    }
}
