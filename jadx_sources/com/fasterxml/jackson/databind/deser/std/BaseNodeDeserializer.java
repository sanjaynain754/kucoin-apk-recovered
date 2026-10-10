package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ContainerNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.C6497n;
import com.tencent.thumbplayer.tcmedia.api.TPErrorCode;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: JsonNodeDeserializer.java */
/* JADX INFO: loaded from: classes45.dex */
abstract class BaseNodeDeserializer<T extends AbstractC6391f> extends StdDeserializer<T> {
    protected final Boolean _supportsUpdates;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer$a */
    /* JADX INFO: compiled from: JsonNodeDeserializer.java */
    public static final class C6379a {

        /* JADX INFO: renamed from: a */
        public ContainerNode[] f10336a;

        /* JADX INFO: renamed from: b */
        public int f10337b;

        /* JADX INFO: renamed from: c */
        public int f10338c;

        /* JADX INFO: renamed from: a */
        public ContainerNode m11388a() {
            int i11 = this.f10337b;
            if (i11 == 0) {
                return null;
            }
            ContainerNode[] containerNodeArr = this.f10336a;
            int i12 = i11 - 1;
            this.f10337b = i12;
            return containerNodeArr[i12];
        }

        /* JADX INFO: renamed from: b */
        public void m11389b(ContainerNode containerNode) {
            int i11 = this.f10337b;
            int i12 = this.f10338c;
            if (i11 < i12) {
                ContainerNode[] containerNodeArr = this.f10336a;
                this.f10337b = i11 + 1;
                containerNodeArr[i11] = containerNode;
                return;
            }
            if (this.f10336a == null) {
                this.f10338c = 10;
                this.f10336a = new ContainerNode[10];
            } else {
                int iMin = i12 + Math.min(TPErrorCode.TP_ERROR_TYPE_DOWNLOAD_PROXY, Math.max(20, i12 >> 1));
                this.f10338c = iMin;
                this.f10336a = (ContainerNode[]) Arrays.copyOf(this.f10336a, iMin);
            }
            ContainerNode[] containerNodeArr2 = this.f10336a;
            int i13 = this.f10337b;
            this.f10337b = i13 + 1;
            containerNodeArr2[i13] = containerNode;
        }
    }

    public final AbstractC6391f _fromInt(JsonParser jsonParser, int i11, JsonNodeFactory jsonNodeFactory) throws IOException {
        if (i11 != 0) {
            return DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(i11) ? jsonNodeFactory.numberNode(jsonParser.mo10895n()) : jsonNodeFactory.m103752numberNode(jsonParser.mo10861O());
        }
        JsonParser.NumberType numberTypeMo10862P = jsonParser.mo10862P();
        if (numberTypeMo10862P == JsonParser.NumberType.INT) {
            return jsonNodeFactory.m103751numberNode(jsonParser.mo10860M());
        }
        return numberTypeMo10862P == JsonParser.NumberType.LONG ? jsonNodeFactory.m103752numberNode(jsonParser.mo10861O()) : jsonNodeFactory.numberNode(jsonParser.mo10895n());
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public boolean isCachable() {
        return true;
    }

    public final ContainerNode<?> _deserializeContainerNoRecursion(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, C6379a c6379a, ContainerNode<?> containerNode) throws IOException {
        AbstractC6391f abstractC6391fM103754textNode;
        JsonNodeFactory jsonNodeFactory2 = jsonNodeFactory;
        int deserializationFeatures = deserializationContext.getDeserializationFeatures() & StdDeserializer.F_MASK_INT_COERCIONS;
        ContainerNode containerNodeObjectNode = containerNode;
        do {
            if (!(containerNodeObjectNode instanceof ObjectNode)) {
                ArrayNode arrayNode = (ArrayNode) containerNodeObjectNode;
                while (true) {
                    JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
                    if (jsonTokenMo10905t0 == null) {
                        jsonTokenMo10905t0 = JsonToken.NOT_AVAILABLE;
                    }
                    switch (jsonTokenMo10905t0.m10917id()) {
                        case 1:
                            c6379a.m11389b(containerNodeObjectNode);
                            containerNodeObjectNode = jsonNodeFactory2.objectNode();
                            arrayNode.add(containerNodeObjectNode);
                            break;
                        case 2:
                        case 5:
                        default:
                            arrayNode.add(_deserializeRareScalar(jsonParser, deserializationContext));
                            break;
                        case 3:
                            c6379a.m11389b(containerNodeObjectNode);
                            containerNodeObjectNode = jsonNodeFactory2.arrayNode();
                            arrayNode.add(containerNodeObjectNode);
                            break;
                        case 4:
                            containerNodeObjectNode = c6379a.m11388a();
                            break;
                        case 6:
                            arrayNode.add(jsonNodeFactory2.m103754textNode(jsonParser.mo10869W()));
                            break;
                        case 7:
                            arrayNode.add(_fromInt(jsonParser, deserializationFeatures, jsonNodeFactory2));
                            break;
                        case 8:
                            arrayNode.add(_fromFloat(jsonParser, deserializationContext, jsonNodeFactory));
                            break;
                        case 9:
                            arrayNode.add(jsonNodeFactory2.m103746booleanNode(true));
                            break;
                        case 10:
                            arrayNode.add(jsonNodeFactory2.m103746booleanNode(false));
                            break;
                        case 11:
                            arrayNode.add(jsonNodeFactory2.m103747nullNode());
                            break;
                    }
                }
            } else {
                ContainerNode containerNode2 = containerNodeObjectNode;
                ObjectNode objectNode = (ObjectNode) containerNodeObjectNode;
                String strMo10903r0 = jsonParser.mo10903r0();
                while (true) {
                    if (strMo10903r0 == null) {
                        containerNodeObjectNode = c6379a.m11388a();
                    } else {
                        JsonToken jsonTokenMo10905t1 = jsonParser.mo10905t0();
                        if (jsonTokenMo10905t1 == null) {
                            jsonTokenMo10905t1 = JsonToken.NOT_AVAILABLE;
                        }
                        int iM10917id = jsonTokenMo10905t1.m10917id();
                        if (iM10917id == 1) {
                            ObjectNode objectNode2 = jsonNodeFactory.objectNode();
                            AbstractC6391f abstractC6391fReplace = objectNode.replace(strMo10903r0, objectNode2);
                            if (abstractC6391fReplace != null) {
                                jsonNodeFactory2 = jsonNodeFactory;
                                _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory2, strMo10903r0, objectNode, abstractC6391fReplace, objectNode2);
                            } else {
                                jsonNodeFactory2 = jsonNodeFactory;
                            }
                            c6379a.m11389b(containerNode2);
                            objectNode = objectNode2;
                            containerNode2 = objectNode;
                        } else if (iM10917id != 3) {
                            switch (iM10917id) {
                                case 6:
                                    abstractC6391fM103754textNode = jsonNodeFactory2.m103754textNode(jsonParser.mo10869W());
                                    break;
                                case 7:
                                    abstractC6391fM103754textNode = _fromInt(jsonParser, deserializationFeatures, jsonNodeFactory2);
                                    break;
                                case 8:
                                    abstractC6391fM103754textNode = _fromFloat(jsonParser, deserializationContext, jsonNodeFactory);
                                    break;
                                case 9:
                                    abstractC6391fM103754textNode = jsonNodeFactory2.m103746booleanNode(true);
                                    break;
                                case 10:
                                    abstractC6391fM103754textNode = jsonNodeFactory2.m103746booleanNode(false);
                                    break;
                                case 11:
                                    abstractC6391fM103754textNode = jsonNodeFactory2.m103747nullNode();
                                    break;
                                default:
                                    abstractC6391fM103754textNode = _deserializeRareScalar(jsonParser, deserializationContext);
                                    break;
                            }
                            AbstractC6391f abstractC6391f = abstractC6391fM103754textNode;
                            AbstractC6391f abstractC6391fReplace2 = objectNode.replace(strMo10903r0, abstractC6391f);
                            if (abstractC6391fReplace2 != null) {
                                _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory2, strMo10903r0, objectNode, abstractC6391fReplace2, abstractC6391f);
                            }
                            jsonNodeFactory2 = jsonNodeFactory;
                        } else {
                            ContainerNode containerNodeArrayNode = jsonNodeFactory.arrayNode();
                            AbstractC6391f abstractC6391fReplace3 = objectNode.replace(strMo10903r0, containerNodeArrayNode);
                            if (abstractC6391fReplace3 != null) {
                                _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, strMo10903r0, objectNode, abstractC6391fReplace3, containerNodeArrayNode);
                            }
                            c6379a.m11389b(containerNode2);
                            jsonNodeFactory2 = jsonNodeFactory;
                            containerNodeObjectNode = containerNodeArrayNode;
                        }
                        strMo10903r0 = jsonParser.mo10903r0();
                    }
                }
            }
        } while (containerNodeObjectNode != null);
        return containerNode;
    }

    public void _handleDuplicateField(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, String str, ObjectNode objectNode, AbstractC6391f abstractC6391f, AbstractC6391f abstractC6391f2) throws IOException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY)) {
            deserializationContext.reportInputMismatch(AbstractC6391f.class, "Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", str);
        }
        if (deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES)) {
            if (abstractC6391f.isArray()) {
                ((ArrayNode) abstractC6391f).add(abstractC6391f2);
                objectNode.replace(str, abstractC6391f);
            } else {
                ArrayNode arrayNode = jsonNodeFactory.arrayNode();
                arrayNode.add(abstractC6391f);
                arrayNode.add(abstractC6391f2);
                objectNode.replace(str, arrayNode);
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._supportsUpdates;
    }

    public BaseNodeDeserializer(Class<T> cls, Boolean bool) {
        super((Class<?>) cls);
        this._supportsUpdates = bool;
    }

    public final AbstractC6391f _deserializeAnyScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        int iMo10891l = jsonParser.mo10891l();
        if (iMo10891l != 2) {
            switch (iMo10891l) {
                case 6:
                    return nodeFactory.m103754textNode(jsonParser.mo10869W());
                case 7:
                    return _fromInt(jsonParser, deserializationContext, nodeFactory);
                case 8:
                    return _fromFloat(jsonParser, deserializationContext, nodeFactory);
                case 9:
                    return nodeFactory.m103746booleanNode(true);
                case 10:
                    return nodeFactory.m103746booleanNode(false);
                case 11:
                    return nodeFactory.m103747nullNode();
                case 12:
                    return _fromEmbedded(jsonParser, deserializationContext);
                default:
                    return (AbstractC6391f) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
            }
        }
        return nodeFactory.objectNode();
    }

    public final ObjectNode _deserializeObjectAtName(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, C6379a c6379a) throws IOException {
        AbstractC6391f abstractC6391f_deserializeContainerNoRecursion;
        ObjectNode objectNode = jsonNodeFactory.objectNode();
        String strMo10887j = jsonParser.mo10887j();
        while (strMo10887j != null) {
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            if (jsonTokenMo10905t0 == null) {
                jsonTokenMo10905t0 = JsonToken.NOT_AVAILABLE;
            }
            int iM10917id = jsonTokenMo10905t0.m10917id();
            if (iM10917id != 1) {
                if (iM10917id != 3) {
                    abstractC6391f_deserializeContainerNoRecursion = _deserializeAnyScalar(jsonParser, deserializationContext);
                } else {
                    abstractC6391f_deserializeContainerNoRecursion = _deserializeContainerNoRecursion(jsonParser, deserializationContext, jsonNodeFactory, c6379a, jsonNodeFactory.arrayNode());
                }
            } else {
                abstractC6391f_deserializeContainerNoRecursion = _deserializeContainerNoRecursion(jsonParser, deserializationContext, jsonNodeFactory, c6379a, jsonNodeFactory.objectNode());
            }
            AbstractC6391f abstractC6391f = abstractC6391f_deserializeContainerNoRecursion;
            AbstractC6391f abstractC6391fReplace = objectNode.replace(strMo10887j, abstractC6391f);
            if (abstractC6391fReplace != null) {
                _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, strMo10887j, objectNode, abstractC6391fReplace, abstractC6391f);
            }
            strMo10887j = jsonParser.mo10903r0();
        }
        return objectNode;
    }

    public final AbstractC6391f _deserializeRareScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int iMo10891l = jsonParser.mo10891l();
        if (iMo10891l != 2) {
            if (iMo10891l != 8) {
                if (iMo10891l != 12) {
                    return (AbstractC6391f) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
                }
                return _fromEmbedded(jsonParser, deserializationContext);
            }
            return _fromFloat(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
        }
        return deserializationContext.getNodeFactory().objectNode();
    }

    public final AbstractC6391f _fromEmbedded(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        Object objMo10858J = jsonParser.mo10858J();
        if (objMo10858J == null) {
            return nodeFactory.m103747nullNode();
        }
        if (objMo10858J.getClass() == byte[].class) {
            return nodeFactory.m103744binaryNode((byte[]) objMo10858J);
        }
        if (objMo10858J instanceof C6497n) {
            return nodeFactory.rawValueNode((C6497n) objMo10858J);
        }
        if (objMo10858J instanceof AbstractC6391f) {
            return (AbstractC6391f) objMo10858J;
        }
        return nodeFactory.pojoNode(objMo10858J);
    }

    public final AbstractC6391f _fromFloat(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        JsonParser.NumberType numberTypeMo10862P = jsonParser.mo10862P();
        if (numberTypeMo10862P == JsonParser.NumberType.BIG_DECIMAL) {
            return jsonNodeFactory.numberNode(jsonParser.mo10855C());
        }
        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            if (jsonParser.mo10902q0()) {
                return jsonNodeFactory.m103749numberNode(jsonParser.mo10857E());
            }
            return jsonNodeFactory.numberNode(jsonParser.mo10855C());
        }
        if (numberTypeMo10862P == JsonParser.NumberType.FLOAT) {
            return jsonNodeFactory.m103750numberNode(jsonParser.mo10859L());
        }
        return jsonNodeFactory.m103749numberNode(jsonParser.mo10857E());
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        return abstractC6428b.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x008c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x009a  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    public final AbstractC6391f updateObject(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectNode objectNode, C6379a c6379a) throws IOException {
        String strMo10887j;
        JsonParser jsonParser2;
        DeserializationContext deserializationContext2;
        C6379a c6379a2;
        int iM10917id;
        AbstractC6391f abstractC6391f_deserializeContainerNoRecursion;
        if (jsonParser.mo10900p0()) {
            strMo10887j = jsonParser.mo10903r0();
        } else {
            if (!jsonParser.mo10890k0(JsonToken.FIELD_NAME)) {
                return deserialize(jsonParser, deserializationContext);
            }
            strMo10887j = jsonParser.mo10887j();
        }
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        while (strMo10887j != null) {
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            AbstractC6391f abstractC6391f = objectNode.get(strMo10887j);
            if (abstractC6391f != null) {
                if (abstractC6391f instanceof ObjectNode) {
                    if (jsonTokenMo10905t0 == JsonToken.START_OBJECT) {
                        AbstractC6391f abstractC6391fUpdateObject = updateObject(jsonParser, deserializationContext, (ObjectNode) abstractC6391f, c6379a);
                        if (abstractC6391fUpdateObject != abstractC6391f) {
                            objectNode.set(strMo10887j, abstractC6391fUpdateObject);
                        }
                        jsonParser2 = jsonParser;
                        deserializationContext2 = deserializationContext;
                        c6379a2 = c6379a;
                    } else {
                        jsonParser2 = jsonParser;
                        deserializationContext2 = deserializationContext;
                        c6379a2 = c6379a;
                        if (jsonTokenMo10905t0 == null) {
                            jsonTokenMo10905t0 = JsonToken.NOT_AVAILABLE;
                        }
                        iM10917id = jsonTokenMo10905t0.m10917id();
                        if (iM10917id != 1) {
                            if (iM10917id != 3) {
                                if (iM10917id != 6) {
                                    if (iM10917id != 7) {
                                        switch (iM10917id) {
                                            case 9:
                                                abstractC6391f_deserializeContainerNoRecursion = nodeFactory.m103746booleanNode(true);
                                                break;
                                            case 10:
                                                abstractC6391f_deserializeContainerNoRecursion = nodeFactory.m103746booleanNode(false);
                                                break;
                                            case 11:
                                                abstractC6391f_deserializeContainerNoRecursion = nodeFactory.m103747nullNode();
                                                break;
                                            default:
                                                abstractC6391f_deserializeContainerNoRecursion = _deserializeRareScalar(jsonParser2, deserializationContext2);
                                                break;
                                        }
                                    } else {
                                        abstractC6391f_deserializeContainerNoRecursion = _fromInt(jsonParser2, deserializationContext2, nodeFactory);
                                    }
                                } else {
                                    abstractC6391f_deserializeContainerNoRecursion = nodeFactory.m103754textNode(jsonParser2.mo10869W());
                                }
                            } else {
                                abstractC6391f_deserializeContainerNoRecursion = _deserializeContainerNoRecursion(jsonParser2, deserializationContext2, nodeFactory, c6379a2, nodeFactory.arrayNode());
                            }
                        } else {
                            abstractC6391f_deserializeContainerNoRecursion = _deserializeContainerNoRecursion(jsonParser2, deserializationContext2, nodeFactory, c6379a2, nodeFactory.objectNode());
                        }
                        objectNode.set(strMo10887j, abstractC6391f_deserializeContainerNoRecursion);
                    }
                } else if (!(abstractC6391f instanceof ArrayNode) || jsonTokenMo10905t0 != JsonToken.START_ARRAY) {
                    jsonParser2 = jsonParser;
                    deserializationContext2 = deserializationContext;
                    c6379a2 = c6379a;
                    if (jsonTokenMo10905t0 == null) {
                        jsonTokenMo10905t0 = JsonToken.NOT_AVAILABLE;
                    }
                    iM10917id = jsonTokenMo10905t0.m10917id();
                    if (iM10917id != 1) {
                        if (iM10917id != 3) {
                            if (iM10917id != 6) {
                                if (iM10917id != 7) {
                                    switch (iM10917id) {
                                        case 9:
                                            abstractC6391f_deserializeContainerNoRecursion = nodeFactory.m103746booleanNode(true);
                                            break;
                                        case 10:
                                            abstractC6391f_deserializeContainerNoRecursion = nodeFactory.m103746booleanNode(false);
                                            break;
                                        case 11:
                                            abstractC6391f_deserializeContainerNoRecursion = nodeFactory.m103747nullNode();
                                            break;
                                        default:
                                            abstractC6391f_deserializeContainerNoRecursion = _deserializeRareScalar(jsonParser2, deserializationContext2);
                                            break;
                                    }
                                } else {
                                    abstractC6391f_deserializeContainerNoRecursion = _fromInt(jsonParser2, deserializationContext2, nodeFactory);
                                }
                            } else {
                                abstractC6391f_deserializeContainerNoRecursion = nodeFactory.m103754textNode(jsonParser2.mo10869W());
                            }
                        } else {
                            abstractC6391f_deserializeContainerNoRecursion = _deserializeContainerNoRecursion(jsonParser2, deserializationContext2, nodeFactory, c6379a2, nodeFactory.arrayNode());
                        }
                    } else {
                        abstractC6391f_deserializeContainerNoRecursion = _deserializeContainerNoRecursion(jsonParser2, deserializationContext2, nodeFactory, c6379a2, nodeFactory.objectNode());
                    }
                    objectNode.set(strMo10887j, abstractC6391f_deserializeContainerNoRecursion);
                } else {
                    ArrayNode arrayNode = (ArrayNode) abstractC6391f;
                    jsonParser2 = jsonParser;
                    deserializationContext2 = deserializationContext;
                    c6379a2 = c6379a;
                    _deserializeContainerNoRecursion(jsonParser2, deserializationContext2, nodeFactory, c6379a2, arrayNode);
                }
            } else {
                jsonParser2 = jsonParser;
                deserializationContext2 = deserializationContext;
                c6379a2 = c6379a;
                if (jsonTokenMo10905t0 == null) {
                    jsonTokenMo10905t0 = JsonToken.NOT_AVAILABLE;
                }
                iM10917id = jsonTokenMo10905t0.m10917id();
                if (iM10917id != 1) {
                    if (iM10917id != 3) {
                        if (iM10917id != 6) {
                            if (iM10917id != 7) {
                                switch (iM10917id) {
                                    case 9:
                                        abstractC6391f_deserializeContainerNoRecursion = nodeFactory.m103746booleanNode(true);
                                        break;
                                    case 10:
                                        abstractC6391f_deserializeContainerNoRecursion = nodeFactory.m103746booleanNode(false);
                                        break;
                                    case 11:
                                        abstractC6391f_deserializeContainerNoRecursion = nodeFactory.m103747nullNode();
                                        break;
                                    default:
                                        abstractC6391f_deserializeContainerNoRecursion = _deserializeRareScalar(jsonParser2, deserializationContext2);
                                        break;
                                }
                            } else {
                                abstractC6391f_deserializeContainerNoRecursion = _fromInt(jsonParser2, deserializationContext2, nodeFactory);
                            }
                        } else {
                            abstractC6391f_deserializeContainerNoRecursion = nodeFactory.m103754textNode(jsonParser2.mo10869W());
                        }
                    } else {
                        abstractC6391f_deserializeContainerNoRecursion = _deserializeContainerNoRecursion(jsonParser2, deserializationContext2, nodeFactory, c6379a2, nodeFactory.arrayNode());
                    }
                } else {
                    abstractC6391f_deserializeContainerNoRecursion = _deserializeContainerNoRecursion(jsonParser2, deserializationContext2, nodeFactory, c6379a2, nodeFactory.objectNode());
                }
                objectNode.set(strMo10887j, abstractC6391f_deserializeContainerNoRecursion);
            }
            strMo10887j = jsonParser2.mo10903r0();
            jsonParser = jsonParser2;
            deserializationContext = deserializationContext2;
            c6379a = c6379a2;
        }
        return objectNode;
    }

    public final AbstractC6391f _fromInt(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        JsonParser.NumberType numberTypeMo10862P;
        int deserializationFeatures = deserializationContext.getDeserializationFeatures();
        if ((StdDeserializer.F_MASK_INT_COERCIONS & deserializationFeatures) != 0) {
            if (DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(deserializationFeatures)) {
                numberTypeMo10862P = JsonParser.NumberType.BIG_INTEGER;
            } else if (DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(deserializationFeatures)) {
                numberTypeMo10862P = JsonParser.NumberType.LONG;
            } else {
                numberTypeMo10862P = jsonParser.mo10862P();
            }
        } else {
            numberTypeMo10862P = jsonParser.mo10862P();
        }
        if (numberTypeMo10862P == JsonParser.NumberType.INT) {
            return jsonNodeFactory.m103751numberNode(jsonParser.mo10860M());
        }
        if (numberTypeMo10862P == JsonParser.NumberType.LONG) {
            return jsonNodeFactory.m103752numberNode(jsonParser.mo10861O());
        }
        return jsonNodeFactory.numberNode(jsonParser.mo10895n());
    }
}
