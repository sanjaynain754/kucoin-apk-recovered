package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;
import p424l7.AbstractC42115a;

/* JADX INFO: loaded from: classes45.dex */
public abstract class JavaType extends AbstractC42115a implements Serializable, Type {
    private static final long serialVersionUID = 1;
    protected final boolean _asStatic;
    protected final Class<?> _class;
    protected final int _hash;
    protected final Object _typeHandler;
    protected final Object _valueHandler;

    public JavaType(Class<?> cls, int i11, Object obj, Object obj2, boolean z11) {
        this._class = cls;
        this._hash = cls.getName().hashCode() + i11;
        this._valueHandler = obj;
        this._typeHandler = obj2;
        this._asStatic = z11;
    }

    @Deprecated
    public abstract JavaType _narrow(Class<?> cls);

    @Override // p424l7.AbstractC42115a
    public abstract JavaType containedType(int i11);

    @Override // p424l7.AbstractC42115a
    public abstract int containedTypeCount();

    @Override // p424l7.AbstractC42115a
    @Deprecated
    public abstract String containedTypeName(int i11);

    public abstract boolean equals(Object obj);

    public abstract JavaType findSuperType(Class<?> cls);

    public abstract JavaType[] findTypeParameters(Class<?> cls);

    public abstract TypeBindings getBindings();

    @Override // p424l7.AbstractC42115a
    public JavaType getContentType() {
        return null;
    }

    public Object getContentTypeHandler() {
        return null;
    }

    public Object getContentValueHandler() {
        return null;
    }

    public String getErasedSignature() {
        StringBuilder sb2 = new StringBuilder(40);
        getErasedSignature(sb2);
        return sb2.toString();
    }

    public abstract StringBuilder getErasedSignature(StringBuilder sb2);

    public String getGenericSignature() {
        StringBuilder sb2 = new StringBuilder(40);
        getGenericSignature(sb2);
        return sb2.toString();
    }

    public abstract StringBuilder getGenericSignature(StringBuilder sb2);

    public abstract List<JavaType> getInterfaces();

    @Override // p424l7.AbstractC42115a
    public JavaType getKeyType() {
        return null;
    }

    @Override // p424l7.AbstractC42115a
    @Deprecated
    public Class<?> getParameterSource() {
        return null;
    }

    @Override // p424l7.AbstractC42115a
    public JavaType getReferencedType() {
        return null;
    }

    public abstract JavaType getSuperClass();

    public boolean hasContentType() {
        return true;
    }

    @Override // p424l7.AbstractC42115a
    public boolean isArrayType() {
        return false;
    }

    @Override // p424l7.AbstractC42115a
    public boolean isCollectionLikeType() {
        return false;
    }

    @Override // p424l7.AbstractC42115a
    public abstract boolean isContainerType();

    @Override // p424l7.AbstractC42115a
    public boolean isMapLikeType() {
        return false;
    }

    public abstract JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr);

    public abstract String toString();

    public abstract JavaType withContentType(JavaType javaType);

    public abstract JavaType withContentTypeHandler(Object obj);

    public abstract JavaType withContentValueHandler(Object obj);

    public abstract JavaType withStaticTyping();

    public abstract JavaType withTypeHandler(Object obj);

    public abstract JavaType withValueHandler(Object obj);

    @Deprecated
    public JavaType forcedNarrowBy(Class<?> cls) {
        return cls == this._class ? this : _narrow(cls);
    }

    @Override // p424l7.AbstractC42115a
    public final Class<?> getRawClass() {
        return this._class;
    }

    public <T> T getTypeHandler() {
        return (T) this._typeHandler;
    }

    public <T> T getValueHandler() {
        return (T) this._valueHandler;
    }

    public boolean hasHandlers() {
        return (this._typeHandler == null && this._valueHandler == null) ? false : true;
    }

    @Override // p424l7.AbstractC42115a
    public final boolean hasRawClass(Class<?> cls) {
        return this._class == cls;
    }

    public boolean hasValueHandler() {
        return this._valueHandler != null;
    }

    public final int hashCode() {
        return this._hash;
    }

    @Override // p424l7.AbstractC42115a
    public boolean isAbstract() {
        return Modifier.isAbstract(this._class.getModifiers());
    }

    @Override // p424l7.AbstractC42115a
    public boolean isConcrete() {
        if ((this._class.getModifiers() & 1536) == 0) {
            return true;
        }
        return this._class.isPrimitive();
    }

    public final boolean isEnumImplType() {
        return C6490g.m11909L(this._class) && this._class != Enum.class;
    }

    @Override // p424l7.AbstractC42115a
    public final boolean isEnumType() {
        return C6490g.m11909L(this._class);
    }

    @Override // p424l7.AbstractC42115a
    public final boolean isFinal() {
        return Modifier.isFinal(this._class.getModifiers());
    }

    @Override // p424l7.AbstractC42115a
    public final boolean isInterface() {
        return this._class.isInterface();
    }

    public final boolean isJavaLangObject() {
        return this._class == Object.class;
    }

    @Override // p424l7.AbstractC42115a
    public final boolean isPrimitive() {
        return this._class.isPrimitive();
    }

    public final boolean isRecordType() {
        return C6490g.m11917T(this._class);
    }

    @Override // p424l7.AbstractC42115a
    public boolean isThrowable() {
        return Throwable.class.isAssignableFrom(this._class);
    }

    public final boolean isTypeOrSubTypeOf(Class<?> cls) {
        Class<?> cls2 = this._class;
        return cls2 == cls || cls.isAssignableFrom(cls2);
    }

    public final boolean isTypeOrSuperTypeOf(Class<?> cls) {
        Class<?> cls2 = this._class;
        return cls2 == cls || cls2.isAssignableFrom(cls);
    }

    public final boolean useStaticType() {
        return this._asStatic;
    }

    public JavaType containedTypeOrUnknown(int i11) {
        JavaType javaTypeContainedType = containedType(i11);
        if (javaTypeContainedType == null) {
            return TypeFactory.unknownType();
        }
        return javaTypeContainedType;
    }

    @Override // p424l7.AbstractC42115a
    public boolean hasGenericTypes() {
        if (containedTypeCount() > 0) {
            return true;
        }
        return false;
    }

    public JavaType withHandlersFrom(JavaType javaType) {
        JavaType javaTypeWithTypeHandler;
        Object typeHandler = javaType.getTypeHandler();
        if (typeHandler != this._typeHandler) {
            javaTypeWithTypeHandler = withTypeHandler(typeHandler);
        } else {
            javaTypeWithTypeHandler = this;
        }
        Object valueHandler = javaType.getValueHandler();
        if (valueHandler != this._valueHandler) {
            return javaTypeWithTypeHandler.withValueHandler(valueHandler);
        }
        return javaTypeWithTypeHandler;
    }

    public JavaType(JavaType javaType) {
        this._class = javaType._class;
        this._hash = javaType._hash;
        this._valueHandler = javaType._valueHandler;
        this._typeHandler = javaType._typeHandler;
        this._asStatic = javaType._asStatic;
    }
}
