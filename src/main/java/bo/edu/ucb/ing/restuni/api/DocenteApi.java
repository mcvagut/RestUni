package bo.edu.ucb.ing.restuni.api;

import bo.edu.ucb.ing.restuni.bl.ConsultaDocente;
import bo.edu.ucb.ing.restuni.bl.ConsultaEstudiante;
import bo.edu.ucb.ing.restuni.dto.api.DocenteApiDto;
import bo.edu.ucb.ing.restuni.dto.api.EstudianteApiDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DocenteApi {
    private final ConsultaDocente consultaDocente;

    public DocenteApi(ConsultaDocente consultaDocente) {
        this.consultaDocente = consultaDocente;
    }

    @GetMapping(path = "/docente/{docenteId}", produces = "application/json")
    public DocenteApiDto findDocenteByPk(@PathVariable("docenteId") Integer docenteId){
        return consultaDocente.findDocenteById(docenteId);

    }
}