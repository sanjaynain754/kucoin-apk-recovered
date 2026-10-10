package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.InterfaceC6455d;
import com.fasterxml.jackson.databind.ser.InterfaceC6458g;
import com.fasterxml.jackson.databind.ser.impl.AbstractC6464b;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.C6485b;
import com.fasterxml.jackson.databind.util.C6487d;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p450m7.InterfaceC42435a;
import p528p7.InterfaceC43399e;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class MapSerializer extends ContainerSerializer<Map<?, ?>> implements InterfaceC6455d {
    private static final long serialVersionUID = 1;
    protected AbstractC6464b _dynamicValueSerializers;
    protected final Object _filterId;
    protected final Set<String> _ignoredEntries;
    protected final Set<String> _includedEntries;
    protected final IgnorePropertiesUtil.Checker _inclusionChecker;
    protected AbstractC6393h<Object> _keySerializer;
    protected final JavaType _keyType;
    protected final BeanProperty _property;
    protected final boolean _sortKeys;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected AbstractC6393h<Object> _valueSerializer;
    protected final JavaType _valueType;
    protected final boolean _valueTypeIsStatic;
    protected final AbstractC6431e _valueTypeSerializer;
    protected static final JavaType UNSPECIFIED_TYPE = TypeFactory.unknownType();
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;

    public MapSerializer(Set<String> set, Set<String> set2, JavaType javaType, JavaType javaType2, boolean z11, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, AbstractC6393h<?> abstractC6393h2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this._ignoredEntries = set;
        this._includedEntries = set2;
        this._keyType = javaType;
        this._valueType = javaType2;
        this._valueTypeIsStatic = z11;
        this._valueTypeSerializer = abstractC6431e;
        this._keySerializer = abstractC6393h;
        this._valueSerializer = abstractC6393h2;
        this._dynamicValueSerializers = AbstractC6464b.m11798c();
        this._property = null;
        this._filterId = null;
        this._sortKeys = false;
        this._suppressableValue = null;
        this._suppressNulls = false;
        this._inclusionChecker = IgnorePropertiesUtil.m11866a(set, set2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c A[RETURN] */
    public static MapSerializer construct(Set<String> set, Set<String> set2, JavaType javaType, boolean z11, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h, AbstractC6393h<Object> abstractC6393h2, Object obj) {
        JavaType javaTypeUnknownType;
        JavaType javaType2;
        boolean z12;
        MapSerializer mapSerializer;
        if (javaType == null) {
            javaType2 = UNSPECIFIED_TYPE;
            javaTypeUnknownType = javaType2;
        } else {
            JavaType keyType = javaType.getKeyType();
            javaTypeUnknownType = javaType.hasRawClass(Properties.class) ? TypeFactory.unknownType() : javaType.getContentType();
            javaType2 = keyType;
        }
        boolean z13 = false;
        if (z11) {
            if (javaTypeUnknownType.getRawClass() == Object.class) {
                z12 = false;
            }
            mapSerializer = new MapSerializer(set, set2, javaType2, javaTypeUnknownType, z12, abstractC6431e, abstractC6393h, abstractC6393h2);
            if (obj != null) {
                return mapSerializer.withFilterId(obj);
            }
            return mapSerializer;
        }
        if (javaTypeUnknownType != null && javaTypeUnknownType.isFinal()) {
            z13 = true;
        }
        z11 = z13;
        z12 = z11;
        mapSerializer = new MapSerializer(set, set2, javaType2, javaTypeUnknownType, z12, abstractC6431e, abstractC6393h, abstractC6393h2);
        if (obj != null) {
            return mapSerializer.withFilterId(obj);
        }
        return mapSerializer;
    }

    public void _ensureOverride(String str) {
        C6490g.m11951n0(MapSerializer.class, this, str);
    }

    public final AbstractC6393h<Object> _findAndAddDynamic(AbstractC6464b abstractC6464b, Class<?> cls, AbstractC6446m abstractC6446m) throws JsonMappingException {
        AbstractC6464b.d dVarM11806i = abstractC6464b.m11806i(cls, abstractC6446m, this._property);
        AbstractC6464b abstractC6464b2 = dVarM11806i.f10632b;
        if (abstractC6464b != abstractC6464b2) {
            this._dynamicValueSerializers = abstractC6464b2;
        }
        return dVarM11806i.f10631a;
    }

    public MapSerializer withContentInclusion(Object obj, boolean z11) {
        if (obj == this._suppressableValue && z11 == this._suppressNulls) {
            return this;
        }
        _ensureOverride("withContentInclusion");
        return new MapSerializer(this, this._valueTypeSerializer, obj, z11);
    }

    public MapSerializer withResolved(BeanProperty beanProperty, AbstractC6393h<?> abstractC6393h, AbstractC6393h<?> abstractC6393h2, Set<String> set, Set<String> set2, boolean z11) {
        _ensureOverride("withResolved");
        MapSerializer mapSerializer = new MapSerializer(this, beanProperty, abstractC6393h, abstractC6393h2, set, set2);
        return z11 != mapSerializer._sortKeys ? new MapSerializer(mapSerializer, this._filterId, z11) : mapSerializer;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.MapSerializer$a */
    public static /* synthetic */ class C6472a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10654a;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f10654a = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10654a[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10654a[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10654a[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10654a[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10654a[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Deprecated
    public void _ensureOverride() {
        _ensureOverride("N/A");
    }

    public boolean _hasNullKey(Map<?, ?> map) {
        return (map instanceof HashMap) && map.containsKey(null);
    }

    public Map<?, ?> _orderEntries(Map<?, ?> map, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        if (map instanceof SortedMap) {
            return map;
        }
        if (!_hasNullKey(map)) {
            return new TreeMap(map);
        }
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                _writeNullKeyedEntry(jsonGenerator, abstractC6446m, entry.getValue());
            } else {
                treeMap.put(key, entry.getValue());
            }
        }
        return treeMap;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public MapSerializer _withValueTypeSerializer(AbstractC6431e abstractC6431e) {
        if (this._valueTypeSerializer == abstractC6431e) {
            return this;
        }
        _ensureOverride("_withValueTypeSerializer");
        return new MapSerializer(this, abstractC6431e, this._suppressableValue, this._suppressNulls);
    }

    public void _writeNullKeyedEntry(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, Object obj) throws IOException {
        AbstractC6393h<Object> abstractC6393hM11832a;
        AbstractC6393h<Object> abstractC6393hFindNullKeySerializer = abstractC6446m.findNullKeySerializer(this._keyType, this._property);
        if (obj != null) {
            abstractC6393hM11832a = this._valueSerializer;
            if (abstractC6393hM11832a == null) {
                abstractC6393hM11832a = m11832a(abstractC6446m, obj);
            }
            Object obj2 = this._suppressableValue;
            if (obj2 == MARKER_FOR_EMPTY) {
                if (abstractC6393hM11832a.isEmpty(abstractC6446m, obj)) {
                    return;
                }
            } else if (obj2 != null && obj2.equals(obj)) {
                return;
            }
        } else if (this._suppressNulls) {
            return;
        } else {
            abstractC6393hM11832a = abstractC6446m.getDefaultNullValueSerializer();
        }
        try {
            abstractC6393hFindNullKeySerializer.serialize(null, jsonGenerator, abstractC6446m);
            abstractC6393hM11832a.serialize(obj, jsonGenerator, abstractC6446m);
        } catch (Exception e11) {
            wrapAndThrow(abstractC6446m, e11, obj, "");
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public AbstractC6393h<?> getContentSerializer() {
        return this._valueSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JavaType getContentType() {
        return this._valueType;
    }

    public AbstractC6393h<?> getKeySerializer() {
        return this._keySerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
    public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) {
        return createSchemaNode("object", true);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Map<?, ?> map) {
        return map.size() == 1;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean isEmpty(AbstractC6446m abstractC6446m, Map<?, ?> map) {
        if (map.isEmpty()) {
            return true;
        }
        Object obj = this._suppressableValue;
        if (obj == null && !this._suppressNulls) {
            return false;
        }
        AbstractC6393h<Object> abstractC6393h = this._valueSerializer;
        boolean z11 = MARKER_FOR_EMPTY == obj;
        if (abstractC6393h != null) {
            for (Object obj2 : map.values()) {
                if (obj2 == null) {
                    if (!this._suppressNulls) {
                        return false;
                    }
                } else if (z11) {
                    if (!abstractC6393h.isEmpty(abstractC6446m, obj2)) {
                        return false;
                    }
                } else if (obj == null || !obj.equals(map)) {
                    return false;
                }
            }
            return true;
        }
        for (Object obj3 : map.values()) {
            if (obj3 != null) {
                try {
                    AbstractC6393h<Object> abstractC6393hM11832a = m11832a(abstractC6446m, obj3);
                    if (z11) {
                        if (!abstractC6393hM11832a.isEmpty(abstractC6446m, obj3)) {
                            return false;
                        }
                    } else if (obj == null || !obj.equals(map)) {
                        return false;
                    }
                } catch (DatabindException unused) {
                }
            } else if (!this._suppressNulls) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(Map<?, ?> map, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        jsonGenerator.mo10852z0(map);
        serializeWithoutTypeInfo(map, jsonGenerator, abstractC6446m);
        jsonGenerator.mo10806X();
    }

    public void serializeFields(Map<?, ?> map, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        Object obj = null;
        if (this._valueTypeSerializer != null) {
            serializeTypedFields(map, jsonGenerator, abstractC6446m, null);
            return;
        }
        AbstractC6393h<Object> abstractC6393h = this._keySerializer;
        try {
            Object key = null;
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                try {
                    Object value = entry.getValue();
                    key = entry.getKey();
                    if (key == null) {
                        abstractC6446m.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, abstractC6446m);
                    } else {
                        IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
                        if (checker == null || !checker.shouldIgnore(key)) {
                            abstractC6393h.serialize(key, jsonGenerator, abstractC6446m);
                        }
                    }
                    if (value == null) {
                        abstractC6446m.defaultSerializeNull(jsonGenerator);
                    } else {
                        AbstractC6393h<Object> abstractC6393hM11832a = this._valueSerializer;
                        if (abstractC6393hM11832a == null) {
                            abstractC6393hM11832a = m11832a(abstractC6446m, value);
                        }
                        abstractC6393hM11832a.serialize(value, jsonGenerator, abstractC6446m);
                    }
                } catch (Exception e11) {
                    e = e11;
                    obj = key;
                    wrapAndThrow(abstractC6446m, e, map, String.valueOf(obj));
                    return;
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    public void serializeFieldsUsing(Map<?, ?> map, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6393h<Object> abstractC6393h) throws IOException {
        AbstractC6393h<Object> abstractC6393h2 = this._keySerializer;
        AbstractC6431e abstractC6431e = this._valueTypeSerializer;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(key)) {
                if (key == null) {
                    abstractC6446m.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, abstractC6446m);
                } else {
                    abstractC6393h2.serialize(key, jsonGenerator, abstractC6446m);
                }
                Object value = entry.getValue();
                if (value == null) {
                    abstractC6446m.defaultSerializeNull(jsonGenerator);
                } else if (abstractC6431e == null) {
                    try {
                        abstractC6393h.serialize(value, jsonGenerator, abstractC6446m);
                    } catch (Exception e11) {
                        wrapAndThrow(abstractC6446m, e11, map, String.valueOf(key));
                    }
                } else {
                    abstractC6393h.serializeWithType(value, jsonGenerator, abstractC6446m, abstractC6431e);
                }
            }
        }
    }

    public void serializeFilteredAnyProperties(AbstractC6446m abstractC6446m, JsonGenerator jsonGenerator, Object obj, Map<?, ?> map, InterfaceC6458g interfaceC6458g, Object obj2) throws IOException {
        AbstractC6393h<Object> defaultNullValueSerializer;
        MapProperty mapProperty = new MapProperty(this._valueTypeSerializer, this._property);
        boolean z11 = MARKER_FOR_EMPTY == obj2;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(key)) {
                AbstractC6393h<Object> abstractC6393hFindNullKeySerializer = key == null ? abstractC6446m.findNullKeySerializer(this._keyType, this._property) : this._keySerializer;
                Object value = entry.getValue();
                if (value != null) {
                    defaultNullValueSerializer = this._valueSerializer;
                    if (defaultNullValueSerializer == null) {
                        defaultNullValueSerializer = m11832a(abstractC6446m, value);
                    }
                    if (z11) {
                        if (!defaultNullValueSerializer.isEmpty(abstractC6446m, value)) {
                            mapProperty.reset(key, value, abstractC6393hFindNullKeySerializer, defaultNullValueSerializer);
                            interfaceC6458g.m11775a(obj, jsonGenerator, abstractC6446m, mapProperty);
                        }
                    } else if (obj2 == null || !obj2.equals(value)) {
                        mapProperty.reset(key, value, abstractC6393hFindNullKeySerializer, defaultNullValueSerializer);
                        interfaceC6458g.m11775a(obj, jsonGenerator, abstractC6446m, mapProperty);
                    }
                } else if (!this._suppressNulls) {
                    defaultNullValueSerializer = abstractC6446m.getDefaultNullValueSerializer();
                    mapProperty.reset(key, value, abstractC6393hFindNullKeySerializer, defaultNullValueSerializer);
                    try {
                        interfaceC6458g.m11775a(obj, jsonGenerator, abstractC6446m, mapProperty);
                    } catch (Exception e11) {
                        wrapAndThrow(abstractC6446m, e11, map, String.valueOf(key));
                    }
                }
            }
        }
    }

    public void serializeFilteredFields(Map<?, ?> map, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, InterfaceC6458g interfaceC6458g, Object obj) throws IOException {
        AbstractC6393h<Object> defaultNullValueSerializer;
        MapProperty mapProperty = new MapProperty(this._valueTypeSerializer, this._property);
        boolean z11 = MARKER_FOR_EMPTY == obj;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(key)) {
                AbstractC6393h<Object> abstractC6393hFindNullKeySerializer = key == null ? abstractC6446m.findNullKeySerializer(this._keyType, this._property) : this._keySerializer;
                Object value = entry.getValue();
                if (value != null) {
                    defaultNullValueSerializer = this._valueSerializer;
                    if (defaultNullValueSerializer == null) {
                        defaultNullValueSerializer = m11832a(abstractC6446m, value);
                    }
                    if (z11) {
                        if (!defaultNullValueSerializer.isEmpty(abstractC6446m, value)) {
                            mapProperty.reset(key, value, abstractC6393hFindNullKeySerializer, defaultNullValueSerializer);
                            interfaceC6458g.m11775a(map, jsonGenerator, abstractC6446m, mapProperty);
                        }
                    } else if (obj == null || !obj.equals(value)) {
                        mapProperty.reset(key, value, abstractC6393hFindNullKeySerializer, defaultNullValueSerializer);
                        interfaceC6458g.m11775a(map, jsonGenerator, abstractC6446m, mapProperty);
                    }
                } else if (!this._suppressNulls) {
                    defaultNullValueSerializer = abstractC6446m.getDefaultNullValueSerializer();
                    mapProperty.reset(key, value, abstractC6393hFindNullKeySerializer, defaultNullValueSerializer);
                    try {
                        interfaceC6458g.m11775a(map, jsonGenerator, abstractC6446m, mapProperty);
                    } catch (Exception e11) {
                        wrapAndThrow(abstractC6446m, e11, map, String.valueOf(key));
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0069 A[EXC_TOP_SPLITTER, PHI: r5
      0x0069: PHI (r5v3 com.fasterxml.jackson.databind.h<java.lang.Object>) = 
      (r5v2 com.fasterxml.jackson.databind.h<java.lang.Object>)
      (r5v5 com.fasterxml.jackson.databind.h<java.lang.Object>)
      (r5v5 com.fasterxml.jackson.databind.h<java.lang.Object>)
      (r5v5 com.fasterxml.jackson.databind.h<java.lang.Object>)
     binds: [B:27:0x004a, B:33:0x005d, B:35:0x0060, B:37:0x0066] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public void serializeOptionalFields(Map<?, ?> map, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, Object obj) throws IOException {
        AbstractC6393h<Object> abstractC6393hFindNullKeySerializer;
        AbstractC6393h<Object> defaultNullValueSerializer;
        if (this._valueTypeSerializer != null) {
            serializeTypedFields(map, jsonGenerator, abstractC6446m, obj);
            return;
        }
        boolean z11 = MARKER_FOR_EMPTY == obj;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                abstractC6393hFindNullKeySerializer = abstractC6446m.findNullKeySerializer(this._keyType, this._property);
            } else {
                IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
                if (checker == null || !checker.shouldIgnore(key)) {
                    abstractC6393hFindNullKeySerializer = this._keySerializer;
                }
            }
            Object value = entry.getValue();
            if (value != null) {
                defaultNullValueSerializer = this._valueSerializer;
                if (defaultNullValueSerializer == null) {
                    defaultNullValueSerializer = m11832a(abstractC6446m, value);
                }
                if (z11) {
                    if (!defaultNullValueSerializer.isEmpty(abstractC6446m, value)) {
                        abstractC6393hFindNullKeySerializer.serialize(key, jsonGenerator, abstractC6446m);
                        defaultNullValueSerializer.serialize(value, jsonGenerator, abstractC6446m);
                    }
                } else if (obj == null || !obj.equals(value)) {
                    abstractC6393hFindNullKeySerializer.serialize(key, jsonGenerator, abstractC6446m);
                    defaultNullValueSerializer.serialize(value, jsonGenerator, abstractC6446m);
                }
            } else if (!this._suppressNulls) {
                defaultNullValueSerializer = abstractC6446m.getDefaultNullValueSerializer();
                try {
                    abstractC6393hFindNullKeySerializer.serialize(key, jsonGenerator, abstractC6446m);
                    defaultNullValueSerializer.serialize(value, jsonGenerator, abstractC6446m);
                } catch (Exception e11) {
                    wrapAndThrow(abstractC6446m, e11, map, String.valueOf(key));
                }
            }
        }
    }

    public void serializeTypedFields(Map<?, ?> map, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, Object obj) throws IOException {
        AbstractC6393h<Object> abstractC6393hFindNullKeySerializer;
        AbstractC6393h<Object> defaultNullValueSerializer;
        boolean z11 = MARKER_FOR_EMPTY == obj;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                abstractC6393hFindNullKeySerializer = abstractC6446m.findNullKeySerializer(this._keyType, this._property);
            } else {
                IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
                if (checker == null || !checker.shouldIgnore(key)) {
                    abstractC6393hFindNullKeySerializer = this._keySerializer;
                }
            }
            Object value = entry.getValue();
            if (value != null) {
                defaultNullValueSerializer = this._valueSerializer;
                if (defaultNullValueSerializer == null) {
                    defaultNullValueSerializer = m11832a(abstractC6446m, value);
                }
                if (z11) {
                    if (!defaultNullValueSerializer.isEmpty(abstractC6446m, value)) {
                        abstractC6393hFindNullKeySerializer.serialize(key, jsonGenerator, abstractC6446m);
                        defaultNullValueSerializer.serializeWithType(value, jsonGenerator, abstractC6446m, this._valueTypeSerializer);
                    }
                } else if (obj == null || !obj.equals(value)) {
                    abstractC6393hFindNullKeySerializer.serialize(key, jsonGenerator, abstractC6446m);
                    defaultNullValueSerializer.serializeWithType(value, jsonGenerator, abstractC6446m, this._valueTypeSerializer);
                }
            } else if (!this._suppressNulls) {
                defaultNullValueSerializer = abstractC6446m.getDefaultNullValueSerializer();
                abstractC6393hFindNullKeySerializer.serialize(key, jsonGenerator, abstractC6446m);
                try {
                    defaultNullValueSerializer.serializeWithType(value, jsonGenerator, abstractC6446m, this._valueTypeSerializer);
                } catch (Exception e11) {
                    wrapAndThrow(abstractC6446m, e11, map, String.valueOf(key));
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public void serializeWithType(Map<?, ?> map, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        jsonGenerator.mo10848x(map);
        WritableTypeId writableTypeIdMo11695g = abstractC6431e.mo11695g(jsonGenerator, abstractC6431e.m11692d(map, JsonToken.START_OBJECT));
        serializeWithoutTypeInfo(map, jsonGenerator, abstractC6446m);
        abstractC6431e.mo11696h(jsonGenerator, writableTypeIdMo11695g);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public MapSerializer withFilterId(Object obj) {
        if (this._filterId == obj) {
            return this;
        }
        _ensureOverride("withFilterId");
        return new MapSerializer(this, obj, this._sortKeys);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC6393h<Object> m11832a(AbstractC6446m abstractC6446m, Object obj) throws JsonMappingException {
        Class<?> cls = obj.getClass();
        AbstractC6393h<Object> abstractC6393hMo11808k = this._dynamicValueSerializers.mo11808k(cls);
        if (abstractC6393hMo11808k != null) {
            return abstractC6393hMo11808k;
        }
        if (this._valueType.hasGenericTypes()) {
            return _findAndAddDynamic(this._dynamicValueSerializers, abstractC6446m.constructSpecializedType(this._valueType, cls), abstractC6446m);
        }
        return _findAndAddDynamic(this._dynamicValueSerializers, cls, abstractC6446m);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        interfaceC43399e.mo95578e(javaType);
    }

    @Override // com.fasterxml.jackson.databind.ser.InterfaceC6455d
    public AbstractC6393h<?> createContextual(AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        AnnotatedMember member;
        AbstractC6393h<?> abstractC6393hSerializerInstance;
        AbstractC6393h<Object> abstractC6393hSerializerInstance2;
        AbstractC6393h<?> abstractC6393hHandleSecondaryContextualization;
        boolean zBooleanValue;
        JsonInclude.Include contentInclusion;
        Object objFindFilterId;
        Boolean feature;
        AnnotationIntrospector annotationIntrospector = abstractC6446m.getAnnotationIntrospector();
        Object objM11895b = null;
        if (beanProperty == null) {
            member = null;
        } else {
            member = beanProperty.getMember();
        }
        if (StdSerializer._neitherNull(member, annotationIntrospector)) {
            Object objFindKeySerializer = annotationIntrospector.findKeySerializer(member);
            if (objFindKeySerializer != null) {
                abstractC6393hSerializerInstance = abstractC6446m.serializerInstance(member, objFindKeySerializer);
            } else {
                abstractC6393hSerializerInstance = null;
            }
            Object objFindContentSerializer = annotationIntrospector.findContentSerializer(member);
            if (objFindContentSerializer != null) {
                abstractC6393hSerializerInstance2 = abstractC6446m.serializerInstance(member, objFindContentSerializer);
            } else {
                abstractC6393hSerializerInstance2 = null;
            }
        } else {
            abstractC6393hSerializerInstance = null;
            abstractC6393hSerializerInstance2 = null;
        }
        if (abstractC6393hSerializerInstance2 == null) {
            abstractC6393hSerializerInstance2 = this._valueSerializer;
        }
        AbstractC6393h<?> abstractC6393hFindContextualConvertingSerializer = findContextualConvertingSerializer(abstractC6446m, beanProperty, abstractC6393hSerializerInstance2);
        if (abstractC6393hFindContextualConvertingSerializer == null && this._valueTypeIsStatic && !this._valueType.isJavaLangObject()) {
            abstractC6393hFindContextualConvertingSerializer = abstractC6446m.findContentValueSerializer(this._valueType, beanProperty);
        }
        AbstractC6393h<?> abstractC6393h = abstractC6393hFindContextualConvertingSerializer;
        if (abstractC6393hSerializerInstance == null) {
            abstractC6393hSerializerInstance = this._keySerializer;
        }
        if (abstractC6393hSerializerInstance == null) {
            abstractC6393hHandleSecondaryContextualization = abstractC6446m.findKeySerializer(this._keyType, beanProperty);
        } else {
            abstractC6393hHandleSecondaryContextualization = abstractC6446m.handleSecondaryContextualization(abstractC6393hSerializerInstance, beanProperty);
        }
        AbstractC6393h<?> abstractC6393h2 = abstractC6393hHandleSecondaryContextualization;
        Set<String> hashSet = this._ignoredEntries;
        Set<String> hashSet2 = this._includedEntries;
        boolean zIncludeFilterSuppressNulls = false;
        if (StdSerializer._neitherNull(member, annotationIntrospector)) {
            SerializationConfig config = abstractC6446m.getConfig();
            Set<String> setFindIgnoredForSerialization = annotationIntrospector.findPropertyIgnoralByName(config, member).findIgnoredForSerialization();
            if (StdSerializer._nonEmpty(setFindIgnoredForSerialization)) {
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                } else {
                    hashSet = new HashSet(hashSet);
                }
                Iterator<String> it = setFindIgnoredForSerialization.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next());
                }
            }
            Set<String> included = annotationIntrospector.findPropertyInclusionByName(config, member).getIncluded();
            if (included != null) {
                if (hashSet2 == null) {
                    hashSet2 = new HashSet<>();
                } else {
                    hashSet2 = new HashSet(hashSet2);
                }
                Iterator<String> it2 = included.iterator();
                while (it2.hasNext()) {
                    hashSet2.add(it2.next());
                }
            }
            zBooleanValue = Boolean.TRUE.equals(annotationIntrospector.findSerializationSortAlphabetically(member));
        } else {
            zBooleanValue = false;
        }
        Set<String> set = hashSet;
        Set<String> set2 = hashSet2;
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(abstractC6446m, beanProperty, Map.class);
        if (valueFindFormatOverrides != null && (feature = valueFindFormatOverrides.getFeature(JsonFormat.Feature.WRITE_SORTED_MAP_ENTRIES)) != null) {
            zBooleanValue = feature.booleanValue();
        }
        MapSerializer mapSerializerWithResolved = withResolved(beanProperty, abstractC6393h2, abstractC6393h, set, set2, zBooleanValue);
        if (member != null && (objFindFilterId = annotationIntrospector.findFilterId(member)) != null) {
            mapSerializerWithResolved = mapSerializerWithResolved.withFilterId(objFindFilterId);
        }
        JsonInclude.Value valueFindIncludeOverrides = findIncludeOverrides(abstractC6446m, beanProperty, Map.class);
        if (valueFindIncludeOverrides != null && (contentInclusion = valueFindIncludeOverrides.getContentInclusion()) != JsonInclude.Include.USE_DEFAULTS) {
            int i11 = C6472a.f10654a[contentInclusion.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                            }
                        } else {
                            objM11895b = abstractC6446m.includeFilterInstance(null, valueFindIncludeOverrides.getContentFilter());
                            if (objM11895b != null) {
                                zIncludeFilterSuppressNulls = abstractC6446m.includeFilterSuppressNulls(objM11895b);
                            }
                        }
                        return mapSerializerWithResolved.withContentInclusion(objM11895b, zIncludeFilterSuppressNulls);
                    }
                    objM11895b = MARKER_FOR_EMPTY;
                } else if (this._valueType.isReferenceType()) {
                    objM11895b = MARKER_FOR_EMPTY;
                }
            } else {
                objM11895b = C6487d.m11895b(this._valueType);
                if (objM11895b != null && objM11895b.getClass().isArray()) {
                    objM11895b = C6485b.m11877b(objM11895b);
                }
            }
            zIncludeFilterSuppressNulls = true;
            return mapSerializerWithResolved.withContentInclusion(objM11895b, zIncludeFilterSuppressNulls);
        }
        return mapSerializerWithResolved;
    }

    public void serializeWithoutTypeInfo(Map<?, ?> map, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        InterfaceC6458g interfaceC6458gFindPropertyFilter;
        if (!map.isEmpty()) {
            if (this._sortKeys || abstractC6446m.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS)) {
                map = _orderEntries(map, jsonGenerator, abstractC6446m);
            }
            Map<?, ?> map2 = map;
            Object obj = this._filterId;
            if (obj != null && (interfaceC6458gFindPropertyFilter = findPropertyFilter(abstractC6446m, obj, map2)) != null) {
                serializeFilteredFields(map2, jsonGenerator, abstractC6446m, interfaceC6458gFindPropertyFilter, this._suppressableValue);
                return;
            }
            Object obj2 = this._suppressableValue;
            if (obj2 == null && !this._suppressNulls) {
                AbstractC6393h<Object> abstractC6393h = this._valueSerializer;
                if (abstractC6393h != null) {
                    serializeFieldsUsing(map2, jsonGenerator, abstractC6446m, abstractC6393h);
                    return;
                } else {
                    serializeFields(map2, jsonGenerator, abstractC6446m);
                    return;
                }
            }
            serializeOptionalFields(map2, jsonGenerator, abstractC6446m, obj2);
        }
    }

    @Deprecated
    public MapSerializer withContentInclusion(Object obj) {
        return new MapSerializer(this, this._valueTypeSerializer, obj, this._suppressNulls);
    }

    public final AbstractC6393h<Object> _findAndAddDynamic(AbstractC6464b abstractC6464b, JavaType javaType, AbstractC6446m abstractC6446m) throws JsonMappingException {
        AbstractC6464b.d dVarM11805h = abstractC6464b.m11805h(javaType, abstractC6446m, this._property);
        AbstractC6464b abstractC6464b2 = dVarM11805h.f10632b;
        if (abstractC6464b != abstractC6464b2) {
            this._dynamicValueSerializers = abstractC6464b2;
        }
        return dVarM11805h.f10631a;
    }

    public MapSerializer withResolved(BeanProperty beanProperty, AbstractC6393h<?> abstractC6393h, AbstractC6393h<?> abstractC6393h2, Set<String> set, boolean z11) {
        return withResolved(beanProperty, abstractC6393h, abstractC6393h2, set, null, z11);
    }

    public static MapSerializer construct(Set<String> set, JavaType javaType, boolean z11, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h, AbstractC6393h<Object> abstractC6393h2, Object obj) {
        return construct(set, null, javaType, z11, abstractC6431e, abstractC6393h, abstractC6393h2, obj);
    }

    @Deprecated
    public static MapSerializer construct(String[] strArr, JavaType javaType, boolean z11, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h, AbstractC6393h<Object> abstractC6393h2, Object obj) {
        return construct(C6485b.m11876a(strArr), javaType, z11, abstractC6431e, abstractC6393h, abstractC6393h2, obj);
    }

    @Deprecated
    public MapSerializer(Set<String> set, JavaType javaType, JavaType javaType2, boolean z11, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, AbstractC6393h<?> abstractC6393h2) {
        this(set, null, javaType, javaType2, z11, abstractC6431e, abstractC6393h, abstractC6393h2);
    }

    public MapSerializer(MapSerializer mapSerializer, BeanProperty beanProperty, AbstractC6393h<?> abstractC6393h, AbstractC6393h<?> abstractC6393h2, Set<String> set, Set<String> set2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this._ignoredEntries = set;
        this._includedEntries = set2;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = abstractC6393h;
        this._valueSerializer = abstractC6393h2;
        this._dynamicValueSerializers = AbstractC6464b.m11798c();
        this._property = beanProperty;
        this._filterId = mapSerializer._filterId;
        this._sortKeys = mapSerializer._sortKeys;
        this._suppressableValue = mapSerializer._suppressableValue;
        this._suppressNulls = mapSerializer._suppressNulls;
        this._inclusionChecker = IgnorePropertiesUtil.m11866a(set, set2);
    }

    @Deprecated
    public MapSerializer(MapSerializer mapSerializer, BeanProperty beanProperty, AbstractC6393h<?> abstractC6393h, AbstractC6393h<?> abstractC6393h2, Set<String> set) {
        this(mapSerializer, beanProperty, abstractC6393h, abstractC6393h2, set, null);
    }

    public MapSerializer(MapSerializer mapSerializer, AbstractC6431e abstractC6431e, Object obj, boolean z11) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._includedEntries = mapSerializer._includedEntries;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = abstractC6431e;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = mapSerializer._dynamicValueSerializers;
        this._property = mapSerializer._property;
        this._filterId = mapSerializer._filterId;
        this._sortKeys = mapSerializer._sortKeys;
        this._suppressableValue = obj;
        this._suppressNulls = z11;
        this._inclusionChecker = mapSerializer._inclusionChecker;
    }

    public MapSerializer(MapSerializer mapSerializer, Object obj, boolean z11) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._includedEntries = mapSerializer._includedEntries;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = AbstractC6464b.m11798c();
        this._property = mapSerializer._property;
        this._filterId = obj;
        this._sortKeys = z11;
        this._suppressableValue = mapSerializer._suppressableValue;
        this._suppressNulls = mapSerializer._suppressNulls;
        this._inclusionChecker = mapSerializer._inclusionChecker;
    }

    @Deprecated
    public MapSerializer(MapSerializer mapSerializer, AbstractC6431e abstractC6431e, Object obj) {
        this(mapSerializer, abstractC6431e, obj, false);
    }
}
