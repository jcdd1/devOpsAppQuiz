package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.utils;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.UsuarioDto;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UsuariosList {
    private List<UsuarioDto> usuarioList;

    public UsuariosList() {
        usuarioList = new ArrayList<>();
    }
}
