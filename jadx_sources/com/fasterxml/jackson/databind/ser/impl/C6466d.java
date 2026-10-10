package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.InterfaceC6455d;
import java.io.IOException;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.impl.d */
/* JADX INFO: compiled from: TypeWrappedSerializer.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6466d extends AbstractC6393h<Object> implements InterfaceC6455d {

    /* JADX INFO: renamed from: b */
    public final AbstractC6431e f10645b;

    /* JADX INFO: renamed from: c */
    public final AbstractC6393h<Object> f10646c;

    /* JADX INFO: renamed from: a */
    public AbstractC6431e m11819a() {
        return this.f10645b;
    }

    @Override // com.fasterxml.jackson.databind.ser.InterfaceC6455d
    public AbstractC6393h<?> createContextual(AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6393h<?> abstractC6393hHandleSecondaryContextualization = this.f10646c;
        if (abstractC6393hHandleSecondaryContextualization instanceof InterfaceC6455d) {
            abstractC6393hHandleSecondaryContextualization = abstractC6446m.handleSecondaryContextualization(abstractC6393hHandleSecondaryContextualization, beanProperty);
        }
        return abstractC6393hHandleSecondaryContextualization == this.f10646c ? this : new C6466d(this.f10645b, abstractC6393hHandleSecondaryContextualization);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public Class<Object> handledType() {
        return Object.class;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        this.f10646c.serializeWithType(obj, jsonGenerator, abstractC6446m, this.f10645b);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        this.f10646c.serializeWithType(obj, jsonGenerator, abstractC6446m, abstractC6431e);
    }

    public C6466d(AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h) {
        this.f10645b = abstractC6431e;
        this.f10646c = abstractC6393h;
    }
}
