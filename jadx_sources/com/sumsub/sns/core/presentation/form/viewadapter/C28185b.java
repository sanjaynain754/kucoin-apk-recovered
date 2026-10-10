package com.sumsub.sns.core.presentation.form.viewadapter;

import android.view.View;
import com.sumsub.sns.core.presentation.form.C28167d;
import com.sumsub.sns.core.presentation.form.InterfaceC28164a;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataActionView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28846h;
import p852kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewadapter.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28185b extends AbstractC28211o {

    /* JADX INFO: renamed from: d */
    public final InterfaceC28164a f57450d;

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.AbstractC28211o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69125a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0, int i11) {
        m69131a((SNSApplicantDataActionView) sNSApplicantDataBaseFieldView, (C28846h) abstractC28841e0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m69130a(C28185b c28185b, C28846h c28846h, View view) {
        InterfaceC28164a interfaceC28164a = c28185b.f57450d;
        if (interfaceC28164a != null) {
            interfaceC28164a.mo69092a(c28846h.f58673g);
        }
    }

    public C28185b(SNSApplicantDataActionView sNSApplicantDataActionView, InterfaceC28164a interfaceC28164a, C28167d c28167d) {
        super(sNSApplicantDataActionView, interfaceC28164a, c28167d);
        this.f57450d = interfaceC28164a;
    }

    /* JADX INFO: renamed from: a */
    public final void m69131a(SNSApplicantDataActionView sNSApplicantDataActionView, final C28846h c28846h) {
        SNSApplicantDataActionView.Color color;
        sNSApplicantDataActionView.setText(c28846h.f58671e);
        sNSApplicantDataActionView.setIcon(c28846h.f58672f);
        int i11 = AbstractC28183a.f57446a[c28846h.f58674h.ordinal()];
        if (i11 == 1) {
            color = SNSApplicantDataActionView.Color.NEUTRAL;
        } else if (i11 == 2) {
            color = SNSApplicantDataActionView.Color.CRITICAL;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        sNSApplicantDataActionView.setTintColor(color);
        sNSApplicantDataActionView.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.core.presentation.form.viewadapter.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C28185b.m69130a(this.f57454b, c28846h, view);
            }
        });
    }
}
