package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
public class UnwrappingBeanSerializer extends BeanSerializerBase implements Serializable {
    private static final long serialVersionUID = 1;
    protected final NameTransformer _nameTransformer;

    public UnwrappingBeanSerializer(BeanSerializerBase beanSerializerBase, NameTransformer nameTransformer) {
        super(beanSerializerBase, nameTransformer);
        this._nameTransformer = nameTransformer;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean isUnwrappingSerializer() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.AbstractC6393h
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        if (abstractC6446m.isEnabled(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)) {
            abstractC6446m.reportBadDefinition(handledType(), "Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`");
        }
        jsonGenerator.mo10848x(obj);
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, abstractC6446m, abstractC6431e);
        } else if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, abstractC6446m);
        } else {
            serializeFields(obj, jsonGenerator, abstractC6446m);
        }
    }

    public String toString() {
        return "UnwrappingBeanSerializer for " + handledType().getName();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public AbstractC6393h<Object> unwrappingSerializer(NameTransformer nameTransformer) {
        return new UnwrappingBeanSerializer(this, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withByNameInclusion(Set<String> set, Set<String> set2) {
        return new UnwrappingBeanSerializer(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.AbstractC6393h
    public BeanSerializerBase withFilterId(Object obj) {
        return new UnwrappingBeanSerializer(this, this._objectIdWriter, obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withObjectIdWriter(C6463a c6463a) {
        return new UnwrappingBeanSerializer(this, c6463a);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withProperties(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        return new UnwrappingBeanSerializer(this, beanPropertyWriterArr, beanPropertyWriterArr2);
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, C6463a c6463a) {
        super(unwrappingBeanSerializer, c6463a);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public final void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        jsonGenerator.mo10848x(obj);
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, abstractC6446m, false);
        } else if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, abstractC6446m);
        } else {
            serializeFields(obj, jsonGenerator, abstractC6446m);
        }
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, C6463a c6463a, Object obj) {
        super(unwrappingBeanSerializer, c6463a, obj);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, Set<String> set) {
        this(unwrappingBeanSerializer, set, (Set<String>) null);
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, Set<String> set, Set<String> set2) {
        super(unwrappingBeanSerializer, set, set2);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(unwrappingBeanSerializer, beanPropertyWriterArr, beanPropertyWriterArr2);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase asArraySerializer() {
        return this;
    }
}
