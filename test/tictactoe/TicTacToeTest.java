
package tictactoe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author priscillajoye
 */
public class TicTacToeTest {
    
    public TicTacToeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    /**
     * Test of CreateBoard method, of class TicTacToe.
     */
    @Test
    public void testCreateBoard() {
        System.out.println("CreateBoard");
        TicTacToe t = new TicTacToe();
        int result = t.CreateBoard();
        assertEquals(9, result);
    }

    /**
     * Test of CurrentPlayer method, of class TicTacToe.
     */
    @Test
    public void testCurrentPlayer() {
        System.out.println("CurrentPlayer");
        Player p = new Player("X");
        String result = TicTacToe.CurrentPlayer(p);
        assertEquals("X", result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ChangePlayer method, of class TicTacToe.
     */
    @Test
    public void testChangePlayer() {
        System.out.println("ChangePlayer");
        Player p = new Player("X");
        String result = TicTacToe.ChangePlayer(p);
        assertEquals("O", result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of MakeMove method, of class TicTacToe.
     */
    @Test
    public void testMakeMove() {
        System.out.println("MakeMove");
        Player p = new Player("X");
        TicTacToe.MakeMove(p);
        //not really sure how to test since there wouldnt be an output?
    }

    /**
     * Test of SpaceInUse method, of class TicTacToe.
     */
    @Test
    public void testSpaceInUse() {
        System.out.println("SpaceInUse");
        int col = 0;
        int row = 0;
        boolean expResult = false;
        boolean result = TicTacToe.SpaceInUse(col, row);
        assertEquals(expResult, result);
    }
    
}
