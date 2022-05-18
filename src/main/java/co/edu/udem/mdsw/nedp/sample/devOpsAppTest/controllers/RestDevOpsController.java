package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.controllers;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.UsuarioDto;
import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.service.ManejoUsuarioServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestDevOpsController {
    ManejoUsuarioServiceInt manejoUsuarioService;

    @Autowired
    public RestDevOpsController(ManejoUsuarioServiceInt manejoUsuarioService){
        this.manejoUsuarioService = manejoUsuarioService;
    }

    @GetMapping(value = "/usuarios/{id}", produces = "application/json")
    public ResponseEntity<UsuarioDto> getUsuario(@PathVariable Integer id){
        return ResponseEntity.ok().body(manejoUsuarioService.getUsuario(id));
    }

    @GetMapping(value = "/usuarios}", produces = "application/json")
    public ResponseEntity<List<UsuarioDto>> getUsuario(){
        return ResponseEntity.ok().body(manejoUsuarioService.getUsuarios());
    }

}
