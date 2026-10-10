package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AbstractC6414k;
import com.fasterxml.jackson.databind.introspect.C6406c;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.util.InterfaceC6484a;

/* JADX INFO: loaded from: classes45.dex */
public class AttributePropertyWriter extends VirtualBeanPropertyWriter {
    private static final long serialVersionUID = 1;
    protected final String _attrName;

    public AttributePropertyWriter(String str, AbstractC6414k abstractC6414k, InterfaceC6484a interfaceC6484a, JavaType javaType) {
        this(str, abstractC6414k, interfaceC6484a, javaType, abstractC6414k.mo11530c());
    }

    public AttributePropertyWriter(String str, AbstractC6414k abstractC6414k, InterfaceC6484a interfaceC6484a, JavaType javaType, JsonInclude.Value value) {
        super(abstractC6414k, interfaceC6484a, javaType, null, null, null, value, null);
        this._attrName = str;
    }

    public static AttributePropertyWriter construct(String str, AbstractC6414k abstractC6414k, InterfaceC6484a interfaceC6484a, JavaType javaType) {
        return new AttributePropertyWriter(str, abstractC6414k, interfaceC6484a, javaType);
    }

    @Override // com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter
    public Object value(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception {
        return abstractC6446m.getAttribute(this._attrName);
    }

    @Override // com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter
    public VirtualBeanPropertyWriter withConfig(MapperConfig<?> mapperConfig, C6406c c6406c, AbstractC6414k abstractC6414k, JavaType javaType) {
        throw new IllegalStateException("Should not be called on this type");
    }

    public AttributePropertyWriter(AttributePropertyWriter attributePropertyWriter) {
        super(attributePropertyWriter);
        this._attrName = attributePropertyWriter._attrName;
    }
}
