package bo.edu.ucb.ing.restuni.api;

import bo.edu.ucb.ing.restuni.bl.ConsultaHorarioEstudianteBL;

import bo.edu.ucb.ing.restuni.dto.api.EstudianteHorarioApiDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EstudianteHorarioApi {
    private final ConsultaHorarioEstudianteBL consultaHorarioEstudianteBL;

    public EstudianteHorarioApi(ConsultaHorarioEstudianteBL consultaHorarioEstudianteBL) {
        this.consultaHorarioEstudianteBL = consultaHorarioEstudianteBL;
    }
    @GetMapping(path = "/estudiante/{estudianteId}/horario", produces = "application/json")
    public EstudianteHorarioApiDto findEstudianteByPk(@PathVariable("estudianteId") Integer estudianteId){
        return consultaHorarioEstudianteBL.findHorarioEstudianteById(estudianteId);

    }
}