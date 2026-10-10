package com.kubi.copytrading.widgets;

import com.kubi.copytrading.entity.CopyTradingWidgetEntity;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CopyTradingWidget.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/copytrading/entity/CopyTradingWidgetEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.copytrading.widgets.CopyTradingWidget$bindUIState$2", m90122f = "CopyTradingWidget.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nCopyTradingWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTradingWidget.kt\ncom/kubi/copytrading/widgets/CopyTradingWidget$bindUIState$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,279:1\n1#2:280\n*E\n"})
public final class CopyTradingWidget$bindUIState$2 extends SuspendLambda implements Function2<List<? extends CopyTradingWidgetEntity>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CopyTradingWidget this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends CopyTradingWidgetEntity> list, Continuation<? super Unit> continuation) {
        return invoke2((List<CopyTradingWidgetEntity>) list, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingWidget$bindUIState$2(CopyTradingWidget copyTradingWidget, Continuation<? super CopyTradingWidget$bindUIState$2> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingWidget;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CopyTradingWidget$bindUIState$2 copyTradingWidget$bindUIState$2 = new CopyTradingWidget$bindUIState$2(this.this$0, continuation);
        copyTradingWidget$bindUIState$2.L$0 = obj;
        return copyTradingWidget$bindUIState$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<CopyTradingWidgetEntity> list, Continuation<? super Unit> continuation) {
        return ((CopyTradingWidget$bindUIState$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (list != null) {
            this.this$0.m20967w3(list);
        }
        return Unit.INSTANCE;
    }
}
