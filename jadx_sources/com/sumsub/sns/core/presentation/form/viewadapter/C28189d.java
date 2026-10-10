package com.sumsub.sns.core.presentation.form.viewadapter;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.sumsub.sns.core.presentation.form.AbstractC28170g;
import com.sumsub.sns.core.presentation.form.C28167d;
import com.sumsub.sns.core.presentation.form.InterfaceC28164a;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataCalendarFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28861s;
import java.util.Calendar;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewadapter.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28189d extends AbstractC28211o {

    /* JADX INFO: renamed from: d */
    public final InterfaceC28164a f57456d;

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.AbstractC28211o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69125a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0, int i11) {
        m69135a((SNSApplicantDataCalendarFieldView) sNSApplicantDataBaseFieldView, (C28861s) abstractC28841e0);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69134a(C28189d c28189d, C28861s c28861s, SNSApplicantDataCalendarFieldView sNSApplicantDataCalendarFieldView, String str) {
        InterfaceC28164a interfaceC28164a = c28189d.f57456d;
        if (interfaceC28164a != null) {
            interfaceC28164a.mo69095c(c28861s, AbstractC28170g.m69116a(sNSApplicantDataCalendarFieldView, c28861s));
        }
        return Unit.INSTANCE;
    }

    public C28189d(SNSApplicantDataCalendarFieldView sNSApplicantDataCalendarFieldView, InterfaceC28164a interfaceC28164a, C28167d c28167d) {
        super(sNSApplicantDataCalendarFieldView, interfaceC28164a, c28167d);
        this.f57456d = interfaceC28164a;
    }

    /* JADX INFO: renamed from: a */
    public final void m69135a(final SNSApplicantDataCalendarFieldView sNSApplicantDataCalendarFieldView, final C28861s c28861s) {
        if (c28861s.f58698f) {
            sNSApplicantDataCalendarFieldView.setConstraints(new CalendarConstraints.Builder().setValidator(DateValidatorPointBackward.before(Calendar.getInstance().getTime().getTime())).build());
        }
        sNSApplicantDataCalendarFieldView.setTextChangedCallback(new Function1() { // from class: com.sumsub.sns.core.presentation.form.viewadapter.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28189d.m69134a(this.f57462b, c28861s, sNSApplicantDataCalendarFieldView, (String) obj);
            }
        });
    }
}
