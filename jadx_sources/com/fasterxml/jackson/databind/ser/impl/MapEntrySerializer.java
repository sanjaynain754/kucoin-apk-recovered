package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.InterfaceC6455d;
import com.fasterxml.jackson.databind.util.C6485b;
import com.fasterxml.jackson.databind.util.C6487d;
import java.io.IOException;
import java.util.Map;
import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class MapEntrySerializer extends ContainerSerializer<Map.Entry<?, ?>> implements InterfaceC6455d {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    protected AbstractC6464b _dynamicValueSerializers;
    protected final JavaType _entryType;
    protected AbstractC6393h<Object> _keySerializer;
    protected final JavaType _keyType;
    protected final BeanProperty _property;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected AbstractC6393h<Object> _valueSerializer;
    protected final JavaType _valueType;
    protected final boolean _valueTypeIsStatic;
    protected final AbstractC6431e _valueTypeSerializer;

    public MapEntrySerializer(JavaType javaType, JavaType javaType2, JavaType javaType3, boolean z11, AbstractC6431e abstractC6431e, BeanProperty beanProperty) {
        super(javaType);
        this._entryType = javaType;
        this._keyType = javaType2;
        this._valueType = javaType3;
        this._valueTypeIsStatic = z11;
        this._valueTypeSerializer = abstractC6431e;
        this._property = beanProperty;
        this._dynamicValueSerializers = AbstractC6464b.m11798c();
        this._suppressableValue = null;
        this._suppressNulls = false;
    }

    public final AbstractC6393h<Object> _findAndAddDynamic(AbstractC6464b abstractC6464b, Class<?> cls, AbstractC6446m abstractC6446m) throws JsonMappingException {
        AbstractC6464b.d dVarM11806i = abstractC6464b.m11806i(cls, abstractC6446m, this._property);
        AbstractC6464b abstractC6464b2 = dVarM11806i.f10632b;
        if (abstractC6464b != abstractC6464b2) {
            this._dynamicValueSerializers = abstractC6464b2;
        }
        return dVarM11806i.f10631a;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Map.Entry<?, ?> entry) {
        return true;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer$a */
    public static /* synthetic */ class C6461a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10615a;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f10615a = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10615a[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10615a[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10615a[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10615a[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10615a[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(AbstractC6431e abstractC6431e) {
        return new MapEntrySerializer(this, this._property, abstractC6431e, this._keySerializer, this._valueSerializer, this._suppressableValue, this._suppressNulls);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public AbstractC6393h<?> getContentSerializer() {
        return this._valueSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JavaType getContentType() {
        return this._valueType;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean isEmpty(AbstractC6446m abstractC6446m, Map.Entry<?, ?> entry) {
        Object value = entry.getValue();
        if (value == null) {
            return this._suppressNulls;
        }
        if (this._suppressableValue == null) {
            return false;
        }
        AbstractC6393h<Object> abstractC6393h_findAndAddDynamic = this._valueSerializer;
        if (abstractC6393h_findAndAddDynamic == null) {
            Class<?> cls = value.getClass();
            AbstractC6393h<Object> abstractC6393hMo11808k = this._dynamicValueSerializers.mo11808k(cls);
            if (abstractC6393hMo11808k == null) {
                try {
                    abstractC6393h_findAndAddDynamic = _findAndAddDynamic(this._dynamicValueSerializers, cls, abstractC6446m);
                } catch (JsonMappingException unused) {
                    return false;
                }
            } else {
                abstractC6393h_findAndAddDynamic = abstractC6393hMo11808k;
            }
        }
        Object obj = this._suppressableValue;
        return obj == MARKER_FOR_EMPTY ? abstractC6393h_findAndAddDynamic.isEmpty(abstractC6446m, value) : obj.equals(value);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        jsonGenerator.mo10852z0(entry);
        serializeDynamic(entry, jsonGenerator, abstractC6446m);
        jsonGenerator.mo10806X();
    }

    public void serializeDynamic(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        AbstractC6393h<Object> abstractC6393h_findAndAddDynamic;
        AbstractC6431e abstractC6431e = this._valueTypeSerializer;
        Object key = entry.getKey();
        AbstractC6393h<Object> abstractC6393hFindNullKeySerializer = key == null ? abstractC6446m.findNullKeySerializer(this._keyType, this._property) : this._keySerializer;
        Object value = entry.getValue();
        if (value != null) {
            abstractC6393h_findAndAddDynamic = this._valueSerializer;
            if (abstractC6393h_findAndAddDynamic == null) {
                Class<?> cls = value.getClass();
                AbstractC6393h<Object> abstractC6393hMo11808k = this._dynamicValueSerializers.mo11808k(cls);
                if (abstractC6393hMo11808k == null) {
                    abstractC6393h_findAndAddDynamic = this._valueType.hasGenericTypes() ? _findAndAddDynamic(this._dynamicValueSerializers, abstractC6446m.constructSpecializedType(this._valueType, cls), abstractC6446m) : _findAndAddDynamic(this._dynamicValueSerializers, cls, abstractC6446m);
                } else {
                    abstractC6393h_findAndAddDynamic = abstractC6393hMo11808k;
                }
            }
            Object obj = this._suppressableValue;
            if (obj != null && ((obj == MARKER_FOR_EMPTY && abstractC6393h_findAndAddDynamic.isEmpty(abstractC6446m, value)) || this._suppressableValue.equals(value))) {
                return;
            }
        } else if (this._suppressNulls) {
            return;
        } else {
            abstractC6393h_findAndAddDynamic = abstractC6446m.getDefaultNullValueSerializer();
        }
        abstractC6393hFindNullKeySerializer.serialize(key, jsonGenerator, abstractC6446m);
        try {
            if (abstractC6431e == null) {
                abstractC6393h_findAndAddDynamic.serialize(value, jsonGenerator, abstractC6446m);
            } else {
                abstractC6393h_findAndAddDynamic.serializeWithType(value, jsonGenerator, abstractC6446m, abstractC6431e);
            }
        } catch (Exception e11) {
            wrapAndThrow(abstractC6446m, e11, entry, "" + key);
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public void serializeWithType(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        jsonGenerator.mo10848x(entry);
        WritableTypeId writableTypeIdMo11695g = abstractC6431e.mo11695g(jsonGenerator, abstractC6431e.m11692d(entry, JsonToken.START_OBJECT));
        serializeDynamic(entry, jsonGenerator, abstractC6446m);
        abstractC6431e.mo11696h(jsonGenerator, writableTypeIdMo11695g);
    }

    public MapEntrySerializer withContentInclusion(Object obj, boolean z11) {
        return (this._suppressableValue == obj && this._suppressNulls == z11) ? this : new MapEntrySerializer(this, this._property, this._valueTypeSerializer, this._keySerializer, this._valueSerializer, obj, z11);
    }

    public MapEntrySerializer withResolved(BeanProperty beanProperty, AbstractC6393h<?> abstractC6393h, AbstractC6393h<?> abstractC6393h2, Object obj, boolean z11) {
        return new MapEntrySerializer(this, beanProperty, this._valueTypeSerializer, abstractC6393h, abstractC6393h2, obj, z11);
    }

    @Override // com.fasterxml.jackson.databind.ser.InterfaceC6455d
    public AbstractC6393h<?> createContextual(AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        AnnotatedMember member;
        AbstractC6393h<Object> abstractC6393hSerializerInstance;
        AbstractC6393h<?> abstractC6393hSerializerInstance2;
        AbstractC6393h<?> abstractC6393hHandleSecondaryContextualization;
        Object obj;
        JsonInclude.Value valueFindPropertyInclusion;
        JsonInclude.Include contentInclusion;
        AnnotationIntrospector annotationIntrospector = abstractC6446m.getAnnotationIntrospector();
        Object objM11895b = null;
        if (beanProperty == null) {
            member = null;
        } else {
            member = beanProperty.getMember();
        }
        if (member != null && annotationIntrospector != null) {
            Object objFindKeySerializer = annotationIntrospector.findKeySerializer(member);
            if (objFindKeySerializer != null) {
                abstractC6393hSerializerInstance2 = abstractC6446m.serializerInstance(member, objFindKeySerializer);
            } else {
                abstractC6393hSerializerInstance2 = null;
            }
            Object objFindContentSerializer = annotationIntrospector.findContentSerializer(member);
            if (objFindContentSerializer != null) {
                abstractC6393hSerializerInstance = abstractC6446m.serializerInstance(member, objFindContentSerializer);
            } else {
                abstractC6393hSerializerInstance = null;
            }
        } else {
            abstractC6393hSerializerInstance = null;
            abstractC6393hSerializerInstance2 = null;
        }
        if (abstractC6393hSerializerInstance == null) {
            abstractC6393hSerializerInstance = this._valueSerializer;
        }
        AbstractC6393h<?> abstractC6393hFindContextualConvertingSerializer = findContextualConvertingSerializer(abstractC6446m, beanProperty, abstractC6393hSerializerInstance);
        if (abstractC6393hFindContextualConvertingSerializer == null && this._valueTypeIsStatic && !this._valueType.isJavaLangObject()) {
            abstractC6393hFindContextualConvertingSerializer = abstractC6446m.findContentValueSerializer(this._valueType, beanProperty);
        }
        AbstractC6393h<?> abstractC6393h = abstractC6393hFindContextualConvertingSerializer;
        if (abstractC6393hSerializerInstance2 == null) {
            abstractC6393hSerializerInstance2 = this._keySerializer;
        }
        if (abstractC6393hSerializerInstance2 == null) {
            abstractC6393hHandleSecondaryContextualization = abstractC6446m.findKeySerializer(this._keyType, beanProperty);
        } else {
            abstractC6393hHandleSecondaryContextualization = abstractC6446m.handleSecondaryContextualization(abstractC6393hSerializerInstance2, beanProperty);
        }
        AbstractC6393h<?> abstractC6393h2 = abstractC6393hHandleSecondaryContextualization;
        Object obj2 = this._suppressableValue;
        boolean zIncludeFilterSuppressNulls = this._suppressNulls;
        if (beanProperty != null && (valueFindPropertyInclusion = beanProperty.findPropertyInclusion(abstractC6446m.getConfig(), null)) != null && (contentInclusion = valueFindPropertyInclusion.getContentInclusion()) != JsonInclude.Include.USE_DEFAULTS) {
            int i11 = C6461a.f10615a[contentInclusion.ordinal()];
            zIncludeFilterSuppressNulls = true;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                zIncludeFilterSuppressNulls = false;
                            }
                        } else {
                            objM11895b = abstractC6446m.includeFilterInstance(null, valueFindPropertyInclusion.getContentFilter());
                            if (objM11895b != null) {
                                zIncludeFilterSuppressNulls = abstractC6446m.includeFilterSuppressNulls(objM11895b);
                            }
                        }
                    } else {
                        objM11895b = MARKER_FOR_EMPTY;
                    }
                } else if (this._valueType.isReferenceType()) {
                    objM11895b = MARKER_FOR_EMPTY;
                }
            } else {
                objM11895b = C6487d.m11895b(this._valueType);
                if (objM11895b != null && objM11895b.getClass().isArray()) {
                    objM11895b = C6485b.m11877b(objM11895b);
                }
            }
            obj = objM11895b;
        } else {
            obj = obj2;
        }
        return withResolved(beanProperty, abstractC6393h2, abstractC6393h, obj, zIncludeFilterSuppressNulls);
    }

    public final AbstractC6393h<Object> _findAndAddDynamic(AbstractC6464b abstractC6464b, JavaType javaType, AbstractC6446m abstractC6446m) throws JsonMappingException {
        AbstractC6464b.d dVarM11805h = abstractC6464b.m11805h(javaType, abstractC6446m, this._property);
        AbstractC6464b abstractC6464b2 = dVarM11805h.f10632b;
        if (abstractC6464b != abstractC6464b2) {
            this._dynamicValueSerializers = abstractC6464b2;
        }
        return dVarM11805h.f10631a;
    }

    @Deprecated
    public MapEntrySerializer(MapEntrySerializer mapEntrySerializer, BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, AbstractC6393h<?> abstractC6393h2) {
        this(mapEntrySerializer, beanProperty, abstractC6431e, abstractC6393h, abstractC6393h2, mapEntrySerializer._suppressableValue, mapEntrySerializer._suppressNulls);
    }

    public MapEntrySerializer(MapEntrySerializer mapEntrySerializer, BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, AbstractC6393h<?> abstractC6393h2, Object obj, boolean z11) {
        super(Map.class, false);
        this._entryType = mapEntrySerializer._entryType;
        this._keyType = mapEntrySerializer._keyType;
        this._valueType = mapEntrySerializer._valueType;
        this._valueTypeIsStatic = mapEntrySerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapEntrySerializer._valueTypeSerializer;
        this._keySerializer = abstractC6393h;
        this._valueSerializer = abstractC6393h2;
        this._dynamicValueSerializers = AbstractC6464b.m11798c();
        this._property = mapEntrySerializer._property;
        this._suppressableValue = obj;
        this._suppressNulls = z11;
    }
}
