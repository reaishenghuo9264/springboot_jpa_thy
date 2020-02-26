package com.offcn.controller;

import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: lhq
 * @Date: 2020/2/24 19:00
 * @Description:
 */
@Controller
//@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/toAdd")
    public String toAdd(){
        return "userAdd";
    }

    @RequestMapping("/add")
    public String save(User user){
        userService.add(user);
        //资源重定向，二次跳转
        return "redirect:/";
    }

    @RequestMapping("/toEdit/{id}")
    public String toUpdate(@PathVariable(name="id") Long id,Model model){
        User user = userService.findOne(id);
        model.addAttribute("user",user);
        return "userEdit";
    }


    @RequestMapping("/update")
    public String update(User user){
        userService.update(user.getId(),user);
        return "redirect:/";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable(name="id") Long id){
        try {
            userService.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/";
    }



}
