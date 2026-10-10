package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.presentation.main.navigation.C31305a;
import com.sumsub.sns.internal.features.presentation.main.navigation.C31306b;
import com.sumsub.sns.internal.features.presentation.main.navigation.C31307c;
import com.sumsub.sns.internal.features.presentation.main.navigation.C31308d;
import com.sumsub.sns.internal.features.presentation.main.navigation.C31309e;
import com.sumsub.sns.internal.features.presentation.main.navigation.InterfaceC31310f;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.coroutines.jvm.internal.SuspendFunction;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.n1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C31303n1 extends AdaptedFunctionReference implements Function2, SuspendFunction {
    public C31303n1(C31243a2 c31243a2) {
        super(2, c31243a2, C31243a2.class, "handleRouterNotification", "handleRouterNotification(Lcom/sumsub/sns/internal/features/presentation/main/navigation/ServerNavigationEvent;)V", 4);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        InterfaceC31310f interfaceC31310f = (InterfaceC31310f) obj;
        C31243a2 c31243a2 = (C31243a2) this.receiver;
        c31243a2.getClass();
        if (interfaceC31310f instanceof C31306b) {
            c31243a2.fireEvent(((C31306b) interfaceC31310f).f63444a);
        } else if (interfaceC31310f instanceof C31305a) {
            C31305a c31305a = (C31305a) interfaceC31310f;
            AbstractC28052C.throwError$default(c31243a2, c31305a.f63442a, c31305a.f63443b, null, 4, null);
        } else {
            if (interfaceC31310f instanceof C31309e) {
                String str2 = ((C31309e) interfaceC31310f).f63449a;
                C29124h c29124h = (C29124h) c31243a2.f63225h.f60332a.mo69412b();
                str = c29124h != null ? c29124h.f59068a : null;
                C31243a2.m70616a(new SNSEvent.SNSEventStepInitiated(str != null ? str : "", str2));
            } else if (interfaceC31310f instanceof C31308d) {
                C29124h c29124h2 = (C29124h) c31243a2.f63225h.f60332a.mo69412b();
                str = c29124h2 != null ? c29124h2.f59068a : null;
                C31308d c31308d = (C31308d) interfaceC31310f;
                C31243a2.m70616a(new SNSEvent.SNSEventStepCompleted(str != null ? str : "", c31308d.f63446a, c31308d.f63448c, c31308d.f63447b));
            } else if (!(interfaceC31310f instanceof C31307c)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
