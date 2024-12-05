package com.ohgiraffers.petharmony.MODEL;

import com.ohgiraffers.petharmony.DTO.petAllDTO;
import com.ohgiraffers.petharmony.DTO.petDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("main/*")
public class petController {

    private final petService service;

    public petController(petService service) {
        this.service = service;
    }

    @GetMapping("emplist")
    public String empAll(Model model){
        List<petDTO> emp = service.empAll();

        model.addAttribute("emp", emp);
        
        for(petDTO petDTO : emp) {
            System.out.println("petDTO = " + petDTO);
        }

        return "main/emplist";
    }

    @GetMapping("join")
    public String empJoin(Model model) {

        List<petAllDTO> empJoin = service.empJoin();
        
        model.addAttribute("empJoin", empJoin);
        
        for(petAllDTO petAllDTO : empJoin) {
            System.out.println("petAllDTO = " + petAllDTO);
        }

        return "main/join";
    }
    
    @GetMapping("code")
    public void codeEmp(){}
    
    @PostMapping("code")
    public String empCode(@RequestParam String empCode, Model model){
        
        petDTO code = service.empCode(empCode);
        
        model.addAttribute("code", code);

        System.out.println("code = " + code);
        
        return "main/empCode";
    }
    
}
