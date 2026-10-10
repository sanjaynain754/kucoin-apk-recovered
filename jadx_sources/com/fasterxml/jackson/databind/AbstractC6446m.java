package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.AbstractC6304g;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.introspect.AbstractC6404a;
import com.fasterxml.jackson.databind.introspect.AbstractC6414k;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.AbstractC6456e;
import com.fasterxml.jackson.databind.ser.AbstractC6468j;
import com.fasterxml.jackson.databind.ser.C6460i;
import com.fasterxml.jackson.databind.ser.InterfaceC6455d;
import com.fasterxml.jackson.databind.ser.InterfaceC6459h;
import com.fasterxml.jackson.databind.ser.impl.C6465c;
import com.fasterxml.jackson.databind.ser.impl.C6466d;
import com.fasterxml.jackson.databind.ser.impl.C6467e;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.C6499p;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.m */
/* JADX INFO: compiled from: SerializerProvider.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6446m extends AbstractC6341c {
    protected static final boolean CACHE_UNKNOWN_MAPPINGS = false;
    public static final AbstractC6393h<Object> DEFAULT_NULL_KEY_SERIALIZER = new FailingSerializer("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
    protected static final AbstractC6393h<Object> DEFAULT_UNKNOWN_SERIALIZER = new UnknownSerializer();
    protected transient ContextAttributes _attributes;
    protected final SerializationConfig _config;
    protected DateFormat _dateFormat;
    protected AbstractC6393h<Object> _keySerializer;
    protected final C6465c _knownSerializers;
    protected AbstractC6393h<Object> _nullKeySerializer;
    protected AbstractC6393h<Object> _nullValueSerializer;
    protected final Class<?> _serializationView;
    protected final C6460i _serializerCache;
    protected final AbstractC6468j _serializerFactory;
    protected final boolean _stdNullValueSerializer;
    protected AbstractC6393h<Object> _unknownTypeSerializer;

    public AbstractC6446m() {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        this._nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._config = null;
        this._serializerFactory = null;
        this._serializerCache = new C6460i();
        this._knownSerializers = null;
        this._serializationView = null;
        this._attributes = null;
        this._stdNullValueSerializer = true;
    }

    public AbstractC6393h<Object> _createAndCacheUntypedSerializer(Class<?> cls) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393h_createUntypedSerializer;
        JavaType javaTypeConstructType = this._config.constructType(cls);
        try {
            abstractC6393h_createUntypedSerializer = _createUntypedSerializer(javaTypeConstructType);
        } catch (IllegalArgumentException e11) {
            reportBadDefinition(javaTypeConstructType, C6490g.m11952o(e11));
            abstractC6393h_createUntypedSerializer = null;
        }
        if (abstractC6393h_createUntypedSerializer != null) {
            this._serializerCache.m11779c(cls, javaTypeConstructType, abstractC6393h_createUntypedSerializer, this);
        }
        return abstractC6393h_createUntypedSerializer;
    }

    public C6499p bufferForValueConversion(AbstractC6304g abstractC6304g) {
        return new C6499p(abstractC6304g, false);
    }

    public void defaultSerializeDateKey(long j11, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.mo10810a0(String.valueOf(j11));
        } else {
            jsonGenerator.mo10810a0(_dateFormat().format(new Date(j11)));
        }
    }

    public final void defaultSerializeDateValue(long j11, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
            jsonGenerator.mo10816f0(j11);
        } else {
            jsonGenerator.mo10787C0(_dateFormat().format(new Date(j11)));
        }
    }

    public final void defaultSerializeValue(Object obj, JsonGenerator jsonGenerator) throws IOException {
        if (obj != null) {
            findTypedValueSerializer(obj.getClass(), true, (BeanProperty) null).serialize(obj, jsonGenerator, this);
        } else if (this._stdNullValueSerializer) {
            jsonGenerator.mo10812b0();
        } else {
            this._nullValueSerializer.serialize(null, jsonGenerator, this);
        }
    }

    public AbstractC6393h<Object> findContentValueSerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hM11813e = this._knownSerializers.m11813e(javaType);
        return (abstractC6393hM11813e == null && (abstractC6393hM11813e = this._serializerCache.m11787k(javaType)) == null && (abstractC6393hM11813e = _createAndCacheUntypedSerializer(javaType)) == null) ? getUnknownTypeSerializer(javaType.getRawClass()) : handleSecondaryContextualization(abstractC6393hM11813e, beanProperty);
    }

    public AbstractC6393h<Object> findKeySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return _handleContextualResolvable(this._serializerFactory.createKeySerializer(this, javaType, this._keySerializer), beanProperty);
    }

    public abstract C6467e findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator);

    public AbstractC6393h<Object> findPrimaryPropertySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hM11813e = this._knownSerializers.m11813e(javaType);
        return (abstractC6393hM11813e == null && (abstractC6393hM11813e = this._serializerCache.m11787k(javaType)) == null && (abstractC6393hM11813e = _createAndCacheUntypedSerializer(javaType)) == null) ? getUnknownTypeSerializer(javaType.getRawClass()) : handlePrimaryContextualization(abstractC6393hM11813e, beanProperty);
    }

    public AbstractC6393h<Object> findTypedValueSerializer(Class<?> cls, boolean z11, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hM11812d = this._knownSerializers.m11812d(cls);
        if (abstractC6393hM11812d != null) {
            return abstractC6393hM11812d;
        }
        AbstractC6393h<Object> abstractC6393hM11786j = this._serializerCache.m11786j(cls);
        if (abstractC6393hM11786j != null) {
            return abstractC6393hM11786j;
        }
        AbstractC6393h<Object> abstractC6393hFindValueSerializer = findValueSerializer(cls, beanProperty);
        AbstractC6468j abstractC6468j = this._serializerFactory;
        SerializationConfig serializationConfig = this._config;
        AbstractC6431e abstractC6431eCreateTypeSerializer = abstractC6468j.createTypeSerializer(serializationConfig, serializationConfig.constructType(cls));
        if (abstractC6431eCreateTypeSerializer != null) {
            abstractC6393hFindValueSerializer = new C6466d(abstractC6431eCreateTypeSerializer.mo11689a(beanProperty), abstractC6393hFindValueSerializer);
        }
        if (z11) {
            this._serializerCache.m11781e(cls, abstractC6393hFindValueSerializer);
        }
        return abstractC6393hFindValueSerializer;
    }

    public AbstractC6393h<Object> findValueSerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hM11814f = this._knownSerializers.m11814f(cls);
        return (abstractC6393hM11814f == null && (abstractC6393hM11814f = this._serializerCache.m11788l(cls)) == null && (abstractC6393hM11814f = this._serializerCache.m11787k(this._config.constructType(cls))) == null && (abstractC6393hM11814f = _createAndCacheUntypedSerializer(cls)) == null) ? getUnknownTypeSerializer(cls) : handleSecondaryContextualization(abstractC6393hM11814f, beanProperty);
    }

    public JsonGenerator getGenerator() {
        return null;
    }

    public abstract Object includeFilterInstance(AbstractC6414k abstractC6414k, Class<?> cls) throws JsonMappingException;

    public abstract boolean includeFilterSuppressNulls(Object obj) throws JsonMappingException;

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public final boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    @Deprecated
    public JsonMappingException mappingException(String str, Object... objArr) {
        return JsonMappingException.from(getGenerator(), _format(str, objArr));
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public <T> T reportBadDefinition(JavaType javaType, String str) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), str, javaType);
    }

    public void reportMappingProblem(String str, Object... objArr) throws JsonMappingException {
        throw mappingException(str, objArr);
    }

    public abstract AbstractC6393h<Object> serializerInstance(AbstractC6404a abstractC6404a, Object obj) throws JsonMappingException;

    public AbstractC6393h<Object> _createUntypedSerializer(JavaType javaType) throws JsonMappingException {
        return this._serializerFactory.createSerializer(this, javaType);
    }

    public final DateFormat _dateFormat() {
        DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat2;
        return dateFormat2;
    }

    public AbstractC6393h<Object> _findExplicitUntypedSerializer(Class<?> cls) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hM11814f = this._knownSerializers.m11814f(cls);
        if (abstractC6393hM11814f == null && (abstractC6393hM11814f = this._serializerCache.m11788l(cls)) == null) {
            abstractC6393hM11814f = _createAndCacheUntypedSerializer(cls);
        }
        if (isUnknownTypeSerializer(abstractC6393hM11814f)) {
            return null;
        }
        return abstractC6393hM11814f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC6393h<Object> _handleContextualResolvable(AbstractC6393h<?> abstractC6393h, BeanProperty beanProperty) throws JsonMappingException {
        if (abstractC6393h instanceof InterfaceC6459h) {
            ((InterfaceC6459h) abstractC6393h).resolve(this);
        }
        return handleSecondaryContextualization(abstractC6393h, beanProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC6393h<Object> _handleResolvable(AbstractC6393h<?> abstractC6393h) throws JsonMappingException {
        if (abstractC6393h instanceof InterfaceC6459h) {
            ((InterfaceC6459h) abstractC6393h).resolve(this);
        }
        return abstractC6393h;
    }

    public final C6499p bufferForValueConversion() {
        return bufferForValueConversion(null);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public final boolean canOverrideAccessModifiers() {
        return this._config.canOverrideAccessModifiers();
    }

    public final void defaultSerializeNull(JsonGenerator jsonGenerator) throws IOException {
        if (this._stdNullValueSerializer) {
            jsonGenerator.mo10812b0();
        } else {
            this._nullValueSerializer.serialize(null, jsonGenerator, this);
        }
    }

    public AbstractC6393h<Object> findNullKeySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return this._nullKeySerializer;
    }

    public AbstractC6393h<Object> findNullValueSerializer(BeanProperty beanProperty) throws JsonMappingException {
        return this._nullValueSerializer;
    }

    public AbstractC6431e findTypeSerializer(JavaType javaType) throws JsonMappingException {
        return this._serializerFactory.createTypeSerializer(this._config, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public final Class<?> getActiveView() {
        return this._serializationView;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public final AnnotationIntrospector getAnnotationIntrospector() {
        return this._config.getAnnotationIntrospector();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public Object getAttribute(Object obj) {
        return this._attributes.getAttribute(obj);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public final SerializationConfig getConfig() {
        return this._config;
    }

    public AbstractC6393h<Object> getDefaultNullKeySerializer() {
        return this._nullKeySerializer;
    }

    public AbstractC6393h<Object> getDefaultNullValueSerializer() {
        return this._nullValueSerializer;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public final JsonFormat.Value getDefaultPropertyFormat(Class<?> cls) {
        return this._config.getDefaultPropertyFormat(cls);
    }

    public final JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls) {
        return this._config.getDefaultPropertyInclusion(cls);
    }

    public final AbstractC6456e getFilterProvider() {
        this._config.getFilterProvider();
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public Locale getLocale() {
        return this._config.getLocale();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public final TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public AbstractC6393h<Object> getUnknownTypeSerializer(Class<?> cls) {
        return cls == Object.class ? this._unknownTypeSerializer : new UnknownSerializer(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC6393h<?> handlePrimaryContextualization(AbstractC6393h<?> abstractC6393h, BeanProperty beanProperty) throws JsonMappingException {
        return (abstractC6393h == 0 || !(abstractC6393h instanceof InterfaceC6455d)) ? abstractC6393h : ((InterfaceC6455d) abstractC6393h).createContextual(this, beanProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC6393h<?> handleSecondaryContextualization(AbstractC6393h<?> abstractC6393h, BeanProperty beanProperty) throws JsonMappingException {
        return (abstractC6393h == 0 || !(abstractC6393h instanceof InterfaceC6455d)) ? abstractC6393h : ((InterfaceC6455d) abstractC6393h).createContextual(this, beanProperty);
    }

    public final boolean hasSerializationFeatures(int i11) {
        return this._config.hasSerializationFeatures(i11);
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return this._config.isEnabled(serializationFeature);
    }

    public boolean isUnknownTypeSerializer(AbstractC6393h<?> abstractC6393h) {
        if (abstractC6393h == this._unknownTypeSerializer || abstractC6393h == null) {
            return true;
        }
        return isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS) && abstractC6393h.getClass() == UnknownSerializer.class;
    }

    @Deprecated
    public JsonMappingException mappingException(Throwable th2, String str, Object... objArr) {
        return JsonMappingException.from(getGenerator(), _format(str, objArr), th2);
    }

    public <T> T reportBadDefinition(JavaType javaType, String str, Throwable th2) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), str, javaType).withCause(th2);
    }

    public <T> T reportBadTypeDefinition(AbstractC6340b abstractC6340b, String str, Object... objArr) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), String.format("Invalid type definition for type %s: %s", abstractC6340b != null ? C6490g.m11921X(abstractC6340b.m11172r()) : "N/A", _format(str, objArr)), abstractC6340b, (AbstractC6414k) null);
    }

    public void reportMappingProblem(Throwable th2, String str, Object... objArr) throws JsonMappingException {
        throw JsonMappingException.from(getGenerator(), _format(str, objArr), th2);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public AbstractC6446m setAttribute(Object obj, Object obj2) {
        this._attributes = this._attributes.withPerCallAttribute(obj, obj2);
        return this;
    }

    public void setDefaultKeySerializer(AbstractC6393h<Object> abstractC6393h) {
        if (abstractC6393h == null) {
            throw new IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this._keySerializer = abstractC6393h;
    }

    public void setNullKeySerializer(AbstractC6393h<Object> abstractC6393h) {
        if (abstractC6393h == null) {
            throw new IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this._nullKeySerializer = abstractC6393h;
    }

    public void setNullValueSerializer(AbstractC6393h<Object> abstractC6393h) {
        if (abstractC6393h == null) {
            throw new IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this._nullValueSerializer = abstractC6393h;
    }

    public void _reportIncompatibleRootType(Object obj, JavaType javaType) throws IOException {
        if (javaType.isPrimitive() && C6490g.m11953o0(javaType.getRawClass()).isAssignableFrom(obj.getClass())) {
            return;
        }
        reportBadDefinition(javaType, String.format("Incompatible types: declared root type (%s) vs %s", javaType, C6490g.m11938h(obj)));
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) throws IllegalArgumentException {
        if (javaType.hasRawClass(cls)) {
            return javaType;
        }
        return getConfig().getTypeFactory().constructSpecializedType(javaType, cls, true);
    }

    public final void defaultSerializeField(String str, Object obj, JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.mo10810a0(str);
        if (obj == null) {
            if (this._stdNullValueSerializer) {
                jsonGenerator.mo10812b0();
                return;
            } else {
                this._nullValueSerializer.serialize(null, jsonGenerator, this);
                return;
            }
        }
        findTypedValueSerializer(obj.getClass(), true, (BeanProperty) null).serialize(obj, jsonGenerator, this);
    }

    public AbstractC6393h<Object> findKeySerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        return findKeySerializer(this._config.constructType(cls), beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6341c
    public JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2) {
        return InvalidTypeIdException.from(null, _colonConcat(String.format("Could not resolve type id '%s' as a subtype of %s", str, C6490g.m11904G(javaType)), str2), javaType, str);
    }

    public <T> T reportBadPropertyDefinition(AbstractC6340b abstractC6340b, AbstractC6414k abstractC6414k, String str, Object... objArr) throws JsonMappingException {
        String str_quotedString;
        String str_format = _format(str, objArr);
        String strM11921X = "N/A";
        if (abstractC6414k == null) {
            str_quotedString = "N/A";
        } else {
            str_quotedString = _quotedString(abstractC6414k.getName());
        }
        if (abstractC6340b != null) {
            strM11921X = C6490g.m11921X(abstractC6340b.m11172r());
        }
        throw InvalidDefinitionException.from(getGenerator(), String.format("Invalid definition for property %s (of type %s): %s", str_quotedString, strM11921X, str_format), abstractC6340b, abstractC6414k);
    }

    public void defaultSerializeDateKey(Date date, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.mo10810a0(String.valueOf(date.getTime()));
        } else {
            jsonGenerator.mo10810a0(_dateFormat().format(date));
        }
    }

    public final void defaultSerializeDateValue(Date date, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
            jsonGenerator.mo10816f0(date.getTime());
        } else {
            jsonGenerator.mo10787C0(_dateFormat().format(date));
        }
    }

    public <T> T reportBadDefinition(Class<?> cls, String str, Throwable th2) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), str, constructType(cls)).withCause(th2);
    }

    public AbstractC6393h<Object> _createAndCacheUntypedSerializer(JavaType javaType) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393h_createUntypedSerializer;
        try {
            abstractC6393h_createUntypedSerializer = _createUntypedSerializer(javaType);
        } catch (IllegalArgumentException e11) {
            reportMappingProblem(e11, C6490g.m11952o(e11), new Object[0]);
            abstractC6393h_createUntypedSerializer = null;
        }
        if (abstractC6393h_createUntypedSerializer != null) {
            this._serializerCache.m11778b(javaType, abstractC6393h_createUntypedSerializer, this);
        }
        return abstractC6393h_createUntypedSerializer;
    }

    public AbstractC6393h<Object> findContentValueSerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hM11814f = this._knownSerializers.m11814f(cls);
        if (abstractC6393hM11814f == null && (abstractC6393hM11814f = this._serializerCache.m11788l(cls)) == null && (abstractC6393hM11814f = this._serializerCache.m11787k(this._config.constructType(cls))) == null && (abstractC6393hM11814f = _createAndCacheUntypedSerializer(cls)) == null) {
            return getUnknownTypeSerializer(cls);
        }
        return handleSecondaryContextualization(abstractC6393hM11814f, beanProperty);
    }

    public AbstractC6393h<Object> findPrimaryPropertySerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hM11814f = this._knownSerializers.m11814f(cls);
        if (abstractC6393hM11814f == null && (abstractC6393hM11814f = this._serializerCache.m11788l(cls)) == null && (abstractC6393hM11814f = this._serializerCache.m11787k(this._config.constructType(cls))) == null && (abstractC6393hM11814f = _createAndCacheUntypedSerializer(cls)) == null) {
            return getUnknownTypeSerializer(cls);
        }
        return handlePrimaryContextualization(abstractC6393hM11814f, beanProperty);
    }

    public AbstractC6393h<Object> findValueSerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        if (javaType == null) {
            reportMappingProblem("Null passed for `valueType` of `findValueSerializer()`", new Object[0]);
        }
        AbstractC6393h<Object> abstractC6393hM11813e = this._knownSerializers.m11813e(javaType);
        if (abstractC6393hM11813e == null && (abstractC6393hM11813e = this._serializerCache.m11787k(javaType)) == null && (abstractC6393hM11813e = _createAndCacheUntypedSerializer(javaType)) == null) {
            return getUnknownTypeSerializer(javaType.getRawClass());
        }
        return handleSecondaryContextualization(abstractC6393hM11813e, beanProperty);
    }

    public AbstractC6393h<Object> findTypedValueSerializer(JavaType javaType, boolean z11, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hM11811c = this._knownSerializers.m11811c(javaType);
        if (abstractC6393hM11811c != null) {
            return abstractC6393hM11811c;
        }
        AbstractC6393h<Object> abstractC6393hM11785i = this._serializerCache.m11785i(javaType);
        if (abstractC6393hM11785i != null) {
            return abstractC6393hM11785i;
        }
        AbstractC6393h<Object> abstractC6393hFindValueSerializer = findValueSerializer(javaType, beanProperty);
        AbstractC6431e abstractC6431eCreateTypeSerializer = this._serializerFactory.createTypeSerializer(this._config, javaType);
        if (abstractC6431eCreateTypeSerializer != null) {
            abstractC6393hFindValueSerializer = new C6466d(abstractC6431eCreateTypeSerializer.mo11689a(beanProperty), abstractC6393hFindValueSerializer);
        }
        if (z11) {
            this._serializerCache.m11780d(javaType, abstractC6393hFindValueSerializer);
        }
        return abstractC6393hFindValueSerializer;
    }

    public AbstractC6446m(AbstractC6446m abstractC6446m, SerializationConfig serializationConfig, AbstractC6468j abstractC6468j) {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        AbstractC6393h<Object> abstractC6393h = DEFAULT_NULL_KEY_SERIALIZER;
        this._nullKeySerializer = abstractC6393h;
        this._serializerFactory = abstractC6468j;
        this._config = serializationConfig;
        C6460i c6460i = abstractC6446m._serializerCache;
        this._serializerCache = c6460i;
        this._unknownTypeSerializer = abstractC6446m._unknownTypeSerializer;
        this._keySerializer = abstractC6446m._keySerializer;
        AbstractC6393h<Object> abstractC6393h2 = abstractC6446m._nullValueSerializer;
        this._nullValueSerializer = abstractC6393h2;
        this._nullKeySerializer = abstractC6446m._nullKeySerializer;
        this._stdNullValueSerializer = abstractC6393h2 == abstractC6393h;
        this._serializationView = serializationConfig.getActiveView();
        this._attributes = serializationConfig.getAttributes();
        this._knownSerializers = c6460i.m11783g();
    }

    public AbstractC6393h<Object> findValueSerializer(Class<?> cls) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hM11814f = this._knownSerializers.m11814f(cls);
        return (abstractC6393hM11814f == null && (abstractC6393hM11814f = this._serializerCache.m11788l(cls)) == null && (abstractC6393hM11814f = this._serializerCache.m11787k(this._config.constructType(cls))) == null && (abstractC6393hM11814f = _createAndCacheUntypedSerializer(cls)) == null) ? getUnknownTypeSerializer(cls) : abstractC6393hM11814f;
    }

    public AbstractC6393h<Object> findValueSerializer(JavaType javaType) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hM11813e = this._knownSerializers.m11813e(javaType);
        return (abstractC6393hM11813e == null && (abstractC6393hM11813e = this._serializerCache.m11787k(javaType)) == null && (abstractC6393hM11813e = _createAndCacheUntypedSerializer(javaType)) == null) ? getUnknownTypeSerializer(javaType.getRawClass()) : abstractC6393hM11813e;
    }

    public AbstractC6446m(AbstractC6446m abstractC6446m) {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        this._nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._config = null;
        this._serializationView = null;
        this._serializerFactory = null;
        this._knownSerializers = null;
        this._serializerCache = new C6460i();
        this._unknownTypeSerializer = abstractC6446m._unknownTypeSerializer;
        this._keySerializer = abstractC6446m._keySerializer;
        this._nullValueSerializer = abstractC6446m._nullValueSerializer;
        this._nullKeySerializer = abstractC6446m._nullKeySerializer;
        this._stdNullValueSerializer = abstractC6446m._stdNullValueSerializer;
    }
}
