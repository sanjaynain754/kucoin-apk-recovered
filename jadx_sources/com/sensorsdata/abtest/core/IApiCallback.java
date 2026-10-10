package com.sensorsdata.abtest.core;

/* JADX INFO: loaded from: classes23.dex */
interface IApiCallback<T> {
    void onFailure(int i11, String str);

    void onSuccess(T t11);
}
