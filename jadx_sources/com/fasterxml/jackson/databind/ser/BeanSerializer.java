package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.C6463a;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
public class BeanSerializer extends BeanSerializerBase {
    private static final long serialVersionUID = 29;

    public BeanSerializer(JavaType javaType, C6453b c6453b, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(javaType, c6453b, beanPropertyWriterArr, beanPropertyWriterArr2);
    }

    @Deprecated
    public static BeanSerializer createDummy(JavaType javaType) {
        return new BeanSerializer(javaType, null, BeanSerializerBase.NO_PROPS, null);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase) {
        super(beanSerializerBase);
    }

    public static BeanSerializer createDummy(JavaType javaType, C6453b c6453b) {
        return new BeanSerializer(javaType, c6453b, BeanSerializerBase.NO_PROPS, null);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase asArraySerializer() {
        return (this._objectIdWriter == null && this._anyGetterWriter == null && this._propertyFilterId == null) ? new BeanAsArraySerializer(this) : this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public final void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        if (this._objectIdWriter != null) {
            jsonGenerator.mo10848x(obj);
            _serializeWithObjectId(obj, jsonGenerator, abstractC6446m, true);
            return;
        }
        jsonGenerator.mo10852z0(obj);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, abstractC6446m);
        } else {
            serializeFields(obj, jsonGenerator, abstractC6446m);
        }
        jsonGenerator.mo10806X();
    }

    public String toString() {
        return "BeanSerializer for " + handledType().getName();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public AbstractC6393h<Object> unwrappingSerializer(NameTransformer nameTransformer) {
        return new UnwrappingBeanSerializer(this, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withByNameInclusion(Set<String> set, Set<String> set2) {
        return new BeanSerializer(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.AbstractC6393h
    public BeanSerializerBase withFilterId(Object obj) {
        return new BeanSerializer(this, this._objectIdWriter, obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withObjectIdWriter(C6463a c6463a) {
        return new BeanSerializer(this, c6463a, this._propertyFilterId);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withProperties(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        return new BeanSerializer(this, beanPropertyWriterArr, beanPropertyWriterArr2);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, C6463a c6463a) {
        super(beanSerializerBase, c6463a);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, C6463a c6463a, Object obj) {
        super(beanSerializerBase, c6463a, obj);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, Set<String> set, Set<String> set2) {
        super(beanSerializerBase, set, set2);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(beanSerializerBase, beanPropertyWriterArr, beanPropertyWriterArr2);
    }
}
