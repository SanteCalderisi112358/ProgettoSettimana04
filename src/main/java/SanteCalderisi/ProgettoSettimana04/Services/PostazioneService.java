package SanteCalderisi.ProgettoSettimana04.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SanteCalderisi.ProgettoSettimana04.Dao.IPostazioneDao;
import SanteCalderisi.ProgettoSettimana04.Entities.Postazione;
import SanteCalderisi.ProgettoSettimana04.Entities.TipoPostazione;
import SanteCalderisi.ProgettoSettimana04.ExceptionCustom.ItemNotFoundException;
import SanteCalderisi.ProgettoSettimana04.Repositories.PostazioneRepository;

@Service
public class PostazioneService implements IPostazioneDao {
	@Autowired
	PostazioneRepository postazioneRepo;

	@Override
	public void save(Postazione postazione) {
		postazioneRepo.save(postazione);
		System.err.println("La postazione: " + postazione.toString() + " è stato salvato correttamente!");

	}

	@Override
	public void findByIdAndUpdate(int id, Postazione postazione) throws ItemNotFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void findByIdAndDelete(int id) throws ItemNotFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public Postazione findById(int id) throws ItemNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Postazione> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Postazione> findByTipoPostazione(TipoPostazione tipoPostazione) {
		// TODO Auto-generated method stub
		return null;
	}

}
