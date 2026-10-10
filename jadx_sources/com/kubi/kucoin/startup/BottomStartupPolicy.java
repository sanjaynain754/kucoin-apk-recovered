package com.kubi.kucoin.startup;

import com.kubi.kucoin.utils.BottomLottieMode;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kucoin.startup.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BottomStartupPolicy.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kucoin/startup/BottomStartupPolicy;", "", "<init>", "()V", "resolveMode", "Lcom/kubi/kucoin/utils/BottomLottieMode;", "configProvider", "Lkotlin/Function0;", "", "preloadAsset", "", "isDayTheme", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BottomStartupPolicy {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BottomStartupPolicy f28395a = new BottomStartupPolicy();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m32872a(boolean z11) {
        return z11 ? "icon_home_checked.json" : "icon_home_checked-night.json";
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final BottomLottieMode m32873b(@NotNull Function0<Boolean> configProvider) {
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
        return Intrinsics.areEqual(objM103844constructorimpl, Boolean.TRUE) ? BottomLottieMode.ASYNC : BottomLottieMode.LEGACY;
    }
}
