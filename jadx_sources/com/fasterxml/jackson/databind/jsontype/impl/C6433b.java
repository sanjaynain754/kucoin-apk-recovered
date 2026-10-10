package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6429c;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.jsontype.impl.b */
/* JADX INFO: compiled from: AsExistingPropertyTypeSerializer.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6433b extends C6435d {
    @Override // com.fasterxml.jackson.databind.jsontype.impl.C6435d, com.fasterxml.jackson.databind.jsontype.impl.C6432a, com.fasterxml.jackson.databind.jsontype.AbstractC6431e
    /* JADX INFO: renamed from: c */
    public JsonTypeInfo.EnumC6265As mo11691c() {
        return JsonTypeInfo.EnumC6265As.EXISTING_PROPERTY;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.C6435d
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C6433b mo11689a(BeanProperty beanProperty) {
        return this.f10547b == beanProperty ? this : new C6433b(this.f10546a, beanProperty, this.f10531c);
    }

    public C6433b(InterfaceC6429c interfaceC6429c, BeanProperty beanProperty, String str) {
        super(interfaceC6429c, beanProperty, str);
    }
}
