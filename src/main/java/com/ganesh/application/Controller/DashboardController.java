package com.ganesh.application.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DashboardController
{
    @GetMapping("/")
    public ModelAndView showSelectForm(ModelAndView modelAndView)
    {
        modelAndView.setViewName("kycdropdown");
        return modelAndView;

    }

    @PostMapping("/selectForm")
    public String selectForm(@RequestParam("selectLevel") String selectLevel,@RequestParam("selectSubject") String selectSubject)
    {
        System.out.println("Inside select form");
        System.out.println(selectLevel);
//        String broker=selectLevel;
//
        System.out.println(selectSubject);
//        String siprabi=selectSubject;
        if(selectLevel.equals("broker") && selectSubject.equals("siprabi"))
        {

            return "redirect:/siprabi";

        }
        else if(selectLevel.equals("broker") && selectSubject.equals("nalta"))
        {

            return "redirect:/siprabi";
        }
        else if(selectLevel.equals("bank") && selectSubject.equals("nic asia"))
        {

            return "ab.html";
        }
        else if(selectLevel.equals("bank") && selectSubject.equals("garima bank"))
        {
            return "ab.html";
        }
        return "redirect:/";
    }

}
