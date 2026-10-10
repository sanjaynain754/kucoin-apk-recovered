package com.kubi.flutter.widget.kline;

import com.kubi.flutter.proto.kline.OrderList;
import com.kubi.flutter.proto.kline.Response;
import com.kubi.flutter.proto.kline.ResponseKt$Dsl;
import com.kubi.flutter.widget.kline.utils.KLineRealTimeLog;
import com.kubi.network.retrofit.utils.C19331c;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback;
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
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44082a;
import ro.C44128b;

/* JADX INFO: compiled from: KLineDataSession.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/flutter/proto/kline/Response;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineDataSession$loadHistoryOrderData$2", m90122f = "KLineDataSession.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, m90124l = {329, 251, ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR}, m90125m = "invokeSuspend", m90126n = {"$this$withLock_u24default$iv", "previousTime", "$i$f$withLock", "$this$withLock_u24default$iv", "previousTime", "$i$f$withLock", "$i$a$-withLock$default-KLineDataSession$loadHistoryOrderData$2$1", "$this$withLock_u24default$iv", "list", "realList", "previousTime", "$i$f$withLock", "$i$a$-withLock$default-KLineDataSession$loadHistoryOrderData$2$1"}, m90127s = {"L$0", "J$0", "I$0", "L$0", "J$0", "I$0", "I$1", "L$0", "L$3", "L$4", "J$0", "I$0", "I$1"})
@SourceDebugExtension({"SMAP\nKLineDataSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineDataSession.kt\ncom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2\n+ 2 KLineContract.kt\ncom/kubi/flutter/widget/kline/KLineContractKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 ResponseKt.kt\ncom/kubi/flutter/proto/kline/ResponseKtKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n*L\n1#1,322:1\n8#2:323\n116#3,8:324\n125#3,2:348\n8#4:332\n8#4:334\n8#4:336\n8#4:338\n8#4:345\n1#5:333\n1#5:335\n1#5:337\n1#5:339\n1#5:340\n1#5:346\n1#5:347\n45#6,4:341\n*S KotlinDebug\n*F\n+ 1 KLineDataSession.kt\ncom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2\n*L\n228#1:323\n241#1:324,8\n241#1:348,2\n245#1:332\n256#1:334\n259#1:336\n263#1:338\n270#1:345\n245#1:333\n256#1:335\n259#1:337\n263#1:339\n270#1:346\n269#1:341,4\n*E\n"})
public final class KLineDataSession$loadHistoryOrderData$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Response>, Object> {
    final /* synthetic */ long $firstTime;
    final /* synthetic */ IKLineDataInteractor.OrderParam $orderParam;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ KLineDataSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineDataSession$loadHistoryOrderData$2(long j11, KLineDataSession kLineDataSession, IKLineDataInteractor.OrderParam orderParam, Continuation<? super KLineDataSession$loadHistoryOrderData$2> continuation) {
        super(2, continuation);
        this.$firstTime = j11;
        this.this$0 = kLineDataSession;
        this.$orderParam = orderParam;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineDataSession$loadHistoryOrderData$2(this.$firstTime, this.this$0, this.$orderParam, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Response> continuation) {
        return ((KLineDataSession$loadHistoryOrderData$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0234  */
    /* JADX WARN: Code duplicated, block: B:69:0x02c9 A[Catch: all -> 0x0039, TryCatch #12 {all -> 0x0039, blocks: (B:8:0x0034, B:56:0x0239, B:67:0x02be, B:69:0x02c9, B:70:0x02cc, B:72:0x02e4, B:73:0x02e7, B:74:0x02ec, B:76:0x030d, B:77:0x0310, B:78:0x0315), top: B:95:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x02e4 A[Catch: all -> 0x0039, TryCatch #12 {all -> 0x0039, blocks: (B:8:0x0034, B:56:0x0239, B:67:0x02be, B:69:0x02c9, B:70:0x02cc, B:72:0x02e4, B:73:0x02e7, B:74:0x02ec, B:76:0x030d, B:77:0x0310, B:78:0x0315), top: B:95:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x030d A[Catch: all -> 0x0039, TryCatch #12 {all -> 0x0039, blocks: (B:8:0x0034, B:56:0x0239, B:67:0x02be, B:69:0x02c9, B:70:0x02cc, B:72:0x02e4, B:73:0x02e7, B:74:0x02ec, B:76:0x030d, B:77:0x0310, B:78:0x0315), top: B:95:0x0016 }] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC44082a interfaceC44082a;
        long jM24367b;
        long j11;
        KLineDataSession kLineDataSession;
        IKLineDataInteractor.OrderParam orderParam;
        InterfaceC44082a interfaceC44082a2;
        int i11;
        InterfaceC44082a interfaceC44082a3;
        int i12;
        Object objMo24273d;
        IKLineDataInteractor.OrderParam orderParam2;
        InterfaceC44082a interfaceC44082a4;
        KLineDataSession kLineDataSession2;
        long j12;
        OrderList orderList;
        OrderList orderListM24359b;
        IKLineChannel iKLineChannel;
        OrderList orderList2;
        OrderList orderList3;
        IKLineDataInteractor.OrderParam orderParam3;
        KLineDataSession kLineDataSession3;
        Response responseM24018a;
        ResponseKt$Dsl responseKt$Dsl_create;
        String message;
        Function1 function1;
        ResponseKt$Dsl responseKt$Dsl_create2;
        String message2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = this.label;
        int i14 = 2;
        try {
            try {
                try {
                    if (i13 == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (this.$firstTime == -1) {
                            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                            KLineCdnRange kLineCdnRangeM24368c = C12802p.m24368c(this.this$0.f22359a.getType(), jCurrentTimeMillis);
                            long jM24366a = C12802p.m24366a(this.this$0.f22359a.getType(), jCurrentTimeMillis);
                            KLineRealTimeLog.f22494a.m24393a("loadBS,symbol=" + this.$orderParam.getSymbol() + ",type=" + this.$orderParam.getType().getType() + ",cdnCandleCount=" + jM24366a + ",cdnRange=" + kLineCdnRangeM24368c);
                            jM24367b = jM24366a < 100 ? C12802p.m24367b(this.this$0.f22359a.getType(), jCurrentTimeMillis) : kLineCdnRangeM24368c.getBegin();
                        } else {
                            jM24367b = C12802p.m24367b(this.this$0.f22359a.getType(), this.$firstTime);
                        }
                        j11 = jM24367b;
                        KLineRealTimeLog.f22494a.m24393a("loadBS,symbol=" + this.$orderParam.getSymbol() + ",type=" + this.$orderParam.getType().getType() + ",savedTime=" + this.this$0.f22368j.get() + ",previousTime=" + j11);
                        InterfaceC44082a interfaceC44082a5 = this.this$0.f22365g;
                        kLineDataSession = this.this$0;
                        orderParam = this.$orderParam;
                        this.L$0 = interfaceC44082a5;
                        this.L$1 = kLineDataSession;
                        this.L$2 = orderParam;
                        this.J$0 = j11;
                        this.I$0 = 0;
                        this.label = 1;
                        if (interfaceC44082a5.mo91344d(null, this) != coroutine_suspended) {
                            interfaceC44082a2 = interfaceC44082a5;
                            i11 = 0;
                        }
                        return coroutine_suspended;
                    }
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j12 = this.J$0;
                            orderList3 = (OrderList) this.L$4;
                            orderList2 = (OrderList) this.L$3;
                            orderParam3 = (IKLineDataInteractor.OrderParam) this.L$2;
                            kLineDataSession3 = (KLineDataSession) this.L$1;
                            interfaceC44082a3 = (InterfaceC44082a) this.L$0;
                            try {
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    try {
                                        KLineRealTimeLog.f22494a.m24393a("loadBS_set_savedTime,symbol=" + orderParam3.getSymbol() + ",type=" + orderParam3.getType().getType() + ",savedTime=" + kLineDataSession3.f22368j.get() + ",previousTime=" + j12 + ", sendFlutter:" + orderList2.getItemsCount() + "(api)," + orderList3.getItemsCount() + "(cached)");
                                        kLineDataSession3.f22368j.set(j12);
                                        ResponseKt$Dsl.Companion companion = ResponseKt$Dsl.f22177b;
                                        Response.C12705b c12705bNewBuilder = Response.newBuilder();
                                        Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder, "newBuilder(...)");
                                        responseM24018a = companion._create(c12705bNewBuilder).m24018a();
                                    } catch (Exception e11) {
                                        e = e11;
                                        function1 = null;
                                        i14 = 2;
                                        C19331c.m42836c(e, function1, i14, function1);
                                        if (!C42899b.m94075e(e)) {
                                            C43043a.m94532c(e, "loadHistoryOrderData error");
                                        }
                                        ResponseKt$Dsl.Companion companion2 = ResponseKt$Dsl.f22177b;
                                        Response.C12705b c12705bNewBuilder2 = Response.newBuilder();
                                        Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder2, "newBuilder(...)");
                                        responseKt$Dsl_create2 = companion2._create(c12705bNewBuilder2);
                                        responseKt$Dsl_create2.m24019b(500);
                                        message2 = e.getMessage();
                                        if (message2 != null) {
                                            responseKt$Dsl_create2.m24020c(message2);
                                        }
                                        responseM24018a = responseKt$Dsl_create2.m24018a();
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    function1 = null;
                                    C19331c.m42836c(e, function1, i14, function1);
                                    if (!C42899b.m94075e(e)) {
                                        C43043a.m94532c(e, "loadHistoryOrderData error");
                                    }
                                    ResponseKt$Dsl.Companion companion3 = ResponseKt$Dsl.f22177b;
                                    Response.C12705b c12705bNewBuilder3 = Response.newBuilder();
                                    Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder3, "newBuilder(...)");
                                    responseKt$Dsl_create2 = companion3._create(c12705bNewBuilder3);
                                    responseKt$Dsl_create2.m24019b(500);
                                    message2 = e.getMessage();
                                    if (message2 != null) {
                                        responseKt$Dsl_create2.m24020c(message2);
                                    }
                                    responseM24018a = responseKt$Dsl_create2.m24018a();
                                }
                            } catch (UndeclaredThrowableException e13) {
                                e = e13;
                                Throwable undeclaredThrowable = e.getUndeclaredThrowable();
                                C19331c.m42836c(e, null, 2, null);
                                ResponseKt$Dsl.Companion companion4 = ResponseKt$Dsl.f22177b;
                                Response.C12705b c12705bNewBuilder4 = Response.newBuilder();
                                Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder4, "newBuilder(...)");
                                responseKt$Dsl_create = companion4._create(c12705bNewBuilder4);
                                responseKt$Dsl_create.m24019b(500);
                                message = undeclaredThrowable.getMessage();
                                if (message != null) {
                                    responseKt$Dsl_create.m24020c(message);
                                }
                                responseM24018a = responseKt$Dsl_create.m24018a();
                            } catch (CancellationException unused) {
                                ResponseKt$Dsl.Companion companion5 = ResponseKt$Dsl.f22177b;
                                Response.C12705b c12705bNewBuilder5 = Response.newBuilder();
                                Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder5, "newBuilder(...)");
                                ResponseKt$Dsl responseKt$Dsl_create3 = companion5._create(c12705bNewBuilder5);
                                responseKt$Dsl_create3.m24019b(300);
                                responseM24018a = responseKt$Dsl_create3.m24018a();
                            }
                            interfaceC44082a3.mo91345e(null);
                            return responseM24018a;
                        }
                        int i15 = this.I$1;
                        i11 = this.I$0;
                        long j13 = this.J$0;
                        orderParam2 = (IKLineDataInteractor.OrderParam) this.L$2;
                        kLineDataSession2 = (KLineDataSession) this.L$1;
                        interfaceC44082a4 = (InterfaceC44082a) this.L$0;
                        try {
                            try {
                                ResultKt.throwOnFailure(obj);
                                j12 = j13;
                                i12 = i15;
                                objMo24273d = obj;
                                try {
                                    orderList = (OrderList) objMo24273d;
                                    orderListM24359b = KLineDataSessionCache.f22478a.m24359b(orderParam2, orderList);
                                    iKLineChannel = kLineDataSession2.f22363e;
                                    this.L$0 = interfaceC44082a4;
                                    this.L$1 = kLineDataSession2;
                                    this.L$2 = orderParam2;
                                    this.L$3 = orderList;
                                    this.L$4 = orderListM24359b;
                                    this.J$0 = j12;
                                    this.I$0 = i11;
                                    this.I$1 = i12;
                                    this.label = 3;
                                    if (iKLineChannel.mo24110a(orderListM24359b, this) != coroutine_suspended) {
                                        orderList2 = orderList;
                                        orderList3 = orderListM24359b;
                                        orderParam3 = orderParam2;
                                        kLineDataSession3 = kLineDataSession2;
                                        interfaceC44082a3 = interfaceC44082a4;
                                        KLineRealTimeLog.f22494a.m24393a("loadBS_set_savedTime,symbol=" + orderParam3.getSymbol() + ",type=" + orderParam3.getType().getType() + ",savedTime=" + kLineDataSession3.f22368j.get() + ",previousTime=" + j12 + ", sendFlutter:" + orderList2.getItemsCount() + "(api)," + orderList3.getItemsCount() + "(cached)");
                                        kLineDataSession3.f22368j.set(j12);
                                        ResponseKt$Dsl.Companion companion6 = ResponseKt$Dsl.f22177b;
                                        Response.C12705b c12705bNewBuilder6 = Response.newBuilder();
                                        Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder6, "newBuilder(...)");
                                        responseM24018a = companion6._create(c12705bNewBuilder6).m24018a();
                                        interfaceC44082a3.mo91345e(null);
                                        return responseM24018a;
                                    }
                                    return coroutine_suspended;
                                } catch (Exception e14) {
                                    e = e14;
                                    interfaceC44082a3 = interfaceC44082a4;
                                    function1 = null;
                                    i14 = 2;
                                    C19331c.m42836c(e, function1, i14, function1);
                                    if (!C42899b.m94075e(e)) {
                                        C43043a.m94532c(e, "loadHistoryOrderData error");
                                    }
                                    ResponseKt$Dsl.Companion companion7 = ResponseKt$Dsl.f22177b;
                                    Response.C12705b c12705bNewBuilder7 = Response.newBuilder();
                                    Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder7, "newBuilder(...)");
                                    responseKt$Dsl_create2 = companion7._create(c12705bNewBuilder7);
                                    responseKt$Dsl_create2.m24019b(500);
                                    message2 = e.getMessage();
                                    if (message2 != null) {
                                        responseKt$Dsl_create2.m24020c(message2);
                                    }
                                    responseM24018a = responseKt$Dsl_create2.m24018a();
                                    interfaceC44082a3.mo91345e(null);
                                    return responseM24018a;
                                }
                            } catch (Exception e15) {
                                e = e15;
                                interfaceC44082a3 = interfaceC44082a4;
                                function1 = null;
                                C19331c.m42836c(e, function1, i14, function1);
                                if (!C42899b.m94075e(e)) {
                                    C43043a.m94532c(e, "loadHistoryOrderData error");
                                }
                                ResponseKt$Dsl.Companion companion8 = ResponseKt$Dsl.f22177b;
                                Response.C12705b c12705bNewBuilder8 = Response.newBuilder();
                                Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder8, "newBuilder(...)");
                                responseKt$Dsl_create2 = companion8._create(c12705bNewBuilder8);
                                responseKt$Dsl_create2.m24019b(500);
                                message2 = e.getMessage();
                                if (message2 != null) {
                                    responseKt$Dsl_create2.m24020c(message2);
                                }
                                responseM24018a = responseKt$Dsl_create2.m24018a();
                            }
                        } catch (UndeclaredThrowableException e16) {
                            e = e16;
                            interfaceC44082a3 = interfaceC44082a4;
                            Throwable undeclaredThrowable2 = e.getUndeclaredThrowable();
                            C19331c.m42836c(e, null, 2, null);
                            ResponseKt$Dsl.Companion companion9 = ResponseKt$Dsl.f22177b;
                            Response.C12705b c12705bNewBuilder9 = Response.newBuilder();
                            Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder9, "newBuilder(...)");
                            responseKt$Dsl_create = companion9._create(c12705bNewBuilder9);
                            responseKt$Dsl_create.m24019b(500);
                            message = undeclaredThrowable2.getMessage();
                            if (message != null) {
                                responseKt$Dsl_create.m24020c(message);
                            }
                            responseM24018a = responseKt$Dsl_create.m24018a();
                        } catch (CancellationException unused2) {
                            interfaceC44082a3 = interfaceC44082a4;
                            ResponseKt$Dsl.Companion companion10 = ResponseKt$Dsl.f22177b;
                            Response.C12705b c12705bNewBuilder10 = Response.newBuilder();
                            Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder10, "newBuilder(...)");
                            ResponseKt$Dsl responseKt$Dsl_create4 = companion10._create(c12705bNewBuilder10);
                            responseKt$Dsl_create4.m24019b(300);
                            responseM24018a = responseKt$Dsl_create4.m24018a();
                        } catch (Throwable th2) {
                            th = th2;
                            interfaceC44082a = interfaceC44082a4;
                            interfaceC44082a.mo91345e(null);
                            throw th;
                        }
                        function1 = null;
                        C19331c.m42836c(e, function1, i14, function1);
                        if (!C42899b.m94075e(e)) {
                            C43043a.m94532c(e, "loadHistoryOrderData error");
                        }
                        ResponseKt$Dsl.Companion companion11 = ResponseKt$Dsl.f22177b;
                        Response.C12705b c12705bNewBuilder11 = Response.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder11, "newBuilder(...)");
                        responseKt$Dsl_create2 = companion11._create(c12705bNewBuilder11);
                        responseKt$Dsl_create2.m24019b(500);
                        message2 = e.getMessage();
                        if (message2 != null) {
                            responseKt$Dsl_create2.m24020c(message2);
                        }
                        responseM24018a = responseKt$Dsl_create2.m24018a();
                        interfaceC44082a3.mo91345e(null);
                        return responseM24018a;
                    }
                    i11 = this.I$0;
                    j11 = this.J$0;
                    orderParam = (IKLineDataInteractor.OrderParam) this.L$2;
                    kLineDataSession = (KLineDataSession) this.L$1;
                    interfaceC44082a2 = (InterfaceC44082a) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    C44128b.m97266j("KLineDataSession", "loadHistoryOrderData");
                    IKLineDataInteractor iKLineDataInteractor = kLineDataSession.f22360b;
                    this.L$0 = interfaceC44082a2;
                    this.L$1 = kLineDataSession;
                    this.L$2 = orderParam;
                    this.J$0 = j11;
                    this.I$0 = i11;
                    i12 = 0;
                    this.I$1 = 0;
                    this.label = 2;
                    objMo24273d = iKLineDataInteractor.mo24273d(orderParam, j11, this);
                    if (objMo24273d != coroutine_suspended) {
                        long j14 = j11;
                        orderParam2 = orderParam;
                        interfaceC44082a4 = interfaceC44082a2;
                        kLineDataSession2 = kLineDataSession;
                        j12 = j14;
                        orderList = (OrderList) objMo24273d;
                        orderListM24359b = KLineDataSessionCache.f22478a.m24359b(orderParam2, orderList);
                        iKLineChannel = kLineDataSession2.f22363e;
                        this.L$0 = interfaceC44082a4;
                        this.L$1 = kLineDataSession2;
                        this.L$2 = orderParam2;
                        this.L$3 = orderList;
                        this.L$4 = orderListM24359b;
                        this.J$0 = j12;
                        this.I$0 = i11;
                        this.I$1 = i12;
                        this.label = 3;
                        if (iKLineChannel.mo24110a(orderListM24359b, this) != coroutine_suspended) {
                            orderList2 = orderList;
                            orderList3 = orderListM24359b;
                            orderParam3 = orderParam2;
                            kLineDataSession3 = kLineDataSession2;
                            interfaceC44082a3 = interfaceC44082a4;
                            KLineRealTimeLog.f22494a.m24393a("loadBS_set_savedTime,symbol=" + orderParam3.getSymbol() + ",type=" + orderParam3.getType().getType() + ",savedTime=" + kLineDataSession3.f22368j.get() + ",previousTime=" + j12 + ", sendFlutter:" + orderList2.getItemsCount() + "(api)," + orderList3.getItemsCount() + "(cached)");
                            kLineDataSession3.f22368j.set(j12);
                            ResponseKt$Dsl.Companion companion12 = ResponseKt$Dsl.f22177b;
                            Response.C12705b c12705bNewBuilder12 = Response.newBuilder();
                            Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder12, "newBuilder(...)");
                            responseM24018a = companion12._create(c12705bNewBuilder12).m24018a();
                            interfaceC44082a3.mo91345e(null);
                            return responseM24018a;
                        }
                    }
                    return coroutine_suspended;
                } catch (UndeclaredThrowableException e17) {
                    e = e17;
                    interfaceC44082a3 = interfaceC44082a2;
                    Throwable undeclaredThrowable3 = e.getUndeclaredThrowable();
                    C19331c.m42836c(e, null, 2, null);
                    ResponseKt$Dsl.Companion companion13 = ResponseKt$Dsl.f22177b;
                    Response.C12705b c12705bNewBuilder13 = Response.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder13, "newBuilder(...)");
                    responseKt$Dsl_create = companion13._create(c12705bNewBuilder13);
                    responseKt$Dsl_create.m24019b(500);
                    message = undeclaredThrowable3.getMessage();
                    if (message != null) {
                        responseKt$Dsl_create.m24020c(message);
                    }
                    responseM24018a = responseKt$Dsl_create.m24018a();
                } catch (CancellationException unused3) {
                    interfaceC44082a3 = interfaceC44082a2;
                    ResponseKt$Dsl.Companion companion14 = ResponseKt$Dsl.f22177b;
                    Response.C12705b c12705bNewBuilder14 = Response.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder14, "newBuilder(...)");
                    ResponseKt$Dsl responseKt$Dsl_create5 = companion14._create(c12705bNewBuilder14);
                    responseKt$Dsl_create5.m24019b(300);
                    responseM24018a = responseKt$Dsl_create5.m24018a();
                } catch (Exception e18) {
                    e = e18;
                    interfaceC44082a3 = interfaceC44082a2;
                    function1 = null;
                    i14 = 2;
                    C19331c.m42836c(e, function1, i14, function1);
                    if (!C42899b.m94075e(e)) {
                        C43043a.m94532c(e, "loadHistoryOrderData error");
                    }
                    ResponseKt$Dsl.Companion companion15 = ResponseKt$Dsl.f22177b;
                    Response.C12705b c12705bNewBuilder15 = Response.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder15, "newBuilder(...)");
                    responseKt$Dsl_create2 = companion15._create(c12705bNewBuilder15);
                    responseKt$Dsl_create2.m24019b(500);
                    message2 = e.getMessage();
                    if (message2 != null) {
                        responseKt$Dsl_create2.m24020c(message2);
                    }
                    responseM24018a = responseKt$Dsl_create2.m24018a();
                    interfaceC44082a3.mo91345e(null);
                    return responseM24018a;
                }
                if (kLineDataSession.f22368j.get() == j11) {
                    KLineRealTimeLog.f22494a.m24393a("loadBS,symbol=" + orderParam.getSymbol() + ",type=" + orderParam.getType().getType() + ",savedOrderPreviousTime=previousTime");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("loadHistoryOrderData error sametime: ");
                    sb2.append(j11);
                    C44128b.m97259c("KLineDataSession", sb2.toString());
                    ResponseKt$Dsl.Companion companion16 = ResponseKt$Dsl.f22177b;
                    Response.C12705b c12705bNewBuilder16 = Response.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder16, "newBuilder(...)");
                    ResponseKt$Dsl responseKt$Dsl_create6 = companion16._create(c12705bNewBuilder16);
                    responseKt$Dsl_create6.m24019b(401);
                    responseKt$Dsl_create6.m24018a();
                }
            } catch (Throwable th3) {
                th = th3;
                interfaceC44082a = interfaceC44082a2;
                interfaceC44082a.mo91345e(null);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
