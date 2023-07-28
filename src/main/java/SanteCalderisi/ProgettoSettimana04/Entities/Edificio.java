package SanteCalderisi.ProgettoSettimana04.Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor


public class Edificio {
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String indirizzo;
	private String citta;
	@OneToMany(mappedBy = "edificio")
	private List<Postazione> postazioniPerEdificio;

	@Builder
	public Edificio(String nome, String indirizzo, String citta) {

		this.nome = nome;
		this.indirizzo = indirizzo;
		this.citta = citta;
	}
	@Override
	public String toString() {
		return "Edificio [nome=" + nome + ", indirizzo=" + indirizzo + ", citta=" + citta + "]";
	}


}
