package SanteCalderisi.ProgettoSettimana04.Entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
@Entity
@NoArgsConstructor
public class Postazione {
	@Id
	@GeneratedValue
	private int id;
	private String descrizione;
	@Enumerated(EnumType.STRING)
	private TipoPostazione tipoPostazione;
	private int capienzaMax;
	private boolean libero;
	@ManyToOne
	private Edificio edificio;

	@OneToMany(mappedBy = "postazione")
	private List<Prenotazione> prenotazioniPerPostazione = new ArrayList<Prenotazione>();

	public Postazione(String descrizione, TipoPostazione tipoPostazione, int capienzaMax) {

		this.descrizione = descrizione;
		this.tipoPostazione = tipoPostazione;
		this.capienzaMax = capienzaMax;
		this.libero = true;
	}
	@Override
	public String toString() {
		return "Postazione [descrizione=" + descrizione + ", tipoPostazione=" + tipoPostazione + ", capienzaMax="
				+ capienzaMax + ", libero=" + libero + "]";
	}


}
