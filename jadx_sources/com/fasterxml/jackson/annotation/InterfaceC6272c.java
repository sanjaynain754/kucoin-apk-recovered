package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: com.fasterxml.jackson.annotation.c */
/* JADX INFO: compiled from: JsonAnyGetter.java */
/* JADX INFO: loaded from: classes45.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC6272c {
    boolean enabled() default true;
}
