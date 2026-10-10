package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6429c;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.jsontype.impl.d */
/* JADX INFO: compiled from: AsPropertyTypeSerializer.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6435d extends C6432a {

    /* JADX INFO: renamed from: c */
    public final String f10531c;

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AbstractC6443l, com.fasterxml.jackson.databind.jsontype.AbstractC6431e
    /* JADX INFO: renamed from: b */
    public String mo11690b() {
        return this.f10531c;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.C6432a, com.fasterxml.jackson.databind.jsontype.AbstractC6431e
    /* JADX INFO: renamed from: c */
    public JsonTypeInfo.EnumC6265As mo11691c() {
        return JsonTypeInfo.EnumC6265As.PROPERTY;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.C6432a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C6435d mo11689a(BeanProperty beanProperty) {
        return this.f10547b == beanProperty ? this : new C6435d(this.f10546a, beanProperty, this.f10531c);
    }

    public C6435d(InterfaceC6429c interfaceC6429c, BeanProperty beanProperty, String str) {
        super(interfaceC6429c, beanProperty);
        this.f10531c = str;
    }
}
