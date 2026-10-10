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
import java.util.Collection;
import p450m7.InterfaceC42435a;
import p528p7.InterfaceC43396b;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class StringCollectionSerializer extends StaticListSerializerBase<Collection<String>> {
    public static final StringCollectionSerializer instance = new StringCollectionSerializer();

    public StringCollectionSerializer() {
        super(Collection.class);
    }

    private final void serializeContents(Collection<String> collection, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        int i11 = 0;
        try {
            for (String str : collection) {
                if (str == null) {
                    abstractC6446m.defaultSerializeNull(jsonGenerator);
                } else {
                    jsonGenerator.mo10787C0(str);
                }
                i11++;
            }
        } catch (Exception e11) {
            wrapAndThrow(abstractC6446m, e11, collection, i11);
        }
    }

    public StringCollectionSerializer(StringCollectionSerializer stringCollectionSerializer, Boolean bool) {
        super(stringCollectionSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public AbstractC6393h<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new StringCollectionSerializer(this, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public void acceptContentVisitor(InterfaceC43396b interfaceC43396b) throws JsonMappingException {
        interfaceC43396b.m95574c(JsonFormatTypes.STRING);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(Collection<String> collection, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        int size = collection.size();
        if (size == 1 && ((this._unwrapSingle == null && abstractC6446m.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(collection, jsonGenerator, abstractC6446m);
            return;
        }
        jsonGenerator.mo10849x0(collection, size);
        serializeContents(collection, jsonGenerator, abstractC6446m);
        jsonGenerator.mo10805W();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase, com.fasterxml.jackson.databind.AbstractC6393h
    public void serializeWithType(Collection<String> collection, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        WritableTypeId writableTypeIdMo11695g = abstractC6431e.mo11695g(jsonGenerator, abstractC6431e.m11692d(collection, JsonToken.START_ARRAY));
        jsonGenerator.mo10848x(collection);
        serializeContents(collection, jsonGenerator, abstractC6446m);
        abstractC6431e.mo11696h(jsonGenerator, writableTypeIdMo11695g);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public AbstractC6391f contentSchema() {
        return createSchemaNode(TypedValues.Custom.S_STRING, true);
    }
}
