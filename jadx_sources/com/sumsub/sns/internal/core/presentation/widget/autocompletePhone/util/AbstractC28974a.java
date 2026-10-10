package com.sumsub.sns.internal.core.presentation.widget.autocompletePhone.util;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.widget.autocompletePhone.util.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28974a {
    /* JADX INFO: renamed from: a */
    public static final boolean m69714a(String str) {
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '#' || Character.isDigit(cCharAt)) {
                i11++;
            }
        }
        return 7 <= i11 && i11 < 16;
    }
}
