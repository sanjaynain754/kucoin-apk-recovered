package com.fasterxml.jackson.databind.ser.impl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.InterfaceC6455d;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Objects;
import p450m7.InterfaceC42435a;
import p528p7.InterfaceC43399e;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class StringArraySerializer extends ArraySerializerBase<String[]> implements InterfaceC6455d {

    /* JADX INFO: renamed from: c */
    public static final JavaType f10616c = TypeFactory.defaultInstance().uncheckedSimpleType(String.class);
    public static final StringArraySerializer instance = new StringArraySerializer();
    protected final AbstractC6393h<Object> _elementSerializer;

    public StringArraySerializer() {
        super(String[].class);
        this._elementSerializer = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m11793a(String[] strArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6393h<Object> abstractC6393h) throws IOException {
        for (String str : strArr) {
            if (str == null) {
                abstractC6446m.defaultSerializeNull(jsonGenerator);
            } else {
                abstractC6393h.serialize(str, jsonGenerator, abstractC6446m);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.InterfaceC6455d
    public AbstractC6393h<?> createContextual(AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hSerializerInstance;
        Object objFindContentSerializer;
        if (beanProperty != null) {
            AnnotationIntrospector annotationIntrospector = abstractC6446m.getAnnotationIntrospector();
            AnnotatedMember member = beanProperty.getMember();
            if (member == null || (objFindContentSerializer = annotationIntrospector.findContentSerializer(member)) == null) {
                abstractC6393hSerializerInstance = null;
            } else {
                abstractC6393hSerializerInstance = abstractC6446m.serializerInstance(member, objFindContentSerializer);
            }
        } else {
            abstractC6393hSerializerInstance = null;
        }
        Boolean boolFindFormatFeature = findFormatFeature(abstractC6446m, beanProperty, String[].class, JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
        if (abstractC6393hSerializerInstance == null) {
            abstractC6393hSerializerInstance = this._elementSerializer;
        }
        AbstractC6393h<?> abstractC6393hFindContextualConvertingSerializer = findContextualConvertingSerializer(abstractC6446m, beanProperty, abstractC6393hSerializerInstance);
        if (abstractC6393hFindContextualConvertingSerializer == null) {
            abstractC6393hFindContextualConvertingSerializer = abstractC6446m.findContentValueSerializer(String.class, beanProperty);
        }
        AbstractC6393h<?> abstractC6393h = isDefaultSerializer(abstractC6393hFindContextualConvertingSerializer) ? null : abstractC6393hFindContextualConvertingSerializer;
        return (abstractC6393h == this._elementSerializer && Objects.equals(boolFindFormatFeature, this._unwrapSingle)) ? this : new StringArraySerializer(this, beanProperty, abstractC6393h, boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    public AbstractC6393h<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new StringArraySerializer(this, beanProperty, this._elementSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        visitArrayFormat(interfaceC43399e, javaType, JsonFormatTypes.STRING);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public AbstractC6393h<?> getContentSerializer() {
        return this._elementSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JavaType getContentType() {
        return f10616c;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
    public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) {
        return createSchemaNode("array", true).set(FirebaseAnalytics.Param.ITEMS, createSchemaNode(TypedValues.Custom.S_STRING));
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(String[] strArr) {
        return strArr.length == 1;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean isEmpty(AbstractC6446m abstractC6446m, String[] strArr) {
        return strArr.length == 0;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public final void serialize(String[] strArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        int length = strArr.length;
        if (length == 1 && ((this._unwrapSingle == null && abstractC6446m.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(strArr, jsonGenerator, abstractC6446m);
            return;
        }
        jsonGenerator.mo10849x0(strArr, length);
        serializeContents(strArr, jsonGenerator, abstractC6446m);
        jsonGenerator.mo10805W();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    public void serializeContents(String[] strArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        if (strArr.length == 0) {
            return;
        }
        AbstractC6393h<Object> abstractC6393h = this._elementSerializer;
        if (abstractC6393h != null) {
            m11793a(strArr, jsonGenerator, abstractC6446m, abstractC6393h);
            return;
        }
        for (String str : strArr) {
            if (str == null) {
                jsonGenerator.mo10812b0();
            } else {
                jsonGenerator.mo10787C0(str);
            }
        }
    }

    public StringArraySerializer(StringArraySerializer stringArraySerializer, BeanProperty beanProperty, AbstractC6393h<?> abstractC6393h, Boolean bool) {
        super(stringArraySerializer, beanProperty, bool);
        this._elementSerializer = abstractC6393h;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(AbstractC6431e abstractC6431e) {
        return this;
    }
}
