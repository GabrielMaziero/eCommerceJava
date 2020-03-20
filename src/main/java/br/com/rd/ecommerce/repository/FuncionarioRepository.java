package br.com.rd.ecommerce.repository;


import br.com.rd.ecommerce.model.entity.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository {
    Funcionario findByMatricula(Integer matricula, String senha);
}
