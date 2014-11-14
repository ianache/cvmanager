package com.innovaswc.bpm.btm.worklist.beans.tasklist;

import com.innovaswc.bpm.btm.worklist.beans.SpringUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import lombok.Getter;
import lombok.Setter;
import org.apache.myfaces.trinidad.component.UIXTable;
import org.apache.myfaces.trinidad.event.SelectionEvent;
import org.springframework.context.annotation.Scope;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.LeanTaskDefinition;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.TaskContext;
import pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.ILeanTaskService;
import pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.ITaskService;
import pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.LeanTaskServiceException;
import pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.TaskServiceException;

/**
 *
 * @author USUARIO
 */
@ManagedBean(name = "myTaskList")
@Scope("session")
public class MyTaskListBean implements Serializable {

    private @Setter
    @Getter
    UIXTable myTaskBinding;
    private @Getter
    List<TaskBean> myTasks = new ArrayList<TaskBean>();

    public static ITaskService getTaskService() {
        return (ITaskService) SpringUtils.getSpringBean("taskService");
    }

    public static ILeanTaskService getLeanTaskService() {
        return (ILeanTaskService) SpringUtils.getSpringBean("leanTaskService");
    }
    
    public static TaskContext getTaskContext() {
        return (TaskContext) SpringUtils.getSpringBean("taskContext");
    }
    
    public MyTaskListBean() {
        try {
            //getTaskService().batchClaim(getTaskContext(), null);
            List<LeanTaskDefinition> leanDefinitions = 
                    getLeanTaskService().listLeanTaskDefinitions(null);
            for (LeanTaskDefinition ltd: leanDefinitions) {
                myTasks.add(new TaskBean("111", ltd.getTitle(),
                    Calendar.getInstance().getTime(), "ianache", "ASSIGNED"));
            }
            /*
            myTasks.add(new TaskBean("111", "Emitir Factura Pedido No23023-232",
                    Calendar.getInstance().getTime(), "ianache", "ASSIGNED"));
            myTasks.add(new TaskBean("111", "Cancelar Factura 001-232232",
                    Calendar.getInstance().getTime(), "xvillavicencio", "ASSIGNED"));
            myTasks.add(new TaskBean("111", "Emitir Factura Pedido No23023-232",
                    Calendar.getInstance().getTime(), "ianache", "ASSIGNED"));
            myTasks.add(new TaskBean("111", "Emitir Factura Pedido No23023-232",
                    Calendar.getInstance().getTime(), "ianache", "ASSIGNED"));
            myTasks.add(new TaskBean("111", "Emitir Factura Pedido No23023-232",
                    Calendar.getInstance().getTime(), "ianache", "ASSIGNED"));
            myTasks.add(new TaskBean("111", "Emitir Factura Pedido No23023-232",
                    Calendar.getInstance().getTime(), "ianache", "ASSIGNED"));
            myTasks.add(new TaskBean("111", "Emitir Factura Pedido No23023-232",
                    Calendar.getInstance().getTime(), "ianache", "ASSIGNED"));
            myTasks.add(new TaskBean("111", "Emitir Factura Pedido No23023-232",
                    Calendar.getInstance().getTime(), "ianache", "ASSIGNED"));
            myTasks.add(new TaskBean("111", "Emitir Factura Pedido No23023-232",
                    Calendar.getInstance().getTime(), "ianache", "ASSIGNED"));
            myTasks.add(new TaskBean("111", "Emitir Factura Pedido No23023-232",
                    Calendar.getInstance().getTime(), "ianache", "ASSIGNED"));
            myTasks.add(new TaskBean("111", "Emitir Factura Pedido No23023-232",
                    Calendar.getInstance().getTime(), "ianache", "ASSIGNED"));
            myTasks.add(new TaskBean("111", "Emitir Factura Pedido No23023-232",
                    Calendar.getInstance().getTime(), "ianache", "ASSIGNED"));
            myTasks.add(new TaskBean("111", "Emitir Factura Pedido No23023-232",
                    Calendar.getInstance().getTime(), "ianache", "ASSIGNED"));
            myTasks.add(new TaskBean("111", "Emitir Factura Pedido No23023-232",
                    Calendar.getInstance().getTime(), "ianache", "ASSIGNED"));*/
        } catch (LeanTaskServiceException ex) {
            Logger.getLogger(MyTaskListBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void changeSelected(SelectionEvent event) {

    }
}
