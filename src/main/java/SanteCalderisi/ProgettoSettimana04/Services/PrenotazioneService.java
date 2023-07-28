package SanteCalderisi.ProgettoSettimana04.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SanteCalderisi.ProgettoSettimana04.Entities.Prenotazione;
import SanteCalderisi.ProgettoSettimana04.Repositories.PrenotazioneRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class PrenotazioneService {
	@Autowired
	PrenotazioneRepository prenotazioneRepo;
	@PersistenceContext
	private EntityManager entityManager;

	public void saveAndUpdatePostazione(Prenotazione prenotazione) {
		prenotazioneRepo.save(prenotazione);


		if (prenotazione.getPostazione() != null) {
			String updateQuery = "UPDATE Postazione p SET p.libero = false WHERE p.id = :postazioneId";
			entityManager.createQuery(updateQuery).setParameter("postazioneId", prenotazione.getPostazione().getId())
					.executeUpdate();
		}
	}

}
