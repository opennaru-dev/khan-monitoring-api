/*
 * Copyright (c) 2017. Opennaru, Inc.
 * http://www.opennaru.com/
 */
package com.opennaru.khan.exception;

/**
 * Exception of KHAN [apm]'s RTC Wall
 * if KHAN [apm] Reject user's request RejectedException is thrown.
 * You can make custom error page with RejectedException in web.xml
 * <error-page>
 *     <exception-type>com.opennaru.khan.exception.RejectedException</exception-type>
 *     <location>/error/rejected_error.jsp</location>
 * </error-page>
 *
 * @Since KHAN [apm] 5.1.0-1.4
 * @Author Junshik Jeon(jjeon@opennaru.com)
 */
public class RejectedException extends Exception {
    public RejectedException() {
        super();
    }

    public RejectedException(String message) {
        super(message);
    }
}
