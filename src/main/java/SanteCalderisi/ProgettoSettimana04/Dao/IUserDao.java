package SanteCalderisi.ProgettoSettimana04.Dao;

import java.util.List;

import SanteCalderisi.ProgettoSettimana04.Entities.User;
import SanteCalderisi.ProgettoSettimana04.ExceptionCustom.ItemNotFoundException;

public interface IUserDao {
	public void save(User user);

	public void findByIdAndUpdate(int id, User user) throws ItemNotFoundException;

	public void findByIdAndDelete(int id) throws ItemNotFoundException;

	public User findById(int id) throws ItemNotFoundException;

	public List<User> findAll();

	public long count();

	public List<User> findByPartialNameIgnoreCase(String name);
}
