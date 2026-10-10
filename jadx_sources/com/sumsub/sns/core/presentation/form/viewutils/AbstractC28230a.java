package com.sumsub.sns.core.presentation.form.viewutils;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewutils.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28230a {

    /* JADX INFO: renamed from: a */
    public static final SimpleDateFormat f57526a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        f57526a = simpleDateFormat;
    }
}
