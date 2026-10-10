package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.AbstractC6464b;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes45.dex */
public class CollectionSerializer extends AsArraySerializerBase<Collection<?>> {
    private static final long serialVersionUID = 1;

    public CollectionSerializer(JavaType javaType, boolean z11, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h) {
        super((Class<?>) Collection.class, javaType, z11, abstractC6431e, abstractC6393h);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public /* bridge */ /* synthetic */ AsArraySerializerBase<Collection<?>> withResolved(BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h abstractC6393h, Boolean bool) {
        return withResolved2(beanProperty, abstractC6431e, (AbstractC6393h<?>) abstractC6393h, bool);
    }

    @Deprecated
    public CollectionSerializer(JavaType javaType, boolean z11, AbstractC6431e abstractC6431e, BeanProperty beanProperty, AbstractC6393h<Object> abstractC6393h) {
        this(javaType, z11, abstractC6431e, abstractC6393h);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(AbstractC6431e abstractC6431e) {
        return new CollectionSerializer(this, this._property, abstractC6431e, (AbstractC6393h<?>) this._elementSerializer, this._unwrapSingle);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Collection<?> collection) {
        return collection.size() == 1;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean isEmpty(AbstractC6446m abstractC6446m, Collection<?> collection) {
        return collection.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public final void serialize(Collection<?> collection, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        int size = collection.size();
        if (size == 1 && ((this._unwrapSingle == null && abstractC6446m.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(collection, jsonGenerator, abstractC6446m);
            return;
        }
        jsonGenerator.mo10849x0(collection, size);
        serializeContents(collection, jsonGenerator, abstractC6446m);
        jsonGenerator.mo10805W();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public void serializeContents(Collection<?> collection, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        jsonGenerator.mo10848x(collection);
        AbstractC6393h<Object> abstractC6393h = this._elementSerializer;
        if (abstractC6393h != null) {
            serializeContentsUsing(collection, jsonGenerator, abstractC6446m, abstractC6393h);
            return;
        }
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            AbstractC6464b abstractC6464b = this._dynamicSerializers;
            AbstractC6431e abstractC6431e = this._valueTypeSerializer;
            int i11 = 0;
            do {
                try {
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
                    i11++;
                } catch (Exception e11) {
                    wrapAndThrow(abstractC6446m, e11, collection, i11);
                    return;
                }
            } while (it.hasNext());
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* JADX INFO: renamed from: withResolved, reason: avoid collision after fix types in other method */
    public AsArraySerializerBase<Collection<?>> withResolved2(BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, Boolean bool) {
        return new CollectionSerializer(this, beanProperty, abstractC6431e, abstractC6393h, bool);
    }

    public CollectionSerializer(CollectionSerializer collectionSerializer, BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, Boolean bool) {
        super(collectionSerializer, beanProperty, abstractC6431e, abstractC6393h, bool);
    }

    public void serializeContentsUsing(Collection<?> collection, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6393h<Object> abstractC6393h) throws IOException {
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            AbstractC6431e abstractC6431e = this._valueTypeSerializer;
            int i11 = 0;
            do {
                Object next = it.next();
                if (next == null) {
                    try {
                        abstractC6446m.defaultSerializeNull(jsonGenerator);
                    } catch (Exception e11) {
                        wrapAndThrow(abstractC6446m, e11, collection, i11);
                    }
                } else if (abstractC6431e == null) {
                    abstractC6393h.serialize(next, jsonGenerator, abstractC6446m);
                } else {
                    abstractC6393h.serializeWithType(next, jsonGenerator, abstractC6446m, abstractC6431e);
                }
                i11++;
            } while (it.hasNext());
        }
    }
}
