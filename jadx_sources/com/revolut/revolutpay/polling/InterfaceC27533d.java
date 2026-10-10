package com.revolut.revolutpay.polling;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.revolut.revolutpay.polling.d */
/* JADX INFO: loaded from: classes59.dex */
public interface InterfaceC27533d {
    /* JADX INFO: renamed from: a */
    void mo68261a();

    /* JADX INFO: renamed from: a */
    boolean mo68262a(@NotNull Function0<Unit> function0, long j11, @NotNull TimeUnit timeUnit);

    /* JADX INFO: renamed from: b */
    boolean mo68263b(@NotNull Function0<Unit> function0);

    /* JADX INFO: renamed from: c */
    boolean mo68264c(@NotNull Function0<Unit> function0);

    void pause();

    void stop();
}
