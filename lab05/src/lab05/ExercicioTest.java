package lab05;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExercicioTest {

	private Exercicio exc1, exc2;

	
	@Before
	public void criaExercicio() {
		try {
			
			exc1 = new Exercicio("abdominal", 0);
			fail("Deveria ter lancado excecao de valor");

			
		} catch (Exception e) {
	
			assertEquals("Mensagem de excecao capturada.","Calorias por hora do exercicio nao pode ser zero ou menor do que zero", e.getMessage());

			
			
			try {
				
				exc2 = new Exercicio(null, 200);
				fail("Deveria ter lancado excecao de nome");

				
			} catch (Exception exp) {
		
				assertEquals("Mensagem de excecao capturada.","O nome do exercicio não pode ser null", exp.getMessage());

				
			}
		
		}
	}


	@Test
	public void testExercicio() {
	    
		assertEquals("Nome do exercicio esta errado.", 
	                 "Abdominal",exc1.getNome());
	
	
	    assertEquals("Cph do exercicio esta errada.", 200, exc1.getCph());
	
	}

	
	@Test
	
	public void testsetCph(){
		
		try {
			
			exc2.setCph(0);
			
			fail("Deveria ter lancado excecao de valor");
			
			
		} catch (Exception e) {
			
			assertEquals("Mensagem de excecao capturada","Calorias por hora do exercicio nao pode ser zero ou menor do que zero",e.getMessage());
			
		}
	}
	
	@Test
	public void testCalPerHoras() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
			
		assertEquals("testando toString","abdominal : 0 kcal/h" ,exc1.getNome() + ": " + exc1.getCph() + " kcal/h");
		
	}

}
