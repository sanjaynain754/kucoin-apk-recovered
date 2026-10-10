package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.io.IOException;
import java.util.Iterator;
import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class IteratorSerializer extends AsArraySerializerBase<Iterator<?>> {
    public IteratorSerializer(JavaType javaType, boolean z11, AbstractC6431e abstractC6431e) {
        super((Class<?>) Iterator.class, javaType, z11, abstractC6431e, (AbstractC6393h<Object>) null);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Iterator<?> it) {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* JADX INFO: renamed from: withResolved, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ AsArraySerializerBase<Iterator<?>> withResolved2(BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h abstractC6393h, Boolean bool) {
        return withResolved(beanProperty, abstractC6431e, (AbstractC6393h<?>) abstractC6393h, bool);
    }

    public IteratorSerializer(IteratorSerializer iteratorSerializer, BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, Boolean bool) {
        super(iteratorSerializer, beanProperty, abstractC6431e, abstractC6393h, bool);
    }

    public void _serializeDynamicContents(Iterator<?> it, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        AbstractC6431e abstractC6431e = this._valueTypeSerializer;
        AbstractC6464b abstractC6464b = this._dynamicSerializers;
        do {
            Object next = it.next();
            if (next == null) {
                abstractC6446m.defaultSerializeNull(jsonGenerator);
            } else {
                Class<?> cls = next.getClass();
                AbstractC6393h<Object> abstractC6393hMo11808k = abstractC6464b.mo11808k(cls);
                if (abstractC6393hMo11808k == null) {
                    abstractC6393hMo11808k = this._elementType.hasGenericTypes() ? _findAndAddDynamic(abstractC6464b, abstractC6446m.constructSpecializedType(this._elementType, cls), abstractC6446m) : _findAndAddDynamic(abstractC6464b, cls, abstractC6446m);
                    abstractC6464b = this._dynamicSerializers;
                }
                if (abstractC6431e == null) {
                    abstractC6393hMo11808k.serialize(next, jsonGenerator, abstractC6446m);
                } else {
                    abstractC6393hMo11808k.serializeWithType(next, jsonGenerator, abstractC6446m, abstractC6431e);
                }
            }
        } while (it.hasNext());
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(AbstractC6431e abstractC6431e) {
        return new IteratorSerializer(this, this._property, abstractC6431e, this._elementSerializer, this._unwrapSingle);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean isEmpty(AbstractC6446m abstractC6446m, Iterator<?> it) {
        return !it.hasNext();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public final void serialize(Iterator<?> it, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        jsonGenerator.mo10847w0(it);
        serializeContents(it, jsonGenerator, abstractC6446m);
        jsonGenerator.mo10805W();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public void serializeContents(Iterator<?> it, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        if (it.hasNext()) {
            AbstractC6393h<Object> abstractC6393h = this._elementSerializer;
            if (abstractC6393h == null) {
                _serializeDynamicContents(it, jsonGenerator, abstractC6446m);
                return;
            }
            AbstractC6431e abstractC6431e = this._valueTypeSerializer;
            do {
                Object next = it.next();
                if (next == null) {
                    abstractC6446m.defaultSerializeNull(jsonGenerator);
                } else if (abstractC6431e == null) {
                    abstractC6393h.serialize(next, jsonGenerator, abstractC6446m);
                } else {
                    abstractC6393h.serializeWithType(next, jsonGenerator, abstractC6446m, abstractC6431e);
                }
            } while (it.hasNext());
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public AsArraySerializerBase<Iterator<?>> withResolved(BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, Boolean bool) {
        return new IteratorSerializer(this, beanProperty, abstractC6431e, abstractC6393h, bool);
    }
}
