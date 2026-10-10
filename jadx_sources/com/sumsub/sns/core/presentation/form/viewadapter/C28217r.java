package com.sumsub.sns.core.presentation.form.viewadapter;

import android.view.View;
import com.sumsub.sns.core.presentation.form.C28167d;
import com.sumsub.sns.core.presentation.form.InterfaceC28164a;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataInfoBannerView;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28815I;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewadapter.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28217r extends AbstractC28211o {

    /* JADX INFO: renamed from: d */
    public final InterfaceC28164a f57506d;

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.AbstractC28211o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69125a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0, int i11) {
        m69150a((SNSApplicantDataInfoBannerView) sNSApplicantDataBaseFieldView, (C28815I) abstractC28841e0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m69149a(C28217r c28217r, C28815I c28815i, View view) {
        InterfaceC28164a interfaceC28164a = c28217r.f57506d;
        if (interfaceC28164a != null) {
            interfaceC28164a.mo69092a(c28815i.f58594g);
        }
    }

    public C28217r(SNSApplicantDataInfoBannerView sNSApplicantDataInfoBannerView, InterfaceC28164a interfaceC28164a, C28167d c28167d) {
        super(sNSApplicantDataInfoBannerView, interfaceC28164a, c28167d);
        this.f57506d = interfaceC28164a;
    }

    /* JADX INFO: renamed from: a */
    public final void m69150a(SNSApplicantDataInfoBannerView sNSApplicantDataInfoBannerView, final C28815I c28815i) {
        sNSApplicantDataInfoBannerView.setText(c28815i.f58592e);
        sNSApplicantDataInfoBannerView.setActionText(c28815i.f58593f);
        sNSApplicantDataInfoBannerView.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.core.presentation.form.viewadapter.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C28217r.m69149a(this.f57490b, c28815i, view);
            }
        });
    }
}
