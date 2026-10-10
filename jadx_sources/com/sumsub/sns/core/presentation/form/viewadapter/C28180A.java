package com.sumsub.sns.core.presentation.form.viewadapter;

import android.text.Editable;
import android.widget.EditText;
import com.sumsub.sns.core.presentation.form.AbstractC28170g;
import com.sumsub.sns.core.presentation.form.C28167d;
import com.sumsub.sns.core.presentation.form.InterfaceC28164a;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataTextAreaFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28835b0;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewadapter.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28180A extends AbstractC28211o {

    /* JADX INFO: renamed from: d */
    public final InterfaceC28164a f57444d;

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.AbstractC28211o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69125a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0, int i11) {
        m69126a((SNSApplicantDataTextAreaFieldView) sNSApplicantDataBaseFieldView, (C28835b0) abstractC28841e0);
    }

    /* JADX INFO: renamed from: a */
    public final void m69126a(final SNSApplicantDataTextAreaFieldView sNSApplicantDataTextAreaFieldView, final C28835b0 c28835b0) {
        sNSApplicantDataTextAreaFieldView.setTextChangedCallback(new Function1() { // from class: com.sumsub.sns.core.presentation.form.viewadapter.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28180A.m69124a(sNSApplicantDataTextAreaFieldView, this, c28835b0, (String) obj);
            }
        });
    }

    public C28180A(SNSApplicantDataTextAreaFieldView sNSApplicantDataTextAreaFieldView, InterfaceC28164a interfaceC28164a, C28167d c28167d) {
        super(sNSApplicantDataTextAreaFieldView, interfaceC28164a, c28167d);
        this.f57444d = interfaceC28164a;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69124a(SNSApplicantDataTextAreaFieldView sNSApplicantDataTextAreaFieldView, C28180A c28180a, C28835b0 c28835b0, String str) {
        InterfaceC28164a interfaceC28164a;
        EditText editText = sNSApplicantDataTextAreaFieldView.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        if (text != null && text.length() != 0 && (interfaceC28164a = c28180a.f57444d) != null) {
            interfaceC28164a.mo69093b(c28835b0);
        }
        InterfaceC28164a interfaceC28164a2 = c28180a.f57444d;
        if (interfaceC28164a2 != null) {
            interfaceC28164a2.mo69095c(c28835b0, AbstractC28170g.m69116a(sNSApplicantDataTextAreaFieldView, c28835b0));
        }
        return Unit.INSTANCE;
    }
}
