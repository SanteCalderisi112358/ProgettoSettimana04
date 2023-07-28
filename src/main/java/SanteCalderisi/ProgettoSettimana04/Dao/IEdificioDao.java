package SanteCalderisi.ProgettoSettimana04.Dao;

import java.util.List;

import SanteCalderisi.ProgettoSettimana04.Entities.Edificio;
import SanteCalderisi.ProgettoSettimana04.Entities.User;
import SanteCalderisi.ProgettoSettimana04.ExceptionCustom.ItemNotFoundException;

public interface IEdificioDao {
	public void save(Edificio edificio);

	public void findByIdAndUpdate(int id, User user) throws ItemNotFoundException;

	public void findByIdAndDelete(int id) throws ItemNotFoundException;

	public User findById(int id) throws ItemNotFoundException;

	public List<Edificio> findAll();

	public long count();

	public List<Edificio> findByPartialNomeIgnoreCase(String name);
}
