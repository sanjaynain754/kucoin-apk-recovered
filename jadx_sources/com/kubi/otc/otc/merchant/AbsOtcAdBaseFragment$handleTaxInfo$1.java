package com.kubi.otc.otc.merchant;

import com.kubi.otc.entity.OtcAd;
import com.kubi.payment.p2p.P2PHelper;
import com.kubi.payment.p2p.data.entities.TaxInfo;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import kotlinx.coroutines.InterfaceC41709m0;
import p270ft.C37601c;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AbsOtcAdBaseFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.otc.otc.merchant.AbsOtcAdBaseFragment$handleTaxInfo$1", m90122f = "AbsOtcAdBaseFragment.kt", m90123i = {}, m90124l = {674}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AbsOtcAdBaseFragment$handleTaxInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ AbsOtcAdBaseFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsOtcAdBaseFragment$handleTaxInfo$1(AbsOtcAdBaseFragment absOtcAdBaseFragment, Continuation<? super AbsOtcAdBaseFragment$handleTaxInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = absOtcAdBaseFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AbsOtcAdBaseFragment$handleTaxInfo$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AbsOtcAdBaseFragment$handleTaxInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean boolBoxBoolean;
        AbsOtcAdBaseFragment absOtcAdBaseFragment;
        Boolean boolBoxBoolean2;
        C37601c c37601cM44829L4;
        BaseTextView baseTextView;
        Boolean hit;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        String alertMessage = null;
        if (i11 != 0) {
            if (i11 == 1) {
                absOtcAdBaseFragment = (AbsOtcAdBaseFragment) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            OtcAd f37662y = this.this$0.getF37662Y();
            if (f37662y != null) {
                boolBoxBoolean = Boxing.boxBoolean(f37662y.isBuy());
            } else {
                boolBoxBoolean = null;
            }
            if (C27025c.m66566d(boolBoxBoolean)) {
                return Unit.INSTANCE;
            }
            AbsOtcAdBaseFragment absOtcAdBaseFragment2 = this.this$0;
            P2PHelper p2PHelper = P2PHelper.f39683a;
            this.L$0 = absOtcAdBaseFragment2;
            this.label = 1;
            Object objM48409a = p2PHelper.m48409a(this);
            if (objM48409a == coroutine_suspended) {
                return coroutine_suspended;
            }
            absOtcAdBaseFragment = absOtcAdBaseFragment2;
            obj = objM48409a;
        }
        absOtcAdBaseFragment.f37679p0 = (TaxInfo) obj;
        OtcAd f37662y2 = this.this$0.getF37662Y();
        if (f37662y2 != null) {
            boolBoxBoolean2 = Boxing.boxBoolean(f37662y2.isBuy());
        } else {
            boolBoxBoolean2 = null;
        }
        if (!C27025c.m66566d(boolBoxBoolean2)) {
            TaxInfo taxInfo = this.this$0.f37679p0;
            if (taxInfo != null) {
                hit = taxInfo.getHit();
            } else {
                hit = null;
            }
            if (C27025c.m66566d(hit)) {
                C37601c c37601cM44829L5 = this.this$0.m44829L4();
                if (c37601cM44829L5 != null && (baseTextView3 = c37601cM44829L5.f83680Y) != null) {
                    TaxInfo taxInfo2 = this.this$0.f37679p0;
                    if (taxInfo2 != null) {
                        alertMessage = taxInfo2.getAlertMessage();
                    }
                    baseTextView3.setText(C27041f.m66668h(alertMessage));
                }
                C37601c c37601cM44829L6 = this.this$0.m44829L4();
                if (c37601cM44829L6 != null && (baseTextView2 = c37601cM44829L6.f83680Y) != null) {
                    C27046k.m66685H(baseTextView2);
                }
            } else {
                c37601cM44829L4 = this.this$0.m44829L4();
                if (c37601cM44829L4 != null) {
                    C27046k.m66700o(baseTextView);
                }
            }
        } else {
            c37601cM44829L4 = this.this$0.m44829L4();
            if (c37601cM44829L4 != null && (baseTextView = c37601cM44829L4.f83680Y) != null) {
                C27046k.m66700o(baseTextView);
            }
        }
        return Unit.INSTANCE;
    }
}
