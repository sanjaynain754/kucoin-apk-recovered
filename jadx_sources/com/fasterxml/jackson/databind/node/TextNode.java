package com.fasterxml.jackson.databind.node;

import androidx.credentials.provider.CredentialEntry;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.C6297a;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.p062io.C6308b;
import com.fasterxml.jackson.core.p062io.C6313g;
import com.fasterxml.jackson.core.util.C6324c;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public class TextNode extends ValueNode {
    static final TextNode EMPTY_STRING_NODE = new TextNode("");
    private static final long serialVersionUID = 2;
    protected final String _value;

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public String asText() {
        return this._value;
    }

    @Deprecated
    public static void appendQuoted(StringBuilder sb2, String str) {
        sb2.append('\"');
        C6308b.m10961a(sb2, str);
        sb2.append('\"');
    }

    public static TextNode valueOf(String str) {
        if (str == null) {
            return null;
        }
        return str.isEmpty() ? EMPTY_STRING_NODE : new TextNode(str);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean asBoolean(boolean z11) {
        String str = this._value;
        if (str == null) {
            return z11;
        }
        String strTrim = str.trim();
        if (CredentialEntry.TRUE_STRING.equals(strTrim)) {
            return true;
        }
        if (CredentialEntry.FALSE_STRING.equals(strTrim)) {
            return false;
        }
        return z11;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public double asDouble(double d11) {
        return C6313g.m11011c(this._value, d11);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public int asInt(int i11) {
        return C6313g.m11012d(this._value, i11);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public long asLong(long j11) {
        return C6313g.m11013e(this._value, j11);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public String asText(String str) {
        String str2 = this._value;
        return str2 == null ? str : str2;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.InterfaceC6320l
    public JsonToken asToken() {
        return JsonToken.VALUE_STRING;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof TextNode)) {
            return ((TextNode) obj)._value.equals(this._value);
        }
        return false;
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        String strTrim = this._value.trim();
        C6324c c6324c = new C6324c(Math.max(16, Math.min(65536, ((strTrim.length() >> 2) * 3) + 4)));
        try {
            base64Variant.decode(strTrim, c6324c);
            return c6324c.m11079q();
        } catch (IllegalArgumentException e11) {
            throw InvalidFormatException.from(null, String.format("Cannot access contents of TextNode as binary due to broken Base64 encoding: %s", e11.getMessage()), strTrim, byte[].class);
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public JsonNodeType getNodeType() {
        return JsonNodeType.STRING;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this._value.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.InterfaceC6392g
    public final void serialize(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        String str = this._value;
        if (str == null) {
            jsonGenerator.mo10812b0();
        } else {
            jsonGenerator.mo10787C0(str);
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public String textValue() {
        return this._value;
    }

    public TextNode(String str) {
        this._value = str;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public byte[] binaryValue() throws IOException {
        return getBinaryValue(C6297a.m10918a());
    }
}
