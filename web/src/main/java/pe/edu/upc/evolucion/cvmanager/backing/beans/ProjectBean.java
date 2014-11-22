package pe.edu.upc.evolucion.cvmanager.backing.beans;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author USUARIO
 */
public class ProjectBean {
    private @Getter @Setter String name;
    private @Getter @Setter Date fromDate;
    private @Getter @Setter Date thruDate;
    private @Getter @Setter String roleName;
    private @Getter @Setter String clientName;
}
