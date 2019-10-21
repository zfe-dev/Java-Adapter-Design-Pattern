
public class Main {

	public static void main(String[] args) {
		Forme txt = new FormeTexteHeritage("text Heritage");
		Forme txt2 = new FormeTexteComposition("text Composition");
		Forme ligne = new FormeLigne();
		
		txt.afficherForme();
		txt2.afficherForme();
		ligne.afficherForme();
	}

}
