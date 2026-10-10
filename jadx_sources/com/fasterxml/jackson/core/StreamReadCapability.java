package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.InterfaceC6326e;

/* JADX INFO: loaded from: classes45.dex */
public enum StreamReadCapability implements InterfaceC6326e {
    DUPLICATE_PROPERTIES(false),
    SCALARS_AS_OBJECTS(false),
    UNTYPED_SCALARS(false);

    private final boolean _defaultState;
    private final int _mask = 1 << ordinal();

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

    StreamReadCapability(boolean z11) {
        this._defaultState = z11;
    }
}
