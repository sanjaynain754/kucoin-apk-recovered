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
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: ChannelUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m90084d2 = {"Lkotlinx/coroutines/flow/f;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;Ljava/lang/Throwable;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.network.api.subscribe.utils.ChannelUtilsKt$subscribeFlow$4", m90122f = "ChannelUtils.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ChannelUtilsKt$subscribeFlow$4 extends SuspendLambda implements Function3<InterfaceC41635f<? super SubscribeMessage>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC37236a $client;
    final /* synthetic */ SubscribeRequest $unsubscribe;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelUtilsKt$subscribeFlow$4(InterfaceC37236a interfaceC37236a, SubscribeRequest subscribeRequest, Continuation<? super ChannelUtilsKt$subscribeFlow$4> continuation) {
        super(3, continuation);
        this.$client = interfaceC37236a;
        this.$unsubscribe = subscribeRequest;
    }

    @Override // p852kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull InterfaceC41635f<? super SubscribeMessage> interfaceC41635f, @Nullable Throwable th2, @Nullable Continuation<? super Unit> continuation) {
        return new ChannelUtilsKt$subscribeFlow$4(this.$client, this.$unsubscribe, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC37581b.a.m84716a(this.$client.mo42861f(this.$unsubscribe), null, 1, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
