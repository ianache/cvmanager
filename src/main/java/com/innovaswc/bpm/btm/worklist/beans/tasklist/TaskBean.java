package com.innovaswc.bpm.btm.worklist.beans.tasklist;

import java.util.Date;
import lombok.Getter;

/**
 *
 * @author USUARIO
 */
public class TaskBean {
    private @Getter String id;
    private @Getter String title;
    private @Getter Date dueDate;
    private @Getter String assignee;
    private @Getter String currentState;

    public TaskBean() {
    }

    public TaskBean(String id, String title, Date dueDate, String assignee, String currentState) {
        this.id = id;
        this.title = title;
        this.dueDate = dueDate;
        this.assignee = assignee;
        this.currentState = currentState;
    }
        
}
