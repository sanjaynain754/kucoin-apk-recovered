package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.V0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC32500V0 {
    /* JADX INFO: renamed from: a */
    public static final C32492R0 m71168a(C29983l c29983l, C29124h c29124h, String str, CharSequence charSequence, String str2, boolean z11) {
        String strM70061a;
        String strM69770a;
        String strM69770a2 = c29124h != null ? AbstractC29130i.m69770a("sumsubid.contact.title", c29124h.f59089v) : null;
        String strReplace$default = (c29124h == null || (strM69770a = AbstractC29130i.m69770a("sumsubid.contact.description", c29124h.f59089v)) == null) ? null : StringsKt.replace$default(strM69770a, "{learnMoreLink}", "sumsub://sumsubid-learn-more", false, 4, (Object) null);
        String strM70061a2 = c29983l != null ? c29983l.m70061a("sns_data_field_email") : null;
        if (str2 == null) {
            strM70061a = c29983l != null ? c29983l.m70061a("sns_confirmation_contact_action_send") : null;
        } else {
            strM70061a = str2;
        }
        return new C32492R0(strM69770a2, strReplace$default, strM70061a2, str, charSequence, strM70061a, z11, c29124h != null ? AbstractC29130i.m69770a("sumsubid.contact.actionSkip", c29124h.f59089v) : null, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.f1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC32500V0.m71170b((String) obj);
            }
        }, new C32520f(Control.ContinueButton, C32472H.f66214a), new C32520f(Control.SkipButton, new C32460B(0)), new C32520f(null, C32474I.f66219a));
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC28077Q m71170b(String str) {
        return new C32470G(str);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC28077Q m71171c(String str) {
        return new C32480L(str);
    }

    /* JADX INFO: renamed from: a */
    public static final C32489P0 m71167a(C29124h c29124h, boolean z11) {
        return new C32489P0(c29124h != null ? AbstractC29130i.m69770a("sumsubid.agreement.title", c29124h.f59089v) : null, c29124h != null ? AbstractC29130i.m69770a("sumsubid.agreement.subtitle", c29124h.f59089v) : null, c29124h != null ? AbstractC29130i.m69770a("sumsubid.agreement.actionContinue", c29124h.f59089v) : null, c29124h != null ? AbstractC29130i.m69770a("sumsubid.agreement.actionSkip", c29124h.f59089v) : null, c29124h != null ? AbstractC29130i.m69770a("sumsubid.agreement.benefits.instantly", c29124h.f59089v) : null, c29124h != null ? AbstractC29130i.m69770a("sumsubid.agreement.benefits.securely", c29124h.f59089v) : null, c29124h != null ? AbstractC29130i.m69770a("sumsubid.agreement.benefits.optionally", c29124h.f59089v) : null, c29124h != null ? AbstractC29130i.m69770a("sumsubid.agreement.optionPrivacy", c29124h.f59089v) : null, c29124h != null ? AbstractC29130i.m69770a("sumsubid.agreement.footer", c29124h.f59089v) : null, z11, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.d1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC32500V0.m71165a((String) obj);
            }
        }, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.e1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC32500V0.m71166a(((Boolean) obj).booleanValue());
            }
        }, new C32520f(Control.ContinueButton, C32466E.f66198a), new C32520f(Control.SkipButton, new C32460B()));
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC28077Q m71165a(String str) {
        return new C32480L(str);
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC28077Q m71166a(boolean z11) {
        return new C32464D(z11);
    }

    /* JADX INFO: renamed from: a */
    public static final C32496T0 m71169a(C32511c c32511c) {
        return new C32496T0(c32511c.f66338a, c32511c.f66339b, c32511c.f66340c, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.c1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC32500V0.m71171c((String) obj);
            }
        });
    }
}
