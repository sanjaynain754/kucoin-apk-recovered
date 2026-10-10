package com.sumsub.sns.internal.features.presentation.verification2.code;

import com.sumsub.sns.core.widget.pincode.SNSPinView;
import com.sumsub.sns.databinding.C28355t;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.code.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32752h extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67011a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32759o f67012b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32752h(C32759o c32759o, Continuation continuation) {
        super(2, continuation);
        this.f67012b = c32759o;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32752h c32752h = new C32752h(this.f67012b, continuation);
        c32752h.f67011a = obj;
        return c32752h;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32752h c32752h = new C32752h(this.f67012b, (Continuation) obj2);
        c32752h.f67011a = (C32760p) obj;
        return c32752h.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (((C32760p) this.f67011a) != null) {
            C32759o c32759o = this.f67012b;
            int i11 = C32759o.f67020U;
            C28355t viewBinding = c32759o.getViewBinding();
            if (viewBinding != null) {
                viewBinding.f57793c.setText((CharSequence) null);
            }
            C28355t viewBinding2 = c32759o.getViewBinding();
            if (viewBinding2 != null) {
                AbstractC28458h.m69356f(viewBinding2.f57793c);
            }
            C28355t viewBinding3 = c32759o.getViewBinding();
            if (viewBinding3 != null) {
                SNSPinView sNSPinView = viewBinding3.f57793c;
                sNSPinView.addTextChangedListener(new C32753i(sNSPinView, c32759o));
            }
            return Unit.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
