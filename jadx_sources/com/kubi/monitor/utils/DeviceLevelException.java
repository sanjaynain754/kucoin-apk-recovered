package com.kubi.monitor.utils;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DeviceLevelHelper.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/monitor/utils/DeviceLevelException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "e", "", "(Ljava/lang/Throwable;)V", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class DeviceLevelException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceLevelException(@NotNull Throwable e11) {
        super(e11);
        Intrinsics.checkNotNullParameter(e11, "e");
    }
}
