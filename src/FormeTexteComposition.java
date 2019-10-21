
public class FormeTexteComposition implements Forme {

	private VueTexte vt;
	
	public FormeTexteComposition (String txt) {
		this.vt = new VueTexte(txt);
	}
	
	@Override
	public void afficherForme() {
		System.out.println(this.vt.afficherTexte());
	}

	@Override
	public IEditeurForme editer() {
		this.vt.editerTexte("Je change de texte");
		return null;
	}

	@Override
	public IManipulateurForme creerManipulateur() {
		System.out.println("Je bouge le texte suivant : "+this.vt.afficherTexte());
		return null;
	}

}
