package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.a */
/* JADX INFO: compiled from: Annotated.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6404a {
    @Deprecated
    public abstract Iterable<Annotation> annotations();

    public abstract boolean equals(Object obj);

    public abstract AnnotatedElement getAnnotated();

    public abstract <A extends Annotation> A getAnnotation(Class<A> cls);

    public abstract int getModifiers();

    public abstract String getName();

    public abstract Class<?> getRawType();

    public abstract JavaType getType();

    public abstract boolean hasAnnotation(Class<?> cls);

    public abstract boolean hasOneOf(Class<? extends Annotation>[] clsArr);

    public abstract int hashCode();

    public abstract String toString();

    public boolean isPublic() {
        return Modifier.isPublic(getModifiers());
    }
}
