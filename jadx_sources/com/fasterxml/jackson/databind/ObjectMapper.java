package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.AbstractC6304g;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.C6297a;
import com.fasterxml.jackson.core.InterfaceC6299c;
import com.fasterxml.jackson.core.InterfaceC6305h;
import com.fasterxml.jackson.core.InterfaceC6320l;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.StreamWriteFeature;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.p062io.C6315i;
import com.fasterxml.jackson.core.p062io.CharacterEscapes;
import com.fasterxml.jackson.core.util.C6324c;
import com.fasterxml.jackson.databind.cfg.AbstractC6345c;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.C6347e;
import com.fasterxml.jackson.databind.cfg.CoercionConfigs;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MutableCoercionConfig;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.databind.deser.AbstractC6361f;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.AbstractC6415l;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.AbstractC6427a;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6430d;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.C6439h;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.C6450d;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.ser.AbstractC6456e;
import com.fasterxml.jackson.databind.ser.AbstractC6468j;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.C6499p;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.lang.reflect.Type;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import p424l7.AbstractC42115a;
import p424l7.AbstractC42116b;
import p528p7.InterfaceC43399e;
import p551q7.C43651a;

/* JADX INFO: loaded from: classes45.dex */
public class ObjectMapper extends AbstractC6304g implements Serializable {
    protected static final AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR;
    protected static final BaseSettings DEFAULT_BASE;
    private static final long serialVersionUID = 2;
    protected final CoercionConfigs _coercionConfigs;
    protected final ConfigOverrides _configOverrides;
    protected DeserializationConfig _deserializationConfig;
    protected DefaultDeserializationContext _deserializationContext;
    protected AbstractC6348d _injectableValues;
    protected final JsonFactory _jsonFactory;
    protected SimpleMixInResolver _mixIns;
    protected Set<Object> _registeredModuleTypes;
    protected final ConcurrentHashMap<JavaType, AbstractC6390e<Object>> _rootDeserializers;
    protected SerializationConfig _serializationConfig;
    protected AbstractC6468j _serializerFactory;
    protected DefaultSerializerProvider _serializerProvider;
    protected AbstractC6427a _subtypeResolver;
    protected TypeFactory _typeFactory;

    public static class DefaultTypeResolverBuilder extends C6439h implements Serializable {
        private static final long serialVersionUID = 1;
        protected final DefaultTyping _appliesFor;
        protected final PolymorphicTypeValidator _subtypeValidator;

        @Deprecated
        public DefaultTypeResolverBuilder(DefaultTyping defaultTyping) {
            this(defaultTyping, LaissezFaireSubTypeValidator.instance);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.impl.C6439h, com.fasterxml.jackson.databind.jsontype.InterfaceC6430d
        public /* bridge */ /* synthetic */ InterfaceC6430d withDefaultImpl(Class cls) {
            return withDefaultImpl((Class<?>) cls);
        }

        public DefaultTypeResolverBuilder(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
            this._appliesFor = (DefaultTyping) m11137a(defaultTyping, "Can not pass `null` DefaultTyping");
            this._subtypeValidator = (PolymorphicTypeValidator) m11137a(polymorphicTypeValidator, "Can not pass `null` PolymorphicTypeValidator");
        }

        /* JADX INFO: renamed from: a */
        public static <T> T m11137a(T t11, String str) {
            if (t11 != null) {
                return t11;
            }
            throw new NullPointerException(str);
        }

        public static DefaultTypeResolverBuilder construct(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
            return new DefaultTypeResolverBuilder(defaultTyping, polymorphicTypeValidator);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.impl.C6439h
        public PolymorphicTypeValidator subTypeValidator(MapperConfig<?> mapperConfig) {
            return this._subtypeValidator;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.impl.C6439h, com.fasterxml.jackson.databind.jsontype.InterfaceC6430d
        public /* bridge */ /* synthetic */ C6439h withDefaultImpl(Class cls) {
            return withDefaultImpl((Class<?>) cls);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.impl.C6439h, com.fasterxml.jackson.databind.jsontype.InterfaceC6430d
        public AbstractC6428b buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection) {
            if (useForType(javaType)) {
                return super.buildTypeDeserializer(deserializationConfig, javaType, collection);
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.impl.C6439h, com.fasterxml.jackson.databind.jsontype.InterfaceC6430d
        public AbstractC6431e buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
            if (useForType(javaType)) {
                return super.buildTypeSerializer(serializationConfig, javaType, collection);
            }
            return null;
        }

        public boolean useForType(JavaType javaType) {
            if (javaType.isPrimitive()) {
                return false;
            }
            int i11 = C6337c.f10196a[this._appliesFor.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return true;
                        }
                        return javaType.isJavaLangObject();
                    }
                    while (javaType.isArrayType()) {
                        javaType = javaType.getContentType();
                    }
                    while (javaType.isReferenceType()) {
                        javaType = javaType.getReferencedType();
                    }
                    if (javaType.isFinal() || InterfaceC6320l.class.isAssignableFrom(javaType.getRawClass())) {
                        return false;
                    }
                    return true;
                }
            } else {
                while (javaType.isArrayType()) {
                    javaType = javaType.getContentType();
                }
            }
            while (javaType.isReferenceType()) {
                javaType = javaType.getReferencedType();
            }
            if (!javaType.isJavaLangObject() && (javaType.isConcrete() || InterfaceC6320l.class.isAssignableFrom(javaType.getRawClass()))) {
                return false;
            }
            return true;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.impl.C6439h, com.fasterxml.jackson.databind.jsontype.InterfaceC6430d
        public DefaultTypeResolverBuilder withDefaultImpl(Class<?> cls) {
            if (this._defaultImpl == cls) {
                return this;
            }
            C6490g.m11951n0(DefaultTypeResolverBuilder.class, this, "withDefaultImpl");
            return new DefaultTypeResolverBuilder(this, cls);
        }

        public DefaultTypeResolverBuilder(DefaultTypeResolverBuilder defaultTypeResolverBuilder, Class<?> cls) {
            super(defaultTypeResolverBuilder, cls);
            this._appliesFor = defaultTypeResolverBuilder._appliesFor;
            this._subtypeValidator = defaultTypeResolverBuilder._subtypeValidator;
        }
    }

    public enum DefaultTyping {
        JAVA_LANG_OBJECT,
        OBJECT_AND_NON_CONCRETE,
        NON_CONCRETE_AND_ARRAYS,
        NON_FINAL,
        EVERYTHING
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ObjectMapper$a */
    public class C6335a implements AbstractC6444k.a {
        public C6335a() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ObjectMapper$b */
    public static class C6336b<T> implements PrivilegedAction<ServiceLoader<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ClassLoader f10194a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Class f10195b;

        public C6336b(ClassLoader classLoader, Class cls) {
            this.f10194a = classLoader;
            this.f10195b = cls;
        }

        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ServiceLoader<T> run() {
            ClassLoader classLoader = this.f10194a;
            return classLoader == null ? ServiceLoader.load(this.f10195b) : ServiceLoader.load(this.f10195b, classLoader);
        }
    }

    public ObjectMapper() {
        this(null, null, null);
    }

    public static List<AbstractC6444k> findModules() {
        return findModules(null);
    }

    public ObjectReader _newReader(DeserializationConfig deserializationConfig) {
        return new ObjectReader(this, deserializationConfig);
    }

    public ObjectWriter _newWriter(SerializationConfig serializationConfig) {
        return new ObjectWriter(this, serializationConfig);
    }

    /* JADX INFO: renamed from: a */
    public final void m11135a(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            try {
                closeable.close();
                jsonGenerator.close();
            } catch (Exception e11) {
                e = e11;
                closeable = null;
                C6490g.m11942j(jsonGenerator, closeable, e);
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    public void acceptJsonFormatVisitor(Class<?> cls, InterfaceC43399e interfaceC43399e) throws JsonMappingException {
        acceptJsonFormatVisitor(this._typeFactory.constructType(cls), interfaceC43399e);
    }

    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator) {
        return activateDefaultTyping(polymorphicTypeValidator, DefaultTyping.OBJECT_AND_NON_CONCRETE);
    }

    /* JADX INFO: renamed from: b */
    public final void m11136b(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
            }
            closeable.close();
        } catch (Exception e11) {
            C6490g.m11942j(null, closeable, e11);
        }
    }

    public boolean canDeserialize(JavaType javaType) {
        return createDeserializationContext(null, getDeserializationConfig()).hasValueDeserializerFor(javaType, null);
    }

    public boolean canSerialize(Class<?> cls) {
        return _serializerProvider(getSerializationConfig()).hasSerializerFor(cls, null);
    }

    public MutableCoercionConfig coercionConfigFor(LogicalType logicalType) {
        return this._coercionConfigs.findOrCreateCoercion(logicalType);
    }

    @Deprecated
    public ObjectMapper configure(MapperFeature mapperFeature, boolean z11) {
        this._serializationConfig = z11 ? this._serializationConfig.with(mapperFeature) : this._serializationConfig.without(mapperFeature);
        this._deserializationConfig = z11 ? this._deserializationConfig.with(mapperFeature) : this._deserializationConfig.without(mapperFeature);
        return this;
    }

    public JavaType constructType(Type type) {
        _assertNotNull("t", type);
        return this._typeFactory.constructType(type);
    }

    public <T> T convertValue(Object obj, Class<T> cls) throws IllegalArgumentException {
        return (T) _convert(obj, this._typeFactory.constructType(cls));
    }

    public JsonGenerator createGenerator(OutputStream outputStream) throws IOException {
        _assertNotNull("out", outputStream);
        JsonGenerator jsonGeneratorCreateGenerator = this._jsonFactory.createGenerator(outputStream, JsonEncoding.UTF8);
        this._serializationConfig.initialize(jsonGeneratorCreateGenerator);
        return jsonGeneratorCreateGenerator;
    }

    public JsonParser createParser(File file) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, file);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(file));
    }

    public ObjectMapper deactivateDefaultTyping() {
        return setDefaultTyping(null);
    }

    @Deprecated
    public ObjectMapper disable(MapperFeature... mapperFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.without(mapperFeatureArr);
        this._serializationConfig = this._serializationConfig.without(mapperFeatureArr);
        return this;
    }

    @Deprecated
    public ObjectMapper disableDefaultTyping() {
        return setDefaultTyping(null);
    }

    @Deprecated
    public ObjectMapper enable(MapperFeature... mapperFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.with(mapperFeatureArr);
        this._serializationConfig = this._serializationConfig.with(mapperFeatureArr);
        return this;
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping() {
        return activateDefaultTyping(getPolymorphicTypeValidator());
    }

    public AbstractC6348d getInjectableValues() {
        return null;
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._serializationConfig.isEnabled(mapperFeature);
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g, com.fasterxml.jackson.core.AbstractC6319k
    public <T extends InterfaceC6320l> T readTree(JsonParser jsonParser) throws IOException {
        _assertNotNull("p", jsonParser);
        DeserializationConfig deserializationConfig = getDeserializationConfig();
        if (jsonParser.mo10889k() == null && jsonParser.mo10905t0() == null) {
            return null;
        }
        AbstractC6391f abstractC6391f = (AbstractC6391f) _readValue(deserializationConfig, jsonParser, constructType(AbstractC6391f.class));
        return abstractC6391f == null ? getNodeFactory().m103747nullNode() : abstractC6391f;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g
    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException {
        _assertNotNull("p", jsonParser);
        return (T) _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.constructType(cls));
    }

    public ObjectReader reader() {
        return _newReader(getDeserializationConfig()).with((AbstractC6348d) null);
    }

    public ObjectReader readerFor(JavaType javaType) {
        return _newReader(getDeserializationConfig(), javaType, null, null, null);
    }

    public ObjectMapper registerModules(AbstractC6444k... abstractC6444kArr) {
        for (AbstractC6444k abstractC6444k : abstractC6444kArr) {
            registerModule(abstractC6444k);
        }
        return this;
    }

    public void registerSubtypes(Class<?>... clsArr) {
        getSubtypeResolver().registerSubtypes(clsArr);
    }

    public ObjectMapper setConfig(DeserializationConfig deserializationConfig) {
        _assertNotNull("config", deserializationConfig);
        this._deserializationConfig = deserializationConfig;
        return this;
    }

    public ObjectMapper setDefaultPropertyInclusion(JsonInclude.Value value) {
        this._configOverrides.setDefaultInclusion(value);
        return this;
    }

    public ObjectMapper setVisibility(VisibilityChecker<?> visibilityChecker) {
        this._configOverrides.setDefaultVisibility(visibilityChecker);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.core.AbstractC6304g
    public <T> T treeToValue(InterfaceC6320l interfaceC6320l, Class<T> cls) throws JsonProcessingException, IllegalArgumentException {
        T t11;
        if (interfaceC6320l == 0) {
            return null;
        }
        try {
            if (InterfaceC6320l.class.isAssignableFrom(cls) && cls.isAssignableFrom(interfaceC6320l.getClass())) {
                return interfaceC6320l;
            }
            return (interfaceC6320l.asToken() == JsonToken.VALUE_EMBEDDED_OBJECT && (interfaceC6320l instanceof POJONode) && ((t11 = (T) ((POJONode) interfaceC6320l).getPojo()) == null || cls.isInstance(t11))) ? t11 : (T) readValue(treeAsTokens(interfaceC6320l), cls);
        } catch (JsonProcessingException e11) {
            throw e11;
        } catch (IOException e12) {
            throw new IllegalArgumentException(e12.getMessage(), e12);
        }
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g, com.fasterxml.jackson.core.AbstractC6319k
    public void writeTree(JsonGenerator jsonGenerator, InterfaceC6320l interfaceC6320l) throws IOException {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, interfaceC6320l);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g
    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        if (serializationConfig.isEnabled(SerializationFeature.INDENT_OUTPUT) && jsonGenerator.m10835p() == null) {
            jsonGenerator.m10789E(serializationConfig.constructDefaultPrettyPrinter());
        }
        if (serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            m11136b(jsonGenerator, obj, serializationConfig);
            return;
        }
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    public ObjectWriter writer() {
        return _newWriter(getSerializationConfig());
    }

    public ObjectWriter writerFor(Class<?> cls) {
        return _newWriter(getSerializationConfig(), cls == null ? null : this._typeFactory.constructType(cls), null);
    }

    @Deprecated
    public ObjectWriter writerWithType(Class<?> cls) {
        return _newWriter(getSerializationConfig(), cls == null ? null : this._typeFactory.constructType(cls), null);
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ObjectMapper$c */
    public static /* synthetic */ class C6337c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10196a;

        static {
            int[] iArr = new int[DefaultTyping.values().length];
            f10196a = iArr;
            try {
                iArr[DefaultTyping.NON_CONCRETE_AND_ARRAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10196a[DefaultTyping.OBJECT_AND_NON_CONCRETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10196a[DefaultTyping.NON_FINAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10196a[DefaultTyping.EVERYTHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10196a[DefaultTyping.JAVA_LANG_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        DEFAULT_ANNOTATION_INTROSPECTOR = jacksonAnnotationIntrospector;
        DEFAULT_BASE = new BaseSettings(null, jacksonAnnotationIntrospector, null, TypeFactory.defaultInstance(), null, StdDateFormat.instance, null, Locale.getDefault(), null, C6297a.m10918a(), LaissezFaireSubTypeValidator.instance, new DefaultAccessorNamingStrategy.Provider());
    }

    public ObjectMapper(JsonFactory jsonFactory) {
        this(jsonFactory, null, null);
    }

    public static List<AbstractC6444k> findModules(ClassLoader classLoader) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m11134c(AbstractC6444k.class, classLoader).iterator();
        while (it.hasNext()) {
            arrayList.add((AbstractC6444k) it.next());
        }
        return arrayList;
    }

    public final void _assertNotNull(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }

    public AbstractC6390e<Object> _findRootDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws DatabindException {
        AbstractC6390e<Object> abstractC6390e = this._rootDeserializers.get(javaType);
        if (abstractC6390e != null) {
            return abstractC6390e;
        }
        AbstractC6390e<Object> abstractC6390eFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (abstractC6390eFindRootValueDeserializer != null) {
            this._rootDeserializers.put(javaType, abstractC6390eFindRootValueDeserializer);
            return abstractC6390eFindRootValueDeserializer;
        }
        return (AbstractC6390e) deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type " + javaType);
    }

    public JsonToken _initForReading(JsonParser jsonParser, JavaType javaType) throws IOException {
        this._deserializationConfig.initialize(jsonParser);
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        if (jsonTokenMo10889k != null) {
            return jsonTokenMo10889k;
        }
        JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
        if (jsonTokenMo10905t0 != null) {
            return jsonTokenMo10905t0;
        }
        throw MismatchedInputException.from(jsonParser, javaType, "No content to map due to end-of-input");
    }

    public ObjectReader _newReader(DeserializationConfig deserializationConfig, JavaType javaType, Object obj, InterfaceC6299c interfaceC6299c, AbstractC6348d abstractC6348d) {
        return new ObjectReader(this, deserializationConfig, javaType, obj, interfaceC6299c, abstractC6348d);
    }

    public ObjectWriter _newWriter(SerializationConfig serializationConfig, InterfaceC6299c interfaceC6299c) {
        return new ObjectWriter(this, serializationConfig, interfaceC6299c);
    }

    public AbstractC6391f _readTreeAndClose(JsonParser jsonParser) throws IOException {
        try {
            JavaType javaTypeConstructType = constructType(AbstractC6391f.class);
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            deserializationConfig.initialize(jsonParser);
            JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
            if (jsonTokenMo10889k == null && (jsonTokenMo10889k = jsonParser.mo10905t0()) == null) {
                AbstractC6391f abstractC6391fMissingNode = deserializationConfig.getNodeFactory().missingNode();
                jsonParser.close();
                return abstractC6391fMissingNode;
            }
            DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
            AbstractC6391f abstractC6391fNullNode = jsonTokenMo10889k == JsonToken.VALUE_NULL ? deserializationConfig.getNodeFactory().m103747nullNode() : (AbstractC6391f) defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, javaTypeConstructType, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaTypeConstructType), null);
            if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, javaTypeConstructType);
            }
            jsonParser.close();
            return abstractC6391fNullNode;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                if (jsonParser != null) {
                    try {
                        jsonParser.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    public DefaultSerializerProvider _serializerProvider(SerializationConfig serializationConfig) {
        return this._serializerProvider.createInstance(serializationConfig, this._serializerFactory);
    }

    public void _verifySchemaType(InterfaceC6299c interfaceC6299c) {
        if (interfaceC6299c == null || this._jsonFactory.canUseSchema(interfaceC6299c)) {
            return;
        }
        throw new IllegalArgumentException("Cannot use FormatSchema of type " + interfaceC6299c.getClass().getName() + " for format " + this._jsonFactory.getFormatName());
    }

    public void acceptJsonFormatVisitor(JavaType javaType, InterfaceC43399e interfaceC43399e) throws JsonMappingException {
        if (javaType == null) {
            throw new IllegalArgumentException("type must be provided");
        }
        _serializerProvider(getSerializationConfig()).acceptJsonFormatVisitor(javaType, interfaceC43399e);
    }

    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping) {
        return activateDefaultTyping(polymorphicTypeValidator, defaultTyping, JsonTypeInfo.EnumC6265As.WRAPPER_ARRAY);
    }

    public ObjectMapper addHandler(AbstractC6361f abstractC6361f) {
        this._deserializationConfig = this._deserializationConfig.withHandler(abstractC6361f);
        return this;
    }

    public ObjectMapper addMixIn(Class<?> cls, Class<?> cls2) {
        this._mixIns.addLocalDefinition(cls, cls2);
        return this;
    }

    public boolean canSerialize(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        return _serializerProvider(getSerializationConfig()).hasSerializerFor(cls, atomicReference);
    }

    public ObjectMapper clearProblemHandlers() {
        this._deserializationConfig = this._deserializationConfig.withNoProblemHandlers();
        return this;
    }

    public MutableCoercionConfig coercionConfigDefaults() {
        return this._coercionConfigs.defaultCoercions();
    }

    public MutableCoercionConfig coercionConfigFor(Class<?> cls) {
        return this._coercionConfigs.findOrCreateCoercion(cls);
    }

    public MutableConfigOverride configOverride(Class<?> cls) {
        return this._configOverrides.findOrCreateOverride(cls);
    }

    public <T> T convertValue(Object obj, AbstractC42116b<T> abstractC42116b) throws IllegalArgumentException {
        return (T) _convert(obj, this._typeFactory.constructType((AbstractC42116b<?>) abstractC42116b));
    }

    public ObjectMapper copy() {
        _checkInvalidCopy(ObjectMapper.class);
        return new ObjectMapper(this);
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g, com.fasterxml.jackson.core.AbstractC6319k
    public ArrayNode createArrayNode() {
        return this._deserializationConfig.getNodeFactory().arrayNode();
    }

    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser, DeserializationConfig deserializationConfig) {
        return this._deserializationContext.createInstance(deserializationConfig, jsonParser, null);
    }

    public JsonParser createNonBlockingByteArrayParser() throws IOException {
        return this._deserializationConfig.initialize(this._jsonFactory.createNonBlockingByteArrayParser());
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g, com.fasterxml.jackson.core.AbstractC6319k
    public ObjectNode createObjectNode() {
        return this._deserializationConfig.getNodeFactory().objectNode();
    }

    public AbstractC6415l defaultClassIntrospector() {
        return new BasicClassIntrospector();
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping(DefaultTyping defaultTyping) {
        return enableDefaultTyping(defaultTyping, JsonTypeInfo.EnumC6265As.WRAPPER_ARRAY);
    }

    public Class<?> findMixInClassFor(Class<?> cls) {
        return this._mixIns.findMixInClassFor(cls);
    }

    public DateFormat getDateFormat() {
        return this._serializationConfig.getDateFormat();
    }

    public DeserializationConfig getDeserializationConfig() {
        return this._deserializationConfig;
    }

    public DeserializationContext getDeserializationContext() {
        return this._deserializationContext;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g
    public JsonFactory getFactory() {
        return this._jsonFactory;
    }

    public JsonNodeFactory getNodeFactory() {
        return this._deserializationConfig.getNodeFactory();
    }

    public PolymorphicTypeValidator getPolymorphicTypeValidator() {
        return this._deserializationConfig.getBaseSettings().getPolymorphicTypeValidator();
    }

    public PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._serializationConfig.getPropertyNamingStrategy();
    }

    public Set<Object> getRegisteredModuleIds() {
        Set<Object> set = this._registeredModuleTypes;
        return set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
    }

    public SerializationConfig getSerializationConfig() {
        return this._serializationConfig;
    }

    public AbstractC6468j getSerializerFactory() {
        return this._serializerFactory;
    }

    public AbstractC6446m getSerializerProvider() {
        return this._serializerProvider;
    }

    public AbstractC6446m getSerializerProviderInstance() {
        return _serializerProvider(this._serializationConfig);
    }

    public AbstractC6427a getSubtypeResolver() {
        return this._subtypeResolver;
    }

    public TypeFactory getTypeFactory() {
        return this._typeFactory;
    }

    public VisibilityChecker<?> getVisibilityChecker() {
        return this._serializationConfig.getDefaultVisibilityChecker();
    }

    public boolean isEnabled(SerializationFeature serializationFeature) {
        return this._serializationConfig.isEnabled(serializationFeature);
    }

    @Override // com.fasterxml.jackson.core.AbstractC6319k
    public AbstractC6391f missingNode() {
        return this._deserializationConfig.getNodeFactory().missingNode();
    }

    public int mixInCount() {
        return this._mixIns.localSize();
    }

    @Override // com.fasterxml.jackson.core.AbstractC6319k
    public AbstractC6391f nullNode() {
        return this._deserializationConfig.getNodeFactory().m103747nullNode();
    }

    public ObjectReader reader(DeserializationFeature deserializationFeature) {
        return _newReader(getDeserializationConfig().with(deserializationFeature));
    }

    public ObjectReader readerFor(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(cls), null, null, null);
    }

    public ObjectReader readerForUpdating(Object obj) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(obj.getClass()), obj, null, null);
    }

    public ObjectMapper registerModule(AbstractC6444k abstractC6444k) {
        Object objM11719c;
        _assertNotNull("module", abstractC6444k);
        if (abstractC6444k.m11718b() == null) {
            throw new IllegalArgumentException("Module without defined name");
        }
        if (abstractC6444k.m11721e() == null) {
            throw new IllegalArgumentException("Module without defined version");
        }
        Iterator<? extends AbstractC6444k> it = abstractC6444k.m11717a().iterator();
        while (it.hasNext()) {
            registerModule(it.next());
        }
        if (isEnabled(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS) && (objM11719c = abstractC6444k.m11719c()) != null) {
            if (this._registeredModuleTypes == null) {
                this._registeredModuleTypes = new LinkedHashSet();
            }
            if (!this._registeredModuleTypes.add(objM11719c)) {
                return this;
            }
        }
        abstractC6444k.m11720d(new C6335a());
        return this;
    }

    public void registerSubtypes(NamedType... namedTypeArr) {
        getSubtypeResolver().registerSubtypes(namedTypeArr);
    }

    public ObjectMapper setAccessorNaming(AccessorNamingStrategy.Provider provider) {
        this._serializationConfig = this._serializationConfig.with(provider);
        this._deserializationConfig = this._deserializationConfig.with(provider);
        return this;
    }

    public ObjectMapper setAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        this._serializationConfig = this._serializationConfig.with(annotationIntrospector);
        this._deserializationConfig = this._deserializationConfig.with(annotationIntrospector);
        return this;
    }

    public ObjectMapper setAnnotationIntrospectors(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        this._serializationConfig = this._serializationConfig.with(annotationIntrospector);
        this._deserializationConfig = this._deserializationConfig.with(annotationIntrospector2);
        return this;
    }

    public ObjectMapper setBase64Variant(Base64Variant base64Variant) {
        this._serializationConfig = this._serializationConfig.with(base64Variant);
        this._deserializationConfig = this._deserializationConfig.with(base64Variant);
        return this;
    }

    public ObjectMapper setConstructorDetector(ConstructorDetector constructorDetector) {
        this._deserializationConfig = this._deserializationConfig.with(constructorDetector);
        return this;
    }

    public ObjectMapper setDateFormat(DateFormat dateFormat) {
        this._deserializationConfig = this._deserializationConfig.with(dateFormat);
        this._serializationConfig = this._serializationConfig.with(dateFormat);
        return this;
    }

    public ObjectMapper setDefaultAttributes(ContextAttributes contextAttributes) {
        this._deserializationConfig = this._deserializationConfig.with(contextAttributes);
        this._serializationConfig = this._serializationConfig.with(contextAttributes);
        return this;
    }

    public ObjectMapper setDefaultLeniency(Boolean bool) {
        this._configOverrides.setDefaultLeniency(bool);
        return this;
    }

    public ObjectMapper setDefaultMergeable(Boolean bool) {
        this._configOverrides.setDefaultMergeable(bool);
        return this;
    }

    public ObjectMapper setDefaultPrettyPrinter(InterfaceC6305h interfaceC6305h) {
        this._serializationConfig = this._serializationConfig.withDefaultPrettyPrinter(interfaceC6305h);
        return this;
    }

    public ObjectMapper setDefaultPropertyInclusion(JsonInclude.Include include) {
        this._configOverrides.setDefaultInclusion(JsonInclude.Value.construct(include, include));
        return this;
    }

    public ObjectMapper setDefaultSetterInfo(JsonSetter.Value value) {
        this._configOverrides.setDefaultSetterInfo(value);
        return this;
    }

    public ObjectMapper setDefaultTyping(InterfaceC6430d<?> interfaceC6430d) {
        this._deserializationConfig = this._deserializationConfig.with(interfaceC6430d);
        this._serializationConfig = this._serializationConfig.with(interfaceC6430d);
        return this;
    }

    public ObjectMapper setDefaultVisibility(JsonAutoDetect.Value value) {
        this._configOverrides.setDefaultVisibility(VisibilityChecker.Std.construct(value));
        return this;
    }

    public ObjectMapper setFilterProvider(AbstractC6456e abstractC6456e) {
        this._serializationConfig = this._serializationConfig.withFilters(abstractC6456e);
        return this;
    }

    @Deprecated
    public void setFilters(AbstractC6456e abstractC6456e) {
        this._serializationConfig = this._serializationConfig.withFilters(abstractC6456e);
    }

    public Object setHandlerInstantiator(AbstractC6345c abstractC6345c) {
        this._deserializationConfig = this._deserializationConfig.with(abstractC6345c);
        this._serializationConfig = this._serializationConfig.with(abstractC6345c);
        return this;
    }

    public ObjectMapper setLocale(Locale locale) {
        this._deserializationConfig = this._deserializationConfig.with(locale);
        this._serializationConfig = this._serializationConfig.with(locale);
        return this;
    }

    public ObjectMapper setMixInResolver(AbstractC6415l.a aVar) {
        SimpleMixInResolver simpleMixInResolverWithOverrides = this._mixIns.withOverrides(aVar);
        if (simpleMixInResolverWithOverrides != this._mixIns) {
            this._mixIns = simpleMixInResolverWithOverrides;
            this._deserializationConfig = new DeserializationConfig(this._deserializationConfig, simpleMixInResolverWithOverrides);
            this._serializationConfig = new SerializationConfig(this._serializationConfig, simpleMixInResolverWithOverrides);
        }
        return this;
    }

    public ObjectMapper setMixIns(Map<Class<?>, Class<?>> map) {
        this._mixIns.setLocalDefinitions(map);
        return this;
    }

    public ObjectMapper setNodeFactory(JsonNodeFactory jsonNodeFactory) {
        this._deserializationConfig = this._deserializationConfig.with(jsonNodeFactory);
        return this;
    }

    public ObjectMapper setPolymorphicTypeValidator(PolymorphicTypeValidator polymorphicTypeValidator) {
        this._deserializationConfig = this._deserializationConfig._withBase(this._deserializationConfig.getBaseSettings().with(polymorphicTypeValidator));
        return this;
    }

    public ObjectMapper setPropertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this._serializationConfig = this._serializationConfig.with(propertyNamingStrategy);
        this._deserializationConfig = this._deserializationConfig.with(propertyNamingStrategy);
        return this;
    }

    public ObjectMapper setSerializerFactory(AbstractC6468j abstractC6468j) {
        this._serializerFactory = abstractC6468j;
        return this;
    }

    public ObjectMapper setSerializerProvider(DefaultSerializerProvider defaultSerializerProvider) {
        this._serializerProvider = defaultSerializerProvider;
        return this;
    }

    public ObjectMapper setSubtypeResolver(AbstractC6427a abstractC6427a) {
        this._subtypeResolver = abstractC6427a;
        this._deserializationConfig = this._deserializationConfig.with(abstractC6427a);
        this._serializationConfig = this._serializationConfig.with(abstractC6427a);
        return this;
    }

    public ObjectMapper setTimeZone(TimeZone timeZone) {
        this._deserializationConfig = this._deserializationConfig.with(timeZone);
        this._serializationConfig = this._serializationConfig.with(timeZone);
        return this;
    }

    public ObjectMapper setTypeFactory(TypeFactory typeFactory) {
        this._typeFactory = typeFactory;
        this._deserializationConfig = this._deserializationConfig.with(typeFactory);
        this._serializationConfig = this._serializationConfig.with(typeFactory);
        return this;
    }

    public ObjectMapper setVisibility(PropertyAccessor propertyAccessor, JsonAutoDetect.Visibility visibility) {
        this._configOverrides.setDefaultVisibility(this._configOverrides.getDefaultVisibility().withVisibility(propertyAccessor, visibility));
        return this;
    }

    public JsonFactory tokenStreamFactory() {
        return this._jsonFactory;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g, com.fasterxml.jackson.core.AbstractC6319k
    public JsonParser treeAsTokens(InterfaceC6320l interfaceC6320l) {
        _assertNotNull("n", interfaceC6320l);
        return new C6450d((AbstractC6391f) interfaceC6320l, this);
    }

    public <T> T updateValue(T t11, Object obj) throws JsonMappingException {
        if (t11 == null || obj == null) {
            return t11;
        }
        DefaultSerializerProvider defaultSerializerProvider_serializerProvider = _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE));
        C6499p c6499pBufferForValueConversion = defaultSerializerProvider_serializerProvider.bufferForValueConversion(this);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            c6499pBufferForValueConversion = c6499pBufferForValueConversion.m12020a1(true);
        }
        try {
            defaultSerializerProvider_serializerProvider.serializeValue(c6499pBufferForValueConversion, obj);
            JsonParser jsonParserM12013T0 = c6499pBufferForValueConversion.m12013T0();
            T t12 = (T) readerForUpdating(t11).readValue(jsonParserM12013T0);
            jsonParserM12013T0.close();
            return t12;
        } catch (IOException e11) {
            if (e11 instanceof JsonMappingException) {
                throw ((JsonMappingException) e11);
            }
            throw JsonMappingException.fromUnexpectedIOE(e11);
        }
    }

    public <T extends AbstractC6391f> T valueToTree(Object obj) throws IllegalArgumentException {
        if (obj == null) {
            return getNodeFactory().m103747nullNode();
        }
        DefaultSerializerProvider defaultSerializerProvider_serializerProvider = _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE));
        C6499p c6499pBufferForValueConversion = defaultSerializerProvider_serializerProvider.bufferForValueConversion(this);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            c6499pBufferForValueConversion = c6499pBufferForValueConversion.m12020a1(true);
        }
        try {
            defaultSerializerProvider_serializerProvider.serializeValue(c6499pBufferForValueConversion, obj);
            JsonParser jsonParserM12013T0 = c6499pBufferForValueConversion.m12013T0();
            try {
                T t11 = (T) readTree(jsonParserM12013T0);
                if (jsonParserM12013T0 == null) {
                    return t11;
                }
                jsonParserM12013T0.close();
                return t11;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    if (jsonParserM12013T0 != null) {
                        try {
                            jsonParserM12013T0.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            }
        } catch (IOException e11) {
            throw new IllegalArgumentException(e11.getMessage(), e11);
        }
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g
    public Version version() {
        return C6347e.f10215a;
    }

    public byte[] writeValueAsBytes(Object obj) throws JsonProcessingException {
        try {
            C6324c c6324c = new C6324c(this._jsonFactory._getBufferRecycler());
            try {
                _writeValueAndClose(createGenerator(c6324c, JsonEncoding.UTF8), obj);
                byte[] bArrM11079q = c6324c.m11079q();
                c6324c.release();
                c6324c.close();
                return bArrM11079q;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        c6324c.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        } catch (JsonProcessingException e11) {
            throw e11;
        } catch (IOException e12) {
            throw JsonMappingException.fromUnexpectedIOE(e12);
        }
    }

    public String writeValueAsString(Object obj) throws JsonProcessingException {
        C6315i c6315i = new C6315i(this._jsonFactory._getBufferRecycler());
        try {
            _writeValueAndClose(createGenerator(c6315i), obj);
            return c6315i.m11046a();
        } catch (JsonProcessingException e11) {
            throw e11;
        } catch (IOException e12) {
            throw JsonMappingException.fromUnexpectedIOE(e12);
        }
    }

    public ObjectWriter writer(SerializationFeature serializationFeature) {
        return _newWriter(getSerializationConfig().with(serializationFeature));
    }

    public ObjectMapper(ObjectMapper objectMapper) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        JsonFactory jsonFactoryCopy = objectMapper._jsonFactory.copy();
        this._jsonFactory = jsonFactoryCopy;
        jsonFactoryCopy.setCodec(this);
        this._subtypeResolver = objectMapper._subtypeResolver.copy();
        this._typeFactory = objectMapper._typeFactory;
        ConfigOverrides configOverridesCopy = objectMapper._configOverrides.copy();
        this._configOverrides = configOverridesCopy;
        CoercionConfigs coercionConfigsCopy = objectMapper._coercionConfigs.copy();
        this._coercionConfigs = coercionConfigsCopy;
        this._mixIns = objectMapper._mixIns.copy();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this._serializationConfig = new SerializationConfig(objectMapper._serializationConfig, this._subtypeResolver, this._mixIns, rootNameLookup, configOverridesCopy);
        this._deserializationConfig = new DeserializationConfig(objectMapper._deserializationConfig, this._subtypeResolver, this._mixIns, rootNameLookup, configOverridesCopy, coercionConfigsCopy);
        this._serializerProvider = objectMapper._serializerProvider.copy();
        this._deserializationContext = objectMapper._deserializationContext.copy();
        this._serializerFactory = objectMapper._serializerFactory;
        Set<Object> set = objectMapper._registeredModuleTypes;
        if (set == null) {
            this._registeredModuleTypes = null;
        } else {
            this._registeredModuleTypes = new LinkedHashSet(set);
        }
    }

    /* JADX INFO: renamed from: c */
    public static <T> ServiceLoader<T> m11134c(Class<T> cls, ClassLoader classLoader) {
        if (System.getSecurityManager() == null) {
            if (classLoader == null) {
                return ServiceLoader.load(cls);
            }
            return ServiceLoader.load(cls, classLoader);
        }
        return (ServiceLoader) AccessController.doPrivileged(new C6336b(classLoader, cls));
    }

    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() == cls) {
            return;
        }
        throw new IllegalStateException("Failed copy(): " + getClass().getName() + " (version: " + version() + ") does not override copy(); it has to");
    }

    @Deprecated
    public final void _configAndWriteValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        getSerializationConfig().initialize(jsonGenerator);
        _writeValueAndClose(jsonGenerator, obj);
    }

    public InterfaceC6430d<?> _constructDefaultTypeResolverBuilder(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
        return DefaultTypeResolverBuilder.construct(defaultTyping, polymorphicTypeValidator);
    }

    public Object _convert(Object obj, JavaType javaType) throws IllegalArgumentException {
        Object objDeserialize;
        DefaultSerializerProvider defaultSerializerProvider_serializerProvider = _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE));
        C6499p c6499pBufferForValueConversion = defaultSerializerProvider_serializerProvider.bufferForValueConversion(this);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            c6499pBufferForValueConversion = c6499pBufferForValueConversion.m12020a1(true);
        }
        try {
            defaultSerializerProvider_serializerProvider.serializeValue(c6499pBufferForValueConversion, obj);
            JsonParser jsonParserM12013T0 = c6499pBufferForValueConversion.m12013T0();
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            JsonToken jsonToken_initForReading = _initForReading(jsonParserM12013T0, javaType);
            if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
                DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParserM12013T0, deserializationConfig);
                objDeserialize = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType).getNullValue(defaultDeserializationContextCreateDeserializationContext);
            } else if (jsonToken_initForReading != JsonToken.END_ARRAY && jsonToken_initForReading != JsonToken.END_OBJECT) {
                DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext2 = createDeserializationContext(jsonParserM12013T0, deserializationConfig);
                objDeserialize = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext2, javaType).deserialize(jsonParserM12013T0, defaultDeserializationContextCreateDeserializationContext2);
            } else {
                objDeserialize = null;
            }
            jsonParserM12013T0.close();
            return objDeserialize;
        } catch (IOException e11) {
            throw new IllegalArgumentException(e11.getMessage(), e11);
        }
    }

    public ObjectWriter _newWriter(SerializationConfig serializationConfig, JavaType javaType, InterfaceC6305h interfaceC6305h) {
        return new ObjectWriter(this, serializationConfig, javaType, interfaceC6305h);
    }

    public Object _readMapAndClose(JsonParser jsonParser, JavaType javaType) throws IOException {
        Object rootValue;
        try {
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
            JsonToken jsonToken_initForReading = _initForReading(jsonParser, javaType);
            if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
                rootValue = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType).getNullValue(defaultDeserializationContextCreateDeserializationContext);
            } else if (jsonToken_initForReading != JsonToken.END_ARRAY && jsonToken_initForReading != JsonToken.END_OBJECT) {
                rootValue = defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, javaType, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType), null);
                defaultDeserializationContextCreateDeserializationContext.checkUnresolvedObjectId();
            } else {
                rootValue = null;
            }
            if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, javaType);
            }
            if (jsonParser != null) {
                jsonParser.close();
            }
            return rootValue;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                if (jsonParser != null) {
                    try {
                        jsonParser.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    public Object _readValue(DeserializationConfig deserializationConfig, JsonParser jsonParser, JavaType javaType) throws IOException {
        Object rootValue;
        JsonToken jsonToken_initForReading = _initForReading(jsonParser, javaType);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
        if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
            rootValue = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType).getNullValue(defaultDeserializationContextCreateDeserializationContext);
        } else if (jsonToken_initForReading != JsonToken.END_ARRAY && jsonToken_initForReading != JsonToken.END_OBJECT) {
            rootValue = defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, javaType, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType), null);
        } else {
            rootValue = null;
        }
        jsonParser.mo10885i();
        if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, javaType);
        }
        return rootValue;
    }

    public final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
        if (jsonTokenMo10905t0 != null) {
            deserializationContext.reportTrailingTokens(C6490g.m11931d0(javaType), jsonParser, jsonTokenMo10905t0);
        }
    }

    public final void _writeValueAndClose(JsonGenerator jsonGenerator, Object obj) throws IOException {
        SerializationConfig serializationConfig = getSerializationConfig();
        if (serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            m11135a(jsonGenerator, obj, serializationConfig);
            return;
        }
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            jsonGenerator.close();
        } catch (Exception e11) {
            C6490g.m11944k(jsonGenerator, e11);
        }
    }

    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping, JsonTypeInfo.EnumC6265As enumC6265As) {
        if (enumC6265As != JsonTypeInfo.EnumC6265As.EXTERNAL_PROPERTY) {
            return setDefaultTyping(_constructDefaultTypeResolverBuilder(defaultTyping, polymorphicTypeValidator).init(JsonTypeInfo.EnumC6266Id.CLASS, null).inclusion(enumC6265As));
        }
        throw new IllegalArgumentException("Cannot use includeAs of " + enumC6265As);
    }

    public ObjectMapper activateDefaultTypingAsProperty(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping, String str) {
        return setDefaultTyping(_constructDefaultTypeResolverBuilder(defaultTyping, polymorphicTypeValidator).init(JsonTypeInfo.EnumC6266Id.CLASS, null).inclusion(JsonTypeInfo.EnumC6265As.PROPERTY).typeProperty(str));
    }

    @Deprecated
    public final void addMixInAnnotations(Class<?> cls, Class<?> cls2) {
        addMixIn(cls, cls2);
    }

    public JavaType constructType(AbstractC42116b<?> abstractC42116b) {
        _assertNotNull("typeRef", abstractC42116b);
        return this._typeFactory.constructType(abstractC42116b);
    }

    public <T> T convertValue(Object obj, JavaType javaType) throws IllegalArgumentException {
        return (T) _convert(obj, javaType);
    }

    public JsonParser createParser(URL url) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, url);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(url));
    }

    public ObjectMapper disable(SerializationFeature serializationFeature) {
        this._serializationConfig = this._serializationConfig.without(serializationFeature);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationFeature) {
        this._serializationConfig = this._serializationConfig.with(serializationFeature);
        return this;
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping(DefaultTyping defaultTyping, JsonTypeInfo.EnumC6265As enumC6265As) {
        return activateDefaultTyping(getPolymorphicTypeValidator(), defaultTyping, enumC6265As);
    }

    @Deprecated
    public ObjectMapper enableDefaultTypingAsProperty(DefaultTyping defaultTyping, String str) {
        return activateDefaultTypingAsProperty(getPolymorphicTypeValidator(), defaultTyping, str);
    }

    public ObjectMapper findAndRegisterModules() {
        return registerModules(findModules());
    }

    @Deprecated
    public C43651a generateJsonSchema(Class<?> cls) throws JsonMappingException {
        return _serializerProvider(getSerializationConfig()).generateJsonSchema(cls);
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._deserializationConfig.isEnabled(deserializationFeature);
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g
    public <T> T readValue(JsonParser jsonParser, AbstractC42116b<T> abstractC42116b) throws IOException {
        _assertNotNull("p", jsonParser);
        return (T) _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.constructType((AbstractC42116b<?>) abstractC42116b));
    }

    public ObjectReader reader(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _newReader(getDeserializationConfig().with(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader readerFor(AbstractC42116b<?> abstractC42116b) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(abstractC42116b), null, null, null);
    }

    public ObjectReader readerForArrayOf(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructArrayType(cls), null, null, null);
    }

    public ObjectReader readerForListOf(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructCollectionType(List.class, cls), null, null, null);
    }

    public ObjectReader readerForMapOf(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructMapType(Map.class, String.class, cls), null, null, null);
    }

    public ObjectReader readerWithView(Class<?> cls) {
        return _newReader(getDeserializationConfig().withView(cls));
    }

    public ObjectMapper registerModules(Iterable<? extends AbstractC6444k> iterable) {
        _assertNotNull("modules", iterable);
        Iterator<? extends AbstractC6444k> it = iterable.iterator();
        while (it.hasNext()) {
            registerModule(it.next());
        }
        return this;
    }

    public void registerSubtypes(Collection<Class<?>> collection) {
        getSubtypeResolver().registerSubtypes(collection);
    }

    public ObjectMapper setConfig(SerializationConfig serializationConfig) {
        _assertNotNull("config", serializationConfig);
        this._serializationConfig = serializationConfig;
        return this;
    }

    @Deprecated
    public void setMixInAnnotations(Map<Class<?>, Class<?>> map) {
        setMixIns(map);
    }

    @Deprecated
    public ObjectMapper setPropertyInclusion(JsonInclude.Value value) {
        return setDefaultPropertyInclusion(value);
    }

    public ObjectMapper setSerializationInclusion(JsonInclude.Include include) {
        setPropertyInclusion(JsonInclude.Value.construct(include, include));
        return this;
    }

    @Deprecated
    public void setVisibilityChecker(VisibilityChecker<?> visibilityChecker) {
        setVisibility(visibilityChecker);
    }

    public ObjectWriter writer(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        return _newWriter(getSerializationConfig().with(serializationFeature, serializationFeatureArr));
    }

    public ObjectWriter writerWithDefaultPrettyPrinter() {
        SerializationConfig serializationConfig = getSerializationConfig();
        return _newWriter(serializationConfig, null, serializationConfig.getDefaultPrettyPrinter());
    }

    public ObjectWriter writerWithView(Class<?> cls) {
        return _newWriter(getSerializationConfig().withView(cls));
    }

    public boolean canDeserialize(JavaType javaType, AtomicReference<Throwable> atomicReference) {
        return createDeserializationContext(null, getDeserializationConfig()).hasValueDeserializerFor(javaType, atomicReference);
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        _assertNotNull("out", outputStream);
        JsonGenerator jsonGeneratorCreateGenerator = this._jsonFactory.createGenerator(outputStream, jsonEncoding);
        this._serializationConfig.initialize(jsonGeneratorCreateGenerator);
        return jsonGeneratorCreateGenerator;
    }

    public ObjectMapper disable(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        this._serializationConfig = this._serializationConfig.without(serializationFeature, serializationFeatureArr);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        this._serializationConfig = this._serializationConfig.with(serializationFeature, serializationFeatureArr);
        return this;
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this._deserializationConfig.isEnabled(feature, this._jsonFactory);
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g
    public <T> C6424j<T> readValues(JsonParser jsonParser, AbstractC42115a abstractC42115a) throws IOException {
        return readValues(jsonParser, (JavaType) abstractC42115a);
    }

    public ObjectReader reader(JsonNodeFactory jsonNodeFactory) {
        return _newReader(getDeserializationConfig()).with(jsonNodeFactory);
    }

    public ObjectWriter writer(DateFormat dateFormat) {
        return _newWriter(getSerializationConfig().with(dateFormat));
    }

    public ObjectWriter writerFor(AbstractC42116b<?> abstractC42116b) {
        return _newWriter(getSerializationConfig(), null, null);
    }

    @Deprecated
    public ObjectWriter writerWithType(AbstractC42116b<?> abstractC42116b) {
        return _newWriter(getSerializationConfig(), null, null);
    }

    public ObjectMapper configure(SerializationFeature serializationFeature, boolean z11) {
        this._serializationConfig = z11 ? this._serializationConfig.with(serializationFeature) : this._serializationConfig.without(serializationFeature);
        return this;
    }

    public JsonParser createParser(InputStream inputStream) throws IOException {
        _assertNotNull("in", inputStream);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(inputStream));
    }

    public ObjectMapper disable(DeserializationFeature deserializationFeature) {
        this._deserializationConfig = this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    public ObjectMapper enable(DeserializationFeature deserializationFeature) {
        this._deserializationConfig = this._deserializationConfig.with(deserializationFeature);
        return this;
    }

    public boolean isEnabled(JsonGenerator.Feature feature) {
        return this._serializationConfig.isEnabled(feature, this._jsonFactory);
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g
    public final <T> T readValue(JsonParser jsonParser, AbstractC42115a abstractC42115a) throws IOException {
        _assertNotNull("p", jsonParser);
        return (T) _readValue(getDeserializationConfig(), jsonParser, (JavaType) abstractC42115a);
    }

    public <T> C6424j<T> readValues(JsonParser jsonParser, JavaType javaType) throws IOException {
        _assertNotNull("p", jsonParser);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser, getDeserializationConfig());
        return new C6424j<>(javaType, jsonParser, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType), false, null);
    }

    public ObjectReader reader(InterfaceC6299c interfaceC6299c) {
        _verifySchemaType(interfaceC6299c);
        return _newReader(getDeserializationConfig(), null, null, interfaceC6299c, null);
    }

    public ObjectWriter writer(InterfaceC6305h interfaceC6305h) {
        if (interfaceC6305h == null) {
            interfaceC6305h = ObjectWriter.NULL_PRETTY_PRINTER;
        }
        return _newWriter(getSerializationConfig(), null, interfaceC6305h);
    }

    public ObjectWriter writerFor(JavaType javaType) {
        return _newWriter(getSerializationConfig(), javaType, null);
    }

    @Deprecated
    public ObjectWriter writerWithType(JavaType javaType) {
        return _newWriter(getSerializationConfig(), javaType, null);
    }

    public ObjectMapper disable(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.without(deserializationFeature, deserializationFeatureArr);
        return this;
    }

    public ObjectMapper enable(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.with(deserializationFeature, deserializationFeatureArr);
        return this;
    }

    public boolean isEnabled(JsonFactory.Feature feature) {
        return this._jsonFactory.isEnabled(feature);
    }

    public void writeTree(JsonGenerator jsonGenerator, AbstractC6391f abstractC6391f) throws IOException {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, abstractC6391f);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    public ObjectMapper configure(DeserializationFeature deserializationFeature, boolean z11) {
        this._deserializationConfig = z11 ? this._deserializationConfig.with(deserializationFeature) : this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    public JsonGenerator createGenerator(Writer writer) throws IOException {
        _assertNotNull("w", writer);
        JsonGenerator jsonGeneratorCreateGenerator = this._jsonFactory.createGenerator(writer);
        this._serializationConfig.initialize(jsonGeneratorCreateGenerator);
        return jsonGeneratorCreateGenerator;
    }

    public JsonParser createParser(Reader reader) throws IOException {
        _assertNotNull("r", reader);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(reader));
    }

    public ObjectMapper disable(JsonParser.Feature... featureArr) {
        for (JsonParser.Feature feature : featureArr) {
            this._jsonFactory.disable(feature);
        }
        return this;
    }

    public ObjectMapper enable(JsonParser.Feature... featureArr) {
        for (JsonParser.Feature feature : featureArr) {
            this._jsonFactory.enable(feature);
        }
        return this;
    }

    public boolean isEnabled(StreamReadFeature streamReadFeature) {
        return isEnabled(streamReadFeature.mappedFeature());
    }

    public AbstractC6391f readTree(InputStream inputStream) throws IOException {
        _assertNotNull("in", inputStream);
        return _readTreeAndClose(this._jsonFactory.createParser(inputStream));
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException {
        _assertNotNull("p", jsonParser);
        return (T) _readValue(getDeserializationConfig(), jsonParser, javaType);
    }

    public ObjectReader reader(AbstractC6348d abstractC6348d) {
        return _newReader(getDeserializationConfig(), null, null, null, abstractC6348d);
    }

    public ObjectWriter writer(AbstractC6456e abstractC6456e) {
        return _newWriter(getSerializationConfig().withFilters(abstractC6456e));
    }

    public boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return isEnabled(streamWriteFeature.mappedFeature());
    }

    public ObjectReader reader(Base64Variant base64Variant) {
        return _newReader(getDeserializationConfig().with(base64Variant));
    }

    public ObjectWriter writer(InterfaceC6299c interfaceC6299c) {
        _verifySchemaType(interfaceC6299c);
        return _newWriter(getSerializationConfig(), interfaceC6299c);
    }

    public ObjectMapper configure(JsonParser.Feature feature, boolean z11) {
        this._jsonFactory.configure(feature, z11);
        return this;
    }

    public JsonParser createParser(byte[] bArr) throws IOException {
        _assertNotNull("content", bArr);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(bArr));
    }

    public ObjectMapper disable(JsonGenerator.Feature... featureArr) {
        for (JsonGenerator.Feature feature : featureArr) {
            this._jsonFactory.disable(feature);
        }
        return this;
    }

    public ObjectMapper enable(JsonGenerator.Feature... featureArr) {
        for (JsonGenerator.Feature feature : featureArr) {
            this._jsonFactory.enable(feature);
        }
        return this;
    }

    public AbstractC6391f readTree(Reader reader) throws IOException {
        _assertNotNull("r", reader);
        return _readTreeAndClose(this._jsonFactory.createParser(reader));
    }

    public <T> T readValue(File file, Class<T> cls) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, file);
        return (T) _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType(cls));
    }

    public ObjectReader reader(ContextAttributes contextAttributes) {
        return _newReader(getDeserializationConfig().with(contextAttributes));
    }

    public ObjectMapper configure(JsonGenerator.Feature feature, boolean z11) {
        this._jsonFactory.configure(feature, z11);
        return this;
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        _assertNotNull("outputFile", file);
        JsonGenerator jsonGeneratorCreateGenerator = this._jsonFactory.createGenerator(file, jsonEncoding);
        this._serializationConfig.initialize(jsonGeneratorCreateGenerator);
        return jsonGeneratorCreateGenerator;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g
    public <T> C6424j<T> readValues(JsonParser jsonParser, Class<T> cls) throws IOException {
        return readValues(jsonParser, this._typeFactory.constructType(cls));
    }

    @Deprecated
    public ObjectReader reader(JavaType javaType) {
        return _newReader(getDeserializationConfig(), javaType, null, null, null);
    }

    public ObjectWriter writer(Base64Variant base64Variant) {
        return _newWriter(getSerializationConfig().with(base64Variant));
    }

    public JsonParser createParser(byte[] bArr, int i11, int i12) throws IOException {
        _assertNotNull("content", bArr);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(bArr, i11, i12));
    }

    public AbstractC6391f readTree(String str) throws JsonProcessingException {
        _assertNotNull("content", str);
        try {
            return _readTreeAndClose(this._jsonFactory.createParser(str));
        } catch (JsonProcessingException e11) {
            throw e11;
        } catch (IOException e12) {
            throw JsonMappingException.fromUnexpectedIOE(e12);
        }
    }

    public <T> T readValue(File file, AbstractC42116b<T> abstractC42116b) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, file);
        return (T) _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType((AbstractC42116b<?>) abstractC42116b));
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g
    public <T> C6424j<T> readValues(JsonParser jsonParser, AbstractC42116b<T> abstractC42116b) throws IOException {
        return readValues(jsonParser, this._typeFactory.constructType((AbstractC42116b<?>) abstractC42116b));
    }

    @Deprecated
    public ObjectReader reader(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(cls), null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T treeToValue(InterfaceC6320l interfaceC6320l, JavaType javaType) throws JsonProcessingException, IllegalArgumentException {
        T t11;
        if (interfaceC6320l == 0) {
            return null;
        }
        try {
            if (javaType.isTypeOrSubTypeOf(InterfaceC6320l.class) && javaType.isTypeOrSuperTypeOf(interfaceC6320l.getClass())) {
                return interfaceC6320l;
            }
            return (interfaceC6320l.asToken() == JsonToken.VALUE_EMBEDDED_OBJECT && (interfaceC6320l instanceof POJONode) && ((t11 = (T) ((POJONode) interfaceC6320l).getPojo()) == null || javaType.isTypeOrSuperTypeOf(t11.getClass()))) ? t11 : (T) readValue(treeAsTokens(interfaceC6320l), javaType);
        } catch (JsonProcessingException e11) {
            throw e11;
        } catch (IOException e12) {
            throw new IllegalArgumentException(e12.getMessage(), e12);
        }
    }

    public void writeValue(File file, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(file, JsonEncoding.UTF8), obj);
    }

    public ObjectWriter writer(CharacterEscapes characterEscapes) {
        return _newWriter(getSerializationConfig()).with(characterEscapes);
    }

    @Deprecated
    public ObjectReader reader(AbstractC42116b<?> abstractC42116b) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(abstractC42116b), null, null, null);
    }

    public void writeValue(OutputStream outputStream, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(outputStream, JsonEncoding.UTF8), obj);
    }

    public ObjectWriter writer(ContextAttributes contextAttributes) {
        return _newWriter(getSerializationConfig().with(contextAttributes));
    }

    public JsonGenerator createGenerator(DataOutput dataOutput) throws IOException {
        _assertNotNull("out", dataOutput);
        JsonGenerator jsonGeneratorCreateGenerator = this._jsonFactory.createGenerator(dataOutput);
        this._serializationConfig.initialize(jsonGeneratorCreateGenerator);
        return jsonGeneratorCreateGenerator;
    }

    public JsonParser createParser(String str) throws IOException {
        _assertNotNull("content", str);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(str));
    }

    public <T> T readValue(File file, JavaType javaType) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, file);
        return (T) _readMapAndClose(this._jsonFactory.createParser(file), javaType);
    }

    public void writeValue(DataOutput dataOutput, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(dataOutput), obj);
    }

    public void writeValue(Writer writer, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(writer), obj);
    }

    public JsonParser createParser(char[] cArr) throws IOException {
        _assertNotNull("content", cArr);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(cArr));
    }

    public AbstractC6391f readTree(byte[] bArr) throws IOException {
        _assertNotNull("content", bArr);
        return _readTreeAndClose(this._jsonFactory.createParser(bArr));
    }

    public <T> T readValue(URL url, Class<T> cls) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, url);
        return (T) _readMapAndClose(this._jsonFactory.createParser(url), this._typeFactory.constructType(cls));
    }

    public JsonParser createParser(char[] cArr, int i11, int i12) throws IOException {
        _assertNotNull("content", cArr);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(cArr, i11, i12));
    }

    public AbstractC6391f readTree(byte[] bArr, int i11, int i12) throws IOException {
        _assertNotNull("content", bArr);
        return _readTreeAndClose(this._jsonFactory.createParser(bArr, i11, i12));
    }

    public <T> T readValue(URL url, AbstractC42116b<T> abstractC42116b) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, url);
        return (T) _readMapAndClose(this._jsonFactory.createParser(url), this._typeFactory.constructType((AbstractC42116b<?>) abstractC42116b));
    }

    public JsonParser createParser(DataInput dataInput) throws IOException {
        _assertNotNull("content", dataInput);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(dataInput));
    }

    public AbstractC6391f readTree(File file) throws IOException {
        _assertNotNull("file", file);
        return _readTreeAndClose(this._jsonFactory.createParser(file));
    }

    public <T> T readValue(URL url, JavaType javaType) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, url);
        return (T) _readMapAndClose(this._jsonFactory.createParser(url), javaType);
    }

    public ObjectMapper(JsonFactory jsonFactory, DefaultSerializerProvider defaultSerializerProvider, DefaultDeserializationContext defaultDeserializationContext) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (jsonFactory == null) {
            this._jsonFactory = new MappingJsonFactory(this);
        } else {
            this._jsonFactory = jsonFactory;
            if (jsonFactory.getCodec() == null) {
                jsonFactory.setCodec(this);
            }
        }
        this._subtypeResolver = new StdSubtypeResolver();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this._typeFactory = TypeFactory.defaultInstance();
        SimpleMixInResolver simpleMixInResolver = new SimpleMixInResolver(null);
        this._mixIns = simpleMixInResolver;
        BaseSettings baseSettingsWithClassIntrospector = DEFAULT_BASE.withClassIntrospector(defaultClassIntrospector());
        ConfigOverrides configOverrides = new ConfigOverrides();
        this._configOverrides = configOverrides;
        CoercionConfigs coercionConfigs = new CoercionConfigs();
        this._coercionConfigs = coercionConfigs;
        this._serializationConfig = new SerializationConfig(baseSettingsWithClassIntrospector, this._subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
        this._deserializationConfig = new DeserializationConfig(baseSettingsWithClassIntrospector, this._subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides, coercionConfigs);
        boolean zRequiresPropertyOrdering = this._jsonFactory.requiresPropertyOrdering();
        SerializationConfig serializationConfig = this._serializationConfig;
        MapperFeature mapperFeature = MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
        if (serializationConfig.isEnabled(mapperFeature) ^ zRequiresPropertyOrdering) {
            configure(mapperFeature, zRequiresPropertyOrdering);
        }
        this._serializerProvider = defaultSerializerProvider == null ? new DefaultSerializerProvider.Impl() : defaultSerializerProvider;
        this._deserializationContext = defaultDeserializationContext == null ? new DefaultDeserializationContext.Impl(BeanDeserializerFactory.instance) : defaultDeserializationContext;
        this._serializerFactory = BeanSerializerFactory.instance;
    }

    public AbstractC6391f readTree(URL url) throws IOException {
        _assertNotNull("source", url);
        return _readTreeAndClose(this._jsonFactory.createParser(url));
    }

    public <T> T readValue(String str, Class<T> cls) throws JsonProcessingException {
        _assertNotNull("content", str);
        return (T) readValue(str, this._typeFactory.constructType(cls));
    }

    public <T> T readValue(String str, AbstractC42116b<T> abstractC42116b) throws JsonProcessingException {
        _assertNotNull("content", str);
        return (T) readValue(str, this._typeFactory.constructType((AbstractC42116b<?>) abstractC42116b));
    }

    public ObjectMapper setInjectableValues(AbstractC6348d abstractC6348d) {
        return this;
    }

    public <T> T readValue(String str, JavaType javaType) throws JsonProcessingException {
        _assertNotNull("content", str);
        try {
            return (T) _readMapAndClose(this._jsonFactory.createParser(str), javaType);
        } catch (JsonProcessingException e11) {
            throw e11;
        } catch (IOException e12) {
            throw JsonMappingException.fromUnexpectedIOE(e12);
        }
    }

    public <T> T readValue(Reader reader, Class<T> cls) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, reader);
        return (T) _readMapAndClose(this._jsonFactory.createParser(reader), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(Reader reader, AbstractC42116b<T> abstractC42116b) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, reader);
        return (T) _readMapAndClose(this._jsonFactory.createParser(reader), this._typeFactory.constructType((AbstractC42116b<?>) abstractC42116b));
    }

    public <T> T readValue(Reader reader, JavaType javaType) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, reader);
        return (T) _readMapAndClose(this._jsonFactory.createParser(reader), javaType);
    }

    public <T> T readValue(InputStream inputStream, Class<T> cls) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, inputStream);
        return (T) _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(InputStream inputStream, AbstractC42116b<T> abstractC42116b) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, inputStream);
        return (T) _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.constructType((AbstractC42116b<?>) abstractC42116b));
    }

    public <T> T readValue(InputStream inputStream, JavaType javaType) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, inputStream);
        return (T) _readMapAndClose(this._jsonFactory.createParser(inputStream), javaType);
    }

    public <T> T readValue(byte[] bArr, Class<T> cls) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(byte[] bArr, int i11, int i12, Class<T> cls) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr, i11, i12), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(byte[] bArr, AbstractC42116b<T> abstractC42116b) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType((AbstractC42116b<?>) abstractC42116b));
    }

    public <T> T readValue(byte[] bArr, int i11, int i12, AbstractC42116b<T> abstractC42116b) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr, i11, i12), this._typeFactory.constructType((AbstractC42116b<?>) abstractC42116b));
    }

    public <T> T readValue(byte[] bArr, JavaType javaType) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr), javaType);
    }

    public <T> T readValue(byte[] bArr, int i11, int i12, JavaType javaType) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr, i11, i12), javaType);
    }

    public <T> T readValue(DataInput dataInput, Class<T> cls) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, dataInput);
        return (T) _readMapAndClose(this._jsonFactory.createParser(dataInput), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(DataInput dataInput, JavaType javaType) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, dataInput);
        return (T) _readMapAndClose(this._jsonFactory.createParser(dataInput), javaType);
    }
}
