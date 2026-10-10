package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.C6490g;
import com.tencent.bugly.proguard.RunnableC33958ua;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.Collections;

/* JADX INFO: loaded from: classes45.dex */
public abstract class AnnotatedMember extends AbstractC6404a implements Serializable {
    private static final long serialVersionUID = 1;
    protected final transient C6412i _annotations;
    protected final transient InterfaceC6423t _typeContext;

    public AnnotatedMember(InterfaceC6423t interfaceC6423t, C6412i c6412i) {
        this._typeContext = interfaceC6423t;
        this._annotations = c6412i;
    }

    public abstract Class<?> getDeclaringClass();

    public abstract Member getMember();

    public abstract Object getValue(Object obj) throws UnsupportedOperationException, IllegalArgumentException;

    public abstract void setValue(Object obj, Object obj2) throws UnsupportedOperationException, IllegalArgumentException;

    public abstract AbstractC6404a withAnnotations(C6412i c6412i);

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    @Deprecated
    public Iterable<Annotation> annotations() {
        C6412i c6412i = this._annotations;
        return c6412i == null ? Collections.EMPTY_LIST : c6412i.m11516c();
    }

    public C6412i getAllAnnotations() {
        return this._annotations;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        C6412i c6412i = this._annotations;
        if (c6412i == null) {
            return null;
        }
        return (A) c6412i.get(cls);
    }

    public String getFullName() {
        return getDeclaringClass().getName() + RunnableC33958ua.f72251f + getName();
    }

    @Deprecated
    public InterfaceC6423t getTypeContext() {
        return this._typeContext;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public final boolean hasAnnotation(Class<?> cls) {
        C6412i c6412i = this._annotations;
        if (c6412i == null) {
            return false;
        }
        return c6412i.has(cls);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        C6412i c6412i = this._annotations;
        if (c6412i == null) {
            return false;
        }
        return c6412i.hasOneOf(clsArr);
    }

    public final void fixAccess(boolean z11) {
        Member member = getMember();
        if (member != null) {
            C6490g.m11936g(member, z11);
        }
    }

    public AnnotatedMember(AnnotatedMember annotatedMember) {
        this._typeContext = annotatedMember._typeContext;
        this._annotations = annotatedMember._annotations;
    }
}
