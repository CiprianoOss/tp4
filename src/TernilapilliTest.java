import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

class TernilapilliTest {

	@Test public void test01 () {
		Ternilapilli game = new Ternilapilli();
		
		assertTrue(game.getXs().isEmpty());
		assertTrue(game.getOs().isEmpty());
		
	}
	@Test public void test02 () {
	Ternilapilli game = new Ternilapilli();
	game.putXAt(new Position(1,1));

	assertEquals(1, game.getXs().size());
	assertTrue(game.getXs().contains(new Position(1, 1)));
	assertTrue(game.getOs().isEmpty());

}
	@Test public void test03 () {
		Ternilapilli game = new Ternilapilli();
		game.putXAt(new Position(1,1));
		game.putOAt( new Position(2,2));

		assertEquals(1, game.getXs().size());
		assertTrue(game.getXs().contains(new Position(1, 1)));
		assertEquals(1, game.getOs().size());
		assertTrue(game.getOs().contains(new Position(2, 2)));
	}
	@Test public void test04 () {
		Ternilapilli game = new Ternilapilli();
		game.putXAt(new Position(1,1));	
		
		try {
			game.putXAt(new Position(2,2));
			fail();
		}
		catch(RuntimeException anError) {
			assertEquals(Ternilapilli.notXTurnErrorMessage, anError.getMessage());
			assertEquals(1, game.getXs().size());
			assertTrue(game.getXs().contains(new Position(1,1)));
			assertTrue(game.getOs().isEmpty());
		}
		
		
		
		

	
	
	
	
}
		
	}