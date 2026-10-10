package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.C6301e;
import com.fasterxml.jackson.core.InterfaceC6320l;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.f */
/* JADX INFO: compiled from: JsonNode.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6391f extends InterfaceC6392g.a implements InterfaceC6320l, Iterable<AbstractC6391f> {
    public abstract AbstractC6391f _at(C6301e c6301e);

    public boolean asBoolean(boolean z11) {
        return z11;
    }

    public double asDouble(double d11) {
        return d11;
    }

    public int asInt(int i11) {
        return i11;
    }

    public long asLong(long j11) {
        return j11;
    }

    public abstract String asText();

    public String asText(String str) {
        String strAsText = asText();
        return strAsText == null ? str : strAsText;
    }

    public byte[] binaryValue() throws IOException {
        return null;
    }

    public boolean booleanValue() {
        return false;
    }

    public boolean canConvertToInt() {
        return false;
    }

    public boolean canConvertToLong() {
        return false;
    }

    public abstract <T extends AbstractC6391f> T deepCopy();

    public abstract boolean equals(Object obj);

    public boolean equals(Comparator<AbstractC6391f> comparator, AbstractC6391f abstractC6391f) {
        return comparator.compare(this, abstractC6391f) == 0;
    }

    public abstract AbstractC6391f findParent(String str);

    public final List<AbstractC6391f> findParents(String str) {
        List<AbstractC6391f> listFindParents = findParents(str, null);
        return listFindParents == null ? Collections.EMPTY_LIST : listFindParents;
    }

    public abstract List<AbstractC6391f> findParents(String str, List<AbstractC6391f> list);

    public abstract AbstractC6391f findPath(String str);

    public abstract AbstractC6391f findValue(String str);

    public final List<AbstractC6391f> findValues(String str) {
        List<AbstractC6391f> listFindValues = findValues(str, null);
        return listFindValues == null ? Collections.EMPTY_LIST : listFindValues;
    }

    public abstract List<AbstractC6391f> findValues(String str, List<AbstractC6391f> list);

    public final List<String> findValuesAsText(String str) {
        List<String> listFindValuesAsText = findValuesAsText(str, null);
        return listFindValuesAsText == null ? Collections.EMPTY_LIST : listFindValuesAsText;
    }

    public abstract List<String> findValuesAsText(String str, List<String> list);

    public float floatValue() {
        return 0.0f;
    }

    @Override // 
    public abstract AbstractC6391f get(int i11);

    @Override // 
    public AbstractC6391f get(String str) {
        return null;
    }

    public abstract JsonNodeType getNodeType();

    public boolean has(String str) {
        return get(str) != null;
    }

    public boolean hasNonNull(String str) {
        AbstractC6391f abstractC6391f = get(str);
        return (abstractC6391f == null || abstractC6391f.isNull()) ? false : true;
    }

    public int intValue() {
        return 0;
    }

    public boolean isArray() {
        return false;
    }

    public boolean isBigDecimal() {
        return false;
    }

    public boolean isBigInteger() {
        return false;
    }

    public boolean isDouble() {
        return false;
    }

    public boolean isFloat() {
        return false;
    }

    public boolean isFloatingPointNumber() {
        return false;
    }

    public boolean isInt() {
        return false;
    }

    public boolean isIntegralNumber() {
        return false;
    }

    public boolean isLong() {
        return false;
    }

    public boolean isMissingNode() {
        return false;
    }

    public boolean isObject() {
        return false;
    }

    public boolean isShort() {
        return false;
    }

    public Number numberValue() {
        return null;
    }

    @Override // 
    public abstract AbstractC6391f path(int i11);

    @Override // 
    public abstract AbstractC6391f path(String str);

    public AbstractC6391f required(String str) throws IllegalArgumentException {
        return (AbstractC6391f) _reportRequiredViolation("Node of type `%s` has no fields", getClass().getName());
    }

    public AbstractC6391f requiredAt(String str) throws IllegalArgumentException {
        return requiredAt(C6301e.m10925e(str));
    }

    public short shortValue() {
        return (short) 0;
    }

    public int size() {
        return 0;
    }

    public String textValue() {
        return null;
    }

    public abstract String toString();

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.f$a */
    /* JADX INFO: compiled from: JsonNode.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10367a;

        static {
            int[] iArr = new int[JsonNodeType.values().length];
            f10367a = iArr;
            try {
                iArr[JsonNodeType.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10367a[JsonNodeType.OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10367a[JsonNodeType.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public <T> T _reportRequiredViolation(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public boolean asBoolean() {
        return asBoolean(false);
    }

    public double asDouble() {
        return asDouble(0.0d);
    }

    public int asInt() {
        return asInt(0);
    }

    public long asLong() {
        return asLong(0L);
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.ZERO;
    }

    public BigDecimal decimalValue() {
        return BigDecimal.ZERO;
    }

    public double doubleValue() {
        return 0.0d;
    }

    public boolean has(int i11) {
        return get(i11) != null;
    }

    public final boolean isValueNode() {
        int i11 = a.f10367a[getNodeType().ordinal()];
        return (i11 == 1 || i11 == 2 || i11 == 3) ? false : true;
    }

    public long longValue() {
        return 0L;
    }

    public AbstractC6391f required(int i11) throws IllegalArgumentException {
        return (AbstractC6391f) _reportRequiredViolation("Node of type `%s` has no indexed values", getClass().getName());
    }

    public final AbstractC6391f requiredAt(C6301e c6301e) throws IllegalArgumentException {
        AbstractC6391f abstractC6391f_at = this;
        for (C6301e c6301eM10931k = c6301e; !c6301eM10931k.m10930j(); c6301eM10931k = c6301eM10931k.m10931k()) {
            abstractC6391f_at = abstractC6391f_at._at(c6301eM10931k);
            if (abstractC6391f_at == null) {
                _reportRequiredViolation("No node at '%s' (unmatched part: '%s')", c6301e, c6301eM10931k);
            }
        }
        return abstractC6391f_at;
    }

    public <T extends AbstractC6391f> T with(String str) {
        throw new UnsupportedOperationException("JsonNode not of type ObjectNode (but " + getClass().getName() + "), cannot call with() on it");
    }

    public <T extends AbstractC6391f> T withArray(String str) {
        throw new UnsupportedOperationException("JsonNode not of type ObjectNode (but " + getClass().getName() + "), cannot call withArray() on it");
    }

    /* JADX INFO: renamed from: at, reason: merged with bridge method [inline-methods] */
    public final AbstractC6391f m11429at(C6301e c6301e) {
        if (c6301e.m10930j()) {
            return this;
        }
        AbstractC6391f abstractC6391f_at = _at(c6301e);
        if (abstractC6391f_at == null) {
            return MissingNode.getInstance();
        }
        return abstractC6391f_at.m11429at(c6301e.m10931k());
    }

    public boolean canConvertToExactIntegral() {
        return isIntegralNumber();
    }

    public Iterator<AbstractC6391f> elements() {
        return C6490g.m11950n();
    }

    public Iterator<String> fieldNames() {
        return C6490g.m11950n();
    }

    public Iterator<Map.Entry<String, AbstractC6391f>> fields() {
        return C6490g.m11950n();
    }

    public boolean hasNonNull(int i11) {
        AbstractC6391f abstractC6391f = get(i11);
        return (abstractC6391f == null || abstractC6391f.isNull()) ? false : true;
    }

    public final boolean isBinary() {
        if (getNodeType() == JsonNodeType.BINARY) {
            return true;
        }
        return false;
    }

    public final boolean isBoolean() {
        if (getNodeType() == JsonNodeType.BOOLEAN) {
            return true;
        }
        return false;
    }

    public final boolean isContainerNode() {
        JsonNodeType nodeType = getNodeType();
        if (nodeType != JsonNodeType.OBJECT && nodeType != JsonNodeType.ARRAY) {
            return false;
        }
        return true;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isNull() {
        if (getNodeType() == JsonNodeType.NULL) {
            return true;
        }
        return false;
    }

    public final boolean isNumber() {
        if (getNodeType() == JsonNodeType.NUMBER) {
            return true;
        }
        return false;
    }

    public final boolean isPojo() {
        if (getNodeType() == JsonNodeType.POJO) {
            return true;
        }
        return false;
    }

    public final boolean isTextual() {
        if (getNodeType() == JsonNodeType.STRING) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<AbstractC6391f> iterator() {
        return elements();
    }

    public <T extends AbstractC6391f> T require() throws IllegalArgumentException {
        return (T) _this();
    }

    public <T extends AbstractC6391f> T requireNonNull() throws IllegalArgumentException {
        return (T) _this();
    }

    public String toPrettyString() {
        return toString();
    }

    /* JADX INFO: renamed from: at, reason: merged with bridge method [inline-methods] */
    public final AbstractC6391f m11430at(String str) {
        return m11429at(C6301e.m10925e(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractC6391f> T _this() {
        return this;
    }
}
