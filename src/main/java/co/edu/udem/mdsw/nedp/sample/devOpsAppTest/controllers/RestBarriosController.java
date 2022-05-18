package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.controllers;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.BarrioDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class RestBarriosController {



    @PostMapping(
            value = "/barrios", consumes = "application/json", produces = "application/json")
    public BarrioDto createPerson(@RequestBody BarrioDto barrioDto ) {

    }

    @PostMapping(
            value = "/barrios", consumes = "application/json", produces = "application/json")
    public BarrioDto updatePerson(@RequestBody BarrioDto barrioDto) {

    }
}
