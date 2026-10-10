package com.sumsub.sns.core.presentation.form.viewadapter;

import com.sumsub.sns.core.presentation.form.AbstractC28170g;
import com.sumsub.sns.core.presentation.form.C28167d;
import com.sumsub.sns.core.presentation.form.InterfaceC28164a;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataDateTimeFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28863u;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewadapter.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28197h extends AbstractC28211o {

    /* JADX INFO: renamed from: d */
    public final InterfaceC28164a f57473d;

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.AbstractC28211o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69125a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0, int i11) {
        m69141a((SNSApplicantDataDateTimeFieldView) sNSApplicantDataBaseFieldView, (C28863u) abstractC28841e0);
    }

    /* JADX INFO: renamed from: a */
    public final void m69141a(final SNSApplicantDataDateTimeFieldView sNSApplicantDataDateTimeFieldView, final C28863u c28863u) {
        sNSApplicantDataDateTimeFieldView.setTextChangedCallback(new Function1() { // from class: com.sumsub.sns.core.presentation.form.viewadapter.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28197h.m69140a(this.f57474b, c28863u, sNSApplicantDataDateTimeFieldView, (String) obj);
            }
        });
    }

    public C28197h(SNSApplicantDataDateTimeFieldView sNSApplicantDataDateTimeFieldView, InterfaceC28164a interfaceC28164a, C28167d c28167d) {
        super(sNSApplicantDataDateTimeFieldView, interfaceC28164a, c28167d);
        this.f57473d = interfaceC28164a;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69140a(C28197h c28197h, C28863u c28863u, SNSApplicantDataDateTimeFieldView sNSApplicantDataDateTimeFieldView, String str) {
        InterfaceC28164a interfaceC28164a = c28197h.f57473d;
        if (interfaceC28164a != null) {
            interfaceC28164a.mo69095c(c28863u, AbstractC28170g.m69116a(sNSApplicantDataDateTimeFieldView, c28863u));
        }
        return Unit.INSTANCE;
    }
}
