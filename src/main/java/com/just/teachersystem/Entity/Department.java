package com.just.teachersystem.Entity;


public class Department {

  private long id;//序号
  private String dptId;//单位号
  private String dptname;//部门名称


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getDptId() {
    return dptId;
  }

  public void setDptId(String dptId) {
    this.dptId = dptId;
  }


  public String getDptname() {
    return dptname;
  }

  public void setDptname(String dptname) {
    this.dptname = dptname;
  }

}
