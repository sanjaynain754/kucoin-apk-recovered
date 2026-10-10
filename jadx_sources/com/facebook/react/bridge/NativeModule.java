package com.facebook.react.bridge;

import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC44695a
public interface NativeModule {
    default boolean canOverrideExistingModule() {
        return false;
    }

    String getName();

    void initialize();

    void invalidate();

    @Deprecated(forRemoval = true, since = "Use invalidate method instead")
    default void onCatalystInstanceDestroy() {
    }
}
