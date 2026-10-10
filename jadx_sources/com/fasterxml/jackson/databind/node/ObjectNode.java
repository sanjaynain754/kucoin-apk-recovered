package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.C6301e;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.util.C6497n;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
public class ObjectNode extends ContainerNode<ObjectNode> implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Map<String, AbstractC6391f> _children;

    public ObjectNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this._children = new LinkedHashMap();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean equals(Comparator<AbstractC6391f> comparator, AbstractC6391f abstractC6391f) {
        if (!(abstractC6391f instanceof ObjectNode)) {
            return false;
        }
        Map<String, AbstractC6391f> map = this._children;
        Map<String, AbstractC6391f> map2 = ((ObjectNode) abstractC6391f)._children;
        if (map2.size() != map.size()) {
            return false;
        }
        for (Map.Entry<String, AbstractC6391f> entry : map.entrySet()) {
            AbstractC6391f abstractC6391f2 = map2.get(entry.getKey());
            if (abstractC6391f2 == null || !entry.getValue().equals(comparator, abstractC6391f2)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.AbstractC6391f
    public AbstractC6391f get(int i11) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.InterfaceC6392g.a
    public boolean isEmpty(AbstractC6446m abstractC6446m) {
        return this._children.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final boolean isObject() {
        return true;
    }

    @Deprecated
    public AbstractC6391f put(String str, AbstractC6391f abstractC6391f) {
        if (abstractC6391f == null) {
            abstractC6391f = m103736nullNode();
        }
        return this._children.put(str, abstractC6391f);
    }

    @Deprecated
    public AbstractC6391f putAll(Map<String, ? extends AbstractC6391f> map) {
        return setAll(map);
    }

    public AbstractC6391f remove(String str) {
        return this._children.remove(str);
    }

    public ObjectNode retain(Collection<String> collection) {
        this._children.keySet().retainAll(collection);
        return this;
    }

    public <T extends AbstractC6391f> T setAll(Map<String, ? extends AbstractC6391f> map) {
        for (Map.Entry<String, ? extends AbstractC6391f> entry : map.entrySet()) {
            AbstractC6391f value = entry.getValue();
            if (value == null) {
                value = m103736nullNode();
            }
            this._children.put(entry.getKey(), value);
        }
        return this;
    }

    public <T extends AbstractC6391f> T without(String str) {
        this._children.remove(str);
        return this;
    }

    public boolean _childrenEqual(ObjectNode objectNode) {
        return this._children.equals(objectNode._children);
    }

    public ObjectNode _put(String str, AbstractC6391f abstractC6391f) {
        this._children.put(str, abstractC6391f);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.InterfaceC6320l
    public JsonToken asToken() {
        return JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public ObjectNode deepCopy() {
        ObjectNode objectNode = new ObjectNode(this._nodeFactory);
        for (Map.Entry<String, AbstractC6391f> entry : this._children.entrySet()) {
            objectNode._children.put(entry.getKey(), entry.getValue().deepCopy());
        }
        return objectNode;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public Iterator<AbstractC6391f> elements() {
        return this._children.values().iterator();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public Iterator<String> fieldNames() {
        return this._children.keySet().iterator();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public Iterator<Map.Entry<String, AbstractC6391f>> fields() {
        return this._children.entrySet().iterator();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public ObjectNode findParent(String str) {
        for (Map.Entry<String, AbstractC6391f> entry : this._children.entrySet()) {
            if (str.equals(entry.getKey())) {
                return this;
            }
            AbstractC6391f abstractC6391fFindParent = entry.getValue().findParent(str);
            if (abstractC6391fFindParent != null) {
                return (ObjectNode) abstractC6391fFindParent;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public List<AbstractC6391f> findParents(String str, List<AbstractC6391f> list) {
        for (Map.Entry<String, AbstractC6391f> entry : this._children.entrySet()) {
            if (str.equals(entry.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(this);
            } else {
                list = entry.getValue().findParents(str, list);
            }
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public AbstractC6391f findValue(String str) {
        for (Map.Entry<String, AbstractC6391f> entry : this._children.entrySet()) {
            if (str.equals(entry.getKey())) {
                return entry.getValue();
            }
            AbstractC6391f abstractC6391fFindValue = entry.getValue().findValue(str);
            if (abstractC6391fFindValue != null) {
                return abstractC6391fFindValue;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public List<AbstractC6391f> findValues(String str, List<AbstractC6391f> list) {
        for (Map.Entry<String, AbstractC6391f> entry : this._children.entrySet()) {
            if (str.equals(entry.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(entry.getValue());
            } else {
                list = entry.getValue().findValues(str, list);
            }
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public List<String> findValuesAsText(String str, List<String> list) {
        for (Map.Entry<String, AbstractC6391f> entry : this._children.entrySet()) {
            if (str.equals(entry.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(entry.getValue().asText());
            } else {
                list = entry.getValue().findValuesAsText(str, list);
            }
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public JsonNodeType getNodeType() {
        return JsonNodeType.OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this._children.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean isEmpty() {
        return this._children.isEmpty();
    }

    @Deprecated
    public AbstractC6391f putAll(ObjectNode objectNode) {
        return setAll(objectNode);
    }

    public AbstractC6391f putIfAbsent(String str, AbstractC6391f abstractC6391f) {
        if (abstractC6391f == null) {
            abstractC6391f = m103736nullNode();
        }
        return this._children.putIfAbsent(str, abstractC6391f);
    }

    public ObjectNode putNull(String str) {
        this._children.put(str, m103736nullNode());
        return this;
    }

    public ObjectNode remove(Collection<String> collection) {
        this._children.keySet().removeAll(collection);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode
    public ObjectNode removeAll() {
        this._children.clear();
        return this;
    }

    public AbstractC6391f replace(String str, AbstractC6391f abstractC6391f) {
        if (abstractC6391f == null) {
            abstractC6391f = m103736nullNode();
        }
        return this._children.put(str, abstractC6391f);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.AbstractC6391f
    public AbstractC6391f required(String str) {
        AbstractC6391f abstractC6391f = this._children.get(str);
        return abstractC6391f != null ? abstractC6391f : (AbstractC6391f) _reportRequiredViolation("No value for property '%s' of `ObjectNode`", str);
    }

    public ObjectNode retain(String... strArr) {
        return retain(Arrays.asList(strArr));
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.InterfaceC6392g
    public void serialize(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        boolean z11 = (abstractC6446m == null || abstractC6446m.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)) ? false : true;
        jsonGenerator.mo10852z0(this);
        for (Map.Entry<String, AbstractC6391f> entry : this._children.entrySet()) {
            BaseJsonNode baseJsonNode = (BaseJsonNode) entry.getValue();
            if (!z11 || !baseJsonNode.isArray() || !baseJsonNode.isEmpty(abstractC6446m)) {
                jsonGenerator.mo10810a0(entry.getKey());
                baseJsonNode.serialize(jsonGenerator, abstractC6446m);
            }
        }
        jsonGenerator.mo10806X();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.InterfaceC6392g
    public void serializeWithType(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        boolean z11 = (abstractC6446m == null || abstractC6446m.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)) ? false : true;
        WritableTypeId writableTypeIdMo11695g = abstractC6431e.mo11695g(jsonGenerator, abstractC6431e.m11692d(this, JsonToken.START_OBJECT));
        for (Map.Entry<String, AbstractC6391f> entry : this._children.entrySet()) {
            BaseJsonNode baseJsonNode = (BaseJsonNode) entry.getValue();
            if (!z11 || !baseJsonNode.isArray() || !baseJsonNode.isEmpty(abstractC6446m)) {
                jsonGenerator.mo10810a0(entry.getKey());
                baseJsonNode.serialize(jsonGenerator, abstractC6446m);
            }
        }
        abstractC6431e.mo11696h(jsonGenerator, writableTypeIdMo11695g);
    }

    public <T extends AbstractC6391f> T set(String str, AbstractC6391f abstractC6391f) {
        if (abstractC6391f == null) {
            abstractC6391f = m103736nullNode();
        }
        this._children.put(str, abstractC6391f);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.AbstractC6391f
    public int size() {
        return this._children.size();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public ObjectNode with(String str) {
        AbstractC6391f abstractC6391f = this._children.get(str);
        if (abstractC6391f == null) {
            ObjectNode objectNode = objectNode();
            this._children.put(str, objectNode);
            return objectNode;
        }
        if (abstractC6391f instanceof ObjectNode) {
            return (ObjectNode) abstractC6391f;
        }
        throw new UnsupportedOperationException("Property '" + str + "' has value that is not of type ObjectNode (but " + abstractC6391f.getClass().getName() + ")");
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public ArrayNode withArray(String str) {
        AbstractC6391f abstractC6391f = this._children.get(str);
        if (abstractC6391f == null) {
            ArrayNode arrayNode = arrayNode();
            this._children.put(str, arrayNode);
            return arrayNode;
        }
        if (abstractC6391f instanceof ArrayNode) {
            return (ArrayNode) abstractC6391f;
        }
        throw new UnsupportedOperationException("Property '" + str + "' has value that is not of type ArrayNode (but " + abstractC6391f.getClass().getName() + ")");
    }

    public <T extends AbstractC6391f> T without(Collection<String> collection) {
        this._children.keySet().removeAll(collection);
        return this;
    }

    public ObjectNode(JsonNodeFactory jsonNodeFactory, Map<String, AbstractC6391f> map) {
        super(jsonNodeFactory);
        this._children = map;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public AbstractC6391f _at(C6301e c6301e) {
        return get(c6301e.m10927g());
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public AbstractC6391f path(int i11) {
        return MissingNode.getInstance();
    }

    public ObjectNode put(String str, short s11) {
        return _put(str, m103742numberNode(s11));
    }

    public ArrayNode putArray(String str) {
        ArrayNode arrayNode = arrayNode();
        _put(str, arrayNode);
        return arrayNode;
    }

    public ObjectNode putObject(String str) {
        ObjectNode objectNode = objectNode();
        _put(str, objectNode);
        return objectNode;
    }

    public ObjectNode putPOJO(String str, Object obj) {
        return _put(str, pojoNode(obj));
    }

    public ObjectNode putRawValue(String str, C6497n c6497n) {
        return _put(str, rawValueNode(c6497n));
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.AbstractC6391f
    public AbstractC6391f get(String str) {
        return this._children.get(str);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public AbstractC6391f path(String str) {
        AbstractC6391f abstractC6391f = this._children.get(str);
        return abstractC6391f != null ? abstractC6391f : MissingNode.getInstance();
    }

    public ObjectNode put(String str, Short sh2) {
        AbstractC6391f abstractC6391fNumberNode;
        if (sh2 == null) {
            abstractC6391fNumberNode = m103736nullNode();
        } else {
            abstractC6391fNumberNode = m103742numberNode(sh2.shortValue());
        }
        return _put(str, abstractC6391fNumberNode);
    }

    public <T extends AbstractC6391f> T setAll(ObjectNode objectNode) {
        this._children.putAll(objectNode._children);
        return this;
    }

    public ObjectNode put(String str, int i11) {
        return _put(str, m103740numberNode(i11));
    }

    public ObjectNode put(String str, Integer num) {
        AbstractC6391f abstractC6391fNumberNode;
        if (num == null) {
            abstractC6391fNumberNode = m103736nullNode();
        } else {
            abstractC6391fNumberNode = m103740numberNode(num.intValue());
        }
        return _put(str, abstractC6391fNumberNode);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ObjectNode)) {
            return _childrenEqual((ObjectNode) obj);
        }
        return false;
    }

    public ObjectNode put(String str, long j11) {
        return _put(str, m103741numberNode(j11));
    }

    public ObjectNode put(String str, Long l11) {
        AbstractC6391f abstractC6391fNumberNode;
        if (l11 == null) {
            abstractC6391fNumberNode = m103736nullNode();
        } else {
            abstractC6391fNumberNode = m103741numberNode(l11.longValue());
        }
        return _put(str, abstractC6391fNumberNode);
    }

    public ObjectNode put(String str, float f11) {
        return _put(str, m103739numberNode(f11));
    }

    public ObjectNode put(String str, Float f11) {
        AbstractC6391f abstractC6391fNumberNode;
        if (f11 == null) {
            abstractC6391fNumberNode = m103736nullNode();
        } else {
            abstractC6391fNumberNode = m103739numberNode(f11.floatValue());
        }
        return _put(str, abstractC6391fNumberNode);
    }

    public ObjectNode put(String str, double d11) {
        return _put(str, m103738numberNode(d11));
    }

    public ObjectNode put(String str, Double d11) {
        AbstractC6391f abstractC6391fNumberNode;
        if (d11 == null) {
            abstractC6391fNumberNode = m103736nullNode();
        } else {
            abstractC6391fNumberNode = m103738numberNode(d11.doubleValue());
        }
        return _put(str, abstractC6391fNumberNode);
    }

    public ObjectNode put(String str, BigDecimal bigDecimal) {
        ValueNode valueNodeNumberNode;
        if (bigDecimal == null) {
            valueNodeNumberNode = m103736nullNode();
        } else {
            valueNodeNumberNode = numberNode(bigDecimal);
        }
        return _put(str, valueNodeNumberNode);
    }

    public ObjectNode put(String str, BigInteger bigInteger) {
        ValueNode valueNodeNumberNode;
        if (bigInteger == null) {
            valueNodeNumberNode = m103736nullNode();
        } else {
            valueNodeNumberNode = numberNode(bigInteger);
        }
        return _put(str, valueNodeNumberNode);
    }

    public ObjectNode put(String str, String str2) {
        AbstractC6391f abstractC6391fTextNode;
        if (str2 == null) {
            abstractC6391fTextNode = m103736nullNode();
        } else {
            abstractC6391fTextNode = m103743textNode(str2);
        }
        return _put(str, abstractC6391fTextNode);
    }

    public ObjectNode put(String str, boolean z11) {
        return _put(str, m103735booleanNode(z11));
    }

    public ObjectNode put(String str, Boolean bool) {
        AbstractC6391f abstractC6391fBooleanNode;
        if (bool == null) {
            abstractC6391fBooleanNode = m103736nullNode();
        } else {
            abstractC6391fBooleanNode = m103735booleanNode(bool.booleanValue());
        }
        return _put(str, abstractC6391fBooleanNode);
    }

    public ObjectNode put(String str, byte[] bArr) {
        AbstractC6391f abstractC6391fBinaryNode;
        if (bArr == null) {
            abstractC6391fBinaryNode = m103736nullNode();
        } else {
            abstractC6391fBinaryNode = m103733binaryNode(bArr);
        }
        return _put(str, abstractC6391fBinaryNode);
    }
}
