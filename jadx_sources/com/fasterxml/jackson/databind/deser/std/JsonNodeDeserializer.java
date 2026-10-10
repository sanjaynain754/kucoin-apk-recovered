package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public class JsonNodeDeserializer extends BaseNodeDeserializer<AbstractC6391f> {

    /* JADX INFO: renamed from: b */
    public static final JsonNodeDeserializer f10348b = new JsonNodeDeserializer();

    public static final class ArrayDeserializer extends BaseNodeDeserializer<ArrayNode> {
        protected static final ArrayDeserializer _instance = new ArrayDeserializer();
        private static final long serialVersionUID = 1;

        public ArrayDeserializer() {
            super(ArrayNode.class, Boolean.TRUE);
        }

        public static ArrayDeserializer getInstance() {
            return _instance;
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public ArrayNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.mo10898o0()) {
                JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
                ArrayNode arrayNode = nodeFactory.arrayNode();
                _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, new BaseNodeDeserializer.C6379a(), arrayNode);
                return arrayNode;
            }
            return (ArrayNode) deserializationContext.handleUnexpectedToken(ArrayNode.class, jsonParser);
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public ArrayNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ArrayNode arrayNode) throws IOException {
            if (jsonParser.mo10898o0()) {
                _deserializeContainerNoRecursion(jsonParser, deserializationContext, deserializationContext.getNodeFactory(), new BaseNodeDeserializer.C6379a(), arrayNode);
                return arrayNode;
            }
            return (ArrayNode) deserializationContext.handleUnexpectedToken(ArrayNode.class, jsonParser);
        }
    }

    public static final class ObjectDeserializer extends BaseNodeDeserializer<ObjectNode> {
        protected static final ObjectDeserializer _instance = new ObjectDeserializer();
        private static final long serialVersionUID = 1;

        public ObjectDeserializer() {
            super(ObjectNode.class, Boolean.TRUE);
        }

        public static ObjectDeserializer getInstance() {
            return _instance;
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public ObjectNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
            if (jsonParser.mo10900p0()) {
                ObjectNode objectNode = nodeFactory.objectNode();
                _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, new BaseNodeDeserializer.C6379a(), objectNode);
                return objectNode;
            }
            if (jsonParser.mo10890k0(JsonToken.FIELD_NAME)) {
                return _deserializeObjectAtName(jsonParser, deserializationContext, nodeFactory, new BaseNodeDeserializer.C6379a());
            }
            if (jsonParser.mo10890k0(JsonToken.END_OBJECT)) {
                return nodeFactory.objectNode();
            }
            return (ObjectNode) deserializationContext.handleUnexpectedToken(ObjectNode.class, jsonParser);
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public ObjectNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectNode objectNode) throws IOException {
            if (!jsonParser.mo10900p0() && !jsonParser.mo10890k0(JsonToken.FIELD_NAME)) {
                return (ObjectNode) deserializationContext.handleUnexpectedToken(ObjectNode.class, jsonParser);
            }
            return (ObjectNode) updateObject(jsonParser, deserializationContext, objectNode, new BaseNodeDeserializer.C6379a());
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e, com.fasterxml.jackson.databind.deser.InterfaceC6375j
    public Object getAbsentValue(DeserializationContext deserializationContext) {
        return null;
    }

    public JsonNodeDeserializer() {
        super(AbstractC6391f.class, null);
    }

    public static AbstractC6390e<? extends AbstractC6391f> getDeserializer(Class<?> cls) {
        if (cls == ObjectNode.class) {
            return ObjectDeserializer.getInstance();
        }
        return cls == ArrayNode.class ? ArrayDeserializer.getInstance() : f10348b;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public AbstractC6391f deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        BaseNodeDeserializer.C6379a c6379a = new BaseNodeDeserializer.C6379a();
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        int iMo10891l = jsonParser.mo10891l();
        if (iMo10891l == 1) {
            return _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, c6379a, nodeFactory.objectNode());
        }
        if (iMo10891l == 2) {
            return nodeFactory.objectNode();
        }
        if (iMo10891l != 3) {
            return iMo10891l != 5 ? _deserializeAnyScalar(jsonParser, deserializationContext) : _deserializeObjectAtName(jsonParser, deserializationContext, nodeFactory, c6379a);
        }
        return _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, c6379a, nodeFactory.arrayNode());
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e, com.fasterxml.jackson.databind.deser.InterfaceC6375j
    public AbstractC6391f getNullValue(DeserializationContext deserializationContext) {
        return deserializationContext.getNodeFactory().m103747nullNode();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public /* bridge */ /* synthetic */ Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        return super.deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public /* bridge */ /* synthetic */ boolean isCachable() {
        return super.isCachable();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public /* bridge */ /* synthetic */ LogicalType logicalType() {
        return super.logicalType();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public /* bridge */ /* synthetic */ Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return super.supportsUpdate(deserializationConfig);
    }
}
