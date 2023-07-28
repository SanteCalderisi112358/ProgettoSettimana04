package SanteCalderisi.ProgettoSettimana04.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SanteCalderisi.ProgettoSettimana04.Entities.Postazione;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Integer> {

}
