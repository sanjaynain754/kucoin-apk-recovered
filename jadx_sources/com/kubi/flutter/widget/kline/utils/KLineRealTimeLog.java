package com.kubi.flutter.widget.kline.utils;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.flutter.widget.kline.utils.g, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KLineRealTimeLog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/utils/KLineRealTimeLog;", "", "<init>", "()V", "bsInfo", "", "msg", "", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KLineRealTimeLog {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KLineRealTimeLog f22494a = new KLineRealTimeLog();

    /* JADX INFO: renamed from: a */
    public final void m24393a(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        C44128b.m97266j("KLineRealTimeLog", "[kline_bs]" + msg);
    }
}
