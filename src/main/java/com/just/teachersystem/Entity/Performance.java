package com.just.teachersystem.Entity;


public class Performance {

  private long id;
  private long dptId;//部门
  private long computeofficeId;//计算科室
  private String type;//类别
  private String year;//立项年度
  private String project;//项目名称
  private String master;//项目负责人
  private long points;//业绩分
  private String null1;//空字段
  private String null2;
  private String null3;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getDptId() {
    return dptId;
  }

  public void setDptId(long dptId) {
    this.dptId = dptId;
  }


  public long getComputeofficeId() {
    return computeofficeId;
  }

  public void setComputeofficeId(long computeofficeId) {
    this.computeofficeId = computeofficeId;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }


  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }


  public String getMaster() {
    return master;
  }

  public void setMaster(String master) {
    this.master = master;
  }


  public long getPoints() {
    return points;
  }

  public void setPoints(long points) {
    this.points = points;
  }


  public String getNull1() {
    return null1;
  }

  public void setNull1(String null1) {
    this.null1 = null1;
  }


  public String getNull2() {
    return null2;
  }

  public void setNull2(String null2) {
    this.null2 = null2;
  }


  public String getNull3() {
    return null3;
  }

  public void setNull3(String null3) {
    this.null3 = null3;
  }

}
