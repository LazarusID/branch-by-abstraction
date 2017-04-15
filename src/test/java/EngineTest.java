import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by clay on 4/15/17.
 */
public class EngineTest {

    static final int X_POINT = 10;
    static final int Y_POINT = 10;

    private Engine engine;

    @Before
    public void setUp() {
        engine = new Engine();

        for(int x=0; x < board.X_MAX; ++x) {
            for(int y=0; y < board.Y_MAX; ++y) {
                board.value[x][y] = false;
            }
        }

    }

    @Test
    public void neighbors_givenEmptyBoard_returnsZero() {
        assertThat(engine.neighbors(X_POINT, Y_POINT), is(0));
    }

    @Test
    public void neighbors_givenOneNeighbor_returnsOne() {
        board.value[9][9] = true;
        assertThat(engine.neighbors(X_POINT, Y_POINT), is(1));
    }

    @Test
    public void neighbors_givenSurroundedCell_returnsEight() {
        for(int x=-1; x < 2; ++x) {
            for(int y=-1; y < 2; ++y) {
                if (!(0 == x && 0 == y)) {
                    board.value[x + X_POINT][y + Y_POINT] = true;
                }
            }
        }
        assertThat(engine.neighbors(X_POINT, Y_POINT), is(8));
    }

    @Test
    public void neighbors_givenLiveCell_doesNotCountItself() {
        board.value[X_POINT][Y_POINT] = true;
        assertThat(engine.neighbors(X_POINT, Y_POINT), is(0));
    }

}