package com.kubi.margin.trade.dialog;

import com.kubi.margin.trade.position.MarginWholePositionFragment;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.sdk.BaseFragment;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: MarginWholePositionFragmentExt.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.trade.dialog.MarginWholePositionFragmentExtKt$collectEventFlowForUI$1", m90122f = "MarginWholePositionFragmentExt.kt", m90123i = {}, m90124l = {25}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MarginWholePositionFragmentExtKt$collectEventFlowForUI$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ MarginWholePositionFragment $this_collectEventFlowForUI;
    int label;

    /* JADX INFO: renamed from: com.kubi.margin.trade.dialog.MarginWholePositionFragmentExtKt$collectEventFlowForUI$1$a */
    /* JADX INFO: compiled from: MarginWholePositionFragmentExt.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18227a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MarginWholePositionFragment f33782b;

        public C18227a(MarginWholePositionFragment marginWholePositionFragment) {
            this.f33782b = marginWholePositionFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(InterfaceC36952a interfaceC36952a, Continuation<? super Unit> continuation) {
            if (interfaceC36952a instanceof SingleEvent.C19246b) {
                BaseFragment.hideLoadingDialog$default(this.f33782b, false, 1, null);
            } else if (interfaceC36952a instanceof SingleEvent.C19252h) {
                this.f33782b.showLoadingDialog();
            } else if (interfaceC36952a instanceof CancelClosePositionResultSuccess) {
                MarginWholePositionFragmentExtKt.m40252e();
            } else if (interfaceC36952a instanceof CancelClosePositionResultFailed) {
                MarginWholePositionFragmentExtKt.m40253f((CancelClosePositionResultFailed) interfaceC36952a);
            } else if (interfaceC36952a instanceof ClosePositionResultSuccess) {
                MarginWholePositionFragmentExtKt.m40255h((ClosePositionResultSuccess) interfaceC36952a);
            } else if (interfaceC36952a instanceof ClosePositionResultFailed) {
                MarginWholePositionFragmentExtKt.m40254g((ClosePositionResultFailed) interfaceC36952a);
            } else {
                C44128b.m97260d("unknown event: " + interfaceC36952a);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginWholePositionFragmentExtKt$collectEventFlowForUI$1(MarginWholePositionFragment marginWholePositionFragment, Continuation<? super MarginWholePositionFragmentExtKt$collectEventFlowForUI$1> continuation) {
        super(2, continuation);
        this.$this_collectEventFlowForUI = marginWholePositionFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginWholePositionFragmentExtKt$collectEventFlowForUI$1(this.$this_collectEventFlowForUI, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MarginWholePositionFragmentExtKt$collectEventFlowForUI$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(this.$this_collectEventFlowForUI.m40573Q3().getSingleEventFlow(), C41782z0.m91393c());
            C18227a c18227a = new C18227a(this.$this_collectEventFlowForUI);
            this.label = 1;
            if (interfaceC41634eM90890N.collect(c18227a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
