package SanteCalderisi.ProgettoSettimana04.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SanteCalderisi.ProgettoSettimana04.Entities.Edificio;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Integer> {

}
