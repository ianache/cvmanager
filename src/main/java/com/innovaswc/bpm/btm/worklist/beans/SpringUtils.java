package com.innovaswc.bpm.btm.worklist.beans;

import javax.faces.context.FacesContext;
import org.springframework.beans.BeansException;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.jsf.FacesContextUtils;

/**
 *
 * @author USUARIO
 */
public class SpringUtils {
    public static Object getSpringBean(String beanId) throws BeansException {
        WebApplicationContext ctx
                = FacesContextUtils.getWebApplicationContext(FacesContext.getCurrentInstance());
        return ctx.getBean(beanId);
    }    
}
