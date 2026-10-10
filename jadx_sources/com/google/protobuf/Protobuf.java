package com.google.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class Protobuf {
    private static final Protobuf INSTANCE = new Protobuf();
    private final ConcurrentMap<Class<?>, Schema<?>> schemaCache = new ConcurrentHashMap();
    private final SchemaFactory schemaFactory = new ManifestSchemaFactory();

    public <T> void mergeFrom(T t11, Reader reader) throws IOException {
        mergeFrom(t11, reader, ExtensionRegistryLite.getEmptyRegistry());
    }

    public <T> Schema<T> schemaFor(Class<T> cls) {
        Internal.checkNotNull(cls, "messageType");
        Schema<T> schemaCreateSchema = (Schema) this.schemaCache.get(cls);
        if (schemaCreateSchema == null) {
            schemaCreateSchema = this.schemaFactory.createSchema(cls);
            Schema<T> schema = (Schema<T>) registerSchema(cls, schemaCreateSchema);
            if (schema != null) {
                return schema;
            }
        }
        return schemaCreateSchema;
    }

    public static Protobuf getInstance() {
        return INSTANCE;
    }

    public int getTotalSchemaSize() {
        int schemaSize = 0;
        for (Schema<?> schema : this.schemaCache.values()) {
            if (schema instanceof MessageSchema) {
                schemaSize += ((MessageSchema) schema).getSchemaSize();
            }
        }
        return schemaSize;
    }

    public <T> void mergeFrom(T t11, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        schemaFor(t11).mergeFrom(t11, reader, extensionRegistryLite);
    }

    public Schema<?> registerSchema(Class<?> cls, Schema<?> schema) {
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(schema, "schema");
        return this.schemaCache.putIfAbsent(cls, schema);
    }

    @CanIgnoreReturnValue
    public Schema<?> registerSchemaOverride(Class<?> cls, Schema<?> schema) {
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(schema, "schema");
        return this.schemaCache.put(cls, schema);
    }

    private Protobuf() {
    }

    public <T> boolean isInitialized(T t11) {
        return schemaFor(t11).isInitialized(t11);
    }

    public <T> void makeImmutable(T t11) {
        schemaFor(t11).makeImmutable(t11);
    }

    public <T> void writeTo(T t11, Writer writer) throws IOException {
        schemaFor(t11).writeTo(t11, writer);
    }

    public <T> Schema<T> schemaFor(T t11) {
        return schemaFor((Class) t11.getClass());
    }
}
