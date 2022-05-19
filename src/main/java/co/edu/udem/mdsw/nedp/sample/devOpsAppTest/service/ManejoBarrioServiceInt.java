package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.service;

import java.io.IOException;
import java.util.List;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.BarrioDto;

public interface ManejoBarrioServiceInt {

    BarrioDto getBarrio(Integer id);
    List<BarrioDto> getBarrios();
    BarrioDto saveBarrios(BarrioDto barrioDto) throws IOException;
    BarrioDto updateBarrio(BarrioDto barrioDto )throws IOException;
    BarrioDto deleteBarrio(Integer id)throws IOException;   
}
