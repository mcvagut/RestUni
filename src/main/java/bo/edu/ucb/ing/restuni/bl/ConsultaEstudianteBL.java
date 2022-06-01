package bo.edu.ucb.ing.restuni.bl;

import bo.edu.ucb.ing.restuni.api.EstudianteApiDto;
import bo.edu.ucb.ing.restuni.dao.EstudianteDao;
import bo.edu.ucb.ing.restuni.dao.HorarioEstudianteDao;
import bo.edu.ucb.ing.restuni.dto.ddbb.EstudianteDto;
import bo.edu.ucb.ing.restuni.dto.ddbb.HorarioEstudianteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

    @Service

    public class ConsultaEstudianteBL {
        private EstudianteDao estudianteDao;
        private HorarioEstudianteDao horarioEstudianteDao;

        public ConsultaEstudianteBL(EstudianteDao estudianteDao, HorarioEstudianteDao horarioEstudianteDao) {
            this.estudianteDao = estudianteDao;
            this.horarioEstudianteDao = horarioEstudianteDao;
        }

        public EstudianteApiDto findHorarioEstudianteById(Integer estudianteId) {
            EstudianteApiDto result = new EstudianteApiDto();
            EstudianteDto estudianteDto = estudianteDao.findEstudianteByPk(estudianteId);
            //Transformación
            result.setEstudianteId(estudianteDto.getEstudianteId());
            result.setNombres(estudianteDto.getNombres());
            result.setApellidos(estudianteDto.getApellidos());
            result.setCi(estudianteDto.getCi());
            result.setPass(estudianteDto.getPass());

            //Inicializamos los datos para dia, materia, paralelo, aula, horaInicio, horaFin
            result.setDia(new ArrayList<>());
            result.setMateria(new ArrayList<>());
            result.setParalelo(new ArrayList<>());
            result.setAula(new ArrayList<>());
            result.setHoraInicio(new ArrayList<>());
            result.setHoraFin(new ArrayList<>());
            //Buscamos los estudiantes


            return result;
        }

}

