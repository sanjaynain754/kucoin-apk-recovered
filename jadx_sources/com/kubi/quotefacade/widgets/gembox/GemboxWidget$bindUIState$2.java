package com.kubi.quotefacade.widgets.gembox;

import com.kubi.quotefacade.entity.ChanceGemBoxCurrency;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GemboxWidget.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/quotefacade/entity/ChanceGemBoxCurrency;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.widgets.gembox.GemboxWidget$bindUIState$2", m90122f = "GemboxWidget.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nGemboxWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GemboxWidget.kt\ncom/kubi/quotefacade/widgets/gembox/GemboxWidget$bindUIState$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n1#2:150\n*E\n"})
public final class GemboxWidget$bindUIState$2 extends SuspendLambda implements Function2<ChanceGemBoxCurrency, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GemboxWidget this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(ChanceGemBoxCurrency chanceGemBoxCurrency, Continuation<? super Unit> continuation) {
        return ((GemboxWidget$bindUIState$2) create(chanceGemBoxCurrency, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GemboxWidget$bindUIState$2(GemboxWidget gemboxWidget, Continuation<? super GemboxWidget$bindUIState$2> continuation) {
        super(2, continuation);
        this.this$0 = gemboxWidget;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GemboxWidget$bindUIState$2 gemboxWidget$bindUIState$2 = new GemboxWidget$bindUIState$2(this.this$0, continuation);
        gemboxWidget$bindUIState$2.L$0 = obj;
        return gemboxWidget$bindUIState$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChanceGemBoxCurrency chanceGemBoxCurrency = (ChanceGemBoxCurrency) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (chanceGemBoxCurrency != null) {
            this.this$0.m53563q3(chanceGemBoxCurrency);
        }
        return Unit.INSTANCE;
    }
}
