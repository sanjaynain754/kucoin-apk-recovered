package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6446m;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes45.dex */
public class DecimalNode extends NumericNode {
    public static final DecimalNode ZERO = new DecimalNode(BigDecimal.ZERO);

    /* JADX INFO: renamed from: b */
    public static final BigDecimal f10563b = BigDecimal.valueOf(-2147483648L);

    /* JADX INFO: renamed from: c */
    public static final BigDecimal f10564c = BigDecimal.valueOf(2147483647L);

    /* JADX INFO: renamed from: d */
    public static final BigDecimal f10565d = BigDecimal.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: e */
    public static final BigDecimal f10566e = BigDecimal.valueOf(Long.MAX_VALUE);
    protected final BigDecimal _value;

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof DecimalNode) && ((DecimalNode) obj)._value.compareTo(this._value) == 0;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean isBigDecimal() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean isFloatingPointNumber() {
        return true;
    }

    public static DecimalNode valueOf(BigDecimal bigDecimal) {
        return new DecimalNode(bigDecimal);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public String asText() {
        return this._value.toString();
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.InterfaceC6320l
    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public BigInteger bigIntegerValue() {
        return this._value.toBigInteger();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean canConvertToExactIntegral() {
        return this._value.signum() == 0 || this._value.scale() <= 0 || C6447a.m11724a(this._value).scale() <= 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public boolean canConvertToInt() {
        return this._value.compareTo(f10563b) >= 0 && this._value.compareTo(f10564c) <= 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public boolean canConvertToLong() {
        return this._value.compareTo(f10565d) >= 0 && this._value.compareTo(f10566e) <= 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public BigDecimal decimalValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public double doubleValue() {
        return this._value.doubleValue();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public float floatValue() {
        return this._value.floatValue();
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
        return JsonParser.NumberType.BIG_DECIMAL;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public Number numberValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.InterfaceC6392g
    public final void serialize(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        jsonGenerator.mo10820h0(this._value);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public short shortValue() {
        return this._value.shortValue();
    }

    public DecimalNode(BigDecimal bigDecimal) {
        this._value = bigDecimal;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return Double.valueOf(doubleValue()).hashCode();
    }
}
