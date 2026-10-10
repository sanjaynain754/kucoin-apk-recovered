package com.sumsub.sns.core.presentation.form.viewadapter;

import com.sumsub.sns.core.presentation.form.AbstractC28170g;
import com.sumsub.sns.core.presentation.form.C28167d;
import com.sumsub.sns.core.presentation.form.InterfaceC28164a;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMultipleCountrySelectionFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28857o;
import com.sumsub.sns.internal.features.presentation.country.C30877b;
import java.util.ArrayList;
import java.util.Map;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewadapter.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28193f extends AbstractC28211o {

    /* JADX INFO: renamed from: d */
    public final InterfaceC28164a f57465d;

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.AbstractC28211o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69125a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0, int i11) {
        m69137a((SNSApplicantDataMultipleCountrySelectionFieldView) sNSApplicantDataBaseFieldView, (C28857o) abstractC28841e0);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69136a(C28193f c28193f, C28857o c28857o, SNSApplicantDataMultipleCountrySelectionFieldView sNSApplicantDataMultipleCountrySelectionFieldView) {
        InterfaceC28164a interfaceC28164a = c28193f.f57465d;
        if (interfaceC28164a != null) {
            interfaceC28164a.mo69091a(c28857o, AbstractC28170g.m69117b(sNSApplicantDataMultipleCountrySelectionFieldView, c28857o));
        }
        return Unit.INSTANCE;
    }

    public C28193f(SNSApplicantDataMultipleCountrySelectionFieldView sNSApplicantDataMultipleCountrySelectionFieldView, InterfaceC28164a interfaceC28164a, C28167d c28167d) {
        super(sNSApplicantDataMultipleCountrySelectionFieldView, interfaceC28164a, c28167d);
        this.f57465d = interfaceC28164a;
    }

    /* JADX INFO: renamed from: a */
    public final void m69137a(final SNSApplicantDataMultipleCountrySelectionFieldView sNSApplicantDataMultipleCountrySelectionFieldView, final C28857o c28857o) {
        Map map = c28857o.f58685f;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new C30877b((String) entry.getKey(), (String) entry.getValue()));
        }
        sNSApplicantDataMultipleCountrySelectionFieldView.setItems(arrayList);
        sNSApplicantDataMultipleCountrySelectionFieldView.setOnCountrySelectionChanged(new Function0() { // from class: com.sumsub.sns.core.presentation.form.viewadapter.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28193f.m69136a(this.f57466b, c28857o, sNSApplicantDataMultipleCountrySelectionFieldView);
            }
        });
    }
}
