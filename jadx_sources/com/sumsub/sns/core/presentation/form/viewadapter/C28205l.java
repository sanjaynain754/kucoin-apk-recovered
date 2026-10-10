package com.sumsub.sns.core.presentation.form.viewadapter;

import com.sumsub.sns.core.presentation.form.C28167d;
import com.sumsub.sns.core.presentation.form.InterfaceC28164a;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataFileFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28809C;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem$ItemState;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewadapter.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28205l extends AbstractC28211o {

    /* JADX INFO: renamed from: d */
    public final InterfaceC28164a f57485d;

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.AbstractC28211o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69125a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0, int i11) {
        m69145a((SNSApplicantDataFileFieldView) sNSApplicantDataBaseFieldView, (C28809C) abstractC28841e0);
    }

    /* JADX INFO: renamed from: a */
    public final void m69145a(final SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView, final C28809C c28809c) {
        SNSApplicantDataFileFieldView.State state;
        SNSApplicantDataFileFieldView.State state2;
        sNSApplicantDataFileFieldView.setPickFileClickListener(new Function0() { // from class: com.sumsub.sns.core.presentation.form.viewadapter.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28205l.m69142a(this.f57477b, c28809c, sNSApplicantDataFileFieldView);
            }
        });
        sNSApplicantDataFileFieldView.setDeleteFileClickListener(new Function1() { // from class: com.sumsub.sns.core.presentation.form.viewadapter.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28205l.m69143a(this.f57480b, c28809c, (String) obj);
            }
        });
        String str = c28809c.f58581g;
        if (str == null) {
            str = "";
        }
        sNSApplicantDataFileFieldView.setPickFileLabel(str);
        FormItem$ItemState formItem$ItemState = c28809c.f58585k;
        int[] iArr = AbstractC28203k.f57482a;
        int i11 = iArr[formItem$ItemState.ordinal()];
        if (i11 == 1) {
            state = SNSApplicantDataFileFieldView.State.LOADING;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            state = SNSApplicantDataFileFieldView.State.DEFAULT;
        }
        sNSApplicantDataFileFieldView.setState(state);
        int i12 = iArr[c28809c.f58583i.ordinal()];
        if (i12 == 1) {
            state2 = SNSApplicantDataFileFieldView.State.LOADING;
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            state2 = SNSApplicantDataFileFieldView.State.DEFAULT;
        }
        sNSApplicantDataFileFieldView.setItemStates(CollectionsKt.listOf(state2));
    }

    public C28205l(SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView, InterfaceC28164a interfaceC28164a, C28167d c28167d) {
        super(sNSApplicantDataFileFieldView, interfaceC28164a, c28167d);
        this.f57485d = interfaceC28164a;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69142a(C28205l c28205l, C28809C c28809c, SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView) {
        InterfaceC28164a interfaceC28164a = c28205l.f57485d;
        if (interfaceC28164a != null) {
            interfaceC28164a.mo69097a(c28809c, sNSApplicantDataFileFieldView.getPickFileAnchor$idensic_mobile_sdk_aar_defaultRelease());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69143a(C28205l c28205l, C28809C c28809c, String str) {
        InterfaceC28164a interfaceC28164a = c28205l.f57485d;
        if (interfaceC28164a != null) {
            interfaceC28164a.mo69090a(c28809c, str);
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.AbstractC28211o
    /* JADX INFO: renamed from: a */
    public final void mo69144a() {
        ((SNSApplicantDataFileFieldView) this.f57499c).cleanup();
    }
}
