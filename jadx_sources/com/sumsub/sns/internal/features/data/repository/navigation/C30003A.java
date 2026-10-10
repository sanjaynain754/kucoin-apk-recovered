package com.sumsub.sns.internal.features.data.repository.navigation;

import com.sumsub.sns.internal.features.domain.navigation.model.C30272A;
import com.sumsub.sns.internal.features.domain.navigation.model.C30273B;
import com.sumsub.sns.internal.features.domain.navigation.model.C30274C;
import com.sumsub.sns.internal.features.domain.navigation.model.C30276a;
import com.sumsub.sns.internal.features.domain.navigation.model.C30277b;
import com.sumsub.sns.internal.features.domain.navigation.model.C30278c;
import com.sumsub.sns.internal.features.domain.navigation.model.C30279d;
import com.sumsub.sns.internal.features.domain.navigation.model.C30280e;
import com.sumsub.sns.internal.features.domain.navigation.model.C30281f;
import com.sumsub.sns.internal.features.domain.navigation.model.C30282g;
import com.sumsub.sns.internal.features.domain.navigation.model.C30283h;
import com.sumsub.sns.internal.features.domain.navigation.model.C30284i;
import com.sumsub.sns.internal.features.domain.navigation.model.C30285j;
import com.sumsub.sns.internal.features.domain.navigation.model.C30286k;
import com.sumsub.sns.internal.features.domain.navigation.model.C30287l;
import com.sumsub.sns.internal.features.domain.navigation.model.C30288m;
import com.sumsub.sns.internal.features.domain.navigation.model.C30289n;
import com.sumsub.sns.internal.features.domain.navigation.model.C30291p;
import com.sumsub.sns.internal.features.domain.navigation.model.C30292q;
import com.sumsub.sns.internal.features.domain.navigation.model.C30293r;
import com.sumsub.sns.internal.features.domain.navigation.model.C30294s;
import com.sumsub.sns.internal.features.domain.navigation.model.C30295t;
import com.sumsub.sns.internal.features.domain.navigation.model.C30296u;
import com.sumsub.sns.internal.features.domain.navigation.model.C30297v;
import com.sumsub.sns.internal.features.domain.navigation.model.C30298w;
import com.sumsub.sns.internal.features.domain.navigation.model.C30299x;
import com.sumsub.sns.internal.features.domain.navigation.model.C30300y;
import com.sumsub.sns.internal.features.domain.navigation.model.InterfaceC30301z;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.navigation.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30003A {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:87:0x0167  */
    /* JADX INFO: renamed from: a */
    public static C30274C m70065a(C30031z c30031z) {
        InterfaceC30301z c30295t;
        InterfaceC30301z c30287l;
        C30011f c30011f = c30031z.f60321a;
        Boolean bool = c30011f.f60291b;
        Boolean bool2 = Boolean.TRUE;
        C30277b c30277b = new C30277b(Intrinsics.areEqual(c30011f.f60290a, bool2), Intrinsics.areEqual(bool, bool2), Intrinsics.areEqual(c30011f.f60292c, bool2));
        C30020o c30020o = c30031z.f60323c;
        switch (c30020o.f60304a) {
            case "videoIdent":
                c30295t = C30298w.f60897a;
                break;
            case "reusableKyc2fa":
                c30295t = C30293r.f60892a;
                break;
            case "restrictedAccess":
                c30295t = C30291p.f60890a;
                break;
            case "welcomeWithAgreement":
                c30295t = C30300y.f60899a;
                break;
            case "idDocSet":
                String str = c30020o.f60305b;
                if (str != null) {
                    C30019n c30019n = c30020o.f60307d;
                    String str2 = c30019n != null ? c30019n.f60302b : null;
                    String str3 = c30019n != null ? c30019n.f60301a : null;
                    String str4 = c30019n != null ? c30019n.f60303c : null;
                    if (StringsKt.startsWith$default(str, "APPLICANT_DATA", false, 2, (Object) null)) {
                        c30287l = new C30280e(str);
                    } else if (StringsKt.startsWith$default(str, "EMAIL_VERIFICATION", false, 2, (Object) null)) {
                        c30287l = new C30283h(str);
                    } else if (StringsKt.startsWith$default(str, "PHONE_VERIFICATION", false, 2, (Object) null)) {
                        c30287l = new C30285j(str);
                    } else if (StringsKt.startsWith$default(str, "IDENTITY", false, 2, (Object) null)) {
                        c30287l = new C30284i(str);
                    } else if (StringsKt.startsWith$default(str, "SELFIE", false, 2, (Object) null)) {
                        c30287l = new C30288m(str, str3);
                    } else if (StringsKt.startsWith$default(str, "PROOF_OF_RESIDENCE", false, 2, (Object) null)) {
                        c30295t = new C30286k(str, str4);
                        break;
                    } else if (StringsKt.startsWith$default(str, "E_KYC", false, 2, (Object) null)) {
                        c30287l = new C30282g(str);
                    } else if (StringsKt.startsWith$default(str, "E_SIGN", false, 2, (Object) null)) {
                        c30287l = new C30281f(str);
                    } else {
                        c30287l = StringsKt.startsWith$default(str, "QUESTIONNAIRE", false, 2, (Object) null) ? new C30287l(str, str2) : new C30289n(str);
                    }
                    c30295t = c30287l;
                } else {
                    c30295t = new C30295t("idDocSet:null");
                }
                break;
            case "verificationInProgress":
                c30295t = C30297v.f60896a;
                break;
            case "resubmissionOverview":
                c30295t = C30292q.f60891a;
                break;
            case "agreement":
                c30295t = C30279d.f60876a;
                break;
            case "welcome":
                c30295t = C30299x.f60898a;
                break;
            case "verificationCompleted":
                c30295t = C30296u.f60895a;
                break;
            case "reusableKycAgreement":
                c30295t = C30294s.f60893a;
                break;
            default:
                c30295t = new C30295t(c30020o.f60304a);
                break;
        }
        C30278c c30278c = new C30278c(c30295t, new C30273B(c30020o.f60306c));
        String str5 = c30031z.f60324d;
        C30014i c30014i = c30031z.f60322b;
        C30272A c30272a = c30014i != null ? new C30272A(c30014i.f60295a, c30014i.f60296b, c30014i.f60298d) : null;
        C30008c c30008c = c30031z.f60325e;
        return new C30274C(c30277b, c30278c, str5, c30272a, c30008c != null ? new C30276a(c30008c.f60288a) : null);
    }
}
