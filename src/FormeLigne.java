
public class FormeLigne implements Forme {

	@Override
	public void afficherForme() {
		System.out.println("Je suis une ligne");
		
	}

	@Override
	public IEditeurForme editer() {
		System.out.println("J'édite une ligne");
		return null;
	}

	@Override
	public IManipulateurForme creerManipulateur() {
		System.out.println("Je bouge une ligne");
		return null;
	}

}
