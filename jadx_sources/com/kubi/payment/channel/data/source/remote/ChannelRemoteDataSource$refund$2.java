package com.kubi.payment.channel.data.source.remote;

import com.kubi.payment.channel.data.entities.Refund;
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

/* JADX INFO: compiled from: ChannelRemoteDataSource.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/payment/channel/data/entities/Refund$Response;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.channel.data.source.remote.ChannelRemoteDataSource$refund$2", m90122f = "ChannelRemoteDataSource.kt", m90123i = {}, m90124l = {117}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ChannelRemoteDataSource$refund$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super BaseEntity<Refund.Response>>, Object> {
    final /* synthetic */ Refund.Request $request;
    int label;
    final /* synthetic */ ChannelRemoteDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelRemoteDataSource$refund$2(ChannelRemoteDataSource channelRemoteDataSource, Refund.Request request, Continuation<? super ChannelRemoteDataSource$refund$2> continuation) {
        super(2, continuation);
        this.this$0 = channelRemoteDataSource;
        this.$request = request;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChannelRemoteDataSource$refund$2(this.this$0, this.$request, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super BaseEntity<Refund.Response>> continuation) {
        return ((ChannelRemoteDataSource$refund$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ChannelWebService channelWebService = this.this$0.f38257a;
        Refund.Request request = this.$request;
        this.label = 1;
        Object objM45767V = channelWebService.m45767V(request, this);
        if (objM45767V == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM45767V;
    }
}
