package com.example.controller;

import com.example.entity.Paper;
import com.example.entity.Student;
import com.example.service.PaperService;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class PaperController {
    int count = 100000;
    @Autowired
    private PaperService paperService;

    @RequestMapping(value = "/springBoot/paper")
    public @ResponseBody
    int paper(HttpServletRequest request) {

        paperService.Create_new_paper(
                count,
                request.getParameter("answer"),
                request.getParameter("paper_title"),
                Integer.parseInt(request.getParameter("individual_score")));

        return count++;
    }

    @RequestMapping(value = "/springBoot/exam")
    public @ResponseBody
    int exam(HttpServletRequest request) {

        String ans = paperService.Get_paper(Integer.parseInt(request.getParameter("pid")));
        System.out.println(ans);
        return ans.length();
    }

    @RequestMapping(value = "/springBoot/handin")
    public @ResponseBody
    int handin(HttpServletRequest request) {
        count = 0;
        int pid = Integer.parseInt(request.getParameter("pid"));
        int sid = Integer.parseInt(request.getParameter("sid"));
        String name = request.getParameter("name");
        String ans = request.getParameter("ans");
        String right_ans = paperService.Get_paper(pid);
        for (int i = 0; i < right_ans.length(); i++) {
            System.out.println("right_ans:" + right_ans.charAt(i));
            System.out.println("ans:" + ans.charAt(i));
            if (right_ans.charAt(i) == ans.charAt(i)) {
                count++;
            }
        }
        paperService.Set_score("paper_" + pid, sid, name, count);
        return count;
    }

}
