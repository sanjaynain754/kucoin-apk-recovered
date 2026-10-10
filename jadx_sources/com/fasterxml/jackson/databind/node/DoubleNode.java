package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.p062io.C6314h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes45.dex */
public class DoubleNode extends NumericNode {
    protected final double _value;

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof DoubleNode)) {
            if (Double.compare(this._value, ((DoubleNode) obj)._value) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean isDouble() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean isFloatingPointNumber() {
        return true;
    }

    public static DoubleNode valueOf(double d11) {
        return new DoubleNode(d11);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public String asText() {
        return C6314h.m11042u(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.InterfaceC6320l
    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean canConvertToExactIntegral() {
        if (Double.isNaN(this._value) || Double.isInfinite(this._value)) {
            return false;
        }
        double d11 = this._value;
        return d11 == Math.rint(d11);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public boolean canConvertToInt() {
        double d11 = this._value;
        return d11 >= -2.147483648E9d && d11 <= 2.147483647E9d;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public boolean canConvertToLong() {
        double d11 = this._value;
        return d11 >= -9.223372036854776E18d && d11 <= 9.223372036854776E18d;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public BigDecimal decimalValue() {
        return BigDecimal.valueOf(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public double doubleValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public float floatValue() {
        return (float) this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this._value);
        return ((int) (jDoubleToLongBits >> 32)) ^ ((int) jDoubleToLongBits);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public int intValue() {
        return (int) this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public boolean isNaN() {
        return Double.isNaN(this._value) || Double.isInfinite(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public long longValue() {
        return (long) this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.InterfaceC6320l
    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.DOUBLE;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public Number numberValue() {
        return Double.valueOf(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.InterfaceC6392g
    public final void serialize(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        jsonGenerator.mo10813c0(this._value);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public short shortValue() {
        return (short) this._value;
    }

    public DoubleNode(double d11) {
        this._value = d11;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public BigInteger bigIntegerValue() {
        return decimalValue().toBigInteger();
    }
}
