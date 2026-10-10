package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.p062io.C6313g;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
public class NumberDeserializers {

    /* JADX INFO: renamed from: a */
    public static final HashSet<String> f10355a = new HashSet<>();

    @InterfaceC42435a
    public static class BigDecimalDeserializer extends StdScalarDeserializer<BigDecimal> {
        public static final BigDecimalDeserializer instance = new BigDecimalDeserializer();

        public BigDecimalDeserializer() {
            super((Class<?>) BigDecimal.class);
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public BigDecimal deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iMo10891l = jsonParser.mo10891l();
            if (iMo10891l == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iMo10891l == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iMo10891l != 6) {
                    return (iMo10891l == 7 || iMo10891l == 8) ? jsonParser.mo10855C() : (BigDecimal) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                strExtractScalarFromObject = jsonParser.mo10869W();
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (BigDecimal) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_hasTextualNull(strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                return new BigDecimal(strTrim);
            } catch (IllegalArgumentException unused) {
                return (BigDecimal) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid representation", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return BigDecimal.ZERO;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public final LogicalType logicalType() {
            return LogicalType.Float;
        }
    }

    @InterfaceC42435a
    public static class BigIntegerDeserializer extends StdScalarDeserializer<BigInteger> {
        public static final BigIntegerDeserializer instance = new BigIntegerDeserializer();

        public BigIntegerDeserializer() {
            super((Class<?>) BigInteger.class);
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public BigInteger deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            if (jsonParser.mo10896n0()) {
                return jsonParser.mo10895n();
            }
            int iMo10891l = jsonParser.mo10891l();
            if (iMo10891l == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iMo10891l == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iMo10891l != 6) {
                    if (iMo10891l != 8) {
                        return (BigInteger) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                    }
                    CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                    if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull) {
                        return getNullValue(deserializationContext);
                    }
                    return coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty ? (BigInteger) getEmptyValue(deserializationContext) : jsonParser.mo10855C().toBigInteger();
                }
                strExtractScalarFromObject = jsonParser.mo10869W();
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (BigInteger) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_hasTextualNull(strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                return new BigInteger(strTrim);
            } catch (IllegalArgumentException unused) {
                return (BigInteger) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid representation", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return BigInteger.ZERO;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public final LogicalType logicalType() {
            return LogicalType.Integer;
        }
    }

    @InterfaceC42435a
    public static final class BooleanDeserializer extends PrimitiveOrWrapperDeserializer<Boolean> {
        private static final long serialVersionUID = 1;
        static final BooleanDeserializer primitiveInstance = new BooleanDeserializer(Boolean.TYPE, Boolean.FALSE);
        static final BooleanDeserializer wrapperInstance = new BooleanDeserializer(Boolean.class, null);

        public BooleanDeserializer(Class<Boolean> cls, Boolean bool) {
            super(cls, LogicalType.Boolean, bool, Boolean.FALSE);
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Boolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
            if (jsonTokenMo10889k == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (jsonTokenMo10889k == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            return this._primitive ? Boolean.valueOf(_parseBooleanPrimitive(jsonParser, deserializationContext)) : _parseBoolean(jsonParser, deserializationContext, this._valueClass);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public Boolean deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
            JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
            if (jsonTokenMo10889k == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (jsonTokenMo10889k == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            return this._primitive ? Boolean.valueOf(_parseBooleanPrimitive(jsonParser, deserializationContext)) : _parseBoolean(jsonParser, deserializationContext, this._valueClass);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    @InterfaceC42435a
    public static class ByteDeserializer extends PrimitiveOrWrapperDeserializer<Byte> {
        private static final long serialVersionUID = 1;
        static final ByteDeserializer primitiveInstance = new ByteDeserializer(Byte.TYPE, (byte) 0);
        static final ByteDeserializer wrapperInstance = new ByteDeserializer(Byte.class, null);

        public ByteDeserializer(Class<Byte> cls, Byte b11) {
            super(cls, LogicalType.Integer, b11, (byte) 0);
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Byte deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.mo10896n0()) {
                return Byte.valueOf(jsonParser.mo10901q());
            }
            return this._primitive ? Byte.valueOf(_parseBytePrimitive(jsonParser, deserializationContext)) : _parseByte(jsonParser, deserializationContext);
        }

        public Byte _parseByte(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iMo10891l = jsonParser.mo10891l();
            if (iMo10891l != 1) {
                if (iMo10891l != 3) {
                    if (iMo10891l != 11) {
                        if (iMo10891l != 6) {
                            if (iMo10891l != 7) {
                                if (iMo10891l != 8) {
                                    return (Byte) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                                }
                                CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                                if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull) {
                                    return getNullValue(deserializationContext);
                                }
                                if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                                    return (Byte) getEmptyValue(deserializationContext);
                                }
                                return Byte.valueOf(jsonParser.mo10901q());
                            }
                            return Byte.valueOf(jsonParser.mo10901q());
                        }
                        strExtractScalarFromObject = jsonParser.mo10869W();
                    } else {
                        return getNullValue(deserializationContext);
                    }
                } else {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
            } else {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Byte) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                int iM11018j = C6313g.m11018j(strTrim);
                if (_byteOverflow(iM11018j)) {
                    return (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                }
                return Byte.valueOf((byte) iM11018j);
            } catch (IllegalArgumentException unused) {
                return (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Byte value", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    @InterfaceC42435a
    public static class CharacterDeserializer extends PrimitiveOrWrapperDeserializer<Character> {
        private static final long serialVersionUID = 1;
        static final CharacterDeserializer primitiveInstance = new CharacterDeserializer(Character.TYPE, 0);
        static final CharacterDeserializer wrapperInstance = new CharacterDeserializer(Character.class, null);

        public CharacterDeserializer(Class<Character> cls, Character ch2) {
            super(cls, LogicalType.Integer, ch2, (char) 0);
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Character deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            DeserializationContext deserializationContext2;
            String strExtractScalarFromObject;
            DeserializationContext deserializationContext3;
            int iMo10891l = jsonParser.mo10891l();
            if (iMo10891l == 1) {
                deserializationContext2 = deserializationContext;
                strExtractScalarFromObject = deserializationContext2.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iMo10891l == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iMo10891l == 11) {
                    if (this._primitive) {
                        _verifyNullForPrimitive(deserializationContext);
                    }
                    return getNullValue(deserializationContext);
                }
                if (iMo10891l != 6) {
                    if (iMo10891l != 7) {
                        return (Character) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                    }
                    CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(logicalType(), this._valueClass, CoercionInputShape.Integer);
                    int i11 = C6386a.f10356a[coercionActionFindCoercionAction.ordinal()];
                    if (i11 == 1) {
                        deserializationContext3 = deserializationContext;
                        _checkCoercionFail(deserializationContext3, coercionActionFindCoercionAction, this._valueClass, jsonParser.mo10863Q(), "Integer value (" + jsonParser.mo10869W() + ")");
                    } else {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                return (Character) getEmptyValue(deserializationContext);
                            }
                            int iMo10860M = jsonParser.mo10860M();
                            return (iMo10860M < 0 || iMo10860M > 65535) ? (Character) deserializationContext.handleWeirdNumberValue(handledType(), Integer.valueOf(iMo10860M), "value outside valid Character range (0x0000 - 0xFFFF)", new Object[0]) : Character.valueOf((char) iMo10860M);
                        }
                        deserializationContext3 = deserializationContext;
                    }
                    return getNullValue(deserializationContext3);
                }
                deserializationContext2 = deserializationContext;
                strExtractScalarFromObject = jsonParser.mo10869W();
            }
            if (strExtractScalarFromObject.length() == 1) {
                return Character.valueOf(strExtractScalarFromObject.charAt(0));
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext2, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext2);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Character) getEmptyValue(deserializationContext2);
            }
            String strTrim = strExtractScalarFromObject.trim();
            return _checkTextualNull(deserializationContext2, strTrim) ? getNullValue(deserializationContext2) : (Character) deserializationContext2.handleWeirdStringValue(handledType(), strTrim, "Expected either Integer value code or 1-character String", new Object[0]);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    @InterfaceC42435a
    public static class DoubleDeserializer extends PrimitiveOrWrapperDeserializer<Double> {
        private static final long serialVersionUID = 1;
        static final DoubleDeserializer primitiveInstance = new DoubleDeserializer(Double.TYPE, Double.valueOf(0.0d));
        static final DoubleDeserializer wrapperInstance = new DoubleDeserializer(Double.class, null);

        public DoubleDeserializer(Class<Double> cls, Double d11) {
            super(cls, LogicalType.Float, d11, Double.valueOf(0.0d));
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Double deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.mo10890k0(JsonToken.VALUE_NUMBER_FLOAT)) {
                return Double.valueOf(jsonParser.mo10857E());
            }
            return this._primitive ? Double.valueOf(_parseDoublePrimitive(jsonParser, deserializationContext)) : _parseDouble(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public Double deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
            if (jsonParser.mo10890k0(JsonToken.VALUE_NUMBER_FLOAT)) {
                return Double.valueOf(jsonParser.mo10857E());
            }
            return this._primitive ? Double.valueOf(_parseDoublePrimitive(jsonParser, deserializationContext)) : _parseDouble(jsonParser, deserializationContext);
        }

        public final Double _parseDouble(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iMo10891l = jsonParser.mo10891l();
            if (iMo10891l != 1) {
                if (iMo10891l != 3) {
                    if (iMo10891l != 11) {
                        if (iMo10891l != 6) {
                            if (iMo10891l != 7 && iMo10891l != 8) {
                                return (Double) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                            }
                            return Double.valueOf(jsonParser.mo10857E());
                        }
                        strExtractScalarFromObject = jsonParser.mo10869W();
                    } else {
                        return getNullValue(deserializationContext);
                    }
                } else {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
            } else {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            }
            Double d_checkDoubleSpecialValue = _checkDoubleSpecialValue(strExtractScalarFromObject);
            if (d_checkDoubleSpecialValue != null) {
                return d_checkDoubleSpecialValue;
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Double) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                return Double.valueOf(StdDeserializer._parseDouble(strTrim));
            } catch (IllegalArgumentException unused) {
                return (Double) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid `Double` value", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    @InterfaceC42435a
    public static class FloatDeserializer extends PrimitiveOrWrapperDeserializer<Float> {
        private static final long serialVersionUID = 1;
        static final FloatDeserializer primitiveInstance = new FloatDeserializer(Float.TYPE, Float.valueOf(0.0f));
        static final FloatDeserializer wrapperInstance = new FloatDeserializer(Float.class, null);

        public FloatDeserializer(Class<Float> cls, Float f11) {
            super(cls, LogicalType.Float, f11, Float.valueOf(0.0f));
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Float deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.mo10890k0(JsonToken.VALUE_NUMBER_FLOAT)) {
                return Float.valueOf(jsonParser.mo10859L());
            }
            return this._primitive ? Float.valueOf(_parseFloatPrimitive(jsonParser, deserializationContext)) : _parseFloat(jsonParser, deserializationContext);
        }

        public final Float _parseFloat(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iMo10891l = jsonParser.mo10891l();
            if (iMo10891l != 1) {
                if (iMo10891l != 3) {
                    if (iMo10891l != 11) {
                        if (iMo10891l != 6) {
                            if (iMo10891l != 7 && iMo10891l != 8) {
                                return (Float) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                            }
                            return Float.valueOf(jsonParser.mo10859L());
                        }
                        strExtractScalarFromObject = jsonParser.mo10869W();
                    } else {
                        return getNullValue(deserializationContext);
                    }
                } else {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
            } else {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            }
            Float f_checkFloatSpecialValue = _checkFloatSpecialValue(strExtractScalarFromObject);
            if (f_checkFloatSpecialValue != null) {
                return f_checkFloatSpecialValue;
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Float) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                return Float.valueOf(Float.parseFloat(strTrim));
            } catch (IllegalArgumentException unused) {
                return (Float) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid `Float` value", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    @InterfaceC42435a
    public static final class IntegerDeserializer extends PrimitiveOrWrapperDeserializer<Integer> {
        private static final long serialVersionUID = 1;
        static final IntegerDeserializer primitiveInstance = new IntegerDeserializer(Integer.TYPE, 0);
        static final IntegerDeserializer wrapperInstance = new IntegerDeserializer(Integer.class, null);

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public boolean isCachable() {
            return true;
        }

        public IntegerDeserializer(Class<Integer> cls, Integer num) {
            super(cls, LogicalType.Integer, num, 0);
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Integer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.mo10896n0()) {
                return Integer.valueOf(jsonParser.mo10860M());
            }
            return this._primitive ? Integer.valueOf(_parseIntPrimitive(jsonParser, deserializationContext)) : _parseInteger(jsonParser, deserializationContext, Integer.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public Integer deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
            if (jsonParser.mo10896n0()) {
                return Integer.valueOf(jsonParser.mo10860M());
            }
            return this._primitive ? Integer.valueOf(_parseIntPrimitive(jsonParser, deserializationContext)) : _parseInteger(jsonParser, deserializationContext, Integer.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    @InterfaceC42435a
    public static final class LongDeserializer extends PrimitiveOrWrapperDeserializer<Long> {
        private static final long serialVersionUID = 1;
        static final LongDeserializer primitiveInstance = new LongDeserializer(Long.TYPE, 0L);
        static final LongDeserializer wrapperInstance = new LongDeserializer(Long.class, null);

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public boolean isCachable() {
            return true;
        }

        public LongDeserializer(Class<Long> cls, Long l11) {
            super(cls, LogicalType.Integer, l11, 0L);
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Long deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.mo10896n0()) {
                return Long.valueOf(jsonParser.mo10861O());
            }
            return this._primitive ? Long.valueOf(_parseLongPrimitive(jsonParser, deserializationContext)) : _parseLong(jsonParser, deserializationContext, Long.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    @InterfaceC42435a
    public static class NumberDeserializer extends StdScalarDeserializer<Object> {
        public static final NumberDeserializer instance = new NumberDeserializer();

        public NumberDeserializer() {
            super((Class<?>) Number.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public final LogicalType logicalType() {
            return LogicalType.Integer;
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iMo10891l = jsonParser.mo10891l();
            if (iMo10891l != 1) {
                if (iMo10891l != 3) {
                    if (iMo10891l != 6) {
                        if (iMo10891l != 7) {
                            if (iMo10891l != 8) {
                                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                            }
                            if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) && !jsonParser.mo10902q0()) {
                                return jsonParser.mo10855C();
                            }
                            return jsonParser.mo10863Q();
                        }
                        if (deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                            return _coerceIntegral(jsonParser, deserializationContext);
                        }
                        return jsonParser.mo10863Q();
                    }
                    strExtractScalarFromObject = jsonParser.mo10869W();
                } else {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
            } else {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_hasTextualNull(strTrim)) {
                return getNullValue(deserializationContext);
            }
            if (_isPosInf(strTrim)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            if (_isNegInf(strTrim)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            if (_isNaN(strTrim)) {
                return Double.valueOf(Double.NaN);
            }
            try {
                if (!_isIntNumber(strTrim)) {
                    if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return new BigDecimal(strTrim);
                    }
                    return Double.valueOf(strTrim);
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                    return new BigInteger(strTrim);
                }
                long j11 = Long.parseLong(strTrim);
                if (!deserializationContext.isEnabled(DeserializationFeature.USE_LONG_FOR_INTS) && j11 <= 2147483647L && j11 >= -2147483648L) {
                    return Integer.valueOf((int) j11);
                }
                return Long.valueOf(j11);
            } catch (IllegalArgumentException unused) {
                return deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid number", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
            int iMo10891l = jsonParser.mo10891l();
            if (iMo10891l != 6 && iMo10891l != 7 && iMo10891l != 8) {
                return abstractC6428b.deserializeTypedFromScalar(jsonParser, deserializationContext);
            }
            return deserialize(jsonParser, deserializationContext);
        }
    }

    public static abstract class PrimitiveOrWrapperDeserializer<T> extends StdScalarDeserializer<T> {
        private static final long serialVersionUID = 1;
        protected final T _emptyValue;
        protected final LogicalType _logicalType;
        protected final T _nullValue;
        protected final boolean _primitive;

        public PrimitiveOrWrapperDeserializer(Class<T> cls, LogicalType logicalType, T t11, T t12) {
            super((Class<?>) cls);
            this._logicalType = logicalType;
            this._nullValue = t11;
            this._emptyValue = t12;
            this._primitive = cls.isPrimitive();
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return this._emptyValue;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public AccessPattern getNullAccessPattern() {
            if (this._primitive) {
                return AccessPattern.DYNAMIC;
            }
            return this._nullValue == null ? AccessPattern.ALWAYS_NULL : AccessPattern.CONSTANT;
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e, com.fasterxml.jackson.databind.deser.InterfaceC6375j
        public final T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
            if (this._primitive && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
                deserializationContext.reportInputMismatch(this, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", C6490g.m11938h(handledType()));
            }
            return this._nullValue;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public final LogicalType logicalType() {
            return this._logicalType;
        }

        @Deprecated
        public PrimitiveOrWrapperDeserializer(Class<T> cls, T t11, T t12) {
            this(cls, LogicalType.OtherScalar, t11, t12);
        }
    }

    @InterfaceC42435a
    public static class ShortDeserializer extends PrimitiveOrWrapperDeserializer<Short> {
        private static final long serialVersionUID = 1;
        static final ShortDeserializer primitiveInstance = new ShortDeserializer(Short.TYPE, 0);
        static final ShortDeserializer wrapperInstance = new ShortDeserializer(Short.class, null);

        public ShortDeserializer(Class<Short> cls, Short sh2) {
            super(cls, LogicalType.Integer, sh2, (short) 0);
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Short deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.mo10896n0()) {
                return Short.valueOf(jsonParser.mo10868V());
            }
            return this._primitive ? Short.valueOf(_parseShortPrimitive(jsonParser, deserializationContext)) : _parseShort(jsonParser, deserializationContext);
        }

        public Short _parseShort(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iMo10891l = jsonParser.mo10891l();
            if (iMo10891l != 1) {
                if (iMo10891l != 3) {
                    if (iMo10891l != 11) {
                        if (iMo10891l != 6) {
                            if (iMo10891l != 7) {
                                if (iMo10891l != 8) {
                                    return (Short) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                                }
                                CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                                if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull) {
                                    return getNullValue(deserializationContext);
                                }
                                if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                                    return (Short) getEmptyValue(deserializationContext);
                                }
                                return Short.valueOf(jsonParser.mo10868V());
                            }
                            return Short.valueOf(jsonParser.mo10868V());
                        }
                        strExtractScalarFromObject = jsonParser.mo10869W();
                    } else {
                        return getNullValue(deserializationContext);
                    }
                } else {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
            } else {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Short) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                int iM11018j = C6313g.m11018j(strTrim);
                if (_shortOverflow(iM11018j)) {
                    return (Short) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                }
                return Short.valueOf((short) iM11018j);
            } catch (IllegalArgumentException unused) {
                return (Short) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Short value", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$a */
    public static /* synthetic */ class C6386a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10356a;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f10356a = iArr;
            try {
                iArr[CoercionAction.Fail.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10356a[CoercionAction.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10356a[CoercionAction.AsEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        Class[] clsArr = {Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, Number.class, BigDecimal.class, BigInteger.class};
        for (int i11 = 0; i11 < 11; i11++) {
            f10355a.add(clsArr[i11].getName());
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC6390e<?> m11407a(Class<?> cls, String str) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return IntegerDeserializer.primitiveInstance;
            }
            if (cls == Boolean.TYPE) {
                return BooleanDeserializer.primitiveInstance;
            }
            if (cls == Long.TYPE) {
                return LongDeserializer.primitiveInstance;
            }
            if (cls == Double.TYPE) {
                return DoubleDeserializer.primitiveInstance;
            }
            if (cls == Character.TYPE) {
                return CharacterDeserializer.primitiveInstance;
            }
            if (cls == Byte.TYPE) {
                return ByteDeserializer.primitiveInstance;
            }
            if (cls == Short.TYPE) {
                return ShortDeserializer.primitiveInstance;
            }
            if (cls == Float.TYPE) {
                return FloatDeserializer.primitiveInstance;
            }
            if (cls == Void.TYPE) {
                return NullifyingDeserializer.instance;
            }
        } else if (f10355a.contains(str)) {
            if (cls == Integer.class) {
                return IntegerDeserializer.wrapperInstance;
            }
            if (cls == Boolean.class) {
                return BooleanDeserializer.wrapperInstance;
            }
            if (cls == Long.class) {
                return LongDeserializer.wrapperInstance;
            }
            if (cls == Double.class) {
                return DoubleDeserializer.wrapperInstance;
            }
            if (cls == Character.class) {
                return CharacterDeserializer.wrapperInstance;
            }
            if (cls == Byte.class) {
                return ByteDeserializer.wrapperInstance;
            }
            if (cls == Short.class) {
                return ShortDeserializer.wrapperInstance;
            }
            if (cls == Float.class) {
                return FloatDeserializer.wrapperInstance;
            }
            if (cls == Number.class) {
                return NumberDeserializer.instance;
            }
            if (cls == BigDecimal.class) {
                return BigDecimalDeserializer.instance;
            }
            if (cls == BigInteger.class) {
                return BigIntegerDeserializer.instance;
            }
        } else {
            return null;
        }
        throw new IllegalArgumentException("Internal error: can't find deserializer for " + cls.getName());
    }
}
