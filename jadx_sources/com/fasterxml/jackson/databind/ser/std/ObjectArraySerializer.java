package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.InterfaceC6455d;
import com.fasterxml.jackson.databind.ser.impl.AbstractC6464b;
import java.io.IOException;
import java.util.Objects;
import p450m7.InterfaceC42435a;
import p528p7.InterfaceC43399e;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class ObjectArraySerializer extends ArraySerializerBase<Object[]> implements InterfaceC6455d {
    protected AbstractC6464b _dynamicSerializers;
    protected AbstractC6393h<Object> _elementSerializer;
    protected final JavaType _elementType;
    protected final boolean _staticTyping;
    protected final AbstractC6431e _valueTypeSerializer;

    public ObjectArraySerializer(JavaType javaType, boolean z11, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h) {
        super(Object[].class);
        this._elementType = javaType;
        this._staticTyping = z11;
        this._valueTypeSerializer = abstractC6431e;
        this._dynamicSerializers = AbstractC6464b.m11798c();
        this._elementSerializer = abstractC6393h;
    }

    public final AbstractC6393h<Object> _findAndAddDynamic(AbstractC6464b abstractC6464b, Class<?> cls, AbstractC6446m abstractC6446m) throws JsonMappingException {
        AbstractC6464b.d dVarM11806i = abstractC6464b.m11806i(cls, abstractC6446m, this._property);
        AbstractC6464b abstractC6464b2 = dVarM11806i.f10632b;
        if (abstractC6464b != abstractC6464b2) {
            this._dynamicSerializers = abstractC6464b2;
        }
        return dVarM11806i.f10631a;
    }

    public void serializeContentsUsing(Object[] objArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6393h<Object> abstractC6393h) throws IOException {
        int length = objArr.length;
        AbstractC6431e abstractC6431e = this._valueTypeSerializer;
        Object obj = null;
        for (int i11 = 0; i11 < length; i11++) {
            try {
                obj = objArr[i11];
                if (obj == null) {
                    abstractC6446m.defaultSerializeNull(jsonGenerator);
                } else if (abstractC6431e == null) {
                    abstractC6393h.serialize(obj, jsonGenerator, abstractC6446m);
                } else {
                    abstractC6393h.serializeWithType(obj, jsonGenerator, abstractC6446m, abstractC6431e);
                }
            } catch (Exception e11) {
                wrapAndThrow(abstractC6446m, e11, obj, i11);
                return;
            }
        }
    }

    public void serializeTypedContents(Object[] objArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        int length = objArr.length;
        AbstractC6431e abstractC6431e = this._valueTypeSerializer;
        int i11 = 0;
        Object obj = null;
        try {
            AbstractC6464b abstractC6464b = this._dynamicSerializers;
            while (i11 < length) {
                obj = objArr[i11];
                if (obj == null) {
                    abstractC6446m.defaultSerializeNull(jsonGenerator);
                } else {
                    Class<?> cls = obj.getClass();
                    AbstractC6393h<Object> abstractC6393hMo11808k = abstractC6464b.mo11808k(cls);
                    if (abstractC6393hMo11808k == null) {
                        abstractC6393hMo11808k = _findAndAddDynamic(abstractC6464b, cls, abstractC6446m);
                    }
                    abstractC6393hMo11808k.serializeWithType(obj, jsonGenerator, abstractC6446m, abstractC6431e);
                }
                i11++;
            }
        } catch (Exception e11) {
            wrapAndThrow(abstractC6446m, e11, obj, i11);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    public AbstractC6393h<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new ObjectArraySerializer(this, beanProperty, this._valueTypeSerializer, this._elementSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(AbstractC6431e abstractC6431e) {
        return new ObjectArraySerializer(this._elementType, this._staticTyping, abstractC6431e, this._elementSerializer);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.InterfaceC6455d
    public AbstractC6393h<?> createContextual(AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hSerializerInstance;
        JavaType javaType;
        Object objFindContentSerializer;
        AbstractC6431e abstractC6431eMo11689a = this._valueTypeSerializer;
        if (abstractC6431eMo11689a != null) {
            abstractC6431eMo11689a = abstractC6431eMo11689a.mo11689a(beanProperty);
        }
        if (beanProperty != null) {
            AnnotatedMember member = beanProperty.getMember();
            AnnotationIntrospector annotationIntrospector = abstractC6446m.getAnnotationIntrospector();
            if (member == null || (objFindContentSerializer = annotationIntrospector.findContentSerializer(member)) == null) {
                abstractC6393hSerializerInstance = null;
            } else {
                abstractC6393hSerializerInstance = abstractC6446m.serializerInstance(member, objFindContentSerializer);
            }
        } else {
            abstractC6393hSerializerInstance = null;
        }
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(abstractC6446m, beanProperty, handledType());
        Boolean feature = valueFindFormatOverrides != null ? valueFindFormatOverrides.getFeature(JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : null;
        if (abstractC6393hSerializerInstance == null) {
            abstractC6393hSerializerInstance = this._elementSerializer;
        }
        AbstractC6393h<?> abstractC6393hFindContextualConvertingSerializer = findContextualConvertingSerializer(abstractC6446m, beanProperty, abstractC6393hSerializerInstance);
        if (abstractC6393hFindContextualConvertingSerializer == null && (javaType = this._elementType) != null && this._staticTyping && !javaType.isJavaLangObject()) {
            abstractC6393hFindContextualConvertingSerializer = abstractC6446m.findContentValueSerializer(this._elementType, beanProperty);
        }
        return withResolved(beanProperty, abstractC6431eMo11689a, abstractC6393hFindContextualConvertingSerializer, feature);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public AbstractC6393h<?> getContentSerializer() {
        return this._elementSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JavaType getContentType() {
        return this._elementType;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Object[] objArr) {
        return objArr.length == 1;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean isEmpty(AbstractC6446m abstractC6446m, Object[] objArr) {
        return objArr.length == 0;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public final void serialize(Object[] objArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        int length = objArr.length;
        if (length == 1 && ((this._unwrapSingle == null && abstractC6446m.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(objArr, jsonGenerator, abstractC6446m);
            return;
        }
        jsonGenerator.mo10849x0(objArr, length);
        serializeContents(objArr, jsonGenerator, abstractC6446m);
        jsonGenerator.mo10805W();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    public void serializeContents(Object[] objArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        int length = objArr.length;
        if (length == 0) {
            return;
        }
        AbstractC6393h<Object> abstractC6393h = this._elementSerializer;
        if (abstractC6393h != null) {
            serializeContentsUsing(objArr, jsonGenerator, abstractC6446m, abstractC6393h);
            return;
        }
        if (this._valueTypeSerializer != null) {
            serializeTypedContents(objArr, jsonGenerator, abstractC6446m);
            return;
        }
        int i11 = 0;
        Object obj = null;
        try {
            AbstractC6464b abstractC6464b = this._dynamicSerializers;
            while (i11 < length) {
                obj = objArr[i11];
                if (obj == null) {
                    abstractC6446m.defaultSerializeNull(jsonGenerator);
                } else {
                    Class<?> cls = obj.getClass();
                    AbstractC6393h<Object> abstractC6393hMo11808k = abstractC6464b.mo11808k(cls);
                    if (abstractC6393hMo11808k == null) {
                        abstractC6393hMo11808k = this._elementType.hasGenericTypes() ? _findAndAddDynamic(abstractC6464b, abstractC6446m.constructSpecializedType(this._elementType, cls), abstractC6446m) : _findAndAddDynamic(abstractC6464b, cls, abstractC6446m);
                    }
                    abstractC6393hMo11808k.serialize(obj, jsonGenerator, abstractC6446m);
                }
                i11++;
            }
        } catch (Exception e11) {
            wrapAndThrow(abstractC6446m, e11, obj, i11);
        }
    }

    public ObjectArraySerializer withResolved(BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, Boolean bool) {
        return (this._property == beanProperty && abstractC6393h == this._elementSerializer && this._valueTypeSerializer == abstractC6431e && Objects.equals(this._unwrapSingle, bool)) ? this : new ObjectArraySerializer(this, beanProperty, abstractC6431e, abstractC6393h, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        interfaceC43399e.mo95583m(javaType);
    }

    public final AbstractC6393h<Object> _findAndAddDynamic(AbstractC6464b abstractC6464b, JavaType javaType, AbstractC6446m abstractC6446m) throws JsonMappingException {
        AbstractC6464b.d dVarM11805h = abstractC6464b.m11805h(javaType, abstractC6446m, this._property);
        AbstractC6464b abstractC6464b2 = dVarM11805h.f10632b;
        if (abstractC6464b != abstractC6464b2) {
            this._dynamicSerializers = abstractC6464b2;
        }
        return dVarM11805h.f10631a;
    }

    public ObjectArraySerializer(ObjectArraySerializer objectArraySerializer, AbstractC6431e abstractC6431e) {
        super(objectArraySerializer);
        this._elementType = objectArraySerializer._elementType;
        this._valueTypeSerializer = abstractC6431e;
        this._staticTyping = objectArraySerializer._staticTyping;
        this._dynamicSerializers = objectArraySerializer._dynamicSerializers;
        this._elementSerializer = objectArraySerializer._elementSerializer;
    }

    public ObjectArraySerializer(ObjectArraySerializer objectArraySerializer, BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, Boolean bool) {
        super(objectArraySerializer, beanProperty, bool);
        this._elementType = objectArraySerializer._elementType;
        this._valueTypeSerializer = abstractC6431e;
        this._staticTyping = objectArraySerializer._staticTyping;
        this._dynamicSerializers = AbstractC6464b.m11798c();
        this._elementSerializer = abstractC6393h;
    }
}
