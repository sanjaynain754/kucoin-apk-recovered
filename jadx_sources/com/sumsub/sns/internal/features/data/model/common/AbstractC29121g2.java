package com.sumsub.sns.internal.features.data.model.common;

import com.sumsub.sns.internal.core.common.AbstractC28420T0;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.g2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC29121g2 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static AbstractC29180q2 m69769a(String str) {
        switch (str.hashCode()) {
            case -1895130188:
                if (str.equals("ID_CARD")) {
                    return C29133i2.f59097c;
                }
                break;
            case -1852691096:
                if (str.equals("SELFIE")) {
                    return C29157m2.f59150c;
                }
                break;
            case -1656620757:
                if (str.equals("DRIVERS")) {
                    return C29127h2.f59092c;
                }
                break;
            case -790387854:
                if (str.equals("INSURANCE_CERTIFICATE")) {
                    return C29139j2.f59116c;
                }
                break;
            case 2634817:
                if (str.equals("VISA")) {
                    return C29175p2.f59174c;
                }
                break;
            case 79048533:
                if (str.equals("SNILS")) {
                    return C29163n2.f59158c;
                }
                break;
            case 1305942932:
                if (str.equals("RESIDENCE_PERMIT")) {
                    return C29151l2.f59131c;
                }
                break;
            case 1999404050:
                if (str.equals("PASSPORT")) {
                    return C29145k2.f59128c;
                }
                break;
        }
        return new C29169o2(str, AbstractC28420T0.m69301a(StringsKt.split$default((CharSequence) str, new char[]{'_'}, false, 0, 6, (Object) null)));
    }
}
