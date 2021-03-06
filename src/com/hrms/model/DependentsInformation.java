package com.hrms.model;
// Generated Dec 16, 2016 10:52:21 AM by Hibernate Tools 4.3.1



/**
 * DependentsInformation generated by hbm2java
 */
public class DependentsInformation  implements java.io.Serializable {


     private Integer id;
     private FamilyIdentity familyIdentity;
     private String depName;
     private Integer depAge;
     private String depStatus;
     private Integer depId;

    public DependentsInformation() {
    }

	
    public DependentsInformation(FamilyIdentity familyIdentity) {
        this.familyIdentity = familyIdentity;
    }
    public DependentsInformation(FamilyIdentity familyIdentity, String depName, Integer depAge, String depStatus, Integer depId) {
       this.familyIdentity = familyIdentity;
       this.depName = depName;
       this.depAge = depAge;
       this.depStatus = depStatus;
       this.depId = depId;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public FamilyIdentity getFamilyIdentity() {
        return this.familyIdentity;
    }
    
    public void setFamilyIdentity(FamilyIdentity familyIdentity) {
        this.familyIdentity = familyIdentity;
    }
    public String getDepName() {
        return this.depName;
    }
    
    public void setDepName(String depName) {
        this.depName = depName;
    }
    public Integer getDepAge() {
        return this.depAge;
    }
    
    public void setDepAge(Integer depAge) {
        this.depAge = depAge;
    }
    public String getDepStatus() {
        return this.depStatus;
    }
    
    public void setDepStatus(String depStatus) {
        this.depStatus = depStatus;
    }
    public Integer getDepId() {
        return this.depId;
    }
    
    public void setDepId(Integer depId) {
        this.depId = depId;
    }




}


