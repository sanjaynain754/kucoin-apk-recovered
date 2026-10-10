package com.facebook.common.time;

import p050c4.InterfaceC4821c;
import p712w3.InterfaceC45704d;

/* JADX INFO: loaded from: classes34.dex */
@InterfaceC45704d
public class AwakeTimeSinceBootClock implements InterfaceC4821c {

    @InterfaceC45704d
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    @InterfaceC45704d
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    private AwakeTimeSinceBootClock() {
    }

    @Override // p050c4.InterfaceC4821c, p050c4.InterfaceC4820b
    @InterfaceC45704d
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @Override // p050c4.InterfaceC4821c, p050c4.InterfaceC4820b
    @InterfaceC45704d
    public long nowNanos() {
        return System.nanoTime();
    }
}
