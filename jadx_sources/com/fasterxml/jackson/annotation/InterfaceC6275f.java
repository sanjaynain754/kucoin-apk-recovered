package com.fasterxml.jackson.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: com.fasterxml.jackson.annotation.f */
/* JADX INFO: compiled from: JsonClassDescription.java */
/* JADX INFO: loaded from: classes45.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC6275f {
    String value() default "";
}
