package bo.edu.ucb.ing.restuni.bl;
import bo.edu.ucb.ing.restuni.dao.ListaPermisoDocenteDAO;
import bo.edu.ucb.ing.restuni.dto.ddbb.ListaPermisoDocenteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component

public class ConsultaPermisoDocente {

    private ListaPermisoDocenteDAO listaPermisoDocenteDAO;
    @Autowired
    public ConsultaPermisoDocente(ListaPermisoDocenteDAO listaPermisoDocenteDAO) {
        this.listaPermisoDocenteDAO = listaPermisoDocenteDAO;
    }




    public List<ListaPermisoDocenteDTO> findListaPermisoDocenteByBotChatId(Long chatId) {
        return listaPermisoDocenteDAO.findListaPermisoDocenteByBotChatId(chatId+"");
    }


}