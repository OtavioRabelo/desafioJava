package com.example.demo.service;

import com.example.demo.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.UsuarioRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarioRepository.findAll().forEach(usuarios1 -> usuarios.add(usuarios1));
        return usuarios;
    }

    public Usuario getUsuarioById(int id) {
        return usuarioRepository.findById(id).get();
    }

    public void saveOrUpdate(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public void delete(int id) {
        usuarioRepository.deleteById(id);
    }

    public void update(Usuario usuario, int id) {
        usuarioRepository.save(usuario);
    }
}
