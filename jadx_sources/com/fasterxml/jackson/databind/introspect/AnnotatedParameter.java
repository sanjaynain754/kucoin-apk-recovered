package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.C6490g;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes45.dex */
public final class AnnotatedParameter extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    protected final int _index;
    protected final AnnotatedWithParams _owner;
    protected final JavaType _type;

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!C6490g.m11905H(obj, AnnotatedParameter.class)) {
            return false;
        }
        AnnotatedParameter annotatedParameter = (AnnotatedParameter) obj;
        return annotatedParameter._owner.equals(this._owner) && annotatedParameter._index == this._index;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public AnnotatedElement getAnnotated() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._owner.getDeclaringClass();
    }

    public int getIndex() {
        return this._index;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return this._owner.getMember();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public int getModifiers() {
        return this._owner.getModifiers();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public String getName() {
        return "";
    }

    public AnnotatedWithParams getOwner() {
        return this._owner;
    }

    public Type getParameterType() {
        return this._type;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public Class<?> getRawType() {
        return this._type.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public JavaType getType() {
        return this._type;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of " + getDeclaringClass().getName());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public int hashCode() {
        return this._owner.hashCode() + this._index;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor parameter of " + getDeclaringClass().getName());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public String toString() {
        return "[parameter #" + getIndex() + ", annotations: " + this._annotations + "]";
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public AnnotatedParameter withAnnotations(C6412i c6412i) {
        return c6412i == this._annotations ? this : this._owner.replaceParameterAnnotations(this._index, c6412i);
    }

    public AnnotatedParameter(AnnotatedWithParams annotatedWithParams, JavaType javaType, InterfaceC6423t interfaceC6423t, C6412i c6412i, int i11) {
        super(interfaceC6423t, c6412i);
        this._owner = annotatedWithParams;
        this._type = javaType;
        this._index = i11;
    }
}
