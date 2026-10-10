package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.InterfaceC6358c;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.CompactStringObjectMap;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.IOException;
import java.util.Objects;
import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class EnumDeserializer extends StdScalarDeserializer<Object> implements InterfaceC6358c {
    private static final long serialVersionUID = 1;
    protected final Boolean _caseInsensitive;
    private final Enum<?> _enumDefaultValue;
    protected Object[] _enumsByIndex;
    protected final boolean _isFromIntValue;
    protected final CompactStringObjectMap _lookupByName;
    protected CompactStringObjectMap _lookupByToString;

    public EnumDeserializer(EnumResolver enumResolver, Boolean bool) {
        super(enumResolver.getEnumClass());
        this._lookupByName = enumResolver.constructLookup();
        this._enumsByIndex = enumResolver.getRawEnums();
        this._enumDefaultValue = enumResolver.getDefaultValue();
        this._caseInsensitive = bool;
        this._isFromIntValue = enumResolver.isFromIntValue();
    }

    @Deprecated
    public static AbstractC6390e<?> deserializerForCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod) {
        return deserializerForCreator(deserializationConfig, cls, annotatedMethod, null, null);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public boolean isCachable() {
        return true;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.EnumDeserializer$a */
    public static /* synthetic */ class C6383a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10346a;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f10346a = iArr;
            try {
                iArr[CoercionAction.AsNull.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10346a[CoercionAction.AsEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10346a[CoercionAction.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static AbstractC6390e<?> deserializerForCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        if (deserializationConfig.canOverrideAccessModifiers()) {
            C6490g.m11936g(annotatedMethod.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new FactoryBasedEnumDeserializer(cls, annotatedMethod, annotatedMethod.getParameterType(0), valueInstantiator, settableBeanPropertyArr);
    }

    public Object _deserializeOther(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return jsonParser.mo10890k0(JsonToken.START_ARRAY) ? _deserializeFromArray(jsonParser, deserializationContext) : deserializationContext.handleUnexpectedToken(_enumClass(), jsonParser);
    }

    public Object _fromString(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws IOException {
        Object objFind;
        CompactStringObjectMap compactStringObjectMap_getToStringLookup = deserializationContext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING) ? _getToStringLookup(deserializationContext) : this._lookupByName;
        Object objFind2 = compactStringObjectMap_getToStringLookup.find(str);
        if (objFind2 != null) {
            return objFind2;
        }
        String strTrim = str.trim();
        return (strTrim == str || (objFind = compactStringObjectMap_getToStringLookup.find(strTrim)) == null) ? m11395a(jsonParser, deserializationContext, compactStringObjectMap_getToStringLookup, strTrim) : objFind;
    }

    public CompactStringObjectMap _getToStringLookup(DeserializationContext deserializationContext) {
        CompactStringObjectMap compactStringObjectMapConstructLookup;
        CompactStringObjectMap compactStringObjectMap = this._lookupByToString;
        if (compactStringObjectMap != null) {
            return compactStringObjectMap;
        }
        synchronized (this) {
            compactStringObjectMapConstructLookup = EnumResolver.constructUsingToString(deserializationContext.getConfig(), _enumClass()).constructLookup();
        }
        this._lookupByToString = compactStringObjectMapConstructLookup;
        return compactStringObjectMapConstructLookup;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo10890k0(JsonToken.VALUE_STRING)) {
            return _fromString(jsonParser, deserializationContext, jsonParser.mo10869W());
        }
        if (jsonParser.mo10890k0(JsonToken.VALUE_NUMBER_INT)) {
            return this._isFromIntValue ? _fromString(jsonParser, deserializationContext, jsonParser.mo10869W()) : _fromInteger(jsonParser, deserializationContext, jsonParser.mo10860M());
        }
        return jsonParser.mo10900p0() ? _fromString(jsonParser, deserializationContext, deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass)) : _deserializeOther(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._enumDefaultValue;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.Enum;
    }

    public EnumDeserializer withResolved(Boolean bool) {
        return Objects.equals(this._caseInsensitive, bool) ? this : new EnumDeserializer(this, bool);
    }

    public static AbstractC6390e<?> deserializerForNoArgsCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod) {
        if (deserializationConfig.canOverrideAccessModifiers()) {
            C6490g.m11936g(annotatedMethod.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new FactoryBasedEnumDeserializer(cls, annotatedMethod);
    }

    public Class<?> _enumClass() {
        return handledType();
    }

    public Object _fromInteger(JsonParser jsonParser, DeserializationContext deserializationContext, int i11) throws IOException {
        EnumDeserializer enumDeserializer;
        DeserializationContext deserializationContext2;
        CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(logicalType(), handledType(), CoercionInputShape.Integer);
        if (coercionActionFindCoercionAction == CoercionAction.Fail) {
            if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                return deserializationContext.handleWeirdNumberValue(_enumClass(), Integer.valueOf(i11), "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
            }
            enumDeserializer = this;
            deserializationContext2 = deserializationContext;
            enumDeserializer._checkCoercionFail(deserializationContext2, coercionActionFindCoercionAction, handledType(), Integer.valueOf(i11), "Integer value (" + i11 + ")");
        } else {
            enumDeserializer = this;
            deserializationContext2 = deserializationContext;
        }
        int i12 = C6383a.f10346a[coercionActionFindCoercionAction.ordinal()];
        if (i12 == 1) {
            return null;
        }
        if (i12 != 2) {
            if (i11 >= 0) {
                Object[] objArr = enumDeserializer._enumsByIndex;
                if (i11 < objArr.length) {
                    return objArr[i11];
                }
            }
            if (enumDeserializer._enumDefaultValue != null && deserializationContext2.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return enumDeserializer._enumDefaultValue;
            }
            if (deserializationContext2.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return deserializationContext2.handleWeirdNumberValue(_enumClass(), Integer.valueOf(i11), "index value outside legal index range [0..%s]", Integer.valueOf(enumDeserializer._enumsByIndex.length - 1));
        }
        return getEmptyValue(deserializationContext2);
    }

    /* JADX INFO: renamed from: a */
    public final Object m11395a(JsonParser jsonParser, DeserializationContext deserializationContext, CompactStringObjectMap compactStringObjectMap, String str) throws IOException {
        char cCharAt;
        DeserializationContext deserializationContext2;
        CoercionAction coercionAction_checkCoercionFail;
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            if (this._enumDefaultValue != null && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return this._enumDefaultValue;
            }
            if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            if (str.isEmpty()) {
                deserializationContext2 = deserializationContext;
                coercionAction_checkCoercionFail = _checkCoercionFail(deserializationContext2, _findCoercionFromEmptyString(deserializationContext), handledType(), str, "empty String (\"\")");
            } else {
                deserializationContext2 = deserializationContext;
                coercionAction_checkCoercionFail = _checkCoercionFail(deserializationContext2, _findCoercionFromBlankString(deserializationContext2), handledType(), str, "blank String (all whitespace)");
            }
            int i11 = C6383a.f10346a[coercionAction_checkCoercionFail.ordinal()];
            if (i11 != 2 && i11 != 3) {
                return null;
            }
            return getEmptyValue(deserializationContext2);
        }
        if (Boolean.TRUE.equals(this._caseInsensitive)) {
            Object objFindCaseInsensitive = compactStringObjectMap.findCaseInsensitive(strTrim);
            if (objFindCaseInsensitive != null) {
                return objFindCaseInsensitive;
            }
        } else if (!deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS) && !this._isFromIntValue && (cCharAt = strTrim.charAt(0)) >= '0' && cCharAt <= '9') {
            try {
                int i12 = Integer.parseInt(strTrim);
                if (!deserializationContext.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
                    return deserializationContext.handleWeirdStringValue(_enumClass(), strTrim, "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use", new Object[0]);
                }
                if (i12 >= 0) {
                    Object[] objArr = this._enumsByIndex;
                    if (i12 < objArr.length) {
                        return objArr[i12];
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (this._enumDefaultValue != null && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
            return this._enumDefaultValue;
        }
        if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
            return null;
        }
        return deserializationContext.handleWeirdStringValue(_enumClass(), strTrim, "not one of the values accepted for Enum class: %s", compactStringObjectMap.keys());
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6358c
    public AbstractC6390e<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, handledType(), JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        if (boolFindFormatFeature == null) {
            boolFindFormatFeature = this._caseInsensitive;
        }
        return withResolved(boolFindFormatFeature);
    }

    public EnumDeserializer(EnumDeserializer enumDeserializer, Boolean bool) {
        super(enumDeserializer);
        this._lookupByName = enumDeserializer._lookupByName;
        this._enumsByIndex = enumDeserializer._enumsByIndex;
        this._enumDefaultValue = enumDeserializer._enumDefaultValue;
        this._caseInsensitive = bool;
        this._isFromIntValue = enumDeserializer._isFromIntValue;
    }

    @Deprecated
    public EnumDeserializer(EnumResolver enumResolver) {
        this(enumResolver, (Boolean) null);
    }
}
