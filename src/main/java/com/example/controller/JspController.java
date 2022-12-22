package com.example.controller;


import com.example.entity.Paper;
import com.example.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class JspController {

    @Autowired
    private PaperService paperService;

    @RequestMapping(value = "/springBoot/card")
    public String jsp(HttpServletRequest request, Model model) {
        int pid = Integer.parseInt(request.getParameter("pid"));
        Paper p = paperService.Get_paper(pid);
        String ans = p.getAnswer();
        String individual_score = String.valueOf(p.getIndividual_score());
        String title = p.getPaper_title();
        int[] answers = new int[ans.length()];
        for (int i = 0; i < ans.length(); i++) {
            answers[i] = i + 1;
        }
        model.addAttribute("answer", ans);
        model.addAttribute("title", title);
        model.addAttribute("answers", answers);
        HttpSession hs = request.getSession();
        hs.setAttribute("pid", pid);
        hs.setAttribute("right_answer", ans);
        hs.setAttribute("individual_score", individual_score);
        return "card";
    }

    @RequestMapping(value = "/springBoot/submit")
    public String submmit(HttpServletRequest request, Model model) {
        Enumeration<String> e = request.getParameterNames();
        HttpSession hs = request.getSession();
        String pid = String.valueOf(hs.getAttribute("pid"));
        String right_answer = (String) hs.getAttribute("right_answer");
        String individual_score = (String) hs.getAttribute("individual_score");
        String name = request.getParameter("name");
        String[] ra = new String[right_answer.length()];
        for (int i = 0; i < right_answer.length(); i++) {
            ra[i] = String.valueOf(right_answer.charAt(i));
        }
        int score = 0;

        while (e.hasMoreElements()) {
            //System.out.println(e.nextElement());
            String num = e.nextElement();
            try {
                int index = Integer.parseInt(num.split("/")[0]) - 1;
                System.out.println(request.getParameter(num));
                System.out.println(ra[index]);
                if (request.getParameter(num).equals(ra[index])) {
                    score += Integer.parseInt(individual_score);
                }
            } catch (NumberFormatException w) {
                System.out.println(w);
            }

        }
        System.out.println(score);
        paperService.Set_score("paper_" + pid, name, score);
        return "submit";
    }

}
