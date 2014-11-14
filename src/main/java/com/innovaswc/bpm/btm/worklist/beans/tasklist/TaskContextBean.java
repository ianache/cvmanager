package com.innovaswc.bpm.btm.worklist.beans.tasklist;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.TaskContext;

/**
 *
 * @author USUARIO
 */
public class TaskContextBean implements TaskContext, Serializable {

    public String getIdentityContext() {
        return "context-ID";
    }

    public Boolean getIsAdmin() {
        return true;
    }

    public Locale getLocale() {
        return Locale.ENGLISH;
    }

    public String getObjectId() {
        return "SADA-3232-SADF-2113";
    }

    public long getStartDateTime() {
        return Calendar.getInstance().getTimeInMillis();
    }

    public TimeZone getTimeZone() {
        return Calendar.getInstance().getTimeZone();
    }

    public String getToken() {
        return "TOKEN-1432423-234234";
    }

    public String getUser() {
        return "ianache";
    }
    
}
