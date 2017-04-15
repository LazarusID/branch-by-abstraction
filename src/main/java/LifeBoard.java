/**
 * Created by clay on 4/15/17.
 */
public class LifeBoard implements Board {
    public static final int X_MAX = 50;
    public static final int Y_MAX = 50;
    static public boolean[][] value = new boolean[X_MAX][Y_MAX];


    public void clear() {
        for(int x=0; x < X_MAX; ++x) {
            for(int y=0; y < Y_MAX; ++y) {
                value[x][y] = false;
            }
        }
    }

    public int at(int x, int y) {
        if (value[x][y]) {
            return 1;
        }
        return 0;
    }

    public void set(int x, int y, int value) {
        if (0 == value) {
            this.value[x][y] = false;
        } else {
            this.value[x][y] = true;
        }
    }
}
