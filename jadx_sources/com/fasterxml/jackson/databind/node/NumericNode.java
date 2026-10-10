package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonParser;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes45.dex */
public abstract class NumericNode extends ValueNode {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final double asDouble() {
        return doubleValue();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final int asInt() {
        return intValue();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final long asLong() {
        return longValue();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public abstract String asText();

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public abstract BigInteger bigIntegerValue();

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public abstract boolean canConvertToInt();

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public abstract boolean canConvertToLong();

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public abstract BigDecimal decimalValue();

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public abstract double doubleValue();

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public abstract int intValue();

    public boolean isNaN() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public abstract long longValue();

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.InterfaceC6320l
    public abstract JsonParser.NumberType numberType();

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public abstract Number numberValue();

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final double asDouble(double d11) {
        return doubleValue();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final int asInt(int i11) {
        return intValue();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final long asLong(long j11) {
        return longValue();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final JsonNodeType getNodeType() {
        return JsonNodeType.NUMBER;
    }
}
