package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6429c;
import java.io.IOException;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.jsontype.impl.l */
/* JADX INFO: compiled from: TypeSerializerBase.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6443l extends AbstractC6431e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6429c f10546a;

    /* JADX INFO: renamed from: b */
    public final BeanProperty f10547b;

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6431e
    /* JADX INFO: renamed from: b */
    public String mo11690b() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public void m11713i(WritableTypeId writableTypeId) {
        if (writableTypeId.f10142c == null) {
            Object obj = writableTypeId.f10140a;
            Class<?> cls = writableTypeId.f10141b;
            writableTypeId.f10142c = cls == null ? m11715k(obj) : m11716l(obj, cls);
        }
    }

    /* JADX INFO: renamed from: k */
    public String m11715k(Object obj) {
        String strMo11683a = this.f10546a.mo11683a(obj);
        if (strMo11683a == null) {
            m11714j(obj);
        }
        return strMo11683a;
    }

    /* JADX INFO: renamed from: l */
    public String m11716l(Object obj, Class<?> cls) {
        String strMo11687e = this.f10546a.mo11687e(obj, cls);
        if (strMo11687e == null) {
            m11714j(obj);
        }
        return strMo11687e;
    }

    public AbstractC6443l(InterfaceC6429c interfaceC6429c, BeanProperty beanProperty) {
        this.f10546a = interfaceC6429c;
        this.f10547b = beanProperty;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6431e
    /* JADX INFO: renamed from: g */
    public WritableTypeId mo11695g(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
        m11713i(writableTypeId);
        return jsonGenerator.m10792G0(writableTypeId);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6431e
    /* JADX INFO: renamed from: h */
    public WritableTypeId mo11696h(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
        return jsonGenerator.m10793H0(writableTypeId);
    }

    /* JADX INFO: renamed from: j */
    public void m11714j(Object obj) {
    }
}
