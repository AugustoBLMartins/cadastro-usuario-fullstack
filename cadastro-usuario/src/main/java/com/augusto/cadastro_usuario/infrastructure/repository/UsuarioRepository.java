package com.augusto.cadastro_usuario.infrastructure.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.augusto.cadastro_usuario.infrastructure.entitys.Usuario;

import jakarta.transaction.Transactional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
    Optional<Usuario> findByEmail (String email);

    @Transactional //caso de algum erro ele não pode deletar
    void deleteByEmail(String email);

}
