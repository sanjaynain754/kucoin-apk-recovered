package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public abstract class StdScalarDeserializer<T> extends StdDeserializer<T> {
    private static final long serialVersionUID = 1;

    public StdScalarDeserializer(Class<?> cls) {
        super(cls);
    }

    public StdScalarDeserializer(JavaType javaType) {
        super(javaType);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public AccessPattern getNullAccessPattern() {
        return AccessPattern.ALWAYS_NULL;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.OtherScalar;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    public StdScalarDeserializer(StdScalarDeserializer<?> stdScalarDeserializer) {
        super(stdScalarDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t11) throws IOException {
        deserializationContext.handleBadMerge(this);
        return deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        return abstractC6428b.deserializeTypedFromScalar(jsonParser, deserializationContext);
    }
}
