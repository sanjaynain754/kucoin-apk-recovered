package com.kubi.assets.service;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AssetsHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.service.AssetsHelper", m90122f = "AssetsHelper.kt", m90123i = {0}, m90124l = {503}, m90125m = "fetchB2cConfig", m90126n = {"function"}, m90127s = {"L$0"})
public final class AssetsHelper$fetchB2cConfig$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetsHelper$fetchB2cConfig$1(AssetsHelper assetsHelper, Continuation<? super AssetsHelper$fetchB2cConfig$1> continuation) {
        super(continuation);
        this.this$0 = assetsHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m19161d(null, this);
    }
}
