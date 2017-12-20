package ru.itis.santa.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.itis.santa.dao.UserRepository;
import ru.itis.santa.model.Kid;
import ru.itis.santa.service.KidService;

import java.util.List;

@Controller
public class KidController {
    @Autowired
    KidService kidService;
    @Autowired
    UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/kids")
    String getKids(Model model) {
        List<Kid> kidList = kidService.getAllKids();
        model.addAttribute(kidList);
        return "kidstable";
    }
}