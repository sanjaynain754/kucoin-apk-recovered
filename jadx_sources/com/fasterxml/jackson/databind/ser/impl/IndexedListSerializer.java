package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.io.IOException;
import java.util.List;
import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public final class IndexedListSerializer extends AsArraySerializerBase<List<?>> {
    private static final long serialVersionUID = 1;

    public IndexedListSerializer(JavaType javaType, boolean z11, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h) {
        super((Class<?>) List.class, javaType, z11, abstractC6431e, abstractC6393h);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* JADX INFO: renamed from: withResolved, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ AsArraySerializerBase<List<?>> withResolved2(BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h abstractC6393h, Boolean bool) {
        return withResolved(beanProperty, abstractC6431e, (AbstractC6393h<?>) abstractC6393h, bool);
    }

    public IndexedListSerializer(IndexedListSerializer indexedListSerializer, BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, Boolean bool) {
        super(indexedListSerializer, beanProperty, abstractC6431e, abstractC6393h, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(AbstractC6431e abstractC6431e) {
        return new IndexedListSerializer(this, this._property, abstractC6431e, this._elementSerializer, this._unwrapSingle);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(List<?> list) {
        return list.size() == 1;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean isEmpty(AbstractC6446m abstractC6446m, List<?> list) {
        return list.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public final void serialize(List<?> list, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        int size = list.size();
        if (size == 1 && ((this._unwrapSingle == null && abstractC6446m.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(list, jsonGenerator, abstractC6446m);
            return;
        }
        jsonGenerator.mo10849x0(list, size);
        serializeContents(list, jsonGenerator, abstractC6446m);
        jsonGenerator.mo10805W();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public void serializeContents(List<?> list, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        AbstractC6393h<Object> abstractC6393h = this._elementSerializer;
        if (abstractC6393h != null) {
            serializeContentsUsing(list, jsonGenerator, abstractC6446m, abstractC6393h);
            return;
        }
        if (this._valueTypeSerializer != null) {
            serializeTypedContents(list, jsonGenerator, abstractC6446m);
            return;
        }
        int size = list.size();
        if (size == 0) {
            return;
        }
        int i11 = 0;
        try {
            AbstractC6464b abstractC6464b = this._dynamicSerializers;
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj == null) {
                    abstractC6446m.defaultSerializeNull(jsonGenerator);
                } else {
                    Class<?> cls = obj.getClass();
                    AbstractC6393h<Object> abstractC6393hMo11808k = abstractC6464b.mo11808k(cls);
                    if (abstractC6393hMo11808k == null) {
                        abstractC6393hMo11808k = this._elementType.hasGenericTypes() ? _findAndAddDynamic(abstractC6464b, abstractC6446m.constructSpecializedType(this._elementType, cls), abstractC6446m) : _findAndAddDynamic(abstractC6464b, cls, abstractC6446m);
                        abstractC6464b = this._dynamicSerializers;
                    }
                    abstractC6393hMo11808k.serialize(obj, jsonGenerator, abstractC6446m);
                }
                i11++;
            }
        } catch (Exception e11) {
            wrapAndThrow(abstractC6446m, e11, list, i11);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public AsArraySerializerBase<List<?>> withResolved(BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, Boolean bool) {
        return new IndexedListSerializer(this, beanProperty, abstractC6431e, abstractC6393h, bool);
    }

    public void serializeContentsUsing(List<?> list, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6393h<Object> abstractC6393h) throws IOException {
        int size = list.size();
        if (size != 0) {
            AbstractC6431e abstractC6431e = this._valueTypeSerializer;
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = list.get(i11);
                if (obj == null) {
                    try {
                        abstractC6446m.defaultSerializeNull(jsonGenerator);
                    } catch (Exception e11) {
                        wrapAndThrow(abstractC6446m, e11, list, i11);
                    }
                } else if (abstractC6431e == null) {
                    abstractC6393h.serialize(obj, jsonGenerator, abstractC6446m);
                } else {
                    abstractC6393h.serializeWithType(obj, jsonGenerator, abstractC6446m, abstractC6431e);
                }
            }
        }
    }

    public void serializeTypedContents(List<?> list, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        AbstractC6393h<Object> abstractC6393h_findAndAddDynamic;
        int size = list.size();
        if (size != 0) {
            int i11 = 0;
            try {
                AbstractC6431e abstractC6431e = this._valueTypeSerializer;
                AbstractC6464b abstractC6464b = this._dynamicSerializers;
                while (i11 < size) {
                    Object obj = list.get(i11);
                    if (obj == null) {
                        abstractC6446m.defaultSerializeNull(jsonGenerator);
                    } else {
                        Class<?> cls = obj.getClass();
                        AbstractC6393h<Object> abstractC6393hMo11808k = abstractC6464b.mo11808k(cls);
                        if (abstractC6393hMo11808k == null) {
                            if (this._elementType.hasGenericTypes()) {
                                abstractC6393h_findAndAddDynamic = _findAndAddDynamic(abstractC6464b, abstractC6446m.constructSpecializedType(this._elementType, cls), abstractC6446m);
                            } else {
                                abstractC6393h_findAndAddDynamic = _findAndAddDynamic(abstractC6464b, cls, abstractC6446m);
                            }
                            abstractC6393hMo11808k = abstractC6393h_findAndAddDynamic;
                            abstractC6464b = this._dynamicSerializers;
                        }
                        abstractC6393hMo11808k.serializeWithType(obj, jsonGenerator, abstractC6446m, abstractC6431e);
                    }
                    i11++;
                }
            } catch (Exception e11) {
                wrapAndThrow(abstractC6446m, e11, list, i11);
            }
        }
    }
}
