package bo.edu.ucb.ing.restuni.api;


import bo.edu.ucb.ing.restuni.bl.ConsultaPermiso;

import bo.edu.ucb.ing.restuni.dto.api.PermisosApiDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PermisosApi {

    private final ConsultaPermiso consultaPermiso;

    public PermisosApi(ConsultaPermiso consultaPermiso) {
        this.consultaPermiso = consultaPermiso;
    }


    @GetMapping(path = "/Estudiante/{estudiante_id}/permisos", produces = "application/json")
    public PermisosApiDto findPermisosByPk(@PathVariable("estudiante_id") Integer estudiante_id){
        return consultaPermiso.findPermisosById(estudiante_id);

    }
}
