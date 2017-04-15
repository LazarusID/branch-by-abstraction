/**
 * Created by clay on 4/15/17.
 */
public class Engine {

    int neighbors(int x, int y) {
        int count = 0;

        for(int i=-1; i < 2; ++i) {
            for(int j=-1; j < 2; ++j) {
                if (!(0 == i && 0 == j))
                if (LifeBoard.value[x + i][y + j]) {
                    ++count;
                }
            }
        }
        return count;
    }
}
