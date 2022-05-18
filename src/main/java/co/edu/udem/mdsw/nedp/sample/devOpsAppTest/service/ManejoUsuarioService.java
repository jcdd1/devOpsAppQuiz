package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.service;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.UsuarioDto;
import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.utils.UsuariosList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@Service
public class ManejoUsuarioService implements ManejoUsuarioServiceInt{

    RestTemplate restTemplate;


    @Autowired
    public ManejoUsuarioService(RestTemplate restTemplate){
         this.restTemplate = restTemplate;
    }

    public UsuarioDto getUsuario(Integer id){
        String url = "https://6285638196bccbf32d622180.mockapi.io/api/v1/users/"+ Integer.toString(id);
        UsuarioDto usuario = restTemplate.getForObject(
                url, UsuarioDto.class);
        return usuario;
    }

    public List<UsuarioDto> getUsuarios(){
        String url = "https://6285638196bccbf32d622180.mockapi.io/api/v1/users/";
        UsuariosList usuariosList = restTemplate.getForObject(
                url, UsuariosList.class);
        return usuariosList.getUsuarioList();
    }

    public UsuarioDto saveUsuarios(UsuarioDto usuario)   throws IOException {
        String url = "https://6285638196bccbf32d622180.mockapi.io/api/v1/users/";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<UsuarioDto> entity = new HttpEntity<>(usuario,headers);

        UsuarioDto usuarioDto = restTemplate.postForObject(url, entity, UsuarioDto.class);
        return usuarioDto;
    }


    public UsuarioDto updateUsuario(UsuarioDto usuarioDto ) throws IOException {
        String url = "https://6285638196bccbf32d622180.mockapi.io/api/v1/users/";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<UsuarioDto> entity = new HttpEntity<>(usuarioDto,headers);
        restTemplate.put(url, entity);
        return usuarioDto;
    }

    public UsuarioDto deleteUsuario(Integer id) throws IOException {
        UsuarioDto usuarioDto = this.getUsuario(id);
        String url = "https://6285638196bccbf32d622180.mockapi.io/api/v1/users/"+ Integer.toString(id);
        restTemplate.delete(url);
        return usuarioDto;
    }
}
