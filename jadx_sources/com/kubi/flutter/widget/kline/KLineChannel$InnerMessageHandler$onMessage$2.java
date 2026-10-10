package com.kubi.flutter.widget.kline;

import com.kubi.flutter.proto.kline.Request;
import io.flutter.plugin.common.BasicMessageChannel;
import java.nio.ByteBuffer;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KLineChannel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineChannel$InnerMessageHandler$onMessage$2", m90122f = "KLineChannel.kt", m90123i = {}, m90124l = {222}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KLineChannel$InnerMessageHandler$onMessage$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BasicMessageChannel.Reply<ByteBuffer> $reply;
    final /* synthetic */ Request $request;
    int label;
    final /* synthetic */ KLineChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineChannel$InnerMessageHandler$onMessage$2(KLineChannel kLineChannel, Request request, BasicMessageChannel.Reply<ByteBuffer> reply, Continuation<? super KLineChannel$InnerMessageHandler$onMessage$2> continuation) {
        super(2, continuation);
        this.this$0 = kLineChannel;
        this.$request = request;
        this.$reply = reply;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineChannel$InnerMessageHandler$onMessage$2(this.this$0, this.$request, this.$reply, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KLineChannel$InnerMessageHandler$onMessage$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            KLineChannel kLineChannel = this.this$0;
            Request request = this.$request;
            Intrinsics.checkNotNull(request);
            this.label = 1;
            obj = kLineChannel.m24117p(request, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.$reply.reply((ByteBuffer) obj);
        return Unit.INSTANCE;
    }
}
