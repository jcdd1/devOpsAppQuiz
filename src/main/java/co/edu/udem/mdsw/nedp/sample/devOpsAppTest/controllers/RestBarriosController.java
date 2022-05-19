package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.controllers;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.BarrioDto;
import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.service.ManejoBarrioServiceInt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestBarriosController {
        ManejoBarrioServiceInt manejoBarrioService;

        @Autowired
        public RestBarriosController(ManejoBarrioServiceInt manejoBarrioService){
            this.manejoBarrioService = manejoBarrioService;
        }


        @GetMapping(value = "/barrios", produces = "application/json")
        public ResponseEntity<List<BarrioDto>> getBarrio(){
            return ResponseEntity.ok().body(manejoBarrioService.getBarrios());
        }
}
