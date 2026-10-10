package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes45.dex */
public final class AnnotatedMethod extends AnnotatedWithParams implements Serializable {
    private static final long serialVersionUID = 1;
    protected final transient Method _method;
    protected Class<?>[] _paramClasses;
    protected Serialization _serialization;

    public AnnotatedMethod(InterfaceC6423t interfaceC6423t, Method method, C6412i c6412i, C6412i[] c6412iArr) {
        super(interfaceC6423t, c6412i, c6412iArr);
        if (method == null) {
            throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
        }
        this._method = method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call() throws Exception {
        return this._method.invoke(null, new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!C6490g.m11905H(obj, AnnotatedMethod.class)) {
            return false;
        }
        Method method = ((AnnotatedMethod) obj)._method;
        if (method == null) {
            return this._method == null;
        }
        return method.equals(this._method);
    }

    public static final class Serialization implements Serializable {
        private static final long serialVersionUID = 1;
        protected Class<?>[] args;
        protected Class<?> clazz;
        protected String name;

        public Serialization(Method method) {
            this.clazz = method.getDeclaringClass();
            this.name = method.getName();
            this.args = method.getParameterTypes();
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call(Object[] objArr) throws Exception {
        return this._method.invoke(null, objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call1(Object obj) throws Exception {
        return this._method.invoke(null, obj);
    }

    public final Object callOn(Object obj) throws Exception {
        return this._method.invoke(obj, null);
    }

    public final Object callOnWith(Object obj, Object... objArr) throws Exception {
        return this._method.invoke(obj, objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public Method getAnnotated() {
        return this._method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._method.getDeclaringClass();
    }

    @Deprecated
    public Type[] getGenericParameterTypes() {
        return this._method.getGenericParameterTypes();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Method getMember() {
        return this._method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public int getModifiers() {
        return this._method.getModifiers();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public String getName() {
        return this._method.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public JavaType getParameterType(int i11) {
        Type[] genericParameterTypes = this._method.getGenericParameterTypes();
        if (i11 >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.mo11457a(genericParameterTypes[i11]);
    }

    public Class<?>[] getRawParameterTypes() {
        if (this._paramClasses == null) {
            this._paramClasses = this._method.getParameterTypes();
        }
        return this._paramClasses;
    }

    public Class<?> getRawReturnType() {
        return this._method.getReturnType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public Class<?> getRawType() {
        return this._method.getReturnType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public JavaType getType() {
        return this._typeContext.mo11457a(this._method.getGenericReturnType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws IllegalArgumentException {
        try {
            return this._method.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException e11) {
            throw new IllegalArgumentException("Failed to getValue() with method " + getFullName() + ": " + C6490g.m11952o(e11), e11);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public int hashCode() {
        return this._method.getName().hashCode();
    }

    public Object readResolve() {
        Serialization serialization = this._serialization;
        Class<?> cls = serialization.clazz;
        try {
            Method declaredMethod = cls.getDeclaredMethod(serialization.name, serialization.args);
            if (!declaredMethod.isAccessible()) {
                C6490g.m11936g(declaredMethod, false);
            }
            return new AnnotatedMethod(null, declaredMethod, null, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this._serialization.name + "' from Class '" + cls.getName());
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        try {
            this._method.invoke(obj, obj2);
        } catch (IllegalAccessException | InvocationTargetException e11) {
            throw new IllegalArgumentException("Failed to setValue() with method " + getFullName() + ": " + C6490g.m11952o(e11), e11);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public String toString() {
        return "[method " + getFullName() + "]";
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public AnnotatedMethod withAnnotations(C6412i c6412i) {
        return new AnnotatedMethod(this._typeContext, this._method, c6412i, this._paramAnnotations);
    }

    public Object writeReplace() {
        return new AnnotatedMethod(new Serialization(this._method));
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public String getFullName() {
        String fullName = super.getFullName();
        int parameterCount = getParameterCount();
        if (parameterCount != 0) {
            if (parameterCount != 1) {
                return String.format("%s(%d params)", super.getFullName(), Integer.valueOf(getParameterCount()));
            }
            return fullName + "(" + getRawParameterType(0).getName() + ")";
        }
        return fullName + "()";
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    @Deprecated
    public Type getGenericParameterType(int i11) {
        Type[] genericParameterTypes = getGenericParameterTypes();
        if (i11 >= genericParameterTypes.length) {
            return null;
        }
        return genericParameterTypes[i11];
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public int getParameterCount() {
        return getRawParameterTypes().length;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public Class<?> getRawParameterType(int i11) {
        Class<?>[] rawParameterTypes = getRawParameterTypes();
        if (i11 >= rawParameterTypes.length) {
            return null;
        }
        return rawParameterTypes[i11];
    }

    @Deprecated
    public boolean hasReturnType() {
        if (getRawReturnType() != Void.TYPE) {
            return true;
        }
        return false;
    }

    public AnnotatedMethod(Serialization serialization) {
        super(null, null, null);
        this._method = null;
        this._serialization = serialization;
    }
}
