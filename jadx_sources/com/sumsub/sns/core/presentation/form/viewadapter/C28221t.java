package com.sumsub.sns.core.presentation.form.viewadapter;

import com.sumsub.sns.core.presentation.form.C28167d;
import com.sumsub.sns.core.presentation.form.InterfaceC28164a;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataFileFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28817K;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem$ItemState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewadapter.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28221t extends AbstractC28211o {

    /* JADX INFO: renamed from: d */
    public final InterfaceC28164a f57513d;

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.AbstractC28211o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69125a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0, int i11) {
        m69153a((SNSApplicantDataFileFieldView) sNSApplicantDataBaseFieldView, (C28817K) abstractC28841e0);
    }

    /* JADX INFO: renamed from: a */
    public final void m69153a(final SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView, final C28817K c28817k) {
        SNSApplicantDataFileFieldView.State state;
        sNSApplicantDataFileFieldView.setPickFileClickListener(new Function0() { // from class: com.sumsub.sns.core.presentation.form.viewadapter.n0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28221t.m69151a(this.f57494b, c28817k, sNSApplicantDataFileFieldView);
            }
        });
        sNSApplicantDataFileFieldView.setDeleteFileClickListener(new Function1() { // from class: com.sumsub.sns.core.presentation.form.viewadapter.o0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28221t.m69152a(this.f57500b, c28817k, (String) obj);
            }
        });
        CharSequence charSequence = c28817k.f58599g;
        if (charSequence == null) {
            charSequence = "";
        }
        sNSApplicantDataFileFieldView.setPickFileLabel(charSequence);
        sNSApplicantDataFileFieldView.setState(AbstractC28219s.f57508a[c28817k.f58604l.ordinal()] == 1 ? SNSApplicantDataFileFieldView.State.LOADING : SNSApplicantDataFileFieldView.State.DEFAULT);
        List list = c28817k.f58602j;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i11 = AbstractC28219s.f57508a[((FormItem$ItemState) it.next()).ordinal()];
            if (i11 == 1) {
                state = SNSApplicantDataFileFieldView.State.LOADING;
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                state = SNSApplicantDataFileFieldView.State.DEFAULT;
            }
            arrayList.add(state);
        }
        sNSApplicantDataFileFieldView.setItemStates(arrayList);
    }

    public C28221t(SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView, InterfaceC28164a interfaceC28164a, C28167d c28167d) {
        super(sNSApplicantDataFileFieldView, interfaceC28164a, c28167d);
        this.f57513d = interfaceC28164a;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69151a(C28221t c28221t, C28817K c28817k, SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView) {
        InterfaceC28164a interfaceC28164a = c28221t.f57513d;
        if (interfaceC28164a != null) {
            interfaceC28164a.mo69097a(c28817k, sNSApplicantDataFileFieldView.getPickFileAnchor$idensic_mobile_sdk_aar_defaultRelease());
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.AbstractC28211o
    /* JADX INFO: renamed from: a */
    public final void mo69144a() {
        ((SNSApplicantDataFileFieldView) this.f57499c).cleanup();
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69152a(C28221t c28221t, C28817K c28817k, String str) {
        InterfaceC28164a interfaceC28164a = c28221t.f57513d;
        if (interfaceC28164a != null) {
            interfaceC28164a.mo69090a(c28817k, str);
        }
        return Unit.INSTANCE;
    }
}
