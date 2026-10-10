package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.p062io.C6310d;
import com.fasterxml.jackson.core.p062io.C6317k;
import com.fasterxml.jackson.core.p062io.CharacterEscapes;
import com.fasterxml.jackson.core.p062io.ContentReference;
import com.fasterxml.jackson.core.p062io.InputDecorator;
import com.fasterxml.jackson.core.p062io.OutputDecorator;
import com.fasterxml.jackson.core.p062io.SerializedString;
import com.fasterxml.jackson.core.util.C6322a;
import com.fasterxml.jackson.core.util.C6323b;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.InterfaceC6326e;
import java.io.CharArrayReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.net.URL;
import p303h7.InterfaceC38132a;
import p334i7.C38463a;
import p334i7.C38468f;
import p334i7.C38469g;
import p334i7.C38470h;
import p334i7.C38471i;
import p334i7.C38473k;
import p361j7.C40337a;
import p395k7.C40935a;
import p395k7.C40936b;

/* JADX INFO: loaded from: classes45.dex */
public class JsonFactory extends TokenStreamFactory implements Serializable {
    public static final char DEFAULT_QUOTE_CHAR = '\"';
    public static final String FORMAT_NAME_JSON = "JSON";
    private static final long serialVersionUID = 2;
    protected final transient C40935a _byteSymbolCanonicalizer;
    protected CharacterEscapes _characterEscapes;
    protected int _factoryFeatures;
    protected int _generatorFeatures;
    protected InputDecorator _inputDecorator;
    protected int _maximumNonEscapedChar;
    protected AbstractC6304g _objectCodec;
    protected OutputDecorator _outputDecorator;
    protected int _parserFeatures;
    protected final char _quoteChar;
    protected final transient C40936b _rootCharSymbols;
    protected InterfaceC6306i _rootValueSeparator;
    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();
    public static final InterfaceC6306i DEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;

    public enum Feature implements InterfaceC6326e {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);

        private final boolean _defaultState;

        @Override // com.fasterxml.jackson.core.util.InterfaceC6326e
        public int getMask() {
            return 1 << ordinal();
        }

        @Override // com.fasterxml.jackson.core.util.InterfaceC6326e
        public boolean enabledByDefault() {
            return this._defaultState;
        }

        Feature(boolean z11) {
            this._defaultState = z11;
        }

        public static int collectDefaults() {
            int mask = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    mask |= feature.getMask();
                }
            }
            return mask;
        }

        public boolean enabledIn(int i11) {
            if ((i11 & getMask()) != 0) {
                return true;
            }
            return false;
        }
    }

    public JsonFactory() {
        this((AbstractC6304g) null);
    }

    public ContentReference _createContentReference(Object obj) {
        return ContentReference.construct(!canHandleBinaryNatively(), obj);
    }

    public C6310d _createContext(ContentReference contentReference, boolean z11) {
        if (contentReference == null) {
            contentReference = ContentReference.unknown();
        }
        return new C6310d(_getBufferRecycler(), contentReference, z11);
    }

    public JsonParser _createParser(InputStream inputStream, C6310d c6310d) throws IOException {
        return new C38463a(c6310d, inputStream).m86782c(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    public final InputStream _decorate(InputStream inputStream, C6310d c6310d) throws IOException {
        InputStream inputStreamDecorate;
        InputDecorator inputDecorator = this._inputDecorator;
        return (inputDecorator == null || (inputStreamDecorate = inputDecorator.decorate(c6310d, inputStream)) == null) ? inputStream : inputStreamDecorate;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public boolean canHandleBinaryNatively() {
        return false;
    }

    public boolean canUseCharArrays() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public boolean canUseSchema(InterfaceC6299c interfaceC6299c) {
        String formatName;
        return (interfaceC6299c == null || (formatName = getFormatName()) == null || !formatName.equals(interfaceC6299c.m10920a())) ? false : true;
    }

    @Deprecated
    public final JsonFactory configure(Feature feature, boolean z11) {
        return z11 ? enable(feature) : disable(feature);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        C6310d c6310d_createContext = _createContext(_createContentReference(outputStream), false);
        c6310d_createContext.m10994u(jsonEncoding);
        return jsonEncoding == JsonEncoding.UTF8 ? _createUTF8Generator(_decorate(outputStream, c6310d_createContext), c6310d_createContext) : _createGenerator(_decorate(_createWriter(outputStream, jsonEncoding, c6310d_createContext), c6310d_createContext), c6310d_createContext);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        return createGenerator(outputStream, jsonEncoding);
    }

    @Deprecated
    public JsonParser createJsonParser(File file) throws IOException {
        return createParser(file);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(File file) throws IOException {
        C6310d c6310d_createContext = _createContext(_createContentReference(file), true);
        return _createParser(_decorate(new FileInputStream(file), c6310d_createContext), c6310d_createContext);
    }

    @Deprecated
    public JsonFactory disable(Feature feature) {
        this._factoryFeatures = (~feature.getMask()) & this._factoryFeatures;
        return this;
    }

    @Deprecated
    public JsonFactory enable(Feature feature) {
        this._factoryFeatures = feature.getMask() | this._factoryFeatures;
        return this;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public int getFormatGeneratorFeatures() {
        return 0;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public int getFormatParserFeatures() {
        return 0;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public Class<? extends InterfaceC6298b> getFormatReadFeatureType() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public Class<? extends InterfaceC6298b> getFormatWriteFeatureType() {
        return null;
    }

    public final boolean isEnabled(Feature feature) {
        return (feature.getMask() & this._factoryFeatures) != 0;
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public boolean requiresPropertyOrdering() {
        return false;
    }

    public JsonFactory(AbstractC6304g abstractC6304g) {
        this._rootCharSymbols = C40936b.m89689j();
        this._byteSymbolCanonicalizer = C40935a.m89651u();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = abstractC6304g;
        this._quoteChar = '\"';
    }

    public static AbstractC6318j<?, ?> builder() {
        return new C6300d();
    }

    public ContentReference _createContentReference(Object obj, int i11, int i12) {
        return ContentReference.construct(!canHandleBinaryNatively(), obj, i11, i12);
    }

    public JsonGenerator _createGenerator(Writer writer, C6310d c6310d) throws IOException {
        C38473k c38473k = new C38473k(c6310d, this._generatorFeatures, this._objectCodec, writer, this._quoteChar);
        int i11 = this._maximumNonEscapedChar;
        if (i11 > 0) {
            c38473k.mo10786C(i11);
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            c38473k.mo10846w(characterEscapes);
        }
        InterfaceC6306i interfaceC6306i = this._rootValueSeparator;
        if (interfaceC6306i != DEFAULT_ROOT_VALUE_SEPARATOR) {
            c38473k.mo10794J(interfaceC6306i);
        }
        return c38473k;
    }

    public C6310d _createNonBlockingContext(Object obj) {
        return new C6310d(_getBufferRecycler(), _createContentReference(obj), false);
    }

    public JsonParser _createParser(Reader reader, C6310d c6310d) throws IOException {
        return new C38469g(c6310d, this._parserFeatures, reader, this._objectCodec, this._rootCharSymbols.m89701n(this._factoryFeatures));
    }

    public JsonGenerator _createUTF8Generator(OutputStream outputStream, C6310d c6310d) throws IOException {
        C38471i c38471i = new C38471i(c6310d, this._generatorFeatures, this._objectCodec, outputStream, this._quoteChar);
        int i11 = this._maximumNonEscapedChar;
        if (i11 > 0) {
            c38471i.mo10786C(i11);
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            c38471i.mo10846w(characterEscapes);
        }
        InterfaceC6306i interfaceC6306i = this._rootValueSeparator;
        if (interfaceC6306i != DEFAULT_ROOT_VALUE_SEPARATOR) {
            c38471i.mo10794J(interfaceC6306i);
        }
        return c38471i;
    }

    public Writer _createWriter(OutputStream outputStream, JsonEncoding jsonEncoding, C6310d c6310d) throws IOException {
        return jsonEncoding == JsonEncoding.UTF8 ? new C6317k(c6310d, outputStream) : new OutputStreamWriter(outputStream, jsonEncoding.getJavaName());
    }

    public C6322a _getBufferRecycler() {
        return Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.enabledIn(this._factoryFeatures) ? C6323b.m11066a() : new C6322a();
    }

    public final JsonFactory configure(JsonParser.Feature feature, boolean z11) {
        return z11 ? enable(feature) : disable(feature);
    }

    public JsonFactory copy() {
        _checkInvalidCopy(JsonFactory.class);
        return new JsonFactory(this, (AbstractC6304g) null);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(Writer writer) throws IOException {
        return createGenerator(writer);
    }

    @Deprecated
    public JsonParser createJsonParser(URL url) throws IOException {
        return createParser(url);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createNonBlockingByteArrayParser() throws IOException {
        m10783b("Non-blocking source not (yet?) supported for this format (%s)");
        return new C40337a(_createNonBlockingContext(null), this._parserFeatures, this._byteSymbolCanonicalizer.m89653A(this._factoryFeatures));
    }

    public JsonFactory disable(JsonParser.Feature feature) {
        this._parserFeatures = (~feature.getMask()) & this._parserFeatures;
        return this;
    }

    public JsonFactory enable(JsonParser.Feature feature) {
        this._parserFeatures = feature.getMask() | this._parserFeatures;
        return this;
    }

    public CharacterEscapes getCharacterEscapes() {
        return this._characterEscapes;
    }

    public AbstractC6304g getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final int getGeneratorFeatures() {
        return this._generatorFeatures;
    }

    public InputDecorator getInputDecorator() {
        return this._inputDecorator;
    }

    public OutputDecorator getOutputDecorator() {
        return this._outputDecorator;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final int getParserFeatures() {
        return this._parserFeatures;
    }

    public String getRootValueSeparator() {
        InterfaceC6306i interfaceC6306i = this._rootValueSeparator;
        if (interfaceC6306i == null) {
            return null;
        }
        return interfaceC6306i.getValue();
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final boolean isEnabled(JsonParser.Feature feature) {
        return (feature.getMask() & this._parserFeatures) != 0;
    }

    public Object readResolve() {
        return new JsonFactory(this, this._objectCodec);
    }

    public AbstractC6318j<?, ?> rebuild() {
        m10783b("Factory implementation for format (%s) MUST override `rebuild()` method");
        return new C6300d(this);
    }

    public JsonFactory setCharacterEscapes(CharacterEscapes characterEscapes) {
        this._characterEscapes = characterEscapes;
        return this;
    }

    public JsonFactory setCodec(AbstractC6304g abstractC6304g) {
        this._objectCodec = abstractC6304g;
        return this;
    }

    @Deprecated
    public JsonFactory setInputDecorator(InputDecorator inputDecorator) {
        this._inputDecorator = inputDecorator;
        return this;
    }

    @Deprecated
    public JsonFactory setOutputDecorator(OutputDecorator outputDecorator) {
        this._outputDecorator = outputDecorator;
        return this;
    }

    public JsonFactory setRootValueSeparator(String str) {
        this._rootValueSeparator = str == null ? null : new SerializedString(str);
        return this;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public Version version() {
        return C38468f.f86334a;
    }

    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() == cls) {
            return;
        }
        throw new IllegalStateException("Failed copy(): " + getClass().getName() + " (version: " + version() + ") does not override copy(); it has to");
    }

    @Deprecated
    public C6310d _createContext(Object obj, boolean z11) {
        return new C6310d(_getBufferRecycler(), _createContentReference(obj), z11);
    }

    public final Reader _decorate(Reader reader, C6310d c6310d) throws IOException {
        Reader readerDecorate;
        InputDecorator inputDecorator = this._inputDecorator;
        return (inputDecorator == null || (readerDecorate = inputDecorator.decorate(c6310d, reader)) == null) ? reader : readerDecorate;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10782a() {
        if (getFormatName() == FORMAT_NAME_JSON) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m10783b(String str) {
        if (m10782a()) {
        } else {
            throw new UnsupportedOperationException(String.format(str, getFormatName()));
        }
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public boolean canParseAsync() {
        return m10782a();
    }

    public final JsonFactory configure(JsonGenerator.Feature feature, boolean z11) {
        return z11 ? enable(feature) : disable(feature);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(OutputStream outputStream) throws IOException {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    @Deprecated
    public JsonParser createJsonParser(InputStream inputStream) throws IOException {
        return createParser(inputStream);
    }

    public JsonFactory disable(JsonGenerator.Feature feature) {
        this._generatorFeatures = (~feature.getMask()) & this._generatorFeatures;
        return this;
    }

    public JsonFactory enable(JsonGenerator.Feature feature) {
        this._generatorFeatures = feature.getMask() | this._generatorFeatures;
        return this;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public String getFormatName() {
        if (getClass() == JsonFactory.class) {
            return FORMAT_NAME_JSON;
        }
        return null;
    }

    public MatchStrength hasFormat(InterfaceC38132a interfaceC38132a) throws IOException {
        if (getClass() == JsonFactory.class) {
            return hasJSONFormat(interfaceC38132a);
        }
        return null;
    }

    public MatchStrength hasJSONFormat(InterfaceC38132a interfaceC38132a) throws IOException {
        return C38463a.m86775h(interfaceC38132a);
    }

    public final boolean isEnabled(StreamReadFeature streamReadFeature) {
        return (streamReadFeature.mappedFeature().getMask() & this._parserFeatures) != 0;
    }

    public JsonParser _createParser(char[] cArr, int i11, int i12, C6310d c6310d, boolean z11) throws IOException {
        return new C38469g(c6310d, this._parserFeatures, null, this._objectCodec, this._rootCharSymbols.m89701n(this._factoryFeatures), cArr, i11, i11 + i12, z11);
    }

    @Deprecated
    public JsonParser createJsonParser(Reader reader) throws IOException {
        return createParser(reader);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(URL url) throws IOException {
        C6310d c6310d_createContext = _createContext(_createContentReference(url), true);
        return _createParser(_decorate(_optimizedStreamFromURL(url), c6310d_createContext), c6310d_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final boolean isEnabled(JsonGenerator.Feature feature) {
        return (feature.getMask() & this._generatorFeatures) != 0;
    }

    public final DataInput _decorate(DataInput dataInput, C6310d c6310d) throws IOException {
        DataInput dataInputDecorate;
        InputDecorator inputDecorator = this._inputDecorator;
        return (inputDecorator == null || (dataInputDecorate = inputDecorator.decorate(c6310d, dataInput)) == null) ? dataInput : dataInputDecorate;
    }

    @Deprecated
    public JsonParser createJsonParser(byte[] bArr) throws IOException {
        return createParser(bArr);
    }

    public final boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return (streamWriteFeature.mappedFeature().getMask() & this._generatorFeatures) != 0;
    }

    public JsonParser _createParser(byte[] bArr, int i11, int i12, C6310d c6310d) throws IOException {
        return new C38463a(c6310d, bArr, i11, i12).m86782c(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    @Deprecated
    public JsonParser createJsonParser(byte[] bArr, int i11, int i12) throws IOException {
        return createParser(bArr, i11, i12);
    }

    public JsonParser _createParser(DataInput dataInput, C6310d c6310d) throws IOException {
        m10783b("InputData source not (yet?) supported for this format (%s)");
        int iM86778l = C38463a.m86778l(dataInput);
        return new C38470h(c6310d, this._parserFeatures, dataInput, this._objectCodec, this._byteSymbolCanonicalizer.m89653A(this._factoryFeatures), iM86778l);
    }

    public final OutputStream _decorate(OutputStream outputStream, C6310d c6310d) throws IOException {
        OutputStream outputStreamDecorate;
        OutputDecorator outputDecorator = this._outputDecorator;
        return (outputDecorator == null || (outputStreamDecorate = outputDecorator.decorate(c6310d, outputStream)) == null) ? outputStream : outputStreamDecorate;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(OutputStream outputStream) throws IOException {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    @Deprecated
    public JsonParser createJsonParser(String str) throws IOException {
        return createParser(str);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(InputStream inputStream) throws IOException {
        C6310d c6310d_createContext = _createContext(_createContentReference(inputStream), false);
        return _createParser(_decorate(inputStream, c6310d_createContext), c6310d_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(Writer writer) throws IOException {
        C6310d c6310d_createContext = _createContext(_createContentReference(writer), false);
        return _createGenerator(_decorate(writer, c6310d_createContext), c6310d_createContext);
    }

    public final Writer _decorate(Writer writer, C6310d c6310d) throws IOException {
        Writer writerDecorate;
        OutputDecorator outputDecorator = this._outputDecorator;
        return (outputDecorator == null || (writerDecorate = outputDecorator.decorate(c6310d, writer)) == null) ? writer : writerDecorate;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(Reader reader) throws IOException {
        C6310d c6310d_createContext = _createContext(_createContentReference(reader), false);
        return _createParser(_decorate(reader, c6310d_createContext), c6310d_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream(file);
        C6310d c6310d_createContext = _createContext(_createContentReference(fileOutputStream), true);
        c6310d_createContext.m10994u(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return _createUTF8Generator(_decorate(fileOutputStream, c6310d_createContext), c6310d_createContext);
        }
        return _createGenerator(_decorate(_createWriter(fileOutputStream, jsonEncoding, c6310d_createContext), c6310d_createContext), c6310d_createContext);
    }

    public JsonFactory(JsonFactory jsonFactory, AbstractC6304g abstractC6304g) {
        this._rootCharSymbols = C40936b.m89689j();
        this._byteSymbolCanonicalizer = C40935a.m89651u();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = abstractC6304g;
        this._factoryFeatures = jsonFactory._factoryFeatures;
        this._parserFeatures = jsonFactory._parserFeatures;
        this._generatorFeatures = jsonFactory._generatorFeatures;
        this._inputDecorator = jsonFactory._inputDecorator;
        this._outputDecorator = jsonFactory._outputDecorator;
        this._characterEscapes = jsonFactory._characterEscapes;
        this._rootValueSeparator = jsonFactory._rootValueSeparator;
        this._maximumNonEscapedChar = jsonFactory._maximumNonEscapedChar;
        this._quoteChar = jsonFactory._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(byte[] bArr) throws IOException {
        InputStream inputStreamDecorate;
        C6310d c6310d_createContext = _createContext(_createContentReference(bArr), true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null && (inputStreamDecorate = inputDecorator.decorate(c6310d_createContext, bArr, 0, bArr.length)) != null) {
            return _createParser(inputStreamDecorate, c6310d_createContext);
        }
        return _createParser(bArr, 0, bArr.length, c6310d_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(byte[] bArr, int i11, int i12) throws IOException {
        InputStream inputStreamDecorate;
        C6310d c6310d_createContext = _createContext(_createContentReference(bArr, i11, i12), true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null && (inputStreamDecorate = inputDecorator.decorate(c6310d_createContext, bArr, i11, i12)) != null) {
            return _createParser(inputStreamDecorate, c6310d_createContext);
        }
        return _createParser(bArr, i11, i12, c6310d_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(DataOutput dataOutput, JsonEncoding jsonEncoding) throws IOException {
        return createGenerator(_createDataOutputWrapper(dataOutput), jsonEncoding);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(DataOutput dataOutput) throws IOException {
        return createGenerator(_createDataOutputWrapper(dataOutput), JsonEncoding.UTF8);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(String str) throws IOException {
        int length = str.length();
        if (this._inputDecorator == null && length <= 32768 && canUseCharArrays()) {
            C6310d c6310d_createContext = _createContext(_createContentReference(str), true);
            char[] cArrM10982i = c6310d_createContext.m10982i(length);
            str.getChars(0, length, cArrM10982i, 0);
            return _createParser(cArrM10982i, 0, length, c6310d_createContext, true);
        }
        return createParser(new StringReader(str));
    }

    public JsonFactory(C6300d c6300d) {
        this._rootCharSymbols = C40936b.m89689j();
        this._byteSymbolCanonicalizer = C40935a.m89651u();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = null;
        this._factoryFeatures = c6300d.f10133a;
        this._parserFeatures = c6300d.f10134b;
        this._generatorFeatures = c6300d.f10135c;
        this._inputDecorator = c6300d.f10136d;
        this._outputDecorator = c6300d.f10137e;
        this._characterEscapes = c6300d.f10041i;
        this._rootValueSeparator = c6300d.f10042j;
        this._maximumNonEscapedChar = c6300d.f10043k;
        this._quoteChar = c6300d.f10044l;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(char[] cArr) throws IOException {
        return createParser(cArr, 0, cArr.length);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(char[] cArr, int i11, int i12) throws IOException {
        if (this._inputDecorator != null) {
            return createParser(new CharArrayReader(cArr, i11, i12));
        }
        return _createParser(cArr, i11, i12, _createContext(_createContentReference(cArr, i11, i12), true), false);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(DataInput dataInput) throws IOException {
        C6310d c6310d_createContext = _createContext(_createContentReference(dataInput), false);
        return _createParser(_decorate(dataInput, c6310d_createContext), c6310d_createContext);
    }

    public JsonFactory(AbstractC6318j<?, ?> abstractC6318j, boolean z11) {
        this._rootCharSymbols = C40936b.m89689j();
        this._byteSymbolCanonicalizer = C40935a.m89651u();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = null;
        this._factoryFeatures = abstractC6318j.f10133a;
        this._parserFeatures = abstractC6318j.f10134b;
        this._generatorFeatures = abstractC6318j.f10135c;
        this._inputDecorator = abstractC6318j.f10136d;
        this._outputDecorator = abstractC6318j.f10137e;
        this._characterEscapes = null;
        this._rootValueSeparator = null;
        this._maximumNonEscapedChar = 0;
        this._quoteChar = '\"';
    }
}
