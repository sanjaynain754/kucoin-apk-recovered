package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.InterfaceC6375j;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes45.dex */
public class ArrayBlockingQueueDeserializer extends CollectionDeserializer {
    private static final long serialVersionUID = 1;

    public ArrayBlockingQueueDeserializer(JavaType javaType, AbstractC6390e<Object> abstractC6390e, AbstractC6428b abstractC6428b, ValueInstantiator valueInstantiator) {
        super(javaType, abstractC6390e, abstractC6428b, valueInstantiator);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
    public Collection<Object> createDefaultInstance(DeserializationContext deserializationContext) throws IOException {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
    public /* bridge */ /* synthetic */ CollectionDeserializer withResolved(AbstractC6390e abstractC6390e, AbstractC6390e abstractC6390e2, AbstractC6428b abstractC6428b, InterfaceC6375j interfaceC6375j, Boolean bool) {
        return withResolved((AbstractC6390e<?>) abstractC6390e, (AbstractC6390e<?>) abstractC6390e2, abstractC6428b, interfaceC6375j, bool);
    }

    public ArrayBlockingQueueDeserializer(JavaType javaType, AbstractC6390e<Object> abstractC6390e, AbstractC6428b abstractC6428b, ValueInstantiator valueInstantiator, AbstractC6390e<Object> abstractC6390e2, InterfaceC6375j interfaceC6375j, Boolean bool) {
        super(javaType, abstractC6390e, abstractC6428b, valueInstantiator, abstractC6390e2, interfaceC6375j, bool);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
    public Collection<Object> _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        if (collection == null) {
            collection = new ArrayList<>();
        }
        Collection<Object> collection_deserializeFromArray = super._deserializeFromArray(jsonParser, deserializationContext, collection);
        return collection_deserializeFromArray.isEmpty() ? new ArrayBlockingQueue(1, false) : new ArrayBlockingQueue(collection_deserializeFromArray.size(), false, collection_deserializeFromArray);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
    public ArrayBlockingQueueDeserializer withResolved(AbstractC6390e<?> abstractC6390e, AbstractC6390e<?> abstractC6390e2, AbstractC6428b abstractC6428b, InterfaceC6375j interfaceC6375j, Boolean bool) {
        return new ArrayBlockingQueueDeserializer(this._containerType, abstractC6390e2, abstractC6428b, this._valueInstantiator, abstractC6390e, interfaceC6375j, bool);
    }

    public ArrayBlockingQueueDeserializer(ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer) {
        super(arrayBlockingQueueDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        return abstractC6428b.deserializeTypedFromArray(jsonParser, deserializationContext);
    }
}
