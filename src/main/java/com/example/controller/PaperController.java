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

import java.util.Map;

@Controller
public class PaperController {
    int count = 100000;
    @Autowired
    private PaperService paperService;

    @RequestMapping(value = "/springBoot/paper/{answer}")
    public @ResponseBody
    Object paper(@PathVariable("answer") String ans) {

        paperService.Create_new_paper(count++, ans);

        return count;
    }

    @RequestMapping(value = "/springBoot/exam/{pid}")
    public @ResponseBody
    Object exam(@PathVariable("pid") int pid) {

        String ans = paperService.Get_paper(pid);

        return ans.length();
    }

    @RequestMapping(value = "/springBoot/handin/{pid}/{sid}/{name}/{ans}")
    public @ResponseBody
    Object handin(@PathVariable("pid") int pid, @PathVariable("sid") int sid, @PathVariable("name") String name, @PathVariable("ans") String ans) {
        count = 0;
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
