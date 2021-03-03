package calcolatrici.calcolatricedue.controller;

import calcolatrici.calcolatricedue.dto.OperazioneRequestDto;
import calcolatrici.calcolatricedue.dto.OperazioneResponseDto;
import calcolatrici.calcolatricedue.service.CalcolatriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alber
 */
@CrossOrigin("*")
@RestController
public class CalcolatriceController {

    @Autowired
    CalcolatriceService calcolatriceService;

    @RequestMapping("/somma")
    @ResponseBody
    public OperazioneResponseDto somma(@RequestBody OperazioneRequestDto dto) {
        double r = calcolatriceService.somma(dto.getOperatore1(), dto.getOperatore2());
        OperazioneResponseDto ris = new OperazioneResponseDto(r);//Istanziamento dell'oggetto di ritorno 
        return ris;
    }

    @RequestMapping("/sottrai")
    @ResponseBody
    public OperazioneResponseDto sottrai(@RequestBody OperazioneRequestDto dto) {
        return new OperazioneResponseDto(calcolatriceService.sottrai(dto.getOperatore1(), dto.getOperatore2()));
        //Espressione abbreviata uguale al metodo somma
    }

    @RequestMapping("/molt")
    @ResponseBody
    public OperazioneResponseDto molt(@RequestBody OperazioneRequestDto dto) {
        return new OperazioneResponseDto(calcolatriceService.molt(dto.getOperatore1(), dto.getOperatore2()));
        //Espressione abbreviata uguale al metodo somma
    }

    @RequestMapping("/div")
    @ResponseBody
    public OperazioneResponseDto div(@RequestBody OperazioneRequestDto dto){
    return new OperazioneResponseDto(calcolatriceService.div(dto.getOperatore1(), dto.getOperatore2()));    
    }
    
    @RequestMapping("module")
    @ResponseBody
    public OperazioneResponseDto module(@RequestBody OperazioneRequestDto dto){
       return new OperazioneResponseDto(calcolatriceService.module(dto.getOperatore1(), dto.getOperatore2()));
    }
}
