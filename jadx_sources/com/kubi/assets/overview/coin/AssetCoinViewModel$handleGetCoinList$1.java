package com.kubi.assets.overview.coin;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AssetCoinViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.overview.coin.AssetCoinViewModel", m90122f = "AssetCoinViewModel.kt", m90123i = {1, 1}, m90124l = {141, 156}, m90125m = "handleGetCoinList", m90126n = {"delistList", "delistedList"}, m90127s = {"L$0", "L$1"})
public final class AssetCoinViewModel$handleGetCoinList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetCoinViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetCoinViewModel$handleGetCoinList$1(AssetCoinViewModel assetCoinViewModel, Continuation<? super AssetCoinViewModel$handleGetCoinList$1> continuation) {
        super(continuation);
        this.this$0 = assetCoinViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m18473L(this);
    }
}
