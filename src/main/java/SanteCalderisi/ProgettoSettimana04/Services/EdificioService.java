package SanteCalderisi.ProgettoSettimana04.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SanteCalderisi.ProgettoSettimana04.Dao.IEdificioDao;
import SanteCalderisi.ProgettoSettimana04.Entities.Edificio;
import SanteCalderisi.ProgettoSettimana04.Entities.User;
import SanteCalderisi.ProgettoSettimana04.ExceptionCustom.ItemNotFoundException;
import SanteCalderisi.ProgettoSettimana04.Repositories.EdificioRepository;

@Service
public class EdificioService implements IEdificioDao {
	@Autowired
	EdificioRepository edificioRepo;
	@Override
	public void save(Edificio edificio) {
		edificioRepo.save(edificio);
		System.err.println("L'edificio " + edificio.getNome() + " in " + edificio.getIndirizzo() + ", "
				+ edificio.getCitta() + ", è stato salvato correttamente!");

	}

	@Override
	public void findByIdAndUpdate(int id, User user) throws ItemNotFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void findByIdAndDelete(int id) throws ItemNotFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public User findById(int id) throws ItemNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Edificio> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public List<Edificio> findByPartialNomeIgnoreCase(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
