package ru.itis.santa.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itis.santa.dao.UserRepository;
import ru.itis.santa.model.Behavior;

import ru.itis.santa.model.User;
import ru.itis.santa.service.BehaviorService;
import ru.itis.santa.service.BehaviorServiceImpl;

import java.util.Optional;

@Controller

public class BehaviorController {
    @Autowired
    BehaviorService behaviorService;
    @Autowired
    UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/behavior")
    String getForm(Model model) {
        return "behavior";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/behavior")
    String getLetter(Model model, @RequestParam String name, @RequestParam String data,@RequestParam int res, @RequestParam String homework,@RequestParam String parents,@RequestParam String help,@RequestParam String lie,@RequestParam String school ,@RequestParam String teacher,@RequestParam String marks,@RequestParam String letter,@RequestParam String force,@RequestParam String newyear) {
        User user = userRepository.findByUsername(((org.springframework.security.core.userdetails.User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername());
        Behavior behavior = new Behavior();
        behavior.setData(name);
        behavior.setData(data);
        res=0;
        if(homework.equals("yes")) {
            res=res+10;
        }
        else if (homework.equals("partly")) {
            res=res+5;
        }
        if(parents.equals("yes")) {
            res=res+10;
        }
        else if (parents.equals("partly")) {
            res=res+5;
        }
        if(help.equals("yes")) {
            res=res+10;
        }
        else if (help.equals("partly")) {
            res=res+5;
        }
        if(lie.equals("yes")) {
            res=res+10;
        }
        else if (lie.equals("partly")) {
            res=res+5;
        }
        if(school.equals("yes")) {
            res=res+10;
        }
        else if (school.equals("partly")) {
            res=res+5;
        }
        if(marks.equals("yes")) {
            res=res+10;
        }
        else if (marks.equals("partly")) {
            res=res+5;
        }
        if(teacher.equals("yes")) {
            res=res+10;
        }
        else if (teacher.equals("partly")) {
            res=res+5;
        }
        if(letter.equals("yes")) {
            res=res+10;
        }
        else if (letter.equals("partly")) {
            res=res+5;
        }
        if(force.equals("yes")) {
            res=res+10;
        }
        else if (force.equals("partly")) {
            res=res+5;
        }
        if(newyear.equals("yes")) {
            res=res+10;
        }
        else if (newyear.equals("partly")) {
            res=res+5;
        }
        behavior.setRes(res);



//        behavior.setHomework(homework);
//        behavior.setParents(parents);
//        behavior.setHelp(help);
//        behavior.setLie(lie);
//        behavior.setSchool(school);
//        behavior.setMarks(marks);
//        behavior.setTeacher(teacher);
//        behavior.setLetter(letter);
//        behavior.setForce(force);
//        behavior.setNewyear(newyear);


        behaviorService.addBehavior(behavior);

        return "redirect:/result";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/result")
    String result(Model model) {
        model.addAttribute("res", 4);
        return "result";
    }
}
