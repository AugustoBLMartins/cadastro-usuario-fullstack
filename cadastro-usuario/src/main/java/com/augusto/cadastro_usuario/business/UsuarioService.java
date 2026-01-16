package com.augusto.cadastro_usuario.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.augusto.cadastro_usuario.infrastructure.entitys.Usuario;
import com.augusto.cadastro_usuario.infrastructure.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    private final UsuarioRepository repository;

   public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    
    public void salvarUsuario (Usuario usuario){
        repository.saveAndFlush(usuario); //salva e fecha a conexão com o banco de dados
    }

    public Usuario buscarUsuarioPorEmail(String email){
        return repository.findByEmail(email).orElseThrow(
            () -> new RuntimeException("Email não encontrado")
        );
    }

    public void deletarUsuarioPorEmail(String email){
        repository.deleteByEmail(email);
    }

    public void atualiarUsuarioPorId(Integer id, Usuario usuario){
        Usuario usuarioEntity = repository.findById(id).orElseThrow(() -> 
        new RuntimeException("Usuario não encontrado")
        );
        Usuario usuarioAtualizado = Usuario.builder()
        .email(usuario.getEmail() != null ? usuario.getEmail() : usuarioEntity.getEmail() )
        .nome(usuario.getNome() != null ? usuario.getNome() : usuarioEntity.getNome() )
        .id(usuarioEntity.getId() )
        .build();

        repository.saveAndFlush(usuarioAtualizado);
    }
}
