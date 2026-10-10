package com.sumsub.sns.core.presentation.form.viewadapter;

import com.sumsub.sns.core.presentation.form.AbstractC28170g;
import com.sumsub.sns.core.presentation.form.C28167d;
import com.sumsub.sns.core.presentation.form.InterfaceC28164a;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBoolFieldView;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28854l;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewadapter.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28187c extends AbstractC28211o {

    /* JADX INFO: renamed from: d */
    public final InterfaceC28164a f57453d;

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.AbstractC28211o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69125a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0, int i11) {
        m69133a((SNSApplicantDataBoolFieldView) sNSApplicantDataBaseFieldView, (C28854l) abstractC28841e0);
    }

    /* JADX INFO: renamed from: a */
    public final void m69133a(final SNSApplicantDataBoolFieldView sNSApplicantDataBoolFieldView, final C28854l c28854l) {
        sNSApplicantDataBoolFieldView.setOnCheckedChanged(new Function1() { // from class: com.sumsub.sns.core.presentation.form.viewadapter.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28187c.m69132a(this.f57457b, c28854l, sNSApplicantDataBoolFieldView, ((Boolean) obj).booleanValue());
            }
        });
        String str = c28854l.f58679d.f59472g;
        sNSApplicantDataBoolFieldView.setText(str != null ? AbstractC28462i0.m69364a(str, this.itemView.getContext()) : null);
    }

    public C28187c(SNSApplicantDataBoolFieldView sNSApplicantDataBoolFieldView, InterfaceC28164a interfaceC28164a, C28167d c28167d) {
        super(sNSApplicantDataBoolFieldView, interfaceC28164a, c28167d);
        this.f57453d = interfaceC28164a;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69132a(C28187c c28187c, C28854l c28854l, SNSApplicantDataBoolFieldView sNSApplicantDataBoolFieldView, boolean z11) {
        InterfaceC28164a interfaceC28164a = c28187c.f57453d;
        if (interfaceC28164a != null) {
            interfaceC28164a.mo69095c(c28854l, AbstractC28170g.m69116a(sNSApplicantDataBoolFieldView, c28854l));
        }
        return Unit.INSTANCE;
    }
}
