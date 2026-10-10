package com.kubi.network.api.subscribe.utils;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChannelUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/network/api/subscribe/utils/WaitPeriodException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "msg", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class WaitPeriodException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaitPeriodException(@NotNull String msg, @NotNull Throwable cause) {
        super(msg, cause);
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
