package com.nadeem.app.exception;

import java.util.Date;

public class ErrorDetails {
    private Date timestamp;
    private String message;

    public ErrorDetails(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    private String details;


    /**
     * get field
     *
     * @return timestamp
     */
    public Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * set field
     *
     * @param timestamp
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * get field
     *
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * set field
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * get field
     *
     * @return details
     */
    public String getDetails() {
        return this.details;
    }

    /**
     * set field
     *
     * @param details
     */
    public void setDetails(String details) {
        this.details = details;
    }
}
