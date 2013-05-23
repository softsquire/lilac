/*
 * Copyright 2013 Jimmy Leung
 */

package com.lilac.core.service;

/**
 * @author Jimmy Leung
 * @since 2013-5-2
 */
@SuppressWarnings("serial")
public class ServiceException extends RuntimeException {

    public ServiceException(){
        super();
    }

    public ServiceException(String message){
        super(message);
    }

    public ServiceException(Throwable cause){
        super(cause);
    }

    public ServiceException(String message, Throwable cause){
        super(message, cause);
    }
}
