package com.kubi.payment.p2p.data.source.remote;

import com.kubi.payment.p2p.data.entities.ReleaseCrypto;
import com.kubi.sdk.base.entity.BaseEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: P2PRemoteDataSource.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/payment/p2p/data/entities/ReleaseCrypto;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.data.source.remote.P2PRemoteDataSource$releaseCrypto$2", m90122f = "P2PRemoteDataSource.kt", m90123i = {}, m90124l = {64}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class P2PRemoteDataSource$releaseCrypto$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super BaseEntity<ReleaseCrypto>>, Object> {
    final /* synthetic */ String $orderId;
    final /* synthetic */ String $url;
    final /* synthetic */ String $validationToken;
    int label;
    final /* synthetic */ P2PRemoteDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PRemoteDataSource$releaseCrypto$2(P2PRemoteDataSource p2PRemoteDataSource, String str, String str2, String str3, Continuation<? super P2PRemoteDataSource$releaseCrypto$2> continuation) {
        super(2, continuation);
        this.this$0 = p2PRemoteDataSource;
        this.$url = str;
        this.$orderId = str2;
        this.$validationToken = str3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new P2PRemoteDataSource$releaseCrypto$2(this.this$0, this.$url, this.$orderId, this.$validationToken, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super BaseEntity<ReleaseCrypto>> continuation) {
        return ((P2PRemoteDataSource$releaseCrypto$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
        P2PWebService p2PWebService = this.this$0.f39709a;
        String str = this.$url;
        String str2 = this.$orderId;
        String str3 = this.$validationToken;
        this.label = 1;
        Object objM48540b = p2PWebService.m48540b(str, str2, str3, this);
        if (objM48540b == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM48540b;
    }
}
