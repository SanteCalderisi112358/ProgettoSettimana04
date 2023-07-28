package SanteCalderisi.ProgettoSettimana04.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import SanteCalderisi.ProgettoSettimana04.Entities.Postazione;
import SanteCalderisi.ProgettoSettimana04.Entities.TipoPostazione;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Integer> {

	@Query("SELECT p FROM Postazione p WHERE p.tipoPostazione = :tipoPostazione")
	List<Postazione> findByTipoPostazione(TipoPostazione tipoPostazione);

	List<Postazione> findByCitta(String citta);

}
