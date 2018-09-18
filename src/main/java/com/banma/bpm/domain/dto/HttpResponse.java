package com.banma.bpm.domain.dto;


public class HttpResponse {

    //响应状态码
    private int responseCode;

    //网页内容
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    @Override
    public String toString() {
        final String tab = "    ";

        String retValue = "";

        retValue = "HttpResponse ( "
                + super.toString() + tab
                + "responseCode = " + this.responseCode + tab
                + "content = " + this.content + tab
                + " )";

        return retValue;
    }
}
