package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.InterfaceC6455d;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Objects;
import p528p7.InterfaceC43396b;
import p528p7.InterfaceC43399e;

/* JADX INFO: loaded from: classes45.dex */
public abstract class StaticListSerializerBase<T extends Collection<?>> extends StdSerializer<T> implements InterfaceC6455d {
    protected final Boolean _unwrapSingle;

    public StaticListSerializerBase(Class<?> cls) {
        super(cls, false);
        this._unwrapSingle = null;
    }

    public abstract AbstractC6393h<?> _withResolved(BeanProperty beanProperty, Boolean bool);

    public abstract void acceptContentVisitor(InterfaceC43396b interfaceC43396b) throws JsonMappingException;

    public abstract AbstractC6391f contentSchema();

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // com.fasterxml.jackson.databind.ser.InterfaceC6455d
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
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(abstractC6446m, beanProperty, handledType());
        Boolean feature = valueFindFormatOverrides != null ? valueFindFormatOverrides.getFeature(JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : null;
        AbstractC6393h<?> abstractC6393hFindContextualConvertingSerializer = findContextualConvertingSerializer(abstractC6446m, beanProperty, abstractC6393hSerializerInstance);
        if (abstractC6393hFindContextualConvertingSerializer == null) {
            abstractC6393hFindContextualConvertingSerializer = abstractC6446m.findContentValueSerializer(String.class, beanProperty);
        }
        if (isDefaultSerializer(abstractC6393hFindContextualConvertingSerializer)) {
            return Objects.equals(feature, this._unwrapSingle) ? this : _withResolved(beanProperty, feature);
        }
        return new CollectionSerializer(abstractC6446m.constructType(String.class), true, null, abstractC6393hFindContextualConvertingSerializer);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public abstract void serializeWithType(T t11, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException;

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
    public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) {
        return createSchemaNode("array", true).set(FirebaseAnalytics.Param.ITEMS, contentSchema());
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean isEmpty(AbstractC6446m abstractC6446m, T t11) {
        return t11 == null || t11.size() == 0;
    }

    public StaticListSerializerBase(StaticListSerializerBase<?> staticListSerializerBase, Boolean bool) {
        super(staticListSerializerBase);
        this._unwrapSingle = bool;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        interfaceC43399e.mo95583m(javaType);
    }
}
