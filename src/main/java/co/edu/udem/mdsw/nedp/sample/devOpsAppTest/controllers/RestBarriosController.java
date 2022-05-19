package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.controllers;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.BarrioDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestBarriosController {



    @PostMapping(
            value = "/barrios", consumes = "application/json", produces = "application/json")
    public BarrioDto createPerson(@RequestBody BarrioDto barrioDto ) {
            return new BarrioDto();

    }

    @PostMapping(
            value = "/barrios", consumes = "application/json", produces = "application/json")
    public BarrioDto updatePerson(@RequestBody BarrioDto barrioDto) {
        return new BarrioDto();

    }
}
