package bo.edu.ucb.ing.restuni.dto.ddbb;

import java.sql.Time;

public class HorarioEstudianteDto {
        private Integer id;
        private String dia;
        private String materia;
        private String paralelo;
        private String aula;
        private Time horainicio;
        private Time horafin;


        public HorarioEstudianteDto() {
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getDia() {
            return dia;
        }

        public void setDia(String dia) {
            this.dia = dia;
        }

        public String getMateria() {
            return materia;
        }

        public void setMateria(String materia) {
            this.materia = materia;
        }

        public String getParalelo() {
            return paralelo;
        }

        public void setParalelo(String paralelo) {
            this.paralelo = paralelo;
        }

        public String getAula() {
            return aula;
        }

        public void setAula(String aula) {
            this.aula = aula;
        }

        public Time getHorainicio() {
            return horainicio;
        }

        public void setHorainicio(Time horainicio) {
            this.horainicio = horainicio;
        }

        public Time getHorafin() {
            return horafin;
        }

        public void setHorafin(Time horafin) {
            this.horafin = horafin;
        }

        @Override
        public String toString() {
            return "HorarioEstudianteDTO{" +
                    "id=" + id +
                    ", dia='" + dia + '\'' +
                    ", materia='" + materia + '\'' +
                    ", paralelo='" + paralelo + '\'' +
                    ", aula='" + aula + '\'' +
                    ", horainicio=" + horainicio +
                    ", horafin=" + horafin +
                    '}';
        }
}
