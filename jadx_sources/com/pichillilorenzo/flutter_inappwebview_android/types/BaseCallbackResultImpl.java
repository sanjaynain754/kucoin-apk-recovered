package com.pichillilorenzo.flutter_inappwebview_android.types;

/* JADX INFO: loaded from: classes59.dex */
public class BaseCallbackResultImpl<T> implements ICallbackResult<T> {
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
    public T decodeResult(Object obj) {
        return null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
    public boolean nonNullSuccess(T t11) {
        return true;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void notImplemented() {
        defaultBehaviour(null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
    public boolean nullSuccess() {
        return true;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void success(Object obj) {
        boolean zNonNullSuccess;
        T tDecodeResult = decodeResult(obj);
        if (tDecodeResult == null) {
            zNonNullSuccess = nullSuccess();
        } else {
            zNonNullSuccess = nonNullSuccess(tDecodeResult);
        }
        if (zNonNullSuccess) {
            defaultBehaviour(tDecodeResult);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
    public void defaultBehaviour(T t11) {
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void error(String str, String str2, Object obj) {
    }
}
