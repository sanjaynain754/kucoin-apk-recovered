package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6429c;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.jsontype.impl.e */
/* JADX INFO: compiled from: AsWrapperTypeSerializer.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6436e extends AbstractC6443l {
    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6431e
    /* JADX INFO: renamed from: c */
    public JsonTypeInfo.EnumC6265As mo11691c() {
        return JsonTypeInfo.EnumC6265As.WRAPPER_OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6431e
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C6436e mo11689a(BeanProperty beanProperty) {
        return this.f10547b == beanProperty ? this : new C6436e(this.f10546a, beanProperty);
    }

    public C6436e(InterfaceC6429c interfaceC6429c, BeanProperty beanProperty) {
        super(interfaceC6429c, beanProperty);
    }
}
