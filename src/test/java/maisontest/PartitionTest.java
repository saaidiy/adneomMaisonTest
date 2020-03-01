/**
 * 
 */
package maisontest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author admin
 *
 */
public class PartitionTest {

	/**
	 * Test method for {@link maisontest.MaisonTest#partition(int[], int)}.
	 */
	@Test
	public void testPartition() {
		
		int[] liste = { 1, 2, 3, 4, 5, 6 };
		int taille = 4;
		int[][] sousListes = MaisonTest.partition(liste, taille);
		
		int[] lastPartition = sousListes[sousListes.length - 1];
		int[] expectedLastPartition = {5, 6};
		 
		assertEquals(2 , sousListes[sousListes.length - 1].length);
		assertEquals(expectedLastPartition.length , sousListes.length);
		assertArrayEquals(expectedLastPartition, lastPartition);
		
	}

}
