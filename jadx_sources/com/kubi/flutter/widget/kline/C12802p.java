package com.kubi.flutter.widget.kline;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.flutter.widget.kline.p */
/* JADX INFO: compiled from: KLineTypeCdnExtension.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0082\b\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006\u001a\u0012\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006¨\u0006\n"}, m90084d2 = {"cdnSectionTime", "", "Lcom/kubi/flutter/widget/kline/KLineType;", "getCdnRange", "Lcom/kubi/flutter/widget/kline/KLineCdnRange;", "currentTime", "", "getCdnCandleCount", "time", "getCdnPreviousTime", "LKLineWidget_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKLineTypeCdnExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineTypeCdnExtension.kt\ncom/kubi/flutter/widget/kline/KLineTypeCdnExtensionKt\n*L\n1#1,48:1\n6#1:49\n6#1:50\n6#1:51\n*S KotlinDebug\n*F\n+ 1 KLineTypeCdnExtension.kt\ncom/kubi/flutter/widget/kline/KLineTypeCdnExtensionKt\n*L\n21#1:49\n35#1:50\n47#1:51\n*E\n"})
public final class C12802p {
    /* JADX INFO: renamed from: a */
    public static final long m24366a(@NotNull KLineType kLineType, long j11) {
        Intrinsics.checkNotNullParameter(kLineType, "<this>");
        return (j11 % ((long) (kLineType.getPeriod() * kLineType.getPageSize()))) / ((long) kLineType.getPeriod());
    }

    /* JADX INFO: renamed from: b */
    public static final long m24367b(@NotNull KLineType kLineType, long j11) {
        Intrinsics.checkNotNullParameter(kLineType, "<this>");
        return j11 - ((long) (kLineType.getPeriod() * kLineType.getPageSize()));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final KLineCdnRange m24368c(@NotNull KLineType kLineType, long j11) {
        Intrinsics.checkNotNullParameter(kLineType, "<this>");
        long period = kLineType.getPeriod() * kLineType.getPageSize();
        long j12 = j11 - (j11 % period);
        return new KLineCdnRange(j12, period + j12);
    }
}
