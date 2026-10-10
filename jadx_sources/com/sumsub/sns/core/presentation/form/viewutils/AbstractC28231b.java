package com.sumsub.sns.core.presentation.form.viewutils;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewutils.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28231b {

    /* JADX INFO: renamed from: a */
    public static final SimpleDateFormat f57527a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        f57527a = simpleDateFormat;
    }
}
