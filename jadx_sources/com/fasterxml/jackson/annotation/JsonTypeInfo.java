package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes45.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonTypeInfo {

    /* JADX INFO: renamed from: com.fasterxml.jackson.annotation.JsonTypeInfo$As */
    public enum EnumC6265As {
        PROPERTY,
        WRAPPER_OBJECT,
        WRAPPER_ARRAY,
        EXTERNAL_PROPERTY,
        EXISTING_PROPERTY
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.annotation.JsonTypeInfo$Id */
    public enum EnumC6266Id {
        NONE(null),
        CLASS("@class"),
        MINIMAL_CLASS("@c"),
        NAME("@type"),
        DEDUCTION(null),
        CUSTOM(null);

        private final String _defaultPropertyName;

        public String getDefaultPropertyName() {
            return this._defaultPropertyName;
        }

        EnumC6266Id(String str) {
            this._defaultPropertyName = str;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.annotation.JsonTypeInfo$a */
    @Deprecated
    public static abstract class AbstractC6267a {
    }

    Class<?> defaultImpl() default JsonTypeInfo.class;

    EnumC6265As include() default EnumC6265As.PROPERTY;

    String property() default "";

    EnumC6266Id use();

    boolean visible() default false;
}
