/*
 * Copyright (c) 2016. Opennaru, Inc.
 * http://www.opennaru.com/
 */

package com.opennaru.khan.agent.instrument;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for tracing method
 * KHAN [monitoring] can detect your custom traces with @TraceMethod annotation.
 * Just place the @TraceMethod annotation on each target method.
 *
 * @Since KHAN [montoring] 1.3.0-8
 * @Author Junshik Jeon(service@opennaru.com)
 */
@Target({java.lang.annotation.ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TraceMethod {

}
