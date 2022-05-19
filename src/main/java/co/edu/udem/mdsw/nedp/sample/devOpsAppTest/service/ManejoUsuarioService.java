package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.UsuarioDto;
import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.utils.UsuariosList;

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
        
        UsuarioDto[] arr =  restTemplate.getForObject(
                url, UsuarioDto[].class);
        List<UsuarioDto> list = Arrays.asList(arr);
        return list;
    }

    public UsuarioDto saveUsuarios(UsuarioDto usuario) {
        String url = "https://6285638196bccbf32d622180.mockapi.io/api/v1/users/";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<UsuarioDto> entity = new HttpEntity<>(usuario,headers);

        UsuarioDto usuarioDto = restTemplate.postForObject(url, entity, UsuarioDto.class);
        return usuarioDto;
    }

    public UsuarioDto updateUsuario(Integer id ,UsuarioDto usuarioDto )  {
        String url = "https://6285638196bccbf32d622180.mockapi.io/api/v1/users/"+ Integer.toString(id);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<UsuarioDto> entity = new HttpEntity<>(usuarioDto,headers);
        restTemplate.put(url, entity);
        return usuarioDto;
    }

    public UsuarioDto deleteUsuario(Integer id)  {
        UsuarioDto usuarioDto = this.getUsuario(id);
        String url = "https://6285638196bccbf32d622180.mockapi.io/api/v1/users/"+ Integer.toString(id);
        restTemplate.delete(url);
        return usuarioDto;
    }
}
