package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6429c;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.jsontype.impl.c */
/* JADX INFO: compiled from: AsExternalTypeSerializer.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6434c extends AbstractC6443l {

    /* JADX INFO: renamed from: c */
    public final String f10530c;

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AbstractC6443l, com.fasterxml.jackson.databind.jsontype.AbstractC6431e
    /* JADX INFO: renamed from: b */
    public String mo11690b() {
        return this.f10530c;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6431e
    /* JADX INFO: renamed from: c */
    public JsonTypeInfo.EnumC6265As mo11691c() {
        return JsonTypeInfo.EnumC6265As.EXTERNAL_PROPERTY;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6431e
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C6434c mo11689a(BeanProperty beanProperty) {
        return this.f10547b == beanProperty ? this : new C6434c(this.f10546a, beanProperty, this.f10530c);
    }

    public C6434c(InterfaceC6429c interfaceC6429c, BeanProperty beanProperty, String str) {
        super(interfaceC6429c, beanProperty);
        this.f10530c = str;
    }
}
