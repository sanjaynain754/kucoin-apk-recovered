package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes45.dex */
public abstract class AnnotatedWithParams extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    protected final C6412i[] _paramAnnotations;

    public AnnotatedWithParams(InterfaceC6423t interfaceC6423t, C6412i c6412i, C6412i[] c6412iArr) {
        super(interfaceC6423t, c6412i);
        this._paramAnnotations = c6412iArr;
    }

    public abstract Object call() throws Exception;

    public abstract Object call(Object[] objArr) throws Exception;

    public abstract Object call1(Object obj) throws Exception;

    @Deprecated
    public abstract Type getGenericParameterType(int i11);

    public abstract int getParameterCount();

    public abstract JavaType getParameterType(int i11);

    public abstract Class<?> getRawParameterType(int i11);

    public final void addOrOverrideParam(int i11, Annotation annotation) {
        C6412i c6412i = this._paramAnnotations[i11];
        if (c6412i == null) {
            c6412i = new C6412i();
            this._paramAnnotations[i11] = c6412i;
        }
        c6412i.m11515b(annotation);
    }

    public final int getAnnotationCount() {
        return this._annotations.size();
    }

    public final AnnotatedParameter getParameter(int i11) {
        return new AnnotatedParameter(this, getParameterType(i11), this._typeContext, getParameterAnnotations(i11), i11);
    }

    public final C6412i getParameterAnnotations(int i11) {
        C6412i[] c6412iArr = this._paramAnnotations;
        if (c6412iArr == null || i11 < 0 || i11 >= c6412iArr.length) {
            return null;
        }
        return c6412iArr[i11];
    }

    public AnnotatedParameter replaceParameterAnnotations(int i11, C6412i c6412i) {
        this._paramAnnotations[i11] = c6412i;
        return getParameter(i11);
    }

    public AnnotatedWithParams(AnnotatedWithParams annotatedWithParams, C6412i[] c6412iArr) {
        super(annotatedWithParams);
        this._paramAnnotations = c6412iArr;
    }
}
