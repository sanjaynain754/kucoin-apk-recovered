package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public final class MissingNode extends ValueNode {

    /* JADX INFO: renamed from: b */
    public static final MissingNode f10571b = new MissingNode();
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public String asText(String str) {
        return str;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean isMissingNode() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public AbstractC6391f require() {
        return (AbstractC6391f) _reportRequiredViolation("require() called on `MissingNode`", new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public AbstractC6391f requireNonNull() {
        return (AbstractC6391f) _reportRequiredViolation("requireNonNull() called on `MissingNode`", new Object[0]);
    }

    public static MissingNode getInstance() {
        return f10571b;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public String asText() {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.InterfaceC6320l
    public JsonToken asToken() {
        return JsonToken.NOT_AVAILABLE;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public JsonNodeType getNodeType() {
        return JsonNodeType.MISSING;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return JsonNodeType.MISSING.ordinal();
    }

    public Object readResolve() {
        return f10571b;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.AbstractC6391f
    public String toPrettyString() {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.AbstractC6391f
    public String toString() {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.InterfaceC6392g
    public final void serialize(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        jsonGenerator.mo10812b0();
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.InterfaceC6392g
    public void serializeWithType(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        jsonGenerator.mo10812b0();
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.AbstractC6391f
    public <T extends AbstractC6391f> T deepCopy() {
        return this;
    }
}
