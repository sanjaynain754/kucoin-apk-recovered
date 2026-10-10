package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.C6301e;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.util.C6497n;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public class ArrayNode extends ContainerNode<ArrayNode> implements Serializable {
    private static final long serialVersionUID = 1;
    private final List<AbstractC6391f> _children;

    public ArrayNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this._children = new ArrayList();
    }

    public ArrayNode add(AbstractC6391f abstractC6391f) {
        if (abstractC6391f == null) {
            abstractC6391f = m103736nullNode();
        }
        _add(abstractC6391f);
        return this;
    }

    public ArrayNode addAll(ArrayNode arrayNode) {
        this._children.addAll(arrayNode._children);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean equals(Comparator<AbstractC6391f> comparator, AbstractC6391f abstractC6391f) {
        if (!(abstractC6391f instanceof ArrayNode)) {
            return false;
        }
        ArrayNode arrayNode = (ArrayNode) abstractC6391f;
        int size = this._children.size();
        if (arrayNode.size() != size) {
            return false;
        }
        List<AbstractC6391f> list = this._children;
        List<AbstractC6391f> list2 = arrayNode._children;
        for (int i11 = 0; i11 < size; i11++) {
            if (!list.get(i11).equals(comparator, list2.get(i11))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.AbstractC6391f
    public AbstractC6391f get(String str) {
        return null;
    }

    public ArrayNode insert(int i11, AbstractC6391f abstractC6391f) {
        if (abstractC6391f == null) {
            abstractC6391f = m103736nullNode();
        }
        _insert(i11, abstractC6391f);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean isArray() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.InterfaceC6392g.a
    public boolean isEmpty(AbstractC6446m abstractC6446m) {
        return this._children.isEmpty();
    }

    public AbstractC6391f set(int i11, AbstractC6391f abstractC6391f) {
        if (abstractC6391f == null) {
            abstractC6391f = m103736nullNode();
        }
        if (i11 >= 0 && i11 < this._children.size()) {
            return this._children.set(i11, abstractC6391f);
        }
        throw new IndexOutOfBoundsException("Illegal index " + i11 + ", array size " + size());
    }

    public ArrayNode _add(AbstractC6391f abstractC6391f) {
        this._children.add(abstractC6391f);
        return this;
    }

    public boolean _childrenEqual(ArrayNode arrayNode) {
        return this._children.equals(arrayNode._children);
    }

    public ArrayNode _insert(int i11, AbstractC6391f abstractC6391f) {
        if (i11 < 0) {
            this._children.add(0, abstractC6391f);
            return this;
        }
        if (i11 >= this._children.size()) {
            this._children.add(abstractC6391f);
            return this;
        }
        this._children.add(i11, abstractC6391f);
        return this;
    }

    public ArrayNode _set(int i11, AbstractC6391f abstractC6391f) {
        if (i11 >= 0 && i11 < this._children.size()) {
            this._children.set(i11, abstractC6391f);
            return this;
        }
        throw new IndexOutOfBoundsException("Illegal index " + i11 + ", array size " + size());
    }

    public ArrayNode addAll(Collection<? extends AbstractC6391f> collection) {
        Iterator<? extends AbstractC6391f> it = collection.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
        return this;
    }

    public ArrayNode addPOJO(Object obj) {
        return _add(obj == null ? m103736nullNode() : pojoNode(obj));
    }

    public ArrayNode addRawValue(C6497n c6497n) {
        return _add(c6497n == null ? m103736nullNode() : rawValueNode(c6497n));
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.InterfaceC6320l
    public JsonToken asToken() {
        return JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public ArrayNode deepCopy() {
        ArrayNode arrayNode = new ArrayNode(this._nodeFactory);
        Iterator<AbstractC6391f> it = this._children.iterator();
        while (it.hasNext()) {
            arrayNode._children.add(it.next().deepCopy());
        }
        return arrayNode;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public Iterator<AbstractC6391f> elements() {
        return this._children.iterator();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public ObjectNode findParent(String str) {
        Iterator<AbstractC6391f> it = this._children.iterator();
        while (it.hasNext()) {
            AbstractC6391f abstractC6391fFindParent = it.next().findParent(str);
            if (abstractC6391fFindParent != null) {
                return (ObjectNode) abstractC6391fFindParent;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public List<AbstractC6391f> findParents(String str, List<AbstractC6391f> list) {
        Iterator<AbstractC6391f> it = this._children.iterator();
        while (it.hasNext()) {
            list = it.next().findParents(str, list);
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public AbstractC6391f findValue(String str) {
        Iterator<AbstractC6391f> it = this._children.iterator();
        while (it.hasNext()) {
            AbstractC6391f abstractC6391fFindValue = it.next().findValue(str);
            if (abstractC6391fFindValue != null) {
                return abstractC6391fFindValue;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public List<AbstractC6391f> findValues(String str, List<AbstractC6391f> list) {
        Iterator<AbstractC6391f> it = this._children.iterator();
        while (it.hasNext()) {
            list = it.next().findValues(str, list);
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public List<String> findValuesAsText(String str, List<String> list) {
        Iterator<AbstractC6391f> it = this._children.iterator();
        while (it.hasNext()) {
            list = it.next().findValuesAsText(str, list);
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public JsonNodeType getNodeType() {
        return JsonNodeType.ARRAY;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this._children.hashCode();
    }

    public ArrayNode insertPOJO(int i11, Object obj) {
        return _insert(i11, obj == null ? m103736nullNode() : pojoNode(obj));
    }

    public ArrayNode insertRawValue(int i11, C6497n c6497n) {
        return _insert(i11, c6497n == null ? m103736nullNode() : rawValueNode(c6497n));
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean isEmpty() {
        return this._children.isEmpty();
    }

    public AbstractC6391f remove(int i11) {
        if (i11 < 0 || i11 >= this._children.size()) {
            return null;
        }
        return this._children.remove(i11);
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode
    public ArrayNode removeAll() {
        this._children.clear();
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.AbstractC6391f
    public AbstractC6391f required(int i11) {
        return (i11 < 0 || i11 >= this._children.size()) ? (AbstractC6391f) _reportRequiredViolation("No value at index #%d [0, %d) of `ArrayNode`", Integer.valueOf(i11), Integer.valueOf(this._children.size())) : this._children.get(i11);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.InterfaceC6392g
    public void serialize(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        List<AbstractC6391f> list = this._children;
        int size = list.size();
        jsonGenerator.mo10849x0(this, size);
        for (int i11 = 0; i11 < size; i11++) {
            ((BaseJsonNode) list.get(i11)).serialize(jsonGenerator, abstractC6446m);
        }
        jsonGenerator.mo10805W();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.InterfaceC6392g
    public void serializeWithType(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        WritableTypeId writableTypeIdMo11695g = abstractC6431e.mo11695g(jsonGenerator, abstractC6431e.m11692d(this, JsonToken.START_ARRAY));
        Iterator<AbstractC6391f> it = this._children.iterator();
        while (it.hasNext()) {
            ((BaseJsonNode) it.next()).serialize(jsonGenerator, abstractC6446m);
        }
        abstractC6431e.mo11696h(jsonGenerator, writableTypeIdMo11695g);
    }

    public ArrayNode setPOJO(int i11, Object obj) {
        return _set(i11, obj == null ? m103736nullNode() : pojoNode(obj));
    }

    public ArrayNode setRawValue(int i11, C6497n c6497n) {
        return _set(i11, c6497n == null ? m103736nullNode() : rawValueNode(c6497n));
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.AbstractC6391f
    public int size() {
        return this._children.size();
    }

    public ArrayNode(JsonNodeFactory jsonNodeFactory, int i11) {
        super(jsonNodeFactory);
        this._children = new ArrayList(i11);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public AbstractC6391f _at(C6301e c6301e) {
        return get(c6301e.m10926f());
    }

    public ArrayNode add(short s11) {
        return _add(m103742numberNode(s11));
    }

    public ArrayNode addArray() {
        ArrayNode arrayNode = arrayNode();
        _add(arrayNode);
        return arrayNode;
    }

    public ArrayNode addNull() {
        return _add(m103736nullNode());
    }

    public ObjectNode addObject() {
        ObjectNode objectNode = objectNode();
        _add(objectNode);
        return objectNode;
    }

    public ArrayNode insert(int i11, short s11) {
        return _insert(i11, m103742numberNode(s11));
    }

    public ArrayNode insertArray(int i11) {
        ArrayNode arrayNode = arrayNode();
        _insert(i11, arrayNode);
        return arrayNode;
    }

    public ArrayNode insertNull(int i11) {
        return _insert(i11, m103736nullNode());
    }

    public ObjectNode insertObject(int i11) {
        ObjectNode objectNode = objectNode();
        _insert(i11, objectNode);
        return objectNode;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public AbstractC6391f path(String str) {
        return MissingNode.getInstance();
    }

    public ArrayNode setNull(int i11) {
        return _set(i11, m103736nullNode());
    }

    public ArrayNode add(Short sh2) {
        return _add(sh2 == null ? m103736nullNode() : m103742numberNode(sh2.shortValue()));
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.AbstractC6391f
    public AbstractC6391f get(int i11) {
        if (i11 < 0 || i11 >= this._children.size()) {
            return null;
        }
        return this._children.get(i11);
    }

    public ArrayNode insert(int i11, Short sh2) {
        return _insert(i11, sh2 == null ? m103736nullNode() : m103742numberNode(sh2.shortValue()));
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public AbstractC6391f path(int i11) {
        if (i11 >= 0 && i11 < this._children.size()) {
            return this._children.get(i11);
        }
        return MissingNode.getInstance();
    }

    public ArrayNode(JsonNodeFactory jsonNodeFactory, List<AbstractC6391f> list) {
        super(jsonNodeFactory);
        this._children = list;
    }

    public ArrayNode add(int i11) {
        return _add(m103740numberNode(i11));
    }

    public ArrayNode insert(int i11, int i12) {
        return _insert(i11, m103740numberNode(i12));
    }

    public ArrayNode set(int i11, short s11) {
        return _set(i11, m103742numberNode(s11));
    }

    public ArrayNode add(Integer num) {
        return _add(num == null ? m103736nullNode() : m103740numberNode(num.intValue()));
    }

    public ArrayNode insert(int i11, Integer num) {
        return _insert(i11, num == null ? m103736nullNode() : m103740numberNode(num.intValue()));
    }

    public ArrayNode set(int i11, Short sh2) {
        return _set(i11, sh2 == null ? m103736nullNode() : m103742numberNode(sh2.shortValue()));
    }

    public ArrayNode add(long j11) {
        return _add(m103741numberNode(j11));
    }

    public ArrayNode insert(int i11, long j11) {
        return _insert(i11, m103741numberNode(j11));
    }

    public ArrayNode set(int i11, int i12) {
        return _set(i11, m103740numberNode(i12));
    }

    public ArrayNode add(Long l11) {
        return _add(l11 == null ? m103736nullNode() : m103741numberNode(l11.longValue()));
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ArrayNode)) {
            return this._children.equals(((ArrayNode) obj)._children);
        }
        return false;
    }

    public ArrayNode insert(int i11, Long l11) {
        return _insert(i11, l11 == null ? m103736nullNode() : m103741numberNode(l11.longValue()));
    }

    public ArrayNode set(int i11, Integer num) {
        return _set(i11, num == null ? m103736nullNode() : m103740numberNode(num.intValue()));
    }

    public ArrayNode add(float f11) {
        return _add(m103739numberNode(f11));
    }

    public ArrayNode insert(int i11, float f11) {
        return _insert(i11, m103739numberNode(f11));
    }

    public ArrayNode set(int i11, long j11) {
        return _set(i11, m103741numberNode(j11));
    }

    public ArrayNode add(Float f11) {
        return _add(f11 == null ? m103736nullNode() : m103739numberNode(f11.floatValue()));
    }

    public ArrayNode insert(int i11, Float f11) {
        return _insert(i11, f11 == null ? m103736nullNode() : m103739numberNode(f11.floatValue()));
    }

    public ArrayNode set(int i11, Long l11) {
        return _set(i11, l11 == null ? m103736nullNode() : m103741numberNode(l11.longValue()));
    }

    public ArrayNode add(double d11) {
        return _add(m103738numberNode(d11));
    }

    public ArrayNode insert(int i11, double d11) {
        return _insert(i11, m103738numberNode(d11));
    }

    public ArrayNode set(int i11, float f11) {
        return _set(i11, m103739numberNode(f11));
    }

    public ArrayNode add(Double d11) {
        return _add(d11 == null ? m103736nullNode() : m103738numberNode(d11.doubleValue()));
    }

    public ArrayNode insert(int i11, Double d11) {
        return _insert(i11, d11 == null ? m103736nullNode() : m103738numberNode(d11.doubleValue()));
    }

    public ArrayNode set(int i11, Float f11) {
        return _set(i11, f11 == null ? m103736nullNode() : m103739numberNode(f11.floatValue()));
    }

    public ArrayNode add(BigDecimal bigDecimal) {
        return _add(bigDecimal == null ? m103736nullNode() : numberNode(bigDecimal));
    }

    public ArrayNode insert(int i11, BigDecimal bigDecimal) {
        return _insert(i11, bigDecimal == null ? m103736nullNode() : numberNode(bigDecimal));
    }

    public ArrayNode set(int i11, double d11) {
        return _set(i11, m103738numberNode(d11));
    }

    public ArrayNode add(BigInteger bigInteger) {
        return _add(bigInteger == null ? m103736nullNode() : numberNode(bigInteger));
    }

    public ArrayNode insert(int i11, BigInteger bigInteger) {
        return _insert(i11, bigInteger == null ? m103736nullNode() : numberNode(bigInteger));
    }

    public ArrayNode set(int i11, Double d11) {
        return _set(i11, d11 == null ? m103736nullNode() : m103738numberNode(d11.doubleValue()));
    }

    public ArrayNode add(String str) {
        return _add(str == null ? m103736nullNode() : m103743textNode(str));
    }

    public ArrayNode insert(int i11, String str) {
        return _insert(i11, str == null ? m103736nullNode() : m103743textNode(str));
    }

    public ArrayNode set(int i11, BigDecimal bigDecimal) {
        return _set(i11, bigDecimal == null ? m103736nullNode() : numberNode(bigDecimal));
    }

    public ArrayNode add(boolean z11) {
        return _add(m103735booleanNode(z11));
    }

    public ArrayNode insert(int i11, boolean z11) {
        return _insert(i11, m103735booleanNode(z11));
    }

    public ArrayNode set(int i11, BigInteger bigInteger) {
        return _set(i11, bigInteger == null ? m103736nullNode() : numberNode(bigInteger));
    }

    public ArrayNode add(Boolean bool) {
        return _add(bool == null ? m103736nullNode() : m103735booleanNode(bool.booleanValue()));
    }

    public ArrayNode insert(int i11, Boolean bool) {
        if (bool == null) {
            return insertNull(i11);
        }
        return _insert(i11, m103735booleanNode(bool.booleanValue()));
    }

    public ArrayNode set(int i11, String str) {
        return _set(i11, str == null ? m103736nullNode() : m103743textNode(str));
    }

    public ArrayNode add(byte[] bArr) {
        return _add(bArr == null ? m103736nullNode() : m103733binaryNode(bArr));
    }

    public ArrayNode set(int i11, boolean z11) {
        return _set(i11, m103735booleanNode(z11));
    }

    public ArrayNode insert(int i11, byte[] bArr) {
        if (bArr == null) {
            return insertNull(i11);
        }
        return _insert(i11, m103733binaryNode(bArr));
    }

    public ArrayNode set(int i11, Boolean bool) {
        return _set(i11, bool == null ? m103736nullNode() : m103735booleanNode(bool.booleanValue()));
    }

    public ArrayNode set(int i11, byte[] bArr) {
        return _set(i11, bArr == null ? m103736nullNode() : m103733binaryNode(bArr));
    }
}
