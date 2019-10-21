
public class Polygone implements Forme {

	@Override
	public void afficherForme() {
		System.out.println("Je suis un polygone");
	}

	@Override
	public IEditeurForme editer() {
		System.out.println("J'édite un polygone");
		return null;
	}

	@Override
	public IManipulateurForme creerManipulateur() {
		System.out.println("Je manipule un polygone");
		return null;
	}

}
