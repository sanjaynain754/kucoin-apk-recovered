package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import java.io.IOException;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes45.dex */
public class EnumSetSerializer extends AsArraySerializerBase<EnumSet<? extends Enum<?>>> {
    public EnumSetSerializer(JavaType javaType) {
        super((Class<?>) EnumSet.class, javaType, true, (AbstractC6431e) null, (AbstractC6393h<Object>) null);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public EnumSetSerializer _withValueTypeSerializer(AbstractC6431e abstractC6431e) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public /* bridge */ /* synthetic */ AsArraySerializerBase<EnumSet<? extends Enum<?>>> withResolved(BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h abstractC6393h, Boolean bool) {
        return withResolved2(beanProperty, abstractC6431e, (AbstractC6393h<?>) abstractC6393h, bool);
    }

    public EnumSetSerializer(EnumSetSerializer enumSetSerializer, BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, Boolean bool) {
        super(enumSetSerializer, beanProperty, abstractC6431e, abstractC6393h, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(EnumSet<? extends Enum<?>> enumSet) {
        return enumSet.size() == 1;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean isEmpty(AbstractC6446m abstractC6446m, EnumSet<? extends Enum<?>> enumSet) {
        return enumSet.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public final void serialize(EnumSet<? extends Enum<?>> enumSet, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        int size = enumSet.size();
        if (size == 1 && ((this._unwrapSingle == null && abstractC6446m.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(enumSet, jsonGenerator, abstractC6446m);
            return;
        }
        jsonGenerator.mo10849x0(enumSet, size);
        serializeContents(enumSet, jsonGenerator, abstractC6446m);
        jsonGenerator.mo10805W();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public void serializeContents(EnumSet<? extends Enum<?>> enumSet, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        AbstractC6393h<Object> abstractC6393hFindContentValueSerializer = this._elementSerializer;
        for (Enum<?> r11 : enumSet) {
            if (abstractC6393hFindContentValueSerializer == null) {
                abstractC6393hFindContentValueSerializer = abstractC6446m.findContentValueSerializer(r11.getDeclaringClass(), this._property);
            }
            abstractC6393hFindContentValueSerializer.serialize(r11, jsonGenerator, abstractC6446m);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* JADX INFO: renamed from: withResolved, reason: avoid collision after fix types in other method */
    public AsArraySerializerBase<EnumSet<? extends Enum<?>>> withResolved2(BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, Boolean bool) {
        return new EnumSetSerializer(this, beanProperty, abstractC6431e, abstractC6393h, bool);
    }
}
