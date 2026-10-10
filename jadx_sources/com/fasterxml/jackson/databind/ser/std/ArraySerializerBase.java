package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.InterfaceC6455d;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes45.dex */
public abstract class ArraySerializerBase<T> extends ContainerSerializer<T> implements InterfaceC6455d {
    protected final BeanProperty _property;
    protected final Boolean _unwrapSingle;

    public ArraySerializerBase(Class<T> cls) {
        super(cls);
        this._property = null;
        this._unwrapSingle = null;
    }

    public abstract AbstractC6393h<?> _withResolved(BeanProperty beanProperty, Boolean bool);

    public abstract void serializeContents(T t11, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException;

    public final boolean _shouldUnwrapSingle(AbstractC6446m abstractC6446m) {
        Boolean bool = this._unwrapSingle;
        return bool == null ? abstractC6446m.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : bool.booleanValue();
    }

    public AbstractC6393h<?> createContextual(AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value valueFindFormatOverrides;
        if (beanProperty != null && (valueFindFormatOverrides = findFormatOverrides(abstractC6446m, beanProperty, handledType())) != null) {
            Boolean feature = valueFindFormatOverrides.getFeature(JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
            if (!Objects.equals(feature, this._unwrapSingle)) {
                return _withResolved(beanProperty, feature);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public final void serializeWithType(T t11, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        WritableTypeId writableTypeIdMo11695g = abstractC6431e.mo11695g(jsonGenerator, abstractC6431e.m11692d(t11, JsonToken.START_ARRAY));
        jsonGenerator.mo10848x(t11);
        serializeContents(t11, jsonGenerator, abstractC6446m);
        abstractC6431e.mo11696h(jsonGenerator, writableTypeIdMo11695g);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(T t11, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        if (_shouldUnwrapSingle(abstractC6446m) && hasSingleElement(t11)) {
            serializeContents(t11, jsonGenerator, abstractC6446m);
            return;
        }
        jsonGenerator.mo10847w0(t11);
        serializeContents(t11, jsonGenerator, abstractC6446m);
        jsonGenerator.mo10805W();
    }

    @Deprecated
    public ArraySerializerBase(Class<T> cls, BeanProperty beanProperty) {
        super(cls);
        this._property = beanProperty;
        this._unwrapSingle = null;
    }

    public ArraySerializerBase(ArraySerializerBase<?> arraySerializerBase) {
        super(arraySerializerBase._handledType, false);
        this._property = arraySerializerBase._property;
        this._unwrapSingle = arraySerializerBase._unwrapSingle;
    }

    public ArraySerializerBase(ArraySerializerBase<?> arraySerializerBase, BeanProperty beanProperty, Boolean bool) {
        super(arraySerializerBase._handledType, false);
        this._property = beanProperty;
        this._unwrapSingle = bool;
    }

    @Deprecated
    public ArraySerializerBase(ArraySerializerBase<?> arraySerializerBase, BeanProperty beanProperty) {
        super(arraySerializerBase._handledType, false);
        this._property = beanProperty;
        this._unwrapSingle = arraySerializerBase._unwrapSingle;
    }
}
