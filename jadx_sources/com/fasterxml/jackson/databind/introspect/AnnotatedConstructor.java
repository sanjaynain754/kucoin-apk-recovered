package com.fasterxml.jackson.databind.introspect;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes45.dex */
public final class AnnotatedConstructor extends AnnotatedWithParams {
    private static final long serialVersionUID = 1;
    protected final Constructor<?> _constructor;
    protected Serialization _serialization;

    public AnnotatedConstructor(InterfaceC6423t interfaceC6423t, Constructor<?> constructor, C6412i c6412i, C6412i[] c6412iArr) {
        super(interfaceC6423t, c6412i, c6412iArr);
        if (constructor == null) {
            throw new IllegalArgumentException("Null constructor not allowed");
        }
        this._constructor = constructor;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call() throws Exception {
        return this._constructor.newInstance(null);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!C6490g.m11905H(obj, AnnotatedConstructor.class)) {
            return false;
        }
        Constructor<?> constructor = ((AnnotatedConstructor) obj)._constructor;
        if (constructor == null) {
            return this._constructor == null;
        }
        return constructor.equals(this._constructor);
    }

    public static final class Serialization implements Serializable {
        private static final long serialVersionUID = 1;
        protected Class<?>[] args;
        protected Class<?> clazz;

        public Serialization(Constructor<?> constructor) {
            this.clazz = constructor.getDeclaringClass();
            this.args = constructor.getParameterTypes();
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call(Object[] objArr) throws Exception {
        return this._constructor.newInstance(objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call1(Object obj) throws Exception {
        return this._constructor.newInstance(obj);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public Constructor<?> getAnnotated() {
        return this._constructor;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._constructor.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    @Deprecated
    public Type getGenericParameterType(int i11) {
        Type[] genericParameterTypes = this._constructor.getGenericParameterTypes();
        if (i11 >= genericParameterTypes.length) {
            return null;
        }
        return genericParameterTypes[i11];
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return this._constructor;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public int getModifiers() {
        return this._constructor.getModifiers();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public String getName() {
        return this._constructor.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public int getParameterCount() {
        return this._constructor.getParameterTypes().length;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public JavaType getParameterType(int i11) {
        Type[] genericParameterTypes = this._constructor.getGenericParameterTypes();
        if (i11 >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.mo11457a(genericParameterTypes[i11]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public Class<?> getRawParameterType(int i11) {
        Class<?>[] parameterTypes = this._constructor.getParameterTypes();
        if (i11 >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i11];
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public Class<?> getRawType() {
        return this._constructor.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public JavaType getType() {
        return this._typeContext.mo11457a(getRawType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor of " + getDeclaringClass().getName());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public int hashCode() {
        return this._constructor.getName().hashCode();
    }

    public Object readResolve() {
        Serialization serialization = this._serialization;
        Class<?> cls = serialization.clazz;
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(serialization.args);
            if (!declaredConstructor.isAccessible()) {
                C6490g.m11936g(declaredConstructor, false);
            }
            return new AnnotatedConstructor(null, declaredConstructor, null, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find constructor with " + this._serialization.args.length + " args from Class '" + cls.getName());
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor of " + getDeclaringClass().getName());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public String toString() {
        int length = this._constructor.getParameterTypes().length;
        return String.format("[constructor for %s (%d arg%s), annotations: %s", C6490g.m11921X(this._constructor.getDeclaringClass()), Integer.valueOf(length), length == 1 ? "" : CmcdData.Factory.STREAMING_FORMAT_SS, this._annotations);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public AnnotatedConstructor withAnnotations(C6412i c6412i) {
        return new AnnotatedConstructor(this._typeContext, this._constructor, c6412i, this._paramAnnotations);
    }

    public Object writeReplace() {
        return new AnnotatedConstructor(new Serialization(this._constructor));
    }

    public AnnotatedConstructor(Serialization serialization) {
        super(null, null, null);
        this._constructor = null;
        this._serialization = serialization;
    }
}
