package bo.edu.ucb.ing.restuni.bl;
import bo.edu.ucb.ing.restuni.dao.ListaPermisoEstudianteDAO;
import bo.edu.ucb.ing.restuni.dto.api.EstudianteApiDto;
import bo.edu.ucb.ing.restuni.dto.api.PermisosApiDto;
import bo.edu.ucb.ing.restuni.dto.ddbb.EstudianteDto;
import bo.edu.ucb.ing.restuni.dto.ddbb.ListaPermisoEstudianteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.List;

@Component

public class ConsultaPermiso {

    private ListaPermisoEstudianteDAO listaPermisoEstudianteDAO;

    @Autowired
    public ConsultaPermiso(ListaPermisoEstudianteDAO listaPermisoEstudianteDAO) {
        this.listaPermisoEstudianteDAO = listaPermisoEstudianteDAO;
    }

    public PermisosApiDto findPermisosById(Integer estudianteId) {
        PermisosApiDto result = new PermisosApiDto();
        ListaPermisoEstudianteDTO PermisosDto = listaPermisoEstudianteDAO.findPermisosByPk(estudianteId);




        //Transformación
        result.setEstudiante_id(PermisosDto.getEstudiante_id());
        result.setPermiso_id(PermisosDto.getPermiso_id());
        result.setRazon(PermisosDto.getRazon());
        result.setFecha_inicio(PermisosDto.getFecha_inicio());
        result.setFecha_fin(PermisosDto.getFecha_fin());
        result.setEstado_permiso(PermisosDto.getEstado_permiso());

        return result;
    }


}