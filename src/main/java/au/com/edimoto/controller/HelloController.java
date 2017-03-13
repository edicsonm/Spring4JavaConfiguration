package au.com.edimoto.controller;

import au.com.edimoto.model.User;
import au.com.edimoto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;


@Controller
public class HelloController {

    @Autowired
    UserService userService;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String home(Model model) {
		System.out.println("Pasando por home !!!!");
        model.addAttribute("listAllFamilyNames", userService.listAllFamilyNames());
        return "main";
    }

    @RequestMapping(value = {"/"}, method = RequestMethod.POST)
    public String findUser(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName, RedirectAttributes model) {
//        System.out.println("Pasando por findUser !!!!");
        model.addFlashAttribute("user", userService.listUser(firstName, lastName));
        return "redirect:/";
    }

//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(value= HttpStatus.NOT_FOUND, reason="User Not Found")
//    public String handleDBException(Exception e, HttpServletRequest req) {
//        System.out.println("Captura la exception !!!" + e.);
//        return "User Not Found";
//    }

}
