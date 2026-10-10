package com.facebook.react.bridge;

import com.facebook.jni.HybridClassBase;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC44695a
public class CxxCallbackImpl extends HybridClassBase implements Callback {
    private native void nativeInvoke(NativeArray nativeArray);

    @InterfaceC44695a
    private CxxCallbackImpl() {
    }

    @Override // com.facebook.react.bridge.Callback
    public void invoke(Object... objArr) {
        nativeInvoke(Arguments.fromJavaArgs(objArr));
    }
}
