package com.tencent.ugc.beauty.decoder;

/* JADX INFO: loaded from: classes2.dex */
public interface Provider<T> {
    T dequeueOutputBuffer();

    void enqueueOutputBuffer(T t11);
}
