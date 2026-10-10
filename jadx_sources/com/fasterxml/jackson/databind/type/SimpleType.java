package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Collection;
import java.util.Map;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes45.dex */
public class SimpleType extends TypeBase {
    private static final long serialVersionUID = 1;

    public SimpleType(Class<?> cls) {
        this(cls, TypeBindings.emptyBindings(), null, null);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        boolean z11 = false;
        Class<?> cls2 = this._class;
        if (cls2 == cls) {
            return this;
        }
        if (!cls2.isAssignableFrom(cls)) {
            return new SimpleType(cls, this._bindings, this, this._superInterfaces, this._valueHandler, this._typeHandler, this._asStatic);
        }
        Class<? super Object> superclass = cls.getSuperclass();
        Class<?> cls3 = this._class;
        if (superclass == cls3) {
            return new SimpleType(cls, this._bindings, this, this._superInterfaces, this._valueHandler, this._typeHandler, this._asStatic);
        }
        if (superclass != null && cls3.isAssignableFrom(superclass)) {
            return new SimpleType(cls, this._bindings, _narrow(superclass), null, this._valueHandler, this._typeHandler, this._asStatic);
        }
        Class<?>[] interfaces = cls.getInterfaces();
        int length = interfaces.length;
        int i11 = 0;
        while (i11 < length) {
            Class<?> cls4 = interfaces[i11];
            Class<?> cls5 = this._class;
            if (cls4 == cls5) {
                boolean z12 = z11;
                TypeBindings typeBindings = this._bindings;
                JavaType[] javaTypeArr = new JavaType[1];
                javaTypeArr[z12 ? 1 : 0] = this;
                return new SimpleType(cls, typeBindings, null, javaTypeArr, this._valueHandler, this._typeHandler, this._asStatic);
            }
            boolean z13 = z11;
            if (cls5.isAssignableFrom(cls4)) {
                return new SimpleType(cls, this._bindings, null, new JavaType[]{_narrow(cls4)}, this._valueHandler, this._typeHandler, this._asStatic);
            }
            i11++;
            z11 = z13;
        }
        throw new IllegalArgumentException("Internal error: Cannot resolve sub-type for Class " + cls.getName() + " to " + this._class.getName());
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean hasContentType() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType, p424l7.AbstractC42115a
    public boolean isContainerType() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    public SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        this(cls, typeBindings, javaType, javaTypeArr, null, null, false);
    }

    /* JADX INFO: renamed from: a */
    public static JavaType m11847a(Class<?> cls, TypeBindings typeBindings) {
        if (cls == null) {
            return null;
        }
        return cls == Object.class ? TypeFactory.unknownType() : new SimpleType(cls, typeBindings, m11847a(cls.getSuperclass(), typeBindings), null, null, null, false);
    }

    @Deprecated
    public static SimpleType construct(Class<?> cls) {
        if (Map.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Cannot construct SimpleType for a Map (class: " + cls.getName() + ")");
        }
        if (Collection.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Cannot construct SimpleType for a Collection (class: " + cls.getName() + ")");
        }
        if (!cls.isArray()) {
            TypeBindings typeBindingsEmptyBindings = TypeBindings.emptyBindings();
            return new SimpleType(cls, typeBindingsEmptyBindings, m11847a(cls.getSuperclass(), typeBindingsEmptyBindings), null, null, null, false);
        }
        throw new IllegalArgumentException("Cannot construct SimpleType for an array (class: " + cls.getName() + ")");
    }

    public static SimpleType constructUnsafe(Class<?> cls) {
        return new SimpleType(cls, null, null, null, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    public String buildCanonicalName() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this._class.getName());
        int size = this._bindings.size();
        if (size > 0 && _hasNTypeParameters(size)) {
            sb2.append(Typography.less);
            for (int i11 = 0; i11 < size; i11++) {
                JavaType javaTypeContainedType = containedType(i11);
                if (i11 > 0) {
                    sb2.append(',');
                }
                sb2.append(javaTypeContainedType.toCanonical());
            }
            sb2.append(Typography.greater);
        }
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        SimpleType simpleType = (SimpleType) obj;
        if (simpleType._class != this._class) {
            return false;
        }
        return this._bindings.equals(simpleType._bindings);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getErasedSignature(StringBuilder sb2) {
        return TypeBase._classSignature(this._class, sb2, true);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getGenericSignature(StringBuilder sb2) {
        TypeBase._classSignature(this._class, sb2, false);
        int size = this._bindings.size();
        if (size > 0) {
            sb2.append(Typography.less);
            for (int i11 = 0; i11 < size; i11++) {
                sb2 = containedType(i11).getGenericSignature(sb2);
            }
            sb2.append(Typography.greater);
        }
        sb2.append(';');
        return sb2;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("[simple type, class ");
        sb2.append(buildCanonicalName());
        sb2.append(']');
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentTypeHandler(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType withContentValueHandler(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType withStaticTyping() {
        return this._asStatic ? this : new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, this._valueHandler, this._typeHandler, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType withTypeHandler(Object obj) {
        return this._typeHandler == obj ? this : new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, this._valueHandler, obj, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType withValueHandler(Object obj) {
        return obj == this._valueHandler ? this : new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, obj, this._typeHandler, this._asStatic);
    }

    public SimpleType(TypeBase typeBase) {
        super(typeBase);
    }

    public SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, Object obj, Object obj2, boolean z11) {
        super(cls, typeBindings, javaType, javaTypeArr, 0, obj, obj2, z11);
    }

    public SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, int i11, Object obj, Object obj2, boolean z11) {
        super(cls, typeBindings, javaType, javaTypeArr, i11, obj, obj2, z11);
    }
}
