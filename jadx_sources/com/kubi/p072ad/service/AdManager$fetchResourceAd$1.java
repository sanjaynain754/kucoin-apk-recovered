package com.kubi.p072ad.service;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AdManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.ad.service.AdManager", m90122f = "AdManager.kt", m90123i = {0}, m90124l = {140}, m90125m = "fetchResourceAd", m90126n = {"code"}, m90127s = {"L$0"})
public final class AdManager$fetchResourceAd$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdManager$fetchResourceAd$1(AdManager adManager, Continuation<? super AdManager$fetchResourceAd$1> continuation) {
        super(continuation);
        this.this$0 = adManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m14650c(null, this);
    }
}
