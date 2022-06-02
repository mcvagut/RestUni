package bo.edu.ucb.ing.restuni.api;

import bo.edu.ucb.ing.restuni.bl.ConsultaDocenteHorario;
import bo.edu.ucb.ing.restuni.bl.ConsultaHorarioEstudianteBL;
import bo.edu.ucb.ing.restuni.dto.api.DocenteHorarioApiDto;
import bo.edu.ucb.ing.restuni.dto.api.EstudianteHorarioApiDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DocenteHorarioApi {
    private final ConsultaDocenteHorario consultaDocenteHorario;

     public DocenteHorarioApi(ConsultaDocenteHorario consultaDocenteHorario) {
        this.consultaDocenteHorario = consultaDocenteHorario;
    }

    @GetMapping(path = "/docente/{docenteId}/horario/materia/{materiaId}", produces = "application/json")
    public DocenteHorarioApiDto findDocenteByPk(@PathVariable("docenteId") Integer docenteId){
        return consultaDocenteHorario.findHorarioDocenteById(docenteId);

    }
}