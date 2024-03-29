package com.example.MyBlog.vo;

public class Response {


    private boolean success; //status
    private String message; //message
    private Object body; //body

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public Response(boolean success, String message){
        this.success = success;
        this.message = message;
    }

    public Response(boolean success, String message, Object body){
        this.success = success;
        this.message = message;
        this.body = body;
    }
}
