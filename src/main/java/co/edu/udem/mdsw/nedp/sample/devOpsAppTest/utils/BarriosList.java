package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.utils;

import java.util.ArrayList;
import java.util.List;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.BarrioDto;
import lombok.Data;

@Data
public class BarriosList {    
    private List<BarrioDto> barrioList;

    public BarriosList() {
        barrioList = new ArrayList<>();
    }    
}
