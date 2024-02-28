package br.com.fiap.cadastro.aluno.controllers;

import br.com.fiap.cadastro.aluno.models.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
@Controller
@RequestMapping("/alunos")

public class AlunoController {

    @GetMapping("/novo")
    public String adicionarAluno(Model model){

        model.addAttribute("aluno", new Aluno());


    return "aluno/novo-aluno";
    }

    @PostMapping("/salvar")
    public String insertAluno(Aluno aluno){
        System.out.println(aluno.toString());
        return "redirect:/alunos/novo";
    }
}
