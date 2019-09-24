package com.just.teachersystem.Entity;


public class Kind {

  private long id;
  private String class1;//大类
  private String class2;//分类
  private String class3;//类别
  private long computeDptId;//计算科室
  private String null1;//空字段
  private String null2;//


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getClass1() {
    return class1;
  }

  public void setClass1(String class1) {
    this.class1 = class1;
  }


  public String getClass2() {
    return class2;
  }

  public void setClass2(String class2) {
    this.class2 = class2;
  }


  public String getClass3() {
    return class3;
  }

  public void setClass3(String class3) {
    this.class3 = class3;
  }


  public long getComputeDptId() {
    return computeDptId;
  }

  public void setComputeDptId(long computeDptId) {
    this.computeDptId = computeDptId;
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

}
