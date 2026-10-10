package org.springframework.http.converter.json;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import wh0.AbstractC45837e;

/* JADX INFO: loaded from: classes61.dex */
class GsonBuilderUtils$Base64TypeAdapter implements JsonSerializer<byte[]>, JsonDeserializer<byte[]> {
    @Override // com.google.gson.JsonSerializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JsonElement serialize(byte[] bArr, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(AbstractC45837e.m101257d(bArr));
    }

    private GsonBuilderUtils$Base64TypeAdapter() {
    }

    @Override // com.google.gson.JsonDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return AbstractC45837e.m101255b(jsonElement.getAsString());
    }
}
