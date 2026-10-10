package com.kubi.margin.trade.dialog;

import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CrossMarginClosePositionDialog.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "validationToken", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.trade.dialog.CrossMarginClosePositionDialog$initMarginLiquidationUI$3$1", m90122f = "CrossMarginClosePositionDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CrossMarginClosePositionDialog$initMarginLiquidationUI$3$1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CrossMarginClosePositionDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossMarginClosePositionDialog$initMarginLiquidationUI$3$1(CrossMarginClosePositionDialog crossMarginClosePositionDialog, Continuation<? super CrossMarginClosePositionDialog$initMarginLiquidationUI$3$1> continuation) {
        super(2, continuation);
        this.this$0 = crossMarginClosePositionDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CrossMarginClosePositionDialog$initMarginLiquidationUI$3$1 crossMarginClosePositionDialog$initMarginLiquidationUI$3$1 = new CrossMarginClosePositionDialog$initMarginLiquidationUI$3$1(this.this$0, continuation);
        crossMarginClosePositionDialog$initMarginLiquidationUI$3$1.L$0 = obj;
        return crossMarginClosePositionDialog$initMarginLiquidationUI$3$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((CrossMarginClosePositionDialog$initMarginLiquidationUI$3$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.m40079M3().sendIntent(new CrossMarginCloseContract$UiIntent.CrossClosePosition(str));
        return Unit.INSTANCE;
    }
}
