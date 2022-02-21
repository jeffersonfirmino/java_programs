package lab04;

import static org.junit.Assert.*;

import org.junit.Test;

public class MusicaTest {

	@Test
	public void testMusica() {
		Musica chandelier = new Musica("Chandelier", 3, "Pop");
		Musica elasticHeart = new Musica("Elastic Heart", 3, "Pop");
		Musica cellophane = new Musica("Cellophane", 4, "Pop");

		assertEquals("Chandelier", chandelier.getTitulo());
		assertTrue(3, chandelier.getDuracao());
		assertEquals("Pop", chandelier.getGenero());

		assertEquals("Elastic Heart", elasticHeart.getTitulo());
		assertTrue(3, elasticHeart.getDuracao());
		assertEquals("Pop", elasticHeart.getGenero());

		assertEquals("Cellophane", cellophane.getTitulo());
		assertTrue(4, cellophane.getDuracao());
		assertEquals("Pop", cellophane.getGenero());

		Musica chandelierRemix = new Musica("Chandelier", 3, "Pop");
		assertTrue(chandelier, chandelierRemix);
		assertFalse(chandelier.equals(cellophane));
	}

	@Test
	public void testEquals() {
		Musica chandelier = new Musica("Chandelier", 3, "Pop");
		Musica elasticHeart = new Musica("Elastic Heart", 3, "Pop");
		Musica cellophane = new Musica("Cellophane", 4, "Pop");

		assertTrue(chandelier, new Musica("Chandelier", 3, "Pop"));
		assertTrue(chandelier, new Musica("Chandelier", 3, "Pop-rock"));
		assertNotEquals(elasticHeart, chandelier);
		assertNotEquals(elasticHeart, cellophane);
	}

}
