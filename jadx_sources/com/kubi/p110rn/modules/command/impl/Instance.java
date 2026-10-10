package com.kubi.p110rn.modules.command.impl;

import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: AppSessionRefreshCommand.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/rn/modules/command/impl/Instance;", "", "<init>", "()V", "refreshSession", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getRefreshSession", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Instance {

    @NotNull
    public static final Instance INSTANCE = new Instance();

    @NotNull
    private static final AtomicBoolean refreshSession = new AtomicBoolean(false);

    @NotNull
    public final AtomicBoolean getRefreshSession() {
        return refreshSession;
    }

    private Instance() {
    }
}
