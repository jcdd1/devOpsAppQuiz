package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities;


import lombok.Data;

import java.io.Serializable;

@Data
public class UsuarioDto implements Serializable {
    private String id;
    private String name;
    private String email;
}
