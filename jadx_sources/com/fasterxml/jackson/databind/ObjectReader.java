package com.fasterxml.jackson.databind;

import cn.jiguang.privates.push.constants.JPushConstants;
import com.fasterxml.jackson.core.AbstractC6304g;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.C6301e;
import com.fasterxml.jackson.core.InterfaceC6298b;
import com.fasterxml.jackson.core.InterfaceC6299c;
import com.fasterxml.jackson.core.InterfaceC6320l;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.filter.C6303a;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.databind.cfg.C6347e;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.AbstractC6361f;
import com.fasterxml.jackson.databind.deser.C6360e;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.node.C6450d;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.C6490g;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.DataInput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import p285g7.C37829a;
import p424l7.AbstractC42115a;
import p424l7.AbstractC42116b;

/* JADX INFO: loaded from: classes45.dex */
public class ObjectReader extends AbstractC6304g implements Serializable {
    private static final long serialVersionUID = 2;
    protected final DeserializationConfig _config;
    protected final DefaultDeserializationContext _context;
    protected final C6360e _dataFormatReaders;
    private final TokenFilter _filter;
    protected final AbstractC6348d _injectableValues;
    protected transient JavaType _jsonNodeType;
    protected final JsonFactory _parserFactory;
    protected final AbstractC6390e<Object> _rootDeserializer;
    protected final ConcurrentHashMap<JavaType, AbstractC6390e<Object>> _rootDeserializers;
    protected final InterfaceC6299c _schema;
    protected final boolean _unwrapRoot;
    protected final Object _valueToUpdate;
    protected final JavaType _valueType;

    public ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig) {
        this(objectMapper, deserializationConfig, null, null, null, null);
    }

    public Object _detectBindAndClose(byte[] bArr, int i11, int i12) throws IOException {
        C6360e.b bVarM11258c = this._dataFormatReaders.m11258c(bArr, i11, i12);
        if (!bVarM11258c.m11265d()) {
            _reportUnkownFormat(this._dataFormatReaders, bVarM11258c);
        }
        return bVarM11258c.m11264c()._bindAndClose(bVarM11258c.m11262a());
    }

    public InputStream _inputStream(URL url) throws IOException {
        return FirebasePerfUrlConnection.openStream(url);
    }

    public ObjectReader _new(ObjectReader objectReader, JsonFactory jsonFactory) {
        return new ObjectReader(objectReader, jsonFactory);
    }

    /* JADX INFO: renamed from: at */
    public ObjectReader m11140at(String str) {
        _assertNotNull("pointerExpr", str);
        return new ObjectReader(this, new C37829a(str));
    }

    public JsonParser createParser(File file) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, file);
        return this._config.initialize(this._parserFactory.createParser(file), null);
    }

    public ObjectReader forType(JavaType javaType) {
        if (javaType != null && javaType.equals(this._valueType)) {
            return this;
        }
        AbstractC6390e<Object> abstractC6390e_prefetchRootDeserializer = _prefetchRootDeserializer(javaType);
        C6360e c6360eM11260e = this._dataFormatReaders;
        if (c6360eM11260e != null) {
            c6360eM11260e = c6360eM11260e.m11260e(javaType);
        }
        return _new(this, this._config, javaType, abstractC6390e_prefetchRootDeserializer, this._valueToUpdate, null, null, c6360eM11260e);
    }

    public AbstractC6348d getInjectableValues() {
        return null;
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._config.isEnabled(deserializationFeature);
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g, com.fasterxml.jackson.core.AbstractC6319k
    public <T extends InterfaceC6320l> T readTree(JsonParser jsonParser) throws IOException {
        _assertNotNull("p", jsonParser);
        return _bindAsTreeOrNull(jsonParser);
    }

    public <T> T readValue(JsonParser jsonParser) throws IOException {
        _assertNotNull("p", jsonParser);
        return (T) _bind(jsonParser, this._valueToUpdate);
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g
    public <T> Iterator<T> readValues(JsonParser jsonParser, Class<T> cls) throws IOException {
        _assertNotNull("p", jsonParser);
        return forType((Class<?>) cls).readValues(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g
    public <T> T treeToValue(InterfaceC6320l interfaceC6320l, Class<T> cls) throws JsonProcessingException {
        _assertNotNull("n", interfaceC6320l);
        try {
            return (T) readValue(treeAsTokens(interfaceC6320l), cls);
        } catch (JsonProcessingException e11) {
            throw e11;
        } catch (IOException e12) {
            throw JsonMappingException.fromUnexpectedIOE(e12);
        }
    }

    public ObjectReader with(AbstractC6348d abstractC6348d) {
        return this;
    }

    public ObjectReader withFeatures(DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.withFeatures(deserializationFeatureArr));
    }

    public ObjectReader withFormatDetection(ObjectReader... objectReaderArr) {
        return withFormatDetection(new C6360e(objectReaderArr));
    }

    public ObjectReader withRootName(String str) {
        return _with(this._config.withRootName(str));
    }

    @Deprecated
    public ObjectReader withType(JavaType javaType) {
        return forType(javaType);
    }

    public ObjectReader without(DeserializationFeature deserializationFeature) {
        return _with(this._config.without(deserializationFeature));
    }

    public ObjectReader withoutFeatures(DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.withoutFeatures(deserializationFeatureArr));
    }

    public ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig, JavaType javaType, Object obj, InterfaceC6299c interfaceC6299c, AbstractC6348d abstractC6348d) {
        this._config = deserializationConfig;
        this._context = objectMapper._deserializationContext;
        this._rootDeserializers = objectMapper._rootDeserializers;
        this._parserFactory = objectMapper._jsonFactory;
        this._valueType = javaType;
        this._valueToUpdate = obj;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._rootDeserializer = _prefetchRootDeserializer(javaType);
        this._dataFormatReaders = null;
        this._filter = null;
    }

    public final void _assertNotNull(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }

    public final AbstractC6391f _bindAsTree(JsonParser jsonParser) throws IOException {
        Object obj = this._valueToUpdate;
        if (obj != null) {
            return (AbstractC6391f) _bind(jsonParser, obj);
        }
        this._config.initialize(jsonParser);
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        if (jsonTokenMo10889k == null && (jsonTokenMo10889k = jsonParser.mo10905t0()) == null) {
            return this._config.getNodeFactory().missingNode();
        }
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        AbstractC6391f abstractC6391fNullNode = jsonTokenMo10889k == JsonToken.VALUE_NULL ? this._config.getNodeFactory().m103747nullNode() : (AbstractC6391f) defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, _jsonNodeType(), _findTreeDeserializer(defaultDeserializationContextCreateDeserializationContext), null);
        jsonParser.mo10885i();
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, _jsonNodeType());
        }
        return abstractC6391fNullNode;
    }

    public final AbstractC6391f _bindAsTreeOrNull(JsonParser jsonParser) throws IOException {
        Object obj = this._valueToUpdate;
        if (obj != null) {
            return (AbstractC6391f) _bind(jsonParser, obj);
        }
        this._config.initialize(jsonParser);
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        if (jsonTokenMo10889k == null && (jsonTokenMo10889k = jsonParser.mo10905t0()) == null) {
            return null;
        }
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        AbstractC6391f abstractC6391fNullNode = jsonTokenMo10889k == JsonToken.VALUE_NULL ? this._config.getNodeFactory().m103747nullNode() : (AbstractC6391f) defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, _jsonNodeType(), _findTreeDeserializer(defaultDeserializationContextCreateDeserializationContext), null);
        jsonParser.mo10885i();
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, _jsonNodeType());
        }
        return abstractC6391fNullNode;
    }

    public JsonParser _considerFilter(JsonParser jsonParser, boolean z11) {
        return (this._filter == null || C6303a.class.isInstance(jsonParser)) ? jsonParser : new C6303a(jsonParser, this._filter, TokenFilter.Inclusion.ONLY_INCLUDE_ALL, z11);
    }

    public AbstractC6391f _detectBindAndCloseAsTree(InputStream inputStream) throws IOException {
        C6360e.b bVarM11257b = this._dataFormatReaders.m11257b(inputStream);
        if (!bVarM11257b.m11265d()) {
            _reportUnkownFormat(this._dataFormatReaders, bVarM11257b);
        }
        JsonParser jsonParserM11262a = bVarM11257b.m11262a();
        jsonParserM11262a.mo10893m(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        return bVarM11257b.m11264c()._bindAndCloseAsTree(jsonParserM11262a);
    }

    public AbstractC6390e<Object> _findRootDeserializer(DeserializationContext deserializationContext) throws DatabindException {
        AbstractC6390e<Object> abstractC6390e = this._rootDeserializer;
        if (abstractC6390e != null) {
            return abstractC6390e;
        }
        JavaType javaType = this._valueType;
        if (javaType == null) {
            deserializationContext.reportBadDefinition((JavaType) null, "No value type configured for ObjectReader");
        }
        AbstractC6390e<Object> abstractC6390e2 = this._rootDeserializers.get(javaType);
        if (abstractC6390e2 != null) {
            return abstractC6390e2;
        }
        AbstractC6390e<Object> abstractC6390eFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (abstractC6390eFindRootValueDeserializer == null) {
            deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type " + javaType);
        }
        this._rootDeserializers.put(javaType, abstractC6390eFindRootValueDeserializer);
        return abstractC6390eFindRootValueDeserializer;
    }

    public void _initForMultiRead(DeserializationContext deserializationContext, JsonParser jsonParser) throws IOException {
        this._config.initialize(jsonParser, null);
    }

    public JsonToken _initForReading(DeserializationContext deserializationContext, JsonParser jsonParser) throws IOException {
        this._config.initialize(jsonParser, null);
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        if (jsonTokenMo10889k != null) {
            return jsonTokenMo10889k;
        }
        JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
        if (jsonTokenMo10905t0 == null) {
            deserializationContext.reportInputMismatch(this._valueType, "No content to map due to end-of-input", new Object[0]);
        }
        return jsonTokenMo10905t0;
    }

    public InputStream _inputStream(File file) throws IOException {
        return new FileInputStream(file);
    }

    public final JavaType _jsonNodeType() {
        JavaType javaType = this._jsonNodeType;
        if (javaType != null) {
            return javaType;
        }
        JavaType javaTypeConstructType = getTypeFactory().constructType(AbstractC6391f.class);
        this._jsonNodeType = javaTypeConstructType;
        return javaTypeConstructType;
    }

    public ObjectReader _new(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        return new ObjectReader(objectReader, deserializationConfig);
    }

    public <T> C6424j<T> _newIterator(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6390e<?> abstractC6390e, boolean z11) {
        return new C6424j<>(this._valueType, jsonParser, deserializationContext, abstractC6390e, z11, this._valueToUpdate);
    }

    public AbstractC6390e<Object> _prefetchRootDeserializer(JavaType javaType) {
        if (javaType == null || !this._config.isEnabled(DeserializationFeature.EAGER_DESERIALIZER_FETCH)) {
            return null;
        }
        AbstractC6390e<Object> abstractC6390eFindRootValueDeserializer = this._rootDeserializers.get(javaType);
        if (abstractC6390eFindRootValueDeserializer == null) {
            try {
                abstractC6390eFindRootValueDeserializer = createDummyDeserializationContext().findRootValueDeserializer(javaType);
                if (abstractC6390eFindRootValueDeserializer != null) {
                    this._rootDeserializers.put(javaType, abstractC6390eFindRootValueDeserializer);
                }
            } catch (JacksonException unused) {
            }
        }
        return abstractC6390eFindRootValueDeserializer;
    }

    public void _reportUndetectableSource(Object obj) throws StreamReadException {
        throw new JsonParseException((JsonParser) null, "Cannot use source of type " + obj.getClass().getName() + " with format auto-detection: must be byte- not char-based");
    }

    public void _reportUnkownFormat(C6360e c6360e, C6360e.b bVar) throws IOException {
        throw new JsonParseException((JsonParser) null, "Cannot detect format from input, does not look like any of detectable formats " + c6360e.toString());
    }

    public void _verifySchemaType(InterfaceC6299c interfaceC6299c) {
        if (interfaceC6299c == null || this._parserFactory.canUseSchema(interfaceC6299c)) {
            return;
        }
        throw new IllegalArgumentException("Cannot use FormatSchema of type " + interfaceC6299c.getClass().getName() + " for format " + this._parserFactory.getFormatName());
    }

    public ObjectReader _with(DeserializationConfig deserializationConfig) {
        if (deserializationConfig == this._config) {
            return this;
        }
        ObjectReader objectReader_new = _new(this, deserializationConfig);
        C6360e c6360e = this._dataFormatReaders;
        return c6360e != null ? objectReader_new.withFormatDetection(c6360e.m11259d(deserializationConfig)) : objectReader_new;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g, com.fasterxml.jackson.core.AbstractC6319k
    public AbstractC6391f createArrayNode() {
        return this._config.getNodeFactory().arrayNode();
    }

    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser) {
        return this._context.createInstance(this._config, jsonParser, null);
    }

    public DefaultDeserializationContext createDummyDeserializationContext() {
        return this._context.createDummyInstance(this._config);
    }

    public JsonParser createNonBlockingByteArrayParser() throws IOException {
        return this._config.initialize(this._parserFactory.createNonBlockingByteArrayParser(), null);
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g, com.fasterxml.jackson.core.AbstractC6319k
    public AbstractC6391f createObjectNode() {
        return this._config.getNodeFactory().objectNode();
    }

    public ContextAttributes getAttributes() {
        return this._config.getAttributes();
    }

    public DeserializationConfig getConfig() {
        return this._config;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g
    public JsonFactory getFactory() {
        return this._parserFactory;
    }

    public TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public JavaType getValueType() {
        return this._valueType;
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    @Override // com.fasterxml.jackson.core.AbstractC6319k
    public AbstractC6391f missingNode() {
        return this._config.getNodeFactory().missingNode();
    }

    @Override // com.fasterxml.jackson.core.AbstractC6319k
    public AbstractC6391f nullNode() {
        return this._config.getNodeFactory().m103747nullNode();
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g, com.fasterxml.jackson.core.AbstractC6319k
    public JsonParser treeAsTokens(InterfaceC6320l interfaceC6320l) {
        _assertNotNull("n", interfaceC6320l);
        return new C6450d((AbstractC6391f) interfaceC6320l, withValueToUpdate(null));
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g
    public Version version() {
        return C6347e.f10215a;
    }

    public ObjectReader with(DeserializationFeature deserializationFeature) {
        return _with(this._config.with(deserializationFeature));
    }

    public ObjectReader withAttribute(Object obj, Object obj2) {
        return _with(this._config.withAttribute(obj, obj2));
    }

    public ObjectReader withAttributes(Map<?, ?> map) {
        return _with(this._config.withAttributes(map));
    }

    public ObjectReader withFeatures(JsonParser.Feature... featureArr) {
        return _with(this._config.withFeatures(featureArr));
    }

    public ObjectReader withFormatDetection(C6360e c6360e) {
        return _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, null, null, c6360e);
    }

    public ObjectReader withHandler(AbstractC6361f abstractC6361f) {
        return _with(this._config.withHandler(abstractC6361f));
    }

    public ObjectReader withRootName(PropertyName propertyName) {
        return _with(this._config.withRootName(propertyName));
    }

    @Deprecated
    public ObjectReader withType(Class<?> cls) {
        return forType(this._config.constructType(cls));
    }

    public ObjectReader withValueToUpdate(Object obj) {
        if (obj == this._valueToUpdate) {
            return this;
        }
        if (obj == null) {
            return _new(this, this._config, this._valueType, this._rootDeserializer, null, null, null, this._dataFormatReaders);
        }
        JavaType javaTypeConstructType = this._valueType;
        if (javaTypeConstructType == null) {
            javaTypeConstructType = this._config.constructType(obj.getClass());
        }
        return _new(this, this._config, javaTypeConstructType, this._rootDeserializer, obj, null, null, this._dataFormatReaders);
    }

    public ObjectReader withView(Class<?> cls) {
        return _with(this._config.withView(cls));
    }

    public ObjectReader without(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.without(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader withoutAttribute(Object obj) {
        return _with(this._config.withoutAttribute(obj));
    }

    public ObjectReader withoutFeatures(JsonParser.Feature... featureArr) {
        return _with(this._config.withoutFeatures(featureArr));
    }

    public ObjectReader withoutRootName() {
        return _with(this._config.withRootName(PropertyName.NO_NAME));
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g, com.fasterxml.jackson.core.AbstractC6319k
    public void writeTree(JsonGenerator jsonGenerator, InterfaceC6320l interfaceC6320l) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g
    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    public Object _bind(JsonParser jsonParser, Object obj) throws IOException {
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        JsonToken jsonToken_initForReading = _initForReading(defaultDeserializationContextCreateDeserializationContext, jsonParser);
        if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
            if (obj == null) {
                obj = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext).getNullValue(defaultDeserializationContextCreateDeserializationContext);
            }
        } else if (jsonToken_initForReading != JsonToken.END_ARRAY && jsonToken_initForReading != JsonToken.END_OBJECT) {
            obj = defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, this._valueType, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), this._valueToUpdate);
        }
        jsonParser.mo10885i();
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, this._valueType);
        }
        return obj;
    }

    public Object _bindAndClose(JsonParser jsonParser) throws IOException {
        Object rootValue;
        try {
            DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
            JsonToken jsonToken_initForReading = _initForReading(defaultDeserializationContextCreateDeserializationContext, jsonParser);
            if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
                rootValue = this._valueToUpdate;
                if (rootValue == null) {
                    rootValue = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext).getNullValue(defaultDeserializationContextCreateDeserializationContext);
                }
            } else if (jsonToken_initForReading != JsonToken.END_ARRAY && jsonToken_initForReading != JsonToken.END_OBJECT) {
                rootValue = defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, this._valueType, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), this._valueToUpdate);
            } else {
                rootValue = this._valueToUpdate;
            }
            if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, this._valueType);
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

    public final AbstractC6391f _bindAndCloseAsTree(JsonParser jsonParser) throws IOException {
        try {
            AbstractC6391f abstractC6391f_bindAsTree = _bindAsTree(jsonParser);
            if (jsonParser != null) {
                jsonParser.close();
            }
            return abstractC6391f_bindAsTree;
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

    public <T> C6424j<T> _bindAndReadValues(JsonParser jsonParser) throws IOException {
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        _initForMultiRead(defaultDeserializationContextCreateDeserializationContext, jsonParser);
        jsonParser.mo10905t0();
        return _newIterator(jsonParser, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), true);
    }

    public <T> C6424j<T> _detectBindAndReadValues(C6360e.b bVar, boolean z11) throws IOException {
        if (!bVar.m11265d()) {
            _reportUnkownFormat(this._dataFormatReaders, bVar);
        }
        JsonParser jsonParserM11262a = bVar.m11262a();
        if (z11) {
            jsonParserM11262a.mo10893m(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        }
        return bVar.m11264c()._bindAndReadValues(jsonParserM11262a);
    }

    public AbstractC6390e<Object> _findTreeDeserializer(DeserializationContext deserializationContext) throws DatabindException {
        JavaType javaType_jsonNodeType = _jsonNodeType();
        AbstractC6390e<Object> abstractC6390eFindRootValueDeserializer = this._rootDeserializers.get(javaType_jsonNodeType);
        if (abstractC6390eFindRootValueDeserializer == null) {
            abstractC6390eFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType_jsonNodeType);
            if (abstractC6390eFindRootValueDeserializer == null) {
                deserializationContext.reportBadDefinition(javaType_jsonNodeType, "Cannot find a deserializer for type " + javaType_jsonNodeType);
            }
            this._rootDeserializers.put(javaType_jsonNodeType, abstractC6390eFindRootValueDeserializer);
        }
        return abstractC6390eFindRootValueDeserializer;
    }

    public ObjectReader _new(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, AbstractC6390e<Object> abstractC6390e, Object obj, InterfaceC6299c interfaceC6299c, AbstractC6348d abstractC6348d, C6360e c6360e) {
        return new ObjectReader(objectReader, deserializationConfig, javaType, abstractC6390e, obj, interfaceC6299c, abstractC6348d, c6360e);
    }

    public final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        Object obj;
        JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
        if (jsonTokenMo10905t0 != null) {
            Class<?> clsM11931d0 = C6490g.m11931d0(javaType);
            if (clsM11931d0 == null && (obj = this._valueToUpdate) != null) {
                clsM11931d0 = obj.getClass();
            }
            deserializationContext.reportTrailingTokens(clsM11931d0, jsonParser, jsonTokenMo10905t0);
        }
    }

    /* JADX INFO: renamed from: at */
    public ObjectReader m11139at(C6301e c6301e) {
        _assertNotNull("pointer", c6301e);
        return new ObjectReader(this, new C37829a(c6301e));
    }

    public JsonParser createParser(URL url) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, url);
        return this._config.initialize(this._parserFactory.createParser(url), null);
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this._config.isEnabled(feature, this._parserFactory);
    }

    public AbstractC6391f readTree(InputStream inputStream) throws IOException {
        if (this._dataFormatReaders != null) {
            return _detectBindAndCloseAsTree(inputStream);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(inputStream), false));
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g
    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException {
        _assertNotNull("p", jsonParser);
        return (T) forType((Class<?>) cls).readValue(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g
    public <T> Iterator<T> readValues(JsonParser jsonParser, AbstractC42116b<T> abstractC42116b) throws IOException {
        _assertNotNull("p", jsonParser);
        return forType((AbstractC42116b<?>) abstractC42116b).readValues(jsonParser);
    }

    public ObjectReader with(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.with(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader withFeatures(InterfaceC6298b... interfaceC6298bArr) {
        return _with(this._config.withFeatures(interfaceC6298bArr));
    }

    @Deprecated
    public ObjectReader withType(Type type) {
        return forType(this._config.getTypeFactory().constructType(type));
    }

    public ObjectReader without(JsonParser.Feature feature) {
        return _with(this._config.without(feature));
    }

    public ObjectReader withoutFeatures(InterfaceC6298b... interfaceC6298bArr) {
        return _with(this._config.withoutFeatures(interfaceC6298bArr));
    }

    public boolean isEnabled(StreamReadFeature streamReadFeature) {
        return this._config.isEnabled(streamReadFeature.mappedFeature(), this._parserFactory);
    }

    public ObjectReader with(JsonParser.Feature feature) {
        return _with(this._config.with(feature));
    }

    @Deprecated
    public ObjectReader withType(AbstractC42116b<?> abstractC42116b) {
        this._config.getTypeFactory();
        throw null;
    }

    public ObjectReader without(StreamReadFeature streamReadFeature) {
        return _with(this._config.without(streamReadFeature.mappedFeature()));
    }

    public JsonParser createParser(InputStream inputStream) throws IOException {
        _assertNotNull("in", inputStream);
        return this._config.initialize(this._parserFactory.createParser(inputStream), null);
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g
    public <T> T readValue(JsonParser jsonParser, AbstractC42116b<T> abstractC42116b) throws IOException {
        _assertNotNull("p", jsonParser);
        return (T) forType((AbstractC42116b<?>) abstractC42116b).readValue(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g
    public <T> Iterator<T> readValues(JsonParser jsonParser, AbstractC42115a abstractC42115a) throws IOException {
        _assertNotNull("p", jsonParser);
        return readValues(jsonParser, (JavaType) abstractC42115a);
    }

    public <T> T treeToValue(InterfaceC6320l interfaceC6320l, JavaType javaType) throws JsonProcessingException {
        _assertNotNull("n", interfaceC6320l);
        try {
            return (T) readValue(treeAsTokens(interfaceC6320l), javaType);
        } catch (JsonProcessingException e11) {
            throw e11;
        } catch (IOException e12) {
            throw JsonMappingException.fromUnexpectedIOE(e12);
        }
    }

    public ObjectReader with(StreamReadFeature streamReadFeature) {
        return _with(this._config.with(streamReadFeature.mappedFeature()));
    }

    public ObjectReader without(InterfaceC6298b interfaceC6298b) {
        return _with(this._config.without(interfaceC6298b));
    }

    public Object _detectBindAndClose(C6360e.b bVar, boolean z11) throws IOException {
        if (!bVar.m11265d()) {
            _reportUnkownFormat(this._dataFormatReaders, bVar);
        }
        JsonParser jsonParserM11262a = bVar.m11262a();
        if (z11) {
            jsonParserM11262a.mo10893m(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        }
        return bVar.m11264c()._bindAndClose(jsonParserM11262a);
    }

    public ObjectReader forType(Class<?> cls) {
        return forType(this._config.constructType(cls));
    }

    public AbstractC6391f readTree(Reader reader) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(reader), false));
    }

    public ObjectReader with(InterfaceC6298b interfaceC6298b) {
        return _with(this._config.with(interfaceC6298b));
    }

    public JsonParser createParser(Reader reader) throws IOException {
        _assertNotNull("r", reader);
        return this._config.initialize(this._parserFactory.createParser(reader), null);
    }

    public ObjectReader forType(AbstractC42116b<?> abstractC42116b) {
        this._config.getTypeFactory();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6304g
    public <T> T readValue(JsonParser jsonParser, AbstractC42115a abstractC42115a) throws IOException {
        _assertNotNull("p", jsonParser);
        return (T) forType((JavaType) abstractC42115a).readValue(jsonParser);
    }

    public <T> Iterator<T> readValues(JsonParser jsonParser, JavaType javaType) throws IOException {
        _assertNotNull("p", jsonParser);
        return forType(javaType).readValues(jsonParser);
    }

    public ObjectReader with(DeserializationConfig deserializationConfig) {
        return _with(deserializationConfig);
    }

    public ObjectReader with(JsonNodeFactory jsonNodeFactory) {
        return _with(this._config.with(jsonNodeFactory));
    }

    public JsonParser createParser(byte[] bArr) throws IOException {
        _assertNotNull("content", bArr);
        return this._config.initialize(this._parserFactory.createParser(bArr), null);
    }

    public AbstractC6391f readTree(String str) throws JsonProcessingException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        try {
            return _bindAndCloseAsTree(_considerFilter(createParser(str), false));
        } catch (JsonProcessingException e11) {
            throw e11;
        } catch (IOException e12) {
            throw JsonMappingException.fromUnexpectedIOE(e12);
        }
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException {
        _assertNotNull("p", jsonParser);
        return (T) forType(javaType).readValue(jsonParser);
    }

    public <T> C6424j<T> readValues(JsonParser jsonParser) throws IOException {
        _assertNotNull("p", jsonParser);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        return _newIterator(jsonParser, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), false);
    }

    public ObjectReader with(JsonFactory jsonFactory) {
        if (jsonFactory == this._parserFactory) {
            return this;
        }
        ObjectReader objectReader_new = _new(this, jsonFactory);
        if (jsonFactory.getCodec() == null) {
            jsonFactory.setCodec(objectReader_new);
        }
        return objectReader_new;
    }

    public JsonParser createParser(byte[] bArr, int i11, int i12) throws IOException {
        _assertNotNull("content", bArr);
        return this._config.initialize(this._parserFactory.createParser(bArr, i11, i12), null);
    }

    public <T> T readValue(InputStream inputStream) throws IOException {
        C6360e c6360e = this._dataFormatReaders;
        if (c6360e != null) {
            return (T) _detectBindAndClose(c6360e.m11257b(inputStream), false);
        }
        return (T) _bindAndClose(_considerFilter(createParser(inputStream), false));
    }

    public <T> C6424j<T> readValues(InputStream inputStream) throws IOException {
        C6360e c6360e = this._dataFormatReaders;
        if (c6360e != null) {
            return _detectBindAndReadValues(c6360e.m11257b(inputStream), false);
        }
        return _bindAndReadValues(_considerFilter(createParser(inputStream), true));
    }

    public ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, AbstractC6390e<Object> abstractC6390e, Object obj, InterfaceC6299c interfaceC6299c, AbstractC6348d abstractC6348d, C6360e c6360e) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = javaType;
        this._rootDeserializer = abstractC6390e;
        this._valueToUpdate = obj;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._dataFormatReaders = c6360e;
        this._filter = objectReader._filter;
    }

    public JsonParser createParser(String str) throws IOException {
        _assertNotNull("content", str);
        return this._config.initialize(this._parserFactory.createParser(str), null);
    }

    public ObjectReader with(InterfaceC6299c interfaceC6299c) {
        if (interfaceC6299c == null) {
            return this;
        }
        _verifySchemaType(interfaceC6299c);
        return _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, interfaceC6299c, null, this._dataFormatReaders);
    }

    public AbstractC6391f readTree(byte[] bArr) throws IOException {
        _assertNotNull(JPushConstants.Analysis.KEY_JSON, bArr);
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(bArr);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(bArr), false));
    }

    public <T> T readValue(InputStream inputStream, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(inputStream);
    }

    public JsonParser createParser(char[] cArr) throws IOException {
        _assertNotNull("content", cArr);
        return this._config.initialize(this._parserFactory.createParser(cArr), null);
    }

    public <T> T readValue(Reader reader) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        return (T) _bindAndClose(_considerFilter(createParser(reader), false));
    }

    public <T> C6424j<T> readValues(Reader reader) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        JsonParser jsonParser_considerFilter = _considerFilter(createParser(reader), true);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser_considerFilter);
        _initForMultiRead(defaultDeserializationContextCreateDeserializationContext, jsonParser_considerFilter);
        jsonParser_considerFilter.mo10905t0();
        return _newIterator(jsonParser_considerFilter, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), true);
    }

    public ObjectReader with(Locale locale) {
        return _with(this._config.with(locale));
    }

    public ObjectReader with(TimeZone timeZone) {
        return _with(this._config.with(timeZone));
    }

    public JsonParser createParser(char[] cArr, int i11, int i12) throws IOException {
        _assertNotNull("content", cArr);
        return this._config.initialize(this._parserFactory.createParser(cArr, i11, i12), null);
    }

    public ObjectReader with(Base64Variant base64Variant) {
        return _with(this._config.with(base64Variant));
    }

    public AbstractC6391f readTree(byte[] bArr, int i11, int i12) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(bArr);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(bArr, i11, i12), false));
    }

    public <T> T readValue(Reader reader, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(reader);
    }

    public ObjectReader with(ContextAttributes contextAttributes) {
        return _with(this._config.with(contextAttributes));
    }

    public JsonParser createParser(DataInput dataInput) throws IOException {
        _assertNotNull("content", dataInput);
        return this._config.initialize(this._parserFactory.createParser(dataInput), null);
    }

    public <T> T readValue(String str) throws JsonProcessingException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        try {
            return (T) _bindAndClose(_considerFilter(createParser(str), false));
        } catch (JsonProcessingException e11) {
            throw e11;
        } catch (IOException e12) {
            throw JsonMappingException.fromUnexpectedIOE(e12);
        }
    }

    public AbstractC6391f readTree(DataInput dataInput) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(dataInput), false));
    }

    public <T> C6424j<T> readValues(String str) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        JsonParser jsonParser_considerFilter = _considerFilter(createParser(str), true);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser_considerFilter);
        _initForMultiRead(defaultDeserializationContextCreateDeserializationContext, jsonParser_considerFilter);
        jsonParser_considerFilter.mo10905t0();
        return _newIterator(jsonParser_considerFilter, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), true);
    }

    public ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = objectReader._filter;
    }

    public <T> T readValue(String str, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(str);
    }

    public <T> T readValue(byte[] bArr) throws IOException {
        if (this._dataFormatReaders != null) {
            return (T) _detectBindAndClose(bArr, 0, bArr.length);
        }
        return (T) _bindAndClose(_considerFilter(createParser(bArr), false));
    }

    public <T> T readValue(byte[] bArr, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(bArr);
    }

    public <T> T readValue(byte[] bArr, int i11, int i12) throws IOException {
        if (this._dataFormatReaders != null) {
            return (T) _detectBindAndClose(bArr, i11, i12);
        }
        return (T) _bindAndClose(_considerFilter(createParser(bArr, i11, i12), false));
    }

    public <T> C6424j<T> readValues(byte[] bArr, int i11, int i12) throws IOException {
        C6360e c6360e = this._dataFormatReaders;
        if (c6360e != null) {
            return _detectBindAndReadValues(c6360e.m11258c(bArr, i11, i12), false);
        }
        return _bindAndReadValues(_considerFilter(createParser(bArr, i11, i12), true));
    }

    public <T> T readValue(byte[] bArr, int i11, int i12, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(bArr, i11, i12);
    }

    public final <T> C6424j<T> readValues(byte[] bArr) throws IOException {
        _assertNotNull(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, bArr);
        return readValues(bArr, 0, bArr.length);
    }

    public <T> T readValue(File file) throws IOException {
        C6360e c6360e = this._dataFormatReaders;
        if (c6360e != null) {
            return (T) _detectBindAndClose(c6360e.m11257b(_inputStream(file)), true);
        }
        return (T) _bindAndClose(_considerFilter(createParser(file), false));
    }

    public <T> C6424j<T> readValues(File file) throws IOException {
        C6360e c6360e = this._dataFormatReaders;
        if (c6360e != null) {
            return _detectBindAndReadValues(c6360e.m11257b(_inputStream(file)), false);
        }
        return _bindAndReadValues(_considerFilter(createParser(file), true));
    }

    public ObjectReader(ObjectReader objectReader, JsonFactory jsonFactory) {
        this._config = objectReader._config.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, jsonFactory.requiresPropertyOrdering());
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = jsonFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._unwrapRoot = objectReader._unwrapRoot;
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = objectReader._filter;
    }

    public <T> T readValue(File file, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(file);
    }

    public <T> T readValue(URL url) throws IOException {
        C6360e c6360e = this._dataFormatReaders;
        if (c6360e != null) {
            return (T) _detectBindAndClose(c6360e.m11257b(_inputStream(url)), true);
        }
        return (T) _bindAndClose(_considerFilter(createParser(url), false));
    }

    public <T> C6424j<T> readValues(URL url) throws IOException {
        C6360e c6360e = this._dataFormatReaders;
        if (c6360e != null) {
            return _detectBindAndReadValues(c6360e.m11257b(_inputStream(url)), true);
        }
        return _bindAndReadValues(_considerFilter(createParser(url), true));
    }

    public <T> T readValue(URL url, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(url);
    }

    public <T> T readValue(AbstractC6391f abstractC6391f) throws IOException {
        _assertNotNull("content", abstractC6391f);
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(abstractC6391f);
        }
        return (T) _bindAndClose(_considerFilter(treeAsTokens(abstractC6391f), false));
    }

    public <T> C6424j<T> readValues(DataInput dataInput) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return _bindAndReadValues(_considerFilter(createParser(dataInput), true));
    }

    public <T> T readValue(AbstractC6391f abstractC6391f, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(abstractC6391f);
    }

    public <T> T readValue(DataInput dataInput) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return (T) _bindAndClose(_considerFilter(createParser(dataInput), false));
    }

    public ObjectReader(ObjectReader objectReader, TokenFilter tokenFilter) {
        this._config = objectReader._config;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._unwrapRoot = objectReader._unwrapRoot;
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = tokenFilter;
    }

    public <T> T readValue(DataInput dataInput, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(dataInput);
    }
}
