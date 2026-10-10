package com.kubi.transfer;

import c60.C4850d;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.transfer.view.TransferAmountView;
import com.kubi.transfer.view.TransferCoinPairView;
import com.kubi.transfer.view.TransferCoinView;
import com.kubi.transfer.view.TransferTipView;
import com.kubi.utils.extensions.core.ViewExtKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TransferFragment.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.transfer.TransferFragment$bindState3$4", m90122f = "TransferFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TransferFragment$bindState3$4 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ TransferFragment this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferFragment$bindState3$4(TransferFragment transferFragment, Continuation<? super TransferFragment$bindState3$4> continuation) {
        super(2, continuation);
        this.this$0 = transferFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransferFragment$bindState3$4 transferFragment$bindState3$4 = new TransferFragment$bindState3$4(this.this$0, continuation);
        transferFragment$bindState3$4.Z$0 = ((Boolean) obj).booleanValue();
        return transferFragment$bindState3$4;
    }

    public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
        return ((TransferFragment$bindState3$4) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TransferAmountView transferAmountView;
        KcPrimaryButton kcPrimaryButton;
        TransferCoinView transferCoinView;
        TransferCoinPairView transferCoinPairView;
        TransferAmountView transferAmountView2;
        TransferTipView transferTipView;
        boolean z11 = this.Z$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (z11) {
            C4850d c4850dM64464r4 = this.this$0.m64464r4();
            if (c4850dM64464r4 != null && (transferTipView = c4850dM64464r4.f4957k) != null) {
                transferTipView.m64837j(TransferFragment.m64406Y3(this.this$0).getAccountInfo().getFromType(), TransferFragment.m64406Y3(this.this$0).getAccountInfo().getToType());
            }
            C4850d c4850dM64464r5 = this.this$0.m64464r4();
            if (c4850dM64464r5 != null && (transferAmountView2 = c4850dM64464r5.f4954h) != null) {
                ViewExtKt.m66577h(transferAmountView2);
            }
            C4850d c4850dM64464r6 = this.this$0.m64464r4();
            if (c4850dM64464r6 != null && (transferCoinPairView = c4850dM64464r6.f4955i) != null) {
                ViewExtKt.m66577h(transferCoinPairView);
            }
            C4850d c4850dM64464r7 = this.this$0.m64464r4();
            if (c4850dM64464r7 != null && (transferCoinView = c4850dM64464r7.f4956j) != null) {
                ViewExtKt.m66577h(transferCoinView);
            }
            C4850d c4850dM64464r8 = this.this$0.m64464r4();
            if (c4850dM64464r8 != null && (kcPrimaryButton = c4850dM64464r8.f4959m) != null) {
                kcPrimaryButton.setEnabled(false);
            }
        } else {
            C4850d c4850dM64464r9 = this.this$0.m64464r4();
            if (c4850dM64464r9 != null && (transferAmountView = c4850dM64464r9.f4954h) != null) {
                ViewExtKt.m66594y(transferAmountView);
            }
            this.this$0.m64447D4();
        }
        return Unit.INSTANCE;
    }
}
