package com.kubi.assets.futures.coins;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialList$1 */
/* JADX INFO: compiled from: AssetFuturesCoinsContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel", m90122f = "AssetFuturesCoinsContract.kt", m90123i = {}, m90124l = {160}, m90125m = "fetchFuturesTrialList", m90126n = {}, m90127s = {})
public final class C10079x81c8fa79 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetFuturesCoinsContract$AssetFuturesCoinsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10079x81c8fa79(AssetFuturesCoinsContract$AssetFuturesCoinsViewModel assetFuturesCoinsContract$AssetFuturesCoinsViewModel, Continuation<? super C10079x81c8fa79> continuation) {
        super(continuation);
        this.this$0 = assetFuturesCoinsContract$AssetFuturesCoinsViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m16956A(this);
    }
}
