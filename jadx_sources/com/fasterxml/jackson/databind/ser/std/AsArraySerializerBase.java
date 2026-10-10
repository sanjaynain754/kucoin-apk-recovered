package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.InterfaceC6455d;
import com.fasterxml.jackson.databind.ser.impl.AbstractC6464b;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Objects;
import p528p7.InterfaceC43399e;
import p551q7.C43651a;
import p551q7.InterfaceC43653c;

/* JADX INFO: loaded from: classes45.dex */
public abstract class AsArraySerializerBase<T> extends ContainerSerializer<T> implements InterfaceC6455d {
    protected AbstractC6464b _dynamicSerializers;
    protected final AbstractC6393h<Object> _elementSerializer;
    protected final JavaType _elementType;
    protected final BeanProperty _property;
    protected final boolean _staticTyping;
    protected final Boolean _unwrapSingle;
    protected final AbstractC6431e _valueTypeSerializer;

    public AsArraySerializerBase(Class<?> cls, JavaType javaType, boolean z11, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h) {
        this(cls, javaType, z11, abstractC6431e, null, abstractC6393h, null);
    }

    public final AbstractC6393h<Object> _findAndAddDynamic(AbstractC6464b abstractC6464b, Class<?> cls, AbstractC6446m abstractC6446m) throws JsonMappingException {
        AbstractC6464b.d dVarM11806i = abstractC6464b.m11806i(cls, abstractC6446m, this._property);
        AbstractC6464b abstractC6464b2 = dVarM11806i.f10632b;
        if (abstractC6464b != abstractC6464b2) {
            this._dynamicSerializers = abstractC6464b2;
        }
        return dVarM11806i.f10631a;
    }

    public abstract void serializeContents(T t11, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException;

    @Deprecated
    public final AsArraySerializerBase<T> withResolved(BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h) {
        return withResolved(beanProperty, abstractC6431e, abstractC6393h, this._unwrapSingle);
    }

    public abstract AsArraySerializerBase<T> withResolved(BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, Boolean bool);

    @Deprecated
    public AsArraySerializerBase(Class<?> cls, JavaType javaType, boolean z11, AbstractC6431e abstractC6431e, BeanProperty beanProperty, AbstractC6393h<Object> abstractC6393h) {
        this(cls, javaType, z11, abstractC6431e, beanProperty, abstractC6393h, null);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hFindContentValueSerializer = this._elementSerializer;
        if (abstractC6393hFindContentValueSerializer == null && this._elementType != null) {
            abstractC6393hFindContentValueSerializer = interfaceC43399e.mo95575a().findContentValueSerializer(this._elementType, this._property);
        }
        visitArrayFormat(interfaceC43399e, javaType, abstractC6393hFindContentValueSerializer, this._elementType);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // com.fasterxml.jackson.databind.ser.InterfaceC6455d
    public AbstractC6393h<?> createContextual(AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hSerializerInstance;
        JavaType javaType;
        Object objFindContentSerializer;
        AbstractC6431e abstractC6431eMo11689a = this._valueTypeSerializer;
        if (abstractC6431eMo11689a != null) {
            abstractC6431eMo11689a = abstractC6431eMo11689a.mo11689a(beanProperty);
        }
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
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(abstractC6446m, beanProperty, handledType());
        Boolean feature = valueFindFormatOverrides != null ? valueFindFormatOverrides.getFeature(JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : null;
        if (abstractC6393hSerializerInstance == null) {
            abstractC6393hSerializerInstance = this._elementSerializer;
        }
        AbstractC6393h<?> abstractC6393hFindContextualConvertingSerializer = findContextualConvertingSerializer(abstractC6446m, beanProperty, abstractC6393hSerializerInstance);
        if (abstractC6393hFindContextualConvertingSerializer == null && (javaType = this._elementType) != null && this._staticTyping && !javaType.isJavaLangObject()) {
            abstractC6393hFindContextualConvertingSerializer = abstractC6446m.findContentValueSerializer(this._elementType, beanProperty);
        }
        return (abstractC6393hFindContextualConvertingSerializer == this._elementSerializer && beanProperty == this._property && this._valueTypeSerializer == abstractC6431eMo11689a && Objects.equals(this._unwrapSingle, feature)) ? this : withResolved(beanProperty, abstractC6431eMo11689a, abstractC6393hFindContextualConvertingSerializer, feature);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public AbstractC6393h<?> getContentSerializer() {
        return this._elementSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JavaType getContentType() {
        return this._elementType;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
    public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) throws JsonMappingException {
        ObjectNode objectNodeCreateSchemaNode = createSchemaNode("array", true);
        Object obj = this._elementSerializer;
        if (obj != null) {
            AbstractC6391f schema = obj instanceof InterfaceC43653c ? ((InterfaceC43653c) obj).getSchema(abstractC6446m, null) : null;
            if (schema == null) {
                schema = C43651a.m96066a();
            }
            objectNodeCreateSchemaNode.set(FirebaseAnalytics.Param.ITEMS, schema);
        }
        return objectNodeCreateSchemaNode;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(T t11, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        if (abstractC6446m.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && hasSingleElement(t11)) {
            serializeContents(t11, jsonGenerator, abstractC6446m);
            return;
        }
        jsonGenerator.mo10847w0(t11);
        serializeContents(t11, jsonGenerator, abstractC6446m);
        jsonGenerator.mo10805W();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public void serializeWithType(T t11, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        WritableTypeId writableTypeIdMo11695g = abstractC6431e.mo11695g(jsonGenerator, abstractC6431e.m11692d(t11, JsonToken.START_ARRAY));
        jsonGenerator.mo10848x(t11);
        serializeContents(t11, jsonGenerator, abstractC6446m);
        abstractC6431e.mo11696h(jsonGenerator, writableTypeIdMo11695g);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsArraySerializerBase(Class<?> cls, JavaType javaType, boolean z11, AbstractC6431e abstractC6431e, BeanProperty beanProperty, AbstractC6393h<?> abstractC6393h, Boolean bool) {
        super(cls, false);
        boolean z12 = false;
        this._elementType = javaType;
        if (z11 || (javaType != null && javaType.isFinal())) {
            z12 = true;
        }
        this._staticTyping = z12;
        this._valueTypeSerializer = abstractC6431e;
        this._property = beanProperty;
        this._elementSerializer = abstractC6393h;
        this._dynamicSerializers = AbstractC6464b.m11798c();
        this._unwrapSingle = bool;
    }

    public final AbstractC6393h<Object> _findAndAddDynamic(AbstractC6464b abstractC6464b, JavaType javaType, AbstractC6446m abstractC6446m) throws JsonMappingException {
        AbstractC6464b.d dVarM11805h = abstractC6464b.m11805h(javaType, abstractC6446m, this._property);
        AbstractC6464b abstractC6464b2 = dVarM11805h.f10632b;
        if (abstractC6464b != abstractC6464b2) {
            this._dynamicSerializers = abstractC6464b2;
        }
        return dVarM11805h.f10631a;
    }

    public AsArraySerializerBase(AsArraySerializerBase<?> asArraySerializerBase, BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, Boolean bool) {
        super(asArraySerializerBase);
        this._elementType = asArraySerializerBase._elementType;
        this._staticTyping = asArraySerializerBase._staticTyping;
        this._valueTypeSerializer = abstractC6431e;
        this._property = beanProperty;
        this._elementSerializer = abstractC6393h;
        this._dynamicSerializers = AbstractC6464b.m11798c();
        this._unwrapSingle = bool;
    }

    @Deprecated
    public AsArraySerializerBase(AsArraySerializerBase<?> asArraySerializerBase, BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h) {
        this(asArraySerializerBase, beanProperty, abstractC6431e, abstractC6393h, asArraySerializerBase._unwrapSingle);
    }
}
