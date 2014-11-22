package pe.edu.upc.evolucion.cvmanager.backing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import pe.edu.upc.evolucion.cvmanager.backing.beans.ProjectBean;

/**
 *
 * @author USUARIO
 */
@Named("myExperience")
@SessionScoped
//@ManagedBean(name = "myExperience")
//@SessionScoped
public class MyExperienceBackingBean implements Serializable {

    private @Getter @Setter List<ProjectBean> myProjects = new ArrayList<ProjectBean>();
    private @Getter @Setter ProjectBean current = new ProjectBean();
    
    public MyExperienceBackingBean() {
    }        
    
    /**
     * Este método permite realizar el registro de un nuevo proyecto a la experiencia
     * de la persona.
     * 
     * @return 
     */
    public String saveNew() {
        myProjects.add(current);
        return "saved";
    }
    
    public String createNew() {
        current = new ProjectBean();
        return "newProject";
    }
    
    public List<ProjectBean> findProjects() {
        return myProjects;
    }
}
