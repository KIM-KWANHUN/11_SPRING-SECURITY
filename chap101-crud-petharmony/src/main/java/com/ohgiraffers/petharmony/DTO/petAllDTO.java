package com.ohgiraffers.petharmony.DTO;

import java.util.Date;

public class petAllDTO {
    private String empCode;
    private String empName;
    private String empEmail;
    private String empPhone;
    private Date hireDate;
    private Date entDate;
    private String empGender;
    private String empAddress;
    private String jobCode;
    private String deptCode;
    private String authority;
    private String profileImage;
    private com.ohgiraffers.petharmony.DTO.jobDTO jobDTO;
    private deptDTO deptDTO;

    public petAllDTO() {}

    public petAllDTO(String empCode, String empName, String empEmail, String empPhone, Date hireDate, Date entDate, String empGender, String empAddress, String jobCode, String deptCode, String authority, String profileImage, com.ohgiraffers.petharmony.DTO.jobDTO jobDTO, com.ohgiraffers.petharmony.DTO.deptDTO deptDTO) {
        this.empCode = empCode;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empPhone = empPhone;
        this.hireDate = hireDate;
        this.entDate = entDate;
        this.empGender = empGender;
        this.empAddress = empAddress;
        this.jobCode = jobCode;
        this.deptCode = deptCode;
        this.authority = authority;
        this.profileImage = profileImage;
        this.jobDTO = jobDTO;
        this.deptDTO = deptDTO;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getEntDate() {
        return entDate;
    }

    public void setEntDate(Date entDate) {
        this.entDate = entDate;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public com.ohgiraffers.petharmony.DTO.jobDTO getJobDTO() {
        return jobDTO;
    }

    public void setJobDTO(com.ohgiraffers.petharmony.DTO.jobDTO jobDTO) {
        this.jobDTO = jobDTO;
    }

    public com.ohgiraffers.petharmony.DTO.deptDTO getDeptDTO() {
        return deptDTO;
    }

    public void setDeptDTO(com.ohgiraffers.petharmony.DTO.deptDTO deptDTO) {
        this.deptDTO = deptDTO;
    }

    @Override
    public String toString() {
        return "petAllDTO{" +
                "empCode='" + empCode + '\'' +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empPhone='" + empPhone + '\'' +
                ", hireDate=" + hireDate +
                ", entDate=" + entDate +
                ", empGender='" + empGender + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", authority='" + authority + '\'' +
                ", profileImage='" + profileImage + '\'' +
                ", jobDTO=" + jobDTO +
                ", deptDTO=" + deptDTO +
                '}';
    }
}

