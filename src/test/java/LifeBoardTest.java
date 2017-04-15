import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by clay on 4/15/17.
 */
public class LifeBoardTest {

    private LifeBoard board;

    @Before
    public void setUp() {
        board = new LifeBoard();
        board.clear();
    }

    @Test
    public void clear_byDefault_setsAllValuesToFalse() {
        board.set(10, 10, 1);
        board.clear();
        assertThat(board.at(10,10), is(0));
    }

    @Test
    public void at_forATrueCell_returnsOne() {
        board.set(10, 10, 1);
        assertThat(board.at(10, 10), is(1));
    }

    @Test
    public void at_forFalseCell_returnsZero() {
        board.set(10, 10, 0);
        assertThat(board.at(10, 10), is(0));
    }

    @Test
    public void set_givenZero_willReturnZeroFromAt() {
        board.set(10, 10, 1);
        board.set(10, 10, 0);
        assertThat(board.at(10, 10), is(0));
    }

}