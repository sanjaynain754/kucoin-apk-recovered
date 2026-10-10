package com.tencent.bugly.proguard;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.rmonitor.custom.C35153a;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.fi */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33655fi {

    /* JADX INFO: renamed from: a */
    public static final String f69910a = "RDelivery";

    /* JADX INFO: renamed from: a */
    public static void m73083a(String str) {
        m73084a(C35153a.f75233k, str);
    }

    /* JADX INFO: renamed from: b */
    public static void m73086b(String str) {
        m73088c(str);
        m73084a(C35153a.f75231i, str);
    }

    /* JADX INFO: renamed from: c */
    public static String m73087c() {
        return m73082a(C33991w3.m75338a().m77148b(C35153a.f75232j));
    }

    /* JADX INFO: renamed from: d */
    public static void m73090d(String str) {
        m73084a(C35153a.f75232j, str);
    }

    /* JADX INFO: renamed from: a */
    public static String m73081a() {
        return m73082a(C33991w3.m75338a().m77148b(C35153a.f75233k));
    }

    /* JADX INFO: renamed from: d */
    public static String m73089d() {
        String strM73085b = m73085b();
        m73084a(C35153a.f75231i, strM73085b);
        return strM73085b;
    }

    /* JADX INFO: renamed from: b */
    public static String m73085b() {
        SharedPreferences sharedPreferences = C33716ig.m73433a().getSharedPreferences(C33598d3.m72772c(), "BUGLY_COMMON_VALUES", true);
        return sharedPreferences != null ? sharedPreferences.getString(C33577c3.f69343Q, "") : "";
    }

    /* JADX INFO: renamed from: c */
    public static void m73088c(String str) {
        SharedPreferences sharedPreferences = C33716ig.m73433a().getSharedPreferences(C33598d3.m72772c(), "BUGLY_COMMON_VALUES", true);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(C33577c3.f69343Q, str);
            editorEdit.apply();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73084a(String str, String str2) {
        C35153a c35153aM75338a = C33991w3.m75338a();
        c35153aM75338a.m77146a(str);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        for (String str3 : str2.split(C33861pe.f71429b)) {
            c35153aM75338a.m77150b(str, str3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m73082a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            int i11 = 0;
            for (String str : list) {
                if (i11 > 0) {
                    sb2.append("|");
                }
                sb2.append(str);
                i11++;
            }
            return sb2.toString();
        }
        return "";
    }
}
