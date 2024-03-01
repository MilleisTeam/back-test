package fr.milleis.testback;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TestBackApplicationTests {

	@Test
	public void testOK() {
		// ce test doit prouver quand lorsque l'on pose un boolean a true dans la
		// matrice en position (2,2) alors le boolean doit se répandre autour (diagonale
		// incluse )
		boolean[][] matrice = {
				{ false, false, false, false, false },
				{ false, false, false, false, false },
				{ false, false, false, false, false },
				{ false, false, false, false, false },
				{ false, false, false, false, false }
		};

		var expected = new boolean[][] {
				{ false, false, false, false, false },
				{ false, true, true, true, false },
				{ false, true, true, true, false },
				{ false, true, true, true, false },
				{ false, false, false, false, false }
		};

		var result = new InkCase().ink(2, 2, matrice);
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				assertEquals(expected[i][j], result[i][j]);
			}
		}
	}

	@Test
	public void testNoThrow() {
		// ce test doit prouver quand lorsque l'on pose un boolean a true dans la
		// matrice en position (0,0) alors le boolean doit se répandre autour (diagonale
		// incluse ) sans faire de array out of bound exception
		boolean[][] matrice = {
				{ false, false, false, false, false },
				{ false, false, false, false, false },
				{ false, false, false, false, false },
				{ false, false, false, false, false },
				{ false, false, false, false, false }
		};
		boolean[][] expected = {
				{ true, true, false, false, false },
				{ true, true, false, false, false },
				{ false, false, false, false, false },
				{ false, false, false, false, false },
				{ false, false, false, false, false }
		};

		var result = assertDoesNotThrow(() -> new InkCase().ink(0, 0, matrice));

	 

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				assertEquals(expected[i][j], result[i][j]);
			}
		}
	}

	@Test
	public void testThrow() {
		// Ce test doit prouver que si on passe un index en paramètre hors du tableau ,
		// ça doit créer une exception de type ParamtersException ( custom class )
		boolean[][] matrice = {
				{ false, false, false, false, false },
				{ false, false, false, false, false },
				{ false, false, false, false, false },
				{ false, false, false, false, false },
				{ false, false, false, false, false }
		};

		// décommenter ce code quand l'exception aura été créer
		// assertThrows(ParamtersException.class, () -> new InkCase().ink(-1, 4,
		// matrice));

	}

}
