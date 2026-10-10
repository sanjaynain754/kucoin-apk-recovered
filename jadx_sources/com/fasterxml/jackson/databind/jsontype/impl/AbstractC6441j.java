package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6429c;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.jsontype.impl.j */
/* JADX INFO: compiled from: TypeIdResolverBase.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6441j implements InterfaceC6429c {

    /* JADX INFO: renamed from: a */
    public final TypeFactory f10540a;

    /* JADX INFO: renamed from: b */
    public final JavaType f10541b;

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6429c
    /* JADX INFO: renamed from: f */
    public String mo11688f() {
        return mo11687e(null, this.f10541b.getRawClass());
    }

    public AbstractC6441j(JavaType javaType, TypeFactory typeFactory) {
        this.f10541b = javaType;
        this.f10540a = typeFactory;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6429c
    /* JADX INFO: renamed from: d */
    public void mo11686d(JavaType javaType) {
    }
}
