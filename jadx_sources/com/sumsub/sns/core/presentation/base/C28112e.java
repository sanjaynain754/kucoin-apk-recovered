package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.core.widget.SNSProgressView;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.features.presentation.main.C31263f2;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import p852kotlin.Unit;
import p852kotlin.coroutines.jvm.internal.SuspendFunction;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C28112e extends AdaptedFunctionReference implements Function2, SuspendFunction {
    public C28112e(AbstractActivityC28115f abstractActivityC28115f) {
        super(2, abstractActivityC28115f, AbstractActivityC28115f.class, "handleState", "handleState(Lcom/sumsub/sns/core/presentation/base/SNSBaseViewModel$SNSViewModelState;)V", 4);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SNSProgressView sNSProgressView;
        SNSAppActivity sNSAppActivity = (SNSAppActivity) ((AbstractActivityC28115f) this.receiver);
        sNSAppActivity.getClass();
        C31263f2 c31263f2 = (C31263f2) ((InterfaceC28147s) obj);
        if (c31263f2.f63321a && (sNSProgressView = sNSAppActivity.f63148f) != null) {
            sNSProgressView.setText(c31263f2.f63324d);
        }
        if (c31263f2.f63323c) {
            SNSProgressView sNSProgressView2 = sNSAppActivity.f63148f;
            if (sNSProgressView2 != null) {
                sNSProgressView2.setText(c31263f2.f63325e);
            }
        } else {
            Boolean bool = c31263f2.f63322b;
            if (bool != null) {
                if (bool.booleanValue()) {
                    SNSProgressView sNSProgressView3 = sNSAppActivity.f63148f;
                    if (sNSProgressView3 != null) {
                        AbstractC28458h.m69354d(sNSProgressView3);
                    }
                } else {
                    SNSProgressView sNSProgressView4 = sNSAppActivity.f63148f;
                    if (sNSProgressView4 != null) {
                        sNSProgressView4.setText(c31263f2.f63324d);
                    }
                    SNSProgressView sNSProgressView5 = sNSAppActivity.f63148f;
                    if (sNSProgressView5 != null) {
                        AbstractC28458h.m69351b(sNSProgressView5);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
