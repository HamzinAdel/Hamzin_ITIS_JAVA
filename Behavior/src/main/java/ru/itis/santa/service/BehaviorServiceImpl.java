package ru.itis.santa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.santa.dao.BehaviorRepository;
import ru.itis.santa.model.Behavior;


import java.util.List;

@Service
public class BehaviorServiceImpl implements BehaviorService {

    @Autowired
    BehaviorRepository behaviorRepository;

    @Override
    public Behavior addBehavior(Behavior letter) {
        return behaviorRepository.save(letter);
    }

    @Override
    public List<Behavior> getByName(String name) {
        List<Behavior> behaviorList = behaviorRepository.findByName(name);
        return behaviorList;
    }


}
