package bo.edu.ucb.ing.restuni.api;

import bo.edu.ucb.ing.restuni.bl.ConsultaEstudiante;
import bo.edu.ucb.ing.restuni.bl.ConsultaHorarioEstudianteBL;

import bo.edu.ucb.ing.restuni.dto.api.EstudianteApiDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EstudianteApi {
    private final ConsultaEstudiante consultaEstudiante;

    public EstudianteApi(ConsultaEstudiante consultaEstudiante) {
        this.consultaEstudiante = consultaEstudiante;
    }

    @GetMapping(path = "/estudiante/{estudianteId}", produces = "application/json")
    public EstudianteApiDto findEstudianteByPk(@PathVariable("estudianteId") Integer estudianteId){
        return consultaEstudiante.findEstudianteById(estudianteId);

    }
}

