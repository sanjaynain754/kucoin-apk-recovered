package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.InterfaceC6326e;

/* JADX INFO: loaded from: classes45.dex */
public enum StreamWriteFeature implements InterfaceC6326e {
    AUTO_CLOSE_TARGET(JsonGenerator.Feature.AUTO_CLOSE_TARGET),
    AUTO_CLOSE_CONTENT(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT),
    FLUSH_PASSED_TO_STREAM(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM),
    WRITE_BIGDECIMAL_AS_PLAIN(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN),
    STRICT_DUPLICATE_DETECTION(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION),
    IGNORE_UNKNOWN(JsonGenerator.Feature.IGNORE_UNKNOWN);

    private final boolean _defaultState;
    private final JsonGenerator.Feature _mappedFeature;
    private final int _mask;

    @Override // com.fasterxml.jackson.core.util.InterfaceC6326e
    public boolean enabledByDefault() {
        return this._defaultState;
    }

    public boolean enabledIn(int i11) {
        return (i11 & this._mask) != 0;
    }

    @Override // com.fasterxml.jackson.core.util.InterfaceC6326e
    public int getMask() {
        return this._mask;
    }

    public JsonGenerator.Feature mappedFeature() {
        return this._mappedFeature;
    }

    StreamWriteFeature(JsonGenerator.Feature feature) {
        this._mappedFeature = feature;
        this._mask = feature.getMask();
        this._defaultState = feature.enabledByDefault();
    }

    public static int collectDefaults() {
        int mask = 0;
        for (StreamWriteFeature streamWriteFeature : values()) {
            if (streamWriteFeature.enabledByDefault()) {
                mask |= streamWriteFeature.getMask();
            }
        }
        return mask;
    }
}
