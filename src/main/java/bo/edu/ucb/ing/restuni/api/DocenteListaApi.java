package bo.edu.ucb.ing.restuni.api;

import bo.edu.ucb.ing.restuni.bl.ConsultaDocenteHorario;
import bo.edu.ucb.ing.restuni.bl.ConsultaListaDocente;
import bo.edu.ucb.ing.restuni.dto.api.DocenteHorarioApiDto;
import bo.edu.ucb.ing.restuni.dto.api.DocenteListaApiDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("/api/v1")
    public class DocenteListaApi {
        private final ConsultaListaDocente consultaListaDocente;

        public DocenteListaApi(ConsultaListaDocente consultaListaDocente) {
            this.consultaListaDocente = consultaListaDocente;
        }

        @GetMapping(path = "/docente/{docenteId}/materia/{materiaId}/{paralelo}/alumnos", produces = "application/json")
        public DocenteListaApiDto findDocenteByPk(@PathVariable("docenteId") Integer docenteId){
            return consultaListaDocente.findListaDocenteByMateria(docenteId);

        }
    }

