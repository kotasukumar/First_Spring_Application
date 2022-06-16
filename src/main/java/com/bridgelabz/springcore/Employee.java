package com.bridgelabz.springcore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int eId;
    private String eName;
    @Autowired
    private Department dept;
    public static final Logger logger = (Logger) LoggerFactory.getLogger(Employee.class);

    public int getId() {
        return eId;
    }

    public void setId(int eId) {
        this.eId = eId;
    }

    public String getName() {
        return eName;
    }

    public void setName(String eName) {
        this.eName = eName;
    }

    public void showDetails() {
        logger.debug("employeeId: " + eId);
        logger.debug("employeeName: " + eName);
        dept.setDeptName("Information Technology");
        logger.debug("deptName: " + dept.getDeptName());
    }
}
