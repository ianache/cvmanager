package com.innovaswc.bpm.btm.worklist.beans.userpreferences;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author USUARIO
 */
public class LanguageBean {
    private @Getter @Setter String code;
    private @Getter @Setter String name;

    public LanguageBean(String code, String name) {
        this.code = code;
        this.name = name;
    }
    
}
