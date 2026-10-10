package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.InterfaceC6358c;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.C6372g;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
class FactoryBasedEnumDeserializer extends StdDeserializer<Object> implements InterfaceC6358c {
    private static final long serialVersionUID = 1;
    protected final SettableBeanProperty[] _creatorProps;
    protected final AbstractC6390e<?> _deser;
    protected final AnnotatedMethod _factory;
    protected final boolean _hasArgs;
    protected final JavaType _inputType;
    protected final ValueInstantiator _valueInstantiator;

    /* JADX INFO: renamed from: b */
    public transient PropertyBasedCreator f10347b;

    public FactoryBasedEnumDeserializer(Class<?> cls, AnnotatedMethod annotatedMethod, JavaType javaType, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        super(cls);
        this._factory = annotatedMethod;
        this._hasArgs = true;
        this._inputType = (javaType.hasRawClass(String.class) || javaType.hasRawClass(CharSequence.class)) ? null : javaType;
        this._deser = null;
        this._valueInstantiator = valueInstantiator;
        this._creatorProps = settableBeanPropertyArr;
    }

    public Object deserializeEnumUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext, PropertyBasedCreator propertyBasedCreator) throws IOException {
        C6372g c6372gM11302g = propertyBasedCreator.m11302g(jsonParser, deserializationContext, null);
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        while (jsonTokenMo10889k == JsonToken.FIELD_NAME) {
            String strMo10887j = jsonParser.mo10887j();
            jsonParser.mo10905t0();
            SettableBeanProperty settableBeanPropertyM11300e = propertyBasedCreator.m11300e(strMo10887j);
            if (!c6372gM11302g.m11372i(strMo10887j) || settableBeanPropertyM11300e != null) {
                if (settableBeanPropertyM11300e != null) {
                    c6372gM11302g.m11365b(settableBeanPropertyM11300e, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyM11300e));
                } else {
                    jsonParser.mo10856C0();
                }
            }
            jsonTokenMo10889k = jsonParser.mo10905t0();
        }
        return propertyBasedCreator.m11298a(deserializationContext, c6372gM11302g);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6358c
    public AbstractC6390e<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        JavaType javaType;
        return (this._deser == null && (javaType = this._inputType) != null && this._creatorProps == null) ? new FactoryBasedEnumDeserializer(this, (AbstractC6390e<?>) deserializationContext.findContextualValueDeserializer(javaType, beanProperty)) : this;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objMo10882g0;
        AbstractC6390e<?> abstractC6390e = this._deser;
        if (abstractC6390e != null) {
            objMo10882g0 = abstractC6390e.deserialize(jsonParser, deserializationContext);
        } else {
            if (!this._hasArgs) {
                jsonParser.mo10856C0();
                try {
                    return this._factory.call();
                } catch (Exception e11) {
                    return deserializationContext.handleInstantiationProblem(this._valueClass, null, C6490g.m11945k0(e11));
                }
            }
            if (this._creatorProps != null) {
                if (!jsonParser.mo10900p0()) {
                    JavaType valueType = getValueType(deserializationContext);
                    deserializationContext.reportInputMismatch(valueType, "Input mismatch reading Enum %s: properties-based `@JsonCreator` (%s) expects JSON Object (JsonToken.START_OBJECT), got JsonToken.%s", C6490g.m11904G(valueType), this._factory, jsonParser.mo10889k());
                }
                if (this.f10347b == null) {
                    this.f10347b = PropertyBasedCreator.m11297c(deserializationContext, this._valueInstantiator, this._creatorProps, deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                }
                jsonParser.mo10905t0();
                return deserializeEnumUsingPropertyBased(jsonParser, deserializationContext, this.f10347b);
            }
            JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
            if (jsonTokenMo10889k == null || jsonTokenMo10889k.isScalarValue()) {
                objMo10882g0 = jsonParser.mo10882g0();
            } else {
                jsonParser.mo10856C0();
                objMo10882g0 = "";
            }
        }
        try {
            return this._factory.callOnWith(this._valueClass, objMo10882g0);
        } catch (Exception e12) {
            Throwable thM11945k0 = C6490g.m11945k0(e12);
            if ((thM11945k0 instanceof IllegalArgumentException) && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return deserializationContext.handleInstantiationProblem(this._valueClass, objMo10882g0, thM11945k0);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        return this._deser == null ? deserialize(jsonParser, deserializationContext) : abstractC6428b.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.Enum;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: a */
    private Throwable m11397a(Throwable th2, DeserializationContext deserializationContext) throws IOException {
        boolean z11;
        Throwable thM11903F = C6490g.m11903F(th2);
        C6490g.m11939h0(thM11903F);
        if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (thM11903F instanceof IOException) {
            if (!z11 || !(thM11903F instanceof JacksonException)) {
                throw ((IOException) thM11903F);
            }
        } else if (!z11) {
            C6490g.m11943j0(thM11903F);
        }
        return thM11903F;
    }

    public final Object _deserializeWithErrorWrapping(JsonParser jsonParser, DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws IOException {
        try {
            return settableBeanProperty.deserialize(jsonParser, deserializationContext);
        } catch (Exception e11) {
            return wrapAndThrow(e11, handledType(), settableBeanProperty.getName(), deserializationContext);
        }
    }

    public Object wrapAndThrow(Throwable th2, Object obj, String str, DeserializationContext deserializationContext) throws IOException {
        throw JsonMappingException.wrapWithPath(m11397a(th2, deserializationContext), obj, str);
    }

    public FactoryBasedEnumDeserializer(Class<?> cls, AnnotatedMethod annotatedMethod) {
        super(cls);
        this._factory = annotatedMethod;
        this._hasArgs = false;
        this._inputType = null;
        this._deser = null;
        this._valueInstantiator = null;
        this._creatorProps = null;
    }

    public FactoryBasedEnumDeserializer(FactoryBasedEnumDeserializer factoryBasedEnumDeserializer, AbstractC6390e<?> abstractC6390e) {
        super(factoryBasedEnumDeserializer._valueClass);
        this._inputType = factoryBasedEnumDeserializer._inputType;
        this._factory = factoryBasedEnumDeserializer._factory;
        this._hasArgs = factoryBasedEnumDeserializer._hasArgs;
        this._valueInstantiator = factoryBasedEnumDeserializer._valueInstantiator;
        this._creatorProps = factoryBasedEnumDeserializer._creatorProps;
        this._deser = abstractC6390e;
    }
}
