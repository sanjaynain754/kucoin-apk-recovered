package com.facebook.hermes.intl;

import android.icu.text.DateFormat;
import android.icu.text.NumberingSystem;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.icu.util.ULocale;
import androidx.annotation.RequiresApi;
import androidx.core.text.util.LocalePreferences;
import cn.jiguang.privates.push.constants.JPushConstants;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import p359j5.C40275d;
import p359j5.InterfaceC40273b;

/* JADX INFO: renamed from: com.facebook.hermes.intl.d */
/* JADX INFO: compiled from: PlatformDateTimeFormatterICU.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5633d implements IPlatformDateTimeFormatter {

    /* JADX INFO: renamed from: a */
    public DateFormat f8788a = null;

    /* JADX INFO: renamed from: com.facebook.hermes.intl.d$b */
    /* JADX INFO: compiled from: PlatformDateTimeFormatterICU.java */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static String m9062a(String str) {
            StringBuilder sb2 = new StringBuilder();
            boolean z11 = false;
            for (int i11 = 0; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (cCharAt == '\'') {
                    z11 = !z11;
                } else if (!z11 && ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
                    sb2.append(str.charAt(i11));
                }
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m9059k(StringBuilder sb2, char[] cArr, char c11) {
        for (int i11 = 0; i11 < sb2.length(); i11++) {
            for (char c12 : cArr) {
                if (sb2.charAt(i11) == c12) {
                    sb2.setCharAt(i11, c11);
                    break;
                }
            }
        }
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: g */
    public void mo8992g(InterfaceC40273b<?> interfaceC40273b, String str, String str2, IPlatformDateTimeFormatter.FormatMatcher formatMatcher, IPlatformDateTimeFormatter.WeekDay weekDay, IPlatformDateTimeFormatter.Era era, IPlatformDateTimeFormatter.Year year, IPlatformDateTimeFormatter.Month month, IPlatformDateTimeFormatter.Day day, IPlatformDateTimeFormatter.Hour hour, IPlatformDateTimeFormatter.Minute minute, IPlatformDateTimeFormatter.Second second, IPlatformDateTimeFormatter.TimeZoneName timeZoneName, IPlatformDateTimeFormatter.HourCycle hourCycle, Object obj, IPlatformDateTimeFormatter.DateStyle dateStyle, IPlatformDateTimeFormatter.TimeStyle timeStyle, Object obj2) throws JSRangeErrorException {
        Calendar calendar;
        InterfaceC40273b<?> interfaceC40273b2;
        String strM9058j = m9058j(interfaceC40273b, weekDay, era, year, month, day, hour, minute, second, timeZoneName, hourCycle, dateStyle, timeStyle, obj2);
        if (str.isEmpty()) {
            calendar = null;
        } else {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(C40275d.m88677h(str));
            InterfaceC40273b<?> interfaceC40273bMo88663f = interfaceC40273b.mo88663f();
            interfaceC40273bMo88663f.mo88660c("ca", arrayList);
            calendar = Calendar.getInstance((ULocale) interfaceC40273bMo88663f.getLocale());
        }
        if (str2.isEmpty()) {
            interfaceC40273b2 = interfaceC40273b;
        } else {
            try {
                if (NumberingSystem.getInstanceByName(C40275d.m88677h(str2)) == null) {
                    throw new JSRangeErrorException("Invalid numbering system: " + str2);
                }
                ArrayList<String> arrayList2 = new ArrayList<>();
                arrayList2.add(C40275d.m88677h(str2));
                interfaceC40273b2 = interfaceC40273b;
                interfaceC40273b2.mo88660c("nu", arrayList2);
            } catch (RuntimeException unused) {
                throw new JSRangeErrorException("Invalid numbering system: " + str2);
            }
        }
        if (calendar != null) {
            this.f8788a = DateFormat.getPatternInstance(calendar, strM9058j, (ULocale) interfaceC40273b2.getLocale());
        } else {
            this.f8788a = DateFormat.getPatternInstance(strM9058j, (ULocale) interfaceC40273b2.getLocale());
        }
        if (C40275d.m88683n(obj) || C40275d.m88679j(obj)) {
            return;
        }
        this.f8788a.setTimeZone(TimeZone.getTimeZone(C40275d.m88677h(obj)));
    }

    /* JADX INFO: renamed from: com.facebook.hermes.intl.d$a */
    /* JADX INFO: compiled from: PlatformDateTimeFormatterICU.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8789a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f8790b;

        static {
            int[] iArr = new int[IPlatformDateTimeFormatter.TimeStyle.values().length];
            f8790b = iArr;
            try {
                iArr[IPlatformDateTimeFormatter.TimeStyle.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8790b[IPlatformDateTimeFormatter.TimeStyle.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8790b[IPlatformDateTimeFormatter.TimeStyle.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8790b[IPlatformDateTimeFormatter.TimeStyle.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8790b[IPlatformDateTimeFormatter.TimeStyle.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[IPlatformDateTimeFormatter.DateStyle.values().length];
            f8789a = iArr2;
            try {
                iArr2[IPlatformDateTimeFormatter.DateStyle.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8789a[IPlatformDateTimeFormatter.DateStyle.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8789a[IPlatformDateTimeFormatter.DateStyle.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8789a[IPlatformDateTimeFormatter.DateStyle.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8789a[IPlatformDateTimeFormatter.DateStyle.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: i */
    public static String m9057i(InterfaceC40273b<?> interfaceC40273b, IPlatformDateTimeFormatter.DateStyle dateStyle, IPlatformDateTimeFormatter.TimeStyle timeStyle) throws JSRangeErrorException {
        if (dateStyle == IPlatformDateTimeFormatter.DateStyle.UNDEFINED) {
            return ((SimpleDateFormat) DateFormat.getTimeInstance(m9061m(timeStyle), (ULocale) interfaceC40273b.getLocale())).toLocalizedPattern();
        }
        return timeStyle == IPlatformDateTimeFormatter.TimeStyle.UNDEFINED ? ((SimpleDateFormat) DateFormat.getDateInstance(m9060l(dateStyle), (ULocale) interfaceC40273b.getLocale())).toLocalizedPattern() : ((SimpleDateFormat) DateFormat.getDateTimeInstance(m9060l(dateStyle), m9061m(timeStyle), (ULocale) interfaceC40273b.getLocale())).toLocalizedPattern();
    }

    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: j */
    public static String m9058j(InterfaceC40273b<?> interfaceC40273b, IPlatformDateTimeFormatter.WeekDay weekDay, IPlatformDateTimeFormatter.Era era, IPlatformDateTimeFormatter.Year year, IPlatformDateTimeFormatter.Month month, IPlatformDateTimeFormatter.Day day, IPlatformDateTimeFormatter.Hour hour, IPlatformDateTimeFormatter.Minute minute, IPlatformDateTimeFormatter.Second second, IPlatformDateTimeFormatter.TimeZoneName timeZoneName, IPlatformDateTimeFormatter.HourCycle hourCycle, IPlatformDateTimeFormatter.DateStyle dateStyle, IPlatformDateTimeFormatter.TimeStyle timeStyle, Object obj) throws JSRangeErrorException {
        StringBuilder sb2 = new StringBuilder();
        if (dateStyle == IPlatformDateTimeFormatter.DateStyle.UNDEFINED && timeStyle == IPlatformDateTimeFormatter.TimeStyle.UNDEFINED) {
            sb2.append(weekDay.getSkeleonSymbol());
            sb2.append(era.getSkeleonSymbol());
            sb2.append(year.getSkeleonSymbol());
            sb2.append(month.getSkeleonSymbol());
            sb2.append(day.getSkeleonSymbol());
            if (hourCycle == IPlatformDateTimeFormatter.HourCycle.H11 || hourCycle == IPlatformDateTimeFormatter.HourCycle.H12) {
                sb2.append(hour.getSkeleonSymbol12());
            } else {
                sb2.append(hour.getSkeleonSymbol24());
            }
            sb2.append(minute.getSkeleonSymbol());
            sb2.append(second.getSkeleonSymbol());
            sb2.append(timeZoneName.getSkeleonSymbol());
        } else {
            sb2.append(m9057i(interfaceC40273b, dateStyle, timeStyle));
            HashMap<String, String> mapMo88661d = interfaceC40273b.mo88661d();
            if (mapMo88661d.containsKey("hc")) {
                String str = mapMo88661d.get("hc");
                if (str == LocalePreferences.HourCycle.H11 || str == LocalePreferences.HourCycle.H12) {
                    m9059k(sb2, new char[]{'H', 'K', 'k'}, 'h');
                } else if (str == LocalePreferences.HourCycle.H23 || str == LocalePreferences.HourCycle.H24) {
                    m9059k(sb2, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
            if (hourCycle == IPlatformDateTimeFormatter.HourCycle.H11 || hourCycle == IPlatformDateTimeFormatter.HourCycle.H12) {
                m9059k(sb2, new char[]{'H', 'K', 'k'}, 'h');
            } else if (hourCycle == IPlatformDateTimeFormatter.HourCycle.H23 || hourCycle == IPlatformDateTimeFormatter.HourCycle.H24) {
                m9059k(sb2, new char[]{'h', 'H', 'K'}, 'k');
            }
            if (!C40275d.m88683n(obj) && !C40275d.m88679j(obj)) {
                if (C40275d.m88674e(obj)) {
                    m9059k(sb2, new char[]{'H', 'K', 'k'}, 'h');
                } else {
                    m9059k(sb2, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
        }
        return sb2.toString();
    }

    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: l */
    public static int m9060l(IPlatformDateTimeFormatter.DateStyle dateStyle) throws JSRangeErrorException {
        int i11 = a.f8789a[dateStyle.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        throw new JSRangeErrorException("Invalid DateStyle: " + dateStyle.toString());
    }

    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: m */
    public static int m9061m(IPlatformDateTimeFormatter.TimeStyle timeStyle) throws JSRangeErrorException {
        int i11 = a.f8790b[timeStyle.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        throw new JSRangeErrorException("Invalid DateStyle: " + timeStyle.toString());
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    /* JADX INFO: renamed from: a */
    public AttributedCharacterIterator mo8986a(double d11) {
        return this.f8788a.formatToCharacterIterator(Double.valueOf(d11));
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: b */
    public String mo8987b(double d11) {
        return this.f8788a.format(new Date((long) d11));
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: e */
    public String mo8990e(AttributedCharacterIterator.Attribute attribute, String str) {
        if (attribute == DateFormat.Field.DAY_OF_WEEK) {
            return "weekday";
        }
        if (attribute == DateFormat.Field.ERA) {
            return "era";
        }
        if (attribute == DateFormat.Field.YEAR) {
            try {
                Double.parseDouble(str);
                return "year";
            } catch (NumberFormatException unused) {
                return "yearName";
            }
        }
        if (attribute == DateFormat.Field.MONTH) {
            return "month";
        }
        if (attribute == DateFormat.Field.DAY_OF_MONTH) {
            return JPushConstants.NotificationTime.KEY_DAYS;
        }
        if (attribute == DateFormat.Field.HOUR0 || attribute == DateFormat.Field.HOUR1 || attribute == DateFormat.Field.HOUR_OF_DAY0 || attribute == DateFormat.Field.HOUR_OF_DAY1) {
            return "hour";
        }
        if (attribute == DateFormat.Field.MINUTE) {
            return "minute";
        }
        if (attribute == DateFormat.Field.SECOND) {
            return "second";
        }
        if (attribute == DateFormat.Field.TIME_ZONE) {
            return "timeZoneName";
        }
        if (attribute == DateFormat.Field.AM_PM) {
            return "dayPeriod";
        }
        return attribute.toString().equals("android.icu.text.DateFormat$Field(related year)") ? "relatedYear" : "literal";
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: c */
    public String mo8988c(InterfaceC40273b<?> interfaceC40273b) throws JSRangeErrorException {
        return NumberingSystem.getInstance((ULocale) interfaceC40273b.getLocale()).getName();
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: d */
    public String mo8989d(InterfaceC40273b<?> interfaceC40273b) throws JSRangeErrorException {
        return UnicodeExtensionKeys.m9044d(DateFormat.getDateInstance(3, (ULocale) interfaceC40273b.getLocale()).getCalendar().getType());
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: f */
    public IPlatformDateTimeFormatter.HourCycle mo8991f(InterfaceC40273b<?> interfaceC40273b) throws JSRangeErrorException {
        try {
            String strM9062a = b.m9062a(((SimpleDateFormat) DateFormat.getTimeInstance(0, (ULocale) interfaceC40273b.getLocale())).toPattern());
            if (strM9062a.contains(String.valueOf('h'))) {
                return IPlatformDateTimeFormatter.HourCycle.H12;
            }
            if (strM9062a.contains(String.valueOf('K'))) {
                return IPlatformDateTimeFormatter.HourCycle.H11;
            }
            if (strM9062a.contains(String.valueOf('H'))) {
                return IPlatformDateTimeFormatter.HourCycle.H23;
            }
            return IPlatformDateTimeFormatter.HourCycle.H24;
        } catch (ClassCastException unused) {
            return IPlatformDateTimeFormatter.HourCycle.H24;
        }
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: h */
    public String mo8993h(InterfaceC40273b<?> interfaceC40273b) throws JSRangeErrorException {
        return Calendar.getInstance((ULocale) interfaceC40273b.getLocale()).getTimeZone().getID();
    }
}
