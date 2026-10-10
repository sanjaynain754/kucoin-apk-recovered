package com.sumsub.sns.internal.features.presentation.paymentmethod.selector;

import com.sumsub.sns.internal.features.presentation.paymentmethod.C31391a;
import com.sumsub.sns.internal.features.presentation.paymentmethod.InterfaceC31392b;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C31412s extends FunctionReferenceImpl implements Function1 {
    public C31412s(C31413t c31413t) {
        super(1, c31413t, C31413t.class, "fireOpenEventFor", "fireOpenEventFor(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/PaymentMethodOption;)V", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC31392b interfaceC31392b = (InterfaceC31392b) obj;
        C31413t c31413t = (C31413t) this.receiver;
        c31413t.getClass();
        if (!(interfaceC31392b instanceof C31391a)) {
            throw new NoWhenBranchMatchedException();
        }
        c31413t.fireEvent(new C31405l(((C31391a) interfaceC31392b).f63617a));
        return Unit.INSTANCE;
    }
}
