package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.InterfaceC6392g;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.AbstractC6404a;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.C6406c;
import com.fasterxml.jackson.databind.introspect.C6413j;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6430d;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSetSerializer;
import com.fasterxml.jackson.databind.ser.std.InetAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.IterableSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.C6485b;
import com.fasterxml.jackson.databind.util.C6487d;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.C6499p;
import com.fasterxml.jackson.databind.util.InterfaceC6491h;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes45.dex */
public abstract class BasicSerializerFactory extends AbstractC6468j implements Serializable {
    protected static final HashMap<String, AbstractC6393h<?>> _concrete;
    protected static final HashMap<String, Class<? extends AbstractC6393h<?>>> _concreteLazy;
    protected final SerializerFactoryConfig _factoryConfig;

    public AbstractC6393h<?> buildCollectionSerializer(AbstractC6446m abstractC6446m, CollectionType collectionType, AbstractC6340b abstractC6340b, boolean z11, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h) throws JsonMappingException {
        CollectionType collectionType2;
        AbstractC6340b abstractC6340b2;
        AbstractC6431e abstractC6431e2;
        AbstractC6393h<Object> abstractC6393h2;
        AbstractC6393h<?> abstractC6393hBuildIndexedListSerializer;
        SerializationConfig config = abstractC6446m.getConfig();
        Iterator<InterfaceC6469k> it = customSerializers().iterator();
        AbstractC6393h<?> abstractC6393hM11762d = null;
        while (true) {
            if (!it.hasNext()) {
                collectionType2 = collectionType;
                abstractC6340b2 = abstractC6340b;
                abstractC6431e2 = abstractC6431e;
                abstractC6393h2 = abstractC6393h;
                break;
            }
            collectionType2 = collectionType;
            abstractC6340b2 = abstractC6340b;
            abstractC6431e2 = abstractC6431e;
            abstractC6393h2 = abstractC6393h;
            abstractC6393hM11762d = it.next().m11829g(config, collectionType2, abstractC6340b2, abstractC6431e2, abstractC6393h2);
            if (abstractC6393hM11762d != null) {
                break;
            }
            collectionType = collectionType2;
            abstractC6340b = abstractC6340b2;
            abstractC6431e = abstractC6431e2;
            abstractC6393h = abstractC6393h2;
        }
        if (abstractC6393hM11762d == null && (abstractC6393hM11762d = findSerializerByAnnotations(abstractC6446m, collectionType2, abstractC6340b2)) == null) {
            if (abstractC6340b2.mo11161g(null).getShape() == JsonFormat.Shape.OBJECT) {
                return null;
            }
            Class<?> rawClass = collectionType2.getRawClass();
            if (EnumSet.class.isAssignableFrom(rawClass)) {
                JavaType contentType = collectionType2.getContentType();
                abstractC6393hM11762d = buildEnumSetSerializer(contentType.isEnumImplType() ? contentType : null);
            } else {
                Class<?> rawClass2 = collectionType2.getContentType().getRawClass();
                if (isIndexedList(rawClass)) {
                    if (rawClass2 != String.class) {
                        abstractC6393hBuildIndexedListSerializer = buildIndexedListSerializer(collectionType2.getContentType(), z11, abstractC6431e2, abstractC6393h2);
                    } else if (C6490g.m11912O(abstractC6393h2)) {
                        abstractC6393hBuildIndexedListSerializer = IndexedStringListSerializer.instance;
                    }
                    abstractC6393hM11762d = abstractC6393hBuildIndexedListSerializer;
                } else if (rawClass2 == String.class && C6490g.m11912O(abstractC6393h2)) {
                    abstractC6393hBuildIndexedListSerializer = StringCollectionSerializer.instance;
                    abstractC6393hM11762d = abstractC6393hBuildIndexedListSerializer;
                }
                if (abstractC6393hM11762d == null) {
                    abstractC6393hM11762d = buildCollectionSerializer(collectionType2.getContentType(), z11, abstractC6431e2, abstractC6393h2);
                }
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<AbstractC6454c> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                abstractC6393hM11762d = it2.next().m11762d(config, collectionType2, abstractC6340b2, abstractC6393hM11762d);
            }
        }
        return abstractC6393hM11762d;
    }

    public AbstractC6393h<?> buildEnumSerializer(SerializationConfig serializationConfig, JavaType javaType, AbstractC6340b abstractC6340b) throws JsonMappingException {
        JsonFormat.Value valueMo11161g = abstractC6340b.mo11161g(null);
        if (valueMo11161g.getShape() == JsonFormat.Shape.OBJECT) {
            ((C6413j) abstractC6340b).m11527O("declaringClass");
            return null;
        }
        AbstractC6393h<?> abstractC6393hConstruct = EnumSerializer.construct(javaType.getRawClass(), serializationConfig, abstractC6340b, valueMo11161g);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<AbstractC6454c> it = this._factoryConfig.serializerModifiers().iterator();
            while (it.hasNext()) {
                abstractC6393hConstruct = it.next().m11763e(serializationConfig, javaType, abstractC6340b, abstractC6393hConstruct);
            }
        }
        return abstractC6393hConstruct;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007f A[PHI: r2
      0x007f: PHI (r2v7 com.fasterxml.jackson.databind.h<java.lang.Object>) = (r2v6 com.fasterxml.jackson.databind.h<java.lang.Object>), (r2v9 com.fasterxml.jackson.databind.h<java.lang.Object>) binds: [B:13:0x003a, B:16:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.ser.AbstractC6468j
    public AbstractC6393h<Object> createKeySerializer(AbstractC6446m abstractC6446m, JavaType javaType, AbstractC6393h<Object> abstractC6393h) throws JsonMappingException {
        AbstractC6393h<?> abstractC6393hM11824b;
        SerializationConfig config = abstractC6446m.getConfig();
        AbstractC6340b abstractC6340bIntrospect = config.introspect(javaType);
        if (this._factoryConfig.hasKeySerializers()) {
            Iterator<InterfaceC6469k> it = this._factoryConfig.keySerializers().iterator();
            abstractC6393hM11824b = null;
            while (it.hasNext() && (abstractC6393hM11824b = it.next().m11824b(config, javaType, abstractC6340bIntrospect)) == null) {
            }
        } else {
            abstractC6393hM11824b = null;
        }
        if (abstractC6393hM11824b == null) {
            AbstractC6393h<Object> abstractC6393h_findKeySerializer = _findKeySerializer(abstractC6446m, abstractC6340bIntrospect.mo11174t());
            if (abstractC6393h_findKeySerializer != null) {
                abstractC6393h = abstractC6393h_findKeySerializer;
            } else if (abstractC6393h == null) {
                abstractC6393h_findKeySerializer = StdKeySerializers.m11840b(config, javaType.getRawClass(), false);
                if (abstractC6393h_findKeySerializer == null) {
                    AnnotatedMember annotatedMemberMo11163i = abstractC6340bIntrospect.mo11163i();
                    if (annotatedMemberMo11163i == null) {
                        annotatedMemberMo11163i = abstractC6340bIntrospect.mo11164j();
                    }
                    if (annotatedMemberMo11163i != null) {
                        AbstractC6393h<Object> abstractC6393hCreateKeySerializer = createKeySerializer(abstractC6446m, annotatedMemberMo11163i.getType(), abstractC6393h);
                        if (config.canOverrideAccessModifiers()) {
                            C6490g.m11936g(annotatedMemberMo11163i.getMember(), config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                        }
                        abstractC6393h = new JsonValueSerializer(annotatedMemberMo11163i, null, abstractC6393hCreateKeySerializer);
                    } else {
                        abstractC6393h = StdKeySerializers.m11839a(config, javaType.getRawClass());
                    }
                } else {
                    abstractC6393h = abstractC6393h_findKeySerializer;
                }
            }
        } else {
            abstractC6393h = abstractC6393hM11824b;
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<AbstractC6454c> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                abstractC6393h = it2.next().m11764f(config, javaType, abstractC6340bIntrospect, abstractC6393h);
            }
        }
        return abstractC6393h;
    }

    @Override // com.fasterxml.jackson.databind.ser.AbstractC6468j
    public abstract AbstractC6393h<Object> createSerializer(AbstractC6446m abstractC6446m, JavaType javaType) throws JsonMappingException;

    public abstract Iterable<InterfaceC6469k> customSerializers();

    public boolean usesStaticTyping(SerializationConfig serializationConfig, AbstractC6340b abstractC6340b, AbstractC6431e abstractC6431e) {
        if (abstractC6431e != null) {
            return false;
        }
        JsonSerialize.Typing typingFindSerializationTyping = serializationConfig.getAnnotationIntrospector().findSerializationTyping(abstractC6340b.mo11174t());
        if (typingFindSerializationTyping == null || typingFindSerializationTyping == JsonSerialize.Typing.DEFAULT_TYPING) {
            return serializationConfig.isEnabled(MapperFeature.USE_STATIC_TYPING);
        }
        return typingFindSerializationTyping == JsonSerialize.Typing.STATIC;
    }

    public abstract AbstractC6468j withConfig(SerializerFactoryConfig serializerFactoryConfig);

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.BasicSerializerFactory$a */
    public static /* synthetic */ class C6451a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10590a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f10591b;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f10591b = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10591b[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10591b[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10591b[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10591b[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10591b[JsonInclude.Include.USE_DEFAULTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[JsonFormat.Shape.values().length];
            f10590a = iArr2;
            try {
                iArr2[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10590a[JsonFormat.Shape.OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10590a[JsonFormat.Shape.ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        HashMap<String, Class<? extends AbstractC6393h<?>>> map = new HashMap<>();
        HashMap<String, AbstractC6393h<?>> map2 = new HashMap<>();
        map2.put(String.class.getName(), new StringSerializer());
        ToStringSerializer toStringSerializer = ToStringSerializer.instance;
        map2.put(StringBuffer.class.getName(), toStringSerializer);
        map2.put(StringBuilder.class.getName(), toStringSerializer);
        map2.put(Character.class.getName(), toStringSerializer);
        map2.put(Character.TYPE.getName(), toStringSerializer);
        NumberSerializers.m11833a(map2);
        map2.put(Boolean.TYPE.getName(), new BooleanSerializer(true));
        map2.put(Boolean.class.getName(), new BooleanSerializer(false));
        map2.put(BigInteger.class.getName(), new NumberSerializer(BigInteger.class));
        map2.put(BigDecimal.class.getName(), new NumberSerializer(BigDecimal.class));
        map2.put(Calendar.class.getName(), CalendarSerializer.instance);
        map2.put(Date.class.getName(), DateSerializer.instance);
        for (Map.Entry<Class<?>, Object> entry : StdJdkSerializers.m11838a()) {
            Object value = entry.getValue();
            if (value instanceof AbstractC6393h) {
                map2.put(entry.getKey().getName(), (AbstractC6393h) value);
            } else {
                map.put(entry.getKey().getName(), (Class) value);
            }
        }
        map.put(C6499p.class.getName(), TokenBufferSerializer.class);
        _concrete = map2;
        _concreteLazy = map;
    }

    public AbstractC6393h<?> buildEnumSetSerializer(JavaType javaType) {
        return new EnumSetSerializer(javaType);
    }

    public ContainerSerializer<?> buildIndexedListSerializer(JavaType javaType, boolean z11, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h) {
        return new IndexedListSerializer(javaType, z11, abstractC6431e, abstractC6393h);
    }

    public AbstractC6393h<?> buildIterableSerializer(SerializationConfig serializationConfig, JavaType javaType, AbstractC6340b abstractC6340b, boolean z11, JavaType javaType2) throws JsonMappingException {
        return new IterableSerializer(javaType2, z11, createTypeSerializer(serializationConfig, javaType2));
    }

    public AbstractC6393h<?> buildIteratorSerializer(SerializationConfig serializationConfig, JavaType javaType, AbstractC6340b abstractC6340b, boolean z11, JavaType javaType2) throws JsonMappingException {
        return new IteratorSerializer(javaType2, z11, createTypeSerializer(serializationConfig, javaType2));
    }

    public AbstractC6393h<?> buildMapEntrySerializer(AbstractC6446m abstractC6446m, JavaType javaType, AbstractC6340b abstractC6340b, boolean z11, JavaType javaType2, JavaType javaType3) throws JsonMappingException {
        Object objM11895b = null;
        if (JsonFormat.Value.merge(abstractC6340b.mo11161g(null), abstractC6446m.getDefaultPropertyFormat(Map.Entry.class)).getShape() == JsonFormat.Shape.OBJECT) {
            return null;
        }
        MapEntrySerializer mapEntrySerializer = new MapEntrySerializer(javaType3, javaType2, javaType3, z11, createTypeSerializer(abstractC6446m.getConfig(), javaType3), null);
        JavaType contentType = mapEntrySerializer.getContentType();
        JsonInclude.Value value_findInclusionWithContent = _findInclusionWithContent(abstractC6446m, abstractC6340b, contentType, Map.Entry.class);
        JsonInclude.Include contentInclusion = value_findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : value_findInclusionWithContent.getContentInclusion();
        if (contentInclusion == JsonInclude.Include.USE_DEFAULTS || contentInclusion == JsonInclude.Include.ALWAYS) {
            return mapEntrySerializer;
        }
        int i11 = C6451a.f10591b[contentInclusion.ordinal()];
        boolean zIncludeFilterSuppressNulls = true;
        if (i11 == 1) {
            objM11895b = C6487d.m11895b(contentType);
            if (objM11895b != null && objM11895b.getClass().isArray()) {
                objM11895b = C6485b.m11877b(objM11895b);
            }
        } else if (i11 != 2) {
            if (i11 == 3) {
                objM11895b = MapSerializer.MARKER_FOR_EMPTY;
            } else if (i11 == 4 && (objM11895b = abstractC6446m.includeFilterInstance(null, value_findInclusionWithContent.getContentFilter())) != null) {
                zIncludeFilterSuppressNulls = abstractC6446m.includeFilterSuppressNulls(objM11895b);
            }
        } else if (contentType.isReferenceType()) {
            objM11895b = MapSerializer.MARKER_FOR_EMPTY;
        }
        return mapEntrySerializer.withContentInclusion(objM11895b, zIncludeFilterSuppressNulls);
    }

    public AbstractC6393h<?> buildMapSerializer(AbstractC6446m abstractC6446m, MapType mapType, AbstractC6340b abstractC6340b, boolean z11, AbstractC6393h<Object> abstractC6393h, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h2) throws JsonMappingException {
        if (abstractC6340b.mo11161g(null).getShape() == JsonFormat.Shape.OBJECT) {
            return null;
        }
        SerializationConfig config = abstractC6446m.getConfig();
        Iterator<InterfaceC6469k> it = customSerializers().iterator();
        AbstractC6393h<?> abstractC6393hM11766h = null;
        while (it.hasNext() && (abstractC6393hM11766h = it.next().m11827e(config, mapType, abstractC6340b, abstractC6393h, abstractC6431e, abstractC6393h2)) == null) {
        }
        if (abstractC6393hM11766h == null && (abstractC6393hM11766h = findSerializerByAnnotations(abstractC6446m, mapType, abstractC6340b)) == null) {
            Object objFindFilterId = findFilterId(config, abstractC6340b);
            JsonIgnoreProperties.Value defaultPropertyIgnorals = config.getDefaultPropertyIgnorals(Map.class, abstractC6340b.mo11174t());
            Set<String> setFindIgnoredForSerialization = defaultPropertyIgnorals == null ? null : defaultPropertyIgnorals.findIgnoredForSerialization();
            JsonIncludeProperties.Value defaultPropertyInclusions = config.getDefaultPropertyInclusions(Map.class, abstractC6340b.mo11174t());
            abstractC6393hM11766h = _checkMapContentInclusion(abstractC6446m, abstractC6340b, MapSerializer.construct(setFindIgnoredForSerialization, defaultPropertyInclusions != null ? defaultPropertyInclusions.getIncluded() : null, mapType, z11, abstractC6431e, abstractC6393h, abstractC6393h2, objFindFilterId));
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<AbstractC6454c> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                abstractC6393hM11766h = it2.next().m11766h(config, mapType, abstractC6340b, abstractC6393hM11766h);
            }
        }
        return abstractC6393hM11766h;
    }

    public AbstractC6393h<?> findOptionalStdSerializer(AbstractC6446m abstractC6446m, JavaType javaType, AbstractC6340b abstractC6340b, boolean z11) throws JsonMappingException {
        return OptionalHandlerFactory.instance.findSerializer(abstractC6446m.getConfig(), javaType, abstractC6340b);
    }

    public SerializerFactoryConfig getFactoryConfig() {
        return this._factoryConfig;
    }

    public boolean isIndexedList(Class<?> cls) {
        return RandomAccess.class.isAssignableFrom(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.AbstractC6468j
    public final AbstractC6468j withAdditionalKeySerializers(InterfaceC6469k interfaceC6469k) {
        return withConfig(this._factoryConfig.withAdditionalKeySerializers(interfaceC6469k));
    }

    @Override // com.fasterxml.jackson.databind.ser.AbstractC6468j
    public final AbstractC6468j withAdditionalSerializers(InterfaceC6469k interfaceC6469k) {
        return withConfig(this._factoryConfig.withAdditionalSerializers(interfaceC6469k));
    }

    @Override // com.fasterxml.jackson.databind.ser.AbstractC6468j
    public final AbstractC6468j withSerializerModifier(AbstractC6454c abstractC6454c) {
        return withConfig(this._factoryConfig.withSerializerModifier(abstractC6454c));
    }

    public BasicSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        this._factoryConfig = serializerFactoryConfig == null ? new SerializerFactoryConfig() : serializerFactoryConfig;
    }

    public MapSerializer _checkMapContentInclusion(AbstractC6446m abstractC6446m, AbstractC6340b abstractC6340b, MapSerializer mapSerializer) throws JsonMappingException {
        JsonInclude.Include contentInclusion;
        JavaType contentType = mapSerializer.getContentType();
        JsonInclude.Value value_findInclusionWithContent = _findInclusionWithContent(abstractC6446m, abstractC6340b, contentType, Map.class);
        if (value_findInclusionWithContent == null) {
            contentInclusion = JsonInclude.Include.USE_DEFAULTS;
        } else {
            contentInclusion = value_findInclusionWithContent.getContentInclusion();
        }
        Object objM11895b = null;
        boolean zIncludeFilterSuppressNulls = true;
        if (contentInclusion != JsonInclude.Include.USE_DEFAULTS && contentInclusion != JsonInclude.Include.ALWAYS) {
            int i11 = C6451a.f10591b[contentInclusion.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4 && (objM11895b = abstractC6446m.includeFilterInstance(null, value_findInclusionWithContent.getContentFilter())) != null) {
                            zIncludeFilterSuppressNulls = abstractC6446m.includeFilterSuppressNulls(objM11895b);
                        }
                    } else {
                        objM11895b = MapSerializer.MARKER_FOR_EMPTY;
                    }
                } else if (contentType.isReferenceType()) {
                    objM11895b = MapSerializer.MARKER_FOR_EMPTY;
                }
            } else {
                objM11895b = C6487d.m11895b(contentType);
                if (objM11895b != null && objM11895b.getClass().isArray()) {
                    objM11895b = C6485b.m11877b(objM11895b);
                }
            }
            return mapSerializer.withContentInclusion(objM11895b, zIncludeFilterSuppressNulls);
        }
        if (!abstractC6446m.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES)) {
            return mapSerializer.withContentInclusion(null, true);
        }
        return mapSerializer;
    }

    public AbstractC6393h<Object> _findContentSerializer(AbstractC6446m abstractC6446m, AbstractC6404a abstractC6404a) throws JsonMappingException {
        Object objFindContentSerializer = abstractC6446m.getAnnotationIntrospector().findContentSerializer(abstractC6404a);
        if (objFindContentSerializer != null) {
            return abstractC6446m.serializerInstance(abstractC6404a, objFindContentSerializer);
        }
        return null;
    }

    public JsonInclude.Value _findInclusionWithContent(AbstractC6446m abstractC6446m, AbstractC6340b abstractC6340b, JavaType javaType, Class<?> cls) throws JsonMappingException {
        SerializationConfig config = abstractC6446m.getConfig();
        JsonInclude.Value defaultPropertyInclusion = config.getDefaultPropertyInclusion(cls, abstractC6340b.mo11170p(config.getDefaultPropertyInclusion()));
        JsonInclude.Value defaultPropertyInclusion2 = config.getDefaultPropertyInclusion(javaType.getRawClass(), null);
        if (defaultPropertyInclusion2 != null) {
            int i11 = C6451a.f10591b[defaultPropertyInclusion2.getValueInclusion().ordinal()];
            if (i11 != 4) {
                if (i11 != 6) {
                    return defaultPropertyInclusion.withContentInclusion(defaultPropertyInclusion2.getValueInclusion());
                }
            } else {
                return defaultPropertyInclusion.withContentFilter(defaultPropertyInclusion2.getContentFilter());
            }
        }
        return defaultPropertyInclusion;
    }

    public AbstractC6393h<Object> _findKeySerializer(AbstractC6446m abstractC6446m, AbstractC6404a abstractC6404a) throws JsonMappingException {
        Object objFindKeySerializer = abstractC6446m.getAnnotationIntrospector().findKeySerializer(abstractC6404a);
        if (objFindKeySerializer != null) {
            return abstractC6446m.serializerInstance(abstractC6404a, objFindKeySerializer);
        }
        return null;
    }

    public AbstractC6393h<?> buildArraySerializer(AbstractC6446m abstractC6446m, ArrayType arrayType, AbstractC6340b abstractC6340b, boolean z11, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h) throws JsonMappingException {
        ArrayType arrayType2;
        AbstractC6340b abstractC6340b2;
        AbstractC6431e abstractC6431e2;
        AbstractC6393h<Object> abstractC6393h2;
        SerializationConfig config = abstractC6446m.getConfig();
        Iterator<InterfaceC6469k> it = customSerializers().iterator();
        AbstractC6393h<?> abstractC6393hM11760b = null;
        while (true) {
            if (it.hasNext()) {
                arrayType2 = arrayType;
                abstractC6340b2 = abstractC6340b;
                abstractC6431e2 = abstractC6431e;
                abstractC6393h2 = abstractC6393h;
                abstractC6393hM11760b = it.next().m11828f(config, arrayType2, abstractC6340b2, abstractC6431e2, abstractC6393h2);
                if (abstractC6393hM11760b != null) {
                    break;
                }
                arrayType = arrayType2;
                abstractC6340b = abstractC6340b2;
                abstractC6431e = abstractC6431e2;
                abstractC6393h = abstractC6393h2;
            } else {
                arrayType2 = arrayType;
                abstractC6340b2 = abstractC6340b;
                abstractC6431e2 = abstractC6431e;
                abstractC6393h2 = abstractC6393h;
                break;
            }
        }
        if (abstractC6393hM11760b == null) {
            Class<?> rawClass = arrayType2.getRawClass();
            if (abstractC6393h2 == null || C6490g.m11912O(abstractC6393h2)) {
                if (String[].class == rawClass) {
                    abstractC6393hM11760b = StringArraySerializer.instance;
                } else {
                    abstractC6393hM11760b = StdArraySerializers.m11836a(rawClass);
                }
            }
            if (abstractC6393hM11760b == null) {
                abstractC6393hM11760b = new ObjectArraySerializer(arrayType2.getContentType(), z11, abstractC6431e2, abstractC6393h2);
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<AbstractC6454c> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                abstractC6393hM11760b = it2.next().m11760b(config, arrayType2, abstractC6340b2, abstractC6393hM11760b);
            }
        }
        return abstractC6393hM11760b;
    }

    public AbstractC6393h<?> buildAtomicReferenceSerializer(AbstractC6446m abstractC6446m, ReferenceType referenceType, AbstractC6340b abstractC6340b, boolean z11, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h) throws JsonMappingException {
        JsonInclude.Include contentInclusion;
        boolean zIncludeFilterSuppressNulls;
        JavaType referencedType = referenceType.getReferencedType();
        JsonInclude.Value value_findInclusionWithContent = _findInclusionWithContent(abstractC6446m, abstractC6340b, referencedType, AtomicReference.class);
        if (value_findInclusionWithContent == null) {
            contentInclusion = JsonInclude.Include.USE_DEFAULTS;
        } else {
            contentInclusion = value_findInclusionWithContent.getContentInclusion();
        }
        Object objM11895b = null;
        if (contentInclusion != JsonInclude.Include.USE_DEFAULTS && contentInclusion != JsonInclude.Include.ALWAYS) {
            int i11 = C6451a.f10591b[contentInclusion.ordinal()];
            zIncludeFilterSuppressNulls = true;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4 && (objM11895b = abstractC6446m.includeFilterInstance(null, value_findInclusionWithContent.getContentFilter())) != null) {
                            zIncludeFilterSuppressNulls = abstractC6446m.includeFilterSuppressNulls(objM11895b);
                        }
                    } else {
                        objM11895b = MapSerializer.MARKER_FOR_EMPTY;
                    }
                } else if (referencedType.isReferenceType()) {
                    objM11895b = MapSerializer.MARKER_FOR_EMPTY;
                }
            } else {
                objM11895b = C6487d.m11895b(referencedType);
                if (objM11895b != null && objM11895b.getClass().isArray()) {
                    objM11895b = C6485b.m11877b(objM11895b);
                }
            }
        } else {
            zIncludeFilterSuppressNulls = false;
        }
        return new AtomicReferenceSerializer(referenceType, z11, abstractC6431e, abstractC6393h).withContentInclusion(objM11895b, zIncludeFilterSuppressNulls);
    }

    public AbstractC6393h<?> buildContainerSerializer(AbstractC6446m abstractC6446m, JavaType javaType, AbstractC6340b abstractC6340b, boolean z11) throws JsonMappingException {
        SerializationConfig config = abstractC6446m.getConfig();
        if (!z11 && javaType.useStaticType() && (!javaType.isContainerType() || !javaType.getContentType().isJavaLangObject())) {
            z11 = true;
        }
        AbstractC6431e abstractC6431eCreateTypeSerializer = createTypeSerializer(config, javaType.getContentType());
        if (abstractC6431eCreateTypeSerializer != null) {
            z11 = false;
        }
        boolean z12 = z11;
        AbstractC6393h<Object> abstractC6393h_findContentSerializer = _findContentSerializer(abstractC6446m, abstractC6340b.mo11174t());
        AbstractC6393h<?> abstractC6393hM11761c = null;
        if (javaType.isMapLikeType()) {
            MapLikeType mapLikeType = (MapLikeType) javaType;
            AbstractC6393h<Object> abstractC6393h_findKeySerializer = _findKeySerializer(abstractC6446m, abstractC6340b.mo11174t());
            if (mapLikeType instanceof MapType) {
                return buildMapSerializer(abstractC6446m, (MapType) mapLikeType, abstractC6340b, z12, abstractC6393h_findKeySerializer, abstractC6431eCreateTypeSerializer, abstractC6393h_findContentSerializer);
            }
            AbstractC6340b abstractC6340b2 = abstractC6340b;
            Iterator<InterfaceC6469k> it = customSerializers().iterator();
            while (it.hasNext()) {
                AbstractC6340b abstractC6340b3 = abstractC6340b2;
                abstractC6393hM11761c = it.next().m11826d(config, mapLikeType, abstractC6340b3, abstractC6393h_findKeySerializer, abstractC6431eCreateTypeSerializer, abstractC6393h_findContentSerializer);
                abstractC6340b2 = abstractC6340b3;
                if (abstractC6393hM11761c != null) {
                    break;
                }
            }
            if (abstractC6393hM11761c == null) {
                abstractC6393hM11761c = findSerializerByAnnotations(abstractC6446m, javaType, abstractC6340b2);
            }
            if (abstractC6393hM11761c != null && this._factoryConfig.hasSerializerModifiers()) {
                Iterator<AbstractC6454c> it2 = this._factoryConfig.serializerModifiers().iterator();
                while (it2.hasNext()) {
                    abstractC6393hM11761c = it2.next().m11765g(config, mapLikeType, abstractC6340b2, abstractC6393hM11761c);
                }
            }
            return abstractC6393hM11761c;
        }
        AbstractC6340b abstractC6340b4 = abstractC6340b;
        if (javaType.isCollectionLikeType()) {
            CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
            if (collectionLikeType instanceof CollectionType) {
                return buildCollectionSerializer(abstractC6446m, (CollectionType) collectionLikeType, abstractC6340b4, z12, abstractC6431eCreateTypeSerializer, abstractC6393h_findContentSerializer);
            }
            Iterator<InterfaceC6469k> it3 = customSerializers().iterator();
            while (it3.hasNext()) {
                AbstractC6340b abstractC6340b5 = abstractC6340b4;
                abstractC6393hM11761c = it3.next().m11825c(config, collectionLikeType, abstractC6340b5, abstractC6431eCreateTypeSerializer, abstractC6393h_findContentSerializer);
                abstractC6340b4 = abstractC6340b5;
                if (abstractC6393hM11761c != null) {
                    break;
                }
            }
            if (abstractC6393hM11761c == null) {
                abstractC6393hM11761c = findSerializerByAnnotations(abstractC6446m, javaType, abstractC6340b4);
            }
            if (abstractC6393hM11761c != null && this._factoryConfig.hasSerializerModifiers()) {
                Iterator<AbstractC6454c> it4 = this._factoryConfig.serializerModifiers().iterator();
                while (it4.hasNext()) {
                    abstractC6393hM11761c = it4.next().m11761c(config, collectionLikeType, abstractC6340b4, abstractC6393hM11761c);
                }
            }
            return abstractC6393hM11761c;
        }
        if (!javaType.isArrayType()) {
            return null;
        }
        return buildArraySerializer(abstractC6446m, (ArrayType) javaType, abstractC6340b4, z12, abstractC6431eCreateTypeSerializer, abstractC6393h_findContentSerializer);
    }

    @Override // com.fasterxml.jackson.databind.ser.AbstractC6468j
    public AbstractC6431e createTypeSerializer(SerializationConfig serializationConfig, JavaType javaType) {
        Collection<NamedType> collectionCollectAndResolveSubtypesByClass;
        C6406c c6406cMo11174t = serializationConfig.introspectClassAnnotations(javaType.getRawClass()).mo11174t();
        InterfaceC6430d<?> interfaceC6430dFindTypeResolver = serializationConfig.getAnnotationIntrospector().findTypeResolver(serializationConfig, c6406cMo11174t, javaType);
        if (interfaceC6430dFindTypeResolver == null) {
            interfaceC6430dFindTypeResolver = serializationConfig.getDefaultTyper(javaType);
            collectionCollectAndResolveSubtypesByClass = null;
        } else {
            collectionCollectAndResolveSubtypesByClass = serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, c6406cMo11174t);
        }
        if (interfaceC6430dFindTypeResolver == null) {
            return null;
        }
        return interfaceC6430dFindTypeResolver.buildTypeSerializer(serializationConfig, javaType, collectionCollectAndResolveSubtypesByClass);
    }

    public InterfaceC6491h<Object, Object> findConverter(AbstractC6446m abstractC6446m, AbstractC6404a abstractC6404a) throws JsonMappingException {
        Object objFindSerializationConverter = abstractC6446m.getAnnotationIntrospector().findSerializationConverter(abstractC6404a);
        if (objFindSerializationConverter == null) {
            return null;
        }
        return abstractC6446m.converterInstance(abstractC6404a, objFindSerializationConverter);
    }

    public AbstractC6393h<?> findConvertingSerializer(AbstractC6446m abstractC6446m, AbstractC6404a abstractC6404a, AbstractC6393h<?> abstractC6393h) throws JsonMappingException {
        InterfaceC6491h<Object, Object> interfaceC6491hFindConverter = findConverter(abstractC6446m, abstractC6404a);
        if (interfaceC6491hFindConverter == null) {
            return abstractC6393h;
        }
        return new StdDelegatingSerializer(interfaceC6491hFindConverter, interfaceC6491hFindConverter.mo11361b(abstractC6446m.getTypeFactory()), abstractC6393h);
    }

    public Object findFilterId(SerializationConfig serializationConfig, AbstractC6340b abstractC6340b) {
        return serializationConfig.getAnnotationIntrospector().findFilterId(abstractC6340b.mo11174t());
    }

    public AbstractC6393h<?> findReferenceSerializer(AbstractC6446m abstractC6446m, ReferenceType referenceType, AbstractC6340b abstractC6340b, boolean z11) throws JsonMappingException {
        JavaType contentType = referenceType.getContentType();
        AbstractC6431e abstractC6431eCreateTypeSerializer = (AbstractC6431e) contentType.getTypeHandler();
        SerializationConfig config = abstractC6446m.getConfig();
        if (abstractC6431eCreateTypeSerializer == null) {
            abstractC6431eCreateTypeSerializer = createTypeSerializer(config, contentType);
        }
        AbstractC6431e abstractC6431e = abstractC6431eCreateTypeSerializer;
        AbstractC6393h<Object> abstractC6393h = (AbstractC6393h) contentType.getValueHandler();
        Iterator<InterfaceC6469k> it = customSerializers().iterator();
        while (it.hasNext()) {
            ReferenceType referenceType2 = referenceType;
            AbstractC6340b abstractC6340b2 = abstractC6340b;
            AbstractC6393h<?> abstractC6393hM11823a = it.next().m11823a(config, referenceType2, abstractC6340b2, abstractC6431e, abstractC6393h);
            if (abstractC6393hM11823a != null) {
                return abstractC6393hM11823a;
            }
            referenceType = referenceType2;
            abstractC6340b = abstractC6340b2;
        }
        ReferenceType referenceType3 = referenceType;
        AbstractC6340b abstractC6340b3 = abstractC6340b;
        if (referenceType3.isTypeOrSubTypeOf(AtomicReference.class)) {
            return buildAtomicReferenceSerializer(abstractC6446m, referenceType3, abstractC6340b3, z11, abstractC6431e, abstractC6393h);
        }
        return null;
    }

    public final AbstractC6393h<?> findSerializerByAddonType(SerializationConfig serializationConfig, JavaType javaType, AbstractC6340b abstractC6340b, boolean z11) throws JsonMappingException {
        JavaType javaTypeUnknownType;
        JavaType javaTypeUnknownType2;
        Class<?> rawClass = javaType.getRawClass();
        if (Iterator.class.isAssignableFrom(rawClass)) {
            JavaType[] javaTypeArrFindTypeParameters = serializationConfig.getTypeFactory().findTypeParameters(javaType, Iterator.class);
            if (javaTypeArrFindTypeParameters != null && javaTypeArrFindTypeParameters.length == 1) {
                javaTypeUnknownType2 = javaTypeArrFindTypeParameters[0];
            } else {
                javaTypeUnknownType2 = TypeFactory.unknownType();
            }
            return buildIteratorSerializer(serializationConfig, javaType, abstractC6340b, z11, javaTypeUnknownType2);
        }
        if (Iterable.class.isAssignableFrom(rawClass)) {
            JavaType[] javaTypeArrFindTypeParameters2 = serializationConfig.getTypeFactory().findTypeParameters(javaType, Iterable.class);
            if (javaTypeArrFindTypeParameters2 != null && javaTypeArrFindTypeParameters2.length == 1) {
                javaTypeUnknownType = javaTypeArrFindTypeParameters2[0];
            } else {
                javaTypeUnknownType = TypeFactory.unknownType();
            }
            return buildIterableSerializer(serializationConfig, javaType, abstractC6340b, z11, javaTypeUnknownType);
        }
        if (CharSequence.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        return null;
    }

    public final AbstractC6393h<?> findSerializerByAnnotations(AbstractC6446m abstractC6446m, JavaType javaType, AbstractC6340b abstractC6340b) throws JsonMappingException {
        if (InterfaceC6392g.class.isAssignableFrom(javaType.getRawClass())) {
            return SerializableSerializer.instance;
        }
        AnnotatedMember annotatedMemberMo11164j = abstractC6340b.mo11164j();
        if (annotatedMemberMo11164j != null) {
            if (abstractC6446m.canOverrideAccessModifiers()) {
                C6490g.m11936g(annotatedMemberMo11164j.getMember(), abstractC6446m.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            JavaType type = annotatedMemberMo11164j.getType();
            AbstractC6393h<Object> abstractC6393hFindSerializerFromAnnotation = findSerializerFromAnnotation(abstractC6446m, annotatedMemberMo11164j);
            if (abstractC6393hFindSerializerFromAnnotation == null) {
                abstractC6393hFindSerializerFromAnnotation = (AbstractC6393h) type.getValueHandler();
            }
            AbstractC6431e abstractC6431eCreateTypeSerializer = (AbstractC6431e) type.getTypeHandler();
            if (abstractC6431eCreateTypeSerializer == null) {
                abstractC6431eCreateTypeSerializer = createTypeSerializer(abstractC6446m.getConfig(), type);
            }
            return new JsonValueSerializer(annotatedMemberMo11164j, abstractC6431eCreateTypeSerializer, abstractC6393hFindSerializerFromAnnotation);
        }
        return null;
    }

    public final AbstractC6393h<?> findSerializerByLookup(JavaType javaType, SerializationConfig serializationConfig, AbstractC6340b abstractC6340b, boolean z11) {
        Class<? extends AbstractC6393h<?>> cls;
        String name = javaType.getRawClass().getName();
        AbstractC6393h<?> abstractC6393h = _concrete.get(name);
        if (abstractC6393h == null && (cls = _concreteLazy.get(name)) != null) {
            return (AbstractC6393h) C6490g.m11946l(cls, false);
        }
        return abstractC6393h;
    }

    public final AbstractC6393h<?> findSerializerByPrimaryType(AbstractC6446m abstractC6446m, JavaType javaType, AbstractC6340b abstractC6340b, boolean z11) throws JsonMappingException {
        if (javaType.isEnumType()) {
            return buildEnumSerializer(abstractC6446m.getConfig(), javaType, abstractC6340b);
        }
        Class<?> rawClass = javaType.getRawClass();
        AbstractC6393h<?> abstractC6393hFindOptionalStdSerializer = findOptionalStdSerializer(abstractC6446m, javaType, abstractC6340b, z11);
        if (abstractC6393hFindOptionalStdSerializer != null) {
            return abstractC6393hFindOptionalStdSerializer;
        }
        if (Calendar.class.isAssignableFrom(rawClass)) {
            return CalendarSerializer.instance;
        }
        if (Date.class.isAssignableFrom(rawClass)) {
            return DateSerializer.instance;
        }
        if (Map.Entry.class.isAssignableFrom(rawClass)) {
            JavaType javaTypeFindSuperType = javaType.findSuperType(Map.Entry.class);
            return buildMapEntrySerializer(abstractC6446m, javaType, abstractC6340b, z11, javaTypeFindSuperType.containedTypeOrUnknown(0), javaTypeFindSuperType.containedTypeOrUnknown(1));
        }
        if (ByteBuffer.class.isAssignableFrom(rawClass)) {
            return new ByteBufferSerializer();
        }
        if (InetAddress.class.isAssignableFrom(rawClass)) {
            return new InetAddressSerializer();
        }
        if (InetSocketAddress.class.isAssignableFrom(rawClass)) {
            return new InetSocketAddressSerializer();
        }
        if (TimeZone.class.isAssignableFrom(rawClass)) {
            return new TimeZoneSerializer();
        }
        if (Charset.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        if (Number.class.isAssignableFrom(rawClass)) {
            int i11 = C6451a.f10590a[abstractC6340b.mo11161g(null).getShape().ordinal()];
            if (i11 != 1) {
                if (i11 == 2 || i11 == 3) {
                    return null;
                }
                return NumberSerializer.instance;
            }
            return ToStringSerializer.instance;
        }
        if (!ClassLoader.class.isAssignableFrom(rawClass)) {
            return null;
        }
        return new ToEmptyObjectSerializer(javaType);
    }

    public AbstractC6393h<Object> findSerializerFromAnnotation(AbstractC6446m abstractC6446m, AbstractC6404a abstractC6404a) throws JsonMappingException {
        Object objFindSerializer = abstractC6446m.getAnnotationIntrospector().findSerializer(abstractC6404a);
        if (objFindSerializer == null) {
            return null;
        }
        return findConvertingSerializer(abstractC6446m, abstractC6404a, abstractC6446m.serializerInstance(abstractC6404a, objFindSerializer));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.ser.AbstractC6468j
    @Deprecated
    public AbstractC6393h<Object> createKeySerializer(SerializationConfig serializationConfig, JavaType javaType, AbstractC6393h<Object> abstractC6393h) {
        AbstractC6340b abstractC6340bIntrospect = serializationConfig.introspect(javaType);
        AbstractC6393h<?> abstractC6393hM11824b = null;
        if (this._factoryConfig.hasKeySerializers()) {
            Iterator<InterfaceC6469k> it = this._factoryConfig.keySerializers().iterator();
            while (it.hasNext() && (abstractC6393hM11824b = it.next().m11824b(serializationConfig, javaType, abstractC6340bIntrospect)) == null) {
            }
        }
        if (abstractC6393hM11824b != null) {
            abstractC6393h = abstractC6393hM11824b;
        } else if (abstractC6393h == null && (abstractC6393h = StdKeySerializers.m11840b(serializationConfig, javaType.getRawClass(), false)) == null) {
            abstractC6393h = StdKeySerializers.m11839a(serializationConfig, javaType.getRawClass());
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<AbstractC6454c> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                abstractC6393h = it2.next().m11764f(serializationConfig, javaType, abstractC6340bIntrospect, abstractC6393h);
            }
        }
        return abstractC6393h;
    }

    public ContainerSerializer<?> buildCollectionSerializer(JavaType javaType, boolean z11, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h) {
        return new CollectionSerializer(javaType, z11, abstractC6431e, abstractC6393h);
    }
}
