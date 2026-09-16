package com.myapp.demo.firstapp.Entity;

// error response pojo
public class StudentErrorResponse {
    public int status ;
    public String message ;
    public long timeStamp;

    public StudentErrorResponse(int status, String message, long timeStamp){
        this.message = message;
        this.status = status;
        this.timeStamp = timeStamp;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
