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

	public void save(Postazione postazione) {
		postazioneRepo.save(postazione);
		System.err.println("La postazione: " + postazione + " è stata salvata correttamente!");
	}



	@Override
	public Postazione findById(int id) throws ItemNotFoundException {

		return postazioneRepo.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
	}

	public void findByTipoPostazione(TipoPostazione tipoPostazione) {

		List<Postazione> postazioniPerTipo = postazioneRepo.findByTipoPostazione(tipoPostazione);

		for (Postazione postazione : postazioniPerTipo) {
			System.out.println(postazione.toString());
		}
	}


}
