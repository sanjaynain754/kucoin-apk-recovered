package com.fasterxml.jackson.databind.deser.std;

import androidx.credentials.provider.CredentialEntry;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.p062io.C6313g;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AbstractC6394i;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.InterfaceC6375j;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.InterfaceC6491h;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
public abstract class StdDeserializer<T> extends AbstractC6390e<T> implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Class<?> _valueClass;
    protected final JavaType _valueType;
    protected static final int F_MASK_INT_COERCIONS = DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.getMask() | DeserializationFeature.USE_LONG_FOR_INTS.getMask();

    @Deprecated
    protected static final int F_MASK_ACCEPT_ARRAYS = DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS.getMask() | DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT.getMask();

    public StdDeserializer(Class<?> cls) {
        this._valueClass = cls;
        this._valueType = null;
    }

    public CoercionAction _checkFromStringCoercion(DeserializationContext deserializationContext, String str) throws IOException {
        return _checkFromStringCoercion(deserializationContext, str, logicalType(), handledType());
    }

    public boolean _isFalse(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'f') {
            return CredentialEntry.FALSE_STRING.equals(str);
        }
        if (cCharAt == 'F') {
            return "FALSE".equals(str) || "False".equals(str);
        }
        return false;
    }

    public boolean _isTrue(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 't') {
            return CredentialEntry.TRUE_STRING.equals(str);
        }
        if (cCharAt == 'T') {
            return "TRUE".equals(str) || "True".equals(str);
        }
        return false;
    }

    @Deprecated
    public final boolean _parseBooleanPrimitive(DeserializationContext deserializationContext, JsonParser jsonParser, Class<?> cls) throws IOException {
        return _parseBooleanPrimitive(jsonParser, deserializationContext);
    }

    public Date _parseDate(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strExtractScalarFromObject;
        long jLongValue;
        int iMo10891l = jsonParser.mo10891l();
        if (iMo10891l == 1) {
            strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
        } else {
            if (iMo10891l == 3) {
                return _parseDateFromArray(jsonParser, deserializationContext);
            }
            if (iMo10891l == 11) {
                return (Date) getNullValue(deserializationContext);
            }
            if (iMo10891l != 6) {
                if (iMo10891l != 7) {
                    return (Date) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
                }
                try {
                    jLongValue = jsonParser.mo10861O();
                } catch (StreamReadException unused) {
                    jLongValue = ((Number) deserializationContext.handleWeirdNumberValue(this._valueClass, jsonParser.mo10863Q(), "not a valid 64-bit `long` for creating `java.util.Date`", new Object[0])).longValue();
                }
                return new Date(jLongValue);
            }
            strExtractScalarFromObject = jsonParser.mo10869W();
        }
        return _parseDate(strExtractScalarFromObject.trim(), deserializationContext);
    }

    public final double _parseDoublePrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strExtractScalarFromObject;
        int iMo10891l = jsonParser.mo10891l();
        Class<?> cls = Double.TYPE;
        if (iMo10891l != 1) {
            if (iMo10891l != 3) {
                if (iMo10891l == 11) {
                    _verifyNullForPrimitive(deserializationContext);
                    return 0.0d;
                }
                if (iMo10891l == 6) {
                    strExtractScalarFromObject = jsonParser.mo10869W();
                } else if (iMo10891l == 7 || iMo10891l == 8) {
                    return jsonParser.mo10857E();
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jsonParser.mo10905t0() == JsonToken.START_ARRAY) {
                    return ((Double) handleNestedArrayForSingle(jsonParser, deserializationContext)).doubleValue();
                }
                double d_parseDoublePrimitive = _parseDoublePrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return d_parseDoublePrimitive;
            }
            return ((Number) deserializationContext.handleUnexpectedToken(cls, jsonParser)).doubleValue();
        }
        strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        Double d_checkDoubleSpecialValue = _checkDoubleSpecialValue(strExtractScalarFromObject);
        if (d_checkDoubleSpecialValue != null) {
            return d_checkDoubleSpecialValue.doubleValue();
        }
        CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject, LogicalType.Integer, cls);
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return 0.0d;
        }
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return 0.0d;
        }
        String strTrim = strExtractScalarFromObject.trim();
        if (!_hasTextualNull(strTrim)) {
            return _parseDoublePrimitive(deserializationContext, strTrim);
        }
        _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
        return 0.0d;
    }

    public final float _parseFloatPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strExtractScalarFromObject;
        int iMo10891l = jsonParser.mo10891l();
        Class<?> cls = Float.TYPE;
        if (iMo10891l != 1) {
            if (iMo10891l != 3) {
                if (iMo10891l == 11) {
                    _verifyNullForPrimitive(deserializationContext);
                    return 0.0f;
                }
                if (iMo10891l == 6) {
                    strExtractScalarFromObject = jsonParser.mo10869W();
                } else if (iMo10891l == 7 || iMo10891l == 8) {
                    return jsonParser.mo10859L();
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jsonParser.mo10905t0() == JsonToken.START_ARRAY) {
                    return ((Float) handleNestedArrayForSingle(jsonParser, deserializationContext)).floatValue();
                }
                float f_parseFloatPrimitive = _parseFloatPrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return f_parseFloatPrimitive;
            }
            return ((Number) deserializationContext.handleUnexpectedToken(cls, jsonParser)).floatValue();
        }
        strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        Float f_checkFloatSpecialValue = _checkFloatSpecialValue(strExtractScalarFromObject);
        if (f_checkFloatSpecialValue != null) {
            return f_checkFloatSpecialValue.floatValue();
        }
        CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject, LogicalType.Integer, cls);
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return 0.0f;
        }
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return 0.0f;
        }
        String strTrim = strExtractScalarFromObject.trim();
        if (!_hasTextualNull(strTrim)) {
            return _parseFloatPrimitive(deserializationContext, strTrim);
        }
        _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
        return 0.0f;
    }

    public final int _parseIntPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strExtractScalarFromObject;
        int iMo10891l = jsonParser.mo10891l();
        Class<?> cls = Integer.TYPE;
        if (iMo10891l != 1) {
            if (iMo10891l != 3) {
                if (iMo10891l == 11) {
                    _verifyNullForPrimitive(deserializationContext);
                    return 0;
                }
                if (iMo10891l == 6) {
                    strExtractScalarFromObject = jsonParser.mo10869W();
                } else {
                    if (iMo10891l == 7) {
                        return jsonParser.mo10860M();
                    }
                    if (iMo10891l == 8) {
                        CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, cls);
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull || coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return 0;
                        }
                        return jsonParser.mo10877c0();
                    }
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jsonParser.mo10905t0() == JsonToken.START_ARRAY) {
                    return ((Integer) handleNestedArrayForSingle(jsonParser, deserializationContext)).intValue();
                }
                int i_parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return i_parseIntPrimitive;
            }
            return ((Number) deserializationContext.handleUnexpectedToken(cls, jsonParser)).intValue();
        }
        strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject, LogicalType.Integer, cls);
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return 0;
        }
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return 0;
        }
        String strTrim = strExtractScalarFromObject.trim();
        if (!_hasTextualNull(strTrim)) {
            return _parseIntPrimitive(deserializationContext, strTrim);
        }
        _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
        return 0;
    }

    public final Integer _parseInteger(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        String strExtractScalarFromObject;
        int iMo10891l = jsonParser.mo10891l();
        if (iMo10891l == 1) {
            strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        } else {
            if (iMo10891l == 3) {
                return (Integer) _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (iMo10891l == 11) {
                return (Integer) getNullValue(deserializationContext);
            }
            if (iMo10891l != 6) {
                if (iMo10891l == 7) {
                    return Integer.valueOf(jsonParser.mo10860M());
                }
                if (iMo10891l != 8) {
                    return (Integer) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, cls);
                if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull) {
                    return (Integer) getNullValue(deserializationContext);
                }
                return coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty ? (Integer) getEmptyValue(deserializationContext) : Integer.valueOf(jsonParser.mo10877c0());
            }
            strExtractScalarFromObject = jsonParser.mo10869W();
        }
        CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
            return (Integer) getNullValue(deserializationContext);
        }
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return (Integer) getEmptyValue(deserializationContext);
        }
        String strTrim = strExtractScalarFromObject.trim();
        return _checkTextualNull(deserializationContext, strTrim) ? (Integer) getNullValue(deserializationContext) : _parseInteger(deserializationContext, strTrim);
    }

    public final Long _parseLong(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        String strExtractScalarFromObject;
        int iMo10891l = jsonParser.mo10891l();
        if (iMo10891l == 1) {
            strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        } else {
            if (iMo10891l == 3) {
                return (Long) _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (iMo10891l == 11) {
                return (Long) getNullValue(deserializationContext);
            }
            if (iMo10891l != 6) {
                if (iMo10891l == 7) {
                    return Long.valueOf(jsonParser.mo10861O());
                }
                if (iMo10891l != 8) {
                    return (Long) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, cls);
                if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull) {
                    return (Long) getNullValue(deserializationContext);
                }
                return coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty ? (Long) getEmptyValue(deserializationContext) : Long.valueOf(jsonParser.mo10879e0());
            }
            strExtractScalarFromObject = jsonParser.mo10869W();
        }
        CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
            return (Long) getNullValue(deserializationContext);
        }
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return (Long) getEmptyValue(deserializationContext);
        }
        String strTrim = strExtractScalarFromObject.trim();
        return _checkTextualNull(deserializationContext, strTrim) ? (Long) getNullValue(deserializationContext) : _parseLong(deserializationContext, strTrim);
    }

    public final long _parseLongPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strExtractScalarFromObject;
        int iMo10891l = jsonParser.mo10891l();
        Class<?> cls = Long.TYPE;
        if (iMo10891l != 1) {
            if (iMo10891l != 3) {
                if (iMo10891l == 11) {
                    _verifyNullForPrimitive(deserializationContext);
                    return 0L;
                }
                if (iMo10891l == 6) {
                    strExtractScalarFromObject = jsonParser.mo10869W();
                } else {
                    if (iMo10891l == 7) {
                        return jsonParser.mo10861O();
                    }
                    if (iMo10891l == 8) {
                        CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, cls);
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull || coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return 0L;
                        }
                        return jsonParser.mo10879e0();
                    }
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jsonParser.mo10905t0() == JsonToken.START_ARRAY) {
                    return ((Long) handleNestedArrayForSingle(jsonParser, deserializationContext)).longValue();
                }
                long j_parseLongPrimitive = _parseLongPrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return j_parseLongPrimitive;
            }
            return ((Number) deserializationContext.handleUnexpectedToken(cls, jsonParser)).longValue();
        }
        strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject, LogicalType.Integer, cls);
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return 0L;
        }
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return 0L;
        }
        String strTrim = strExtractScalarFromObject.trim();
        if (!_hasTextualNull(strTrim)) {
            return _parseLongPrimitive(deserializationContext, strTrim);
        }
        _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
        return 0L;
    }

    public ValueInstantiator getValueInstantiator() {
        return null;
    }

    public JavaType getValueType() {
        return this._valueType;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.StdDeserializer$a */
    public static /* synthetic */ class C6387a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10358a;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f10358a = iArr;
            try {
                iArr[CoercionAction.AsEmpty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10358a[CoercionAction.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10358a[CoercionAction.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10358a[CoercionAction.Fail.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final boolean _neitherNull(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    public static final double _parseDouble(String str) throws NumberFormatException {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_NORMAL;
        }
        return Double.parseDouble(str);
    }

    public final boolean _byteOverflow(int i11) {
        return i11 < -128 || i11 > 255;
    }

    public CoercionAction _checkCoercionFail(DeserializationContext deserializationContext, CoercionAction coercionAction, Class<?> cls, Object obj, String str) throws IOException {
        if (coercionAction == CoercionAction.Fail) {
            deserializationContext.reportBadCoercion(this, cls, obj, "Cannot coerce %s to %s (but could if coercion was enabled using `CoercionConfig`)", str, _coercedTypeDesc());
        }
        return coercionAction;
    }

    public CoercionAction _checkFloatToIntCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(LogicalType.Integer, cls, CoercionInputShape.Float);
        if (coercionActionFindCoercionAction != CoercionAction.Fail) {
            return coercionActionFindCoercionAction;
        }
        return _checkCoercionFail(deserializationContext, coercionActionFindCoercionAction, cls, jsonParser.mo10863Q(), "Floating-point value (" + jsonParser.mo10869W() + ")");
    }

    public CoercionAction _checkFromStringCoercion(DeserializationContext deserializationContext, String str, LogicalType logicalType, Class<?> cls) throws IOException {
        if (str.isEmpty()) {
            return _checkCoercionFail(deserializationContext, deserializationContext.findCoercionAction(logicalType, cls, CoercionInputShape.EmptyString), cls, str, "empty String (\"\")");
        }
        if (_isBlank(str)) {
            return _checkCoercionFail(deserializationContext, deserializationContext.findCoercionFromBlankString(logicalType, cls, CoercionAction.Fail), cls, str, "blank String (all whitespace)");
        }
        if (deserializationContext.isEnabled(StreamReadCapability.UNTYPED_SCALARS)) {
            return CoercionAction.TryConvert;
        }
        CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(logicalType, cls, CoercionInputShape.String);
        if (coercionActionFindCoercionAction == CoercionAction.Fail) {
            deserializationContext.reportInputMismatch(this, "Cannot coerce String value (\"%s\") to %s (but might if coercion using `CoercionConfig` was enabled)", str, _coercedTypeDesc());
        }
        return coercionActionFindCoercionAction;
    }

    public Boolean _coerceBooleanFromInt(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(LogicalType.Boolean, cls, CoercionInputShape.Integer);
        int i11 = C6387a.f10358a[coercionActionFindCoercionAction.ordinal()];
        if (i11 == 1) {
            return Boolean.FALSE;
        }
        if (i11 == 2) {
            return null;
        }
        if (i11 != 4) {
            if (jsonParser.mo10862P() == JsonParser.NumberType.INT) {
                return Boolean.valueOf(jsonParser.mo10860M() != 0);
            }
            return Boolean.valueOf(!"0".equals(jsonParser.mo10869W()));
        }
        _checkCoercionFail(deserializationContext, coercionActionFindCoercionAction, cls, jsonParser.mo10863Q(), "Integer value (" + jsonParser.mo10869W() + ")");
        return Boolean.FALSE;
    }

    @Deprecated
    public Object _coerceEmptyString(DeserializationContext deserializationContext, boolean z11) throws JsonMappingException {
        boolean z12;
        DeserializationFeature deserializationFeature;
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature)) {
            if (z11) {
                DeserializationFeature deserializationFeature2 = DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
                if (deserializationContext.isEnabled(deserializationFeature2)) {
                    z12 = false;
                    deserializationFeature = deserializationFeature2;
                }
            }
            return getNullValue(deserializationContext);
        }
        z12 = true;
        deserializationFeature = mapperFeature;
        _reportFailedNullCoerce(deserializationContext, z12, deserializationFeature, "empty String (\"\")");
        return null;
    }

    public Object _coerceIntegral(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
            return jsonParser.mo10895n();
        }
        return deserializationContext.isEnabled(DeserializationFeature.USE_LONG_FOR_INTS) ? Long.valueOf(jsonParser.mo10861O()) : jsonParser.mo10863Q();
    }

    @Deprecated
    public Object _coerceNullToken(DeserializationContext deserializationContext, boolean z11) throws JsonMappingException {
        if (z11) {
            _verifyNullForPrimitive(deserializationContext);
        }
        return getNullValue(deserializationContext);
    }

    @Deprecated
    public Object _coerceTextualNull(DeserializationContext deserializationContext, boolean z11) throws JsonMappingException {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (!deserializationContext.isEnabled(mapperFeature)) {
            _reportFailedNullCoerce(deserializationContext, true, mapperFeature, "String \"null\"");
        }
        return getNullValue(deserializationContext);
    }

    @Deprecated
    public T _deserializeFromEmpty(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.mo10890k0(JsonToken.START_ARRAY) || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
            return (T) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
        }
        if (jsonParser.mo10905t0() == JsonToken.END_ARRAY) {
            return null;
        }
        return (T) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
    }

    public Object _deserializeFromEmptyString(JsonParser jsonParser, DeserializationContext deserializationContext, CoercionAction coercionAction, Class<?> cls, String str) throws IOException {
        int i11 = C6387a.f10358a[coercionAction.ordinal()];
        if (i11 == 1) {
            return getEmptyValue(deserializationContext);
        }
        if (i11 != 4) {
            return null;
        }
        _checkCoercionFail(deserializationContext, coercionAction, cls, "", "empty String (\"\")");
        return null;
    }

    public T _deserializeWrappedValue(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return jsonParser.mo10890k0(JsonToken.START_ARRAY) ? (T) handleNestedArrayForSingle(jsonParser, deserializationContext) : deserialize(jsonParser, deserializationContext);
    }

    public final InterfaceC6375j _findNullProvider(DeserializationContext deserializationContext, BeanProperty beanProperty, Nulls nulls, AbstractC6390e<?> abstractC6390e) throws JsonMappingException {
        if (nulls == Nulls.FAIL) {
            if (beanProperty == null) {
                return NullsFailProvider.constructForRootValue(deserializationContext.constructType(abstractC6390e == null ? Object.class : abstractC6390e.handledType()));
            }
            return NullsFailProvider.constructForProperty(beanProperty);
        }
        if (nulls != Nulls.AS_EMPTY) {
            if (nulls == Nulls.SKIP) {
                return NullsConstantProvider.skipper();
            }
            return null;
        }
        if (abstractC6390e == null) {
            return null;
        }
        if (abstractC6390e instanceof BeanDeserializerBase) {
            BeanDeserializerBase beanDeserializerBase = (BeanDeserializerBase) abstractC6390e;
            if (!beanDeserializerBase.getValueInstantiator().canCreateUsingDefault()) {
                JavaType valueType = beanProperty == null ? beanDeserializerBase.getValueType() : beanProperty.getType();
                return (InterfaceC6375j) deserializationContext.reportBadDefinition(valueType, String.format("Cannot create empty instance of %s, no default Creator", valueType));
            }
        }
        AccessPattern emptyAccessPattern = abstractC6390e.getEmptyAccessPattern();
        if (emptyAccessPattern == AccessPattern.ALWAYS_NULL) {
            return NullsConstantProvider.nuller();
        }
        return emptyAccessPattern == AccessPattern.CONSTANT ? NullsConstantProvider.forValue(abstractC6390e.getEmptyValue(deserializationContext)) : new NullsAsEmptyProvider(abstractC6390e);
    }

    public boolean _hasTextualNull(String str) {
        return "null".equals(str);
    }

    public final boolean _isNaN(String str) {
        return "NaN".equals(str);
    }

    public final boolean _isNegInf(String str) {
        return "-Infinity".equals(str) || "-INF".equals(str);
    }

    public final boolean _isPosInf(String str) {
        return "Infinity".equals(str) || "INF".equals(str);
    }

    public Number _nonNullNumber(Number number) {
        if (number == null) {
            return 0;
        }
        return number;
    }

    public final boolean _parseBooleanPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strExtractScalarFromObject;
        int iMo10891l = jsonParser.mo10891l();
        Class<?> cls = Boolean.TYPE;
        if (iMo10891l != 1) {
            if (iMo10891l != 3) {
                if (iMo10891l == 6) {
                    strExtractScalarFromObject = jsonParser.mo10869W();
                } else {
                    if (iMo10891l == 7) {
                        return Boolean.TRUE.equals(_coerceBooleanFromInt(jsonParser, deserializationContext, cls));
                    }
                    switch (iMo10891l) {
                        case 9:
                            return true;
                        case 11:
                            _verifyNullForPrimitive(deserializationContext);
                        case 10:
                            return false;
                    }
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jsonParser.mo10905t0() == JsonToken.START_ARRAY) {
                    return ((Boolean) handleNestedArrayForSingle(jsonParser, deserializationContext)).booleanValue();
                }
                boolean z_parseBooleanPrimitive = _parseBooleanPrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return z_parseBooleanPrimitive;
            }
            return ((Boolean) deserializationContext.handleUnexpectedToken(cls, jsonParser)).booleanValue();
        }
        strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject, LogicalType.Boolean, cls);
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return false;
        }
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return false;
        }
        String strTrim = strExtractScalarFromObject.trim();
        int length = strTrim.length();
        if (length == 4) {
            if (_isTrue(strTrim)) {
                return true;
            }
        } else if (length == 5 && _isFalse(strTrim)) {
            return false;
        }
        if (_hasTextualNull(strTrim)) {
            _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
            return false;
        }
        return Boolean.TRUE.equals((Boolean) deserializationContext.handleWeirdStringValue(cls, strTrim, "only \"true\"/\"True\"/\"TRUE\" or \"false\"/\"False\"/\"FALSE\" recognized", new Object[0]));
    }

    public final String _parseString(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo10890k0(JsonToken.VALUE_STRING)) {
            return jsonParser.mo10869W();
        }
        if (!jsonParser.mo10890k0(JsonToken.VALUE_EMBEDDED_OBJECT)) {
            if (jsonParser.mo10890k0(JsonToken.START_OBJECT)) {
                return deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            }
            String strMo10882g0 = jsonParser.mo10882g0();
            return strMo10882g0 != null ? strMo10882g0 : (String) deserializationContext.handleUnexpectedToken(String.class, jsonParser);
        }
        Object objMo10858J = jsonParser.mo10858J();
        if (objMo10858J instanceof byte[]) {
            return deserializationContext.getBase64Variant().encode((byte[]) objMo10858J, false);
        }
        if (objMo10858J == null) {
            return null;
        }
        return objMo10858J.toString();
    }

    public void _reportFailedNullCoerce(DeserializationContext deserializationContext, boolean z11, Enum<?> r11, String str) throws JsonMappingException {
        deserializationContext.reportInputMismatch(this, "Cannot coerce %s to Null value as %s (%s `%s.%s` to allow)", str, _coercedTypeDesc(), z11 ? BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE : "disable", r11.getDeclaringClass().getSimpleName(), r11.name());
    }

    public final boolean _shortOverflow(int i11) {
        return i11 < -32768 || i11 > 32767;
    }

    public final void _verifyNullForPrimitive(DeserializationContext deserializationContext) throws JsonMappingException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            deserializationContext.reportInputMismatch(this, "Cannot coerce `null` to %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", _coercedTypeDesc());
        }
    }

    public final void _verifyNullForPrimitiveCoercion(DeserializationContext deserializationContext, String str) throws JsonMappingException {
        boolean z11;
        DeserializationFeature deserializationFeature;
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature)) {
            DeserializationFeature deserializationFeature2 = DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
            if (!deserializationContext.isEnabled(deserializationFeature2)) {
                return;
            }
            z11 = false;
            deserializationFeature = deserializationFeature2;
        } else {
            z11 = true;
            deserializationFeature = mapperFeature;
        }
        _reportFailedNullCoerce(deserializationContext, z11, deserializationFeature, str.isEmpty() ? "empty String (\"\")" : String.format("String \"%s\"", str));
    }

    @Deprecated
    public final void _verifyNullForScalarCoercion(DeserializationContext deserializationContext, String str) throws JsonMappingException {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature)) {
            return;
        }
        _reportFailedNullCoerce(deserializationContext, true, mapperFeature, str.isEmpty() ? "empty String (\"\")" : String.format("String \"%s\"", str));
    }

    @Deprecated
    public void _verifyNumberForScalarCoercion(DeserializationContext deserializationContext, JsonParser jsonParser) throws IOException {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature)) {
            return;
        }
        deserializationContext.reportInputMismatch(this, "Cannot coerce Number (%s) to %s (enable `%s.%s` to allow)", jsonParser.mo10869W(), _coercedTypeDesc(), mapperFeature.getDeclaringClass().getSimpleName(), mapperFeature.name());
    }

    @Deprecated
    public void _verifyStringForScalarCoercion(DeserializationContext deserializationContext, String str) throws JsonMappingException {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature)) {
            return;
        }
        deserializationContext.reportInputMismatch(this, "Cannot coerce String \"%s\" to %s (enable `%s.%s` to allow)", str, _coercedTypeDesc(), mapperFeature.getDeclaringClass().getSimpleName(), mapperFeature.name());
    }

    public Nulls findContentNullStyle(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        return beanProperty != null ? beanProperty.getMetadata().getContentNulls() : deserializationContext.getConfig().getDefaultSetterInfo().getContentNulls();
    }

    public JsonFormat.Value findFormatOverrides(DeserializationContext deserializationContext, BeanProperty beanProperty, Class<?> cls) {
        return beanProperty != null ? beanProperty.findPropertyFormat(deserializationContext.getConfig(), cls) : deserializationContext.getDefaultPropertyFormat(cls);
    }

    public final InterfaceC6375j findValueNullProvider(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, PropertyMetadata propertyMetadata) throws JsonMappingException {
        if (settableBeanProperty != null) {
            return _findNullProvider(deserializationContext, settableBeanProperty, propertyMetadata.getValueNulls(), settableBeanProperty.getValueDeserializer());
        }
        return null;
    }

    @Deprecated
    public final Class<?> getValueClass() {
        return this._valueClass;
    }

    public JavaType getValueType(DeserializationContext deserializationContext) {
        JavaType javaType = this._valueType;
        return javaType != null ? javaType : deserializationContext.constructType(this._valueClass);
    }

    public void handleMissingEndArrayForSingle(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        deserializationContext.reportWrongTokenException(this, JsonToken.END_ARRAY, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", handledType().getName());
    }

    public Object handleNestedArrayForSingle(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser.mo10889k(), jsonParser, String.format("Cannot deserialize instance of %s out of %s token: nested Arrays not allowed with %s", C6490g.m11921X(this._valueClass), JsonToken.START_ARRAY, "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS"), new Object[0]);
    }

    public void handleUnknownProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (obj == null) {
            obj = handledType();
        }
        if (deserializationContext.handleUnknownProperty(jsonParser, this, obj, str)) {
            return;
        }
        jsonParser.mo10856C0();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Class<?> handledType() {
        return this._valueClass;
    }

    public static final boolean _isBlank(String str) {
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) > ' ') {
                return false;
            }
        }
        return true;
    }

    public Double _checkDoubleSpecialValue(String str) {
        if (!str.isEmpty()) {
            char cCharAt = str.charAt(0);
            if (cCharAt != '-') {
                if (cCharAt != 'I') {
                    if (cCharAt == 'N' && _isNaN(str)) {
                        return Double.valueOf(Double.NaN);
                    }
                    return null;
                }
                if (_isPosInf(str)) {
                    return Double.valueOf(Double.POSITIVE_INFINITY);
                }
                return null;
            }
            if (_isNegInf(str)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            return null;
        }
        return null;
    }

    public Float _checkFloatSpecialValue(String str) {
        if (!str.isEmpty()) {
            char cCharAt = str.charAt(0);
            if (cCharAt != '-') {
                if (cCharAt != 'I') {
                    if (cCharAt == 'N' && _isNaN(str)) {
                        return Float.valueOf(Float.NaN);
                    }
                    return null;
                }
                if (_isPosInf(str)) {
                    return Float.valueOf(Float.POSITIVE_INFINITY);
                }
                return null;
            }
            if (_isNegInf(str)) {
                return Float.valueOf(Float.NEGATIVE_INFINITY);
            }
            return null;
        }
        return null;
    }

    public boolean _checkTextualNull(DeserializationContext deserializationContext, String str) throws JsonMappingException {
        if (_hasTextualNull(str)) {
            MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
            if (!deserializationContext.isEnabled(mapperFeature)) {
                _reportFailedNullCoerce(deserializationContext, true, mapperFeature, "String \"null\"");
            }
            return true;
        }
        return false;
    }

    public String _coercedTypeDesc() {
        String strM11963y;
        JavaType valueType = getValueType();
        boolean z11 = true;
        if (valueType != null && !valueType.isPrimitive()) {
            if (!valueType.isContainerType() && !valueType.isReferenceType()) {
                z11 = false;
            }
            strM11963y = C6490g.m11904G(valueType);
        } else {
            Class<?> clsHandledType = handledType();
            if (!clsHandledType.isArray() && !Collection.class.isAssignableFrom(clsHandledType) && !Map.class.isAssignableFrom(clsHandledType)) {
                z11 = false;
            }
            strM11963y = C6490g.m11963y(clsHandledType);
        }
        if (z11) {
            return "element of " + strM11963y;
        }
        return strM11963y + " value";
    }

    public T _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        CoercionAction coercionAction_findCoercionFromEmptyArray = _findCoercionFromEmptyArray(deserializationContext);
        boolean zIsEnabled = deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zIsEnabled || coercionAction_findCoercionFromEmptyArray != CoercionAction.Fail) {
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenMo10905t0 == jsonToken) {
                int i11 = C6387a.f10358a[coercionAction_findCoercionFromEmptyArray.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2 || i11 == 3) {
                        return getNullValue(deserializationContext);
                    }
                } else {
                    return (T) getEmptyValue(deserializationContext);
                }
            } else if (zIsEnabled) {
                T t_deserializeWrappedValue = _deserializeWrappedValue(jsonParser, deserializationContext);
                if (jsonParser.mo10905t0() != jsonToken) {
                    handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                }
                return t_deserializeWrappedValue;
            }
        }
        return (T) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), JsonToken.START_ARRAY, jsonParser, (String) null, new Object[0]);
    }

    public T _deserializeFromString(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ValueInstantiator valueInstantiator = getValueInstantiator();
        Class<?> clsHandledType = handledType();
        String strMo10882g0 = jsonParser.mo10882g0();
        if (valueInstantiator != null && valueInstantiator.canCreateFromString()) {
            return (T) valueInstantiator.createFromString(deserializationContext, strMo10882g0);
        }
        if (strMo10882g0.isEmpty()) {
            return (T) _deserializeFromEmptyString(jsonParser, deserializationContext, deserializationContext.findCoercionAction(logicalType(), clsHandledType, CoercionInputShape.EmptyString), clsHandledType, "empty String (\"\")");
        }
        if (_isBlank(strMo10882g0)) {
            return (T) _deserializeFromEmptyString(jsonParser, deserializationContext, deserializationContext.findCoercionFromBlankString(logicalType(), clsHandledType, CoercionAction.Fail), clsHandledType, "blank String (all whitespace)");
        }
        if (valueInstantiator != null) {
            strMo10882g0 = strMo10882g0.trim();
            if (valueInstantiator.canCreateFromInt() && deserializationContext.findCoercionAction(LogicalType.Integer, Integer.class, CoercionInputShape.String) == CoercionAction.TryConvert) {
                return (T) valueInstantiator.createFromInt(deserializationContext, _parseIntPrimitive(deserializationContext, strMo10882g0));
            }
            if (valueInstantiator.canCreateFromLong() && deserializationContext.findCoercionAction(LogicalType.Integer, Long.class, CoercionInputShape.String) == CoercionAction.TryConvert) {
                return (T) valueInstantiator.createFromLong(deserializationContext, _parseLongPrimitive(deserializationContext, strMo10882g0));
            }
            if (valueInstantiator.canCreateFromBoolean() && deserializationContext.findCoercionAction(LogicalType.Boolean, Boolean.class, CoercionInputShape.String) == CoercionAction.TryConvert) {
                String strTrim = strMo10882g0.trim();
                if (CredentialEntry.TRUE_STRING.equals(strTrim)) {
                    return (T) valueInstantiator.createFromBoolean(deserializationContext, true);
                }
                if (CredentialEntry.FALSE_STRING.equals(strTrim)) {
                    return (T) valueInstantiator.createFromBoolean(deserializationContext, false);
                }
            }
        }
        return (T) deserializationContext.handleMissingInstantiator(clsHandledType, valueInstantiator, deserializationContext.getParser(), "no String-argument constructor/factory method to deserialize from String value ('%s')", strMo10882g0);
    }

    @Deprecated
    public void _failDoubleToIntCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws IOException {
        deserializationContext.reportInputMismatch(handledType(), "Cannot coerce a floating-point value ('%s') into %s (enable `DeserializationFeature.ACCEPT_FLOAT_AS_INT` to allow)", jsonParser.mo10882g0(), str);
    }

    public CoercionAction _findCoercionFromBlankString(DeserializationContext deserializationContext) {
        return deserializationContext.findCoercionFromBlankString(logicalType(), handledType(), CoercionAction.Fail);
    }

    public CoercionAction _findCoercionFromEmptyArray(DeserializationContext deserializationContext) {
        return deserializationContext.findCoercionAction(logicalType(), handledType(), CoercionInputShape.EmptyArray);
    }

    public CoercionAction _findCoercionFromEmptyString(DeserializationContext deserializationContext) {
        return deserializationContext.findCoercionAction(logicalType(), handledType(), CoercionInputShape.EmptyString);
    }

    public final boolean _intOverflow(long j11) {
        if (j11 >= -2147483648L && j11 <= 2147483647L) {
            return false;
        }
        return true;
    }

    @Deprecated
    public boolean _isEmptyOrTextualNull(String str) {
        if (!str.isEmpty() && !"null".equals(str)) {
            return false;
        }
        return true;
    }

    public final boolean _isIntNumber(String str) {
        int i11;
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != '-' && cCharAt != '+') {
            i11 = 0;
        } else {
            if (length == 1) {
                return false;
            }
            i11 = 1;
        }
        while (i11 < length) {
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                return false;
            }
            i11++;
        }
        return true;
    }

    public final Boolean _parseBoolean(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        String strExtractScalarFromObject;
        int iMo10891l = jsonParser.mo10891l();
        if (iMo10891l != 1) {
            if (iMo10891l != 3) {
                if (iMo10891l != 6) {
                    if (iMo10891l != 7) {
                        switch (iMo10891l) {
                            case 9:
                                return Boolean.TRUE;
                            case 10:
                                return Boolean.FALSE;
                            case 11:
                                return null;
                            default:
                                return (Boolean) deserializationContext.handleUnexpectedToken(cls, jsonParser);
                        }
                    }
                    return _coerceBooleanFromInt(jsonParser, deserializationContext, cls);
                }
                strExtractScalarFromObject = jsonParser.mo10869W();
            } else {
                return (Boolean) _deserializeFromArray(jsonParser, deserializationContext);
            }
        } else {
            strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        }
        CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject, LogicalType.Boolean, cls);
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
            return null;
        }
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return Boolean.FALSE;
        }
        String strTrim = strExtractScalarFromObject.trim();
        int length = strTrim.length();
        if (length == 4) {
            if (_isTrue(strTrim)) {
                return Boolean.TRUE;
            }
        } else if (length == 5 && _isFalse(strTrim)) {
            return Boolean.FALSE;
        }
        if (_checkTextualNull(deserializationContext, strTrim)) {
            return null;
        }
        return (Boolean) deserializationContext.handleWeirdStringValue(cls, strTrim, "only \"true\" or \"false\" recognized", new Object[0]);
    }

    @Deprecated
    public boolean _parseBooleanFromInt(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        _verifyNumberForScalarCoercion(deserializationContext, jsonParser);
        return !"0".equals(jsonParser.mo10869W());
    }

    public final byte _parseBytePrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strExtractScalarFromObject;
        int iMo10891l = jsonParser.mo10891l();
        Class<?> cls = Byte.TYPE;
        if (iMo10891l != 1) {
            if (iMo10891l != 3) {
                if (iMo10891l != 11) {
                    if (iMo10891l != 6) {
                        if (iMo10891l != 7) {
                            if (iMo10891l == 8) {
                                CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, cls);
                                if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull || coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                                    return (byte) 0;
                                }
                                return jsonParser.mo10901q();
                            }
                        } else {
                            return jsonParser.mo10901q();
                        }
                    } else {
                        strExtractScalarFromObject = jsonParser.mo10869W();
                    }
                } else {
                    _verifyNullForPrimitive(deserializationContext);
                    return (byte) 0;
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jsonParser.mo10905t0() == JsonToken.START_ARRAY) {
                    return ((Byte) handleNestedArrayForSingle(jsonParser, deserializationContext)).byteValue();
                }
                byte b_parseBytePrimitive = _parseBytePrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return b_parseBytePrimitive;
            }
            return ((Byte) deserializationContext.handleUnexpectedToken(deserializationContext.constructType(cls), jsonParser)).byteValue();
        }
        strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject, LogicalType.Integer, cls);
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return (byte) 0;
        }
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return (byte) 0;
        }
        String strTrim = strExtractScalarFromObject.trim();
        if (_hasTextualNull(strTrim)) {
            _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
            return (byte) 0;
        }
        try {
            int iM11018j = C6313g.m11018j(strTrim);
            if (_byteOverflow(iM11018j)) {
                return ((Byte) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "overflow, value cannot be represented as 8-bit value", new Object[0])).byteValue();
            }
            return (byte) iM11018j;
        } catch (IllegalArgumentException unused) {
            return ((Byte) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid `byte` value", new Object[0])).byteValue();
        }
    }

    public Date _parseDateFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        CoercionAction coercionAction_findCoercionFromEmptyArray = _findCoercionFromEmptyArray(deserializationContext);
        boolean zIsEnabled = deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zIsEnabled || coercionAction_findCoercionFromEmptyArray != CoercionAction.Fail) {
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            if (jsonTokenMo10905t0 == JsonToken.END_ARRAY) {
                int i11 = C6387a.f10358a[coercionAction_findCoercionFromEmptyArray.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2 || i11 == 3) {
                        return (Date) getNullValue(deserializationContext);
                    }
                } else {
                    return (Date) getEmptyValue(deserializationContext);
                }
            } else if (zIsEnabled) {
                if (jsonTokenMo10905t0 == JsonToken.START_ARRAY) {
                    return (Date) handleNestedArrayForSingle(jsonParser, deserializationContext);
                }
                Date date_parseDate = _parseDate(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return date_parseDate;
            }
        }
        return (Date) deserializationContext.handleUnexpectedToken(this._valueClass, JsonToken.START_ARRAY, jsonParser, (String) null, new Object[0]);
    }

    public final short _parseShortPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strExtractScalarFromObject;
        int iMo10891l = jsonParser.mo10891l();
        Class<?> cls = Short.TYPE;
        if (iMo10891l != 1) {
            if (iMo10891l != 3) {
                if (iMo10891l != 11) {
                    if (iMo10891l != 6) {
                        if (iMo10891l != 7) {
                            if (iMo10891l == 8) {
                                CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, cls);
                                if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull || coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                                    return (short) 0;
                                }
                                return jsonParser.mo10868V();
                            }
                        } else {
                            return jsonParser.mo10868V();
                        }
                    } else {
                        strExtractScalarFromObject = jsonParser.mo10869W();
                    }
                } else {
                    _verifyNullForPrimitive(deserializationContext);
                    return (short) 0;
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jsonParser.mo10905t0() == JsonToken.START_ARRAY) {
                    return ((Short) handleNestedArrayForSingle(jsonParser, deserializationContext)).shortValue();
                }
                short s_parseShortPrimitive = _parseShortPrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return s_parseShortPrimitive;
            }
            return ((Short) deserializationContext.handleUnexpectedToken(deserializationContext.constructType(cls), jsonParser)).shortValue();
        }
        strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject, LogicalType.Integer, cls);
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return (short) 0;
        }
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return (short) 0;
        }
        String strTrim = strExtractScalarFromObject.trim();
        if (_hasTextualNull(strTrim)) {
            _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
            return (short) 0;
        }
        try {
            int iM11018j = C6313g.m11018j(strTrim);
            if (_shortOverflow(iM11018j)) {
                return ((Short) deserializationContext.handleWeirdStringValue(cls, strTrim, "overflow, value cannot be represented as 16-bit value", new Object[0])).shortValue();
            }
            return (short) iM11018j;
        } catch (IllegalArgumentException unused) {
            return ((Short) deserializationContext.handleWeirdStringValue(cls, strTrim, "not a valid `short` value", new Object[0])).shortValue();
        }
    }

    public void _verifyEndArrayForSingle(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo10905t0() != JsonToken.END_ARRAY) {
            handleMissingEndArrayForSingle(jsonParser, deserializationContext);
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        return abstractC6428b.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public InterfaceC6375j findContentNullProvider(DeserializationContext deserializationContext, BeanProperty beanProperty, AbstractC6390e<?> abstractC6390e) throws JsonMappingException {
        Nulls nullsFindContentNullStyle = findContentNullStyle(deserializationContext, beanProperty);
        if (nullsFindContentNullStyle == Nulls.SKIP) {
            return NullsConstantProvider.skipper();
        }
        if (nullsFindContentNullStyle == Nulls.FAIL) {
            if (beanProperty == null) {
                JavaType javaTypeConstructType = deserializationContext.constructType(abstractC6390e.handledType());
                if (javaTypeConstructType.isContainerType()) {
                    javaTypeConstructType = javaTypeConstructType.getContentType();
                }
                return NullsFailProvider.constructForRootValue(javaTypeConstructType);
            }
            return NullsFailProvider.constructForProperty(beanProperty, beanProperty.getType().getContentType());
        }
        InterfaceC6375j interfaceC6375j_findNullProvider = _findNullProvider(deserializationContext, beanProperty, nullsFindContentNullStyle, abstractC6390e);
        if (interfaceC6375j_findNullProvider != null) {
            return interfaceC6375j_findNullProvider;
        }
        return abstractC6390e;
    }

    public AbstractC6390e<?> findConvertingContentDeserializer(DeserializationContext deserializationContext, BeanProperty beanProperty, AbstractC6390e<?> abstractC6390e) throws JsonMappingException {
        AnnotatedMember member;
        Object objFindDeserializationContentConverter;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (_neitherNull(annotationIntrospector, beanProperty) && (member = beanProperty.getMember()) != null && (objFindDeserializationContentConverter = annotationIntrospector.findDeserializationContentConverter(member)) != null) {
            InterfaceC6491h<Object, Object> interfaceC6491hConverterInstance = deserializationContext.converterInstance(beanProperty.getMember(), objFindDeserializationContentConverter);
            JavaType javaTypeMo11360a = interfaceC6491hConverterInstance.mo11360a(deserializationContext.getTypeFactory());
            if (abstractC6390e == null) {
                abstractC6390e = deserializationContext.findContextualValueDeserializer(javaTypeMo11360a, beanProperty);
            }
            return new StdDelegatingDeserializer(interfaceC6491hConverterInstance, javaTypeMo11360a, abstractC6390e);
        }
        return abstractC6390e;
    }

    public AbstractC6390e<Object> findDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return deserializationContext.findContextualValueDeserializer(javaType, beanProperty);
    }

    public Boolean findFormatFeature(DeserializationContext deserializationContext, BeanProperty beanProperty, Class<?> cls, JsonFormat.Feature feature) {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, cls);
        if (valueFindFormatOverrides != null) {
            return valueFindFormatOverrides.getFeature(feature);
        }
        return null;
    }

    public boolean isDefaultDeserializer(AbstractC6390e<?> abstractC6390e) {
        return C6490g.m11912O(abstractC6390e);
    }

    public boolean isDefaultKeyDeserializer(AbstractC6394i abstractC6394i) {
        return C6490g.m11912O(abstractC6394i);
    }

    public StdDeserializer(JavaType javaType) {
        this._valueClass = javaType == null ? Object.class : javaType.getRawClass();
        this._valueType = javaType;
    }

    public StdDeserializer(StdDeserializer<?> stdDeserializer) {
        this._valueClass = stdDeserializer._valueClass;
        this._valueType = stdDeserializer._valueType;
    }

    public Date _parseDate(String str, DeserializationContext deserializationContext) throws IOException {
        try {
            if (str.isEmpty()) {
                if (C6387a.f10358a[_checkFromStringCoercion(deserializationContext, str).ordinal()] != 1) {
                    return null;
                }
                return new Date(0L);
            }
            if (_hasTextualNull(str)) {
                return null;
            }
            return deserializationContext.parseDate(str);
        } catch (IllegalArgumentException e11) {
            return (Date) deserializationContext.handleWeirdStringValue(this._valueClass, str, "not a valid representation (error: %s)", C6490g.m11952o(e11));
        }
    }

    public final double _parseDoublePrimitive(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            return _parseDouble(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(Double.TYPE, str, "not a valid `double` value (as String to convert)", new Object[0])).doubleValue();
        }
    }

    public final float _parseFloatPrimitive(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            return Float.parseFloat(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(Float.TYPE, str, "not a valid `float` value", new Object[0])).floatValue();
        }
    }

    public final Integer _parseInteger(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            if (str.length() > 9) {
                long jM11020l = C6313g.m11020l(str);
                if (_intOverflow(jM11020l)) {
                    return (Integer) deserializationContext.handleWeirdStringValue(Integer.class, str, "Overflow: numeric value (%s) out of range of `java.lang.Integer` (%d -%d)", str, Integer.MIN_VALUE, Integer.MAX_VALUE);
                }
                return Integer.valueOf((int) jM11020l);
            }
            return Integer.valueOf(C6313g.m11018j(str));
        } catch (IllegalArgumentException unused) {
            return (Integer) deserializationContext.handleWeirdStringValue(Integer.class, str, "not a valid `java.lang.Integer` value", new Object[0]);
        }
    }

    public final Long _parseLong(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            return Long.valueOf(C6313g.m11020l(str));
        } catch (IllegalArgumentException unused) {
            return (Long) deserializationContext.handleWeirdStringValue(Long.class, str, "not a valid `java.lang.Long` value", new Object[0]);
        }
    }

    public final int _parseIntPrimitive(DeserializationContext deserializationContext, String str) throws IOException {
        Class<?> cls = Integer.TYPE;
        try {
            if (str.length() > 9) {
                long jM11020l = C6313g.m11020l(str);
                return _intOverflow(jM11020l) ? _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(cls, str, "Overflow: numeric value (%s) out of range of int (%d -%d)", str, Integer.MIN_VALUE, Integer.MAX_VALUE)).intValue() : (int) jM11020l;
            }
            return C6313g.m11018j(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(cls, str, "not a valid `int` value", new Object[0])).intValue();
        }
    }

    public final long _parseLongPrimitive(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            return C6313g.m11020l(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(Long.TYPE, str, "not a valid `long` value", new Object[0])).longValue();
        }
    }
}
