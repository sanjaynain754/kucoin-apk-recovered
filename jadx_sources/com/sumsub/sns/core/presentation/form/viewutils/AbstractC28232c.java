package com.sumsub.sns.core.presentation.form.viewutils;

import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataPhoneFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.C28821O;
import com.sumsub.sns.internal.features.data.model.common.remote.C29405l0;
import java.io.IOException;
import java.util.Map;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewutils.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28232c {
    /* JADX INFO: renamed from: a */
    public static final String m69164a(SNSApplicantDataPhoneFieldView sNSApplicantDataPhoneFieldView) {
        String value = sNSApplicantDataPhoneFieldView.getValue();
        StringBuilder sb2 = new StringBuilder();
        int length = value.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = value.charAt(i11);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        if (string.length() <= 0) {
            return "";
        }
        return "+" + string;
    }

    /* JADX INFO: renamed from: a */
    public static final String m69166a(String str, Map map) throws IOException {
        C29405l0 c29405l0;
        String str2;
        if (str != null && (c29405l0 = (C29405l0) map.get(str)) != null && (str2 = c29405l0.f59409a) != null) {
            StringBuilder sb2 = new StringBuilder();
            int length = str2.length();
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = str2.charAt(i11);
                if (Character.isDigit(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            String string = sb2.toString();
            if (string != null && !StringsKt.isBlank(string)) {
                return string;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static final String m69165a(C28821O c28821o) {
        String strM69166a;
        String str = c28821o.f58620h;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str == null || (strM69166a = m69166a(str, c28821o.f58619g)) == null) {
                return null;
            }
            return "+" + strM69166a;
        }
        return null;
    }
}
