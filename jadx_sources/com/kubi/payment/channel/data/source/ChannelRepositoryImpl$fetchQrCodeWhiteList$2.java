package com.kubi.payment.channel.data.source;

import com.kubi.payment.channel.data.entities.WhiteListEntity;
import com.kubi.payment.channel.data.source.remote.ChannelRemoteDataSource;
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

/* JADX INFO: compiled from: ChannelRepositoryImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001*\u00020\u0004H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/sdk/base/entity/BaseEntity;", "", "Lcom/kubi/payment/channel/data/entities/WhiteListEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.channel.data.source.ChannelRepositoryImpl$fetchQrCodeWhiteList$2", m90122f = "ChannelRepositoryImpl.kt", m90123i = {}, m90124l = {89}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ChannelRepositoryImpl$fetchQrCodeWhiteList$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super BaseEntity<List<? extends WhiteListEntity>>>, Object> {
    int label;
    final /* synthetic */ ChannelRepositoryImpl this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super BaseEntity<List<? extends WhiteListEntity>>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super BaseEntity<List<WhiteListEntity>>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelRepositoryImpl$fetchQrCodeWhiteList$2(ChannelRepositoryImpl channelRepositoryImpl, Continuation<? super ChannelRepositoryImpl$fetchQrCodeWhiteList$2> continuation) {
        super(2, continuation);
        this.this$0 = channelRepositoryImpl;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChannelRepositoryImpl$fetchQrCodeWhiteList$2(this.this$0, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super BaseEntity<List<WhiteListEntity>>> continuation) {
        return ((ChannelRepositoryImpl$fetchQrCodeWhiteList$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ChannelRemoteDataSource channelRemoteDataSource = this.this$0.f38255a;
        this.label = 1;
        Object objM45753c = channelRemoteDataSource.m45753c(this);
        if (objM45753c == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM45753c;
    }
}
