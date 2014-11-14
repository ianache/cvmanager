package com.innovaswc.bpm.btm.worklist.beans.userpreferences;

import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author USUARIO
 */
public class ExclusionEventBean implements Serializable {
    private @Getter @Setter Integer id;
    private @Getter @Setter Date fromDate;
    private @Getter @Setter Date thruDate;
    private @Getter @Setter String title;

    public ExclusionEventBean() {
    }

    public ExclusionEventBean(Integer id, Date fromDate, Date thruDate, String title) {
        this.id = id;
        this.fromDate = fromDate;
        this.thruDate = thruDate;
        this.title = title;
    }
    
}
