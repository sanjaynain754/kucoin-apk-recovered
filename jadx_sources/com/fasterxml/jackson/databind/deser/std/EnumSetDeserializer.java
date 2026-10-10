package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.InterfaceC6358c;
import com.fasterxml.jackson.databind.deser.InterfaceC6375j;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes45.dex */
public class EnumSetDeserializer extends StdDeserializer<EnumSet<?>> implements InterfaceC6358c {
    private static final long serialVersionUID = 1;
    protected AbstractC6390e<Enum<?>> _enumDeserializer;
    protected final JavaType _enumType;
    protected final InterfaceC6375j _nullProvider;
    protected final boolean _skipNullValues;
    protected final Boolean _unwrapSingle;

    /* JADX WARN: Multi-variable type inference failed */
    public EnumSetDeserializer(JavaType javaType, AbstractC6390e<?> abstractC6390e) {
        super((Class<?>) EnumSet.class);
        this._enumType = javaType;
        if (javaType.isEnumType()) {
            this._enumDeserializer = abstractC6390e;
            this._unwrapSingle = null;
            this._nullProvider = null;
            this._skipNullValues = false;
            return;
        }
        throw new IllegalArgumentException("Type " + javaType + " not Java Enum type");
    }

    @Deprecated
    public EnumSetDeserializer withResolved(AbstractC6390e<?> abstractC6390e, Boolean bool) {
        return withResolved(abstractC6390e, this._nullProvider, bool);
    }

    /* JADX INFO: renamed from: a */
    public final EnumSet m11396a() {
        return EnumSet.noneOf(this._enumType.getRawClass());
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6358c
    public AbstractC6390e<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, EnumSet.class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        AbstractC6390e<Enum<?>> abstractC6390e = this._enumDeserializer;
        AbstractC6390e<?> abstractC6390eFindContextualValueDeserializer = abstractC6390e == null ? deserializationContext.findContextualValueDeserializer(this._enumType, beanProperty) : deserializationContext.handleSecondaryContextualization(abstractC6390e, beanProperty, this._enumType);
        return withResolved(abstractC6390eFindContextualValueDeserializer, findContentNullProvider(deserializationContext, beanProperty, abstractC6390eFindContextualValueDeserializer), boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    public EnumSet<?> handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet enumSet) throws IOException {
        Boolean bool = this._unwrapSingle;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (EnumSet) deserializationContext.handleUnexpectedToken(EnumSet.class, jsonParser);
        }
        if (jsonParser.mo10890k0(JsonToken.VALUE_NULL)) {
            return (EnumSet) deserializationContext.handleUnexpectedToken(this._enumType, jsonParser);
        }
        try {
            Enum<?> enumDeserialize = this._enumDeserializer.deserialize(jsonParser, deserializationContext);
            if (enumDeserialize == null) {
                return enumSet;
            }
            enumSet.add(enumDeserialize);
            return enumSet;
        } catch (Exception e11) {
            throw JsonMappingException.wrapWithPath(e11, enumSet, enumSet.size());
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public boolean isCachable() {
        return this._enumType.getValueHandler() == null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.Collection;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public EnumSetDeserializer withDeserializer(AbstractC6390e<?> abstractC6390e) {
        return this._enumDeserializer == abstractC6390e ? this : new EnumSetDeserializer(this, abstractC6390e, this._nullProvider, this._unwrapSingle);
    }

    public EnumSetDeserializer withResolved(AbstractC6390e<?> abstractC6390e, InterfaceC6375j interfaceC6375j, Boolean bool) {
        return (Objects.equals(this._unwrapSingle, bool) && this._enumDeserializer == abstractC6390e && this._nullProvider == abstractC6390e) ? this : new EnumSetDeserializer(this, abstractC6390e, interfaceC6375j, bool);
    }

    public final EnumSet<?> _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet enumSet) throws IOException {
        Enum<?> enumDeserialize;
        while (true) {
            try {
                JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
                if (jsonTokenMo10905t0 != JsonToken.END_ARRAY) {
                    if (jsonTokenMo10905t0 == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            enumDeserialize = (Enum) this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else {
                        enumDeserialize = this._enumDeserializer.deserialize(jsonParser, deserializationContext);
                    }
                    if (enumDeserialize != null) {
                        enumSet.add(enumDeserialize);
                    }
                } else {
                    return enumSet;
                }
            } catch (Exception e11) {
                throw JsonMappingException.wrapWithPath(e11, enumSet, enumSet.size());
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public EnumSet<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        EnumSet enumSetM11396a = m11396a();
        if (!jsonParser.mo10898o0()) {
            return handleNonArray(jsonParser, deserializationContext, enumSetM11396a);
        }
        return _deserialize(jsonParser, deserializationContext, enumSetM11396a);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        return abstractC6428b.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return m11396a();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public EnumSet<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet<?> enumSet) throws IOException {
        if (!jsonParser.mo10898o0()) {
            return handleNonArray(jsonParser, deserializationContext, enumSet);
        }
        return _deserialize(jsonParser, deserializationContext, enumSet);
    }

    @Deprecated
    public EnumSetDeserializer(EnumSetDeserializer enumSetDeserializer, AbstractC6390e<?> abstractC6390e, Boolean bool) {
        this(enumSetDeserializer, abstractC6390e, enumSetDeserializer._nullProvider, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EnumSetDeserializer(EnumSetDeserializer enumSetDeserializer, AbstractC6390e<?> abstractC6390e, InterfaceC6375j interfaceC6375j, Boolean bool) {
        super(enumSetDeserializer);
        this._enumType = enumSetDeserializer._enumType;
        this._enumDeserializer = abstractC6390e;
        this._nullProvider = interfaceC6375j;
        this._skipNullValues = NullsConstantProvider.isSkipper(interfaceC6375j);
        this._unwrapSingle = bool;
    }
}
