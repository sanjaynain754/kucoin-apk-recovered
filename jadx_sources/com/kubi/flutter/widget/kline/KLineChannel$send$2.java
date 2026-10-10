package com.kubi.flutter.widget.kline;

import com.appsflyer.AppsFlyerProperties;
import com.kubi.flutter.proto.kline.Request;
import com.kubi.flutter.proto.kline.Response;
import com.kubi.flutter.widget.kline.exception.KLineMessage;
import io.flutter.plugin.common.BasicMessageChannel;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import p481ny.C42899b;
import p499og.C43043a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import rg0.InterfaceC44088g;

/* JADX INFO: compiled from: KLineChannel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/flutter/proto/kline/Response;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineChannel$send$2", m90122f = "KLineChannel.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 1}, m90124l = {228, 115}, m90125m = "invokeSuspend", m90126n = {"buffer", "$this$withPermit$iv", "$i$f$withPermit", "buffer", "$this$withPermit$iv", AppsFlyerProperties.CHANNEL, "$i$f$withPermit", "$i$a$-withPermit-KLineChannel$send$2$1"}, m90127s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "I$1"})
@SourceDebugExtension({"SMAP\nKLineChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineChannel.kt\ncom/kubi/flutter/widget/kline/KLineChannel$send$2\n+ 2 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt\n+ 3 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n*L\n1#1,227:1\n81#2,3:228\n85#2,2:245\n45#3,4:231\n51#3,10:235\n*S KotlinDebug\n*F\n+ 1 KLineChannel.kt\ncom/kubi/flutter/widget/kline/KLineChannel$send$2\n*L\n111#1:228,3\n111#1:245,2\n119#1:231,4\n123#1:235,10\n*E\n"})
public final class KLineChannel$send$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Response>, Object> {
    final /* synthetic */ Request $request;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ KLineChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineChannel$send$2(KLineChannel kLineChannel, Request request, Continuation<? super KLineChannel$send$2> continuation) {
        super(2, continuation);
        this.this$0 = kLineChannel;
        this.$request = request;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineChannel$send$2(this.this$0, this.$request, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Response> continuation) {
        return ((KLineChannel$send$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009a A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #5 {all -> 0x009e, blocks: (B:30:0x0092, B:32:0x009a), top: B:49:0x0092 }] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ByteBuffer byteBufferM24120s;
        InterfaceC44088g interfaceC44088g;
        KLineChannel kLineChannel;
        int i11;
        InterfaceC44088g interfaceC44088g2;
        Throwable th2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        Response response = null;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        interfaceC44088g2 = (InterfaceC44088g) this.L$1;
                        try {
                            ResultKt.throwOnFailure(obj);
                            response = (Response) obj;
                        } catch (CancellationException unused) {
                        } catch (Throwable th3) {
                            th2 = th3;
                            try {
                                if (!C42899b.m94075e(th2)) {
                                    C43043a.m94532c(th2, "response parse error");
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                interfaceC44088g2.release();
                                throw th;
                            }
                        }
                        interfaceC44088g = interfaceC44088g2;
                        interfaceC44088g.release();
                        return response;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.I$0;
                kLineChannel = (KLineChannel) this.L$2;
                InterfaceC44088g interfaceC44088g3 = (InterfaceC44088g) this.L$1;
                byteBufferM24120s = (ByteBuffer) this.L$0;
                ResultKt.throwOnFailure(obj);
                interfaceC44088g = interfaceC44088g3;
            } else {
                ResultKt.throwOnFailure(obj);
                byteBufferM24120s = this.this$0.m24120s(this.$request);
                interfaceC44088g = this.this$0.f22323c;
                kLineChannel = this.this$0;
                this.L$0 = byteBufferM24120s;
                this.L$1 = interfaceC44088g;
                this.L$2 = kLineChannel;
                this.I$0 = 0;
                this.label = 1;
                if (interfaceC44088g.m97146c(this) != coroutine_suspended) {
                    i11 = 0;
                }
                return coroutine_suspended;
            }
            BasicMessageChannel basicMessageChannel = kLineChannel.f22322b;
            if (basicMessageChannel != null) {
                try {
                    this.L$0 = SpillingKt.nullOutSpilledVariable(byteBufferM24120s);
                    this.L$1 = interfaceC44088g;
                    this.L$2 = SpillingKt.nullOutSpilledVariable(basicMessageChannel);
                    this.I$0 = i11;
                    this.I$1 = 0;
                    this.label = 2;
                    Object objM24119r = kLineChannel.m24119r(basicMessageChannel, byteBufferM24120s, this);
                    if (objM24119r != coroutine_suspended) {
                        interfaceC44088g2 = interfaceC44088g;
                        obj = objM24119r;
                        response = (Response) obj;
                        interfaceC44088g = interfaceC44088g2;
                    }
                    return coroutine_suspended;
                } catch (CancellationException unused2) {
                    interfaceC44088g2 = interfaceC44088g;
                } catch (Throwable th5) {
                    interfaceC44088g2 = interfaceC44088g;
                    th2 = th5;
                    if (!C42899b.m94075e(th2)) {
                        C43043a.m94532c(th2, "response parse error");
                    }
                }
            } else if (!StringsKt.startsWith$default("channel send but it's null", "openDataPush 2 times", false, 2, (Object) null)) {
                C43043a.m94533d("channel send but it's null", "KLineChannel");
            } else {
                C43846g.m96568c(new KLineMessage("channel send but it's null", "KLineChannel", true), null, 2, null);
            }
            interfaceC44088g.release();
            return response;
        } catch (Throwable th6) {
            interfaceC44088g2 = interfaceC44088g;
            th = th6;
            interfaceC44088g2.release();
            throw th;
        }
    }
}
