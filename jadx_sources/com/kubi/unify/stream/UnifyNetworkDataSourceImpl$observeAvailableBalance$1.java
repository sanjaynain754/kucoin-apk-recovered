package com.kubi.unify.stream;

import com.kubi.unify.entity.UnifyBalanceEntity;
import java.math.BigDecimal;
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
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/unify/entity/UnifyBalanceEntity;", "acc", "value"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeAvailableBalance$1", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UnifyNetworkDataSourceImpl$observeAvailableBalance$1 extends SuspendLambda implements Function3<UnifyBalanceEntity, UnifyBalanceEntity, Continuation<? super UnifyBalanceEntity>, Object> {
    final /* synthetic */ String $currency;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(UnifyBalanceEntity unifyBalanceEntity, UnifyBalanceEntity unifyBalanceEntity2, Continuation<? super UnifyBalanceEntity> continuation) {
        UnifyNetworkDataSourceImpl$observeAvailableBalance$1 unifyNetworkDataSourceImpl$observeAvailableBalance$1 = new UnifyNetworkDataSourceImpl$observeAvailableBalance$1(this.$currency, continuation);
        unifyNetworkDataSourceImpl$observeAvailableBalance$1.L$0 = unifyBalanceEntity;
        unifyNetworkDataSourceImpl$observeAvailableBalance$1.L$1 = unifyBalanceEntity2;
        return unifyNetworkDataSourceImpl$observeAvailableBalance$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifyNetworkDataSourceImpl$observeAvailableBalance$1(String str, Continuation<? super UnifyNetworkDataSourceImpl$observeAvailableBalance$1> continuation) {
        super(3, continuation);
        this.$currency = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UnifyBalanceEntity unifyBalanceEntity = (UnifyBalanceEntity) this.L$0;
        UnifyBalanceEntity unifyBalanceEntity2 = (UnifyBalanceEntity) this.L$1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (unifyBalanceEntity == null) {
            return unifyBalanceEntity2;
        }
        String str = this.$currency;
        BigDecimal futuresAvailable = unifyBalanceEntity2.getFuturesAvailable();
        if (futuresAvailable == null) {
            futuresAvailable = unifyBalanceEntity.getFuturesAvailable();
        }
        BigDecimal futuresIsolatedAvailable = unifyBalanceEntity2.getFuturesIsolatedAvailable();
        if (futuresIsolatedAvailable == null) {
            futuresIsolatedAvailable = unifyBalanceEntity.getFuturesIsolatedAvailable();
        }
        BigDecimal maxWithdraw = unifyBalanceEntity2.getMaxWithdraw();
        if (maxWithdraw == null) {
            maxWithdraw = unifyBalanceEntity.getMaxWithdraw();
        }
        return new UnifyBalanceEntity(str, futuresAvailable, futuresIsolatedAvailable, maxWithdraw);
    }
}
