package com.kubi.utils;

import android.text.TextUtils;
import com.blankj.utilcode.util.C5287o0;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.kubi.sdk.utils.R$string;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.bugly.proguard.C33978va;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes54.dex */
public class TimeUtils {

    public enum Unit {
        MILL_SEC,
        SEC,
        MIN,
        HOUR,
        DAY
    }

    /* JADX INFO: renamed from: com.kubi.utils.TimeUtils$b */
    public static class C27004b {

        /* JADX INFO: renamed from: a */
        public final Calendar f54264a;

        /* JADX INFO: renamed from: b */
        public final String f54265b;

        /* JADX INFO: renamed from: a */
        public long m66434a(int i11, int i12) {
            Calendar calendar = (Calendar) this.f54264a.clone();
            calendar.add(i12, -i11);
            return calendar.getTimeInMillis();
        }

        public C27004b() {
            Calendar calendar = Calendar.getInstance();
            this.f54264a = calendar;
            this.f54265b = String.valueOf(calendar.getTimeInMillis());
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m66414a(long j11, int i11) {
        return (int) Math.ceil(j11 / m66427n(i11));
    }

    /* JADX INFO: renamed from: f */
    public static long m66419f(long j11, long j12, Unit unit) {
        return m66429p(Math.abs(j11 - j12), unit);
    }

    /* JADX INFO: renamed from: com.kubi.utils.TimeUtils$a */
    public static /* synthetic */ class C27003a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f54263a;

        static {
            int[] iArr = new int[Unit.values().length];
            f54263a = iArr;
            try {
                iArr[Unit.MILL_SEC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54263a[Unit.SEC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54263a[Unit.MIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54263a[Unit.HOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54263a[Unit.DAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m66415b(Long l11) {
        return String.format(Locale.ENGLISH, "%02d:%02d:%02d", Long.valueOf(l11.longValue() / C33978va.f72340i), Long.valueOf((l11.longValue() % C33978va.f72340i) / 60), Long.valueOf(l11.longValue() % 60));
    }

    /* JADX INFO: renamed from: e */
    public static String m66418e(long j11) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm");
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j11);
        if (calendar2.get(1) != calendar.get(1)) {
            simpleDateFormat.applyPattern("yyyy-MM-dd HH:mm");
        } else if (calendar2.get(2) == calendar.get(2) && calendar2.get(5) == calendar.get(5)) {
            simpleDateFormat.applyPattern("HH:mm");
        } else {
            simpleDateFormat.applyPattern("MM-dd HH:mm");
        }
        return simpleDateFormat.format(new Date(j11));
    }

    /* JADX INFO: renamed from: g */
    public static String m66420g(long j11) {
        if (j11 <= 0) {
            return 0 + C5287o0.m6331a().getString(R$string.minute);
        }
        double d11 = j11;
        if (d11 / m66427n(86400000) > 1.0d) {
            return m66414a(j11, 86400000) + C5287o0.m6331a().getString(R$string.day);
        }
        if (d11 / m66427n(3600000) >= 1.0d && d11 / m66427n(3600000) <= 24.0d) {
            return m66414a(j11, 3600000) + C5287o0.m6331a().getString(R$string.hour);
        }
        if (d11 / m66427n(60000) > 60.0d) {
            return "";
        }
        return m66414a(j11, 60000) + C5287o0.m6331a().getString(R$string.minute);
    }

    /* JADX INFO: renamed from: i */
    public static String m66422i(long j11) {
        return new SimpleDateFormat("HH:mm MM-dd", Locale.getDefault()).format(Long.valueOf(j11));
    }

    /* JADX INFO: renamed from: j */
    public static String m66423j(long j11, String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(Long.valueOf(j11));
    }

    /* JADX INFO: renamed from: k */
    public static String m66424k(long j11) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Long.valueOf(j11));
    }

    /* JADX INFO: renamed from: l */
    public static String m66425l(long j11) {
        return new SimpleDateFormat("MM-dd HH:mm:ss", Locale.getDefault()).format(Long.valueOf(j11));
    }

    /* JADX INFO: renamed from: m */
    public static String m66426m(long j11) {
        long j12 = j11 / 1000;
        long j13 = j11 / 60000;
        long j14 = j11 / FundingRateEntity.MILLIS_PER_HOUR;
        long j15 = j11 / 86400000;
        if (j12 < 60) {
            return C27017c.f54310a.m66516f(R$string.second_in_stub, Long.valueOf(j12));
        }
        if (j13 < 60) {
            return C27017c.f54310a.m66516f(R$string.minute_in_stub, Long.valueOf(j13 + 1));
        }
        return j14 < 24 ? C27017c.f54310a.m66516f(R$string.hour_in_stub, Long.valueOf(j14 + 1)) : C27017c.f54310a.m66516f(R$string.day_within, Long.valueOf(j15 + 1));
    }

    /* JADX INFO: renamed from: n */
    public static double m66427n(int i11) {
        return Double.parseDouble(i11 + "");
    }

    /* JADX INFO: renamed from: p */
    public static long m66429p(long j11, Unit unit) {
        int i11 = C27003a.f54263a[unit.ordinal()];
        if (i11 == 1) {
            return j11;
        }
        if (i11 == 2) {
            return j11 / 1000;
        }
        if (i11 == 3) {
            return j11 / 60000;
        }
        if (i11 == 4) {
            return j11 / FundingRateEntity.MILLIS_PER_HOUR;
        }
        if (i11 != 5) {
            return -1L;
        }
        return j11 / 86400000;
    }

    /* JADX INFO: renamed from: q */
    public static String m66430q(int i11) {
        return String.format("%02d'%02d''", Integer.valueOf(i11 / 60), Integer.valueOf(i11 % 60));
    }

    /* JADX INFO: renamed from: r */
    public static Date m66431r(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(str);
        } catch (ParseException e11) {
            e11.printStackTrace();
            return new Date();
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m66432s(long j11) {
        if (j11 < 0) {
            j11 = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        long j12 = j11 / 60;
        int i11 = (int) ((j12 / 60) % 60);
        if (i11 < 10) {
            sb2.append('0');
            sb2.append(i11);
        } else {
            sb2.append(i11);
        }
        sb2.append(C33844oi.f71346o);
        int i12 = (int) (j12 % 60);
        if (i12 < 10) {
            sb2.append('0');
            sb2.append(i12);
        } else {
            sb2.append(i12);
        }
        sb2.append(C33844oi.f71346o);
        int i13 = (int) (j11 % 60);
        if (i13 < 10) {
            sb2.append('0');
            sb2.append(i13);
        } else {
            sb2.append(i13);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m66416c(long j11) {
        long j12 = j11 / FundingRateEntity.MILLIS_PER_HOUR;
        long j13 = j11 - (FundingRateEntity.MILLIS_PER_HOUR * j12);
        long j14 = j13 / 60000;
        return String.format(Locale.ENGLISH, "%1$d:%2$02d:%3$02d", Long.valueOf(j12), Long.valueOf(j14), Long.valueOf((j13 - (60000 * j14)) / 1000));
    }

    /* JADX INFO: renamed from: d */
    public static String m66417d(long j11) {
        long j12 = j11 / 60000;
        return String.format(Locale.ENGLISH, "%1$02d:%2$02d", Long.valueOf(j12), Long.valueOf((j11 - (60000 * j12)) / 1000));
    }

    /* JADX INFO: renamed from: h */
    public static String m66421h(String str, C27004b c27004b) {
        str.getClass();
        switch (str) {
            case "ONE_WEEK":
                return String.valueOf(c27004b.m66434a(7, 6));
            case "ONE_YEAR":
                return String.valueOf(c27004b.m66434a(365, 6));
            case "THREE_MONTH":
                return String.valueOf(c27004b.m66434a(90, 6));
            case "HALF_YEAR":
                return String.valueOf(c27004b.m66434a(180, 6));
            case "ONE_MONTH":
                return String.valueOf(c27004b.m66434a(30, 6));
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m66428o(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC+8"));
        try {
            if (simpleDateFormat.parse(str).getTime() <= System.currentTimeMillis()) {
                return false;
            }
            return true;
        } catch (ParseException e11) {
            e11.printStackTrace();
            return false;
        }
    }
}
