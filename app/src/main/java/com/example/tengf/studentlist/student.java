package com.example.tengf.studentlist;

/**
 * Created by tengf on 2016/12/2.
 */

public class student {
    private String studentName;
    private String studentgrade;

    public student(int ic_launcher, String studentName, String studentgrade) {
        this.studentName = studentName;
        this.studentgrade = studentgrade;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentgrade() {
        return studentgrade;
    }

    public void setStudentgrade(String studentgrade) {
        this.studentgrade = studentgrade;
    }
}
