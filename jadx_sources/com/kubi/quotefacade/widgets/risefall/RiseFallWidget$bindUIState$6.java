package com.kubi.quotefacade.widgets.risefall;

import java.math.BigDecimal;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RiseFallWidget.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Ljava/math/BigDecimal;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.widgets.risefall.RiseFallWidget$bindUIState$6", m90122f = "RiseFallWidget.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nRiseFallWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiseFallWidget.kt\ncom/kubi/quotefacade/widgets/risefall/RiseFallWidget$bindUIState$6\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,188:1\n1#2:189\n*E\n"})
public final class RiseFallWidget$bindUIState$6 extends SuspendLambda implements Function2<BigDecimal, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RiseFallWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiseFallWidget$bindUIState$6(RiseFallWidget riseFallWidget, Continuation<? super RiseFallWidget$bindUIState$6> continuation) {
        super(2, continuation);
        this.this$0 = riseFallWidget;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RiseFallWidget$bindUIState$6 riseFallWidget$bindUIState$6 = new RiseFallWidget$bindUIState$6(this.this$0, continuation);
        riseFallWidget$bindUIState$6.L$0 = obj;
        return riseFallWidget$bindUIState$6;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(BigDecimal bigDecimal, Continuation<? super Unit> continuation) {
        return ((RiseFallWidget$bindUIState$6) create(bigDecimal, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BigDecimal bigDecimal = (BigDecimal) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (bigDecimal != null) {
            this.this$0.m53607B3(false, bigDecimal);
        }
        return Unit.INSTANCE;
    }
}
