package maisontest;

import java.util.Arrays;

/**
 * Cette classe contient une methode � partition � prend un param�tre � liste �
 * et un param�tre � taille � et retourne une liste de sous liste, o� chaque
 * sous liste a au maximum � taille � �l�ments.
 *
 * @author Saaidi Yassine
 */
public abstract class MaisonTest {

	/**
	 * allouer la m�moire et ajouter une valeur automatiquement � la fin
	 *
	 * @param liste   le tableau d'origine
	 * @param element la valeur � ajouter
	 * @return une copie du tableau d'origine compl�t�e par la valeur ajouter
	 */
	private static int[] addElement(int[] liste, int element) {
		liste = Arrays.copyOf(liste, liste.length + 1);
		liste[liste.length - 1] = element;
		return liste;
	}

	/**
	 * allouer la m�moire et ajouter une liste d'entiers automatiquement � la fin
	 *
	 * @param liste    le tableau � deux dimensions d'origine
	 * @param elements la liste d'entiers � ajouter
	 * @return une copie du tableau d'origine compl�t�e par une liste d'entiers
	 */
	private static int[][] addElements(int[][] liste, int[] elements) {
		liste = Arrays.copyOf(liste, liste.length + 1);
		liste[liste.length - 1] = elements;
		return liste;
	}

	/**
	 * � partition � prend un param�tre � liste � et un param�tre � taille � et
	 * retourne une liste de sous liste, o� chaque sous liste a au maximum � taille
	 * � �l�ments.
	 *
	 * @param table  la liste d'origine
	 * @param taille la taille des sous listes
	 * @return liste de sous liste, o� chaque sous liste a au maximum � taille �
	 *         �l�ments.
	 */
	public static int[][] partition(int[] table, int taille) {
		if (table == null) {
			return null;
		} else if (taille == 0 || taille > table.length) {
			int result[][] = { table };
			return result;
		} else {
			int result[][] = new int[0][0];
			int temp[] = {};
			for (int element : table) {
				temp = addElement(temp, element);
				if (temp.length == taille) {
					result = addElements(result, temp);
					temp = new int[0];
				}
			}
			if (temp.length > 0) {
				result = addElements(result, temp);
			}
			return result;
		}
	}

}
