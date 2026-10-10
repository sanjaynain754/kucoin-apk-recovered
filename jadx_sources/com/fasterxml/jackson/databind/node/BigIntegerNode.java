package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6446m;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes45.dex */
public class BigIntegerNode extends NumericNode {

    /* JADX INFO: renamed from: b */
    public static final BigInteger f10559b = BigInteger.valueOf(-2147483648L);

    /* JADX INFO: renamed from: c */
    public static final BigInteger f10560c = BigInteger.valueOf(2147483647L);

    /* JADX INFO: renamed from: d */
    public static final BigInteger f10561d = BigInteger.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: e */
    public static final BigInteger f10562e = BigInteger.valueOf(Long.MAX_VALUE);
    protected final BigInteger _value;

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean isBigInteger() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean isIntegralNumber() {
        return true;
    }

    public static BigIntegerNode valueOf(BigInteger bigInteger) {
        return new BigIntegerNode(bigInteger);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean asBoolean(boolean z11) {
        return !BigInteger.ZERO.equals(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public String asText() {
        return this._value.toString();
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.InterfaceC6320l
    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public BigInteger bigIntegerValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public boolean canConvertToInt() {
        return this._value.compareTo(f10559b) >= 0 && this._value.compareTo(f10560c) <= 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public boolean canConvertToLong() {
        return this._value.compareTo(f10561d) >= 0 && this._value.compareTo(f10562e) <= 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public BigDecimal decimalValue() {
        return new BigDecimal(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public double doubleValue() {
        return this._value.doubleValue();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof BigIntegerNode)) {
            return ((BigIntegerNode) obj)._value.equals(this._value);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public float floatValue() {
        return this._value.floatValue();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this._value.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public int intValue() {
        return this._value.intValue();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public long longValue() {
        return this._value.longValue();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.InterfaceC6320l
    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.BIG_INTEGER;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public Number numberValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.InterfaceC6392g
    public final void serialize(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        jsonGenerator.mo10822i0(this._value);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public short shortValue() {
        return this._value.shortValue();
    }

    public BigIntegerNode(BigInteger bigInteger) {
        this._value = bigInteger;
    }
}
