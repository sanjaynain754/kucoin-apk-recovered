package com.kubi.margin.trade.dialog;

import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
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
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.trade.dialog.CrossMarginClosePositionDialog$startCollectFlow$1", m90122f = "CrossMarginClosePositionDialog.kt", m90123i = {}, m90124l = {169}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CrossMarginClosePositionDialog$startCollectFlow$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CrossMarginClosePositionDialog this$0;

    /* JADX INFO: renamed from: com.kubi.margin.trade.dialog.CrossMarginClosePositionDialog$startCollectFlow$1$1 */
    /* JADX INFO: compiled from: CrossMarginClosePositionDialog.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "uiState", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$UiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.margin.trade.dialog.CrossMarginClosePositionDialog$startCollectFlow$1$1", m90122f = "CrossMarginClosePositionDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C182151 extends SuspendLambda implements Function2<UiState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CrossMarginClosePositionDialog this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(UiState uiState, Continuation<? super Unit> continuation) {
            return ((C182151) create(uiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C182151(CrossMarginClosePositionDialog crossMarginClosePositionDialog, Continuation<? super C182151> continuation) {
            super(2, continuation);
            this.this$0 = crossMarginClosePositionDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C182151 c182151 = new C182151(this.this$0, continuation);
            c182151.L$0 = obj;
            return c182151;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UiState uiState = (UiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC18232b configState = uiState.getConfigState();
            if (configState instanceof InterfaceC18232b.b) {
                this.this$0.m40087d4();
            } else if (configState instanceof InterfaceC18232b.Success) {
                InterfaceC18232b.Success success = (InterfaceC18232b.Success) configState;
                this.this$0.m40086c4(success.getSelected(), success.m40268a());
            } else if (configState instanceof InterfaceC18232b.a) {
                this.this$0.m40085a4();
            } else {
                this.this$0.m40087d4();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossMarginClosePositionDialog$startCollectFlow$1(CrossMarginClosePositionDialog crossMarginClosePositionDialog, Continuation<? super CrossMarginClosePositionDialog$startCollectFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = crossMarginClosePositionDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CrossMarginClosePositionDialog$startCollectFlow$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CrossMarginClosePositionDialog$startCollectFlow$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<UiState> stateFlow = this.this$0.m40079M3().getStateFlow();
            C182151 c182151 = new C182151(this.this$0, null);
            this.label = 1;
            if (C41636g.m90925l(stateFlow, c182151, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
