package com.fasterxml.jackson.databind.ser.impl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import java.io.IOException;
import java.util.List;
import p450m7.InterfaceC42435a;
import p528p7.InterfaceC43396b;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public final class IndexedStringListSerializer extends StaticListSerializerBase<List<String>> {
    public static final IndexedStringListSerializer instance = new IndexedStringListSerializer();
    private static final long serialVersionUID = 1;

    public IndexedStringListSerializer() {
        super(List.class);
    }

    /* JADX INFO: renamed from: a */
    public final void m11792a(List<String> list, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, int i11) throws IOException {
        for (int i12 = 0; i12 < i11; i12++) {
            try {
                String str = list.get(i12);
                if (str == null) {
                    abstractC6446m.defaultSerializeNull(jsonGenerator);
                } else {
                    jsonGenerator.mo10787C0(str);
                }
            } catch (Exception e11) {
                wrapAndThrow(abstractC6446m, e11, list, i12);
                return;
            }
        }
    }

    public IndexedStringListSerializer(IndexedStringListSerializer indexedStringListSerializer, Boolean bool) {
        super(indexedStringListSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public AbstractC6393h<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new IndexedStringListSerializer(this, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public void acceptContentVisitor(InterfaceC43396b interfaceC43396b) throws JsonMappingException {
        interfaceC43396b.m95574c(JsonFormatTypes.STRING);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(List<String> list, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        int size = list.size();
        if (size == 1 && ((this._unwrapSingle == null && abstractC6446m.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            m11792a(list, jsonGenerator, abstractC6446m, 1);
            return;
        }
        jsonGenerator.mo10849x0(list, size);
        m11792a(list, jsonGenerator, abstractC6446m, size);
        jsonGenerator.mo10805W();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public AbstractC6391f contentSchema() {
        return createSchemaNode(TypedValues.Custom.S_STRING, true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public void serializeWithType(List<String> list, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        WritableTypeId writableTypeIdMo11695g = abstractC6431e.mo11695g(jsonGenerator, abstractC6431e.m11692d(list, JsonToken.START_ARRAY));
        jsonGenerator.mo10848x(list);
        m11792a(list, jsonGenerator, abstractC6446m, list.size());
        abstractC6431e.mo11696h(jsonGenerator, writableTypeIdMo11695g);
    }
}
