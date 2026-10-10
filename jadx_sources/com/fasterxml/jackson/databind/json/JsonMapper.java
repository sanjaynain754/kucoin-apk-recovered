package com.fasterxml.jackson.databind.json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.json.JsonWriteFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.AbstractC6346d;
import com.fasterxml.jackson.databind.cfg.C6347e;

/* JADX INFO: loaded from: classes45.dex */
public class JsonMapper extends ObjectMapper {
    private static final long serialVersionUID = 1;

    public JsonMapper() {
        this(new JsonFactory());
    }

    public static C6425a builder() {
        return new C6425a(new JsonMapper());
    }

    public boolean isEnabled(JsonReadFeature jsonReadFeature) {
        return isEnabled(jsonReadFeature.mappedFeature());
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.json.JsonMapper$a */
    public static class C6425a extends AbstractC6346d<JsonMapper, C6425a> {
        public C6425a(JsonMapper jsonMapper) {
            super(jsonMapper);
        }
    }

    public JsonMapper(JsonFactory jsonFactory) {
        super(jsonFactory);
    }

    public static C6425a builder(JsonFactory jsonFactory) {
        return new C6425a(new JsonMapper(jsonFactory));
    }

    @Override // com.fasterxml.jackson.databind.ObjectMapper
    public JsonMapper copy() {
        _checkInvalidCopy(JsonMapper.class);
        return new JsonMapper(this);
    }

    @Override // com.fasterxml.jackson.databind.ObjectMapper, com.fasterxml.jackson.core.AbstractC6304g
    public JsonFactory getFactory() {
        return this._jsonFactory;
    }

    public boolean isEnabled(JsonWriteFeature jsonWriteFeature) {
        return isEnabled(jsonWriteFeature.mappedFeature());
    }

    public C6425a rebuild() {
        return new C6425a(copy());
    }

    @Override // com.fasterxml.jackson.databind.ObjectMapper, com.fasterxml.jackson.core.AbstractC6304g
    public Version version() {
        return C6347e.f10215a;
    }

    public JsonMapper(JsonMapper jsonMapper) {
        super(jsonMapper);
    }
}
