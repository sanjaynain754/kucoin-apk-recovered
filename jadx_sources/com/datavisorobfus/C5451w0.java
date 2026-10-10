package com.datavisorobfus;

import androidx.webkit.ProxyConfig;
import com.tencent.bugly.proguard.C33820nf;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.datavisorobfus.w0 */
/* JADX INFO: loaded from: classes34.dex */
public class C5451w0 {
    /* JADX INFO: renamed from: a */
    private static Calendar m7421a(Calendar calendar) {
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar2;
    }

    /* JADX INFO: renamed from: b */
    private static Set<Integer> m7425b(String str, int i11, int i12) {
        HashSet hashSet = new HashSet();
        if (str.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
            while (i11 <= i12) {
                hashSet.add(Integer.valueOf(i11));
                i11++;
            }
        } else {
            if (!str.contains(C33820nf.f71144W)) {
                hashSet.add(Integer.valueOf(Integer.parseInt(str)));
                return hashSet;
            }
            String[] strArrSplit = str.split(C33820nf.f71144W);
            int i13 = Integer.parseInt(strArrSplit[1]);
            for (int i14 = Integer.parseInt(strArrSplit[0]); i14 <= i13; i14++) {
                hashSet.add(Integer.valueOf(i14));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    private static Set<Integer> m7422a(String str, int i11, int i12) {
        String str2;
        if (str.contains("/")) {
            str2 = "parsePart does not support step expression";
        } else {
            if (m7426b(str)) {
                HashSet hashSet = new HashSet();
                if (str.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                    while (i11 <= i12) {
                        hashSet.add(Integer.valueOf(i11));
                        i11++;
                    }
                } else {
                    for (String str3 : str.split(",")) {
                        hashSet.addAll(m7425b(str3, i11, i12));
                    }
                }
                return hashSet;
            }
            str2 = "parsePart invalid expression";
        }
        C5415f0.m7136a(str2);
        return null;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m7426b(String str) {
        if (str != null && !str.isEmpty()) {
            if (ProxyConfig.MATCH_ALL_SCHEMES.equals(str)) {
                return true;
            }
            if (m7424a(str, "(\\d+|(\\d+)-(\\d+))(,(\\d+|(\\d+)-(\\d+)))*")) {
                for (String str2 : str.split(",")) {
                    if (m7424a(str2, "(\\d+)-(\\d+)")) {
                        String[] strArrSplit = str2.split(C33820nf.f71144W);
                        if (Integer.parseInt(strArrSplit[0]) >= Integer.parseInt(strArrSplit[1])) {
                            return false;
                        }
                    } else if (!m7424a(str2, "\\d+")) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7423a(String str) {
        try {
            if (C5457z0.m7481a("* * * * *", str)) {
                C5415f0.m7136a("Invalid crontab format: 5 star all match crontab");
                return false;
            }
            String[] strArrSplit = str.split("\\s+");
            if (strArrSplit.length != 5) {
                C5415f0.m7136a("Invalid crontab format: length wrong");
                return false;
            }
            Set<Integer> setM7422a = m7422a(strArrSplit[0], 0, 59);
            Set<Integer> setM7422a2 = m7422a(strArrSplit[1], 0, 23);
            Set<Integer> setM7422a3 = m7422a(strArrSplit[2], 1, 31);
            Set<Integer> setM7422a4 = m7422a(strArrSplit[3], 1, 12);
            Set<Integer> setM7422a5 = m7422a(strArrSplit[4], 0, 6);
            if (setM7422a != null && setM7422a2 != null && setM7422a3 != null && setM7422a4 != null && setM7422a5 != null) {
                Calendar calendarM7421a = m7421a(Calendar.getInstance());
                return setM7422a.contains(Integer.valueOf(calendarM7421a.get(12))) && setM7422a2.contains(Integer.valueOf(calendarM7421a.get(11))) && (setM7422a3.contains(Integer.valueOf(calendarM7421a.get(5))) || setM7422a5.contains(Integer.valueOf(calendarM7421a.get(7) - 1))) && setM7422a4.contains(Integer.valueOf(calendarM7421a.get(2) + 1));
            }
            C5415f0.m7136a("simple crontab parser not supported expression");
            return false;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7424a(String str, String str2) {
        return Pattern.compile(str2).matcher(str).matches();
    }
}
