package com.just.teachersystem.Entity;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Award {

  private long id;
  private long dtpId;
  private long userId;
  private String teammate;
  private String awardUnit;
  private String content;
  private long kindId;
  private long level;
  private String prize;
  private double bonus;
  private String awardYear;
  private String certificate;
  private Date awardTime;
  private String schoolYear;
  private String year;
  private long status;
  private String reason;
  private Date lastTime;
  private String null1;
  private String null2;
  private String null3;


}
