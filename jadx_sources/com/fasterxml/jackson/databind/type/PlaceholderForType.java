package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes45.dex */
public class PlaceholderForType extends TypeBase {
    private static final long serialVersionUID = 1;
    protected JavaType _actualType;
    protected final int _ordinal;

    public JavaType actualType() {
        return this._actualType;
    }

    @Override // com.fasterxml.jackson.databind.JavaType, p424l7.AbstractC42115a
    public boolean isContainerType() {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final <T> T m11846a() {
        throw new UnsupportedOperationException("Operation should not be attempted on " + getClass().getName());
    }

    public void actualType(JavaType javaType) {
        this._actualType = javaType;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getErasedSignature(StringBuilder sb2) {
        sb2.append(Typography.dollar);
        sb2.append(this._ordinal + 1);
        return sb2;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return getErasedSignature(new StringBuilder()).toString();
    }

    public PlaceholderForType(int i11) {
        super(Object.class, TypeBindings.emptyBindings(), TypeFactory.unknownType(), null, 1, null, null, false);
        this._ordinal = i11;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        return (JavaType) m11846a();
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    public String buildCanonicalName() {
        return toString();
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getGenericSignature(StringBuilder sb2) {
        return getErasedSignature(sb2);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return (JavaType) m11846a();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        return (JavaType) m11846a();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentTypeHandler(Object obj) {
        return (JavaType) m11846a();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentValueHandler(Object obj) {
        return (JavaType) m11846a();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withStaticTyping() {
        return (JavaType) m11846a();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withTypeHandler(Object obj) {
        return (JavaType) m11846a();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withValueHandler(Object obj) {
        return (JavaType) m11846a();
    }
}
