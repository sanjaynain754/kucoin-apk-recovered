package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.C6499p;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.impl.i */
/* JADX INFO: compiled from: UnwrappedPropertyHandler.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6374i {

    /* JADX INFO: renamed from: a */
    public final List<SettableBeanProperty> f10332a;

    public C6374i() {
        this.f10332a = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public void m11384a(SettableBeanProperty settableBeanProperty) {
        this.f10332a.add(settableBeanProperty);
    }

    /* JADX INFO: renamed from: b */
    public Object m11385b(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, C6499p c6499p) throws IOException {
        int size = this.f10332a.size();
        for (int i11 = 0; i11 < size; i11++) {
            SettableBeanProperty settableBeanProperty = this.f10332a.get(i11);
            JsonParser jsonParserM12013T0 = c6499p.m12013T0();
            jsonParserM12013T0.mo10905t0();
            settableBeanProperty.deserializeAndSet(jsonParserM12013T0, deserializationContext, obj);
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public C6374i m11386c(NameTransformer nameTransformer) {
        AbstractC6390e<Object> abstractC6390eUnwrappingDeserializer;
        ArrayList arrayList = new ArrayList(this.f10332a.size());
        for (SettableBeanProperty settableBeanProperty : this.f10332a) {
            SettableBeanProperty settableBeanPropertyWithSimpleName = settableBeanProperty.withSimpleName(nameTransformer.transform(settableBeanProperty.getName()));
            AbstractC6390e<Object> valueDeserializer = settableBeanPropertyWithSimpleName.getValueDeserializer();
            if (valueDeserializer != null && (abstractC6390eUnwrappingDeserializer = valueDeserializer.unwrappingDeserializer(nameTransformer)) != valueDeserializer) {
                settableBeanPropertyWithSimpleName = settableBeanPropertyWithSimpleName.withValueDeserializer(abstractC6390eUnwrappingDeserializer);
            }
            arrayList.add(settableBeanPropertyWithSimpleName);
        }
        return new C6374i(arrayList);
    }

    public C6374i(List<SettableBeanProperty> list) {
        this.f10332a = list;
    }
}
