package SanteCalderisi.ProgettoSettimana04.Entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String nome;
	private String cognome;
	private String email;
	@OneToMany
	private List<Prenotazione> prenotazioniPerUser = new ArrayList<Prenotazione>();

	public User(String username, String nome, String cognome, String email) {
		super();
		this.username = username;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [Username=" + username + ", Nome =" + nome + ", Cognome=" + cognome + ", email=" + email + "]";
	}


}

