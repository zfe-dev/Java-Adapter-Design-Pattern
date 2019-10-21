
public class FormeTexteHeritage extends VueTexte implements Forme {
	
	public FormeTexteHeritage (String txt) {
		super(txt);
	}
	
	@Override
	public void afficherForme() {
		System.out.println(this.afficherTexte());
	}

	@Override
	public IEditeurForme editer() {
		this.editerTexte("Je change de texte");
		return null;
	}

	@Override
	public IManipulateurForme creerManipulateur() {
		System.out.println("Je bouge le texte suivant : "+this.afficherTexte());
		return null;
	}

}