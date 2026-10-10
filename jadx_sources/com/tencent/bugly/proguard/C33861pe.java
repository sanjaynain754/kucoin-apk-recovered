package com.tencent.bugly.proguard;

import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.pe */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33861pe {

    /* JADX INFO: renamed from: a */
    public static final String f71428a = "|";

    /* JADX INFO: renamed from: b */
    public static final String f71429b = "\\|";

    /* JADX INFO: renamed from: c */
    public static final String f71430c = "base64_";

    /* JADX INFO: renamed from: d */
    public static final String f71431d = "origin_";

    /* JADX INFO: renamed from: e */
    public static final int f71432e = 7;

    /* JADX INFO: renamed from: f */
    public static final int f71433f = 7;

    /* JADX INFO: renamed from: a */
    public static List<String> m74563a(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            try {
                for (String str2 : str.split(f71429b)) {
                    if (str2.startsWith(f71431d)) {
                        str2 = str2.substring(f71433f);
                    } else if (str2.startsWith(f71430c)) {
                        str2 = new String(Base64.decode(str2.substring(f71432e), 2));
                    }
                    arrayList.add(str2);
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static String m74562a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(256);
            int i11 = 0;
            for (String strConcat : list) {
                if (strConcat != null) {
                    if (i11 > 0) {
                        sb2.append("|");
                    }
                    if (!strConcat.isEmpty()) {
                        strConcat = strConcat.contains("|") ? f71430c + Base64.encodeToString(strConcat.getBytes(), 2) : f71431d.concat(strConcat);
                    }
                    sb2.append(strConcat);
                    i11++;
                }
            }
            return sb2.toString();
        }
        return "";
    }
}
