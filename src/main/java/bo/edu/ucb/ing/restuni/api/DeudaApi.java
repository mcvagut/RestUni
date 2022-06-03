package bo.edu.ucb.ing.restuni.api;

import bo.edu.ucb.ing.restuni.bl.ConsultaDeuda;

import bo.edu.ucb.ing.restuni.dto.api.EstudianteHorarioApiDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DeudaApi {
    private final ConsultaDeuda ConsultaDeuda;



    public DeudaApi(ConsultaDeuda consultaDeuda) {
        ConsultaDeuda = consultaDeuda;
    }

    @GetMapping(path = "/estudiante/{estudianteId}/detalle", produces = "application/json")
    public EstudianteHorarioApiDto findEstudianteByPk(@PathVariable("estudianteId") Integer estudianteId){
        return (EstudianteHorarioApiDto) ConsultaDeuda.findDeudaById(estudianteId);

    }
}