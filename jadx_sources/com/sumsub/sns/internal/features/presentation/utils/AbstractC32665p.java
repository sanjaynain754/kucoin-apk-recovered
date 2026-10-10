package com.sumsub.sns.internal.features.presentation.utils;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.VideoRequiredType;
import com.sumsub.sns.internal.features.presentation.main.AbstractC31234Y;
import com.sumsub.sns.internal.features.presentation.main.C31163A;
import com.sumsub.sns.internal.features.presentation.main.C31169C;
import com.sumsub.sns.internal.features.presentation.main.C31175E;
import com.sumsub.sns.internal.features.presentation.main.C31181G;
import com.sumsub.sns.internal.features.presentation.main.C31187I;
import com.sumsub.sns.internal.features.presentation.main.C31193K;
import com.sumsub.sns.internal.features.presentation.main.C31199M;
import com.sumsub.sns.internal.features.presentation.main.C31205O;
import com.sumsub.sns.internal.features.presentation.main.C31211Q;
import com.sumsub.sns.internal.features.presentation.main.C31219T;
import com.sumsub.sns.internal.features.presentation.main.C31327o;
import com.sumsub.sns.internal.features.presentation.main.C31350u;
import com.sumsub.sns.internal.features.presentation.main.C31358w;
import com.sumsub.sns.internal.features.presentation.main.C31366y;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC32665p {
    /* JADX INFO: renamed from: a */
    public static final AbstractC31234Y m71289a(Document document, AbstractC29172p abstractC29172p, boolean z11) {
        String str;
        AbstractC31234Y c31175e;
        String str2;
        if (document.getType().m69747d()) {
            return new C31187I(document);
        }
        C29697t2 c29697t2 = null;
        if (StringsKt.startsWith$default(document.getType().f59014a, "EMAIL_VERIFICATION", false, 2, (Object) null)) {
            return new C31350u(document);
        }
        if (StringsKt.startsWith$default(document.getType().f59014a, "PHONE_VERIFICATION", false, 2, (Object) null)) {
            return new C31358w(document);
        }
        if (StringsKt.startsWith$default(document.getType().f59014a, "QUESTIONNAIRE", false, 2, (Object) null)) {
            C29154m c29154mM69794a = abstractC29172p.m69794a(document.getType());
            if (c29154mM69794a == null || (str2 = c29154mM69794a.f59138g) == null) {
                if (c29154mM69794a != null) {
                    str2 = c29154mM69794a.f59139h;
                } else {
                    str2 = null;
                }
            }
            C31219T c31219t = new C31219T(document, str2);
            C29697t2 c29697t3 = c31219t.f63190a;
            if (c29697t3 != null) {
                c29697t2 = new C29697t2(c29697t3.f59742a, c29697t3.f59743b, c29697t3.f59744c, z11, c29697t3.f59746e, c29697t3.f59747f);
            }
            c31219t.f63190a = c29697t2;
            return c31219t;
        }
        if (document.getType().m69749f()) {
            C29154m c29154mM69794a2 = abstractC29172p.m69794a(document.getType());
            if (c29154mM69794a2 != null && c29154mM69794a2.m69792f()) {
                c31175e = new C31199M(document);
            } else if (c29154mM69794a2 != null && c29154mM69794a2.m69791e()) {
                c31175e = new C31193K(document);
            } else {
                if (c29154mM69794a2 != null) {
                    str = c29154mM69794a2.f59135d;
                } else {
                    str = null;
                }
                if (Intrinsics.areEqual(str, VideoRequiredType.Enabled.getValue())) {
                    c31175e = new C31205O(document);
                } else {
                    c31175e = new C31175E(document);
                }
            }
            C29697t2 c29697t4 = c31175e.f63190a;
            if (c29697t4 != null) {
                c29697t2 = new C29697t2(c29697t4.f59742a, c29697t4.f59743b, c29697t4.f59744c, z11, c29697t4.f59746e, c29697t4.f59747f);
            }
            c31175e.f63190a = c29697t2;
            return c31175e;
        }
        if (document.getType().m69746c()) {
            C31327o c31327o = new C31327o(document);
            C29697t2 c29697t5 = c31327o.f63190a;
            if (c29697t5 != null) {
                c29697t2 = new C29697t2(c29697t5.f59742a, c29697t5.f59743b, c29697t5.f59744c, z11, c29697t5.f59746e, c29697t5.f59747f);
            }
            c31327o.f63190a = c29697t2;
            return c31327o;
        }
        if (document.getType().m69748e()) {
            C29154m c29154mM69794a3 = abstractC29172p.m69794a(document.getType());
            if (c29154mM69794a3 != null && c29154mM69794a3.m69788b()) {
                return new C31169C(document);
            }
            return new C31211Q(document);
        }
        if (StringsKt.startsWith$default(document.getType().f59014a, "E_KYC", false, 2, (Object) null)) {
            return new C31163A(document);
        }
        if (StringsKt.startsWith$default(document.getType().f59014a, "E_SIGN", false, 2, (Object) null)) {
            return new C31366y(document);
        }
        if (StringsKt.startsWith$default(document.getType().f59014a, "PAYMENT_METHODS", false, 2, (Object) null)) {
            return new C31181G(document);
        }
        return new C31193K(document);
    }
}
