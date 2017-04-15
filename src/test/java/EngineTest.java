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
    private LifeBoard board;

    @Before
    public void setUp() {
        board = new LifeBoard();
        engine = new Engine(board);

        board.clear();
    }

    @Test
    public void neighbors_givenEmptyBoard_returnsZero() {
        assertThat(engine.neighbors(X_POINT, Y_POINT), is(0));
    }

    @Test
    public void neighbors_givenOneNeighbor_returnsOne() {
        board.set(9,9, 1);
        assertThat(engine.neighbors(X_POINT, Y_POINT), is(1));
    }

    @Test
    public void neighbors_givenSurroundedCell_returnsEight() {
        for(int x=-1; x < 2; ++x) {
            for(int y=-1; y < 2; ++y) {
                if (!(0 == x && 0 == y)) {
                    board.set(x + X_POINT, y + Y_POINT, 1);
                }
            }
        }
        assertThat(engine.neighbors(X_POINT, Y_POINT), is(8));
    }

    @Test
    public void neighbors_givenLiveCell_doesNotCountItself() {
        board.set(X_POINT, Y_POINT, 1);
        assertThat(engine.neighbors(X_POINT, Y_POINT), is(0));
    }

}