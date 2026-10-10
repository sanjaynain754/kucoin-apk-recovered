package com.kubi.quotefacade.widgets.risefall;

import com.kubi.quotefacade.entity.RiseFallEntity;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RiseFallFullWidget.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/quotefacade/entity/RiseFallEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.widgets.risefall.RiseFallFullWidget$bindUIState$2", m90122f = "RiseFallFullWidget.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nRiseFallFullWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiseFallFullWidget.kt\ncom/kubi/quotefacade/widgets/risefall/RiseFallFullWidget$bindUIState$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,234:1\n1#2:235\n*E\n"})
public final class RiseFallFullWidget$bindUIState$2 extends SuspendLambda implements Function2<RiseFallEntity, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RiseFallFullWidget this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(RiseFallEntity riseFallEntity, Continuation<? super Unit> continuation) {
        return ((RiseFallFullWidget$bindUIState$2) create(riseFallEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiseFallFullWidget$bindUIState$2(RiseFallFullWidget riseFallFullWidget, Continuation<? super RiseFallFullWidget$bindUIState$2> continuation) {
        super(2, continuation);
        this.this$0 = riseFallFullWidget;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RiseFallFullWidget$bindUIState$2 riseFallFullWidget$bindUIState$2 = new RiseFallFullWidget$bindUIState$2(this.this$0, continuation);
        riseFallFullWidget$bindUIState$2.L$0 = obj;
        return riseFallFullWidget$bindUIState$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RiseFallEntity riseFallEntity = (RiseFallEntity) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (riseFallEntity != null) {
            this.this$0.m53606v3(riseFallEntity);
        }
        return Unit.INSTANCE;
    }
}
