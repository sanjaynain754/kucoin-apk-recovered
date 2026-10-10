package com.kubi.widget.web.startup;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.widget.web.startup.k, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KWebStartupPolicy.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/widget/web/startup/KWebStartupPolicy;", "", "<init>", "()V", "isParallelEnabled", "", "configProvider", "Lkotlin/Function0;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KWebStartupPolicy {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KWebStartupPolicy f55243a = new KWebStartupPolicy();

    /* JADX INFO: renamed from: a */
    public final boolean m67408a(@NotNull Function0<Boolean> configProvider) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(configProvider.invoke());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return Intrinsics.areEqual(objM103844constructorimpl, Boolean.TRUE);
    }
}
