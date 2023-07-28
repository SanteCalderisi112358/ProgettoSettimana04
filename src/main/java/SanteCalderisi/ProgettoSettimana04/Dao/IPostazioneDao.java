package SanteCalderisi.ProgettoSettimana04.Dao;

import SanteCalderisi.ProgettoSettimana04.Entities.Postazione;
import SanteCalderisi.ProgettoSettimana04.ExceptionCustom.ItemNotFoundException;

public interface IPostazioneDao {
	public void save(Postazione postazione);

	public Postazione findById(int id) throws ItemNotFoundException;


}
