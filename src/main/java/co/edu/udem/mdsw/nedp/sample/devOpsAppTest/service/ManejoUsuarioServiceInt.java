package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.service;

import java.io.IOException;
import java.util.List;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.UsuarioDto;

public interface ManejoUsuarioServiceInt {

     UsuarioDto getUsuario(Integer id);
     List<UsuarioDto> getUsuarios();
     UsuarioDto saveUsuarios(UsuarioDto usuario) throws IOException;
     UsuarioDto updateUsuario(UsuarioDto usuarioDto )throws IOException;
     UsuarioDto deleteUsuario(Integer id)throws IOException;
}
