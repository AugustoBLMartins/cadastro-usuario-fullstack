package com.augusto.cadastro_usuario.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.augusto.cadastro_usuario.business.UsuarioService;
import com.augusto.cadastro_usuario.infrastructure.entitys.Usuario;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController // para dizer que é um padrao rest que esta sendo usado aqui
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService; //injetando a dependecia da service

    @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario){
        usuarioService.salvarUsuario(usuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public List<Usuario> listar() {
    return usuarioService.listarTodos();
    }

    //public ResponseEntity<Usuario> buscarUsuarioPorEmail(@RequestParam String email){
    //    return ResponseEntity.ok(usuarioService.buscarUsuarioPorEmail(email));
    //}

    @DeleteMapping
    public ResponseEntity<Void> deletarUsuarioPorEmail(@RequestParam String email){
        usuarioService.deletarUsuarioPorEmail(email);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarUusario(@RequestParam Integer id,@RequestBody Usuario usuario ){
        usuarioService.atualiarUsuarioPorId(id, usuario);
        return ResponseEntity.ok().build();
    }


}
