package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements TypeAdapterFactory {
    private final ConstructorConstructor constructorConstructor;

    public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        JsonAdapter jsonAdapter = (JsonAdapter) typeToken.getRawType().getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return (TypeAdapter<T>) getTypeAdapter(this.constructorConstructor, gson, typeToken, jsonAdapter);
    }

    public TypeAdapter<?> getTypeAdapter(ConstructorConstructor constructorConstructor, Gson gson, TypeToken<?> typeToken, JsonAdapter jsonAdapter) {
        JsonSerializer jsonSerializer;
        TypeAdapter<?> treeTypeAdapter;
        Object objConstruct = constructorConstructor.get(TypeToken.get((Class) jsonAdapter.value())).construct();
        if (objConstruct instanceof TypeAdapter) {
            treeTypeAdapter = (TypeAdapter) objConstruct;
        } else if (objConstruct instanceof TypeAdapterFactory) {
            treeTypeAdapter = ((TypeAdapterFactory) objConstruct).create(gson, typeToken);
        } else {
            boolean z11 = objConstruct instanceof JsonSerializer;
            if (!z11 && !(objConstruct instanceof JsonDeserializer)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objConstruct.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            JsonDeserializer jsonDeserializer = null;
            if (z11) {
                jsonSerializer = (JsonSerializer) objConstruct;
            } else {
                jsonSerializer = null;
            }
            if (objConstruct instanceof JsonDeserializer) {
                jsonDeserializer = (JsonDeserializer) objConstruct;
            }
            treeTypeAdapter = new TreeTypeAdapter(jsonSerializer, jsonDeserializer, gson, typeToken, null);
        }
        if (treeTypeAdapter != null && jsonAdapter.nullSafe()) {
            return treeTypeAdapter.nullSafe();
        }
        return treeTypeAdapter;
    }
}
