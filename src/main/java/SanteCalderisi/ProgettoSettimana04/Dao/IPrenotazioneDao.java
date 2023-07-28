package SanteCalderisi.ProgettoSettimana04.Dao;

import java.util.List;

import SanteCalderisi.ProgettoSettimana04.Entities.Prenotazione;
import SanteCalderisi.ProgettoSettimana04.ExceptionCustom.ItemNotFoundException;

public interface IPrenotazioneDao {
	public void save(Prenotazione prenotazione);

	public void findByIdAndUpdate(int id, Prenotazione prenotazione) throws ItemNotFoundException;

	public void findByIdAndDelete(int id) throws ItemNotFoundException;

	public Prenotazione findById(int id) throws ItemNotFoundException;

	public List<Prenotazione> findAll();

	public long count();

	public List<Prenotazione> findByPartialLibero(boolean libero);
}
