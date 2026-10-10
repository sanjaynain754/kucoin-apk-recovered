package com.kubi.kucoin.utils;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.kucoin.utils.p, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CannotDeliverBroadcastExceptionFix.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kucoin/utils/CannotDeliverBroadcastExceptionFix;", "", "<init>", "()V", "fix", "", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CannotDeliverBroadcastExceptionFix {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final CannotDeliverBroadcastExceptionFix f28590a = new CannotDeliverBroadcastExceptionFix();

    /* JADX INFO: renamed from: a */
    public final void m33154a() {
        Thread.setDefaultUncaughtExceptionHandler(new CustomUncaughtExceptionHandler(Thread.getDefaultUncaughtExceptionHandler()));
    }
}
