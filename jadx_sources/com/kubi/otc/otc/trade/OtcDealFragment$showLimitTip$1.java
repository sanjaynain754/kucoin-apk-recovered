package com.kubi.otc.otc.trade;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.otc.R$color;
import com.kubi.otc.entity.OtcInfoEntity;
import com.kubi.payment.fast.common.helper.TradeLimitHelper;
import com.kubi.resources.widget.DashTextView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import kotlinx.coroutines.InterfaceC41709m0;
import p270ft.C37631i;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: OtcDealFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.otc.otc.trade.OtcDealFragment$showLimitTip$1", m90122f = "OtcDealFragment.kt", m90123i = {}, m90124l = {444}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class OtcDealFragment$showLimitTip$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OtcDealFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtcDealFragment$showLimitTip$1(OtcDealFragment otcDealFragment, Continuation<? super OtcDealFragment$showLimitTip$1> continuation) {
        super(2, continuation);
        this.this$0 = otcDealFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OtcDealFragment$showLimitTip$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OtcDealFragment$showLimitTip$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m45420f(OtcDealFragment otcDealFragment) {
        otcDealFragment.m45360o6();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean boolBoxBoolean;
        C37631i c37631iM45398I4;
        ConstraintLayout constraintLayout;
        DashTextView dashTextView;
        DashTextView dashTextView2;
        ConstraintLayout constraintLayout2;
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
            OtcInfoEntity otcInfoEntity = this.this$0.f38046W;
            String legal = null;
            if (otcInfoEntity != null) {
                boolBoxBoolean = Boxing.boxBoolean(otcInfoEntity.isBuy());
            } else {
                boolBoxBoolean = null;
            }
            if (!C27025c.m66566d(boolBoxBoolean)) {
                c37631iM45398I4 = this.this$0.m45398I4();
                if (c37631iM45398I4 != null && (constraintLayout = c37631iM45398I4.f84002O) != null) {
                    C27046k.m66700o(constraintLayout);
                }
            } else {
                TradeLimitHelper tradeLimitHelper = new TradeLimitHelper();
                OtcInfoEntity otcInfoEntity2 = this.this$0.f38046W;
                if (otcInfoEntity2 != null) {
                    legal = otcInfoEntity2.getLegal();
                }
                String strM66668h = C27041f.m66668h(legal);
                this.label = 1;
                obj = tradeLimitHelper.m46374d(strM66668h, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (((Boolean) obj).booleanValue()) {
            C37631i c37631iM45398I5 = this.this$0.m45398I4();
            if (c37631iM45398I5 != null && (constraintLayout2 = c37631iM45398I5.f84002O) != null) {
                C27046k.m66685H(constraintLayout2);
            }
            C37631i c37631iM45398I6 = this.this$0.m45398I4();
            if (c37631iM45398I6 != null && (dashTextView2 = c37631iM45398I6.f84026x) != null) {
                dashTextView2.setDashLineColor(this.this$0.getColorRes(R$color.c_text40));
            }
            C37631i c37631iM45398I7 = this.this$0.m45398I4();
            if (c37631iM45398I7 != null && (dashTextView = c37631iM45398I7.f84026x) != null) {
                final OtcDealFragment otcDealFragment = this.this$0;
                C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.otc.otc.trade.r1
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OtcDealFragment$showLimitTip$1.m45420f(otcDealFragment);
                    }
                }, 1, null);
            }
        } else {
            c37631iM45398I4 = this.this$0.m45398I4();
            if (c37631iM45398I4 != null) {
                C27046k.m66700o(constraintLayout);
            }
        }
        return Unit.INSTANCE;
    }
}
