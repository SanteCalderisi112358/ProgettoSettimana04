package SanteCalderisi.ProgettoSettimana04.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SanteCalderisi.ProgettoSettimana04.Dao.IUserDao;
import SanteCalderisi.ProgettoSettimana04.Entities.User;
import SanteCalderisi.ProgettoSettimana04.ExceptionCustom.ItemNotFoundException;
import SanteCalderisi.ProgettoSettimana04.Repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService implements IUserDao {
	@Autowired
	UserRepository userRepo;

	public void save(User user) {
		// eventuale logica addizionale custom...
		userRepo.save(user);
		System.err.println(user.getNome() + " è stato salvato correttamente!");
	}

	public List<User> findAll() {
		return userRepo.findAll();
	}

	public User findById(int id) throws ItemNotFoundException {
//		Optional<User> user = usersRepo.findById(id);
//
//		if (user.isPresent()) {
//			return user.get();
//		} else {
//			throw new ItemNotFoundException(id);
//		}
		return userRepo.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
	}

	public void findByIdAndUpdate(int id, User user) throws ItemNotFoundException {
		User found = this.findById(id); // Lo cerco nel db
		// poi aggiorno i suoi dati con quelli passati come parametro
		found.setId(id);
		found.setNome(user.getNome());
		found.setCognome(user.getCognome());
		found.setEmail(user.getEmail());
		// risalvo su db l'utente modificato
		userRepo.save(found);
	}

	public void findByIdAndDelete(int id) throws ItemNotFoundException {
		User found = this.findById(id);
		if (found != null) {
			userRepo.delete(found);
			System.err.println("L'utente con id: " + id + " (" + found.getNome() + ", " + found.getCognome()
					+ ") è stato eliminato correttamente dal DB");
		} else {
			System.err.println("L'utente con id: " + id + " non è presente nel DB");
		}

	}

	public long count() {
		return userRepo.count();
	}

	@Override
	public List<User> findByPartialNameIgnoreCase(String name) {
		// TODO Auto-generated method stub
		return null;
	}


}
