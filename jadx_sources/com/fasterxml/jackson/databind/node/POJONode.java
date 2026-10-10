package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.InterfaceC6392g;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public class POJONode extends ValueNode {
    private static final long serialVersionUID = 2;
    protected final Object _value;

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public String asText() {
        Object obj = this._value;
        return obj == null ? "null" : obj.toString();
    }

    public boolean _pojoEquals(POJONode pOJONode) {
        Object obj = this._value;
        if (obj == null) {
            return pOJONode._value == null;
        }
        return obj.equals(pOJONode._value);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean asBoolean(boolean z11) {
        Object obj = this._value;
        return (obj == null || !(obj instanceof Boolean)) ? z11 : ((Boolean) obj).booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public double asDouble(double d11) {
        Object obj = this._value;
        return obj instanceof Number ? ((Number) obj).doubleValue() : d11;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public int asInt(int i11) {
        Object obj = this._value;
        return obj instanceof Number ? ((Number) obj).intValue() : i11;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public long asLong(long j11) {
        Object obj = this._value;
        return obj instanceof Number ? ((Number) obj).longValue() : j11;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public String asText(String str) {
        Object obj = this._value;
        return obj == null ? str : obj.toString();
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.InterfaceC6320l
    public JsonToken asToken() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public byte[] binaryValue() throws IOException {
        Object obj = this._value;
        return obj instanceof byte[] ? (byte[]) obj : super.binaryValue();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof POJONode)) {
            return _pojoEquals((POJONode) obj);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public JsonNodeType getNodeType() {
        return JsonNodeType.POJO;
    }

    public Object getPojo() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this._value.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.InterfaceC6392g
    public final void serialize(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        Object obj = this._value;
        if (obj == null) {
            abstractC6446m.defaultSerializeNull(jsonGenerator);
        } else if (obj instanceof InterfaceC6392g) {
            ((InterfaceC6392g) obj).serialize(jsonGenerator, abstractC6446m);
        } else {
            abstractC6446m.defaultSerializeValue(obj, jsonGenerator);
        }
    }

    public POJONode(Object obj) {
        this._value = obj;
    }
}
