package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes45.dex */
public class VirtualAnnotatedMember extends AnnotatedMember implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Class<?> _declaringClass;
    protected final String _name;
    protected final JavaType _type;

    public VirtualAnnotatedMember(InterfaceC6423t interfaceC6423t, Class<?> cls, String str, JavaType javaType) {
        super(interfaceC6423t, null);
        this._declaringClass = cls;
        this._type = javaType;
        this._name = str;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!C6490g.m11905H(obj, getClass())) {
            return false;
        }
        VirtualAnnotatedMember virtualAnnotatedMember = (VirtualAnnotatedMember) obj;
        return virtualAnnotatedMember._declaringClass == this._declaringClass && virtualAnnotatedMember._name.equals(this._name);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public Field getAnnotated() {
        return null;
    }

    public int getAnnotationCount() {
        return 0;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public int getModifiers() {
        return 0;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._declaringClass;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public String getName() {
        return this._name;
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
    public Object getValue(Object obj) throws IllegalArgumentException {
        throw new IllegalArgumentException("Cannot get virtual property '" + this._name + "'");
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public int hashCode() {
        return this._name.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        throw new IllegalArgumentException("Cannot set virtual property '" + this._name + "'");
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public String toString() {
        return "[virtual " + getFullName() + "]";
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public AbstractC6404a withAnnotations(C6412i c6412i) {
        return this;
    }
}
