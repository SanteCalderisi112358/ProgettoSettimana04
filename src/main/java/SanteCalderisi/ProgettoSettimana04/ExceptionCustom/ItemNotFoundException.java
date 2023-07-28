package SanteCalderisi.ProgettoSettimana04.ExceptionCustom;
public class ItemNotFoundException extends Exception {

	public ItemNotFoundException(int id) {
		super("Elemento con id: " + id + " non trovato");
	}
}
