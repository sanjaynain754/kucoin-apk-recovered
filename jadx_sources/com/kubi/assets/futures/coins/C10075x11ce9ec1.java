package com.kubi.assets.futures.coins;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$1 */
/* JADX INFO: compiled from: AssetFuturesCoinsContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel", m90122f = "AssetFuturesCoinsContract.kt", m90123i = {0}, m90124l = {212}, m90125m = "fetchFuturesTrialDetails", m90126n = {"code"}, m90127s = {"L$0"})
public final class C10075x11ce9ec1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetFuturesCoinsContract$AssetFuturesCoinsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10075x11ce9ec1(AssetFuturesCoinsContract$AssetFuturesCoinsViewModel assetFuturesCoinsContract$AssetFuturesCoinsViewModel, Continuation<? super C10075x11ce9ec1> continuation) {
        super(continuation);
        this.this$0 = assetFuturesCoinsContract$AssetFuturesCoinsViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m16959z(null, this);
    }
}
