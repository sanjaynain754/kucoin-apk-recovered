package com.kubi.assets.overview.coin;

import com.kubi.assets.AssetsLog;
import com.kubi.assets.entity.SpotWSEntity;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: AssetCoinViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/kubi/assets/entity/SpotWSEntity;", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.overview.coin.AssetCoinViewModel$subscribeSpotWS$1$1$1", m90122f = "AssetCoinViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AssetCoinViewModel$subscribeSpotWS$1$1$1 extends SuspendLambda implements Function3<InterfaceC41635f<? super SpotWSEntity>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public AssetCoinViewModel$subscribeSpotWS$1$1$1(Continuation<? super AssetCoinViewModel$subscribeSpotWS$1$1$1> continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(InterfaceC41635f<? super SpotWSEntity> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
        AssetCoinViewModel$subscribeSpotWS$1$1$1 assetCoinViewModel$subscribeSpotWS$1$1$1 = new AssetCoinViewModel$subscribeSpotWS$1$1$1(continuation);
        assetCoinViewModel$subscribeSpotWS$1$1$1.L$0 = th2;
        return assetCoinViewModel$subscribeSpotWS$1$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th2 = (Throwable) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AssetsLog.Home.m15235e(th2);
        return Unit.INSTANCE;
    }
}
