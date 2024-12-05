package com.ohgiraffers.petharmony.DTO;

public class jobDTO {

    private String jobCode;
    private String jobName;

    public jobDTO() {}

    public jobDTO(String jobCode, String jobName) {
        this.jobCode = jobCode;
        this.jobName = jobName;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public String toString() {
        return "jobDTO{" +
                "jobCode='" + jobCode + '\'' +
                ", jobName='" + jobName + '\'' +
                '}';
    }
}
