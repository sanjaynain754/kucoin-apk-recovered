package com.sumsub.sns.core.presentation.form.viewadapter;

import android.content.Context;
import com.sumsub.sns.core.presentation.form.C28167d;
import com.sumsub.sns.core.presentation.form.InterfaceC28164a;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSectionView;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewadapter.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28226w extends AbstractC28211o {
    @Override // com.sumsub.sns.core.presentation.form.viewadapter.AbstractC28211o
    /* JADX INFO: renamed from: a */
    public final void mo69125a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0, int i11) {
        SNSApplicantDataSectionView sNSApplicantDataSectionView = (SNSApplicantDataSectionView) sNSApplicantDataBaseFieldView;
        C29470F c29470fMo69642c = abstractC28841e0.mo69642c();
        Context context = sNSApplicantDataSectionView.getContext();
        String str = c29470fMo69642c.f59468c;
        sNSApplicantDataSectionView.setDescription(str != null ? AbstractC28462i0.m69364a(str, context) : null);
    }

    public C28226w(SNSApplicantDataSectionView sNSApplicantDataSectionView, InterfaceC28164a interfaceC28164a, C28167d c28167d) {
        super(sNSApplicantDataSectionView, interfaceC28164a, c28167d);
    }
}
