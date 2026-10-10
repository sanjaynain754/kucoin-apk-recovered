package com.kubi.flutter.widget.kline;

import androidx.media3.extractor.p021ts.TsExtractor;
import com.kubi.flutter.proto.kline.Response;
import io.flutter.plugin.common.BasicMessageChannel;
import java.nio.ByteBuffer;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.SafeContinuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KLineChannel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/flutter/proto/kline/Response;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineChannel$sendAsync$2", m90122f = "KLineChannel.kt", m90123i = {}, m90124l = {TsExtractor.TS_PACKET_SIZE}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KLineChannel$sendAsync$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Response>, Object> {
    final /* synthetic */ ByteBuffer $message;
    final /* synthetic */ BasicMessageChannel<ByteBuffer> $this_sendAsync;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ KLineChannel this$0;

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.KLineChannel$sendAsync$2$a */
    /* JADX INFO: compiled from: KLineChannel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12749a<T> implements BasicMessageChannel.Reply {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Continuation<Response> f22327a;

        /* JADX WARN: Multi-variable type inference failed */
        public C12749a(Continuation<? super Response> continuation) {
            this.f22327a = continuation;
        }

        @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void reply(ByteBuffer byteBuffer) {
            if (byteBuffer == null) {
                this.f22327a.resumeWith(Result.m103844constructorimpl(null));
                return;
            }
            try {
                this.f22327a.resumeWith(Result.m103844constructorimpl(Response.parseFrom(byteBuffer)));
            } catch (Throwable th2) {
                Continuation<Response> continuation = this.f22327a;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(th2)));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineChannel$sendAsync$2(BasicMessageChannel<ByteBuffer> basicMessageChannel, ByteBuffer byteBuffer, KLineChannel kLineChannel, Continuation<? super KLineChannel$sendAsync$2> continuation) {
        super(2, continuation);
        this.$this_sendAsync = basicMessageChannel;
        this.$message = byteBuffer;
        this.this$0 = kLineChannel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineChannel$sendAsync$2(this.$this_sendAsync, this.$message, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Response> continuation) {
        return ((KLineChannel$sendAsync$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
        BasicMessageChannel<ByteBuffer> basicMessageChannel = this.$this_sendAsync;
        ByteBuffer byteBuffer = this.$message;
        KLineChannel kLineChannel = this.this$0;
        this.L$0 = basicMessageChannel;
        this.L$1 = byteBuffer;
        this.L$2 = kLineChannel;
        this.label = 1;
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
        try {
            basicMessageChannel.send(byteBuffer, new C12749a(safeContinuation));
        } catch (Throwable th2) {
            try {
                Result.Companion companion = Result.INSTANCE;
                safeContinuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(th2)));
            } catch (Throwable th3) {
                kLineChannel.f22321a.m24375b(byteBuffer);
                throw th3;
            }
        }
        kLineChannel.f22321a.m24375b(byteBuffer);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        if (orThrow == coroutine_suspended) {
            return coroutine_suspended;
        }
        return orThrow;
    }
}
