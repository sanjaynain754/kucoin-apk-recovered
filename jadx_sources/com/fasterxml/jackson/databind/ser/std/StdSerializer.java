package com.fasterxml.jackson.databind.ser.std;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.InterfaceC6458g;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.InterfaceC6491h;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;
import p528p7.InterfaceC43399e;
import p551q7.InterfaceC43653c;

/* JADX INFO: loaded from: classes45.dex */
public abstract class StdSerializer<T> extends AbstractC6393h<T> implements InterfaceC43653c, Serializable {

    /* JADX INFO: renamed from: b */
    public static final Object f10667b = new Object();
    private static final long serialVersionUID = 1;
    protected final Class<T> _handledType;

    public StdSerializer(Class<T> cls) {
        this._handledType = cls;
    }

    public ObjectNode createSchemaNode(String str) {
        ObjectNode objectNode = JsonNodeFactory.instance.objectNode();
        objectNode.put("type", str);
        return objectNode;
    }

    public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) throws JsonMappingException {
        return createSchemaNode(TypedValues.Custom.S_STRING);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public abstract void serialize(T t11, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException;

    public void visitArrayFormat(InterfaceC43399e interfaceC43399e, JavaType javaType, AbstractC6393h<?> abstractC6393h, JavaType javaType2) throws JsonMappingException {
        interfaceC43399e.mo95583m(javaType);
        if (_neitherNull(null, abstractC6393h)) {
            throw null;
        }
    }

    public void visitIntFormat(InterfaceC43399e interfaceC43399e, JavaType javaType, JsonParser.NumberType numberType) throws JsonMappingException {
        interfaceC43399e.mo95577b(javaType);
        if (_neitherNull(null, numberType)) {
            throw null;
        }
    }

    public void visitStringFormat(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        interfaceC43399e.mo95579f(javaType);
    }

    public void wrapAndThrow(AbstractC6446m abstractC6446m, Throwable th2, Object obj, String str) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        C6490g.m11939h0(th2);
        boolean z11 = abstractC6446m == null || abstractC6446m.isEnabled(SerializationFeature.WRAP_EXCEPTIONS);
        if (th2 instanceof IOException) {
            if (!z11 || !(th2 instanceof JacksonException)) {
                throw ((IOException) th2);
            }
        } else if (!z11) {
            C6490g.m11943j0(th2);
        }
        throw JsonMappingException.wrapWithPath(th2, obj, str);
    }

    public static final boolean _neitherNull(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    public static final boolean _nonEmpty(Collection<?> collection) {
        return (collection == null || collection.isEmpty()) ? false : true;
    }

    public AbstractC6393h<?> findAnnotatedContentSerializer(AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        Object objFindContentSerializer;
        if (beanProperty == null) {
            return null;
        }
        AnnotatedMember member = beanProperty.getMember();
        AnnotationIntrospector annotationIntrospector = abstractC6446m.getAnnotationIntrospector();
        if (member == null || (objFindContentSerializer = annotationIntrospector.findContentSerializer(member)) == null) {
            return null;
        }
        return abstractC6446m.serializerInstance(member, objFindContentSerializer);
    }

    public AbstractC6393h<?> findContextualConvertingSerializer(AbstractC6446m abstractC6446m, BeanProperty beanProperty, AbstractC6393h<?> abstractC6393h) throws JsonMappingException {
        Object obj = f10667b;
        Map identityHashMap = (Map) abstractC6446m.getAttribute(obj);
        if (identityHashMap == null) {
            identityHashMap = new IdentityHashMap();
            abstractC6446m.setAttribute(obj, (Object) identityHashMap);
        } else if (identityHashMap.get(beanProperty) != null) {
            return abstractC6393h;
        }
        identityHashMap.put(beanProperty, Boolean.TRUE);
        try {
            AbstractC6393h<?> abstractC6393hFindConvertingContentSerializer = findConvertingContentSerializer(abstractC6446m, beanProperty, abstractC6393h);
            return abstractC6393hFindConvertingContentSerializer != null ? abstractC6446m.handleSecondaryContextualization(abstractC6393hFindConvertingContentSerializer, beanProperty) : abstractC6393h;
        } finally {
            identityHashMap.remove(beanProperty);
        }
    }

    public JsonFormat.Value findFormatOverrides(AbstractC6446m abstractC6446m, BeanProperty beanProperty, Class<?> cls) {
        return beanProperty != null ? beanProperty.findPropertyFormat(abstractC6446m.getConfig(), cls) : abstractC6446m.getDefaultPropertyFormat(cls);
    }

    public JsonInclude.Value findIncludeOverrides(AbstractC6446m abstractC6446m, BeanProperty beanProperty, Class<?> cls) {
        return beanProperty != null ? beanProperty.findPropertyInclusion(abstractC6446m.getConfig(), cls) : abstractC6446m.getDefaultPropertyInclusion(cls);
    }

    public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type, boolean z11) throws JsonMappingException {
        ObjectNode objectNode = (ObjectNode) getSchema(abstractC6446m, type);
        if (!z11) {
            objectNode.put("required", !z11);
        }
        return objectNode;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public Class<T> handledType() {
        return this._handledType;
    }

    public void visitStringFormat(InterfaceC43399e interfaceC43399e, JavaType javaType, JsonValueFormat jsonValueFormat) throws JsonMappingException {
        interfaceC43399e.mo95579f(javaType);
    }

    public StdSerializer(JavaType javaType) {
        this._handledType = (Class<T>) javaType.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        interfaceC43399e.mo95581k(javaType);
    }

    public ObjectNode createSchemaNode(String str, boolean z11) {
        ObjectNode objectNodeCreateSchemaNode = createSchemaNode(str);
        if (!z11) {
            objectNodeCreateSchemaNode.put("required", !z11);
        }
        return objectNodeCreateSchemaNode;
    }

    @Deprecated
    public AbstractC6393h<?> findConvertingContentSerializer(AbstractC6446m abstractC6446m, BeanProperty beanProperty, AbstractC6393h<?> abstractC6393h) throws JsonMappingException {
        AnnotatedMember member;
        Object objFindSerializationContentConverter;
        AnnotationIntrospector annotationIntrospector = abstractC6446m.getAnnotationIntrospector();
        if (_neitherNull(annotationIntrospector, beanProperty) && (member = beanProperty.getMember()) != null && (objFindSerializationContentConverter = annotationIntrospector.findSerializationContentConverter(member)) != null) {
            InterfaceC6491h<Object, Object> interfaceC6491hConverterInstance = abstractC6446m.converterInstance(beanProperty.getMember(), objFindSerializationContentConverter);
            JavaType javaTypeMo11361b = interfaceC6491hConverterInstance.mo11361b(abstractC6446m.getTypeFactory());
            if (abstractC6393h == null && !javaTypeMo11361b.isJavaLangObject()) {
                abstractC6393h = abstractC6446m.findValueSerializer(javaTypeMo11361b);
            }
            return new StdDelegatingSerializer(interfaceC6491hConverterInstance, javaTypeMo11361b, abstractC6393h);
        }
        return abstractC6393h;
    }

    public Boolean findFormatFeature(AbstractC6446m abstractC6446m, BeanProperty beanProperty, Class<?> cls, JsonFormat.Feature feature) {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(abstractC6446m, beanProperty, cls);
        if (valueFindFormatOverrides != null) {
            return valueFindFormatOverrides.getFeature(feature);
        }
        return null;
    }

    public InterfaceC6458g findPropertyFilter(AbstractC6446m abstractC6446m, Object obj, Object obj2) throws JsonMappingException {
        abstractC6446m.getFilterProvider();
        return (InterfaceC6458g) abstractC6446m.reportBadDefinition((Class<?>) handledType(), "Cannot resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured");
    }

    public boolean isDefaultSerializer(AbstractC6393h<?> abstractC6393h) {
        return C6490g.m11912O(abstractC6393h);
    }

    public void visitFloatFormat(InterfaceC43399e interfaceC43399e, JavaType javaType, JsonParser.NumberType numberType) throws JsonMappingException {
        interfaceC43399e.mo95582l(javaType);
    }

    public void visitArrayFormat(InterfaceC43399e interfaceC43399e, JavaType javaType, JsonFormatTypes jsonFormatTypes) throws JsonMappingException {
        interfaceC43399e.mo95583m(javaType);
    }

    public void visitIntFormat(InterfaceC43399e interfaceC43399e, JavaType javaType, JsonParser.NumberType numberType, JsonValueFormat jsonValueFormat) throws JsonMappingException {
        interfaceC43399e.mo95577b(javaType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StdSerializer(Class<?> cls, boolean z11) {
        this._handledType = cls;
    }

    public StdSerializer(StdSerializer<?> stdSerializer) {
        this._handledType = (Class<T>) stdSerializer._handledType;
    }

    public void wrapAndThrow(AbstractC6446m abstractC6446m, Throwable th2, Object obj, int i11) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        C6490g.m11939h0(th2);
        boolean z11 = abstractC6446m == null || abstractC6446m.isEnabled(SerializationFeature.WRAP_EXCEPTIONS);
        if (th2 instanceof IOException) {
            if (!z11 || !(th2 instanceof JacksonException)) {
                throw ((IOException) th2);
            }
        } else if (!z11) {
            C6490g.m11943j0(th2);
        }
        throw JsonMappingException.wrapWithPath(th2, obj, i11);
    }
}
