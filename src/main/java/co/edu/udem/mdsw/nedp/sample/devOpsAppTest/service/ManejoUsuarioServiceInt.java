package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.service;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.UsuarioDto;

import java.util.List;

public interface ManejoUsuarioServiceInt {

     UsuarioDto getUsuario(Integer id);
     List<UsuarioDto> getUsuarios();
     UsuarioDto saveUsuarios(UsuarioDto usuario);
     UsuarioDto updateUsuario(UsuarioDto usuarioDto);
     UsuarioDto deleteUsuario(Integer id);

}
