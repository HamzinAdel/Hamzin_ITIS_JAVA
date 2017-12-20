package ru.itis.santa.service;

import ru.itis.santa.model.Behavior;

import java.util.List;

public interface BehaviorService   {
    Behavior addBehavior(Behavior behavior);
    List<Behavior> getByName(String name);
}
