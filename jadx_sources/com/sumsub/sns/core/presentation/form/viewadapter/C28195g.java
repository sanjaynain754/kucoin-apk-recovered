package com.sumsub.sns.core.presentation.form.viewadapter;

import com.sumsub.sns.core.presentation.form.AbstractC28170g;
import com.sumsub.sns.core.presentation.form.C28167d;
import com.sumsub.sns.core.presentation.form.InterfaceC28164a;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionCountryFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28859q;
import com.sumsub.sns.internal.features.presentation.country.C30877b;
import java.util.ArrayList;
import java.util.Map;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewadapter.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28195g extends AbstractC28211o {

    /* JADX INFO: renamed from: d */
    public final InterfaceC28164a f57469d;

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.AbstractC28211o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69125a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0, int i11) {
        m69139a((SNSApplicantDataSelectionCountryFieldView) sNSApplicantDataBaseFieldView, (C28859q) abstractC28841e0);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69138a(C28195g c28195g, C28859q c28859q, SNSApplicantDataSelectionCountryFieldView sNSApplicantDataSelectionCountryFieldView, C30877b c30877b) {
        InterfaceC28164a interfaceC28164a = c28195g.f57469d;
        if (interfaceC28164a != null) {
            interfaceC28164a.mo69095c(c28859q, AbstractC28170g.m69116a(sNSApplicantDataSelectionCountryFieldView, c28859q));
        }
        return Unit.INSTANCE;
    }

    public C28195g(SNSApplicantDataSelectionCountryFieldView sNSApplicantDataSelectionCountryFieldView, InterfaceC28164a interfaceC28164a, C28167d c28167d) {
        super(sNSApplicantDataSelectionCountryFieldView, interfaceC28164a, c28167d);
        this.f57469d = interfaceC28164a;
    }

    /* JADX INFO: renamed from: a */
    public final void m69139a(final SNSApplicantDataSelectionCountryFieldView sNSApplicantDataSelectionCountryFieldView, final C28859q c28859q) {
        Map map = c28859q.f58691f;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new C30877b((String) entry.getKey(), (String) entry.getValue()));
        }
        sNSApplicantDataSelectionCountryFieldView.setItems(arrayList);
        sNSApplicantDataSelectionCountryFieldView.setOnCountrySelectedCallback(new Function1() { // from class: com.sumsub.sns.core.presentation.form.viewadapter.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28195g.m69138a(this.f57470b, c28859q, sNSApplicantDataSelectionCountryFieldView, (C30877b) obj);
            }
        });
    }
}
