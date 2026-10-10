package com.kubi.otc.fiat.recharge.capitual;

import android.text.method.LinkMovementMethod;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.payment.common.data.entities.DayLimit;
import com.kubi.payment.common.helper.DayLimitHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import kotlinx.coroutines.InterfaceC41709m0;
import p270ft.C37686t;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FiatRechargeCapitualDetailFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.otc.fiat.recharge.capitual.FiatRechargeCapitualDetailFragment$getDayLimit$1", m90122f = "FiatRechargeCapitualDetailFragment.kt", m90123i = {}, m90124l = {329}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FiatRechargeCapitualDetailFragment$getDayLimit$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FiatRechargeCapitualDetailFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiatRechargeCapitualDetailFragment$getDayLimit$1(FiatRechargeCapitualDetailFragment fiatRechargeCapitualDetailFragment, Continuation<? super FiatRechargeCapitualDetailFragment$getDayLimit$1> continuation) {
        super(2, continuation);
        this.this$0 = fiatRechargeCapitualDetailFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FiatRechargeCapitualDetailFragment$getDayLimit$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FiatRechargeCapitualDetailFragment$getDayLimit$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ConstraintLayout constraintLayout;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
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
            DayLimitHelper dayLimitHelperM44214c4 = this.this$0.m44214c4();
            String strM44193K2 = this.this$0.m44193K2();
            this.label = 1;
            obj = dayLimitHelperM44214c4.m46252h(strM44193K2, FastQuoteModel.PAY_RECHARGE, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        DayLimit dayLimit = (DayLimit) obj;
        if (dayLimit == null) {
            return Unit.INSTANCE;
        }
        if (C27025c.m66566d(dayLimit.getDayLimitWhiteUser())) {
            C37686t c37686tM44252Z3 = this.this$0.m44252Z3();
            if (c37686tM44252Z3 != null && (constraintLayout3 = c37686tM44252Z3.f84645q) != null) {
                C27046k.m66700o(constraintLayout3);
            }
            return Unit.INSTANCE;
        }
        C37686t c37686tM44252Z4 = this.this$0.m44252Z3();
        if (c37686tM44252Z4 != null && (constraintLayout2 = c37686tM44252Z4.f84645q) != null) {
            C27046k.m66685H(constraintLayout2);
        }
        try {
            C37686t c37686tM44252Z5 = this.this$0.m44252Z3();
            if (c37686tM44252Z5 != null && (baseTextView2 = c37686tM44252Z5.f84635g) != null) {
                baseTextView2.setText(this.this$0.m44253a4(dayLimit));
            }
            C37686t c37686tM44252Z6 = this.this$0.m44252Z3();
            if (c37686tM44252Z6 != null && (baseTextView = c37686tM44252Z6.f84635g) != null) {
                baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        } catch (Exception unused) {
            C37686t c37686tM44252Z7 = this.this$0.m44252Z3();
            if (c37686tM44252Z7 != null && (constraintLayout = c37686tM44252Z7.f84645q) != null) {
                C27046k.m66700o(constraintLayout);
            }
        }
        return Unit.INSTANCE;
    }
}
