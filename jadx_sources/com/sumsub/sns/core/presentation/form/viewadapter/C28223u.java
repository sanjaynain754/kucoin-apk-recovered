package com.sumsub.sns.core.presentation.form.viewadapter;

import com.sumsub.sns.core.presentation.form.AbstractC28170g;
import com.sumsub.sns.core.presentation.form.C28167d;
import com.sumsub.sns.core.presentation.form.InterfaceC28164a;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMutilselectFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28819M;
import com.sumsub.sns.internal.features.data.model.common.C29724z;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29494N;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewadapter.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28223u extends AbstractC28211o {

    /* JADX INFO: renamed from: d */
    public final InterfaceC28164a f57517d;

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.AbstractC28211o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69125a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0, int i11) {
        m69155a((SNSApplicantDataMutilselectFieldView) sNSApplicantDataBaseFieldView, (C28819M) abstractC28841e0);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69154a(C28223u c28223u, C28819M c28819m, SNSApplicantDataMutilselectFieldView sNSApplicantDataMutilselectFieldView) {
        InterfaceC28164a interfaceC28164a = c28223u.f57517d;
        if (interfaceC28164a != null) {
            interfaceC28164a.mo69091a(c28819m, AbstractC28170g.m69117b(sNSApplicantDataMutilselectFieldView, c28819m));
        }
        return Unit.INSTANCE;
    }

    public C28223u(SNSApplicantDataMutilselectFieldView sNSApplicantDataMutilselectFieldView, InterfaceC28164a interfaceC28164a, C28167d c28167d) {
        super(sNSApplicantDataMutilselectFieldView, interfaceC28164a, c28167d);
        this.f57517d = interfaceC28164a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMutilselectFieldView] */
    /* JADX INFO: renamed from: a */
    public final void m69155a(final SNSApplicantDataMutilselectFieldView sNSApplicantDataMutilselectFieldView, final C28819M c28819m) {
        ?? EmptyList;
        List list = c28819m.f58608d.f59474i;
        if (list != null) {
            EmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                C29494N c29494n = (C29494N) obj;
                String strValueOf = c29494n.f59517a;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(i11);
                }
                String strValueOf2 = c29494n.f59518b;
                if (strValueOf2 == null) {
                    strValueOf2 = String.valueOf(i11);
                }
                EmptyList.add(new C29724z(strValueOf, strValueOf2, c29494n.f59519c));
                i11 = i12;
            }
        } else {
            EmptyList = CollectionsKt.emptyList();
        }
        sNSApplicantDataMutilselectFieldView.setItems(EmptyList);
        sNSApplicantDataMutilselectFieldView.setOnSelectionChanged(new Function0() { // from class: com.sumsub.sns.core.presentation.form.viewadapter.p0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28223u.m69154a(this.f57502b, c28819m, sNSApplicantDataMutilselectFieldView);
            }
        });
        sNSApplicantDataMutilselectFieldView.setGrouped(c28819m.f58615k);
    }
}
