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
public class ShortNode extends NumericNode {
    protected final short _value;

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public boolean canConvertToInt() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public boolean canConvertToLong() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof ShortNode) && ((ShortNode) obj)._value == this._value;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean isIntegralNumber() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean isShort() {
        return true;
    }

    public static ShortNode valueOf(short s11) {
        return new ShortNode(s11);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean asBoolean(boolean z11) {
        return this._value != 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public String asText() {
        return C6314h.m11044w(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.InterfaceC6320l
    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(this._value);
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
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public int intValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public long longValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.InterfaceC6320l
    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.INT;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.AbstractC6391f
    public Number numberValue() {
        return Short.valueOf(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.InterfaceC6392g
    public final void serialize(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        jsonGenerator.mo10824j0(this._value);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public short shortValue() {
        return this._value;
    }

    public ShortNode(short s11) {
        this._value = s11;
    }
}
