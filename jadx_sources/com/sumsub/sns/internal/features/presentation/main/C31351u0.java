package com.sumsub.sns.internal.features.presentation.main;

import androidx.fragment.app.Fragment;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.u0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C31351u0 extends FunctionReferenceImpl implements Function2 {
    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SNSAppActivity sNSAppActivity = (SNSAppActivity) this.receiver;
        int i11 = SNSAppActivity.f63146j;
        sNSAppActivity.m70603a((Fragment) obj, (String) obj2);
        return Unit.INSTANCE;
    }

    public C31351u0(SNSAppActivity sNSAppActivity) {
        super(2, sNSAppActivity, SNSAppActivity.class, "showFragment", "showFragment(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", 0);
    }
}
