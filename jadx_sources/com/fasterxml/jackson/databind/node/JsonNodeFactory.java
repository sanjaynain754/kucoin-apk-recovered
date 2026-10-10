package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.util.C6497n;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes45.dex */
public class JsonNodeFactory implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final JsonNodeFactory f10568b;

    /* JADX INFO: renamed from: c */
    public static final JsonNodeFactory f10569c;
    public static final JsonNodeFactory instance;
    private static final long serialVersionUID = 1;
    private final boolean _cfgBigDecimalExact;

    public JsonNodeFactory(boolean z11) {
        this._cfgBigDecimalExact = z11;
    }

    public boolean _inIntRange(long j11) {
        return ((long) ((int) j11)) == j11;
    }

    public ArrayNode arrayNode() {
        return new ArrayNode(this);
    }

    static {
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        f10568b = jsonNodeFactory;
        f10569c = new JsonNodeFactory(true);
        instance = jsonNodeFactory;
    }

    public static JsonNodeFactory withExactBigDecimals(boolean z11) {
        return z11 ? f10569c : f10568b;
    }

    public ArrayNode arrayNode(int i11) {
        return new ArrayNode(this, i11);
    }

    /* JADX INFO: renamed from: booleanNode, reason: merged with bridge method [inline-methods] */
    public BooleanNode m103746booleanNode(boolean z11) {
        return z11 ? BooleanNode.getTrue() : BooleanNode.getFalse();
    }

    /* JADX INFO: renamed from: nullNode, reason: merged with bridge method [inline-methods] */
    public NullNode m103747nullNode() {
        return NullNode.getInstance();
    }

    public ObjectNode objectNode() {
        return new ObjectNode(this);
    }

    public ValueNode pojoNode(Object obj) {
        return new POJONode(obj);
    }

    public ValueNode rawValueNode(C6497n c6497n) {
        return new POJONode(c6497n);
    }

    /* JADX INFO: renamed from: textNode, reason: merged with bridge method [inline-methods] */
    public TextNode m103754textNode(String str) {
        return TextNode.valueOf(str);
    }

    public JsonNodeFactory() {
        this(false);
    }

    /* JADX INFO: renamed from: binaryNode, reason: merged with bridge method [inline-methods] */
    public BinaryNode m103744binaryNode(byte[] bArr) {
        return BinaryNode.valueOf(bArr);
    }

    public AbstractC6391f missingNode() {
        return MissingNode.getInstance();
    }

    /* JADX INFO: renamed from: binaryNode, reason: merged with bridge method [inline-methods] */
    public BinaryNode m103745binaryNode(byte[] bArr, int i11, int i12) {
        return BinaryNode.valueOf(bArr, i11, i12);
    }

    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public NumericNode m103748numberNode(byte b11) {
        return IntNode.valueOf(b11);
    }

    public ValueNode numberNode(Byte b11) {
        return b11 == null ? m103747nullNode() : IntNode.valueOf(b11.intValue());
    }

    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public NumericNode m103753numberNode(short s11) {
        return ShortNode.valueOf(s11);
    }

    public ValueNode numberNode(Short sh2) {
        return sh2 == null ? m103747nullNode() : ShortNode.valueOf(sh2.shortValue());
    }

    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public NumericNode m103751numberNode(int i11) {
        return IntNode.valueOf(i11);
    }

    public ValueNode numberNode(Integer num) {
        return num == null ? m103747nullNode() : IntNode.valueOf(num.intValue());
    }

    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public NumericNode m103752numberNode(long j11) {
        return LongNode.valueOf(j11);
    }

    public ValueNode numberNode(Long l11) {
        if (l11 == null) {
            return m103747nullNode();
        }
        return LongNode.valueOf(l11.longValue());
    }

    public ValueNode numberNode(BigInteger bigInteger) {
        if (bigInteger == null) {
            return m103747nullNode();
        }
        return BigIntegerNode.valueOf(bigInteger);
    }

    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public NumericNode m103750numberNode(float f11) {
        return FloatNode.valueOf(f11);
    }

    public ValueNode numberNode(Float f11) {
        return f11 == null ? m103747nullNode() : FloatNode.valueOf(f11.floatValue());
    }

    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public NumericNode m103749numberNode(double d11) {
        return DoubleNode.valueOf(d11);
    }

    public ValueNode numberNode(Double d11) {
        return d11 == null ? m103747nullNode() : DoubleNode.valueOf(d11.doubleValue());
    }

    public ValueNode numberNode(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return m103747nullNode();
        }
        if (this._cfgBigDecimalExact) {
            return DecimalNode.valueOf(bigDecimal);
        }
        if (bigDecimal.signum() == 0) {
            return DecimalNode.ZERO;
        }
        try {
            bigDecimal = C6447a.m11724a(bigDecimal);
        } catch (ArithmeticException unused) {
        }
        return DecimalNode.valueOf(bigDecimal);
    }
}
