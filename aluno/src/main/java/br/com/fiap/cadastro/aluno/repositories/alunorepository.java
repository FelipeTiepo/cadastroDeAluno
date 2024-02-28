package br.com.fiap.cadastro.aluno.repositories;

import br.com.fiap.cadastro.aluno.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface alunorepository extends JpaRepository <Aluno, Long> {
}
