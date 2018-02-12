package io.transwarp.pudge.demo.entity;

/**
 * 18-2-11 created by zado
 */
public class PudgeDemoException extends RuntimeException {

    public PudgeDemoException() {
    }

    public PudgeDemoException(String message) {
        super(message);
    }

    public PudgeDemoException(String message, Throwable cause) {
        super(message, cause);
    }

    public PudgeDemoException(Throwable cause) {
        super(cause);
    }

    public PudgeDemoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
