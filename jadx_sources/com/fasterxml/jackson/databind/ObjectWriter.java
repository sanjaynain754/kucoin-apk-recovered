package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.InterfaceC6298b;
import com.fasterxml.jackson.core.InterfaceC6299c;
import com.fasterxml.jackson.core.InterfaceC6305h;
import com.fasterxml.jackson.core.InterfaceC6306i;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.StreamWriteFeature;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.p062io.C6315i;
import com.fasterxml.jackson.core.p062io.CharacterEscapes;
import com.fasterxml.jackson.core.p062io.SerializedString;
import com.fasterxml.jackson.core.util.C6324c;
import com.fasterxml.jackson.core.util.InterfaceC6325d;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.databind.cfg.C6347e;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.AbstractC6456e;
import com.fasterxml.jackson.databind.ser.AbstractC6468j;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.C6466d;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import p424l7.AbstractC42116b;
import p528p7.InterfaceC43399e;

/* JADX INFO: loaded from: classes45.dex */
public class ObjectWriter implements Serializable {
    protected static final InterfaceC6305h NULL_PRETTY_PRINTER = new MinimalPrettyPrinter();
    private static final long serialVersionUID = 1;
    protected final SerializationConfig _config;
    protected final JsonFactory _generatorFactory;
    protected final GeneratorSettings _generatorSettings;
    protected final Prefetch _prefetch;
    protected final AbstractC6468j _serializerFactory;
    protected final DefaultSerializerProvider _serializerProvider;

    public static final class GeneratorSettings implements Serializable {
        public static final GeneratorSettings empty = new GeneratorSettings(null, null, null, null);
        private static final long serialVersionUID = 1;
        public final CharacterEscapes characterEscapes;
        public final InterfaceC6305h prettyPrinter;
        public final InterfaceC6306i rootValueSeparator;
        public final InterfaceC6299c schema;

        public GeneratorSettings with(InterfaceC6305h interfaceC6305h) {
            if (interfaceC6305h == null) {
                interfaceC6305h = ObjectWriter.NULL_PRETTY_PRINTER;
            }
            return interfaceC6305h == this.prettyPrinter ? this : new GeneratorSettings(interfaceC6305h, null, this.characterEscapes, this.rootValueSeparator);
        }

        public GeneratorSettings withRootValueSeparator(String str) {
            if (str == null) {
                if (this.rootValueSeparator != null) {
                    return new GeneratorSettings(this.prettyPrinter, null, this.characterEscapes, null);
                }
            } else if (!str.equals(m11142a())) {
                return new GeneratorSettings(this.prettyPrinter, null, this.characterEscapes, new SerializedString(str));
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final String m11142a() {
            InterfaceC6306i interfaceC6306i = this.rootValueSeparator;
            if (interfaceC6306i == null) {
                return null;
            }
            return interfaceC6306i.getValue();
        }

        public void initialize(JsonGenerator jsonGenerator) {
            InterfaceC6305h interfaceC6305h = this.prettyPrinter;
            if (interfaceC6305h != null) {
                if (interfaceC6305h == ObjectWriter.NULL_PRETTY_PRINTER) {
                    jsonGenerator.m10789E(null);
                } else {
                    if (interfaceC6305h instanceof InterfaceC6325d) {
                        interfaceC6305h = (InterfaceC6305h) ((InterfaceC6325d) interfaceC6305h).createInstance();
                    }
                    jsonGenerator.m10789E(interfaceC6305h);
                }
            }
            CharacterEscapes characterEscapes = this.characterEscapes;
            if (characterEscapes != null) {
                jsonGenerator.mo10846w(characterEscapes);
            }
            InterfaceC6306i interfaceC6306i = this.rootValueSeparator;
            if (interfaceC6306i != null) {
                jsonGenerator.mo10794J(interfaceC6306i);
            }
        }

        public GeneratorSettings(InterfaceC6305h interfaceC6305h, InterfaceC6299c interfaceC6299c, CharacterEscapes characterEscapes, InterfaceC6306i interfaceC6306i) {
            this.prettyPrinter = interfaceC6305h;
            this.characterEscapes = characterEscapes;
            this.rootValueSeparator = interfaceC6306i;
        }

        public GeneratorSettings with(InterfaceC6299c interfaceC6299c) {
            return interfaceC6299c == null ? this : new GeneratorSettings(this.prettyPrinter, interfaceC6299c, this.characterEscapes, this.rootValueSeparator);
        }

        public GeneratorSettings with(CharacterEscapes characterEscapes) {
            return this.characterEscapes == characterEscapes ? this : new GeneratorSettings(this.prettyPrinter, null, characterEscapes, this.rootValueSeparator);
        }

        public GeneratorSettings withRootValueSeparator(InterfaceC6306i interfaceC6306i) {
            if (interfaceC6306i == null) {
                if (this.rootValueSeparator != null) {
                    return new GeneratorSettings(this.prettyPrinter, null, this.characterEscapes, null);
                }
            } else if (!interfaceC6306i.equals(this.rootValueSeparator)) {
                return new GeneratorSettings(this.prettyPrinter, null, this.characterEscapes, interfaceC6306i);
            }
            return this;
        }
    }

    public static final class Prefetch implements Serializable {
        public static final Prefetch empty = new Prefetch(null, null, null);
        private static final long serialVersionUID = 1;
        private final JavaType rootType;
        private final AbstractC6431e typeSerializer;
        private final AbstractC6393h<Object> valueSerializer;

        public Prefetch forRootType(ObjectWriter objectWriter, JavaType javaType) {
            if (javaType == null) {
                if (this.rootType != null && this.valueSerializer != null) {
                    return new Prefetch(null, null, null);
                }
            } else if (!javaType.equals(this.rootType)) {
                if (javaType.isJavaLangObject()) {
                    try {
                        return new Prefetch(null, null, objectWriter._serializerProvider().findTypeSerializer(javaType));
                    } catch (JsonMappingException e11) {
                        throw new RuntimeJsonMappingException(e11);
                    }
                }
                if (objectWriter.isEnabled(SerializationFeature.EAGER_SERIALIZER_FETCH)) {
                    try {
                        AbstractC6393h<Object> abstractC6393hFindTypedValueSerializer = objectWriter._serializerProvider().findTypedValueSerializer(javaType, true, (BeanProperty) null);
                        return abstractC6393hFindTypedValueSerializer instanceof C6466d ? new Prefetch(javaType, null, ((C6466d) abstractC6393hFindTypedValueSerializer).m11819a()) : new Prefetch(javaType, abstractC6393hFindTypedValueSerializer, null);
                    } catch (DatabindException unused) {
                    }
                }
                return new Prefetch(javaType, null, this.typeSerializer);
            }
            return this;
        }

        public final AbstractC6431e getTypeSerializer() {
            return this.typeSerializer;
        }

        public final AbstractC6393h<Object> getValueSerializer() {
            return this.valueSerializer;
        }

        public boolean hasSerializer() {
            return (this.valueSerializer == null && this.typeSerializer == null) ? false : true;
        }

        public void serialize(JsonGenerator jsonGenerator, Object obj, DefaultSerializerProvider defaultSerializerProvider) throws IOException {
            AbstractC6431e abstractC6431e = this.typeSerializer;
            if (abstractC6431e != null) {
                defaultSerializerProvider.serializePolymorphic(jsonGenerator, obj, this.rootType, this.valueSerializer, abstractC6431e);
                return;
            }
            AbstractC6393h<Object> abstractC6393h = this.valueSerializer;
            if (abstractC6393h != null) {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj, this.rootType, abstractC6393h);
                return;
            }
            JavaType javaType = this.rootType;
            if (javaType != null) {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj, javaType);
            } else {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj);
            }
        }

        public Prefetch(JavaType javaType, AbstractC6393h<Object> abstractC6393h, AbstractC6431e abstractC6431e) {
            this.rootType = javaType;
            this.valueSerializer = abstractC6393h;
            this.typeSerializer = abstractC6431e;
        }
    }

    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig, JavaType javaType, InterfaceC6305h interfaceC6305h) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._generatorFactory = objectMapper._jsonFactory;
        this._generatorSettings = interfaceC6305h == null ? GeneratorSettings.empty : new GeneratorSettings(interfaceC6305h, null, null, null);
        if (javaType == null) {
            this._prefetch = Prefetch.empty;
        } else if (javaType.hasRawClass(Object.class)) {
            this._prefetch = Prefetch.empty.forRootType(this, javaType);
        } else {
            this._prefetch = Prefetch.empty.forRootType(this, javaType.withStaticTyping());
        }
    }

    public ObjectWriter _new(ObjectWriter objectWriter, JsonFactory jsonFactory) {
        return new ObjectWriter(objectWriter, jsonFactory);
    }

    /* JADX INFO: renamed from: a */
    public final void m11141a(JsonGenerator jsonGenerator, Object obj) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            this._prefetch.serialize(jsonGenerator, obj, _serializerProvider());
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

    public void acceptJsonFormatVisitor(JavaType javaType, InterfaceC43399e interfaceC43399e) throws JsonMappingException {
        _assertNotNull("type", javaType);
        _assertNotNull("visitor", interfaceC43399e);
        _serializerProvider().acceptJsonFormatVisitor(javaType, interfaceC43399e);
    }

    public boolean canSerialize(Class<?> cls) {
        _assertNotNull("type", cls);
        return _serializerProvider().hasSerializerFor(cls, null);
    }

    public JsonGenerator createGenerator(OutputStream outputStream) throws IOException {
        _assertNotNull("out", outputStream);
        return _configureGenerator(this._generatorFactory.createGenerator(outputStream, JsonEncoding.UTF8));
    }

    public ObjectWriter forType(JavaType javaType) {
        return _new(this._generatorSettings, this._prefetch.forRootType(this, javaType));
    }

    public boolean isEnabled(SerializationFeature serializationFeature) {
        return this._config.isEnabled(serializationFeature);
    }

    public ObjectWriter with(SerializationFeature serializationFeature) {
        return _new(this, this._config.with(serializationFeature));
    }

    public ObjectWriter withFeatures(SerializationFeature... serializationFeatureArr) {
        return _new(this, this._config.withFeatures(serializationFeatureArr));
    }

    public ObjectWriter withRootName(String str) {
        return _new(this, this._config.withRootName(str));
    }

    public ObjectWriter withRootValueSeparator(String str) {
        return _new(this._generatorSettings.withRootValueSeparator(str), this._prefetch);
    }

    @Deprecated
    public ObjectWriter withType(JavaType javaType) {
        return forType(javaType);
    }

    public ObjectWriter without(SerializationFeature serializationFeature) {
        return _new(this, this._config.without(serializationFeature));
    }

    public ObjectWriter withoutFeatures(SerializationFeature... serializationFeatureArr) {
        return _new(this, this._config.withoutFeatures(serializationFeatureArr));
    }

    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        _assertNotNull("g", jsonGenerator);
        _configureGenerator(jsonGenerator);
        if (!this._config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            this._prefetch.serialize(jsonGenerator, obj, _serializerProvider());
            if (this._config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
                return;
            }
            return;
        }
        Closeable closeable = (Closeable) obj;
        try {
            this._prefetch.serialize(jsonGenerator, obj, _serializerProvider());
            if (this._config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
            }
            closeable.close();
        } catch (Exception e11) {
            C6490g.m11942j(null, closeable, e11);
        }
    }

    public C6445l writeValues(File file) throws IOException {
        return _newSequenceWriter(false, createGenerator(file, JsonEncoding.UTF8), true);
    }

    public C6445l writeValuesAsArray(File file) throws IOException {
        return _newSequenceWriter(true, createGenerator(file, JsonEncoding.UTF8), true);
    }

    public final void _assertNotNull(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }

    public final JsonGenerator _configureGenerator(JsonGenerator jsonGenerator) {
        this._config.initialize(jsonGenerator);
        this._generatorSettings.initialize(jsonGenerator);
        return jsonGenerator;
    }

    public ObjectWriter _new(ObjectWriter objectWriter, SerializationConfig serializationConfig) {
        return serializationConfig == this._config ? this : new ObjectWriter(objectWriter, serializationConfig);
    }

    public C6445l _newSequenceWriter(boolean z11, JsonGenerator jsonGenerator, boolean z12) throws IOException {
        return new C6445l(_serializerProvider(), _configureGenerator(jsonGenerator), z12, this._prefetch).m11722a(z11);
    }

    public DefaultSerializerProvider _serializerProvider() {
        return this._serializerProvider.createInstance(this._config, this._serializerFactory);
    }

    public void _verifySchemaType(InterfaceC6299c interfaceC6299c) {
        if (interfaceC6299c == null || this._generatorFactory.canUseSchema(interfaceC6299c)) {
            return;
        }
        throw new IllegalArgumentException("Cannot use FormatSchema of type " + interfaceC6299c.getClass().getName() + " for format " + this._generatorFactory.getFormatName());
    }

    public final void _writeValueAndClose(JsonGenerator jsonGenerator, Object obj) throws IOException {
        if (this._config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            m11141a(jsonGenerator, obj);
            return;
        }
        try {
            this._prefetch.serialize(jsonGenerator, obj, _serializerProvider());
            jsonGenerator.close();
        } catch (Exception e11) {
            C6490g.m11944k(jsonGenerator, e11);
        }
    }

    public ObjectWriter forType(Class<?> cls) {
        return forType(this._config.constructType(cls));
    }

    public ContextAttributes getAttributes() {
        return this._config.getAttributes();
    }

    public SerializationConfig getConfig() {
        return this._config;
    }

    public JsonFactory getFactory() {
        return this._generatorFactory;
    }

    public TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public boolean hasPrefetchedSerializer() {
        return this._prefetch.hasSerializer();
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public Version version() {
        return C6347e.f10215a;
    }

    public ObjectWriter with(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        return _new(this, this._config.with(serializationFeature, serializationFeatureArr));
    }

    public ObjectWriter withAttribute(Object obj, Object obj2) {
        return _new(this, this._config.withAttribute(obj, obj2));
    }

    public ObjectWriter withAttributes(Map<?, ?> map) {
        return _new(this, this._config.withAttributes(map));
    }

    public ObjectWriter withDefaultPrettyPrinter() {
        return with(this._config.getDefaultPrettyPrinter());
    }

    public ObjectWriter withFeatures(JsonGenerator.Feature... featureArr) {
        return _new(this, this._config.withFeatures(featureArr));
    }

    public ObjectWriter withRootName(PropertyName propertyName) {
        return _new(this, this._config.withRootName(propertyName));
    }

    public ObjectWriter withRootValueSeparator(InterfaceC6306i interfaceC6306i) {
        return _new(this._generatorSettings.withRootValueSeparator(interfaceC6306i), this._prefetch);
    }

    @Deprecated
    public ObjectWriter withType(Class<?> cls) {
        return forType(cls);
    }

    public ObjectWriter withView(Class<?> cls) {
        return _new(this, this._config.withView(cls));
    }

    public ObjectWriter without(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        return _new(this, this._config.without(serializationFeature, serializationFeatureArr));
    }

    public ObjectWriter withoutAttribute(Object obj) {
        return _new(this, this._config.withoutAttribute(obj));
    }

    public ObjectWriter withoutFeatures(JsonGenerator.Feature... featureArr) {
        return _new(this, this._config.withoutFeatures(featureArr));
    }

    public ObjectWriter withoutRootName() {
        return _new(this, this._config.withRootName(PropertyName.NO_NAME));
    }

    public byte[] writeValueAsBytes(Object obj) throws JsonProcessingException {
        try {
            C6324c c6324c = new C6324c(this._generatorFactory._getBufferRecycler());
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
        C6315i c6315i = new C6315i(this._generatorFactory._getBufferRecycler());
        try {
            _writeValueAndClose(createGenerator(c6315i), obj);
            return c6315i.m11046a();
        } catch (JsonProcessingException e11) {
            throw e11;
        } catch (IOException e12) {
            throw JsonMappingException.fromUnexpectedIOE(e12);
        }
    }

    public C6445l writeValues(JsonGenerator jsonGenerator) throws IOException {
        _assertNotNull("g", jsonGenerator);
        return _newSequenceWriter(false, _configureGenerator(jsonGenerator), false);
    }

    public C6445l writeValuesAsArray(JsonGenerator jsonGenerator) throws IOException {
        _assertNotNull("gen", jsonGenerator);
        return _newSequenceWriter(true, jsonGenerator, false);
    }

    public boolean canSerialize(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        _assertNotNull("type", cls);
        return _serializerProvider().hasSerializerFor(cls, atomicReference);
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        _assertNotNull("out", outputStream);
        return _configureGenerator(this._generatorFactory.createGenerator(outputStream, jsonEncoding));
    }

    public ObjectWriter forType(AbstractC42116b<?> abstractC42116b) {
        this._config.getTypeFactory();
        throw null;
    }

    @Deprecated
    public boolean isEnabled(JsonParser.Feature feature) {
        return this._generatorFactory.isEnabled(feature);
    }

    public ObjectWriter with(JsonGenerator.Feature feature) {
        return _new(this, this._config.with(feature));
    }

    public ObjectWriter withFeatures(InterfaceC6298b... interfaceC6298bArr) {
        return _new(this, this._config.withFeatures(interfaceC6298bArr));
    }

    @Deprecated
    public ObjectWriter withSchema(InterfaceC6299c interfaceC6299c) {
        return with(interfaceC6299c);
    }

    @Deprecated
    public ObjectWriter withType(AbstractC42116b<?> abstractC42116b) {
        return forType(abstractC42116b);
    }

    public ObjectWriter without(JsonGenerator.Feature feature) {
        return _new(this, this._config.without(feature));
    }

    public ObjectWriter withoutFeatures(InterfaceC6298b... interfaceC6298bArr) {
        return _new(this, this._config.withoutFeatures(interfaceC6298bArr));
    }

    public ObjectWriter _new(GeneratorSettings generatorSettings, Prefetch prefetch) {
        return (this._generatorSettings == generatorSettings && this._prefetch == prefetch) ? this : new ObjectWriter(this, this._config, generatorSettings, prefetch);
    }

    public void acceptJsonFormatVisitor(Class<?> cls, InterfaceC43399e interfaceC43399e) throws JsonMappingException {
        _assertNotNull("type", cls);
        _assertNotNull("visitor", interfaceC43399e);
        acceptJsonFormatVisitor(this._config.constructType(cls), interfaceC43399e);
    }

    public boolean isEnabled(JsonGenerator.Feature feature) {
        return this._generatorFactory.isEnabled(feature);
    }

    public ObjectWriter with(StreamWriteFeature streamWriteFeature) {
        return _new(this, this._config.with(streamWriteFeature.mappedFeature()));
    }

    public ObjectWriter without(StreamWriteFeature streamWriteFeature) {
        return _new(this, this._config.without(streamWriteFeature.mappedFeature()));
    }

    public C6445l writeValues(Writer writer) throws IOException {
        return _newSequenceWriter(false, createGenerator(writer), true);
    }

    public C6445l writeValuesAsArray(Writer writer) throws IOException {
        return _newSequenceWriter(true, createGenerator(writer), true);
    }

    public JsonGenerator createGenerator(Writer writer) throws IOException {
        _assertNotNull("w", writer);
        return _configureGenerator(this._generatorFactory.createGenerator(writer));
    }

    public boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return this._generatorFactory.isEnabled(streamWriteFeature);
    }

    public ObjectWriter with(InterfaceC6298b interfaceC6298b) {
        return _new(this, this._config.with(interfaceC6298b));
    }

    public ObjectWriter without(InterfaceC6298b interfaceC6298b) {
        return _new(this, this._config.without(interfaceC6298b));
    }

    public C6445l writeValues(OutputStream outputStream) throws IOException {
        return _newSequenceWriter(false, createGenerator(outputStream, JsonEncoding.UTF8), true);
    }

    public C6445l writeValuesAsArray(OutputStream outputStream) throws IOException {
        return _newSequenceWriter(true, createGenerator(outputStream, JsonEncoding.UTF8), true);
    }

    public ObjectWriter with(DateFormat dateFormat) {
        return _new(this, this._config.with(dateFormat));
    }

    public C6445l writeValues(DataOutput dataOutput) throws IOException {
        return _newSequenceWriter(false, createGenerator(dataOutput), true);
    }

    public C6445l writeValuesAsArray(DataOutput dataOutput) throws IOException {
        return _newSequenceWriter(true, createGenerator(dataOutput), true);
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        _assertNotNull("outputFile", file);
        return _configureGenerator(this._generatorFactory.createGenerator(file, jsonEncoding));
    }

    public ObjectWriter with(AbstractC6456e abstractC6456e) {
        this._config.getFilterProvider();
        return this;
    }

    public ObjectWriter with(InterfaceC6305h interfaceC6305h) {
        return _new(this._generatorSettings.with(interfaceC6305h), this._prefetch);
    }

    public JsonGenerator createGenerator(DataOutput dataOutput) throws IOException {
        _assertNotNull("out", dataOutput);
        return _configureGenerator(this._generatorFactory.createGenerator(dataOutput));
    }

    public ObjectWriter with(InterfaceC6299c interfaceC6299c) {
        _verifySchemaType(interfaceC6299c);
        return _new(this._generatorSettings.with(interfaceC6299c), this._prefetch);
    }

    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._generatorFactory = objectMapper._jsonFactory;
        this._generatorSettings = GeneratorSettings.empty;
        this._prefetch = Prefetch.empty;
    }

    public ObjectWriter with(Locale locale) {
        return _new(this, this._config.with(locale));
    }

    public ObjectWriter with(TimeZone timeZone) {
        return _new(this, this._config.with(timeZone));
    }

    public ObjectWriter with(Base64Variant base64Variant) {
        return _new(this, this._config.with(base64Variant));
    }

    public void writeValue(File file, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(file, JsonEncoding.UTF8), obj);
    }

    public ObjectWriter with(CharacterEscapes characterEscapes) {
        return _new(this._generatorSettings.with(characterEscapes), this._prefetch);
    }

    public void writeValue(OutputStream outputStream, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(outputStream, JsonEncoding.UTF8), obj);
    }

    public ObjectWriter with(JsonFactory jsonFactory) {
        return jsonFactory == this._generatorFactory ? this : _new(this, jsonFactory);
    }

    public void writeValue(Writer writer, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(writer), obj);
    }

    public ObjectWriter with(ContextAttributes contextAttributes) {
        return _new(this, this._config.with(contextAttributes));
    }

    public void writeValue(DataOutput dataOutput, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(dataOutput), obj);
    }

    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig, InterfaceC6299c interfaceC6299c) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._generatorFactory = objectMapper._jsonFactory;
        this._generatorSettings = interfaceC6299c == null ? GeneratorSettings.empty : new GeneratorSettings(null, interfaceC6299c, null, null);
        this._prefetch = Prefetch.empty;
    }

    public ObjectWriter(ObjectWriter objectWriter, SerializationConfig serializationConfig, GeneratorSettings generatorSettings, Prefetch prefetch) {
        this._config = serializationConfig;
        this._serializerProvider = objectWriter._serializerProvider;
        this._serializerFactory = objectWriter._serializerFactory;
        this._generatorFactory = objectWriter._generatorFactory;
        this._generatorSettings = generatorSettings;
        this._prefetch = prefetch;
    }

    public ObjectWriter(ObjectWriter objectWriter, SerializationConfig serializationConfig) {
        this._config = serializationConfig;
        this._serializerProvider = objectWriter._serializerProvider;
        this._serializerFactory = objectWriter._serializerFactory;
        this._generatorFactory = objectWriter._generatorFactory;
        this._generatorSettings = objectWriter._generatorSettings;
        this._prefetch = objectWriter._prefetch;
    }

    public ObjectWriter(ObjectWriter objectWriter, JsonFactory jsonFactory) {
        this._config = objectWriter._config.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, jsonFactory.requiresPropertyOrdering());
        this._serializerProvider = objectWriter._serializerProvider;
        this._serializerFactory = objectWriter._serializerFactory;
        this._generatorFactory = jsonFactory;
        this._generatorSettings = objectWriter._generatorSettings;
        this._prefetch = objectWriter._prefetch;
    }
}
