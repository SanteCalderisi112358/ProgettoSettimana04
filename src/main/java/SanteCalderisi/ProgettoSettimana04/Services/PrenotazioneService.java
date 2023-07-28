package SanteCalderisi.ProgettoSettimana04.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SanteCalderisi.ProgettoSettimana04.Entities.Postazione;
import SanteCalderisi.ProgettoSettimana04.Entities.Prenotazione;
import SanteCalderisi.ProgettoSettimana04.Entities.User;
import SanteCalderisi.ProgettoSettimana04.ExceptionCustom.ItemNotFoundException;
import SanteCalderisi.ProgettoSettimana04.Repositories.PrenotazioneRepository;
import jakarta.persistence.PersistenceContext;

@Service
public class PrenotazioneService {
	@Autowired
	PrenotazioneRepository prenotazioneRepo;

	@Autowired
	UserService userServ;

	@Autowired
	PostazioneService postazioneSrv;
	@PersistenceContext


	// Ho istanziato e salvato tutte le postazioni con un attributo "libero"=TRUE.
	// Questo metodo
	// serve per salvare la prenotazione (associata ad un user e postazione) e
	// cambiare lo stato
	// della postazione da TRUE a FAlSE

	public void saveAndUpdatePostazioneAndUser(Prenotazione prenotazione, UserService userSrv,
			PostazioneService postazioneSrv) throws ItemNotFoundException {

		int postazioneId = prenotazione.getPostazione().getId();
		System.err.println("Postazione Id: " + postazioneId);
		int userId = prenotazione.getUser().getId();
		System.err.println("Utente id: " + userId);
		Postazione postazione = postazioneSrv.findById(postazioneId);
		User user = userSrv.findById(userId);
		System.err.println(postazione);
		System.err.println(user);


			if (postazione.isLibero()) {
				System.err.println("La postazione " + postazione.getId() + " è libera!");
				postazione.setLibero(false);


				postazioneSrv.save(postazione);
				userSrv.save(user);

				prenotazioneRepo.save(prenotazione);
				System.err.println("Prenotazione salvata!");
			} else {
				System.err.println("La postazione scelta è occupata");
			}
		}

	}



