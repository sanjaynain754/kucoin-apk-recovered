package com.kubi.flutter.widget.kline;

import com.kubi.flutter.proto.kline.CandleList;
import com.kubi.flutter.proto.kline.Response;
import com.kubi.flutter.proto.kline.ResponseKt$Dsl;
import com.kubi.flutter.widget.kline.utils.KLineRealTimeLog;
import com.kubi.network.retrofit.utils.C19331c;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import p481ny.C42899b;
import p499og.C43043a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44082a;
import ro.C44128b;

/* JADX INFO: compiled from: KLineDataSession.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/flutter/proto/kline/Response;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineDataSession$loadCdnData$2", m90122f = "KLineDataSession.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m90124l = {328, 117, 118}, m90125m = "invokeSuspend", m90126n = {"$this$withLock_u24default$iv", "previousTime", "$i$f$withLock", "$this$withLock_u24default$iv", "previousTime", "$i$f$withLock", "$i$a$-withLock$default-KLineDataSession$loadCdnData$2$1", "$this$withLock_u24default$iv", "list", "previousTime", "$i$f$withLock", "$i$a$-withLock$default-KLineDataSession$loadCdnData$2$1"}, m90127s = {"L$0", "J$0", "I$0", "L$0", "J$0", "I$0", "I$1", "L$0", "L$2", "J$0", "I$0", "I$1"})
@SourceDebugExtension({"SMAP\nKLineDataSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineDataSession.kt\ncom/kubi/flutter/widget/kline/KLineDataSession$loadCdnData$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 ResponseKt.kt\ncom/kubi/flutter/proto/kline/ResponseKtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n*L\n1#1,322:1\n116#2,8:323\n125#2,2:347\n8#3:331\n8#3:333\n8#3:335\n8#3:337\n8#3:344\n1#4:332\n1#4:334\n1#4:336\n1#4:338\n1#4:339\n1#4:345\n1#4:346\n45#5,4:340\n*S KotlinDebug\n*F\n+ 1 KLineDataSession.kt\ncom/kubi/flutter/widget/kline/KLineDataSession$loadCdnData$2\n*L\n107#1:323,8\n107#1:347,2\n110#1:331\n120#1:333\n123#1:335\n127#1:337\n134#1:344\n110#1:332\n120#1:334\n123#1:336\n127#1:338\n134#1:345\n133#1:340,4\n*E\n"})
public final class KLineDataSession$loadCdnData$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Response>, Object> {
    final /* synthetic */ long $firstTime;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ KLineDataSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineDataSession$loadCdnData$2(KLineDataSession kLineDataSession, long j11, Continuation<? super KLineDataSession$loadCdnData$2> continuation) {
        super(2, continuation);
        this.this$0 = kLineDataSession;
        this.$firstTime = j11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineDataSession$loadCdnData$2(this.this$0, this.$firstTime, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Response> continuation) {
        return ((KLineDataSession$loadCdnData$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x016e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v4, types: [rg0.a] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [rg0.a] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Response responseM24018a;
        ?? r11;
        long jM24367b;
        KLineDataSession kLineDataSession;
        int i11;
        InterfaceC44082a interfaceC44082a;
        Object objMo24270a;
        int i12;
        int i13;
        KLineDataSession kLineDataSession2;
        InterfaceC44082a interfaceC44082a2;
        CandleList candleList;
        IKLineChannel iKLineChannel;
        KLineDataSession kLineDataSession3;
        long j11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.label;
        try {
            try {
                if (r12 == 0) {
                    ResultKt.throwOnFailure(obj);
                    jM24367b = C12802p.m24367b(this.this$0.f22359a.getType(), this.$firstTime);
                    InterfaceC44082a interfaceC44082a3 = this.this$0.f22364f;
                    kLineDataSession = this.this$0;
                    this.L$0 = interfaceC44082a3;
                    this.L$1 = kLineDataSession;
                    this.J$0 = jM24367b;
                    this.I$0 = 0;
                    this.label = 1;
                    if (interfaceC44082a3.mo91344d(null, this) != coroutine_suspended) {
                        i11 = 0;
                        interfaceC44082a = interfaceC44082a3;
                    }
                    return coroutine_suspended;
                }
                if (r12 == 1) {
                    int i14 = this.I$0;
                    jM24367b = this.J$0;
                    KLineDataSession kLineDataSession4 = (KLineDataSession) this.L$1;
                    InterfaceC44082a interfaceC44082a4 = (InterfaceC44082a) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    i11 = i14;
                    interfaceC44082a = interfaceC44082a4;
                    kLineDataSession = kLineDataSession4;
                } else if (r12 == 2) {
                    int i15 = this.I$1;
                    int i16 = this.I$0;
                    jM24367b = this.J$0;
                    kLineDataSession2 = (KLineDataSession) this.L$1;
                    InterfaceC44082a interfaceC44082a5 = (InterfaceC44082a) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        i13 = i16;
                        interfaceC44082a2 = interfaceC44082a5;
                        i12 = i15;
                        objMo24270a = obj;
                        candleList = (CandleList) objMo24270a;
                        iKLineChannel = kLineDataSession2.f22363e;
                        this.L$0 = interfaceC44082a2;
                        this.L$1 = kLineDataSession2;
                        this.L$2 = SpillingKt.nullOutSpilledVariable(candleList);
                        this.J$0 = jM24367b;
                        this.I$0 = i13;
                        this.I$1 = i12;
                        this.label = 3;
                        if (iKLineChannel.mo24111b(candleList, this) != coroutine_suspended) {
                            kLineDataSession3 = kLineDataSession2;
                            j11 = jM24367b;
                            r12 = interfaceC44082a2;
                        }
                        return coroutine_suspended;
                    } catch (UndeclaredThrowableException e11) {
                        e = e11;
                        r12 = interfaceC44082a5;
                        Throwable undeclaredThrowable = e.getUndeclaredThrowable();
                        Intrinsics.checkNotNull(undeclaredThrowable);
                        C19331c.m42836c(undeclaredThrowable, null, 2, null);
                        ResponseKt$Dsl.Companion companion = ResponseKt$Dsl.f22177b;
                        Response.C12705b c12705bNewBuilder = Response.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder, "newBuilder(...)");
                        ResponseKt$Dsl responseKt$Dsl_create = companion._create(c12705bNewBuilder);
                        responseKt$Dsl_create.m24019b(500);
                        String message = undeclaredThrowable.getMessage();
                        if (message != null) {
                            responseKt$Dsl_create.m24020c(message);
                        }
                        responseM24018a = responseKt$Dsl_create.m24018a();
                        r11 = r12;
                    } catch (CancellationException unused) {
                        r12 = interfaceC44082a5;
                        ResponseKt$Dsl.Companion companion2 = ResponseKt$Dsl.f22177b;
                        Response.C12705b c12705bNewBuilder2 = Response.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder2, "newBuilder(...)");
                        ResponseKt$Dsl responseKt$Dsl_create2 = companion2._create(c12705bNewBuilder2);
                        responseKt$Dsl_create2.m24019b(300);
                        responseM24018a = responseKt$Dsl_create2.m24018a();
                        r11 = r12;
                    } catch (Exception e12) {
                        e = e12;
                        r12 = interfaceC44082a5;
                        C19331c.m42836c(e, null, 2, null);
                        if (!C42899b.m94075e(e)) {
                            C43043a.m94532c(e, "loadCdnData error");
                        }
                        ResponseKt$Dsl.Companion companion3 = ResponseKt$Dsl.f22177b;
                        Response.C12705b c12705bNewBuilder3 = Response.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder3, "newBuilder(...)");
                        ResponseKt$Dsl responseKt$Dsl_create3 = companion3._create(c12705bNewBuilder3);
                        responseKt$Dsl_create3.m24019b(500);
                        String message2 = e.getMessage();
                        if (message2 != null) {
                            responseKt$Dsl_create3.m24020c(message2);
                        }
                        responseM24018a = responseKt$Dsl_create3.m24018a();
                        r11 = r12;
                    } catch (Throwable th2) {
                        th = th2;
                        r12 = interfaceC44082a5;
                        r12.mo91345e(null);
                        throw th;
                    }
                } else {
                    if (r12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j11 = this.J$0;
                    kLineDataSession3 = (KLineDataSession) this.L$1;
                    InterfaceC44082a interfaceC44082a6 = (InterfaceC44082a) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    r12 = interfaceC44082a6;
                }
                kLineDataSession3.f22367i.set(j11);
                ResponseKt$Dsl.Companion companion4 = ResponseKt$Dsl.f22177b;
                Response.C12705b c12705bNewBuilder4 = Response.newBuilder();
                Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder4, "newBuilder(...)");
                responseM24018a = companion4._create(c12705bNewBuilder4).m24018a();
                r11 = r12;
                r11.mo91345e(null);
                return responseM24018a;
                if (kLineDataSession.f22367i.get() == jM24367b) {
                    C44128b.m97259c("KLineDataSession", "loadCdnData error sametime: " + jM24367b);
                    ResponseKt$Dsl.Companion companion5 = ResponseKt$Dsl.f22177b;
                    Response.C12705b c12705bNewBuilder5 = Response.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder5, "newBuilder(...)");
                    ResponseKt$Dsl responseKt$Dsl_create4 = companion5._create(c12705bNewBuilder5);
                    responseKt$Dsl_create4.m24019b(401);
                    responseKt$Dsl_create4.m24018a();
                }
                C44128b.m97266j("KLineDataSession", "loadCdnData " + jM24367b);
                KLineRealTimeLog.f22494a.m24393a("onLoadMore,symbol=" + kLineDataSession.f22359a.getSymbol() + ",type=" + kLineDataSession.f22359a.getType().getType() + ",previousTime=" + jM24367b);
                IKLineDataInteractor iKLineDataInteractor = kLineDataSession.f22360b;
                IKLineDataInteractor.DataParam dataParam = kLineDataSession.f22359a;
                this.L$0 = interfaceC44082a;
                this.L$1 = kLineDataSession;
                this.J$0 = jM24367b;
                this.I$0 = i11;
                this.I$1 = 0;
                this.label = 2;
                objMo24270a = iKLineDataInteractor.mo24270a(dataParam, jM24367b, this);
                if (objMo24270a != coroutine_suspended) {
                    KLineDataSession kLineDataSession5 = kLineDataSession;
                    i12 = 0;
                    i13 = i11;
                    kLineDataSession2 = kLineDataSession5;
                    interfaceC44082a2 = interfaceC44082a;
                    candleList = (CandleList) objMo24270a;
                    iKLineChannel = kLineDataSession2.f22363e;
                    this.L$0 = interfaceC44082a2;
                    this.L$1 = kLineDataSession2;
                    this.L$2 = SpillingKt.nullOutSpilledVariable(candleList);
                    this.J$0 = jM24367b;
                    this.I$0 = i13;
                    this.I$1 = i12;
                    this.label = 3;
                    if (iKLineChannel.mo24111b(candleList, this) != coroutine_suspended) {
                        kLineDataSession3 = kLineDataSession2;
                        j11 = jM24367b;
                        r12 = interfaceC44082a2;
                        kLineDataSession3.f22367i.set(j11);
                        ResponseKt$Dsl.Companion companion6 = ResponseKt$Dsl.f22177b;
                        Response.C12705b c12705bNewBuilder6 = Response.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder6, "newBuilder(...)");
                        responseM24018a = companion6._create(c12705bNewBuilder6).m24018a();
                        r11 = r12;
                        r11.mo91345e(null);
                        return responseM24018a;
                    }
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (UndeclaredThrowableException e13) {
            e = e13;
        } catch (CancellationException unused2) {
        } catch (Exception e14) {
            e = e14;
        }
    }
}
