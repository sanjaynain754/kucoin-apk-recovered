package com.kubi.flutter.widget.kline;

import com.kubi.flutter.proto.kline.CandleList;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: KLineDataSession.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/flutter/proto/kline/CandleList;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineDataSession$bindDataPushFlow$deferred$1", m90122f = "KLineDataSession.kt", m90123i = {0}, m90124l = {164}, m90125m = "invokeSuspend", m90126n = {"previousTime"}, m90127s = {"J$0"})
public final class KLineDataSession$bindDataPushFlow$deferred$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super CandleList>, Object> {
    final /* synthetic */ long $nowSecond;
    long J$0;
    int label;
    final /* synthetic */ KLineDataSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineDataSession$bindDataPushFlow$deferred$1(KLineDataSession kLineDataSession, long j11, Continuation<? super KLineDataSession$bindDataPushFlow$deferred$1> continuation) {
        super(2, continuation);
        this.this$0 = kLineDataSession;
        this.$nowSecond = j11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineDataSession$bindDataPushFlow$deferred$1(this.this$0, this.$nowSecond, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super CandleList> continuation) {
        return ((KLineDataSession$bindDataPushFlow$deferred$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
        long jM24367b = C12802p.m24367b(this.this$0.f22359a.getType(), this.$nowSecond);
        C44128b.m97266j("KLineDataSession", "dataSession PRELOAD " + jM24367b);
        IKLineDataInteractor iKLineDataInteractor = this.this$0.f22360b;
        IKLineDataInteractor.DataParam dataParam = this.this$0.f22359a;
        this.J$0 = jM24367b;
        this.label = 1;
        Object objMo24270a = iKLineDataInteractor.mo24270a(dataParam, jM24367b, this);
        if (objMo24270a == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objMo24270a;
    }
}
