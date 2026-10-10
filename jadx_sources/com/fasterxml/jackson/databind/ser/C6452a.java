package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import java.util.Map;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.a */
/* JADX INFO: compiled from: AnyGetterWriter.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6452a {

    /* JADX INFO: renamed from: a */
    public final BeanProperty f10592a;

    /* JADX INFO: renamed from: b */
    public final AnnotatedMember f10593b;

    /* JADX INFO: renamed from: c */
    public AbstractC6393h<Object> f10594c;

    /* JADX INFO: renamed from: d */
    public MapSerializer f10595d;

    /* JADX INFO: renamed from: a */
    public void m11740a(SerializationConfig serializationConfig) {
        this.f10593b.fixAccess(serializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    /* JADX INFO: renamed from: b */
    public void m11741b(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, InterfaceC6458g interfaceC6458g) throws Exception {
        Object value = this.f10593b.getValue(obj);
        if (value == null) {
            return;
        }
        if (!(value instanceof Map)) {
            abstractC6446m.reportBadDefinition(this.f10592a.getType(), String.format("Value returned by 'any-getter' (%s()) not java.util.Map but %s", this.f10593b.getName(), value.getClass().getName()));
        }
        MapSerializer mapSerializer = this.f10595d;
        if (mapSerializer != null) {
            mapSerializer.serializeFilteredAnyProperties(abstractC6446m, jsonGenerator, obj, (Map) value, interfaceC6458g, null);
        } else {
            this.f10594c.serialize(value, jsonGenerator, abstractC6446m);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m11742c(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception {
        Object value = this.f10593b.getValue(obj);
        if (value == null) {
            return;
        }
        if (!(value instanceof Map)) {
            abstractC6446m.reportBadDefinition(this.f10592a.getType(), String.format("Value returned by 'any-getter' %s() not java.util.Map but %s", this.f10593b.getName(), value.getClass().getName()));
        }
        MapSerializer mapSerializer = this.f10595d;
        if (mapSerializer != null) {
            mapSerializer.serializeWithoutTypeInfo((Map) value, jsonGenerator, abstractC6446m);
        } else {
            this.f10594c.serialize(value, jsonGenerator, abstractC6446m);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m11743d(AbstractC6446m abstractC6446m) throws JsonMappingException {
        AbstractC6393h<?> abstractC6393h = this.f10594c;
        if (abstractC6393h instanceof InterfaceC6455d) {
            AbstractC6393h<?> abstractC6393hHandlePrimaryContextualization = abstractC6446m.handlePrimaryContextualization(abstractC6393h, this.f10592a);
            this.f10594c = abstractC6393hHandlePrimaryContextualization;
            if (abstractC6393hHandlePrimaryContextualization instanceof MapSerializer) {
                this.f10595d = (MapSerializer) abstractC6393hHandlePrimaryContextualization;
            }
        }
    }

    public C6452a(BeanProperty beanProperty, AnnotatedMember annotatedMember, AbstractC6393h<?> abstractC6393h) {
        this.f10593b = annotatedMember;
        this.f10592a = beanProperty;
        this.f10594c = abstractC6393h;
        if (abstractC6393h instanceof MapSerializer) {
            this.f10595d = (MapSerializer) abstractC6393h;
        }
    }
}
