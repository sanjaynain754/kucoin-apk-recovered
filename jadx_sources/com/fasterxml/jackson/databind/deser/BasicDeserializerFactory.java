package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractC6339a;
import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6394i;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.AbstractC6370e;
import com.fasterxml.jackson.databind.deser.impl.C6366a;
import com.fasterxml.jackson.databind.deser.impl.C6367b;
import com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators;
import com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.C6388a;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.AbstractC6404a;
import com.fasterxml.jackson.databind.introspect.AbstractC6414k;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.C6406c;
import com.fasterxml.jackson.databind.introspect.C6413j;
import com.fasterxml.jackson.databind.introspect.C6422s;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6430d;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.C6498o;
import com.fasterxml.jackson.databind.util.C6499p;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;
import p490o7.C42986a;

/* JADX INFO: loaded from: classes45.dex */
public abstract class BasicDeserializerFactory extends AbstractC6362g implements Serializable {
    protected final DeserializerFactoryConfig _factoryConfig;

    /* JADX INFO: renamed from: b */
    public static final Class<?> f10216b = Object.class;

    /* JADX INFO: renamed from: c */
    public static final Class<?> f10217c = String.class;

    /* JADX INFO: renamed from: d */
    public static final Class<?> f10218d = CharSequence.class;

    /* JADX INFO: renamed from: e */
    public static final Class<?> f10219e = Iterable.class;

    /* JADX INFO: renamed from: f */
    public static final Class<?> f10220f = Map.Entry.class;

    /* JADX INFO: renamed from: g */
    public static final Class<?> f10221g = Serializable.class;
    protected static final PropertyName UNWRAPPED_CREATOR_PARAM_NAME = new PropertyName("@JsonUnwrapped");

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$b */
    public static class C6350b {

        /* JADX INFO: renamed from: a */
        public static final HashMap<String, Class<? extends Collection>> f10224a;

        /* JADX INFO: renamed from: b */
        public static final HashMap<String, Class<? extends Map>> f10225b;

        static {
            HashMap<String, Class<? extends Collection>> map = new HashMap<>();
            map.put(Collection.class.getName(), ArrayList.class);
            map.put(List.class.getName(), ArrayList.class);
            map.put(Set.class.getName(), HashSet.class);
            map.put(SortedSet.class.getName(), TreeSet.class);
            map.put(Queue.class.getName(), LinkedList.class);
            map.put(AbstractList.class.getName(), ArrayList.class);
            map.put(AbstractSet.class.getName(), HashSet.class);
            map.put(Deque.class.getName(), LinkedList.class);
            map.put(NavigableSet.class.getName(), TreeSet.class);
            f10224a = map;
            HashMap<String, Class<? extends Map>> map2 = new HashMap<>();
            map2.put(Map.class.getName(), LinkedHashMap.class);
            map2.put(AbstractMap.class.getName(), LinkedHashMap.class);
            map2.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
            map2.put(SortedMap.class.getName(), TreeMap.class);
            map2.put(NavigableMap.class.getName(), TreeMap.class);
            map2.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
            f10225b = map2;
        }

        /* JADX INFO: renamed from: a */
        public static Class<?> m11190a(JavaType javaType) {
            return f10224a.get(javaType.getRawClass().getName());
        }

        /* JADX INFO: renamed from: b */
        public static Class<?> m11191b(JavaType javaType) {
            return f10225b.get(javaType.getRawClass().getName());
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$c */
    public static class C6351c {

        /* JADX INFO: renamed from: a */
        public final DeserializationContext f10226a;

        /* JADX INFO: renamed from: b */
        public final AbstractC6340b f10227b;

        /* JADX INFO: renamed from: c */
        public final VisibilityChecker<?> f10228c;

        /* JADX INFO: renamed from: d */
        public final C6367b f10229d;

        /* JADX INFO: renamed from: e */
        public final Map<AnnotatedWithParams, AbstractC6414k[]> f10230e;

        /* JADX INFO: renamed from: f */
        public List<C6366a> f10231f;

        /* JADX INFO: renamed from: g */
        public int f10232g;

        /* JADX INFO: renamed from: h */
        public List<C6366a> f10233h;

        /* JADX INFO: renamed from: i */
        public int f10234i;

        /* JADX INFO: renamed from: a */
        public void m11192a(C6366a c6366a) {
            if (this.f10233h == null) {
                this.f10233h = new LinkedList();
            }
            this.f10233h.add(c6366a);
        }

        /* JADX INFO: renamed from: b */
        public void m11193b(C6366a c6366a) {
            if (this.f10231f == null) {
                this.f10231f = new LinkedList();
            }
            this.f10231f.add(c6366a);
        }

        /* JADX INFO: renamed from: c */
        public AnnotationIntrospector m11194c() {
            return this.f10226a.getAnnotationIntrospector();
        }

        /* JADX INFO: renamed from: d */
        public boolean m11195d() {
            return this.f10234i > 0;
        }

        /* JADX INFO: renamed from: e */
        public boolean m11196e() {
            return this.f10232g > 0;
        }

        /* JADX INFO: renamed from: f */
        public boolean m11197f() {
            return this.f10233h != null;
        }

        /* JADX INFO: renamed from: g */
        public boolean m11198g() {
            return this.f10231f != null;
        }

        /* JADX INFO: renamed from: h */
        public List<C6366a> m11199h() {
            return this.f10233h;
        }

        /* JADX INFO: renamed from: i */
        public List<C6366a> m11200i() {
            return this.f10231f;
        }

        /* JADX INFO: renamed from: j */
        public void m11201j() {
            this.f10234i++;
        }

        /* JADX INFO: renamed from: k */
        public void m11202k() {
            this.f10232g++;
        }

        public C6351c(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, VisibilityChecker<?> visibilityChecker, C6367b c6367b, Map<AnnotatedWithParams, AbstractC6414k[]> map) {
            this.f10226a = deserializationContext;
            this.f10227b = abstractC6340b;
            this.f10228c = visibilityChecker;
            this.f10229d = c6367b;
            this.f10230e = map;
        }
    }

    @Deprecated
    public void _addExplicitAnyCreator(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, C6367b c6367b, C6366a c6366a) throws JsonMappingException {
        _addExplicitAnyCreator(deserializationContext, abstractC6340b, c6367b, c6366a, deserializationContext.getConfig().getConstructorDetector());
    }

    public boolean _handleSingleArgumentCreator(C6367b c6367b, AnnotatedWithParams annotatedWithParams, boolean z11, boolean z12) {
        Class<?> rawParameterType = annotatedWithParams.getRawParameterType(0);
        if (rawParameterType == String.class || rawParameterType == f10218d) {
            if (z11 || z12) {
                c6367b.m11325m(annotatedWithParams, z11);
            }
            return true;
        }
        if (rawParameterType == Integer.TYPE || rawParameterType == Integer.class) {
            if (z11 || z12) {
                c6367b.m11322j(annotatedWithParams, z11);
            }
            return true;
        }
        if (rawParameterType == Long.TYPE || rawParameterType == Long.class) {
            if (z11 || z12) {
                c6367b.m11323k(annotatedWithParams, z11);
            }
            return true;
        }
        if (rawParameterType == Double.TYPE || rawParameterType == Double.class) {
            if (z11 || z12) {
                c6367b.m11321i(annotatedWithParams, z11);
            }
            return true;
        }
        if (rawParameterType == Boolean.TYPE || rawParameterType == Boolean.class) {
            if (z11 || z12) {
                c6367b.m11319g(annotatedWithParams, z11);
            }
            return true;
        }
        if (rawParameterType == BigInteger.class && (z11 || z12)) {
            c6367b.m11318f(annotatedWithParams, z11);
        }
        if (rawParameterType == BigDecimal.class && (z11 || z12)) {
            c6367b.m11317e(annotatedWithParams, z11);
        }
        if (!z11) {
            return false;
        }
        c6367b.m11320h(annotatedWithParams, z11, null, 0);
        return true;
    }

    public ValueInstantiator _valueInstantiatorInstance(DeserializationConfig deserializationConfig, AbstractC6404a abstractC6404a, Object obj) throws JsonMappingException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof ValueInstantiator) {
            return (ValueInstantiator) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
        }
        Class cls = (Class) obj;
        if (C6490g.m11907J(cls)) {
            return null;
        }
        if (ValueInstantiator.class.isAssignableFrom(cls)) {
            deserializationConfig.getHandlerInstantiator();
            return (ValueInstantiator) C6490g.m11946l(cls, deserializationConfig.canOverrideAccessModifiers());
        }
        throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<ValueInstantiator>");
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11185a(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, AbstractC6414k abstractC6414k) {
        String name;
        if ((abstractC6414k == null || !abstractC6414k.mo11551x()) && annotationIntrospector.findInjectableValue(annotatedWithParams.getParameter(0)) == null) {
            return (abstractC6414k == null || (name = abstractC6414k.getName()) == null || name.isEmpty() || !abstractC6414k.mo11529b()) ? false : true;
        }
        return true;
    }

    public SettableBeanProperty constructCreatorProperty(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, PropertyName propertyName, int i11, AnnotatedParameter annotatedParameter, JacksonInject.Value value) throws JsonMappingException {
        PropertyName propertyNameFindWrapperName;
        PropertyMetadata propertyMetadata;
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            propertyMetadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
            propertyNameFindWrapperName = null;
        } else {
            PropertyMetadata propertyMetadataConstruct = PropertyMetadata.construct(annotationIntrospector.hasRequiredMarker(annotatedParameter), annotationIntrospector.findPropertyDescription(annotatedParameter), annotationIntrospector.findPropertyIndex(annotatedParameter), annotationIntrospector.findPropertyDefaultValue(annotatedParameter));
            propertyNameFindWrapperName = annotationIntrospector.findWrapperName(annotatedParameter);
            propertyMetadata = propertyMetadataConstruct;
        }
        JavaType javaTypeResolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedParameter, annotatedParameter.getType());
        BeanProperty.Std std = new BeanProperty.Std(propertyName, javaTypeResolveMemberAndTypeAnnotations, propertyNameFindWrapperName, annotatedParameter, propertyMetadata);
        AbstractC6428b abstractC6428bFindTypeDeserializer = (AbstractC6428b) javaTypeResolveMemberAndTypeAnnotations.getTypeHandler();
        if (abstractC6428bFindTypeDeserializer == null) {
            abstractC6428bFindTypeDeserializer = findTypeDeserializer(config, javaTypeResolveMemberAndTypeAnnotations);
        }
        CreatorProperty creatorPropertyConstruct = CreatorProperty.construct(propertyName, javaTypeResolveMemberAndTypeAnnotations, std.getWrapperName(), abstractC6428bFindTypeDeserializer, abstractC6340b.mo11173s(), annotatedParameter, i11, value, _getSetterInfo(deserializationContext, std, propertyMetadata));
        AbstractC6390e<?> abstractC6390eFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, annotatedParameter);
        if (abstractC6390eFindDeserializerFromAnnotation == null) {
            abstractC6390eFindDeserializerFromAnnotation = (AbstractC6390e) javaTypeResolveMemberAndTypeAnnotations.getValueHandler();
        }
        return abstractC6390eFindDeserializerFromAnnotation != null ? creatorPropertyConstruct.withValueDeserializer(deserializationContext.handlePrimaryContextualization(abstractC6390eFindDeserializerFromAnnotation, creatorPropertyConstruct, javaTypeResolveMemberAndTypeAnnotations)) : creatorPropertyConstruct;
    }

    public abstract AbstractC6362g withConfig(DeserializerFactoryConfig deserializerFactoryConfig);

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$a */
    public static /* synthetic */ class C6349a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10222a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f10223b;

        static {
            int[] iArr = new int[ConstructorDetector.SingleArgConstructor.values().length];
            f10223b = iArr;
            try {
                iArr[ConstructorDetector.SingleArgConstructor.DELEGATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10223b[ConstructorDetector.SingleArgConstructor.PROPERTIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10223b[ConstructorDetector.SingleArgConstructor.REQUIRE_MODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10223b[ConstructorDetector.SingleArgConstructor.HEURISTIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[JsonCreator.Mode.values().length];
            f10222a = iArr2;
            try {
                iArr2[JsonCreator.Mode.DELEGATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10222a[JsonCreator.Mode.PROPERTIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10222a[JsonCreator.Mode.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public void _addExplicitConstructorCreators(DeserializationContext deserializationContext, C6351c c6351c, boolean z11) throws JsonMappingException {
        DeserializationContext deserializationContext2;
        AbstractC6340b abstractC6340b = c6351c.f10227b;
        C6367b c6367b = c6351c.f10229d;
        AnnotationIntrospector annotationIntrospectorM11194c = c6351c.m11194c();
        VisibilityChecker<?> visibilityChecker = c6351c.f10228c;
        Map<AnnotatedWithParams, AbstractC6414k[]> map = c6351c.f10230e;
        AnnotatedConstructor annotatedConstructorMo11158d = abstractC6340b.mo11158d();
        if (annotatedConstructorMo11158d != null && (!c6367b.m11327o() || _hasCreatorAnnotation(deserializationContext, annotatedConstructorMo11158d))) {
            c6367b.m11330r(annotatedConstructorMo11158d);
        }
        for (AnnotatedConstructor annotatedConstructor : abstractC6340b.mo11175u()) {
            JsonCreator.Mode modeFindCreatorAnnotation = annotationIntrospectorM11194c.findCreatorAnnotation(deserializationContext.getConfig(), annotatedConstructor);
            if (JsonCreator.Mode.DISABLED != modeFindCreatorAnnotation) {
                if (modeFindCreatorAnnotation != null) {
                    int i11 = C6349a.f10222a[modeFindCreatorAnnotation.ordinal()];
                    if (i11 == 1) {
                        deserializationContext2 = deserializationContext;
                        _addExplicitDelegatingCreator(deserializationContext2, abstractC6340b, c6367b, C6366a.m11303a(annotationIntrospectorM11194c, annotatedConstructor, null));
                    } else if (i11 != 2) {
                        deserializationContext2 = deserializationContext;
                        _addExplicitAnyCreator(deserializationContext2, abstractC6340b, c6367b, C6366a.m11303a(annotationIntrospectorM11194c, annotatedConstructor, map.get(annotatedConstructor)), deserializationContext.getConfig().getConstructorDetector());
                    } else {
                        deserializationContext2 = deserializationContext;
                        _addExplicitPropertyCreator(deserializationContext2, abstractC6340b, c6367b, C6366a.m11303a(annotationIntrospectorM11194c, annotatedConstructor, map.get(annotatedConstructor)));
                    }
                    c6351c.m11201j();
                    deserializationContext = deserializationContext2;
                } else if (z11 && visibilityChecker.isCreatorVisible(annotatedConstructor)) {
                    c6351c.m11192a(C6366a.m11303a(annotationIntrospectorM11194c, annotatedConstructor, map.get(annotatedConstructor)));
                }
            }
        }
    }

    public void _addExplicitFactoryCreators(DeserializationContext deserializationContext, C6351c c6351c, boolean z11) throws JsonMappingException {
        DeserializationContext deserializationContext2;
        AbstractC6340b abstractC6340b = c6351c.f10227b;
        C6367b c6367b = c6351c.f10229d;
        AnnotationIntrospector annotationIntrospectorM11194c = c6351c.m11194c();
        VisibilityChecker<?> visibilityChecker = c6351c.f10228c;
        Map<AnnotatedWithParams, AbstractC6414k[]> map = c6351c.f10230e;
        for (AnnotatedMethod annotatedMethod : abstractC6340b.mo11177w()) {
            JsonCreator.Mode modeFindCreatorAnnotation = annotationIntrospectorM11194c.findCreatorAnnotation(deserializationContext.getConfig(), annotatedMethod);
            int parameterCount = annotatedMethod.getParameterCount();
            if (modeFindCreatorAnnotation == null) {
                if (z11 && parameterCount == 1 && visibilityChecker.isCreatorVisible(annotatedMethod)) {
                    c6351c.m11193b(C6366a.m11303a(annotationIntrospectorM11194c, annotatedMethod, null));
                }
            } else if (modeFindCreatorAnnotation != JsonCreator.Mode.DISABLED) {
                if (parameterCount == 0) {
                    c6367b.m11330r(annotatedMethod);
                } else {
                    int i11 = C6349a.f10222a[modeFindCreatorAnnotation.ordinal()];
                    if (i11 == 1) {
                        deserializationContext2 = deserializationContext;
                        _addExplicitDelegatingCreator(deserializationContext2, abstractC6340b, c6367b, C6366a.m11303a(annotationIntrospectorM11194c, annotatedMethod, null));
                    } else if (i11 != 2) {
                        deserializationContext2 = deserializationContext;
                        _addExplicitAnyCreator(deserializationContext2, abstractC6340b, c6367b, C6366a.m11303a(annotationIntrospectorM11194c, annotatedMethod, map.get(annotatedMethod)), ConstructorDetector.DEFAULT);
                    } else {
                        deserializationContext2 = deserializationContext;
                        _addExplicitPropertyCreator(deserializationContext2, abstractC6340b, c6367b, C6366a.m11303a(annotationIntrospectorM11194c, annotatedMethod, map.get(annotatedMethod)));
                    }
                    c6351c.m11202k();
                    deserializationContext = deserializationContext2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0149 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x014b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0124 A[SYNTHETIC] */
    public void _addImplicitConstructorCreators(DeserializationContext deserializationContext, C6351c c6351c, List<C6366a> list) throws JsonMappingException {
        VisibilityChecker<?> visibilityChecker;
        boolean z11;
        AnnotatedWithParams annotatedWithParams;
        VisibilityChecker<?> visibilityChecker2;
        SettableBeanProperty[] settableBeanPropertyArr;
        boolean z12;
        int i11;
        BasicDeserializerFactory basicDeserializerFactory = this;
        DeserializationConfig config = deserializationContext.getConfig();
        AbstractC6340b abstractC6340b = c6351c.f10227b;
        C6367b c6367b = c6351c.f10229d;
        AnnotationIntrospector annotationIntrospectorM11194c = c6351c.m11194c();
        VisibilityChecker<?> visibilityChecker3 = c6351c.f10228c;
        boolean zSingleArgCreatorDefaultsToProperties = config.getConstructorDetector().singleArgCreatorDefaultsToProperties();
        LinkedList linkedList = null;
        for (C6366a c6366a : list) {
            int iM11309g = c6366a.m11309g();
            AnnotatedWithParams annotatedWithParamsM11304b = c6366a.m11304b();
            if (iM11309g == 1) {
                AbstractC6414k abstractC6414kM11312j = c6366a.m11312j(0);
                if (zSingleArgCreatorDefaultsToProperties || basicDeserializerFactory.m11185a(annotationIntrospectorM11194c, annotatedWithParamsM11304b, abstractC6414kM11312j)) {
                    JacksonInject.Value valueM11308f = c6366a.m11308f(0);
                    PropertyName propertyNameM11310h = c6366a.m11310h(0);
                    if (propertyNameM11310h != null || (propertyNameM11310h = c6366a.m11306d(0)) != null || valueM11308f != null) {
                        c6367b.m11324l(annotatedWithParamsM11304b, false, new SettableBeanProperty[]{basicDeserializerFactory.constructCreatorProperty(deserializationContext, abstractC6340b, propertyNameM11310h, 0, c6366a.m11311i(0), valueM11308f)});
                        basicDeserializerFactory = this;
                    }
                    visibilityChecker = visibilityChecker3;
                    z11 = zSingleArgCreatorDefaultsToProperties;
                } else {
                    basicDeserializerFactory._handleSingleArgumentCreator(c6367b, annotatedWithParamsM11304b, false, visibilityChecker3.isCreatorVisible(annotatedWithParamsM11304b));
                    if (abstractC6414kM11312j != null) {
                        ((C6422s) abstractC6414kM11312j).m11655n0();
                    }
                }
                visibilityChecker = visibilityChecker3;
                z11 = zSingleArgCreatorDefaultsToProperties;
            } else {
                AnnotatedWithParams annotatedWithParams2 = annotatedWithParamsM11304b;
                SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[iM11309g];
                int i12 = 0;
                int i13 = 0;
                int i14 = -1;
                int i15 = 0;
                while (i15 < iM11309g) {
                    int i16 = i14;
                    AnnotatedParameter parameter = annotatedWithParams2.getParameter(i15);
                    AbstractC6414k abstractC6414kM11312j2 = c6366a.m11312j(i15);
                    JacksonInject.Value valueFindInjectableValue = annotationIntrospectorM11194c.findInjectableValue(parameter);
                    PropertyName fullName = abstractC6414kM11312j2 == null ? null : abstractC6414kM11312j2.getFullName();
                    if (abstractC6414kM11312j2 == null || !abstractC6414kM11312j2.mo11551x()) {
                        annotatedWithParams = annotatedWithParams2;
                        visibilityChecker2 = visibilityChecker3;
                        settableBeanPropertyArr = settableBeanPropertyArr2;
                        PropertyName propertyName = fullName;
                        z12 = zSingleArgCreatorDefaultsToProperties;
                        i11 = i16;
                        if (valueFindInjectableValue != null) {
                            i13++;
                            settableBeanPropertyArr[i15] = constructCreatorProperty(deserializationContext, abstractC6340b, propertyName, i15, parameter, valueFindInjectableValue);
                        } else if (annotationIntrospectorM11194c.findUnwrappingNameTransformer(parameter) != null) {
                            _reportUnwrappedCreatorProperty(deserializationContext, abstractC6340b, parameter);
                        } else {
                            if (i11 < 0) {
                                i14 = i15;
                            }
                            i15++;
                            settableBeanPropertyArr2 = settableBeanPropertyArr;
                            annotatedWithParams2 = annotatedWithParams;
                            visibilityChecker3 = visibilityChecker2;
                            zSingleArgCreatorDefaultsToProperties = z12;
                        }
                    } else {
                        i12++;
                        annotatedWithParams = annotatedWithParams2;
                        visibilityChecker2 = visibilityChecker3;
                        settableBeanPropertyArr = settableBeanPropertyArr2;
                        PropertyName propertyName2 = fullName;
                        z12 = zSingleArgCreatorDefaultsToProperties;
                        i11 = i16;
                        settableBeanPropertyArr[i15] = constructCreatorProperty(deserializationContext, abstractC6340b, propertyName2, i15, parameter, valueFindInjectableValue);
                    }
                    i14 = i11;
                    i15++;
                    settableBeanPropertyArr2 = settableBeanPropertyArr;
                    annotatedWithParams2 = annotatedWithParams;
                    visibilityChecker3 = visibilityChecker2;
                    zSingleArgCreatorDefaultsToProperties = z12;
                }
                AnnotatedWithParams annotatedWithParams3 = annotatedWithParams2;
                visibilityChecker = visibilityChecker3;
                z11 = zSingleArgCreatorDefaultsToProperties;
                basicDeserializerFactory = this;
                SettableBeanProperty[] settableBeanPropertyArr3 = settableBeanPropertyArr2;
                int i17 = i14;
                if (i12 > 0 || i13 > 0) {
                    if (i12 + i13 == iM11309g) {
                        c6367b.m11324l(annotatedWithParams3, false, settableBeanPropertyArr3);
                    } else if (i12 == 0 && i13 + 1 == iM11309g) {
                        c6367b.m11320h(annotatedWithParams3, false, settableBeanPropertyArr3, 0);
                    } else {
                        PropertyName propertyNameM11306d = c6366a.m11306d(i17);
                        if (propertyNameM11306d == null || propertyNameM11306d.isEmpty()) {
                            deserializationContext.reportBadTypeDefinition(abstractC6340b, "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(i17), annotatedWithParams3);
                        }
                        if (c6367b.m11327o()) {
                            if (linkedList == null) {
                                linkedList = new LinkedList();
                            }
                            linkedList.add(annotatedWithParams3);
                        }
                    }
                } else if (c6367b.m11327o()) {
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                    }
                    linkedList.add(annotatedWithParams3);
                }
            }
            visibilityChecker3 = visibilityChecker;
            zSingleArgCreatorDefaultsToProperties = z11;
        }
        VisibilityChecker<?> visibilityChecker4 = visibilityChecker3;
        if (linkedList == null || c6367b.m11328p() || c6367b.m11329q()) {
            return;
        }
        basicDeserializerFactory.m11186b(deserializationContext, abstractC6340b, visibilityChecker4, annotationIntrospectorM11194c, c6367b, linkedList);
    }

    public void _addImplicitFactoryCreators(DeserializationContext deserializationContext, C6351c c6351c, List<C6366a> list) throws JsonMappingException {
        SettableBeanProperty[] settableBeanPropertyArr;
        BasicDeserializerFactory basicDeserializerFactory = this;
        AbstractC6340b abstractC6340b = c6351c.f10227b;
        C6367b c6367b = c6351c.f10229d;
        AnnotationIntrospector annotationIntrospectorM11194c = c6351c.m11194c();
        VisibilityChecker<?> visibilityChecker = c6351c.f10228c;
        Map<AnnotatedWithParams, AbstractC6414k[]> map = c6351c.f10230e;
        for (C6366a c6366a : list) {
            int iM11309g = c6366a.m11309g();
            AnnotatedWithParams annotatedWithParamsM11304b = c6366a.m11304b();
            AbstractC6414k[] abstractC6414kArr = map.get(annotatedWithParamsM11304b);
            if (iM11309g == 1) {
                AbstractC6414k abstractC6414kM11312j = c6366a.m11312j(0);
                if (basicDeserializerFactory.m11185a(annotationIntrospectorM11194c, annotatedWithParamsM11304b, abstractC6414kM11312j)) {
                    SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[iM11309g];
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    AnnotatedParameter annotatedParameter = null;
                    while (i11 < iM11309g) {
                        AnnotatedParameter parameter = annotatedWithParamsM11304b.getParameter(i11);
                        AbstractC6414k abstractC6414k = abstractC6414kArr == null ? null : abstractC6414kArr[i11];
                        JacksonInject.Value valueFindInjectableValue = annotationIntrospectorM11194c.findInjectableValue(parameter);
                        PropertyName fullName = abstractC6414k == null ? null : abstractC6414k.getFullName();
                        if (abstractC6414k == null || !abstractC6414k.mo11551x()) {
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            PropertyName propertyName = fullName;
                            if (valueFindInjectableValue != null) {
                                i13++;
                                basicDeserializerFactory = this;
                                settableBeanPropertyArr[i11] = basicDeserializerFactory.constructCreatorProperty(deserializationContext, abstractC6340b, propertyName, i11, parameter, valueFindInjectableValue);
                            } else {
                                basicDeserializerFactory = this;
                                if (annotationIntrospectorM11194c.findUnwrappingNameTransformer(parameter) != null) {
                                    basicDeserializerFactory._reportUnwrappedCreatorProperty(deserializationContext, abstractC6340b, parameter);
                                } else if (annotatedParameter == null) {
                                    annotatedParameter = parameter;
                                }
                            }
                        } else {
                            i12++;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            settableBeanPropertyArr[i11] = basicDeserializerFactory.constructCreatorProperty(deserializationContext, abstractC6340b, fullName, i11, parameter, valueFindInjectableValue);
                            basicDeserializerFactory = this;
                        }
                        i11++;
                        settableBeanPropertyArr2 = settableBeanPropertyArr;
                    }
                    SettableBeanProperty[] settableBeanPropertyArr3 = settableBeanPropertyArr2;
                    if (i12 > 0 || i13 > 0) {
                        if (i12 + i13 == iM11309g) {
                            c6367b.m11324l(annotatedWithParamsM11304b, false, settableBeanPropertyArr3);
                        } else if (i12 == 0 && i13 + 1 == iM11309g) {
                            c6367b.m11320h(annotatedWithParamsM11304b, false, settableBeanPropertyArr3, 0);
                        } else {
                            deserializationContext.reportBadTypeDefinition(abstractC6340b, "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(annotatedParameter == null ? -1 : annotatedParameter.getIndex()), annotatedWithParamsM11304b);
                        }
                    }
                } else {
                    basicDeserializerFactory._handleSingleArgumentCreator(c6367b, annotatedWithParamsM11304b, false, visibilityChecker.isCreatorVisible(annotatedWithParamsM11304b));
                    if (abstractC6414kM11312j != null) {
                        ((C6422s) abstractC6414kM11312j).m11655n0();
                    }
                }
            }
        }
    }

    public Map<AnnotatedWithParams, AbstractC6414k[]> _findCreatorsFromProperties(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b) throws JsonMappingException {
        Map<AnnotatedWithParams, AbstractC6414k[]> linkedHashMap = Collections.EMPTY_MAP;
        for (AbstractC6414k abstractC6414k : abstractC6340b.mo11169o()) {
            Iterator<AnnotatedParameter> itMo11537j = abstractC6414k.mo11537j();
            while (itMo11537j.hasNext()) {
                AnnotatedParameter next = itMo11537j.next();
                AnnotatedWithParams owner = next.getOwner();
                AbstractC6414k[] abstractC6414kArr = linkedHashMap.get(owner);
                int index = next.getIndex();
                if (abstractC6414kArr == null) {
                    if (linkedHashMap.isEmpty()) {
                        linkedHashMap = new LinkedHashMap<>();
                    }
                    abstractC6414kArr = new AbstractC6414k[owner.getParameterCount()];
                    linkedHashMap.put(owner, abstractC6414kArr);
                } else if (abstractC6414kArr[index] != null) {
                    deserializationContext.reportBadTypeDefinition(abstractC6340b, "Conflict: parameter #%d of %s bound to more than one property; %s vs %s", Integer.valueOf(index), owner, abstractC6414kArr[index], abstractC6414k);
                }
                abstractC6414kArr[index] = abstractC6414k;
            }
        }
        return linkedHashMap;
    }

    public AbstractC6390e<?> _findCustomArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b, AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e) throws JsonMappingException {
        Iterator<InterfaceC6363h> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            ArrayType arrayType2 = arrayType;
            DeserializationConfig deserializationConfig2 = deserializationConfig;
            AbstractC6340b abstractC6340b2 = abstractC6340b;
            AbstractC6428b abstractC6428b2 = abstractC6428b;
            AbstractC6390e<?> abstractC6390e2 = abstractC6390e;
            AbstractC6390e<?> abstractC6390eM11280c = it.next().m11280c(arrayType2, deserializationConfig2, abstractC6340b2, abstractC6428b2, abstractC6390e2);
            if (abstractC6390eM11280c != null) {
                return abstractC6390eM11280c;
            }
            arrayType = arrayType2;
            deserializationConfig = deserializationConfig2;
            abstractC6340b = abstractC6340b2;
            abstractC6428b = abstractC6428b2;
            abstractC6390e = abstractC6390e2;
        }
        return null;
    }

    public AbstractC6390e<Object> _findCustomBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b) throws JsonMappingException {
        Iterator<InterfaceC6363h> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            AbstractC6390e<?> abstractC6390eM11278a = it.next().m11278a(javaType, deserializationConfig, abstractC6340b);
            if (abstractC6390eM11278a != null) {
                return abstractC6390eM11278a;
            }
        }
        return null;
    }

    public AbstractC6390e<?> _findCustomCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b, AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e) throws JsonMappingException {
        Iterator<InterfaceC6363h> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            CollectionType collectionType2 = collectionType;
            DeserializationConfig deserializationConfig2 = deserializationConfig;
            AbstractC6340b abstractC6340b2 = abstractC6340b;
            AbstractC6428b abstractC6428b2 = abstractC6428b;
            AbstractC6390e<?> abstractC6390e2 = abstractC6390e;
            AbstractC6390e<?> abstractC6390eM11279b = it.next().m11279b(collectionType2, deserializationConfig2, abstractC6340b2, abstractC6428b2, abstractC6390e2);
            if (abstractC6390eM11279b != null) {
                return abstractC6390eM11279b;
            }
            collectionType = collectionType2;
            deserializationConfig = deserializationConfig2;
            abstractC6340b = abstractC6340b2;
            abstractC6428b = abstractC6428b2;
            abstractC6390e = abstractC6390e2;
        }
        return null;
    }

    public AbstractC6390e<?> _findCustomCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b, AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e) throws JsonMappingException {
        Iterator<InterfaceC6363h> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            CollectionLikeType collectionLikeType2 = collectionLikeType;
            DeserializationConfig deserializationConfig2 = deserializationConfig;
            AbstractC6340b abstractC6340b2 = abstractC6340b;
            AbstractC6428b abstractC6428b2 = abstractC6428b;
            AbstractC6390e<?> abstractC6390e2 = abstractC6390e;
            AbstractC6390e<?> abstractC6390eM11285h = it.next().m11285h(collectionLikeType2, deserializationConfig2, abstractC6340b2, abstractC6428b2, abstractC6390e2);
            if (abstractC6390eM11285h != null) {
                return abstractC6390eM11285h;
            }
            collectionLikeType = collectionLikeType2;
            deserializationConfig = deserializationConfig2;
            abstractC6340b = abstractC6340b2;
            abstractC6428b = abstractC6428b2;
            abstractC6390e = abstractC6390e2;
        }
        return null;
    }

    public AbstractC6390e<?> _findCustomEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b) throws JsonMappingException {
        Iterator<InterfaceC6363h> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            AbstractC6390e<?> abstractC6390eM11282e = it.next().m11282e(cls, deserializationConfig, abstractC6340b);
            if (abstractC6390eM11282e != null) {
                return abstractC6390eM11282e;
            }
        }
        return null;
    }

    public AbstractC6390e<?> _findCustomMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b, AbstractC6394i abstractC6394i, AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e) throws JsonMappingException {
        Iterator<InterfaceC6363h> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            MapType mapType2 = mapType;
            DeserializationConfig deserializationConfig2 = deserializationConfig;
            AbstractC6340b abstractC6340b2 = abstractC6340b;
            AbstractC6394i abstractC6394i2 = abstractC6394i;
            AbstractC6428b abstractC6428b2 = abstractC6428b;
            AbstractC6390e<?> abstractC6390e2 = abstractC6390e;
            AbstractC6390e<?> abstractC6390eM11286i = it.next().m11286i(mapType2, deserializationConfig2, abstractC6340b2, abstractC6394i2, abstractC6428b2, abstractC6390e2);
            if (abstractC6390eM11286i != null) {
                return abstractC6390eM11286i;
            }
            mapType = mapType2;
            deserializationConfig = deserializationConfig2;
            abstractC6340b = abstractC6340b2;
            abstractC6394i = abstractC6394i2;
            abstractC6428b = abstractC6428b2;
            abstractC6390e = abstractC6390e2;
        }
        return null;
    }

    public AbstractC6390e<?> _findCustomMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b, AbstractC6394i abstractC6394i, AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e) throws JsonMappingException {
        Iterator<InterfaceC6363h> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            MapLikeType mapLikeType2 = mapLikeType;
            DeserializationConfig deserializationConfig2 = deserializationConfig;
            AbstractC6340b abstractC6340b2 = abstractC6340b;
            AbstractC6394i abstractC6394i2 = abstractC6394i;
            AbstractC6428b abstractC6428b2 = abstractC6428b;
            AbstractC6390e<?> abstractC6390e2 = abstractC6390e;
            AbstractC6390e<?> abstractC6390eM11283f = it.next().m11283f(mapLikeType2, deserializationConfig2, abstractC6340b2, abstractC6394i2, abstractC6428b2, abstractC6390e2);
            if (abstractC6390eM11283f != null) {
                return abstractC6390eM11283f;
            }
            mapLikeType = mapLikeType2;
            deserializationConfig = deserializationConfig2;
            abstractC6340b = abstractC6340b2;
            abstractC6394i = abstractC6394i2;
            abstractC6428b = abstractC6428b2;
            abstractC6390e = abstractC6390e2;
        }
        return null;
    }

    public AbstractC6390e<?> _findCustomReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b, AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e) throws JsonMappingException {
        Iterator<InterfaceC6363h> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            ReferenceType referenceType2 = referenceType;
            DeserializationConfig deserializationConfig2 = deserializationConfig;
            AbstractC6340b abstractC6340b2 = abstractC6340b;
            AbstractC6428b abstractC6428b2 = abstractC6428b;
            AbstractC6390e<?> abstractC6390e2 = abstractC6390e;
            AbstractC6390e<?> abstractC6390eM11281d = it.next().m11281d(referenceType2, deserializationConfig2, abstractC6340b2, abstractC6428b2, abstractC6390e2);
            if (abstractC6390eM11281d != null) {
                return abstractC6390eM11281d;
            }
            referenceType = referenceType2;
            deserializationConfig = deserializationConfig2;
            abstractC6340b = abstractC6340b2;
            abstractC6428b = abstractC6428b2;
            abstractC6390e = abstractC6390e2;
        }
        return null;
    }

    public AbstractC6390e<?> _findCustomTreeNodeDeserializer(Class<? extends AbstractC6391f> cls, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b) throws JsonMappingException {
        Iterator<InterfaceC6363h> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            AbstractC6390e<?> abstractC6390eM11284g = it.next().m11284g(cls, deserializationConfig, abstractC6340b);
            if (abstractC6390eM11284g != null) {
                return abstractC6390eM11284g;
            }
        }
        return null;
    }

    @Deprecated
    public AnnotatedMethod _findJsonValueFor(DeserializationConfig deserializationConfig, JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return deserializationConfig.introspect(javaType).mo11165k();
    }

    public void _validateNamedPropertyParameter(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, C6366a c6366a, int i11, PropertyName propertyName, JacksonInject.Value value) throws JsonMappingException {
        if (propertyName == null && value == null) {
            deserializationContext.reportBadTypeDefinition(abstractC6340b, "Argument #%d of constructor %s has no property name (and is not Injectable): can not use as property-based Creator", Integer.valueOf(i11), c6366a);
        }
    }

    public EnumResolver constructEnumResolver(Class<?> cls, DeserializationConfig deserializationConfig, AnnotatedMember annotatedMember) {
        if (annotatedMember == null) {
            return EnumResolver.constructFor(deserializationConfig, cls);
        }
        if (deserializationConfig.canOverrideAccessModifiers()) {
            C6490g.m11936g(annotatedMember.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return EnumResolver.constructUsingMethod(deserializationConfig, cls, annotatedMember);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:53:0x010e  */
    /* JADX WARN: Code duplicated, block: B:56:0x011e A[LOOP:0: B:54:0x0118->B:56:0x011e, LOOP_END] */
    @Override // com.fasterxml.jackson.databind.deser.AbstractC6362g
    public AbstractC6390e<?> createMapDeserializer(DeserializationContext deserializationContext, MapType mapType, AbstractC6340b abstractC6340b) throws JsonMappingException {
        MapType mapType2;
        AbstractC6340b abstractC6340b2;
        DeserializationConfig deserializationConfig;
        AbstractC6390e<?> abstractC6390eM11251g;
        Iterator<AbstractC6357b> it;
        MapType mapType_mapAbstractMapType;
        AbstractC6340b abstractC6340bIntrospectForCreation;
        AbstractC6390e<?> abstractC6390e;
        MapType mapType3;
        AbstractC6390e<?> abstractC6390e2;
        JsonIgnoreProperties.Value defaultPropertyIgnorals;
        Set<String> setFindIgnoredForDeserialization;
        AbstractC6390e<?> abstractC6390eConstructForNonPOJO;
        ValueInstantiator valueInstantiatorFindValueInstantiator;
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType keyType = mapType.getKeyType();
        JavaType contentType = mapType.getContentType();
        AbstractC6390e abstractC6390e3 = (AbstractC6390e) contentType.getValueHandler();
        AbstractC6394i abstractC6394i = (AbstractC6394i) keyType.getValueHandler();
        AbstractC6428b abstractC6428bFindTypeDeserializer = (AbstractC6428b) contentType.getTypeHandler();
        if (abstractC6428bFindTypeDeserializer == null) {
            abstractC6428bFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        AbstractC6428b abstractC6428b = abstractC6428bFindTypeDeserializer;
        AbstractC6390e<?> abstractC6390e_findCustomMapDeserializer = _findCustomMapDeserializer(mapType, config, abstractC6340b, abstractC6394i, abstractC6428b, abstractC6390e3);
        if (abstractC6390e_findCustomMapDeserializer == null) {
            Class<?> rawClass = mapType.getRawClass();
            if (EnumMap.class.isAssignableFrom(rawClass)) {
                if (rawClass == EnumMap.class) {
                    abstractC6340b2 = abstractC6340b;
                    valueInstantiatorFindValueInstantiator = null;
                } else {
                    abstractC6340b2 = abstractC6340b;
                    valueInstantiatorFindValueInstantiator = findValueInstantiator(deserializationContext, abstractC6340b2);
                }
                if (!keyType.isEnumImplType()) {
                    throw new IllegalArgumentException("Cannot construct EnumMap; generic (key) type not available");
                }
                mapType2 = mapType;
                abstractC6390e_findCustomMapDeserializer = new EnumMapDeserializer(mapType2, valueInstantiatorFindValueInstantiator, null, abstractC6390e3, abstractC6428b, null);
            } else {
                mapType2 = mapType;
                abstractC6340b2 = abstractC6340b;
            }
            if (abstractC6390e_findCustomMapDeserializer == null) {
                abstractC6390e_findCustomMapDeserializer = abstractC6390e_findCustomMapDeserializer;
                if (mapType2.isInterface() || mapType2.isAbstract()) {
                    mapType_mapAbstractMapType = _mapAbstractMapType(mapType2, config);
                    if (mapType_mapAbstractMapType != null) {
                        mapType_mapAbstractMapType.getRawClass();
                        abstractC6340bIntrospectForCreation = config.introspectForCreation(mapType_mapAbstractMapType);
                    } else {
                        if (mapType2.getTypeHandler() == null) {
                            throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Map type " + mapType2);
                        }
                        abstractC6390eConstructForNonPOJO = AbstractDeserializer.constructForNonPOJO(abstractC6340b2);
                    }
                    if (abstractC6390e == null) {
                        abstractC6390e = abstractC6390e_findCustomMapDeserializer;
                        mapType3 = mapType_mapAbstractMapType;
                        MapDeserializer mapDeserializer = new MapDeserializer(mapType3, findValueInstantiator(deserializationContext, abstractC6340bIntrospectForCreation), abstractC6394i, abstractC6390e3, abstractC6428b);
                        defaultPropertyIgnorals = deserializationConfig.getDefaultPropertyIgnorals(Map.class, abstractC6340bIntrospectForCreation.mo11174t());
                        if (defaultPropertyIgnorals == null) {
                            deserializationConfig = config;
                            setFindIgnoredForDeserialization = null;
                        } else {
                            deserializationConfig = config;
                            setFindIgnoredForDeserialization = defaultPropertyIgnorals.findIgnoredForDeserialization();
                        }
                        mapDeserializer.setIgnorableProperties(setFindIgnoredForDeserialization);
                        JsonIncludeProperties.Value defaultPropertyInclusions = deserializationConfig.getDefaultPropertyInclusions(Map.class, abstractC6340bIntrospectForCreation.mo11174t());
                        mapDeserializer.setIncludableProperties(defaultPropertyInclusions != null ? defaultPropertyInclusions.getIncluded() : null);
                        abstractC6390e2 = mapDeserializer;
                    } else {
                        abstractC6390e = abstractC6390e_findCustomMapDeserializer;
                        deserializationConfig = config;
                        mapType3 = mapType_mapAbstractMapType;
                        abstractC6390e2 = abstractC6390e;
                    }
                    abstractC6340b2 = abstractC6340bIntrospectForCreation;
                    mapType2 = mapType3;
                    abstractC6390eM11251g = abstractC6390e2;
                } else {
                    AbstractC6390e<?> abstractC6390eM11359i = AbstractC6370e.m11359i(deserializationContext, mapType);
                    if (abstractC6390eM11359i != null) {
                        return abstractC6390eM11359i;
                    }
                    abstractC6390eConstructForNonPOJO = abstractC6390eM11359i;
                }
                mapType_mapAbstractMapType = mapType2;
                abstractC6340bIntrospectForCreation = abstractC6340b2;
                abstractC6390e = abstractC6390eConstructForNonPOJO;
                if (abstractC6390e == null) {
                    abstractC6390e = abstractC6390e_findCustomMapDeserializer;
                    mapType3 = mapType_mapAbstractMapType;
                    MapDeserializer mapDeserializer2 = new MapDeserializer(mapType3, findValueInstantiator(deserializationContext, abstractC6340bIntrospectForCreation), abstractC6394i, abstractC6390e3, abstractC6428b);
                    defaultPropertyIgnorals = deserializationConfig.getDefaultPropertyIgnorals(Map.class, abstractC6340bIntrospectForCreation.mo11174t());
                    if (defaultPropertyIgnorals == null) {
                        deserializationConfig = config;
                        setFindIgnoredForDeserialization = null;
                    } else {
                        deserializationConfig = config;
                        setFindIgnoredForDeserialization = defaultPropertyIgnorals.findIgnoredForDeserialization();
                    }
                    mapDeserializer2.setIgnorableProperties(setFindIgnoredForDeserialization);
                    JsonIncludeProperties.Value defaultPropertyInclusions2 = deserializationConfig.getDefaultPropertyInclusions(Map.class, abstractC6340bIntrospectForCreation.mo11174t());
                    mapDeserializer2.setIncludableProperties(defaultPropertyInclusions2 != null ? defaultPropertyInclusions2.getIncluded() : null);
                    abstractC6390e2 = mapDeserializer2;
                } else {
                    abstractC6390e = abstractC6390e_findCustomMapDeserializer;
                    deserializationConfig = config;
                    mapType3 = mapType_mapAbstractMapType;
                    abstractC6390e2 = abstractC6390e;
                }
                abstractC6340b2 = abstractC6340bIntrospectForCreation;
                mapType2 = mapType3;
                abstractC6390eM11251g = abstractC6390e2;
            }
            if (this._factoryConfig.hasDeserializerModifiers()) {
                it = this._factoryConfig.deserializerModifiers().iterator();
                abstractC6390eM11251g = abstractC6390eM11251g;
                while (it.hasNext()) {
                    abstractC6390eM11251g = it.next().m11251g(deserializationConfig, mapType2, abstractC6340b2, abstractC6390eM11251g);
                }
            }
            return abstractC6390eM11251g;
        }
        mapType2 = mapType;
        abstractC6340b2 = abstractC6340b;
        abstractC6390e_findCustomMapDeserializer = abstractC6390e_findCustomMapDeserializer;
        deserializationConfig = config;
        abstractC6390eM11251g = abstractC6390e_findCustomMapDeserializer;
        if (this._factoryConfig.hasDeserializerModifiers()) {
            it = this._factoryConfig.deserializerModifiers().iterator();
            abstractC6390eM11251g = abstractC6390eM11251g;
            while (it.hasNext()) {
                abstractC6390eM11251g = it.next().m11251g(deserializationConfig, mapType2, abstractC6340b2, abstractC6390eM11251g);
            }
        }
        return abstractC6390eM11251g;
    }

    /* JADX INFO: renamed from: d */
    public final PropertyName m11188d(AnnotatedParameter annotatedParameter, AnnotationIntrospector annotationIntrospector) {
        if (annotationIntrospector == null) {
            return null;
        }
        PropertyName propertyNameFindNameForDeserialization = annotationIntrospector.findNameForDeserialization(annotatedParameter);
        if (propertyNameFindNameForDeserialization != null && !propertyNameFindNameForDeserialization.isEmpty()) {
            return propertyNameFindNameForDeserialization;
        }
        String strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedParameter);
        if (strFindImplicitPropertyName == null || strFindImplicitPropertyName.isEmpty()) {
            return null;
        }
        return PropertyName.construct(strFindImplicitPropertyName);
    }

    public AbstractC6390e<?> findOptionalStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC6340b abstractC6340b) throws JsonMappingException {
        return OptionalHandlerFactory.instance.findDeserializer(javaType, deserializationContext.getConfig(), abstractC6340b);
    }

    public DeserializerFactoryConfig getFactoryConfig() {
        return this._factoryConfig;
    }

    @Override // com.fasterxml.jackson.databind.deser.AbstractC6362g
    public final AbstractC6362g withAbstractTypeResolver(AbstractC6339a abstractC6339a) {
        return withConfig(this._factoryConfig.withAbstractTypeResolver(abstractC6339a));
    }

    @Override // com.fasterxml.jackson.databind.deser.AbstractC6362g
    public final AbstractC6362g withAdditionalDeserializers(InterfaceC6363h interfaceC6363h) {
        return withConfig(this._factoryConfig.withAdditionalDeserializers(interfaceC6363h));
    }

    @Override // com.fasterxml.jackson.databind.deser.AbstractC6362g
    public final AbstractC6362g withAdditionalKeyDeserializers(InterfaceC6364i interfaceC6364i) {
        return withConfig(this._factoryConfig.withAdditionalKeyDeserializers(interfaceC6364i));
    }

    @Override // com.fasterxml.jackson.databind.deser.AbstractC6362g
    public final AbstractC6362g withDeserializerModifier(AbstractC6357b abstractC6357b) {
        return withConfig(this._factoryConfig.withDeserializerModifier(abstractC6357b));
    }

    @Override // com.fasterxml.jackson.databind.deser.AbstractC6362g
    public final AbstractC6362g withValueInstantiators(InterfaceC6378m interfaceC6378m) {
        return withConfig(this._factoryConfig.withValueInstantiators(interfaceC6378m));
    }

    public BasicDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        this._factoryConfig = deserializerFactoryConfig;
    }

    public void _addExplicitAnyCreator(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, C6367b c6367b, C6366a c6366a, ConstructorDetector constructorDetector) throws JsonMappingException {
        PropertyName propertyName;
        boolean z11;
        int iM11307e;
        if (1 != c6366a.m11309g()) {
            if (!constructorDetector.singleArgCreatorDefaultsToProperties() && (iM11307e = c6366a.m11307e()) >= 0 && (constructorDetector.singleArgCreatorDefaultsToDelegating() || c6366a.m11310h(iM11307e) == null)) {
                _addExplicitDelegatingCreator(deserializationContext, abstractC6340b, c6367b, c6366a);
                return;
            } else {
                _addExplicitPropertyCreator(deserializationContext, abstractC6340b, c6367b, c6366a);
                return;
            }
        }
        AnnotatedParameter annotatedParameterM11311i = c6366a.m11311i(0);
        JacksonInject.Value valueM11308f = c6366a.m11308f(0);
        int i11 = C6349a.f10223b[constructorDetector.singleArgMode().ordinal()];
        if (i11 == 1) {
            propertyName = null;
            z11 = false;
        } else if (i11 == 2) {
            PropertyName propertyNameM11310h = c6366a.m11310h(0);
            if (propertyNameM11310h == null) {
                _validateNamedPropertyParameter(deserializationContext, abstractC6340b, c6366a, 0, propertyNameM11310h, valueM11308f);
            }
            propertyName = propertyNameM11310h;
            z11 = true;
        } else if (i11 != 3) {
            AbstractC6414k abstractC6414kM11312j = c6366a.m11312j(0);
            PropertyName propertyNameM11305c = c6366a.m11305c(0);
            z11 = (propertyNameM11305c == null && valueM11308f == null) ? false : true;
            if (!z11 && abstractC6414kM11312j != null) {
                propertyNameM11305c = c6366a.m11310h(0);
                z11 = propertyNameM11305c != null && abstractC6414kM11312j.mo11529b();
            }
            propertyName = propertyNameM11305c;
        } else {
            deserializationContext.reportBadTypeDefinition(abstractC6340b, "Single-argument constructor (%s) is annotated but no 'mode' defined; `CreatorDetector`configured with `SingleArgConstructor.REQUIRE_MODE`", c6366a.m11304b());
            return;
        }
        if (z11) {
            c6367b.m11324l(c6366a.m11304b(), true, new SettableBeanProperty[]{constructCreatorProperty(deserializationContext, abstractC6340b, propertyName, 0, annotatedParameterM11311i, valueM11308f)});
            return;
        }
        _handleSingleArgumentCreator(c6367b, c6366a.m11304b(), true, true);
        AbstractC6414k abstractC6414kM11312j2 = c6366a.m11312j(0);
        if (abstractC6414kM11312j2 != null) {
            ((C6422s) abstractC6414kM11312j2).m11655n0();
        }
    }

    public void _addExplicitDelegatingCreator(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, C6367b c6367b, C6366a c6366a) throws JsonMappingException {
        DeserializationContext deserializationContext2;
        AbstractC6340b abstractC6340b2;
        int iM11309g = c6366a.m11309g();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[iM11309g];
        int i11 = -1;
        int i12 = 0;
        while (i12 < iM11309g) {
            AnnotatedParameter annotatedParameterM11311i = c6366a.m11311i(i12);
            JacksonInject.Value valueM11308f = c6366a.m11308f(i12);
            if (valueM11308f != null) {
                deserializationContext2 = deserializationContext;
                abstractC6340b2 = abstractC6340b;
                settableBeanPropertyArr[i12] = constructCreatorProperty(deserializationContext2, abstractC6340b2, null, i12, annotatedParameterM11311i, valueM11308f);
            } else {
                deserializationContext2 = deserializationContext;
                abstractC6340b2 = abstractC6340b;
                if (i11 < 0) {
                    i11 = i12;
                } else {
                    deserializationContext2.reportBadTypeDefinition(abstractC6340b2, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i11), Integer.valueOf(i12), c6366a);
                }
            }
            i12++;
            deserializationContext = deserializationContext2;
            abstractC6340b = abstractC6340b2;
        }
        DeserializationContext deserializationContext3 = deserializationContext;
        AbstractC6340b abstractC6340b3 = abstractC6340b;
        if (i11 < 0) {
            deserializationContext3.reportBadTypeDefinition(abstractC6340b3, "No argument left as delegating for Creator %s: exactly one required", c6366a);
        }
        if (iM11309g == 1) {
            _handleSingleArgumentCreator(c6367b, c6366a.m11304b(), true, true);
            AbstractC6414k abstractC6414kM11312j = c6366a.m11312j(0);
            if (abstractC6414kM11312j != null) {
                ((C6422s) abstractC6414kM11312j).m11655n0();
                return;
            }
            return;
        }
        c6367b.m11320h(c6366a.m11304b(), true, settableBeanPropertyArr, i11);
    }

    public void _addExplicitPropertyCreator(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, C6367b c6367b, C6366a c6366a) throws JsonMappingException {
        DeserializationContext deserializationContext2;
        C6366a c6366a2;
        AbstractC6340b abstractC6340b2;
        PropertyName propertyName;
        BasicDeserializerFactory basicDeserializerFactory;
        int iM11309g = c6366a.m11309g();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[iM11309g];
        int i11 = 0;
        while (i11 < iM11309g) {
            JacksonInject.Value valueM11308f = c6366a.m11308f(i11);
            AnnotatedParameter annotatedParameterM11311i = c6366a.m11311i(i11);
            PropertyName propertyNameM11310h = c6366a.m11310h(i11);
            if (propertyNameM11310h == null) {
                if (deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(annotatedParameterM11311i) != null) {
                    _reportUnwrappedCreatorProperty(deserializationContext, abstractC6340b, annotatedParameterM11311i);
                }
                PropertyName propertyNameM11306d = c6366a.m11306d(i11);
                basicDeserializerFactory = this;
                deserializationContext2 = deserializationContext;
                abstractC6340b2 = abstractC6340b;
                C6366a c6366a3 = c6366a;
                basicDeserializerFactory._validateNamedPropertyParameter(deserializationContext2, abstractC6340b2, c6366a3, i11, propertyNameM11306d, valueM11308f);
                c6366a2 = c6366a3;
                propertyName = propertyNameM11306d;
            } else {
                deserializationContext2 = deserializationContext;
                c6366a2 = c6366a;
                abstractC6340b2 = abstractC6340b;
                propertyName = propertyNameM11310h;
                basicDeserializerFactory = this;
            }
            settableBeanPropertyArr[i11] = basicDeserializerFactory.constructCreatorProperty(deserializationContext2, abstractC6340b2, propertyName, i11, annotatedParameterM11311i, valueM11308f);
            i11++;
            c6366a = c6366a2;
            deserializationContext = deserializationContext2;
            abstractC6340b = abstractC6340b2;
        }
        c6367b.m11324l(c6366a.m11304b(), true, settableBeanPropertyArr);
    }

    public void _addRecordConstructor(DeserializationContext deserializationContext, C6351c c6351c, AnnotatedConstructor annotatedConstructor, List<String> list) throws JsonMappingException {
        int parameterCount = annotatedConstructor.getParameterCount();
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[parameterCount];
        int i11 = 0;
        while (i11 < parameterCount) {
            AnnotatedParameter parameter = annotatedConstructor.getParameter(i11);
            JacksonInject.Value valueFindInjectableValue = annotationIntrospector.findInjectableValue(parameter);
            PropertyName propertyNameFindNameForDeserialization = annotationIntrospector.findNameForDeserialization(parameter);
            if (propertyNameFindNameForDeserialization == null || propertyNameFindNameForDeserialization.isEmpty()) {
                propertyNameFindNameForDeserialization = PropertyName.construct(list.get(i11));
            }
            DeserializationContext deserializationContext2 = deserializationContext;
            settableBeanPropertyArr[i11] = constructCreatorProperty(deserializationContext2, c6351c.f10227b, propertyNameFindNameForDeserialization, i11, parameter, valueFindInjectableValue);
            i11++;
            deserializationContext = deserializationContext2;
        }
        c6351c.f10229d.m11324l(annotatedConstructor, false, settableBeanPropertyArr);
    }

    public ValueInstantiator _constructDefaultValueInstantiator(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b) throws JsonMappingException {
        ArrayList arrayList;
        AnnotatedConstructor annotatedConstructorM94408a;
        DeserializationConfig config = deserializationContext.getConfig();
        VisibilityChecker<?> defaultVisibilityChecker = config.getDefaultVisibilityChecker(abstractC6340b.m11172r(), abstractC6340b.mo11174t());
        ConstructorDetector constructorDetector = config.getConstructorDetector();
        C6351c c6351c = new C6351c(deserializationContext, abstractC6340b, defaultVisibilityChecker, new C6367b(abstractC6340b, config), _findCreatorsFromProperties(deserializationContext, abstractC6340b));
        _addExplicitFactoryCreators(deserializationContext, c6351c, !constructorDetector.requireCtorAnnotation());
        if (abstractC6340b.m11151A().isConcrete()) {
            if (abstractC6340b.m11151A().isRecordType() && (annotatedConstructorM94408a = C42986a.m94408a(deserializationContext, abstractC6340b, (arrayList = new ArrayList()))) != null) {
                _addRecordConstructor(deserializationContext, c6351c, annotatedConstructorM94408a, arrayList);
                return c6351c.f10229d.m11326n(deserializationContext);
            }
            if (!abstractC6340b.m11154D()) {
                _addExplicitConstructorCreators(deserializationContext, c6351c, constructorDetector.shouldIntrospectorImplicitConstructors(abstractC6340b.m11172r()));
                if (c6351c.m11197f() && !c6351c.m11195d()) {
                    _addImplicitConstructorCreators(deserializationContext, c6351c, c6351c.m11199h());
                }
            }
        }
        if (c6351c.m11198g() && !c6351c.m11196e() && !c6351c.m11195d()) {
            _addImplicitFactoryCreators(deserializationContext, c6351c, c6351c.m11200i());
        }
        return c6351c.f10229d.m11326n(deserializationContext);
    }

    public JavaType _findRemappedType(DeserializationConfig deserializationConfig, Class<?> cls) throws JsonMappingException {
        JavaType javaTypeMapAbstractType = mapAbstractType(deserializationConfig, deserializationConfig.constructType(cls));
        if (javaTypeMapAbstractType != null && !javaTypeMapAbstractType.hasRawClass(cls)) {
            return javaTypeMapAbstractType;
        }
        return null;
    }

    public PropertyMetadata _getSetterInfo(DeserializationContext deserializationContext, BeanProperty beanProperty, PropertyMetadata propertyMetadata) {
        Nulls nullsNonDefaultContentNulls;
        JsonSetter.Value valueFindSetterInfo;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotatedMember member = beanProperty.getMember();
        Nulls nullsNonDefaultValueNulls = null;
        if (member != null) {
            if (annotationIntrospector != null && (valueFindSetterInfo = annotationIntrospector.findSetterInfo(member)) != null) {
                nullsNonDefaultValueNulls = valueFindSetterInfo.nonDefaultValueNulls();
                nullsNonDefaultContentNulls = valueFindSetterInfo.nonDefaultContentNulls();
            } else {
                nullsNonDefaultContentNulls = null;
            }
            JsonSetter.Value setterInfo = config.getConfigOverride(beanProperty.getType().getRawClass()).getSetterInfo();
            if (setterInfo != null) {
                if (nullsNonDefaultValueNulls == null) {
                    nullsNonDefaultValueNulls = setterInfo.nonDefaultValueNulls();
                }
                if (nullsNonDefaultContentNulls == null) {
                    nullsNonDefaultContentNulls = setterInfo.nonDefaultContentNulls();
                }
            }
        } else {
            nullsNonDefaultContentNulls = null;
        }
        JsonSetter.Value defaultSetterInfo = config.getDefaultSetterInfo();
        if (nullsNonDefaultValueNulls == null) {
            nullsNonDefaultValueNulls = defaultSetterInfo.nonDefaultValueNulls();
        }
        if (nullsNonDefaultContentNulls == null) {
            nullsNonDefaultContentNulls = defaultSetterInfo.nonDefaultContentNulls();
        }
        if (nullsNonDefaultValueNulls == null && nullsNonDefaultContentNulls == null) {
            return propertyMetadata;
        }
        return propertyMetadata.withNulls(nullsNonDefaultValueNulls, nullsNonDefaultContentNulls);
    }

    public boolean _hasCreatorAnnotation(DeserializationContext deserializationContext, AbstractC6404a abstractC6404a) {
        JsonCreator.Mode modeFindCreatorAnnotation;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (modeFindCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), abstractC6404a)) == null || modeFindCreatorAnnotation == JsonCreator.Mode.DISABLED) {
            return false;
        }
        return true;
    }

    public CollectionType _mapAbstractCollectionType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class<?> clsM11190a = C6350b.m11190a(javaType);
        if (clsM11190a != null) {
            return (CollectionType) deserializationConfig.getTypeFactory().constructSpecializedType(javaType, clsM11190a, true);
        }
        return null;
    }

    public MapType _mapAbstractMapType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class<?> clsM11191b = C6350b.m11191b(javaType);
        if (clsM11191b != null) {
            return (MapType) deserializationConfig.getTypeFactory().constructSpecializedType(javaType, clsM11191b, true);
        }
        return null;
    }

    public void _reportUnwrappedCreatorProperty(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, AnnotatedParameter annotatedParameter) throws JsonMappingException {
        deserializationContext.reportBadTypeDefinition(abstractC6340b, "Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", Integer.valueOf(annotatedParameter.getIndex()));
    }

    /* JADX INFO: renamed from: b */
    public final void m11186b(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, C6367b c6367b, List<AnnotatedWithParams> list) throws JsonMappingException {
        int i11;
        Iterator<AnnotatedWithParams> it = list.iterator();
        AnnotatedWithParams annotatedWithParams = null;
        AnnotatedWithParams annotatedWithParams2 = null;
        SettableBeanProperty[] settableBeanPropertyArr = null;
        while (true) {
            if (it.hasNext()) {
                AnnotatedWithParams next = it.next();
                if (visibilityChecker.isCreatorVisible(next)) {
                    int parameterCount = next.getParameterCount();
                    SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[parameterCount];
                    int i12 = 0;
                    while (true) {
                        if (i12 < parameterCount) {
                            AnnotatedParameter parameter = next.getParameter(i12);
                            PropertyName propertyNameM11188d = m11188d(parameter, annotationIntrospector);
                            if (propertyNameM11188d == null || propertyNameM11188d.isEmpty()) {
                                break;
                            }
                            settableBeanPropertyArr2[i12] = constructCreatorProperty(deserializationContext, abstractC6340b, propertyNameM11188d, parameter.getIndex(), parameter, null);
                            i12++;
                        } else {
                            if (annotatedWithParams2 == null) {
                                annotatedWithParams2 = next;
                                settableBeanPropertyArr = settableBeanPropertyArr2;
                                break;
                            }
                            break;
                        }
                    }
                }
            } else {
                annotatedWithParams = annotatedWithParams2;
                break;
            }
        }
        if (annotatedWithParams != null) {
            c6367b.m11324l(annotatedWithParams, false, settableBeanPropertyArr);
            C6413j c6413j = (C6413j) abstractC6340b;
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                PropertyName fullName = settableBeanProperty.getFullName();
                if (!c6413j.m11525M(fullName)) {
                    c6413j.m11522G(C6498o.m12001z(deserializationContext.getConfig(), settableBeanProperty.getMember(), fullName));
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC6394i m11187c(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        AbstractC6340b abstractC6340bIntrospect = config.introspect(javaType);
        AbstractC6394i abstractC6394iFindKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, abstractC6340bIntrospect.mo11174t());
        if (abstractC6394iFindKeyDeserializerFromAnnotation != null) {
            return abstractC6394iFindKeyDeserializerFromAnnotation;
        }
        AbstractC6390e<?> abstractC6390e_findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, abstractC6340bIntrospect);
        if (abstractC6390e_findCustomEnumDeserializer != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, abstractC6390e_findCustomEnumDeserializer);
        }
        AbstractC6390e<Object> abstractC6390eFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, abstractC6340bIntrospect.mo11174t());
        if (abstractC6390eFindDeserializerFromAnnotation != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, abstractC6390eFindDeserializerFromAnnotation);
        }
        EnumResolver enumResolverConstructEnumResolver = constructEnumResolver(rawClass, config, abstractC6340bIntrospect.mo11164j());
        for (AnnotatedMethod annotatedMethod : abstractC6340bIntrospect.mo11177w()) {
            if (_hasCreatorAnnotation(deserializationContext, annotatedMethod)) {
                if (annotatedMethod.getParameterCount() == 1 && annotatedMethod.getRawReturnType().isAssignableFrom(rawClass)) {
                    if (annotatedMethod.getRawParameterType(0) == String.class) {
                        if (config.canOverrideAccessModifiers()) {
                            C6490g.m11936g(annotatedMethod.getMember(), deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                        }
                        return StdKeyDeserializers.constructEnumKeyDeserializer(enumResolverConstructEnumResolver, annotatedMethod);
                    }
                } else {
                    throw new IllegalArgumentException("Unsuitable method (" + annotatedMethod + ") decorated with @JsonCreator (for Enum type " + rawClass.getName() + ")");
                }
            }
        }
        return StdKeyDeserializers.constructEnumKeyDeserializer(enumResolverConstructEnumResolver);
    }

    @Override // com.fasterxml.jackson.databind.deser.AbstractC6362g
    public AbstractC6390e<?> createArrayDeserializer(DeserializationContext deserializationContext, ArrayType arrayType, AbstractC6340b abstractC6340b) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType contentType = arrayType.getContentType();
        AbstractC6390e<?> abstractC6390e = (AbstractC6390e) contentType.getValueHandler();
        AbstractC6428b abstractC6428bFindTypeDeserializer = (AbstractC6428b) contentType.getTypeHandler();
        if (abstractC6428bFindTypeDeserializer == null) {
            abstractC6428bFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        AbstractC6428b abstractC6428b = abstractC6428bFindTypeDeserializer;
        AbstractC6390e<?> abstractC6390e_findCustomArrayDeserializer = _findCustomArrayDeserializer(arrayType, config, abstractC6340b, abstractC6428b, abstractC6390e);
        if (abstractC6390e_findCustomArrayDeserializer == null) {
            if (abstractC6390e == null) {
                Class<?> rawClass = contentType.getRawClass();
                if (contentType.isPrimitive()) {
                    return PrimitiveArrayDeserializers.forType(rawClass);
                }
                if (rawClass == String.class) {
                    return StringArrayDeserializer.instance;
                }
            }
            abstractC6390e_findCustomArrayDeserializer = new ObjectArrayDeserializer(arrayType, abstractC6390e, abstractC6428b);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<AbstractC6357b> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                abstractC6390e_findCustomArrayDeserializer = it.next().m11245a(config, arrayType, abstractC6340b, abstractC6390e_findCustomArrayDeserializer);
            }
        }
        return abstractC6390e_findCustomArrayDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.AbstractC6362g
    public AbstractC6390e<?> createCollectionDeserializer(DeserializationContext deserializationContext, CollectionType collectionType, AbstractC6340b abstractC6340b) throws JsonMappingException {
        AbstractC6340b abstractC6340bIntrospectForCreation;
        AbstractC6390e<?> collectionDeserializer;
        JavaType contentType = collectionType.getContentType();
        AbstractC6390e<?> abstractC6390e = (AbstractC6390e) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        AbstractC6428b abstractC6428bFindTypeDeserializer = (AbstractC6428b) contentType.getTypeHandler();
        if (abstractC6428bFindTypeDeserializer == null) {
            abstractC6428bFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        CollectionType collectionType2 = collectionType;
        AbstractC6428b abstractC6428b = abstractC6428bFindTypeDeserializer;
        AbstractC6390e<?> abstractC6390e_findCustomCollectionDeserializer = _findCustomCollectionDeserializer(collectionType2, config, abstractC6340b, abstractC6428b, abstractC6390e);
        if (abstractC6390e_findCustomCollectionDeserializer == null) {
            Class<?> rawClass = collectionType2.getRawClass();
            if (abstractC6390e == null && EnumSet.class.isAssignableFrom(rawClass)) {
                abstractC6390e_findCustomCollectionDeserializer = new EnumSetDeserializer(contentType, null);
            }
        }
        if (abstractC6390e_findCustomCollectionDeserializer == null) {
            if (!collectionType2.isInterface() && !collectionType2.isAbstract()) {
                abstractC6340bIntrospectForCreation = abstractC6340b;
            } else {
                CollectionType collectionType_mapAbstractCollectionType = _mapAbstractCollectionType(collectionType2, config);
                if (collectionType_mapAbstractCollectionType == null) {
                    if (collectionType2.getTypeHandler() != null) {
                        abstractC6390e_findCustomCollectionDeserializer = AbstractDeserializer.constructForNonPOJO(abstractC6340b);
                        abstractC6340bIntrospectForCreation = abstractC6340b;
                    } else {
                        throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Collection type " + collectionType2);
                    }
                } else {
                    collectionType2 = collectionType_mapAbstractCollectionType;
                    abstractC6340bIntrospectForCreation = config.introspectForCreation(collectionType_mapAbstractCollectionType);
                }
            }
            if (abstractC6390e_findCustomCollectionDeserializer == null) {
                ValueInstantiator valueInstantiatorFindValueInstantiator = findValueInstantiator(deserializationContext, abstractC6340bIntrospectForCreation);
                if (!valueInstantiatorFindValueInstantiator.canCreateUsingDefault()) {
                    if (collectionType2.hasRawClass(ArrayBlockingQueue.class)) {
                        return new ArrayBlockingQueueDeserializer(collectionType2, abstractC6390e, abstractC6428b, valueInstantiatorFindValueInstantiator);
                    }
                    AbstractC6390e<?> abstractC6390eM11358h = AbstractC6370e.m11358h(deserializationContext, collectionType2);
                    if (abstractC6390eM11358h != null) {
                        return abstractC6390eM11358h;
                    }
                }
                if (contentType.hasRawClass(String.class)) {
                    collectionDeserializer = new StringCollectionDeserializer(collectionType2, abstractC6390e, valueInstantiatorFindValueInstantiator);
                } else {
                    collectionDeserializer = new CollectionDeserializer(collectionType2, abstractC6390e, abstractC6428b, valueInstantiatorFindValueInstantiator);
                }
                abstractC6390e_findCustomCollectionDeserializer = collectionDeserializer;
            }
        } else {
            abstractC6340bIntrospectForCreation = abstractC6340b;
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<AbstractC6357b> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                abstractC6390e_findCustomCollectionDeserializer = it.next().m11246b(config, collectionType2, abstractC6340bIntrospectForCreation, abstractC6390e_findCustomCollectionDeserializer);
            }
        }
        return abstractC6390e_findCustomCollectionDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.AbstractC6362g
    public AbstractC6390e<?> createCollectionLikeDeserializer(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, AbstractC6340b abstractC6340b) throws JsonMappingException {
        JavaType contentType = collectionLikeType.getContentType();
        AbstractC6390e<?> abstractC6390e = (AbstractC6390e) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        AbstractC6428b abstractC6428bFindTypeDeserializer = (AbstractC6428b) contentType.getTypeHandler();
        if (abstractC6428bFindTypeDeserializer == null) {
            abstractC6428bFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        AbstractC6390e<?> abstractC6390e_findCustomCollectionLikeDeserializer = _findCustomCollectionLikeDeserializer(collectionLikeType, config, abstractC6340b, abstractC6428bFindTypeDeserializer, abstractC6390e);
        if (abstractC6390e_findCustomCollectionLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<AbstractC6357b> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                abstractC6390e_findCustomCollectionLikeDeserializer = it.next().m11247c(config, collectionLikeType, abstractC6340b, abstractC6390e_findCustomCollectionLikeDeserializer);
            }
        }
        return abstractC6390e_findCustomCollectionLikeDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.AbstractC6362g
    public AbstractC6390e<?> createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC6340b abstractC6340b) throws JsonMappingException {
        SettableBeanProperty[] fromObjectArguments;
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        AbstractC6390e<?> abstractC6390e_findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, abstractC6340b);
        if (abstractC6390e_findCustomEnumDeserializer == null) {
            if (rawClass == Enum.class) {
                return AbstractDeserializer.constructForNonPOJO(abstractC6340b);
            }
            ValueInstantiator valueInstantiator_constructDefaultValueInstantiator = _constructDefaultValueInstantiator(deserializationContext, abstractC6340b);
            if (valueInstantiator_constructDefaultValueInstantiator == null) {
                fromObjectArguments = null;
            } else {
                fromObjectArguments = valueInstantiator_constructDefaultValueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            }
            for (AnnotatedMethod annotatedMethod : abstractC6340b.mo11177w()) {
                if (_hasCreatorAnnotation(deserializationContext, annotatedMethod)) {
                    if (annotatedMethod.getParameterCount() == 0) {
                        abstractC6390e_findCustomEnumDeserializer = EnumDeserializer.deserializerForNoArgsCreator(config, rawClass, annotatedMethod);
                        break;
                    }
                    if (!annotatedMethod.getRawReturnType().isAssignableFrom(rawClass)) {
                        deserializationContext.reportBadDefinition(javaType, String.format("Invalid `@JsonCreator` annotated Enum factory method [%s]: needs to return compatible type", annotatedMethod.toString()));
                    }
                    abstractC6390e_findCustomEnumDeserializer = EnumDeserializer.deserializerForCreator(config, rawClass, annotatedMethod, valueInstantiator_constructDefaultValueInstantiator, fromObjectArguments);
                    break;
                }
            }
            if (abstractC6390e_findCustomEnumDeserializer == null) {
                abstractC6390e_findCustomEnumDeserializer = new EnumDeserializer(constructEnumResolver(rawClass, config, abstractC6340b.mo11164j()), Boolean.valueOf(config.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)));
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<AbstractC6357b> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                abstractC6390e_findCustomEnumDeserializer = it.next().m11249e(config, javaType, abstractC6340b, abstractC6390e_findCustomEnumDeserializer);
            }
        }
        return abstractC6390e_findCustomEnumDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.AbstractC6362g
    public AbstractC6394i createKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        AbstractC6340b abstractC6340bIntrospectClassAnnotations;
        DeserializationConfig config = deserializationContext.getConfig();
        AbstractC6394i abstractC6394iM11250f = null;
        if (this._factoryConfig.hasKeyDeserializers()) {
            abstractC6340bIntrospectClassAnnotations = config.introspectClassAnnotations(javaType);
            Iterator<InterfaceC6364i> it = this._factoryConfig.keyDeserializers().iterator();
            while (it.hasNext() && (abstractC6394iM11250f = it.next().findKeyDeserializer(javaType, config, abstractC6340bIntrospectClassAnnotations)) == null) {
            }
        } else {
            abstractC6340bIntrospectClassAnnotations = null;
        }
        if (abstractC6394iM11250f == null) {
            if (abstractC6340bIntrospectClassAnnotations == null) {
                abstractC6340bIntrospectClassAnnotations = config.introspectClassAnnotations(javaType.getRawClass());
            }
            abstractC6394iM11250f = findKeyDeserializerFromAnnotation(deserializationContext, abstractC6340bIntrospectClassAnnotations.mo11174t());
            if (abstractC6394iM11250f == null) {
                if (javaType.isEnumType()) {
                    abstractC6394iM11250f = m11187c(deserializationContext, javaType);
                } else {
                    abstractC6394iM11250f = StdKeyDeserializers.findStringBasedKeyDeserializer(config, javaType);
                }
            }
        }
        if (abstractC6394iM11250f != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<AbstractC6357b> it2 = this._factoryConfig.deserializerModifiers().iterator();
            while (it2.hasNext()) {
                abstractC6394iM11250f = it2.next().m11250f(config, javaType, abstractC6394iM11250f);
            }
        }
        return abstractC6394iM11250f;
    }

    @Override // com.fasterxml.jackson.databind.deser.AbstractC6362g
    public AbstractC6390e<?> createMapLikeDeserializer(DeserializationContext deserializationContext, MapLikeType mapLikeType, AbstractC6340b abstractC6340b) throws JsonMappingException {
        JavaType keyType = mapLikeType.getKeyType();
        JavaType contentType = mapLikeType.getContentType();
        DeserializationConfig config = deserializationContext.getConfig();
        AbstractC6390e<?> abstractC6390e = (AbstractC6390e) contentType.getValueHandler();
        AbstractC6394i abstractC6394i = (AbstractC6394i) keyType.getValueHandler();
        AbstractC6428b abstractC6428bFindTypeDeserializer = (AbstractC6428b) contentType.getTypeHandler();
        if (abstractC6428bFindTypeDeserializer == null) {
            abstractC6428bFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        AbstractC6390e<?> abstractC6390e_findCustomMapLikeDeserializer = _findCustomMapLikeDeserializer(mapLikeType, config, abstractC6340b, abstractC6394i, abstractC6428bFindTypeDeserializer, abstractC6390e);
        if (abstractC6390e_findCustomMapLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<AbstractC6357b> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                abstractC6390e_findCustomMapLikeDeserializer = it.next().m11252h(config, mapLikeType, abstractC6340b, abstractC6390e_findCustomMapLikeDeserializer);
            }
        }
        return abstractC6390e_findCustomMapLikeDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.AbstractC6362g
    public AbstractC6390e<?> createReferenceDeserializer(DeserializationContext deserializationContext, ReferenceType referenceType, AbstractC6340b abstractC6340b) throws JsonMappingException {
        ValueInstantiator valueInstantiatorFindValueInstantiator;
        JavaType contentType = referenceType.getContentType();
        AbstractC6390e<?> abstractC6390e = (AbstractC6390e) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        AbstractC6428b abstractC6428bFindTypeDeserializer = (AbstractC6428b) contentType.getTypeHandler();
        if (abstractC6428bFindTypeDeserializer == null) {
            abstractC6428bFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        AbstractC6428b abstractC6428b = abstractC6428bFindTypeDeserializer;
        AbstractC6390e<?> abstractC6390e_findCustomReferenceDeserializer = _findCustomReferenceDeserializer(referenceType, config, abstractC6340b, abstractC6428b, abstractC6390e);
        if (abstractC6390e_findCustomReferenceDeserializer == null && referenceType.isTypeOrSubTypeOf(AtomicReference.class)) {
            if (referenceType.getRawClass() == AtomicReference.class) {
                valueInstantiatorFindValueInstantiator = null;
            } else {
                valueInstantiatorFindValueInstantiator = findValueInstantiator(deserializationContext, abstractC6340b);
            }
            return new AtomicReferenceDeserializer(referenceType, valueInstantiatorFindValueInstantiator, abstractC6428b, abstractC6390e);
        }
        if (abstractC6390e_findCustomReferenceDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<AbstractC6357b> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                abstractC6390e_findCustomReferenceDeserializer = it.next().m11253i(config, referenceType, abstractC6340b, abstractC6390e_findCustomReferenceDeserializer);
            }
        }
        return abstractC6390e_findCustomReferenceDeserializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.deser.AbstractC6362g
    public AbstractC6390e<?> createTreeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AbstractC6340b abstractC6340b) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        AbstractC6390e<?> abstractC6390e_findCustomTreeNodeDeserializer = _findCustomTreeNodeDeserializer(rawClass, deserializationConfig, abstractC6340b);
        if (abstractC6390e_findCustomTreeNodeDeserializer != null) {
            return abstractC6390e_findCustomTreeNodeDeserializer;
        }
        return JsonNodeDeserializer.getDeserializer(rawClass);
    }

    /* JADX INFO: renamed from: e */
    public final JavaType m11189e(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        if (this._factoryConfig.hasAbstractTypeResolvers()) {
            Iterator<AbstractC6339a> it = this._factoryConfig.abstractTypeResolvers().iterator();
            while (it.hasNext()) {
                JavaType javaTypeM11148a = it.next().m11148a(deserializationConfig, javaType);
                if (javaTypeM11148a != null && !javaTypeM11148a.hasRawClass(rawClass)) {
                    return javaTypeM11148a;
                }
            }
            return null;
        }
        return null;
    }

    public AbstractC6390e<Object> findContentDeserializerFromAnnotation(DeserializationContext deserializationContext, AbstractC6404a abstractC6404a) throws JsonMappingException {
        Object objFindContentDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector != null && (objFindContentDeserializer = annotationIntrospector.findContentDeserializer(abstractC6404a)) != null) {
            return deserializationContext.deserializerInstance(abstractC6404a, objFindContentDeserializer);
        }
        return null;
    }

    public AbstractC6390e<?> findDefaultDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC6340b abstractC6340b) throws JsonMappingException {
        JavaType javaType_findRemappedType;
        JavaType javaType_findRemappedType2;
        JavaType javaTypeUnknownType;
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass != f10216b && rawClass != f10221g) {
            if (rawClass != f10217c && rawClass != f10218d) {
                Class<?> cls = f10219e;
                if (rawClass == cls) {
                    TypeFactory typeFactory = deserializationContext.getTypeFactory();
                    JavaType[] javaTypeArrFindTypeParameters = typeFactory.findTypeParameters(javaType, cls);
                    if (javaTypeArrFindTypeParameters != null && javaTypeArrFindTypeParameters.length == 1) {
                        javaTypeUnknownType = javaTypeArrFindTypeParameters[0];
                    } else {
                        javaTypeUnknownType = TypeFactory.unknownType();
                    }
                    return createCollectionDeserializer(deserializationContext, typeFactory.constructCollectionType(Collection.class, javaTypeUnknownType), abstractC6340b);
                }
                if (rawClass == f10220f) {
                    JavaType javaTypeContainedTypeOrUnknown = javaType.containedTypeOrUnknown(0);
                    JavaType javaTypeContainedTypeOrUnknown2 = javaType.containedTypeOrUnknown(1);
                    AbstractC6428b abstractC6428bFindTypeDeserializer = (AbstractC6428b) javaTypeContainedTypeOrUnknown2.getTypeHandler();
                    if (abstractC6428bFindTypeDeserializer == null) {
                        abstractC6428bFindTypeDeserializer = findTypeDeserializer(deserializationContext.getConfig(), javaTypeContainedTypeOrUnknown2);
                    }
                    return new MapEntryDeserializer(javaType, (AbstractC6394i) javaTypeContainedTypeOrUnknown.getValueHandler(), (AbstractC6390e<Object>) javaTypeContainedTypeOrUnknown2.getValueHandler(), abstractC6428bFindTypeDeserializer);
                }
                String name = rawClass.getName();
                if (rawClass.isPrimitive() || name.startsWith("java.")) {
                    AbstractC6390e<?> abstractC6390eM11407a = NumberDeserializers.m11407a(rawClass, name);
                    if (abstractC6390eM11407a == null) {
                        abstractC6390eM11407a = DateDeserializers.m11393a(rawClass, name);
                    }
                    if (abstractC6390eM11407a != null) {
                        return abstractC6390eM11407a;
                    }
                }
                if (rawClass == C6499p.class) {
                    return new TokenBufferDeserializer();
                }
                AbstractC6390e<?> abstractC6390eFindOptionalStdDeserializer = findOptionalStdDeserializer(deserializationContext, javaType, abstractC6340b);
                if (abstractC6390eFindOptionalStdDeserializer != null) {
                    return abstractC6390eFindOptionalStdDeserializer;
                }
                return C6388a.m11423a(rawClass, name);
            }
            return StringDeserializer.instance;
        }
        DeserializationConfig config = deserializationContext.getConfig();
        if (this._factoryConfig.hasAbstractTypeResolvers()) {
            javaType_findRemappedType = _findRemappedType(config, List.class);
            javaType_findRemappedType2 = _findRemappedType(config, Map.class);
        } else {
            javaType_findRemappedType = null;
            javaType_findRemappedType2 = null;
        }
        return new UntypedObjectDeserializer(javaType_findRemappedType, javaType_findRemappedType2);
    }

    public AbstractC6390e<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, AbstractC6404a abstractC6404a) throws JsonMappingException {
        Object objFindDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector != null && (objFindDeserializer = annotationIntrospector.findDeserializer(abstractC6404a)) != null) {
            return deserializationContext.deserializerInstance(abstractC6404a, objFindDeserializer);
        }
        return null;
    }

    public AbstractC6394i findKeyDeserializerFromAnnotation(DeserializationContext deserializationContext, AbstractC6404a abstractC6404a) throws JsonMappingException {
        Object objFindKeyDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector != null && (objFindKeyDeserializer = annotationIntrospector.findKeyDeserializer(abstractC6404a)) != null) {
            return deserializationContext.keyDeserializerInstance(abstractC6404a, objFindKeyDeserializer);
        }
        return null;
    }

    public AbstractC6428b findPropertyContentTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        InterfaceC6430d<?> interfaceC6430dFindPropertyContentTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(deserializationConfig, annotatedMember, javaType);
        JavaType contentType = javaType.getContentType();
        if (interfaceC6430dFindPropertyContentTypeResolver == null) {
            return findTypeDeserializer(deserializationConfig, contentType);
        }
        return interfaceC6430dFindPropertyContentTypeResolver.buildTypeDeserializer(deserializationConfig, contentType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, contentType));
    }

    public AbstractC6428b findPropertyTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        InterfaceC6430d<?> interfaceC6430dFindPropertyTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(deserializationConfig, annotatedMember, javaType);
        if (interfaceC6430dFindPropertyTypeResolver == null) {
            return findTypeDeserializer(deserializationConfig, javaType);
        }
        try {
            return interfaceC6430dFindPropertyTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, javaType));
        } catch (IllegalArgumentException | IllegalStateException e11) {
            throw InvalidDefinitionException.from((JsonParser) null, C6490g.m11952o(e11), javaType).withCause(e11);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.AbstractC6362g
    public AbstractC6428b findTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        Collection<NamedType> collectionCollectAndResolveSubtypesByTypeId;
        JavaType javaTypeMapAbstractType;
        C6406c c6406cMo11174t = deserializationConfig.introspectClassAnnotations(javaType.getRawClass()).mo11174t();
        InterfaceC6430d<?> interfaceC6430dFindTypeResolver = deserializationConfig.getAnnotationIntrospector().findTypeResolver(deserializationConfig, c6406cMo11174t, javaType);
        if (interfaceC6430dFindTypeResolver == null) {
            interfaceC6430dFindTypeResolver = deserializationConfig.getDefaultTyper(javaType);
            if (interfaceC6430dFindTypeResolver == null) {
                return null;
            }
            collectionCollectAndResolveSubtypesByTypeId = null;
        } else {
            collectionCollectAndResolveSubtypesByTypeId = deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, c6406cMo11174t);
        }
        if (interfaceC6430dFindTypeResolver.getDefaultImpl() == null && javaType.isAbstract() && (javaTypeMapAbstractType = mapAbstractType(deserializationConfig, javaType)) != null && !javaTypeMapAbstractType.hasRawClass(javaType.getRawClass())) {
            interfaceC6430dFindTypeResolver = interfaceC6430dFindTypeResolver.withDefaultImpl(javaTypeMapAbstractType.getRawClass());
        }
        try {
            return interfaceC6430dFindTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, collectionCollectAndResolveSubtypesByTypeId);
        } catch (IllegalArgumentException | IllegalStateException e11) {
            throw InvalidDefinitionException.from((JsonParser) null, C6490g.m11952o(e11), javaType).withCause(e11);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.AbstractC6362g
    public ValueInstantiator findValueInstantiator(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b) throws JsonMappingException {
        ValueInstantiator valueInstantiatorM11387a;
        DeserializationConfig config = deserializationContext.getConfig();
        C6406c c6406cMo11174t = abstractC6340b.mo11174t();
        Object objFindValueInstantiator = deserializationContext.getAnnotationIntrospector().findValueInstantiator(c6406cMo11174t);
        if (objFindValueInstantiator != null) {
            valueInstantiatorM11387a = _valueInstantiatorInstance(config, c6406cMo11174t, objFindValueInstantiator);
        } else {
            valueInstantiatorM11387a = null;
        }
        if (valueInstantiatorM11387a == null && (valueInstantiatorM11387a = JDKValueInstantiators.m11295a(config, abstractC6340b.m11172r())) == null) {
            valueInstantiatorM11387a = _constructDefaultValueInstantiator(deserializationContext, abstractC6340b);
        }
        if (this._factoryConfig.hasValueInstantiators()) {
            for (InterfaceC6378m interfaceC6378m : this._factoryConfig.valueInstantiators()) {
                valueInstantiatorM11387a = interfaceC6378m.m11387a(config, abstractC6340b, valueInstantiatorM11387a);
                if (valueInstantiatorM11387a == null) {
                    deserializationContext.reportBadTypeDefinition(abstractC6340b, "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator", interfaceC6378m.getClass().getName());
                }
            }
        }
        if (valueInstantiatorM11387a != null) {
            return valueInstantiatorM11387a.createContextual(deserializationContext, abstractC6340b);
        }
        return valueInstantiatorM11387a;
    }

    @Override // com.fasterxml.jackson.databind.deser.AbstractC6362g
    public boolean hasExplicitDeserializerFor(DeserializationConfig deserializationConfig, Class<?> cls) {
        while (cls.isArray()) {
            cls = cls.getComponentType();
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return true;
        }
        String name = cls.getName();
        if (name.startsWith("java.")) {
            if (Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls)) {
                return true;
            }
            if (Number.class.isAssignableFrom(cls)) {
                if (NumberDeserializers.m11407a(cls, name) != null) {
                    return true;
                }
                return false;
            }
            if (C6388a.m11424b(cls) || cls == f10217c || cls == Boolean.class || cls == EnumMap.class || cls == AtomicReference.class || DateDeserializers.m11394b(cls)) {
                return true;
            }
            return false;
        }
        if (name.startsWith("com.fasterxml.")) {
            if (AbstractC6391f.class.isAssignableFrom(cls) || cls == C6499p.class) {
                return true;
            }
            return false;
        }
        return OptionalHandlerFactory.instance.hasDeserializerFor(cls);
    }

    @Override // com.fasterxml.jackson.databind.deser.AbstractC6362g
    public JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        while (true) {
            JavaType javaTypeM11189e = m11189e(deserializationConfig, javaType);
            if (javaTypeM11189e == null) {
                return javaType;
            }
            Class<?> rawClass = javaType.getRawClass();
            Class<?> rawClass2 = javaTypeM11189e.getRawClass();
            if (rawClass != rawClass2 && rawClass.isAssignableFrom(rawClass2)) {
                javaType = javaTypeM11189e;
            } else {
                throw new IllegalArgumentException("Invalid abstract type resolution from " + javaType + " to " + javaTypeM11189e + ": latter is not a subtype of former");
            }
        }
    }

    @Deprecated
    public JavaType modifyTypeByAnnotation(DeserializationContext deserializationContext, AbstractC6404a abstractC6404a, JavaType javaType) throws JsonMappingException {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), abstractC6404a, javaType);
    }

    public JavaType resolveMemberAndTypeAnnotations(DeserializationContext deserializationContext, AnnotatedMember annotatedMember, JavaType javaType) throws JsonMappingException {
        AbstractC6394i abstractC6394iKeyDeserializerInstance;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        if (javaType.isMapLikeType() && javaType.getKeyType() != null && (abstractC6394iKeyDeserializerInstance = deserializationContext.keyDeserializerInstance(annotatedMember, annotationIntrospector.findKeyDeserializer(annotatedMember))) != null) {
            javaType = ((MapLikeType) javaType).withKeyValueHandler(abstractC6394iKeyDeserializerInstance);
            javaType.getKeyType();
        }
        if (javaType.hasContentType()) {
            AbstractC6390e<Object> abstractC6390eDeserializerInstance = deserializationContext.deserializerInstance(annotatedMember, annotationIntrospector.findContentDeserializer(annotatedMember));
            if (abstractC6390eDeserializerInstance != null) {
                javaType = javaType.withContentValueHandler(abstractC6390eDeserializerInstance);
            }
            AbstractC6428b abstractC6428bFindPropertyContentTypeDeserializer = findPropertyContentTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
            if (abstractC6428bFindPropertyContentTypeDeserializer != null) {
                javaType = javaType.withContentTypeHandler(abstractC6428bFindPropertyContentTypeDeserializer);
            }
        }
        AbstractC6428b abstractC6428bFindPropertyTypeDeserializer = findPropertyTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
        if (abstractC6428bFindPropertyTypeDeserializer != null) {
            javaType = javaType.withTypeHandler(abstractC6428bFindPropertyTypeDeserializer);
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotatedMember, javaType);
    }

    @Deprecated
    public JavaType resolveType(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        return resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, javaType);
    }
}
