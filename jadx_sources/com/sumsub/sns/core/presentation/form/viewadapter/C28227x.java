package com.sumsub.sns.core.presentation.form.viewadapter;

import com.sumsub.sns.core.presentation.form.AbstractC28170g;
import com.sumsub.sns.core.presentation.form.C28167d;
import com.sumsub.sns.core.presentation.form.InterfaceC28164a;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28827V;
import com.sumsub.sns.internal.features.data.model.common.C29724z;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29494N;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewadapter.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28227x extends AbstractC28211o {

    /* JADX INFO: renamed from: d */
    public final InterfaceC28164a f57524d;

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.AbstractC28211o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69125a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0, int i11) {
        m69161a((SNSApplicantDataSelectionFieldView) sNSApplicantDataBaseFieldView, (C28827V) abstractC28841e0);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69160a(C28227x c28227x, C28827V c28827v, SNSApplicantDataSelectionFieldView sNSApplicantDataSelectionFieldView, C29724z c29724z) {
        InterfaceC28164a interfaceC28164a = c28227x.f57524d;
        if (interfaceC28164a != null) {
            interfaceC28164a.mo69095c(c28827v, AbstractC28170g.m69116a(sNSApplicantDataSelectionFieldView, c28827v));
        }
        return Unit.INSTANCE;
    }

    public C28227x(SNSApplicantDataSelectionFieldView sNSApplicantDataSelectionFieldView, InterfaceC28164a interfaceC28164a, C28167d c28167d) {
        super(sNSApplicantDataSelectionFieldView, interfaceC28164a, c28167d);
        this.f57524d = interfaceC28164a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionFieldView] */
    /* JADX INFO: renamed from: a */
    public final void m69161a(final SNSApplicantDataSelectionFieldView sNSApplicantDataSelectionFieldView, final C28827V c28827v) {
        ?? EmptyList;
        List list = c28827v.f58631d.f59474i;
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
        sNSApplicantDataSelectionFieldView.setItems(EmptyList);
        sNSApplicantDataSelectionFieldView.setOnSelectedCallback(new Function1() { // from class: com.sumsub.sns.core.presentation.form.viewadapter.t0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C28227x.m69160a(this.f57514b, c28827v, sNSApplicantDataSelectionFieldView, (C29724z) obj2);
            }
        });
    }
}
