package com.kubi.network.api.subscribe.utils;

import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.network.api.subscribe.model.SubscribeRequest;
import er.InterfaceC37236a;
import fr.InterfaceC37581b;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ChannelUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"Lkotlinx/coroutines/flow/f;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.network.api.subscribe.utils.ChannelUtilsKt$subscribeFlow$3", m90122f = "ChannelUtils.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ChannelUtilsKt$subscribeFlow$3 extends SuspendLambda implements Function2<InterfaceC41635f<? super SubscribeMessage>, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC37236a $client;
    final /* synthetic */ SubscribeRequest $subscribe;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelUtilsKt$subscribeFlow$3(InterfaceC37236a interfaceC37236a, SubscribeRequest subscribeRequest, Continuation<? super ChannelUtilsKt$subscribeFlow$3> continuation) {
        super(2, continuation);
        this.$client = interfaceC37236a;
        this.$subscribe = subscribeRequest;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ChannelUtilsKt$subscribeFlow$3(this.$client, this.$subscribe, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41635f<? super SubscribeMessage> interfaceC41635f, @Nullable Continuation<? super Unit> continuation) {
        return ((ChannelUtilsKt$subscribeFlow$3) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC37581b.a.m84716a(this.$client.mo42861f(this.$subscribe), null, 1, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
