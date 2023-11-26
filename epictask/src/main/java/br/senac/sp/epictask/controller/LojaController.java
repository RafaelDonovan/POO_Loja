package br.senac.sp.epictask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senac.sp.epictask.model.Loja;
import br.senac.sp.epictask.repository.LojaRepository;
import jakarta.validation.Valid;

@Controller
@RequestMapping("loja")

public class LojaController {
    
    @Autowired
    LojaRepository repository;

    @GetMapping
    public String index(Model model){
        var lista = repository.findAll();
        model.addAttribute("lojas", lista);
        return "loja/index";
    }

    @GetMapping("new") //localhost:8080/loja/new
    public String form(Loja loja){
        return "loja/formLoja";
    }

    @PostMapping("new")//receber os valores do form
    public String save(@Valid Loja loja, BindingResult result){
        if(result.hasErrors()) return "loja/formLoja";
        repository.save(loja);
        return "redirect:/loja";
    }

    @DeleteMapping("{id}")
    public String delete (@PathVariable long id){
        repository.deleteById(id);
        return "redirect:/loja";
    }
}
