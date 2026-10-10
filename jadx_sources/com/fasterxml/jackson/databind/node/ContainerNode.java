package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.node.ContainerNode;
import com.fasterxml.jackson.databind.util.C6497n;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes45.dex */
public abstract class ContainerNode<T extends ContainerNode<T>> extends BaseJsonNode {
    private static final long serialVersionUID = 1;
    protected final JsonNodeFactory _nodeFactory;

    public ContainerNode(JsonNodeFactory jsonNodeFactory) {
        this._nodeFactory = jsonNodeFactory;
    }

    public final ArrayNode arrayNode() {
        return this._nodeFactory.arrayNode();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.InterfaceC6320l
    public abstract JsonToken asToken();

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public abstract AbstractC6391f get(int i11);

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public abstract AbstractC6391f get(String str);

    public abstract T removeAll();

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public abstract int size();

    public final ArrayNode arrayNode(int i11) {
        return this._nodeFactory.arrayNode(i11);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public String asText() {
        return "";
    }

    /* JADX INFO: renamed from: booleanNode, reason: merged with bridge method [inline-methods] */
    public final BooleanNode m103735booleanNode(boolean z11) {
        return this._nodeFactory.m103746booleanNode(z11);
    }

    public AbstractC6391f missingNode() {
        return this._nodeFactory.missingNode();
    }

    /* JADX INFO: renamed from: nullNode, reason: merged with bridge method [inline-methods] */
    public final NullNode m103736nullNode() {
        return this._nodeFactory.m103747nullNode();
    }

    public final ObjectNode objectNode() {
        return this._nodeFactory.objectNode();
    }

    public final ValueNode pojoNode(Object obj) {
        return this._nodeFactory.pojoNode(obj);
    }

    public final ValueNode rawValueNode(C6497n c6497n) {
        return this._nodeFactory.rawValueNode(c6497n);
    }

    /* JADX INFO: renamed from: textNode, reason: merged with bridge method [inline-methods] */
    public final TextNode m103743textNode(String str) {
        return this._nodeFactory.m103754textNode(str);
    }

    public ContainerNode() {
        this._nodeFactory = null;
    }

    /* JADX INFO: renamed from: binaryNode, reason: merged with bridge method [inline-methods] */
    public final BinaryNode m103733binaryNode(byte[] bArr) {
        return this._nodeFactory.m103744binaryNode(bArr);
    }

    /* JADX INFO: renamed from: binaryNode, reason: merged with bridge method [inline-methods] */
    public final BinaryNode m103734binaryNode(byte[] bArr, int i11, int i12) {
        return this._nodeFactory.m103745binaryNode(bArr, i11, i12);
    }

    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public final NumericNode m103737numberNode(byte b11) {
        return this._nodeFactory.m103748numberNode(b11);
    }

    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public final NumericNode m103742numberNode(short s11) {
        return this._nodeFactory.m103753numberNode(s11);
    }

    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public final NumericNode m103740numberNode(int i11) {
        return this._nodeFactory.m103751numberNode(i11);
    }

    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public final NumericNode m103741numberNode(long j11) {
        return this._nodeFactory.m103752numberNode(j11);
    }

    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public final NumericNode m103739numberNode(float f11) {
        return this._nodeFactory.m103750numberNode(f11);
    }

    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public final NumericNode m103738numberNode(double d11) {
        return this._nodeFactory.m103749numberNode(d11);
    }

    public final ValueNode numberNode(BigInteger bigInteger) {
        return this._nodeFactory.numberNode(bigInteger);
    }

    public final ValueNode numberNode(BigDecimal bigDecimal) {
        return this._nodeFactory.numberNode(bigDecimal);
    }

    public final ValueNode numberNode(Byte b11) {
        return this._nodeFactory.numberNode(b11);
    }

    public final ValueNode numberNode(Short sh2) {
        return this._nodeFactory.numberNode(sh2);
    }

    public final ValueNode numberNode(Integer num) {
        return this._nodeFactory.numberNode(num);
    }

    public final ValueNode numberNode(Long l11) {
        return this._nodeFactory.numberNode(l11);
    }

    public final ValueNode numberNode(Float f11) {
        return this._nodeFactory.numberNode(f11);
    }

    public final ValueNode numberNode(Double d11) {
        return this._nodeFactory.numberNode(d11);
    }
}
