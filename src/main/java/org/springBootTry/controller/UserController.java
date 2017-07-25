package org.springBootTry.controller;

import org.springBootTry.model.User;
import org.springBootTry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    String register(@ModelAttribute("user") User user, RedirectAttributes redirectAttributes) {
        User savedUser = this.userService.createUser(user);
        redirectAttributes.addAttribute("id", savedUser.getId());
        return "redirect:/users/{id}";
    }

    @GetMapping("/{id}")
    ModelAndView fetchUser(@PathVariable int id) {
        User user = this.userService.getOne(id);
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("user", user);
        return mav;
    }
}