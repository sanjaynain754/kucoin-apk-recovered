package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC44695a
public abstract class JavaScriptExecutor {
    private final HybridData mHybridData;

    public abstract String getName();

    public void close() {
        this.mHybridData.resetNative();
    }

    public JavaScriptExecutor(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
