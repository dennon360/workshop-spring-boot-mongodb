package com.dennon.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dennon.workshopmongo.domain.User;
import com.dennon.workshopmongo.dto.UserDTO;
import com.dennon.workshopmongo.repository.UserRepository;
import com.dennon.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	public User findById(String id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	public User insert(User obj) {
		return repository.insert(obj);
	}
	public User fromDTO(UserDTO user) {
		return new User(user.getId(), user.getName(), user.getEmail());
	}
	public void delete(String id) {
		if(!(findById(id) == null)) {
			repository.deleteById(id);
		}
	}
}
