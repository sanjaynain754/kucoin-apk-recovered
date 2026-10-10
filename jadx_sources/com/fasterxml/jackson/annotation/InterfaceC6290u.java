package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: com.fasterxml.jackson.annotation.u */
/* JADX INFO: compiled from: JsonSubTypes.java */
/* JADX INFO: loaded from: classes45.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC6290u {

    /* JADX INFO: renamed from: com.fasterxml.jackson.annotation.u$a */
    /* JADX INFO: compiled from: JsonSubTypes.java */
    public @interface a {
        String name() default "";

        String[] names() default {};

        Class<?> value();
    }

    a[] value();
}
