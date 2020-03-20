package br.com.rd.ecommerce.service;


import br.com.rd.ecommerce.model.entity.Funcionario;
import br.com.rd.ecommerce.repository.FuncionarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service("FuncionarioService")
public class FuncionarioService {

    private FuncionarioRepository repository;

    public ResponseEntity fazerLogin(Integer matricula,String senha){
        Funcionario funcionario = repository.findByMatricula(matricula,senha);
        if(funcionario!=null){
            return ResponseEntity.ok().body(funcionario);
        }else
            return ResponseEntity.ok().body(null);
    }

}
