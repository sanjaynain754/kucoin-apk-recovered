package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
public class BeanAsArraySerializer extends BeanSerializerBase {
    private static final long serialVersionUID = 1;
    protected final BeanSerializerBase _defaultSerializer;

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase) {
        super(beanSerializerBase, (C6463a) null);
        this._defaultSerializer = beanSerializerBase;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean isUnwrappingSerializer() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public /* bridge */ /* synthetic */ BeanSerializerBase withByNameInclusion(Set set, Set set2) {
        return withByNameInclusion((Set<String>) set, (Set<String>) set2);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11789b(AbstractC6446m abstractC6446m) {
        return ((this._filteredProps == null || abstractC6446m.getActiveView() == null) ? this._props : this._filteredProps).length == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public final void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        if (abstractC6446m.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && m11789b(abstractC6446m)) {
            serializeAsArray(obj, jsonGenerator, abstractC6446m);
            return;
        }
        jsonGenerator.mo10847w0(obj);
        serializeAsArray(obj, jsonGenerator, abstractC6446m);
        jsonGenerator.mo10805W();
    }

    public final void serializeAsArray(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        BeanPropertyWriter[] beanPropertyWriterArr = (this._filteredProps == null || abstractC6446m.getActiveView() == null) ? this._props : this._filteredProps;
        int i11 = 0;
        try {
            int length = beanPropertyWriterArr.length;
            while (i11 < length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i11];
                if (beanPropertyWriter == null) {
                    jsonGenerator.mo10812b0();
                } else {
                    beanPropertyWriter.serializeAsElement(obj, jsonGenerator, abstractC6446m);
                }
                i11++;
            }
        } catch (Exception e11) {
            wrapAndThrow(abstractC6446m, e11, obj, beanPropertyWriterArr[i11].getName());
        } catch (StackOverflowError e12) {
            JsonMappingException jsonMappingExceptionFrom = JsonMappingException.from(jsonGenerator, "Infinite recursion (StackOverflowError)", e12);
            jsonMappingExceptionFrom.prependPath(obj, beanPropertyWriterArr[i11].getName());
            throw jsonMappingExceptionFrom;
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.AbstractC6393h
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, abstractC6446m, abstractC6431e);
            return;
        }
        WritableTypeId writableTypeId_typeIdDef = _typeIdDef(abstractC6431e, obj, JsonToken.START_ARRAY);
        abstractC6431e.mo11695g(jsonGenerator, writableTypeId_typeIdDef);
        jsonGenerator.mo10848x(obj);
        serializeAsArray(obj, jsonGenerator, abstractC6446m);
        abstractC6431e.mo11696h(jsonGenerator, writableTypeId_typeIdDef);
    }

    public String toString() {
        return "BeanAsArraySerializer for " + handledType().getName();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public AbstractC6393h<Object> unwrappingSerializer(NameTransformer nameTransformer) {
        return this._defaultSerializer.unwrappingSerializer(nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanAsArraySerializer withByNameInclusion(Set<String> set, Set<String> set2) {
        return new BeanAsArraySerializer(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.AbstractC6393h
    public BeanSerializerBase withFilterId(Object obj) {
        return new BeanAsArraySerializer(this, this._objectIdWriter, obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withObjectIdWriter(C6463a c6463a) {
        return this._defaultSerializer.withObjectIdWriter(c6463a);
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, Set<String> set) {
        this(beanSerializerBase, set, (Set<String>) null);
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, Set<String> set, Set<String> set2) {
        super(beanSerializerBase, set, set2);
        this._defaultSerializer = beanSerializerBase;
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, C6463a c6463a, Object obj) {
        super(beanSerializerBase, c6463a, obj);
        this._defaultSerializer = beanSerializerBase;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase asArraySerializer() {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withProperties(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        return this;
    }
}
