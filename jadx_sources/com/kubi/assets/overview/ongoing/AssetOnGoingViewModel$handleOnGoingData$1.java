package com.kubi.assets.overview.ongoing;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AssetOnGoingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.overview.ongoing.AssetOnGoingViewModel", m90122f = "AssetOnGoingViewModel.kt", m90123i = {0}, m90124l = {100}, m90125m = "handleOnGoingData", m90126n = {"isSubscribe"}, m90127s = {"Z$0"})
public final class AssetOnGoingViewModel$handleOnGoingData$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetOnGoingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetOnGoingViewModel$handleOnGoingData$1(AssetOnGoingViewModel assetOnGoingViewModel, Continuation<? super AssetOnGoingViewModel$handleOnGoingData$1> continuation) {
        super(continuation);
        this.this$0 = assetOnGoingViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m18728E(false, this);
    }
}
