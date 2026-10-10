package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: com.fasterxml.jackson.annotation.i */
/* JADX INFO: compiled from: JsonGetter.java */
/* JADX INFO: loaded from: classes45.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC6278i {
    String value() default "";
}
