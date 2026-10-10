package com.sumsub.sns.core.presentation.form.viewadapter;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.form.AbstractC28170g;
import com.sumsub.sns.core.presentation.form.C28167d;
import com.sumsub.sns.core.presentation.form.InterfaceC28164a;
import com.sumsub.sns.core.presentation.form.model.AbstractC28178b;
import com.sumsub.sns.core.presentation.form.viewutils.AbstractC28232c;
import com.sumsub.sns.core.widget.PhoneKit;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataPhoneFieldView;
import com.sumsub.sns.core.widget.autocompletePhone.PhoneKitProviderKt;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28811E;
import com.sumsub.sns.internal.core.presentation.form.model.C28821O;
import com.sumsub.sns.internal.features.data.model.common.remote.C29389j0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29405l0;
import com.sumsub.sns.internal.features.presentation.country.C30877b;
import com.sumsub.sns.internal.log.C33272c;
import java.util.ArrayList;
import java.util.Map;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewadapter.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28225v extends AbstractC28211o {

    /* JADX INFO: renamed from: d */
    public final InterfaceC28164a f57521d;

    /* JADX INFO: renamed from: e */
    public C28811E f57522e;

    /* JADX INFO: renamed from: f */
    public C28811E f57523f;

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.AbstractC28211o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69125a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0, int i11) {
        m69159a((SNSApplicantDataPhoneFieldView) sNSApplicantDataBaseFieldView, (C28821O) abstractC28841e0);
    }

    /* JADX INFO: renamed from: a */
    public final void m69159a(final SNSApplicantDataPhoneFieldView sNSApplicantDataPhoneFieldView, final C28821O c28821o) {
        this.f57522e = AbstractC28178b.m69119a(c28821o);
        this.f57523f = AbstractC28178b.m69123b(c28821o);
        Map map = c28821o.f58618f;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new C30877b((String) entry.getKey(), (String) entry.getValue()));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sNSApplicantDataPhoneFieldView.clear();
        final PhoneKit phoneKit$default = PhoneKitProviderKt.getPhoneKit$default(sNSApplicantDataPhoneFieldView.getPhoneInputLayout(), c28821o.f58618f, c28821o.f58619g, null, null, 24, null);
        sNSApplicantDataPhoneFieldView.setPhoneNumberPurifier(new Function1() { // from class: com.sumsub.sns.core.presentation.form.viewadapter.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28225v.m69156a(phoneKit$default, (String) obj);
            }
        });
        if (!c28821o.f58621i) {
            sNSApplicantDataPhoneFieldView.setPhoneNumberValidator(new Function0() { // from class: com.sumsub.sns.core.presentation.form.viewadapter.r0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(C28225v.m69158a(phoneKit$default));
                }
            });
        }
        sNSApplicantDataPhoneFieldView.setTextChangedCallback(new Function1() { // from class: com.sumsub.sns.core.presentation.form.viewadapter.s0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28225v.m69157a(phoneKit$default, this, c28821o, sNSApplicantDataPhoneFieldView, (String) obj);
            }
        });
    }

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.AbstractC28211o
    /* JADX INFO: renamed from: b */
    public final void mo69129b(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0) {
        String strM69165a;
        SNSApplicantDataPhoneFieldView sNSApplicantDataPhoneFieldView = (SNSApplicantDataPhoneFieldView) sNSApplicantDataBaseFieldView;
        C28821O c28821o = (C28821O) abstractC28841e0;
        if (!c28821o.f58618f.isEmpty() && this.f57498b.m69098a(c28821o) == null && StringsKt.isBlank(sNSApplicantDataPhoneFieldView.getValue()) && (strM69165a = AbstractC28232c.m69165a(c28821o)) != null) {
            sNSApplicantDataPhoneFieldView.updateValueSilently(strM69165a);
        }
    }

    public C28225v(SNSApplicantDataPhoneFieldView sNSApplicantDataPhoneFieldView, InterfaceC28164a interfaceC28164a, C28167d c28167d) {
        super(sNSApplicantDataPhoneFieldView, interfaceC28164a, c28167d);
        this.f57521d = interfaceC28164a;
    }

    /* JADX INFO: renamed from: a */
    public static final String m69156a(PhoneKit phoneKit, String str) {
        C29405l0 mask = phoneKit.getMask();
        if (mask != null) {
            C29389j0 c29389j0 = C29405l0.Companion;
            String str2 = mask.f59409a;
            c29389j0.getClass();
            String strM69854a = C29389j0.m69854a(str2, str);
            return strM69854a == null ? "" : strM69854a;
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m69158a(PhoneKit phoneKit) {
        return phoneKit.isValid();
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69157a(PhoneKit phoneKit, C28225v c28225v, C28821O c28821o, SNSApplicantDataPhoneFieldView sNSApplicantDataPhoneFieldView, String str) {
        InterfaceC28164a interfaceC28164a;
        InterfaceC28164a interfaceC28164a2;
        Logger.DefaultImpls.v$default(C33272c.f67812a, "SNSApplicantDataPhoneFieldView", "textChangedCallback: " + str, null, 4, null);
        C30877b country = phoneKit.getCountry();
        if (country != null && (interfaceC28164a2 = c28225v.f57521d) != null) {
            C28811E c28811e = c28225v.f57522e;
            if (c28811e == null) {
                c28811e = null;
            }
            interfaceC28164a2.mo69095c(c28811e, country.f62373a);
        }
        C29405l0 mask = phoneKit.getMask();
        if (mask != null && (interfaceC28164a = c28225v.f57521d) != null) {
            C28811E c28811e2 = c28225v.f57523f;
            interfaceC28164a.mo69095c(c28811e2 != null ? c28811e2 : null, mask.f59409a);
        }
        InterfaceC28164a interfaceC28164a3 = c28225v.f57521d;
        if (interfaceC28164a3 != null) {
            interfaceC28164a3.mo69095c(c28821o, AbstractC28170g.m69116a(sNSApplicantDataPhoneFieldView, c28821o));
        }
        return Unit.INSTANCE;
    }
}
