package com.example.demo.controller;

import com.example.demo.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.UsuarioService;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/usuario")
    private List<Usuario> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    @GetMapping("/usuario/{id}")
    private Usuario getUsuarios(@PathVariable("id") int id) {
        return usuarioService.getUsuarioById(id);
    }

    @DeleteMapping("/usuario/{id}")
    private void deleteUsuario(@PathVariable("id") int id) {
        usuarioService.delete(id);
    }

    @PostMapping("/usuario")
    private int saveUsuario(@RequestBody Usuario usuario) {
        usuarioService.saveOrUpdate(usuario);
        return usuario.getId();
    }

    @PutMapping("/usuario")
    private Usuario update(@RequestBody Usuario usuario) {
        usuarioService.saveOrUpdate(usuario);
        return usuario;
    }
}
