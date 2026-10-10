package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.C6297a;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6446m;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes45.dex */
public class BinaryNode extends ValueNode {
    static final BinaryNode EMPTY_BINARY_NODE = new BinaryNode(new byte[0]);
    private static final long serialVersionUID = 2;
    protected final byte[] _data;

    public BinaryNode(byte[] bArr) {
        this._data = bArr;
    }

    public static BinaryNode valueOf(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return bArr.length == 0 ? EMPTY_BINARY_NODE : new BinaryNode(bArr);
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.InterfaceC6320l
    public JsonToken asToken() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public byte[] binaryValue() {
        return this._data;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof BinaryNode)) {
            return Arrays.equals(((BinaryNode) obj)._data, this._data);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public JsonNodeType getNodeType() {
        return JsonNodeType.BINARY;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        byte[] bArr = this._data;
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }

    public BinaryNode(byte[] bArr, int i11, int i12) {
        if (i11 == 0 && i12 == bArr.length) {
            this._data = bArr;
            return;
        }
        byte[] bArr2 = new byte[i12];
        this._data = bArr2;
        System.arraycopy(bArr, i11, bArr2, 0, i12);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public String asText() {
        return C6297a.m10918a().encode(this._data, false);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.InterfaceC6392g
    public final void serialize(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        Base64Variant base64Variant = abstractC6446m.getConfig().getBase64Variant();
        byte[] bArr = this._data;
        jsonGenerator.mo10800R(base64Variant, bArr, 0, bArr.length);
    }

    public static BinaryNode valueOf(byte[] bArr, int i11, int i12) {
        if (bArr == null) {
            return null;
        }
        if (i12 == 0) {
            return EMPTY_BINARY_NODE;
        }
        return new BinaryNode(bArr, i11, i12);
    }
}
