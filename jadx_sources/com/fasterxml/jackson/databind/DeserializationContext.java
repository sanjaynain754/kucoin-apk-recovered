package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.InterfaceC6269a0;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.util.C6327f;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.AbstractC6361f;
import com.fasterxml.jackson.databind.deser.AbstractC6362g;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.InterfaceC6358c;
import com.fasterxml.jackson.databind.deser.InterfaceC6359d;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.C6373h;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import com.fasterxml.jackson.databind.introspect.AbstractC6404a;
import com.fasterxml.jackson.databind.introspect.AbstractC6414k;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6429c;
import com.fasterxml.jackson.databind.node.C6450d;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.C6485b;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.C6492i;
import com.fasterxml.jackson.databind.util.C6495l;
import com.fasterxml.jackson.databind.util.C6499p;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes45.dex */
public abstract class DeserializationContext extends AbstractC6341c implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient C6485b _arrayBuilders;
    protected transient ContextAttributes _attributes;
    protected final DeserializerCache _cache;
    protected final DeserializationConfig _config;
    protected C6492i<JavaType> _currentType;
    protected transient DateFormat _dateFormat;
    protected final AbstractC6362g _factory;
    protected final int _featureFlags;
    protected final AbstractC6348d _injectableValues;
    protected transient C6495l _objectBuffer;
    protected transient JsonParser _parser;
    protected final C6327f<StreamReadCapability> _readCapabilities;
    protected final Class<?> _view;

    public DeserializationContext(AbstractC6362g abstractC6362g) {
        this(abstractC6362g, (DeserializerCache) null);
    }

    public boolean _isCompatible(Class<?> cls, Object obj) {
        if (obj == null || cls.isInstance(obj)) {
            return true;
        }
        return cls.isPrimitive() && C6490g.m11953o0(cls).isInstance(obj);
    }

    public C6499p bufferForInputBuffering(JsonParser jsonParser) {
        return new C6499p(jsonParser, this);
    }

    public abstract void checkUnresolvedObjectId() throws UnresolvedForwardReference;

    public abstract AbstractC6390e<Object> deserializerInstance(AbstractC6404a abstractC6404a, Object obj) throws JsonMappingException;

    public abstract C6373h findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator, InterfaceC6269a0 interfaceC6269a0);

    public Object handleUnexpectedToken(Class<?> cls, JsonParser jsonParser) throws IOException {
        return handleUnexpectedToken(constructType(cls), jsonParser.mo10889k(), jsonParser, (String) null, new Object[0]);
    }

    public JsonMappingException instantiationException(Class<?> cls, Throwable th2) {
        String strM11952o;
        if (th2 == null) {
            strM11952o = "N/A";
        } else {
            strM11952o = C6490g.m11952o(th2);
            if (strM11952o == null) {
                strM11952o = C6490g.m11921X(th2.getClass());
            }
        }
        return ValueInstantiationException.from(this._parser, String.format("Cannot construct instance of %s, problem: %s", C6490g.m11921X(cls), strM11952o), constructType(cls), th2);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public final boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public abstract AbstractC6394i keyDeserializerInstance(AbstractC6404a abstractC6404a, Object obj) throws JsonMappingException;

    @Deprecated
    public JsonMappingException mappingException(String str) {
        return JsonMappingException.from(getParser(), str);
    }

    public <T> T readPropertyValue(JsonParser jsonParser, BeanProperty beanProperty, Class<T> cls) throws IOException {
        return (T) readPropertyValue(jsonParser, beanProperty, getTypeFactory().constructType(cls));
    }

    public <T> T readTreeAsValue(AbstractC6391f abstractC6391f, Class<T> cls) throws IOException {
        if (abstractC6391f == null) {
            return null;
        }
        C6450d c6450dM11133b = m11133b(abstractC6391f);
        try {
            T t11 = (T) readValue(c6450dM11133b, cls);
            if (c6450dM11133b != null) {
                c6450dM11133b.close();
            }
            return t11;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                if (c6450dM11133b != null) {
                    try {
                        c6450dM11133b.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException {
        return (T) readValue(jsonParser, getTypeFactory().constructType(cls));
    }

    public <T> T reportInputMismatch(AbstractC6390e<?> abstractC6390e, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), abstractC6390e.handledType(), _format(str, objArr));
    }

    public <T> T reportPropertyInputMismatch(Class<?> cls, String str, String str2, Object... objArr) throws JsonMappingException {
        MismatchedInputException mismatchedInputExceptionFrom = MismatchedInputException.from(getParser(), cls, _format(str2, objArr));
        if (str == null) {
            throw mismatchedInputExceptionFrom;
        }
        mismatchedInputExceptionFrom.prependPath(cls, str);
        throw mismatchedInputExceptionFrom;
    }

    public void reportWrongTokenException(AbstractC6390e<?> abstractC6390e, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), abstractC6390e.handledType(), jsonToken, _format(str, objArr));
    }

    public JsonMappingException wrongTokenException(JsonParser jsonParser, JavaType javaType, JsonToken jsonToken, String str) {
        return MismatchedInputException.from(jsonParser, javaType, _colonConcat(String.format("Unexpected token (%s), expected %s", jsonParser.mo10889k(), jsonToken), str));
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.DeserializationContext$a */
    public static /* synthetic */ class C6334a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10189a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f10189a = iArr;
            try {
                iArr[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10189a[JsonToken.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10189a[JsonToken.FIELD_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10189a[JsonToken.START_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10189a[JsonToken.END_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10189a[JsonToken.VALUE_FALSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10189a[JsonToken.VALUE_TRUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10189a[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10189a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10189a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10189a[JsonToken.VALUE_STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10189a[JsonToken.VALUE_NULL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10189a[JsonToken.NOT_AVAILABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public DeserializationContext(AbstractC6362g abstractC6362g, DeserializerCache deserializerCache) {
        if (abstractC6362g == null) {
            throw new NullPointerException("Cannot pass null DeserializerFactory");
        }
        this._factory = abstractC6362g;
        this._cache = deserializerCache == null ? new DeserializerCache() : deserializerCache;
        this._featureFlags = 0;
        this._readCapabilities = null;
        this._config = null;
        this._view = null;
        this._attributes = null;
    }

    public DateFormat _getDateFormat() {
        DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat2;
        return dateFormat2;
    }

    public String _shapeForToken(JsonToken jsonToken) {
        if (jsonToken == null) {
            return "<end of input>";
        }
        switch (C6334a.f10189a[jsonToken.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return "Object value";
            case 4:
            case 5:
                return "Array value";
            case 6:
            case 7:
                return "Boolean value";
            case 8:
                return "Embedded Object";
            case 9:
                return "Floating-point value";
            case 10:
                return "Integer value";
            case 11:
                return "String value";
            case 12:
                return "Null value";
            default:
                return "[Unavailable value]";
        }
    }

    /* JADX INFO: renamed from: b */
    public final C6450d m11133b(AbstractC6391f abstractC6391f) throws IOException {
        JsonParser jsonParser = this._parser;
        C6450d c6450d = new C6450d(abstractC6391f, jsonParser == null ? null : jsonParser.mo10906u());
        c6450d.mo10905t0();
        return c6450d;
    }

    public final C6499p bufferForInputBuffering() {
        return bufferForInputBuffering(getParser());
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public final boolean canOverrideAccessModifiers() {
        return this._config.canOverrideAccessModifiers();
    }

    public final JavaType constructType(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return this._config.constructType(cls);
    }

    @Deprecated
    public JsonMappingException endOfInputException(Class<?> cls) {
        return MismatchedInputException.from(this._parser, cls, "Unexpected end-of-input when trying to deserialize a " + cls.getName());
    }

    public CoercionAction findCoercionAction(LogicalType logicalType, Class<?> cls, CoercionInputShape coercionInputShape) {
        return this._config.findCoercionAction(logicalType, cls, coercionInputShape);
    }

    public CoercionAction findCoercionFromBlankString(LogicalType logicalType, Class<?> cls, CoercionAction coercionAction) {
        return this._config.findCoercionFromBlankString(logicalType, cls, coercionAction);
    }

    public final AbstractC6390e<Object> findContextualValueDeserializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6390e<Object> abstractC6390eFindValueDeserializer = this._cache.findValueDeserializer(this, this._factory, javaType);
        return abstractC6390eFindValueDeserializer != null ? handleSecondaryContextualization(abstractC6390eFindValueDeserializer, beanProperty, javaType) : abstractC6390eFindValueDeserializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC6394i findKeyDeserializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6394i abstractC6394iFindKeyDeserializer;
        try {
            abstractC6394iFindKeyDeserializer = this._cache.findKeyDeserializer(this, this._factory, javaType);
        } catch (IllegalArgumentException e11) {
            reportBadDefinition(javaType, C6490g.m11952o(e11));
            abstractC6394iFindKeyDeserializer = 0;
        }
        return abstractC6394iFindKeyDeserializer instanceof InterfaceC6359d ? ((InterfaceC6359d) abstractC6394iFindKeyDeserializer).createContextual(this, beanProperty) : abstractC6394iFindKeyDeserializer;
    }

    public final AbstractC6390e<Object> findNonContextualValueDeserializer(JavaType javaType) throws JsonMappingException {
        return this._cache.findValueDeserializer(this, this._factory, javaType);
    }

    public final AbstractC6390e<Object> findRootValueDeserializer(JavaType javaType) throws JsonMappingException {
        AbstractC6390e<Object> abstractC6390eFindValueDeserializer = this._cache.findValueDeserializer(this, this._factory, javaType);
        if (abstractC6390eFindValueDeserializer == null) {
            return null;
        }
        AbstractC6390e<?> abstractC6390eHandleSecondaryContextualization = handleSecondaryContextualization(abstractC6390eFindValueDeserializer, null, javaType);
        AbstractC6428b abstractC6428bFindTypeDeserializer = this._factory.findTypeDeserializer(this._config, javaType);
        return abstractC6428bFindTypeDeserializer != null ? new TypeWrappedDeserializer(abstractC6428bFindTypeDeserializer.forProperty(null), abstractC6390eHandleSecondaryContextualization) : abstractC6390eHandleSecondaryContextualization;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public final Class<?> getActiveView() {
        return this._view;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public final AnnotationIntrospector getAnnotationIntrospector() {
        return this._config.getAnnotationIntrospector();
    }

    public final C6485b getArrayBuilders() {
        if (this._arrayBuilders == null) {
            this._arrayBuilders = new C6485b();
        }
        return this._arrayBuilders;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public Object getAttribute(Object obj) {
        return this._attributes.getAttribute(obj);
    }

    public final Base64Variant getBase64Variant() {
        return this._config.getBase64Variant();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public DeserializationConfig getConfig() {
        return this._config;
    }

    public JavaType getContextualType() {
        C6492i<JavaType> c6492i = this._currentType;
        if (c6492i == null) {
            return null;
        }
        return c6492i.m11977d();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public final JsonFormat.Value getDefaultPropertyFormat(Class<?> cls) {
        return this._config.getDefaultPropertyFormat(cls);
    }

    public final int getDeserializationFeatures() {
        return this._featureFlags;
    }

    public AbstractC6362g getFactory() {
        return this._factory;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public Locale getLocale() {
        return this._config.getLocale();
    }

    public final JsonNodeFactory getNodeFactory() {
        return this._config.getNodeFactory();
    }

    public final JsonParser getParser() {
        return this._parser;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public final TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public void handleBadMerge(AbstractC6390e<?> abstractC6390e) throws JsonMappingException {
        if (isEnabled(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            return;
        }
        JavaType javaTypeConstructType = constructType(abstractC6390e.handledType());
        throw InvalidDefinitionException.from(getParser(), String.format("Invalid configuration: values of type %s cannot be merged", C6490g.m11904G(javaTypeConstructType)), javaTypeConstructType);
    }

    public Object handleInstantiationProblem(Class<?> cls, Object obj, Throwable th2) throws IOException {
        for (C6492i<AbstractC6361f> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.m11976c()) {
            Object objM11266a = problemHandlers.m11977d().m11266a(this, cls, obj, th2);
            if (objM11266a != AbstractC6361f.f10270a) {
                if (_isCompatible(cls, objM11266a)) {
                    return objM11266a;
                }
                reportBadDefinition(constructType(cls), String.format("DeserializationProblemHandler.handleInstantiationProblem() for type %s returned value of type %s", C6490g.m11963y(cls), C6490g.m11938h(objM11266a)));
            }
        }
        C6490g.m11941i0(th2);
        if (!isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
            C6490g.m11943j0(th2);
        }
        throw instantiationException(cls, th2);
    }

    public Object handleMissingInstantiator(Class<?> cls, ValueInstantiator valueInstantiator, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        if (jsonParser == null) {
            jsonParser = getParser();
        }
        JsonParser jsonParser2 = jsonParser;
        String str_format = _format(str, objArr);
        C6492i<AbstractC6361f> problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            Class<?> cls2 = cls;
            ValueInstantiator valueInstantiator2 = valueInstantiator;
            Object objM11268c = problemHandlers.m11977d().m11268c(this, cls2, valueInstantiator2, jsonParser2, str_format);
            if (objM11268c != AbstractC6361f.f10270a) {
                if (_isCompatible(cls2, objM11268c)) {
                    return objM11268c;
                }
                reportBadDefinition(constructType(cls2), String.format("DeserializationProblemHandler.handleMissingInstantiator() for type %s returned value of type %s", C6490g.m11963y(cls2), C6490g.m11963y(objM11268c)));
            }
            problemHandlers = problemHandlers.m11976c();
            cls = cls2;
            valueInstantiator = valueInstantiator2;
        }
        Class<?> cls3 = cls;
        ValueInstantiator valueInstantiator3 = valueInstantiator;
        if (valueInstantiator3 == null) {
            return reportBadDefinition(cls3, String.format("Cannot construct instance of %s: %s", C6490g.m11921X(cls3), str_format));
        }
        return !valueInstantiator3.canInstantiate() ? reportBadDefinition(cls3, String.format("Cannot construct instance of %s (no Creators, like default constructor, exist): %s", C6490g.m11921X(cls3), str_format)) : reportInputMismatch(cls3, String.format("Cannot construct instance of %s (although at least one Creator exists): %s", C6490g.m11921X(cls3), str_format), new Object[0]);
    }

    public JavaType handleMissingTypeId(JavaType javaType, InterfaceC6429c interfaceC6429c, String str) throws IOException {
        for (C6492i<AbstractC6361f> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.m11976c()) {
            JavaType javaTypeM11269d = problemHandlers.m11977d().m11269d(this, javaType, interfaceC6429c, str);
            if (javaTypeM11269d != null) {
                if (javaTypeM11269d.hasRawClass(Void.class)) {
                    return null;
                }
                if (javaTypeM11269d.isTypeOrSubTypeOf(javaType.getRawClass())) {
                    return javaTypeM11269d;
                }
                throw invalidTypeIdException(javaType, null, "problem handler tried to resolve into non-subtype: " + C6490g.m11904G(javaTypeM11269d));
            }
        }
        throw missingTypeIdException(javaType, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC6390e<?> handlePrimaryContextualization(AbstractC6390e<?> abstractC6390e, BeanProperty beanProperty, JavaType javaType) throws JsonMappingException {
        if (!(abstractC6390e instanceof InterfaceC6358c)) {
            return abstractC6390e;
        }
        this._currentType = new C6492i<>(javaType, this._currentType);
        try {
            return ((InterfaceC6358c) abstractC6390e).createContextual(this, beanProperty);
        } finally {
            this._currentType = this._currentType.m11976c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC6390e<?> handleSecondaryContextualization(AbstractC6390e<?> abstractC6390e, BeanProperty beanProperty, JavaType javaType) throws JsonMappingException {
        if (!(abstractC6390e instanceof InterfaceC6358c)) {
            return abstractC6390e;
        }
        this._currentType = new C6492i<>(javaType, this._currentType);
        try {
            return ((InterfaceC6358c) abstractC6390e).createContextual(this, beanProperty);
        } finally {
            this._currentType = this._currentType.m11976c();
        }
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        return handleUnexpectedToken(constructType(cls), jsonToken, jsonParser, str, objArr);
    }

    public boolean handleUnknownProperty(JsonParser jsonParser, AbstractC6390e<?> abstractC6390e, Object obj, String str) throws IOException {
        C6492i<AbstractC6361f> problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            JsonParser jsonParser2 = jsonParser;
            AbstractC6390e<?> abstractC6390e2 = abstractC6390e;
            Object obj2 = obj;
            String str2 = str;
            if (problemHandlers.m11977d().m11272g(this, jsonParser2, abstractC6390e2, obj2, str2)) {
                return true;
            }
            problemHandlers = problemHandlers.m11976c();
            jsonParser = jsonParser2;
            abstractC6390e = abstractC6390e2;
            obj = obj2;
            str = str2;
        }
        JsonParser jsonParser3 = jsonParser;
        AbstractC6390e<?> abstractC6390e3 = abstractC6390e;
        Object obj3 = obj;
        String str3 = str;
        if (isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            throw UnrecognizedPropertyException.from(this._parser, obj3, str3, abstractC6390e3 == null ? null : abstractC6390e3.getKnownPropertyNames());
        }
        jsonParser3.mo10856C0();
        return true;
    }

    public JavaType handleUnknownTypeId(JavaType javaType, String str, InterfaceC6429c interfaceC6429c, String str2) throws IOException {
        C6492i<AbstractC6361f> problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            JavaType javaType2 = javaType;
            String str3 = str;
            InterfaceC6429c interfaceC6429c2 = interfaceC6429c;
            String str4 = str2;
            JavaType javaTypeM11273h = problemHandlers.m11977d().m11273h(this, javaType2, str3, interfaceC6429c2, str4);
            if (javaTypeM11273h != null) {
                if (javaTypeM11273h.hasRawClass(Void.class)) {
                    return null;
                }
                if (javaTypeM11273h.isTypeOrSubTypeOf(javaType2.getRawClass())) {
                    return javaTypeM11273h;
                }
                throw invalidTypeIdException(javaType2, str3, "problem handler tried to resolve into non-subtype: " + C6490g.m11904G(javaTypeM11273h));
            }
            problemHandlers = problemHandlers.m11976c();
            javaType = javaType2;
            str = str3;
            interfaceC6429c = interfaceC6429c2;
            str2 = str4;
        }
        JavaType javaType3 = javaType;
        String str5 = str;
        String str6 = str2;
        if (isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
            throw invalidTypeIdException(javaType3, str5, str6);
        }
        return null;
    }

    public Object handleWeirdNativeValue(JavaType javaType, Object obj, JsonParser jsonParser) throws IOException {
        Class<?> rawClass = javaType.getRawClass();
        for (C6492i<AbstractC6361f> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.m11976c()) {
            Object objM11275j = problemHandlers.m11977d().m11275j(this, javaType, obj, jsonParser);
            if (objM11275j != AbstractC6361f.f10270a) {
                if (objM11275j == null || rawClass.isInstance(objM11275j)) {
                    return objM11275j;
                }
                throw JsonMappingException.from(jsonParser, _format("DeserializationProblemHandler.handleWeirdNativeValue() for type %s returned value of type %s", C6490g.m11963y(javaType), C6490g.m11963y(objM11275j)));
            }
        }
        throw weirdNativeValueException(obj, rawClass);
    }

    public final boolean hasDeserializationFeatures(int i11) {
        return (this._featureFlags & i11) == i11;
    }

    public final boolean hasSomeOfFeatures(int i11) {
        return (i11 & this._featureFlags) != 0;
    }

    public boolean hasValueDeserializerFor(JavaType javaType, AtomicReference<Throwable> atomicReference) {
        try {
            return this._cache.hasValueDeserializerFor(this, this._factory, javaType);
        } catch (DatabindException e11) {
            if (atomicReference == null) {
                return false;
            }
            atomicReference.set(e11);
            return false;
        } catch (RuntimeException e12) {
            if (atomicReference == null) {
                throw e12;
            }
            atomicReference.set(e12);
            return false;
        }
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this._featureFlags) != 0;
    }

    public final C6495l leaseObjectBuffer() {
        C6495l c6495l = this._objectBuffer;
        if (c6495l == null) {
            return new C6495l();
        }
        this._objectBuffer = null;
        return c6495l;
    }

    @Deprecated
    public JsonMappingException mappingException(String str, Object... objArr) {
        return JsonMappingException.from(getParser(), _format(str, objArr));
    }

    public JsonMappingException missingTypeIdException(JavaType javaType, String str) {
        return InvalidTypeIdException.from(this._parser, _colonConcat(String.format("Could not resolve subtype of %s", javaType), str), javaType, null);
    }

    public <T> T readPropertyValue(JsonParser jsonParser, BeanProperty beanProperty, JavaType javaType) throws IOException {
        AbstractC6390e<Object> abstractC6390eFindContextualValueDeserializer = findContextualValueDeserializer(javaType, beanProperty);
        return abstractC6390eFindContextualValueDeserializer == null ? (T) reportBadDefinition(javaType, String.format("Could not find JsonDeserializer for type %s (via property %s)", C6490g.m11904G(javaType), C6490g.m11920W(beanProperty))) : (T) abstractC6390eFindContextualValueDeserializer.deserialize(jsonParser, this);
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException {
        AbstractC6390e<Object> abstractC6390eFindRootValueDeserializer = findRootValueDeserializer(javaType);
        if (abstractC6390eFindRootValueDeserializer != null) {
            return (T) abstractC6390eFindRootValueDeserializer.deserialize(jsonParser, this);
        }
        return (T) reportBadDefinition(javaType, "Could not find JsonDeserializer for type " + C6490g.m11904G(javaType));
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public <T> T reportBadDefinition(JavaType javaType, String str) throws JsonMappingException {
        throw InvalidDefinitionException.from(this._parser, str, javaType);
    }

    @Deprecated
    public void reportUnknownProperty(Object obj, String str, AbstractC6390e<?> abstractC6390e) throws JsonMappingException {
        if (isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            throw UnrecognizedPropertyException.from(this._parser, obj, str, abstractC6390e == null ? null : abstractC6390e.getKnownPropertyNames());
        }
    }

    public final void returnObjectBuffer(C6495l c6495l) {
        if (this._objectBuffer == null || c6495l.m11985h() >= this._objectBuffer.m11985h()) {
            this._objectBuffer = c6495l;
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public DeserializationContext setAttribute(Object obj, Object obj2) {
        this._attributes = this._attributes.withPerCallAttribute(obj, obj2);
        return this;
    }

    public JsonMappingException weirdKeyException(Class<?> cls, String str, String str2) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize Map key of type %s from String %s: %s", C6490g.m11921X(cls), _quotedString(str), str2), str, cls);
    }

    public JsonMappingException weirdNativeValueException(Object obj, Class<?> cls) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types", C6490g.m11921X(cls), C6490g.m11938h(obj)), obj, cls);
    }

    public JsonMappingException weirdNumberException(Number number, Class<?> cls, String str) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from number %s: %s", C6490g.m11921X(cls), String.valueOf(number), str), number, cls);
    }

    public C6499p bufferAsCopyOfValue(JsonParser jsonParser) throws IOException {
        C6499p c6499pBufferForInputBuffering = bufferForInputBuffering(jsonParser);
        c6499pBufferForInputBuffering.m12017X0(jsonParser);
        return c6499pBufferForInputBuffering;
    }

    public Calendar constructCalendar(Date date) {
        Calendar calendar = Calendar.getInstance(getTimeZone());
        calendar.setTime(date);
        return calendar;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) throws IllegalArgumentException {
        if (javaType.hasRawClass(cls)) {
            return javaType;
        }
        return getConfig().getTypeFactory().constructSpecializedType(javaType, cls, false);
    }

    public String extractScalarFromObject(JsonParser jsonParser, AbstractC6390e<?> abstractC6390e, Class<?> cls) throws IOException {
        return (String) handleUnexpectedToken(cls, jsonParser);
    }

    public Class<?> findClass(String str) throws ClassNotFoundException {
        return getTypeFactory().findClass(str);
    }

    public final Object findInjectableValue(Object obj, BeanProperty beanProperty, Object obj2) throws JsonMappingException {
        return reportBadDefinition(C6490g.m11940i(obj), String.format("No 'injectableValues' configured, cannot inject value with id [%s]", obj));
    }

    @Deprecated
    public DateFormat getDateFormat() {
        return _getDateFormat();
    }

    public Object handleUnexpectedToken(JavaType javaType, JsonParser jsonParser) throws IOException {
        return handleUnexpectedToken(javaType, jsonParser.mo10889k(), jsonParser, (String) null, new Object[0]);
    }

    public Object handleWeirdKey(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String str_format = _format(str2, objArr);
        for (C6492i<AbstractC6361f> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.m11976c()) {
            Object objM11274i = problemHandlers.m11977d().m11274i(this, cls, str, str_format);
            if (objM11274i != AbstractC6361f.f10270a) {
                if (objM11274i != null && !cls.isInstance(objM11274i)) {
                    throw weirdStringException(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", C6490g.m11963y(cls), C6490g.m11963y(objM11274i)));
                }
                return objM11274i;
            }
        }
        throw weirdKeyException(cls, str, str_format);
    }

    public Object handleWeirdNumberValue(Class<?> cls, Number number, String str, Object... objArr) throws IOException {
        String str_format = _format(str, objArr);
        for (C6492i<AbstractC6361f> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.m11976c()) {
            Object objM11276k = problemHandlers.m11977d().m11276k(this, cls, number, str_format);
            if (objM11276k != AbstractC6361f.f10270a) {
                if (_isCompatible(cls, objM11276k)) {
                    return objM11276k;
                }
                throw weirdNumberException(number, cls, _format("DeserializationProblemHandler.handleWeirdNumberValue() for type %s returned value of type %s", C6490g.m11963y(cls), C6490g.m11963y(objM11276k)));
            }
        }
        throw weirdNumberException(number, cls, str_format);
    }

    public Object handleWeirdStringValue(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String str_format = _format(str2, objArr);
        for (C6492i<AbstractC6361f> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.m11976c()) {
            Object objM11277l = problemHandlers.m11977d().m11277l(this, cls, str, str_format);
            if (objM11277l != AbstractC6361f.f10270a) {
                if (_isCompatible(cls, objM11277l)) {
                    return objM11277l;
                }
                throw weirdStringException(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", C6490g.m11963y(cls), C6490g.m11963y(objM11277l)));
            }
        }
        throw weirdStringException(str, cls, str_format);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2) {
        return InvalidTypeIdException.from(this._parser, _colonConcat(String.format("Could not resolve type id '%s' as a subtype of %s", str, C6490g.m11904G(javaType)), str2), javaType, str);
    }

    public final boolean isEnabled(StreamReadCapability streamReadCapability) {
        return this._readCapabilities.m11081b(streamReadCapability);
    }

    @Deprecated
    public JsonMappingException mappingException(Class<?> cls) {
        return mappingException(cls, this._parser.mo10889k());
    }

    public Date parseDate(String str) throws IllegalArgumentException {
        try {
            return _getDateFormat().parse(str);
        } catch (ParseException e11) {
            throw new IllegalArgumentException(String.format("Failed to parse Date value '%s': %s", str, C6490g.m11952o(e11)));
        }
    }

    public AbstractC6391f readTree(JsonParser jsonParser) throws IOException {
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        if (jsonTokenMo10889k == null && (jsonTokenMo10889k = jsonParser.mo10905t0()) == null) {
            return getNodeFactory().missingNode();
        }
        if (jsonTokenMo10889k == JsonToken.VALUE_NULL) {
            return getNodeFactory().m103747nullNode();
        }
        return (AbstractC6391f) findRootValueDeserializer(this._config.constructType(AbstractC6391f.class)).deserialize(jsonParser, this);
    }

    public <T> T reportBadCoercion(AbstractC6390e<?> abstractC6390e, Class<?> cls, Object obj, String str, Object... objArr) throws JsonMappingException {
        throw InvalidFormatException.from(getParser(), _format(str, objArr), obj, cls);
    }

    @Deprecated
    public <T> T reportBadMerge(AbstractC6390e<?> abstractC6390e) throws JsonMappingException {
        handleBadMerge(abstractC6390e);
        return null;
    }

    public <T> T reportBadPropertyDefinition(AbstractC6340b abstractC6340b, AbstractC6414k abstractC6414k, String str, Object... objArr) throws JsonMappingException {
        throw InvalidDefinitionException.from(this._parser, String.format("Invalid definition for property %s (of type %s): %s", C6490g.m11920W(abstractC6414k), C6490g.m11921X(abstractC6340b.m11172r()), _format(str, objArr)), abstractC6340b, abstractC6414k);
    }

    public <T> T reportBadTypeDefinition(AbstractC6340b abstractC6340b, String str, Object... objArr) throws JsonMappingException {
        throw InvalidDefinitionException.from(this._parser, String.format("Invalid type definition for type %s: %s", C6490g.m11921X(abstractC6340b.m11172r()), _format(str, objArr)), abstractC6340b, (AbstractC6414k) null);
    }

    public <T> T reportInputMismatch(Class<?> cls, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), cls, _format(str, objArr));
    }

    @Deprecated
    public void reportMappingException(String str, Object... objArr) throws JsonMappingException {
        throw JsonMappingException.from(getParser(), _format(str, objArr));
    }

    @Deprecated
    public void reportMissingContent(String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), (JavaType) null, "No content to map due to end-of-input");
    }

    public <T> T reportTrailingTokens(Class<?> cls, JsonParser jsonParser, JsonToken jsonToken) throws JsonMappingException {
        throw MismatchedInputException.from(jsonParser, cls, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", jsonToken, C6490g.m11921X(cls)));
    }

    public <T> T reportUnresolvedObjectId(ObjectIdReader objectIdReader, Object obj) throws JsonMappingException {
        return (T) reportInputMismatch(objectIdReader.idProperty, String.format("No Object Id found for an instance of %s, to assign to property '%s'", C6490g.m11938h(obj), objectIdReader.propertyName), new Object[0]);
    }

    public void reportWrongTokenException(JavaType javaType, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), javaType, jsonToken, _format(str, objArr));
    }

    @Deprecated
    public JsonMappingException unknownTypeException(JavaType javaType, String str, String str2) {
        return MismatchedInputException.from(this._parser, javaType, _colonConcat(String.format("Could not resolve type id '%s' into a subtype of %s", str, C6490g.m11904G(javaType)), str2));
    }

    public JsonMappingException weirdStringException(String str, Class<?> cls, String str2) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from String %s: %s", C6490g.m11921X(cls), _quotedString(str), str2), str, cls);
    }

    public Object handleUnexpectedToken(JavaType javaType, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        String str_format = _format(str, objArr);
        C6492i<AbstractC6361f> problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            JavaType javaType2 = javaType;
            JsonToken jsonToken2 = jsonToken;
            JsonParser jsonParser2 = jsonParser;
            Object objM11270e = problemHandlers.m11977d().m11270e(this, javaType2, jsonToken2, jsonParser2, str_format);
            if (objM11270e != AbstractC6361f.f10270a) {
                if (_isCompatible(javaType2.getRawClass(), objM11270e)) {
                    return objM11270e;
                }
                reportBadDefinition(javaType2, String.format("DeserializationProblemHandler.handleUnexpectedToken() for type %s returned value of type %s", C6490g.m11904G(javaType2), C6490g.m11938h(objM11270e)));
            }
            problemHandlers = problemHandlers.m11976c();
            javaType = javaType2;
            jsonToken = jsonToken2;
            jsonParser = jsonParser2;
        }
        JavaType javaType3 = javaType;
        JsonToken jsonToken3 = jsonToken;
        JsonParser jsonParser3 = jsonParser;
        if (str_format == null) {
            String strM11904G = C6490g.m11904G(javaType3);
            if (jsonToken3 == null) {
                str_format = String.format("Unexpected end-of-input when trying read value of type %s", strM11904G);
            } else {
                str_format = String.format("Cannot deserialize value of type %s from %s (token `JsonToken.%s`)", strM11904G, _shapeForToken(jsonToken3), jsonToken3);
            }
        }
        if (jsonToken3 != null && jsonToken3.isScalarValue()) {
            jsonParser3.mo10869W();
        }
        reportInputMismatch(javaType3, str_format, new Object[0]);
        return null;
    }

    @Deprecated
    public JsonMappingException mappingException(Class<?> cls, JsonToken jsonToken) {
        return JsonMappingException.from(this._parser, String.format("Cannot deserialize instance of %s out of %s token", C6490g.m11921X(cls), jsonToken));
    }

    public <T> T reportInputMismatch(JavaType javaType, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), javaType, _format(str, objArr));
    }

    public <T> T reportPropertyInputMismatch(JavaType javaType, String str, String str2, Object... objArr) throws JsonMappingException {
        return (T) reportPropertyInputMismatch(javaType.getRawClass(), str, str2, objArr);
    }

    public void reportWrongTokenException(Class<?> cls, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), cls, jsonToken, _format(str, objArr));
    }

    public JsonMappingException wrongTokenException(JsonParser jsonParser, Class<?> cls, JsonToken jsonToken, String str) {
        return MismatchedInputException.from(jsonParser, cls, _colonConcat(String.format("Unexpected token (%s), expected %s", jsonParser.mo10889k(), jsonToken), str));
    }

    public <T> T readTreeAsValue(AbstractC6391f abstractC6391f, JavaType javaType) throws IOException {
        if (abstractC6391f == null) {
            return null;
        }
        C6450d c6450dM11133b = m11133b(abstractC6391f);
        try {
            T t11 = (T) readValue(c6450dM11133b, javaType);
            if (c6450dM11133b != null) {
                c6450dM11133b.close();
            }
            return t11;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                if (c6450dM11133b != null) {
                    try {
                        c6450dM11133b.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    public JsonMappingException instantiationException(Class<?> cls, String str) {
        return ValueInstantiationException.from(this._parser, String.format("Cannot construct instance of %s: %s", C6490g.m11921X(cls), str), constructType(cls));
    }

    public <T> T reportInputMismatch(BeanProperty beanProperty, String str, Object... objArr) throws JsonMappingException {
        AnnotatedMember member;
        MismatchedInputException mismatchedInputExceptionFrom = MismatchedInputException.from(getParser(), beanProperty == null ? null : beanProperty.getType(), _format(str, objArr));
        if (beanProperty != null && (member = beanProperty.getMember()) != null) {
            mismatchedInputExceptionFrom.prependPath(member.getDeclaringClass(), beanProperty.getName());
            throw mismatchedInputExceptionFrom;
        }
        throw mismatchedInputExceptionFrom;
    }

    @Deprecated
    public void reportWrongTokenException(JsonParser jsonParser, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(jsonParser, jsonToken, _format(str, objArr));
    }

    @Deprecated
    public JsonMappingException wrongTokenException(JsonParser jsonParser, JsonToken jsonToken, String str) {
        return wrongTokenException(jsonParser, (JavaType) null, jsonToken, str);
    }

    public DeserializationContext(DeserializationContext deserializationContext, AbstractC6362g abstractC6362g) {
        this._cache = deserializationContext._cache;
        this._factory = abstractC6362g;
        this._config = deserializationContext._config;
        this._featureFlags = deserializationContext._featureFlags;
        this._readCapabilities = deserializationContext._readCapabilities;
        this._view = deserializationContext._view;
        this._parser = deserializationContext._parser;
        this._attributes = deserializationContext._attributes;
    }

    public DeserializationContext(DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser, AbstractC6348d abstractC6348d) {
        this._cache = deserializationContext._cache;
        this._factory = deserializationContext._factory;
        this._readCapabilities = jsonParser == null ? null : jsonParser.mo10867U();
        this._config = deserializationConfig;
        this._featureFlags = deserializationConfig.getDeserializationFeatures();
        this._view = deserializationConfig.getActiveView();
        this._parser = jsonParser;
        this._attributes = deserializationConfig.getAttributes();
    }

    public DeserializationContext(DeserializationContext deserializationContext, DeserializationConfig deserializationConfig) {
        this._cache = deserializationContext._cache;
        this._factory = deserializationContext._factory;
        this._readCapabilities = null;
        this._config = deserializationConfig;
        this._featureFlags = deserializationConfig.getDeserializationFeatures();
        this._view = null;
        this._parser = null;
        this._attributes = null;
    }

    public DeserializationContext(DeserializationContext deserializationContext) {
        this._cache = new DeserializerCache();
        this._factory = deserializationContext._factory;
        this._config = deserializationContext._config;
        this._featureFlags = deserializationContext._featureFlags;
        this._readCapabilities = deserializationContext._readCapabilities;
        this._view = deserializationContext._view;
    }
}
