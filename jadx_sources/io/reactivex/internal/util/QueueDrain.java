package io.reactivex.internal.util;

import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public interface QueueDrain<T, U> {
    boolean accept(InterfaceC44417c<? super U> interfaceC44417c, T t11);

    boolean cancelled();

    boolean done();

    boolean enter();

    Throwable error();

    int leave(int i11);

    long produced(long j11);

    long requested();
}
