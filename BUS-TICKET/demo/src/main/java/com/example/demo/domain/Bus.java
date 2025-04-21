package com.example.demo.domain;

public class Bus {

    public String busname;
    public String busno;
    public String dept_time;

    public Bus(String busname, String busno, String dept_time){
        this.busname=busname;
        this.busno=busno;
        this.dept_time=dept_time;
    }

    public String getbusname (){
        return busname;
    }
    public void setbusname(String busname){
        this.busname=busname;
    };
    public String getbusno(){
        return busno;
    }
    public void setbusno(String busno){
        this.busno=busno;
    };
    public String getdept_time ()
    {
        return dept_time;
    }
    public void setdept_time(String dept_time){
        this.dept_time=dept_time;
    };
}