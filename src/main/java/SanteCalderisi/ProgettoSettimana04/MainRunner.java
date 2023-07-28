package SanteCalderisi.ProgettoSettimana04;

import java.time.LocalDate;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

import SanteCalderisi.ProgettoSettimana04.Entities.Edificio;
import SanteCalderisi.ProgettoSettimana04.Entities.Postazione;
import SanteCalderisi.ProgettoSettimana04.Entities.Prenotazione;
import SanteCalderisi.ProgettoSettimana04.Entities.TipoPostazione;
import SanteCalderisi.ProgettoSettimana04.Entities.User;
import SanteCalderisi.ProgettoSettimana04.Services.EdificioService;
import SanteCalderisi.ProgettoSettimana04.Services.PostazioneService;
import SanteCalderisi.ProgettoSettimana04.Services.PrenotazioneService;
import SanteCalderisi.ProgettoSettimana04.Services.UserService;
import lombok.Builder;

@Component
@Builder
public class MainRunner implements CommandLineRunner {
	@Autowired
	UserService userSrv;
	@Autowired
	EdificioService edificioSrv;
	@Autowired
	PostazioneService postazioneSrv;
	@Autowired
	PrenotazioneService prenotazioneSrv;

	@Override
	public void run(String... args) throws Exception {
		Faker f = new Faker(Locale.ITALY);
		

		/* UTENTI */
		User user01 = User.builder().username(f.name().username()).nome(f.name().firstName())
				.cognome(f.name().lastName()).email(f.internet().emailAddress()).build();


		User user02 = User.builder().username(f.name().username()).nome(f.name().firstName())
				.cognome(f.name().lastName()).email(f.internet().emailAddress()).build();


		User user03 = User.builder().username(f.name().username()).nome(f.name().firstName())
				.cognome(f.name().lastName()).email(f.internet().emailAddress()).build();


		User user04 = User.builder().username(f.name().username()).nome(f.name().firstName())
				.cognome(f.name().lastName()).email(f.internet().emailAddress()).build();

		User user05 = User.builder().username(f.name().username()).nome(f.name().firstName())
				.cognome(f.name().lastName()).email(f.internet().emailAddress()).build();

		User user06 = User.builder().username(f.name().username()).nome(f.name().firstName())
				.cognome(f.name().lastName()).email(f.internet().emailAddress()).build();

		User user07 = User.builder().username(f.name().username()).nome(f.name().firstName())
				.cognome(f.name().lastName()).email(f.internet().emailAddress()).build();

		User user08 = User.builder().username(f.name().username()).nome(f.name().firstName())
				.cognome(f.name().lastName()).email(f.internet().emailAddress()).build();
		
		

//		userSrv.save(user01);
//		userSrv.save(user02);
//		userSrv.save(user03);
//		userSrv.save(user04);
//		userSrv.save(user05);
//		userSrv.save(user06);
//		userSrv.save(user07);
//		userSrv.save(user08);

		/* EDIFICI */

		Edificio edificio01 = Edificio.builder().nome(f.address().buildingNumber()).indirizzo(f.address().fullAddress())
				.citta(f.address().cityName()).build();
		Edificio edificio02 = Edificio.builder().nome(f.address().buildingNumber()).indirizzo(f.address().fullAddress())
				.citta(f.address().cityName()).build();
		Edificio edificio03 = Edificio.builder().nome(f.address().buildingNumber()).indirizzo(f.address().fullAddress())
				.citta(f.address().cityName()).build();
//		edificioSrv.save(edificio01);
//		edificioSrv.save(edificio02);
//		edificioSrv.save(edificio03);




		/* POSTAZIONI */

		Postazione postazione01 = Postazione.builder().capienzaMax(f.number().numberBetween(5, 30))
				.descrizione("Nuovo, luminoso, pulito").tipoPostazione(TipoPostazione.OPEN_SPACE).libero(true)
				.edificio(edificio01).build();

		Postazione postazione02 = Postazione.builder().capienzaMax(f.number().numberBetween(5, 30))
				.descrizione("Angolo relax per momenti di pausa.").tipoPostazione(TipoPostazione.OPEN_SPACE)
				.libero(true).edificio(edificio01).build();

		Postazione postazione03 = Postazione.builder().capienzaMax(f.number().numberBetween(5, 30))
				.descrizione("Sala conferenze per incontri strategici.").tipoPostazione(TipoPostazione.SALA_RIUNIONI)
				.libero(true).edificio(edificio01).build();

		Postazione postazione04 = Postazione.builder().capienzaMax(f.number().numberBetween(5, 30))
				.descrizione("Nuovo, luminoso, pulito").tipoPostazione(TipoPostazione.OPEN_SPACE).libero(true)
				.edificio(edificio02).build();

		Postazione postazione05 = Postazione.builder().capienzaMax(f.number().numberBetween(5, 30))
				.descrizione("Nuovo, luminoso, pulito").tipoPostazione(TipoPostazione.SALA_RIUNIONI).libero(true)
				.edificio(edificio02).build();

		Postazione postazione06 = Postazione.builder().capienzaMax(f.number().numberBetween(5, 30))
				.descrizione("Area silenziosa per attività concentrate.").tipoPostazione(TipoPostazione.PRIVATO)
				.libero(true).edificio(edificio03).build();

		Postazione postazione07 = Postazione.builder().capienzaMax(f.number().numberBetween(5, 30))
				.descrizione("Sala riunioni attrezzata per brainstorming produttivo.")
				.tipoPostazione(TipoPostazione.SALA_RIUNIONI).libero(true).edificio(edificio03).build();

		Postazione postazione08 = Postazione.builder().capienzaMax(f.number().numberBetween(5, 30))
				.descrizione("Nuovo, luminoso, pulito").tipoPostazione(TipoPostazione.OPEN_SPACE).libero(true)
				.edificio(edificio03).build();

//		postazioneSrv.save(postazione01);
//		postazioneSrv.save(postazione02);
//		postazioneSrv.save(postazione03);
//		postazioneSrv.save(postazione04);
//		postazioneSrv.save(postazione05);
//		postazioneSrv.save(postazione06);
//		postazioneSrv.save(postazione07);
//		postazioneSrv.save(postazione08);
		

		Prenotazione prenotazione01 = new Prenotazione(LocalDate.now());
		System.err.println(prenotazione01);

		/*
		 * Istanzio una nuova prenotazione che controlla che la postazione non sia
		 * occupata. In caso positivo, allora rende "libero=FALSE" la postazione, salva
		 * la prenotazione e risalva utente e postazione. Altrimenti compare un
		 * messaggio che dice che la postazione è già occupata
		 */

//		try {
//			User userChePrenota = userSrv.findById(209);
//			System.err.println(userChePrenota);
//			Postazione postazioneCheUserVuolePrenotare = postazioneSrv.findById(208);
//			System.err.println(postazioneCheUserVuolePrenotare);
//
//			prenotazione01.setPostazione(postazioneCheUserVuolePrenotare);
//			prenotazione01.setUser(userChePrenota);
//			System.err.println(prenotazione01);
//			prenotazioneSrv.saveAndUpdatePostazioneAndUser(prenotazione01, userSrv, postazioneSrv);
//
//		} catch (ItemNotFoundException ex) {
//			System.err.println(ex.getMessage());
//		}

		postazioneSrv.findByTipoPostazione(TipoPostazione.OPEN_SPACE);




		// System.err.println(aldo.toString());
		// User user01 = (User) ctx.getBean("getUser01");
		// userSrv.save(user01);
//		try {
//			// userSrv.findByIdAndDelete(2);
//		} catch (ItemNotFoundException ex) {
//			System.err.println(ex.getMessage());
//		}



	}

}
