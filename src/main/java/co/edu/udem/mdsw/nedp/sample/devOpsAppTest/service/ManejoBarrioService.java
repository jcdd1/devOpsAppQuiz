package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.BarrioDto;
import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.utils.BarriosList;

@Service
public class ManejoBarrioService implements ManejoBarrioServiceInt {

    RestTemplate restTemplate;
    private String URL ="https://6285ace696bccbf32d6678b3.mockapi.io/api/v1/barrios/";
    
    @Autowired
    public ManejoBarrioService(RestTemplate restTemplate){
         this.restTemplate = restTemplate;
    }

    public BarrioDto getBarrio(Integer id)
    {   
        String url = URL+ Integer.toString(id);
        return restTemplate.getForObject(url, BarrioDto.class);
    }
        
        public List<BarrioDto> getBarrios(){           
            BarriosList BarriosList = restTemplate.getForObject(
                    URL, BarriosList.class);
            return BarriosList.getBarrioList();
    }
    
    public BarrioDto saveBarrios(BarrioDto barrio) throws IOException{      
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<BarrioDto> entity = new HttpEntity<>(barrio,headers);
        return restTemplate.postForObject(URL, entity, BarrioDto.class);
    }
    
    public BarrioDto updateBarrio(BarrioDto barrioDto )throws IOException{
         String url = URL;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<BarrioDto> entity = new HttpEntity<>(barrioDto,headers);
        restTemplate.put(url, entity);
        return barrioDto;
    }
    public BarrioDto deleteBarrio(Integer id)throws IOException{
        BarrioDto barrioDto = this.getBarrio(id);
        String url = URL+ Integer.toString(id);
        restTemplate.delete(url);
        return barrioDto;
    } 
}
