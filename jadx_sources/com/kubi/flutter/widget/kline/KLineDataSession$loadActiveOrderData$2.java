package com.kubi.flutter.widget.kline;

import com.kubi.flutter.proto.kline.OrderList;
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
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44082a;
import ro.C44128b;

/* JADX INFO: compiled from: KLineDataSession.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/flutter/proto/kline/Response;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineDataSession$loadActiveOrderData$2", m90122f = "KLineDataSession.kt", m90123i = {0, 0, 1, 1, 1, 2, 2, 2, 2}, m90124l = {328, 286, 287}, m90125m = "invokeSuspend", m90126n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-KLineDataSession$loadActiveOrderData$2$1", "$this$withLock_u24default$iv", "list", "$i$f$withLock", "$i$a$-withLock$default-KLineDataSession$loadActiveOrderData$2$1"}, m90127s = {"L$0", "I$0", "L$0", "I$0", "I$1", "L$0", "L$3", "I$0", "I$1"})
@SourceDebugExtension({"SMAP\nKLineDataSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineDataSession.kt\ncom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 ResponseKt.kt\ncom/kubi/flutter/proto/kline/ResponseKtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n*L\n1#1,322:1\n116#2,8:323\n125#2,2:345\n8#3:331\n8#3:333\n8#3:335\n8#3:342\n1#4:332\n1#4:334\n1#4:336\n1#4:337\n1#4:343\n1#4:344\n45#5,4:338\n*S KotlinDebug\n*F\n+ 1 KLineDataSession.kt\ncom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2\n*L\n283#1:323,8\n283#1:345,2\n289#1:331\n292#1:333\n296#1:335\n303#1:342\n289#1:332\n292#1:334\n296#1:336\n303#1:343\n302#1:338,4\n*E\n"})
public final class KLineDataSession$loadActiveOrderData$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Response>, Object> {
    final /* synthetic */ IKLineDataInteractor.OrderParam $orderParam;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ KLineDataSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineDataSession$loadActiveOrderData$2(KLineDataSession kLineDataSession, IKLineDataInteractor.OrderParam orderParam, Continuation<? super KLineDataSession$loadActiveOrderData$2> continuation) {
        super(2, continuation);
        this.this$0 = kLineDataSession;
        this.$orderParam = orderParam;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineDataSession$loadActiveOrderData$2(this.this$0, this.$orderParam, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Response> continuation) {
        return ((KLineDataSession$loadActiveOrderData$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x0150 A[Catch: all -> 0x002c, TryCatch #10 {all -> 0x002c, blocks: (B:8:0x0027, B:41:0x00d8, B:50:0x0145, B:52:0x0150, B:53:0x0153, B:55:0x0169, B:56:0x016c, B:57:0x0171, B:59:0x018e, B:60:0x0191, B:61:0x0196), top: B:67:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0169 A[Catch: all -> 0x002c, TryCatch #10 {all -> 0x002c, blocks: (B:8:0x0027, B:41:0x00d8, B:50:0x0145, B:52:0x0150, B:53:0x0153, B:55:0x0169, B:56:0x016c, B:57:0x0171, B:59:0x018e, B:60:0x0191, B:61:0x0196), top: B:67:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:59:0x018e A[Catch: all -> 0x002c, TryCatch #10 {all -> 0x002c, blocks: (B:8:0x0027, B:41:0x00d8, B:50:0x0145, B:52:0x0150, B:53:0x0153, B:55:0x0169, B:56:0x016c, B:57:0x0171, B:59:0x018e, B:60:0x0191, B:61:0x0196), top: B:67:0x000f }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [rg0.a] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC44082a interfaceC44082a;
        KLineDataSession kLineDataSession;
        IKLineDataInteractor.OrderParam orderParam;
        int i11;
        InterfaceC44082a interfaceC44082a2;
        Exception e11;
        UndeclaredThrowableException e12;
        InterfaceC44082a interfaceC44082a3;
        IKLineDataInteractor.OrderParam orderParam2;
        OrderList orderList;
        IKLineChannel iKLineChannel;
        OrderList orderList2;
        KLineDataSession kLineDataSession2;
        ResponseKt$Dsl responseKt$Dsl_create;
        String message;
        Response responseM24018a;
        ResponseKt$Dsl responseKt$Dsl_create2;
        String message2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        int i13 = 0;
        ?? r11 = 3;
        try {
            try {
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                orderList2 = (OrderList) this.L$3;
                                orderParam2 = (IKLineDataInteractor.OrderParam) this.L$2;
                                kLineDataSession2 = (KLineDataSession) this.L$1;
                                interfaceC44082a2 = (InterfaceC44082a) this.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    KLineRealTimeLog.f22494a.m24393a("loadActiveOrderData loadBS_set_savedTime,symbol=" + orderParam2.getSymbol() + ",type=" + orderParam2.getType().getType() + ",savedTime=" + kLineDataSession2.f22368j.get() + ", sendFlutter:" + orderList2.getItemsCount() + "(api)");
                                    ResponseKt$Dsl.Companion companion = ResponseKt$Dsl.f22177b;
                                    Response.C12705b c12705bNewBuilder = Response.newBuilder();
                                    Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder, "newBuilder(...)");
                                    responseM24018a = companion._create(c12705bNewBuilder).m24018a();
                                } catch (UndeclaredThrowableException e13) {
                                    e12 = e13;
                                    Throwable undeclaredThrowable = e12.getUndeclaredThrowable();
                                    C19331c.m42836c(e12, null, 2, null);
                                    ResponseKt$Dsl.Companion companion2 = ResponseKt$Dsl.f22177b;
                                    Response.C12705b c12705bNewBuilder2 = Response.newBuilder();
                                    Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder2, "newBuilder(...)");
                                    responseKt$Dsl_create2 = companion2._create(c12705bNewBuilder2);
                                    responseKt$Dsl_create2.m24019b(500);
                                    message2 = undeclaredThrowable.getMessage();
                                    if (message2 != null) {
                                        responseKt$Dsl_create2.m24020c(message2);
                                    }
                                    responseM24018a = responseKt$Dsl_create2.m24018a();
                                } catch (CancellationException unused) {
                                    ResponseKt$Dsl.Companion companion3 = ResponseKt$Dsl.f22177b;
                                    Response.C12705b c12705bNewBuilder3 = Response.newBuilder();
                                    Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder3, "newBuilder(...)");
                                    ResponseKt$Dsl responseKt$Dsl_create3 = companion3._create(c12705bNewBuilder3);
                                    responseKt$Dsl_create3.m24019b(300);
                                    responseM24018a = responseKt$Dsl_create3.m24018a();
                                } catch (Exception e14) {
                                    e11 = e14;
                                    C19331c.m42836c(e11, null, 2, null);
                                    if (!C42899b.m94075e(e11)) {
                                        C43043a.m94532c(e11, "loadHistoryOrderData error");
                                    }
                                    ResponseKt$Dsl.Companion companion4 = ResponseKt$Dsl.f22177b;
                                    Response.C12705b c12705bNewBuilder4 = Response.newBuilder();
                                    Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder4, "newBuilder(...)");
                                    responseKt$Dsl_create = companion4._create(c12705bNewBuilder4);
                                    responseKt$Dsl_create.m24019b(500);
                                    message = e11.getMessage();
                                    if (message != null) {
                                        responseKt$Dsl_create.m24020c(message);
                                    }
                                    responseM24018a = responseKt$Dsl_create.m24018a();
                                }
                                interfaceC44082a2.mo91345e(null);
                                return responseM24018a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i13 = this.I$1;
                        i11 = this.I$0;
                        orderParam = (IKLineDataInteractor.OrderParam) this.L$2;
                        kLineDataSession = (KLineDataSession) this.L$1;
                        interfaceC44082a3 = (InterfaceC44082a) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            int i14 = i13;
                            int i15 = i11;
                            orderParam2 = orderParam;
                            orderList = (OrderList) obj;
                            iKLineChannel = kLineDataSession.f22363e;
                            this.L$0 = interfaceC44082a3;
                            this.L$1 = kLineDataSession;
                            this.L$2 = orderParam2;
                            this.L$3 = orderList;
                            this.I$0 = i15;
                            this.I$1 = i14;
                            this.label = 3;
                            if (iKLineChannel.mo24110a(orderList, this) != coroutine_suspended) {
                                orderList2 = orderList;
                                kLineDataSession2 = kLineDataSession;
                                interfaceC44082a2 = interfaceC44082a3;
                                KLineRealTimeLog.f22494a.m24393a("loadActiveOrderData loadBS_set_savedTime,symbol=" + orderParam2.getSymbol() + ",type=" + orderParam2.getType().getType() + ",savedTime=" + kLineDataSession2.f22368j.get() + ", sendFlutter:" + orderList2.getItemsCount() + "(api)");
                                ResponseKt$Dsl.Companion companion5 = ResponseKt$Dsl.f22177b;
                                Response.C12705b c12705bNewBuilder5 = Response.newBuilder();
                                Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder5, "newBuilder(...)");
                                responseM24018a = companion5._create(c12705bNewBuilder5).m24018a();
                                interfaceC44082a2.mo91345e(null);
                                return responseM24018a;
                            }
                            return coroutine_suspended;
                        } catch (UndeclaredThrowableException e15) {
                            e12 = e15;
                            interfaceC44082a2 = interfaceC44082a3;
                            Throwable undeclaredThrowable2 = e12.getUndeclaredThrowable();
                            C19331c.m42836c(e12, null, 2, null);
                            ResponseKt$Dsl.Companion companion6 = ResponseKt$Dsl.f22177b;
                            Response.C12705b c12705bNewBuilder6 = Response.newBuilder();
                            Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder6, "newBuilder(...)");
                            responseKt$Dsl_create2 = companion6._create(c12705bNewBuilder6);
                            responseKt$Dsl_create2.m24019b(500);
                            message2 = undeclaredThrowable2.getMessage();
                            if (message2 != null) {
                                responseKt$Dsl_create2.m24020c(message2);
                            }
                            responseM24018a = responseKt$Dsl_create2.m24018a();
                        } catch (CancellationException unused2) {
                            interfaceC44082a2 = interfaceC44082a3;
                            ResponseKt$Dsl.Companion companion7 = ResponseKt$Dsl.f22177b;
                            Response.C12705b c12705bNewBuilder7 = Response.newBuilder();
                            Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder7, "newBuilder(...)");
                            ResponseKt$Dsl responseKt$Dsl_create4 = companion7._create(c12705bNewBuilder7);
                            responseKt$Dsl_create4.m24019b(300);
                            responseM24018a = responseKt$Dsl_create4.m24018a();
                        } catch (Exception e16) {
                            e11 = e16;
                            interfaceC44082a2 = interfaceC44082a3;
                            C19331c.m42836c(e11, null, 2, null);
                            if (!C42899b.m94075e(e11)) {
                                C43043a.m94532c(e11, "loadHistoryOrderData error");
                            }
                            ResponseKt$Dsl.Companion companion8 = ResponseKt$Dsl.f22177b;
                            Response.C12705b c12705bNewBuilder8 = Response.newBuilder();
                            Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder8, "newBuilder(...)");
                            responseKt$Dsl_create = companion8._create(c12705bNewBuilder8);
                            responseKt$Dsl_create.m24019b(500);
                            message = e11.getMessage();
                            if (message != null) {
                                responseKt$Dsl_create.m24020c(message);
                            }
                            responseM24018a = responseKt$Dsl_create.m24018a();
                        } catch (Throwable th2) {
                            th = th2;
                            r11 = interfaceC44082a3;
                            r11.mo91345e(null);
                            throw th;
                        }
                    } else {
                        i11 = this.I$0;
                        orderParam = (IKLineDataInteractor.OrderParam) this.L$2;
                        kLineDataSession = (KLineDataSession) this.L$1;
                        InterfaceC44082a interfaceC44082a4 = (InterfaceC44082a) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        interfaceC44082a = interfaceC44082a4;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    interfaceC44082a = this.this$0.f22366h;
                    kLineDataSession = this.this$0;
                    IKLineDataInteractor.OrderParam orderParam3 = this.$orderParam;
                    this.L$0 = interfaceC44082a;
                    this.L$1 = kLineDataSession;
                    this.L$2 = orderParam3;
                    this.I$0 = 0;
                    this.label = 1;
                    if (interfaceC44082a.mo91344d(null, this) != coroutine_suspended) {
                        orderParam = orderParam3;
                        i11 = 0;
                    }
                    return coroutine_suspended;
                }
                C44128b.m97266j("KLineDataSession", "loadActiveOrderData");
                IKLineDataInteractor iKLineDataInteractor = kLineDataSession.f22360b;
                this.L$0 = interfaceC44082a;
                this.L$1 = kLineDataSession;
                this.L$2 = orderParam;
                this.I$0 = i11;
                this.I$1 = 0;
                this.label = 2;
                Object objMo24272c = iKLineDataInteractor.mo24272c(orderParam, this);
                if (objMo24272c != coroutine_suspended) {
                    interfaceC44082a3 = interfaceC44082a;
                    obj = objMo24272c;
                    int i16 = i13;
                    int i17 = i11;
                    orderParam2 = orderParam;
                    orderList = (OrderList) obj;
                    iKLineChannel = kLineDataSession.f22363e;
                    this.L$0 = interfaceC44082a3;
                    this.L$1 = kLineDataSession;
                    this.L$2 = orderParam2;
                    this.L$3 = orderList;
                    this.I$0 = i17;
                    this.I$1 = i16;
                    this.label = 3;
                    if (iKLineChannel.mo24110a(orderList, this) != coroutine_suspended) {
                        orderList2 = orderList;
                        kLineDataSession2 = kLineDataSession;
                        interfaceC44082a2 = interfaceC44082a3;
                        KLineRealTimeLog.f22494a.m24393a("loadActiveOrderData loadBS_set_savedTime,symbol=" + orderParam2.getSymbol() + ",type=" + orderParam2.getType().getType() + ",savedTime=" + kLineDataSession2.f22368j.get() + ", sendFlutter:" + orderList2.getItemsCount() + "(api)");
                        ResponseKt$Dsl.Companion companion9 = ResponseKt$Dsl.f22177b;
                        Response.C12705b c12705bNewBuilder9 = Response.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder9, "newBuilder(...)");
                        responseM24018a = companion9._create(c12705bNewBuilder9).m24018a();
                        interfaceC44082a2.mo91345e(null);
                        return responseM24018a;
                    }
                }
                return coroutine_suspended;
            } catch (UndeclaredThrowableException e17) {
                interfaceC44082a2 = interfaceC44082a;
                e12 = e17;
                Throwable undeclaredThrowable3 = e12.getUndeclaredThrowable();
                C19331c.m42836c(e12, null, 2, null);
                ResponseKt$Dsl.Companion companion10 = ResponseKt$Dsl.f22177b;
                Response.C12705b c12705bNewBuilder10 = Response.newBuilder();
                Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder10, "newBuilder(...)");
                responseKt$Dsl_create2 = companion10._create(c12705bNewBuilder10);
                responseKt$Dsl_create2.m24019b(500);
                message2 = undeclaredThrowable3.getMessage();
                if (message2 != null) {
                    responseKt$Dsl_create2.m24020c(message2);
                }
                responseM24018a = responseKt$Dsl_create2.m24018a();
            } catch (CancellationException unused3) {
                interfaceC44082a2 = interfaceC44082a;
                ResponseKt$Dsl.Companion companion11 = ResponseKt$Dsl.f22177b;
                Response.C12705b c12705bNewBuilder11 = Response.newBuilder();
                Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder11, "newBuilder(...)");
                ResponseKt$Dsl responseKt$Dsl_create5 = companion11._create(c12705bNewBuilder11);
                responseKt$Dsl_create5.m24019b(300);
                responseM24018a = responseKt$Dsl_create5.m24018a();
            } catch (Exception e18) {
                interfaceC44082a2 = interfaceC44082a;
                e11 = e18;
                C19331c.m42836c(e11, null, 2, null);
                if (!C42899b.m94075e(e11)) {
                    C43043a.m94532c(e11, "loadHistoryOrderData error");
                }
                ResponseKt$Dsl.Companion companion12 = ResponseKt$Dsl.f22177b;
                Response.C12705b c12705bNewBuilder12 = Response.newBuilder();
                Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder12, "newBuilder(...)");
                responseKt$Dsl_create = companion12._create(c12705bNewBuilder12);
                responseKt$Dsl_create.m24019b(500);
                message = e11.getMessage();
                if (message != null) {
                    responseKt$Dsl_create.m24020c(message);
                }
                responseM24018a = responseKt$Dsl_create.m24018a();
            } catch (Throwable th3) {
                r11 = interfaceC44082a;
                th = th3;
                r11.mo91345e(null);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
