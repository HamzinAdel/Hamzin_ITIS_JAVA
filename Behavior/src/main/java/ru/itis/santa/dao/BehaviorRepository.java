package ru.itis.santa.dao;

import org.springframework.data.repository.CrudRepository;
import ru.itis.santa.model.Behavior;

import ru.itis.santa.model.User;


import java.util.List;

public interface BehaviorRepository extends CrudRepository<Behavior,Long> {
    List<Behavior> findByName(String name);
    List<Behavior> findAllByUser(User user);

}
