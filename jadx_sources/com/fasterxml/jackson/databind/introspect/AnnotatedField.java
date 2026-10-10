package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes45.dex */
public final class AnnotatedField extends AnnotatedMember implements Serializable {
    private static final long serialVersionUID = 1;
    protected final transient Field _field;
    protected Serialization _serialization;

    public AnnotatedField(InterfaceC6423t interfaceC6423t, Field field, C6412i c6412i) {
        super(interfaceC6423t, c6412i);
        this._field = field;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!C6490g.m11905H(obj, AnnotatedField.class)) {
            return false;
        }
        Field field = ((AnnotatedField) obj)._field;
        if (field == null) {
            return this._field == null;
        }
        return field.equals(this._field);
    }

    public static final class Serialization implements Serializable {
        private static final long serialVersionUID = 1;
        protected Class<?> clazz;
        protected String name;

        public Serialization(Field field) {
            this.clazz = field.getDeclaringClass();
            this.name = field.getName();
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public Field getAnnotated() {
        return this._field;
    }

    public int getAnnotationCount() {
        return this._annotations.size();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._field.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return this._field;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public int getModifiers() {
        return this._field.getModifiers();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public String getName() {
        return this._field.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public Class<?> getRawType() {
        return this._field.getType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public JavaType getType() {
        return this._typeContext.mo11457a(this._field.getGenericType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws IllegalArgumentException {
        try {
            return this._field.get(obj);
        } catch (IllegalAccessException e11) {
            throw new IllegalArgumentException("Failed to getValue() for field " + getFullName() + ": " + e11.getMessage(), e11);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public int hashCode() {
        return this._field.getName().hashCode();
    }

    public Object readResolve() {
        Serialization serialization = this._serialization;
        Class<?> cls = serialization.clazz;
        try {
            Field declaredField = cls.getDeclaredField(serialization.name);
            if (!declaredField.isAccessible()) {
                C6490g.m11936g(declaredField, false);
            }
            return new AnnotatedField(null, declaredField, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this._serialization.name + "' from Class '" + cls.getName());
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        try {
            this._field.set(obj, obj2);
        } catch (IllegalAccessException e11) {
            throw new IllegalArgumentException("Failed to setValue() for field " + getFullName() + ": " + e11.getMessage(), e11);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public String toString() {
        return "[field " + getFullName() + "]";
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public AnnotatedField withAnnotations(C6412i c6412i) {
        return new AnnotatedField(this._typeContext, this._field, c6412i);
    }

    public Object writeReplace() {
        return new AnnotatedField(new Serialization(this._field));
    }

    public AnnotatedField(Serialization serialization) {
        super(null, null);
        this._field = null;
        this._serialization = serialization;
    }

    public boolean isTransient() {
        return Modifier.isTransient(getModifiers());
    }
}
