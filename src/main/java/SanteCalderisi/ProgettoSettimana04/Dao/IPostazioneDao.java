package SanteCalderisi.ProgettoSettimana04.Dao;

import java.util.List;

import SanteCalderisi.ProgettoSettimana04.Entities.Postazione;
import SanteCalderisi.ProgettoSettimana04.Entities.TipoPostazione;
import SanteCalderisi.ProgettoSettimana04.ExceptionCustom.ItemNotFoundException;

public interface IPostazioneDao {
	public void save(Postazione postazione);

	public void findByIdAndUpdate(int id, Postazione postazione) throws ItemNotFoundException;

	public void findByIdAndDelete(int id) throws ItemNotFoundException;

	public Postazione findById(int id) throws ItemNotFoundException;

	public List<Postazione> findAll();

	public long count();

	public List<Postazione> findByTipoPostazione(TipoPostazione tipoPostazione);
}
