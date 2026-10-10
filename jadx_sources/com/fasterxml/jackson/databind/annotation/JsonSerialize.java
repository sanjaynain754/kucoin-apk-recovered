package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.util.InterfaceC6491h;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes45.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonSerialize {

    @Deprecated
    public enum Inclusion {
        ALWAYS,
        NON_NULL,
        NON_DEFAULT,
        NON_EMPTY,
        DEFAULT_INCLUSION
    }

    public enum Typing {
        DYNAMIC,
        STATIC,
        DEFAULT_TYPING
    }

    /* JADX INFO: renamed from: as */
    Class<?> m11150as() default Void.class;

    Class<?> contentAs() default Void.class;

    Class<? extends InterfaceC6491h> contentConverter() default InterfaceC6491h.a.class;

    Class<? extends AbstractC6393h> contentUsing() default AbstractC6393h.a.class;

    Class<? extends InterfaceC6491h> converter() default InterfaceC6491h.a.class;

    @Deprecated
    Inclusion include() default Inclusion.DEFAULT_INCLUSION;

    Class<?> keyAs() default Void.class;

    Class<? extends AbstractC6393h> keyUsing() default AbstractC6393h.a.class;

    Class<? extends AbstractC6393h> nullsUsing() default AbstractC6393h.a.class;

    Typing typing() default Typing.DEFAULT_TYPING;

    Class<? extends AbstractC6393h> using() default AbstractC6393h.a.class;
}
