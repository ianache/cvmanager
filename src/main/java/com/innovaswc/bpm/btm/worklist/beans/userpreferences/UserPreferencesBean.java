package com.innovaswc.bpm.btm.worklist.beans.userpreferences;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author USUARIO
 */
@ManagedBean(name = "userPreferencesBean")
@SessionScoped
public class UserPreferencesBean implements Serializable {
    private @Setter @Getter String email;
    private @Setter @Getter String defaultLanguage;
    private @Getter List<ExclusionEventBean> events = new ArrayList<ExclusionEventBean>();
    private @Getter List<LanguageBean> languages = new ArrayList<LanguageBean>();
    
    private @Getter @Setter ExclusionEventBean currentEvent = new ExclusionEventBean();

    /**
     * Creates a new instance of UserPreferencesBean
     */
    public UserPreferencesBean() {        
        events.add(new ExclusionEventBean(1, Calendar.getInstance().getTime(),Calendar.getInstance().getTime(),"Juego de Marinera"));
        events.add(new ExclusionEventBean(2, Calendar.getInstance().getTime(),Calendar.getInstance().getTime(),"Vacaciones"));
        events.add(new ExclusionEventBean(3, Calendar.getInstance().getTime(),Calendar.getInstance().getTime(),"Partido de Football"));
        events.add(new ExclusionEventBean(4, Calendar.getInstance().getTime(),Calendar.getInstance().getTime(),"Congreso OWASP"));
        events.add(new ExclusionEventBean(5, Calendar.getInstance().getTime(),Calendar.getInstance().getTime(),"Congreso SEI"));
        events.add(new ExclusionEventBean(6, Calendar.getInstance().getTime(),Calendar.getInstance().getTime(),"Congreso VS"));
        events.add(new ExclusionEventBean(7, Calendar.getInstance().getTime(),Calendar.getInstance().getTime(),"Congreso Oracle"));
        
        languages.add(new LanguageBean("sp", "Spanish"));
        languages.add(new LanguageBean("en", "English"));
    }
    
    public String save() {
        return "successful";
    }    
    
    public String newEvent() {
        events.add(currentEvent);
        currentEvent = new ExclusionEventBean();
        return "successful";
    }
}
