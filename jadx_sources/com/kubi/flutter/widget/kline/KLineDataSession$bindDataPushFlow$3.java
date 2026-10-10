package com.kubi.flutter.widget.kline;

import com.kubi.flutter.proto.kline.CandleList;
import com.kubi.flutter.widget.kline.utils.KLineReport;
import com.kubi.network.retrofit.utils.C19331c;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p481ny.C42899b;
import p499og.C43043a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KLineDataSession.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/kubi/flutter/proto/kline/CandleList;", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineDataSession$bindDataPushFlow$3", m90122f = "KLineDataSession.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKLineDataSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineDataSession.kt\ncom/kubi/flutter/widget/kline/KLineDataSession$bindDataPushFlow$3\n+ 2 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n*L\n1#1,322:1\n45#2,4:323\n*S KotlinDebug\n*F\n+ 1 KLineDataSession.kt\ncom/kubi/flutter/widget/kline/KLineDataSession$bindDataPushFlow$3\n*L\n203#1:323,4\n*E\n"})
public final class KLineDataSession$bindDataPushFlow$3 extends SuspendLambda implements Function3<InterfaceC41635f<? super CandleList>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $from;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KLineDataSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineDataSession$bindDataPushFlow$3(KLineDataSession kLineDataSession, String str, Continuation<? super KLineDataSession$bindDataPushFlow$3> continuation) {
        super(3, continuation);
        this.this$0 = kLineDataSession;
        this.$from = str;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(InterfaceC41635f<? super CandleList> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
        KLineDataSession$bindDataPushFlow$3 kLineDataSession$bindDataPushFlow$3 = new KLineDataSession$bindDataPushFlow$3(this.this$0, this.$from, continuation);
        kLineDataSession$bindDataPushFlow$3.L$0 = th2;
        return kLineDataSession$bindDataPushFlow$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th2 = (Throwable) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!(th2 instanceof CancellationException)) {
            Throwable undeclaredThrowable = th2 instanceof UndeclaredThrowableException ? ((UndeclaredThrowableException) th2).getUndeclaredThrowable() : th2;
            Intrinsics.checkNotNull(undeclaredThrowable);
            C19331c.m42836c(undeclaredThrowable, null, 2, null);
            if (!C42899b.m94075e(th2)) {
                C43043a.m94532c(th2, "bindDataPushFlow error");
            }
        }
        if (this.this$0.f22369k.compareAndSet(true, false)) {
            this.this$0.f22361c.mo24147d(KLineLoadingState.LoadFailed);
            KLineReport.f22495a.m24396a("load", this.this$0.f22359a.getSymbol(), this.this$0.f22359a.getBiz(), this.this$0.f22359a.getType().getType(), th2.getMessage(), this.$from, this.this$0.f22370l.getAndSet(false));
        }
        return Unit.INSTANCE;
    }
}
