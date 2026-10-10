package com.kubi.payment.p2p.data.source;

import com.kubi.payment.p2p.data.source.remote.P2PRemoteDataSource;
import com.kubi.sdk.base.entity.BaseEntity;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: P2PRepositoryImpl.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/sdk/base/entity/BaseEntity;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.data.source.P2PRepositoryImpl$confirmPayMoney$2", m90122f = "P2PRepositoryImpl.kt", m90123i = {}, m90124l = {51}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class P2PRepositoryImpl$confirmPayMoney$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super BaseEntity<Object>>, Object> {
    final /* synthetic */ String $orderId;
    final /* synthetic */ String $payTypeId;
    final /* synthetic */ List<String> $payVoucherFileIds;
    int label;
    final /* synthetic */ P2PRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PRepositoryImpl$confirmPayMoney$2(P2PRepositoryImpl p2PRepositoryImpl, String str, String str2, List<String> list, Continuation<? super P2PRepositoryImpl$confirmPayMoney$2> continuation) {
        super(2, continuation);
        this.this$0 = p2PRepositoryImpl;
        this.$orderId = str;
        this.$payTypeId = str2;
        this.$payVoucherFileIds = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new P2PRepositoryImpl$confirmPayMoney$2(this.this$0, this.$orderId, this.$payTypeId, this.$payVoucherFileIds, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super BaseEntity<Object>> continuation) {
        return ((P2PRepositoryImpl$confirmPayMoney$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        P2PRemoteDataSource p2PRemoteDataSource = this.this$0.f39707a;
        String str = this.$orderId;
        String str2 = this.$payTypeId;
        List<String> list = this.$payVoucherFileIds;
        this.label = 1;
        Object objM48507e = p2PRemoteDataSource.m48507e(str, str2, list, this);
        if (objM48507e == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM48507e;
    }
}
