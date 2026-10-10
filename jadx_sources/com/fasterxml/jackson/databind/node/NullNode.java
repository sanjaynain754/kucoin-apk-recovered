package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6446m;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public class NullNode extends ValueNode {
    public static final NullNode instance = new NullNode();
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public String asText(String str) {
        return str;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public AbstractC6391f requireNonNull() {
        return (AbstractC6391f) _reportRequiredViolation("requireNonNull() called on `NullNode`", new Object[0]);
    }

    public static NullNode getInstance() {
        return instance;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public String asText() {
        return "null";
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.InterfaceC6320l
    public JsonToken asToken() {
        return JsonToken.VALUE_NULL;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean equals(Object obj) {
        return obj == this || (obj instanceof NullNode);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public JsonNodeType getNodeType() {
        return JsonNodeType.NULL;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return JsonNodeType.NULL.ordinal();
    }

    public Object readResolve() {
        return instance;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.InterfaceC6392g
    public final void serialize(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        abstractC6446m.defaultSerializeNull(jsonGenerator);
    }
}
