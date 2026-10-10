package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: com.fasterxml.jackson.annotation.j */
/* JADX INFO: compiled from: JsonIdentityInfo.java */
/* JADX INFO: loaded from: classes45.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC6279j {
    Class<? extends ObjectIdGenerator<?>> generator();

    String property() default "@id";

    Class<? extends InterfaceC6269a0> resolver() default C6271b0.class;

    Class<?> scope() default Object.class;
}
