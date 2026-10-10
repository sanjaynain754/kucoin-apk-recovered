package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.InterfaceC6455d;
import com.fasterxml.jackson.databind.ser.impl.AbstractC6464b;
import com.fasterxml.jackson.databind.util.C6490g;
import com.tencent.bugly.proguard.RunnableC33958ua;
import java.io.IOException;
import java.lang.reflect.Type;
import p450m7.InterfaceC42435a;
import p528p7.InterfaceC43399e;
import p551q7.C43651a;
import p551q7.InterfaceC43653c;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class JsonValueSerializer extends StdSerializer<Object> implements InterfaceC6455d, InterfaceC43653c {
    protected final AnnotatedMember _accessor;
    protected transient AbstractC6464b _dynamicSerializers;
    protected final boolean _forceTypeInformation;
    protected final BeanProperty _property;
    protected final AbstractC6393h<Object> _valueSerializer;
    protected final JavaType _valueType;
    protected final AbstractC6431e _valueTypeSerializer;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.JsonValueSerializer$a */
    public static class C6471a extends AbstractC6431e {

        /* JADX INFO: renamed from: a */
        public final AbstractC6431e f10651a;

        /* JADX INFO: renamed from: b */
        public final Object f10652b;

        @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6431e
        /* JADX INFO: renamed from: a */
        public AbstractC6431e mo11689a(BeanProperty beanProperty) {
            throw new UnsupportedOperationException();
        }

        @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6431e
        /* JADX INFO: renamed from: b */
        public String mo11690b() {
            return this.f10651a.mo11690b();
        }

        @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6431e
        /* JADX INFO: renamed from: c */
        public JsonTypeInfo.EnumC6265As mo11691c() {
            return this.f10651a.mo11691c();
        }

        @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6431e
        /* JADX INFO: renamed from: g */
        public WritableTypeId mo11695g(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
            writableTypeId.f10140a = this.f10652b;
            return this.f10651a.mo11695g(jsonGenerator, writableTypeId);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6431e
        /* JADX INFO: renamed from: h */
        public WritableTypeId mo11696h(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
            return this.f10651a.mo11696h(jsonGenerator, writableTypeId);
        }

        public C6471a(AbstractC6431e abstractC6431e, Object obj) {
            this.f10651a = abstractC6431e;
            this.f10652b = obj;
        }
    }

    public JsonValueSerializer(AnnotatedMember annotatedMember, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h) {
        super(annotatedMember.getType());
        this._accessor = annotatedMember;
        this._valueType = annotatedMember.getType();
        this._valueTypeSerializer = abstractC6431e;
        this._valueSerializer = abstractC6393h;
        this._property = null;
        this._forceTypeInformation = true;
        this._dynamicSerializers = AbstractC6464b.m11798c();
    }

    /* JADX INFO: renamed from: a */
    public static final Class<Object> m11831a(Class<?> cls) {
        return cls == null ? Object.class : cls;
    }

    public AbstractC6393h<Object> _findDynamicSerializer(AbstractC6446m abstractC6446m, Class<?> cls) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hMo11808k = this._dynamicSerializers.mo11808k(cls);
        if (abstractC6393hMo11808k != null) {
            return abstractC6393hMo11808k;
        }
        if (!this._valueType.hasGenericTypes()) {
            AbstractC6393h<Object> abstractC6393hFindPrimaryPropertySerializer = abstractC6446m.findPrimaryPropertySerializer(cls, this._property);
            this._dynamicSerializers = this._dynamicSerializers.m11801b(cls, abstractC6393hFindPrimaryPropertySerializer).f10632b;
            return abstractC6393hFindPrimaryPropertySerializer;
        }
        JavaType javaTypeConstructSpecializedType = abstractC6446m.constructSpecializedType(this._valueType, cls);
        AbstractC6393h<Object> abstractC6393hFindPrimaryPropertySerializer2 = abstractC6446m.findPrimaryPropertySerializer(javaTypeConstructSpecializedType, this._property);
        this._dynamicSerializers = this._dynamicSerializers.m11800a(javaTypeConstructSpecializedType, abstractC6393hFindPrimaryPropertySerializer2).f10632b;
        return abstractC6393hFindPrimaryPropertySerializer2;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        Class<?> declaringClass = this._accessor.getDeclaringClass();
        if (declaringClass != null && C6490g.m11909L(declaringClass) && _acceptJsonFormatVisitorForEnum(interfaceC43399e, javaType, declaringClass)) {
            return;
        }
        AbstractC6393h<Object> abstractC6393hFindTypedValueSerializer = this._valueSerializer;
        if (abstractC6393hFindTypedValueSerializer == null && (abstractC6393hFindTypedValueSerializer = interfaceC43399e.mo95575a().findTypedValueSerializer(this._valueType, false, this._property)) == null) {
            interfaceC43399e.mo95581k(javaType);
        } else {
            abstractC6393hFindTypedValueSerializer.acceptJsonFormatVisitor(interfaceC43399e, this._valueType);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.InterfaceC6455d
    public AbstractC6393h<?> createContextual(AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6431e abstractC6431eMo11689a = this._valueTypeSerializer;
        if (abstractC6431eMo11689a != null) {
            abstractC6431eMo11689a = abstractC6431eMo11689a.mo11689a(beanProperty);
        }
        AbstractC6393h<?> abstractC6393h = this._valueSerializer;
        if (abstractC6393h != null) {
            return withResolved(beanProperty, abstractC6431eMo11689a, abstractC6446m.handlePrimaryContextualization(abstractC6393h, beanProperty), this._forceTypeInformation);
        }
        if (!abstractC6446m.isEnabled(MapperFeature.USE_STATIC_TYPING) && !this._valueType.isFinal()) {
            return beanProperty != this._property ? withResolved(beanProperty, abstractC6431eMo11689a, abstractC6393h, this._forceTypeInformation) : this;
        }
        AbstractC6393h<Object> abstractC6393hFindPrimaryPropertySerializer = abstractC6446m.findPrimaryPropertySerializer(this._valueType, beanProperty);
        return withResolved(beanProperty, abstractC6431eMo11689a, abstractC6393hFindPrimaryPropertySerializer, isNaturalTypeWithStdHandling(this._valueType.getRawClass(), abstractC6393hFindPrimaryPropertySerializer));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
    public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) throws JsonMappingException {
        Object obj = this._valueSerializer;
        return obj instanceof InterfaceC43653c ? ((InterfaceC43653c) obj).getSchema(abstractC6446m, null) : C43651a.m96066a();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean isEmpty(AbstractC6446m abstractC6446m, Object obj) {
        Object value = this._accessor.getValue(obj);
        if (value == null) {
            return true;
        }
        AbstractC6393h<Object> abstractC6393h_findDynamicSerializer = this._valueSerializer;
        if (abstractC6393h_findDynamicSerializer == null) {
            try {
                abstractC6393h_findDynamicSerializer = _findDynamicSerializer(abstractC6446m, value.getClass());
            } catch (JsonMappingException e11) {
                throw new RuntimeJsonMappingException(e11);
            }
        }
        return abstractC6393h_findDynamicSerializer.isEmpty(abstractC6446m, value);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        Object value;
        try {
            value = this._accessor.getValue(obj);
        } catch (Exception e11) {
            wrapAndThrow(abstractC6446m, e11, obj, this._accessor.getName() + "()");
            value = null;
        }
        if (value == null) {
            abstractC6446m.defaultSerializeNull(jsonGenerator);
            return;
        }
        AbstractC6393h<Object> abstractC6393h_findDynamicSerializer = this._valueSerializer;
        if (abstractC6393h_findDynamicSerializer == null) {
            abstractC6393h_findDynamicSerializer = _findDynamicSerializer(abstractC6446m, value.getClass());
        }
        AbstractC6431e abstractC6431e = this._valueTypeSerializer;
        if (abstractC6431e != null) {
            abstractC6393h_findDynamicSerializer.serializeWithType(value, jsonGenerator, abstractC6446m, abstractC6431e);
        } else {
            abstractC6393h_findDynamicSerializer.serialize(value, jsonGenerator, abstractC6446m);
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        Object value;
        try {
            value = this._accessor.getValue(obj);
        } catch (Exception e11) {
            wrapAndThrow(abstractC6446m, e11, obj, this._accessor.getName() + "()");
            value = null;
        }
        if (value == null) {
            abstractC6446m.defaultSerializeNull(jsonGenerator);
            return;
        }
        AbstractC6393h<Object> abstractC6393h_findDynamicSerializer = this._valueSerializer;
        if (abstractC6393h_findDynamicSerializer == null) {
            abstractC6393h_findDynamicSerializer = _findDynamicSerializer(abstractC6446m, value.getClass());
        } else if (this._forceTypeInformation) {
            WritableTypeId writableTypeIdMo11695g = abstractC6431e.mo11695g(jsonGenerator, abstractC6431e.m11692d(obj, JsonToken.VALUE_STRING));
            abstractC6393h_findDynamicSerializer.serialize(value, jsonGenerator, abstractC6446m);
            abstractC6431e.mo11696h(jsonGenerator, writableTypeIdMo11695g);
            return;
        }
        abstractC6393h_findDynamicSerializer.serializeWithType(value, jsonGenerator, abstractC6446m, new C6471a(abstractC6431e, obj));
    }

    public String toString() {
        return "(@JsonValue serializer for method " + this._accessor.getDeclaringClass() + RunnableC33958ua.f72251f + this._accessor.getName() + ")";
    }

    public JsonValueSerializer withResolved(BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, boolean z11) {
        return (this._property == beanProperty && this._valueTypeSerializer == abstractC6431e && this._valueSerializer == abstractC6393h && z11 == this._forceTypeInformation) ? this : new JsonValueSerializer(this, beanProperty, abstractC6431e, abstractC6393h, z11);
    }

    public boolean _acceptJsonFormatVisitorForEnum(InterfaceC43399e interfaceC43399e, JavaType javaType, Class<?> cls) throws JsonMappingException {
        interfaceC43399e.mo95579f(javaType);
        return true;
    }

    public boolean isNaturalTypeWithStdHandling(Class<?> cls, AbstractC6393h<?> abstractC6393h) {
        if (cls.isPrimitive()) {
            if (cls != Integer.TYPE && cls != Boolean.TYPE && cls != Double.TYPE) {
                return false;
            }
        } else if (cls != String.class && cls != Integer.class && cls != Boolean.class && cls != Double.class) {
            return false;
        }
        return isDefaultSerializer(abstractC6393h);
    }

    @Deprecated
    public JsonValueSerializer(AnnotatedMember annotatedMember, AbstractC6393h<?> abstractC6393h) {
        this(annotatedMember, null, abstractC6393h);
    }

    public JsonValueSerializer(JsonValueSerializer jsonValueSerializer, BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, boolean z11) {
        super(m11831a(jsonValueSerializer.handledType()));
        this._accessor = jsonValueSerializer._accessor;
        this._valueType = jsonValueSerializer._valueType;
        this._valueTypeSerializer = abstractC6431e;
        this._valueSerializer = abstractC6393h;
        this._property = beanProperty;
        this._forceTypeInformation = z11;
        this._dynamicSerializers = AbstractC6464b.m11798c();
    }
}
