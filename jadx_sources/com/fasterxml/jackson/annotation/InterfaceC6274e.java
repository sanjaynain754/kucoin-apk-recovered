package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: com.fasterxml.jackson.annotation.e */
/* JADX INFO: compiled from: JsonBackReference.java */
/* JADX INFO: loaded from: classes45.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC6274e {
    String value() default "defaultReference";
}
