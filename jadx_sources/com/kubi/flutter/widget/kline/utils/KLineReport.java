package com.kubi.flutter.widget.kline.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.p110rn.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.flutter.widget.kline.utils.h, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KLineReport.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fJF\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/utils/KLineReport;", "", "<init>", "()V", "reportSuccess", "", "type", "", "symbol", Constants.BIZ, "periodType", TypedValues.TransitionType.S_DURATION, "", "from", "split", "", "reportError", com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR, "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKLineReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineReport.kt\ncom/kubi/flutter/widget/kline/utils/KLineReport\n+ 2 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n71#2,4:55\n71#2,2:59\n73#2,2:62\n1#3:61\n*S KotlinDebug\n*F\n+ 1 KLineReport.kt\ncom/kubi/flutter/widget/kline/utils/KLineReport\n*L\n17#1:55,4\n38#1:59,2\n38#1:62,2\n*E\n"})
public final class KLineReport {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KLineReport f22495a = new KLineReport();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m24394b(KLineReport kLineReport, String str, String str2, String str3, String str4, String str5, String str6, boolean z11, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            str6 = null;
        }
        kLineReport.m24396a(str, str2, str3, str4, str5, str6, (i11 & 64) != 0 ? false : z11);
    }

    /* JADX INFO: renamed from: a */
    public final void m24396a(@NotNull String type, @NotNull String symbol, @NotNull String biz, @NotNull String periodType, @Nullable String str, @Nullable String str2, boolean z11) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(periodType, "periodType");
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("type", type);
        eventParametersBuilderAcquire.m42393d("host", symbol);
        eventParametersBuilderAcquire.m42393d("path", periodType);
        eventParametersBuilderAcquire.m42393d(Constants.BIZ, biz);
        TechnologyEvent.C19216a.m42397b(eventParametersBuilderAcquire);
        eventParametersBuilderAcquire.m42394e("success", false);
        if (str != null) {
            eventParametersBuilderAcquire.m42393d("error_message", str);
        }
        if (str2 != null) {
            eventParametersBuilderAcquire.m42393d("category", str2);
        }
        if (z11) {
            eventParametersBuilderAcquire.m42393d(JAnalysisConstants.ACCOUNT_EXTRA_ATTR, "split");
        }
        TechnologyEvent.m42388d("kline_open", eventParametersBuilderAcquire);
    }

    /* JADX INFO: renamed from: c */
    public final void m24397c(@NotNull String type, @NotNull String symbol, @NotNull String biz, @NotNull String periodType, long j11, @Nullable String str, boolean z11) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(periodType, "periodType");
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("type", type);
        eventParametersBuilderAcquire.m42393d("host", symbol);
        eventParametersBuilderAcquire.m42393d("path", periodType);
        eventParametersBuilderAcquire.m42393d(Constants.BIZ, biz);
        TechnologyEvent.C19216a.m42397b(eventParametersBuilderAcquire);
        eventParametersBuilderAcquire.m42394e("success", true);
        eventParametersBuilderAcquire.m42396g(TypedValues.TransitionType.S_DURATION, j11);
        if (str != null) {
            eventParametersBuilderAcquire.m42393d("category", str);
        }
        if (z11) {
            eventParametersBuilderAcquire.m42393d(JAnalysisConstants.ACCOUNT_EXTRA_ATTR, "split");
        }
        TechnologyEvent.m42388d("kline_open", eventParametersBuilderAcquire);
    }
}
