package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.io.IOException;
import java.util.Iterator;
import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class IterableSerializer extends AsArraySerializerBase<Iterable<?>> {
    public IterableSerializer(JavaType javaType, boolean z11, AbstractC6431e abstractC6431e) {
        super((Class<?>) Iterable.class, javaType, z11, abstractC6431e, (AbstractC6393h<Object>) null);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public /* bridge */ /* synthetic */ AsArraySerializerBase<Iterable<?>> withResolved(BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h abstractC6393h, Boolean bool) {
        return withResolved2(beanProperty, abstractC6431e, (AbstractC6393h<?>) abstractC6393h, bool);
    }

    public IterableSerializer(IterableSerializer iterableSerializer, BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, Boolean bool) {
        super(iterableSerializer, beanProperty, abstractC6431e, abstractC6393h, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(AbstractC6431e abstractC6431e) {
        return new IterableSerializer(this, this._property, abstractC6431e, this._elementSerializer, this._unwrapSingle);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Iterable<?> iterable) {
        if (iterable == null) {
            return false;
        }
        Iterator<?> it = iterable.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next();
        return !it.hasNext();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean isEmpty(AbstractC6446m abstractC6446m, Iterable<?> iterable) {
        return !iterable.iterator().hasNext();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public final void serialize(Iterable<?> iterable, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        if (((this._unwrapSingle == null && abstractC6446m.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE) && hasSingleElement(iterable)) {
            serializeContents(iterable, jsonGenerator, abstractC6446m);
            return;
        }
        jsonGenerator.mo10847w0(iterable);
        serializeContents(iterable, jsonGenerator, abstractC6446m);
        jsonGenerator.mo10805W();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public void serializeContents(Iterable<?> iterable, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        AbstractC6393h<Object> abstractC6393h;
        Iterator<?> it = iterable.iterator();
        if (it.hasNext()) {
            AbstractC6431e abstractC6431e = this._valueTypeSerializer;
            Class<?> cls = null;
            AbstractC6393h<Object> abstractC6393hFindValueSerializer = null;
            do {
                Object next = it.next();
                if (next == null) {
                    abstractC6446m.defaultSerializeNull(jsonGenerator);
                } else {
                    AbstractC6393h<Object> abstractC6393h2 = this._elementSerializer;
                    if (abstractC6393h2 == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            abstractC6393hFindValueSerializer = abstractC6446m.findValueSerializer(cls2, this._property);
                            cls = cls2;
                        }
                        abstractC6393h = abstractC6393hFindValueSerializer;
                    } else {
                        abstractC6393h = abstractC6393hFindValueSerializer;
                        abstractC6393hFindValueSerializer = abstractC6393h2;
                    }
                    if (abstractC6431e == null) {
                        abstractC6393hFindValueSerializer.serialize(next, jsonGenerator, abstractC6446m);
                    } else {
                        abstractC6393hFindValueSerializer.serializeWithType(next, jsonGenerator, abstractC6446m, abstractC6431e);
                    }
                    abstractC6393hFindValueSerializer = abstractC6393h;
                }
            } while (it.hasNext());
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* JADX INFO: renamed from: withResolved, reason: avoid collision after fix types in other method */
    public AsArraySerializerBase<Iterable<?>> withResolved2(BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, Boolean bool) {
        return new IterableSerializer(this, beanProperty, abstractC6431e, abstractC6393h, bool);
    }
}
