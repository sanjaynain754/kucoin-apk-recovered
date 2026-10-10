package com.sumsub.sns.core.presentation.form.viewadapter;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sumsub.sns.core.presentation.form.AbstractC28170g;
import com.sumsub.sns.core.presentation.form.C28167d;
import com.sumsub.sns.core.presentation.form.InterfaceC28164a;
import com.sumsub.sns.core.widget.SNSApplicantDataFieldView;
import com.sumsub.sns.core.widget.SNSTextInputEditText;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28831Z;
import java.util.List;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewadapter.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28181B extends AbstractC28211o {

    /* JADX INFO: renamed from: d */
    public final InterfaceC28164a f57445d;

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.AbstractC28211o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69125a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0, int i11) {
        m69128a(sNSApplicantDataBaseFieldView, (C28831Z) abstractC28841e0);
    }

    /* JADX INFO: renamed from: a */
    public final void m69128a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, final C28831Z c28831z) {
        sNSApplicantDataBaseFieldView.setTextChangedCallback(new Function1() { // from class: com.sumsub.sns.core.presentation.form.viewadapter.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28181B.m69127a(this.f57451b, c28831z, (String) obj);
            }
        });
        TextInputLayout inputLayout = sNSApplicantDataBaseFieldView.getInputLayout();
        if (inputLayout != null) {
            inputLayout.setVisibility(c28831z.f58645j ? 8 : 0);
        }
    }

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.AbstractC28211o
    /* JADX INFO: renamed from: b */
    public final void mo69129b(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0) {
        C28831Z c28831z = (C28831Z) abstractC28841e0;
        List<String> list = c28831z.f58644i;
        if (list == null || list.isEmpty()) {
            super.mo69129b(sNSApplicantDataBaseFieldView, c28831z);
            return;
        }
        EditText editText = sNSApplicantDataBaseFieldView.getEditText();
        SNSTextInputEditText sNSTextInputEditText = editText instanceof SNSTextInputEditText ? (SNSTextInputEditText) editText : null;
        if (sNSTextInputEditText != null) {
            sNSTextInputEditText.setMasksString(list);
        }
    }

    public C28181B(SNSApplicantDataFieldView sNSApplicantDataFieldView, InterfaceC28164a interfaceC28164a, C28167d c28167d) {
        super(sNSApplicantDataFieldView, interfaceC28164a, c28167d);
        this.f57445d = interfaceC28164a;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69127a(C28181B c28181b, C28831Z c28831z, String str) {
        InterfaceC28164a interfaceC28164a;
        InterfaceC28164a interfaceC28164a2 = c28181b.f57445d;
        if (interfaceC28164a2 != null) {
            interfaceC28164a2.mo69095c(c28831z, AbstractC28170g.m69116a(c28181b.f57499c, c28831z));
        }
        if (str != null && str.length() != 0 && (interfaceC28164a = c28181b.f57445d) != null) {
            interfaceC28164a.mo69093b(c28831z);
        }
        return Unit.INSTANCE;
    }
}
