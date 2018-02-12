package io.transwarp.pudge.demo.client.controller.response;

/**
 * 18-2-12 created by zado
 */
public class SimpleResp {

    private String result;

    private String message;

    public SimpleResp() {
    }

    public static SimpleResp success(String message) {
        SimpleResp resp = new SimpleResp();
        resp.setResult("Success");
        resp.setMessage(message);

        return resp;
    }

    public static SimpleResp fail(String message) {
        SimpleResp resp = new SimpleResp();
        resp.setResult("Fail");
        resp.setMessage(message);

        return resp;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
