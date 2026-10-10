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
public class FloatNode extends NumericNode {
    protected final float _value;

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof FloatNode)) {
            if (Float.compare(this._value, ((FloatNode) obj)._value) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean isFloat() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean isFloatingPointNumber() {
        return true;
    }

    public static FloatNode valueOf(float f11) {
        return new FloatNode(f11);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public String asText() {
        return C6314h.m11043v(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.InterfaceC6320l
    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean canConvertToExactIntegral() {
        if (Float.isNaN(this._value) || Float.isInfinite(this._value)) {
            return false;
        }
        float f11 = this._value;
        return f11 == ((float) Math.round(f11));
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public boolean canConvertToInt() {
        float f11 = this._value;
        return f11 >= -2.1474836E9f && f11 <= 2.1474836E9f;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public boolean canConvertToLong() {
        float f11 = this._value;
        return f11 >= -9.223372E18f && f11 <= 9.223372E18f;
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
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return Float.floatToIntBits(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public int intValue() {
        return (int) this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public boolean isNaN() {
        return Float.isNaN(this._value) || Float.isInfinite(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public long longValue() {
        return (long) this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.InterfaceC6320l
    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.FLOAT;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public Number numberValue() {
        return Float.valueOf(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.InterfaceC6392g
    public final void serialize(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        jsonGenerator.mo10814d0(this._value);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public short shortValue() {
        return (short) this._value;
    }

    public FloatNode(float f11) {
        this._value = f11;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public BigInteger bigIntegerValue() {
        return decimalValue().toBigInteger();
    }
}
