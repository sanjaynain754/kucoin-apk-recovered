package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AbstractC6394i;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.InterfaceC6358c;
import com.fasterxml.jackson.databind.deser.InterfaceC6359d;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;
import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class MapEntryDeserializer extends ContainerDeserializerBase<Map.Entry<Object, Object>> implements InterfaceC6358c {
    private static final long serialVersionUID = 1;
    protected final AbstractC6394i _keyDeserializer;
    protected final AbstractC6390e<Object> _valueDeserializer;
    protected final AbstractC6428b _valueTypeDeserializer;

    public MapEntryDeserializer(JavaType javaType, AbstractC6394i abstractC6394i, AbstractC6390e<Object> abstractC6390e, AbstractC6428b abstractC6428b) {
        super(javaType);
        if (javaType.containedTypeCount() == 2) {
            this._keyDeserializer = abstractC6394i;
            this._valueDeserializer = abstractC6390e;
            this._valueTypeDeserializer = abstractC6428b;
        } else {
            throw new IllegalArgumentException("Missing generic type information for " + javaType);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.fasterxml.jackson.databind.i] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer] */
    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6358c
    public AbstractC6390e<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        ?? CreateContextual;
        Object obj = this._keyDeserializer;
        if (obj == null) {
            CreateContextual = deserializationContext.findKeyDeserializer(this._containerType.containedType(0), beanProperty);
        } else if (obj instanceof InterfaceC6359d) {
            CreateContextual = obj;
            CreateContextual = ((InterfaceC6359d) obj).createContextual(deserializationContext, beanProperty);
        }
        CreateContextual = obj;
        AbstractC6390e<?> abstractC6390eFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._valueDeserializer);
        JavaType javaTypeContainedType = this._containerType.containedType(1);
        AbstractC6390e<?> abstractC6390eFindContextualValueDeserializer = abstractC6390eFindConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(javaTypeContainedType, beanProperty) : deserializationContext.handleSecondaryContextualization(abstractC6390eFindConvertingContentDeserializer, beanProperty, javaTypeContainedType);
        AbstractC6428b abstractC6428bForProperty = this._valueTypeDeserializer;
        if (abstractC6428bForProperty != null) {
            abstractC6428bForProperty = abstractC6428bForProperty.forProperty(beanProperty);
        }
        return withResolved(CreateContextual, abstractC6428bForProperty, abstractC6390eFindContextualValueDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public AbstractC6390e<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JavaType getContentType() {
        return this._containerType.containedType(1);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.Map;
    }

    public MapEntryDeserializer withResolved(AbstractC6394i abstractC6394i, AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e) {
        return (this._keyDeserializer == abstractC6394i && this._valueDeserializer == abstractC6390e && this._valueTypeDeserializer == abstractC6428b) ? this : new MapEntryDeserializer(this, abstractC6394i, abstractC6390e, abstractC6428b);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Map.Entry<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objDeserializeWithType;
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        if (jsonTokenMo10889k == JsonToken.START_OBJECT) {
            jsonTokenMo10889k = jsonParser.mo10905t0();
        } else if (jsonTokenMo10889k != JsonToken.FIELD_NAME && jsonTokenMo10889k != JsonToken.END_OBJECT) {
            if (jsonTokenMo10889k == JsonToken.START_ARRAY) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            return (Map.Entry) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
        }
        if (jsonTokenMo10889k != JsonToken.FIELD_NAME) {
            if (jsonTokenMo10889k == JsonToken.END_OBJECT) {
                return (Map.Entry) deserializationContext.reportInputMismatch(this, "Cannot deserialize a Map.Entry out of empty JSON Object", new Object[0]);
            }
            return (Map.Entry) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        }
        AbstractC6394i abstractC6394i = this._keyDeserializer;
        AbstractC6390e<Object> abstractC6390e = this._valueDeserializer;
        AbstractC6428b abstractC6428b = this._valueTypeDeserializer;
        String strMo10887j = jsonParser.mo10887j();
        Object objDeserializeKey = abstractC6394i.deserializeKey(strMo10887j, deserializationContext);
        try {
            if (jsonParser.mo10905t0() == JsonToken.VALUE_NULL) {
                objDeserializeWithType = abstractC6390e.getNullValue(deserializationContext);
            } else if (abstractC6428b == null) {
                objDeserializeWithType = abstractC6390e.deserialize(jsonParser, deserializationContext);
            } else {
                objDeserializeWithType = abstractC6390e.deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
            }
        } catch (Exception e11) {
            wrapAndThrow(deserializationContext, e11, Map.Entry.class, strMo10887j);
            objDeserializeWithType = null;
        }
        JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
        if (jsonTokenMo10905t0 != JsonToken.END_OBJECT) {
            if (jsonTokenMo10905t0 == JsonToken.FIELD_NAME) {
                deserializationContext.reportInputMismatch(this, "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')", jsonParser.mo10887j());
            } else {
                deserializationContext.reportInputMismatch(this, "Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: " + jsonTokenMo10905t0, new Object[0]);
            }
            return null;
        }
        return new AbstractMap.SimpleEntry(objDeserializeKey, objDeserializeWithType);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        return abstractC6428b.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public MapEntryDeserializer(MapEntryDeserializer mapEntryDeserializer) {
        super(mapEntryDeserializer);
        this._keyDeserializer = mapEntryDeserializer._keyDeserializer;
        this._valueDeserializer = mapEntryDeserializer._valueDeserializer;
        this._valueTypeDeserializer = mapEntryDeserializer._valueTypeDeserializer;
    }

    public MapEntryDeserializer(MapEntryDeserializer mapEntryDeserializer, AbstractC6394i abstractC6394i, AbstractC6390e<Object> abstractC6390e, AbstractC6428b abstractC6428b) {
        super(mapEntryDeserializer);
        this._keyDeserializer = abstractC6394i;
        this._valueDeserializer = abstractC6390e;
        this._valueTypeDeserializer = abstractC6428b;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Map.Entry<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Map.Entry<Object, Object> entry) throws IOException {
        throw new IllegalStateException("Cannot update Map.Entry values");
    }
}
