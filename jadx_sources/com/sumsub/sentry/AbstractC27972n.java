package com.sumsub.sentry;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.sumsub.sentry.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC27972n {

    /* JADX INFO: renamed from: a */
    public static final SimpleDateFormat f57093a;

    /* JADX INFO: renamed from: b */
    public static final Date f57094b;

    static {
        ThreadLocal threadLocal = new ThreadLocal();
        Object obj = threadLocal.get();
        Object obj2 = obj;
        if (obj == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            threadLocal.set(simpleDateFormat);
            obj2 = simpleDateFormat;
        }
        f57093a = (SimpleDateFormat) obj2;
        f57094b = Calendar.getInstance(TimeZone.getTimeZone("GMT")).getTime();
    }
}
