
public class VueTexte {
	public String forme;
	public VueTexte(String txt) {
		this.forme = txt;
	}
	
	public String afficherTexte() {
		return forme.toString();
	}
	
	public void editerTexte (String text) {
		this.forme = text;
	}
}
