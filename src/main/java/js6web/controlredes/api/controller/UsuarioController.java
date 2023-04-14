package js6web.controlredes.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import js6web.controlredes.api.usuarios.DadosCadastroUsuario;
import js6web.controlredes.api.usuarios.Usuario;
import js6web.controlredes.api.usuarios.UsuarioRepository;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroUsuario dados){
        repository.save(new Usuario(dados));
    }
    
}