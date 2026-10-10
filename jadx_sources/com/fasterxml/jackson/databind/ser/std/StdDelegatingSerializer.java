package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.InterfaceC6455d;
import com.fasterxml.jackson.databind.ser.InterfaceC6459h;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.InterfaceC6491h;
import java.io.IOException;
import java.lang.reflect.Type;
import p528p7.InterfaceC43399e;
import p551q7.InterfaceC43653c;

/* JADX INFO: loaded from: classes45.dex */
public class StdDelegatingSerializer extends StdSerializer<Object> implements InterfaceC6455d, InterfaceC6459h, InterfaceC43653c {
    protected final InterfaceC6491h<Object, ?> _converter;
    protected final AbstractC6393h<Object> _delegateSerializer;
    protected final JavaType _delegateType;

    public StdDelegatingSerializer(InterfaceC6491h<?, ?> interfaceC6491h) {
        super(Object.class);
        this._converter = interfaceC6491h;
        this._delegateType = null;
        this._delegateSerializer = null;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
    public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) throws JsonMappingException {
        Object obj = this._delegateSerializer;
        return obj instanceof InterfaceC43653c ? ((InterfaceC43653c) obj).getSchema(abstractC6446m, type) : super.getSchema(abstractC6446m, type);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393h = this._delegateSerializer;
        if (abstractC6393h != null) {
            abstractC6393h.acceptJsonFormatVisitor(interfaceC43399e, javaType);
        }
    }

    public Object convertValue(Object obj) {
        return this._converter.convert(obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.InterfaceC6455d
    public AbstractC6393h<?> createContextual(AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6393h<?> abstractC6393hHandleSecondaryContextualization = this._delegateSerializer;
        JavaType javaTypeMo11361b = this._delegateType;
        if (abstractC6393hHandleSecondaryContextualization == null) {
            if (javaTypeMo11361b == null) {
                javaTypeMo11361b = this._converter.mo11361b(abstractC6446m.getTypeFactory());
            }
            if (!javaTypeMo11361b.isJavaLangObject()) {
                abstractC6393hHandleSecondaryContextualization = abstractC6446m.findValueSerializer(javaTypeMo11361b);
            }
        }
        if (abstractC6393hHandleSecondaryContextualization instanceof InterfaceC6455d) {
            abstractC6393hHandleSecondaryContextualization = abstractC6446m.handleSecondaryContextualization(abstractC6393hHandleSecondaryContextualization, beanProperty);
        }
        return (abstractC6393hHandleSecondaryContextualization == this._delegateSerializer && javaTypeMo11361b == this._delegateType) ? this : withDelegate(this._converter, javaTypeMo11361b, abstractC6393hHandleSecondaryContextualization);
    }

    public InterfaceC6491h<Object, ?> getConverter() {
        return this._converter;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public AbstractC6393h<?> getDelegatee() {
        return this._delegateSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.InterfaceC6459h
    public void resolve(AbstractC6446m abstractC6446m) throws JsonMappingException {
        Object obj = this._delegateSerializer;
        if (obj == null || !(obj instanceof InterfaceC6459h)) {
            return;
        }
        ((InterfaceC6459h) obj).resolve(abstractC6446m);
    }

    public StdDelegatingSerializer withDelegate(InterfaceC6491h<Object, ?> interfaceC6491h, JavaType javaType, AbstractC6393h<?> abstractC6393h) {
        C6490g.m11951n0(StdDelegatingSerializer.class, this, "withDelegate");
        return new StdDelegatingSerializer(interfaceC6491h, javaType, abstractC6393h);
    }

    public AbstractC6393h<Object> _findSerializer(Object obj, AbstractC6446m abstractC6446m) throws JsonMappingException {
        return abstractC6446m.findValueSerializer(obj.getClass());
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean isEmpty(AbstractC6446m abstractC6446m, Object obj) {
        Object objConvertValue = convertValue(obj);
        if (objConvertValue == null) {
            return true;
        }
        AbstractC6393h<Object> abstractC6393h = this._delegateSerializer;
        if (abstractC6393h == null) {
            if (obj == null) {
                return true;
            }
            return false;
        }
        return abstractC6393h.isEmpty(abstractC6446m, objConvertValue);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        Object objConvertValue = convertValue(obj);
        if (objConvertValue == null) {
            abstractC6446m.defaultSerializeNull(jsonGenerator);
            return;
        }
        AbstractC6393h<Object> abstractC6393h_findSerializer = this._delegateSerializer;
        if (abstractC6393h_findSerializer == null) {
            abstractC6393h_findSerializer = _findSerializer(objConvertValue, abstractC6446m);
        }
        abstractC6393h_findSerializer.serialize(objConvertValue, jsonGenerator, abstractC6446m);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        Object objConvertValue = convertValue(obj);
        AbstractC6393h<Object> abstractC6393h_findSerializer = this._delegateSerializer;
        if (abstractC6393h_findSerializer == null) {
            abstractC6393h_findSerializer = _findSerializer(obj, abstractC6446m);
        }
        abstractC6393h_findSerializer.serializeWithType(objConvertValue, jsonGenerator, abstractC6446m, abstractC6431e);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
    public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type, boolean z11) throws JsonMappingException {
        Object obj = this._delegateSerializer;
        if (obj instanceof InterfaceC43653c) {
            return ((InterfaceC43653c) obj).getSchema(abstractC6446m, type, z11);
        }
        return super.getSchema(abstractC6446m, type);
    }

    public <T> StdDelegatingSerializer(Class<T> cls, InterfaceC6491h<T, ?> interfaceC6491h) {
        super(cls, false);
        this._converter = interfaceC6491h;
        this._delegateType = null;
        this._delegateSerializer = null;
    }

    public StdDelegatingSerializer(InterfaceC6491h<Object, ?> interfaceC6491h, JavaType javaType, AbstractC6393h<?> abstractC6393h) {
        super(javaType);
        this._converter = interfaceC6491h;
        this._delegateType = javaType;
        this._delegateSerializer = abstractC6393h;
    }
}
