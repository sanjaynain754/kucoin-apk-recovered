package com.pichillilorenzo.flutter_inappwebview_android.types;

import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: loaded from: classes59.dex */
public interface ICallbackResult<T> extends MethodChannel.Result {
    T decodeResult(Object obj);

    void defaultBehaviour(T t11);

    boolean nonNullSuccess(T t11);

    boolean nullSuccess();
}
