package com.kubi.p072ad.service;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SplashAdReview.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.ad.service.SplashAdReviewKt", m90122f = "SplashAdReview.kt", m90123i = {0}, m90124l = {20}, m90125m = "isSplashAdEnabled", m90126n = {"getCachedExperimentResult"}, m90127s = {"L$0"})
public final class SplashAdReviewKt$isSplashAdEnabled$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SplashAdReviewKt.m14678a(null, this);
    }

    public SplashAdReviewKt$isSplashAdEnabled$1(Continuation<? super SplashAdReviewKt$isSplashAdEnabled$1> continuation) {
        super(continuation);
    }
}
