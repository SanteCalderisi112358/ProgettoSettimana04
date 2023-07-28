package SanteCalderisi.ProgettoSettimana04.Entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
@Entity
public class Prenotazione {
	@Id
	@GeneratedValue
	private int id;
	private LocalDate dataInizio;
	private LocalDate dataFine;
	@ManyToOne
	private User user;
	@ManyToOne
	private Postazione postazione;

	public Prenotazione(LocalDate dataInizio, User user, Postazione postazione) {


		this.dataInizio = dataInizio;
		this.dataFine = dataInizio.plusDays(1);
		this.user = user;
		this.postazione = postazione;
	}

}
