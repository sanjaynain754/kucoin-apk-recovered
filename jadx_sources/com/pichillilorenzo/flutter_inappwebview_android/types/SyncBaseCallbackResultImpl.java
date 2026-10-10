package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes59.dex */
public class SyncBaseCallbackResultImpl<T> extends BaseCallbackResultImpl<T> {
    public final CountDownLatch latch = new CountDownLatch(1);
    public T result = null;

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
    public void notImplemented() {
        defaultBehaviour(null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
    public void defaultBehaviour(T t11) {
        this.latch.countDown();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
    public void error(String str, String str2, Object obj) {
        this.latch.countDown();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
    public void success(Object obj) {
        boolean zNonNullSuccess;
        T tDecodeResult = decodeResult(obj);
        this.result = tDecodeResult;
        if (tDecodeResult == null) {
            zNonNullSuccess = nullSuccess();
        } else {
            zNonNullSuccess = nonNullSuccess(tDecodeResult);
        }
        if (zNonNullSuccess) {
            defaultBehaviour(tDecodeResult);
        } else {
            this.latch.countDown();
        }
    }
}
