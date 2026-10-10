package com.kubi.unify.stream;

import com.kubi.unify.entity.UnifyAccountOverviewEntity;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: UnifyNetworkDataSourceImpl.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/unify/entity/UnifyAccountOverviewEntity;", "acc", "value", "Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$OverviewSnapshot;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewData$3", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UnifyNetworkDataSourceImpl$observeOverViewData$3 extends SuspendLambda implements Function3<UnifyAccountOverviewEntity, UnifyNetworkDataSourceImpl.OverviewSnapshot, Continuation<? super UnifyAccountOverviewEntity>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public UnifyNetworkDataSourceImpl$observeOverViewData$3(Continuation<? super UnifyNetworkDataSourceImpl$observeOverViewData$3> continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(UnifyAccountOverviewEntity unifyAccountOverviewEntity, UnifyNetworkDataSourceImpl.OverviewSnapshot overviewSnapshot, Continuation<? super UnifyAccountOverviewEntity> continuation) {
        UnifyNetworkDataSourceImpl$observeOverViewData$3 unifyNetworkDataSourceImpl$observeOverViewData$3 = new UnifyNetworkDataSourceImpl$observeOverViewData$3(continuation);
        unifyNetworkDataSourceImpl$observeOverViewData$3.L$0 = unifyAccountOverviewEntity;
        unifyNetworkDataSourceImpl$observeOverViewData$3.L$1 = overviewSnapshot;
        return unifyNetworkDataSourceImpl$observeOverViewData$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UnifyAccountOverviewEntity unifyAccountOverviewEntity = (UnifyAccountOverviewEntity) this.L$0;
        UnifyNetworkDataSourceImpl.OverviewSnapshot overviewSnapshot = (UnifyNetworkDataSourceImpl.OverviewSnapshot) this.L$1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UnifyAccountOverviewEntity data = overviewSnapshot.getData();
        return (unifyAccountOverviewEntity == null || overviewSnapshot.getIsFromRest() || data.getCollateralCurrencyList() != null) ? data : UnifyAccountOverviewEntity.copy$default(data, null, null, null, null, null, null, null, null, null, null, unifyAccountOverviewEntity.getCollateralCurrencyList(), null, 3071, null);
    }
}
