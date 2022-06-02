package bo.edu.ucb.ing.restuni.api;

import bo.edu.ucb.ing.restuni.bl.ConsultaEstudianteBL;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class
EstudianteApi {
    private ConsultaEstudianteBL consultaEstudianteBL;

    public EstudianteApi(ConsultaEstudianteBL consultaEstudianteBL) {
        this.consultaEstudianteBL = consultaEstudianteBL;
    }
    @GetMapping(value = "/estudiante/{estudianteId}", produces = "application/json")
    public EstudianteApiDto findEstudianteByPk(@PathVariable("estudianteId") Integer estudianteId){
        return consultaEstudianteBL.findHorarioEstudianteById(estudianteId);

    }
}
