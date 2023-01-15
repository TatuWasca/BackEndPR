package com.ArgentinaPrograma.ProyectoIntegrador.Security.Service;

import com.ArgentinaPrograma.ProyectoIntegrador.Security.Entity.Usuario;
import com.ArgentinaPrograma.ProyectoIntegrador.Security.Repository.UsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean exitsByNombreUsuario(String nombreUsuario){
        return usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
            
    public void save(Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
