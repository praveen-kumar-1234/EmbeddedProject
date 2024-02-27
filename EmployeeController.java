package com.praveen.controller;


import com.praveen.entity.Employee;
import com.praveen.service.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController
{
    @Autowired
    private EmployeeServiceImp service;

    @RequestMapping("/")
    public String home()
    {
        return "form";
    }


    @RequestMapping("/insert")
    @ResponseBody
    public String insert(@ModelAttribute Employee employee)
    {
        service.saveEmployee(employee);
        return "employee saved successfully.......";
    }

}
