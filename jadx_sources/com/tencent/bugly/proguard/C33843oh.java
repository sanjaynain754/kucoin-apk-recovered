package com.tencent.bugly.proguard;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.oh */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33843oh {

    /* JADX INFO: renamed from: a */
    public String f71331a = null;

    /* JADX INFO: renamed from: a */
    public String m74457a(String str, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (!TextUtils.isEmpty(this.f71331a)) {
            return this.f71331a;
        }
        String strM74456a = m74456a(sharedPreferences2);
        if (!TextUtils.isEmpty(strM74456a)) {
            return strM74456a;
        }
        String strM74458b = m74458b(sharedPreferences);
        return !TextUtils.isEmpty(strM74458b) ? strM74458b : m74455a();
    }

    /* JADX INFO: renamed from: b */
    public String m74458b(SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            return sharedPreferences.getString(InterfaceC33611dg.f69604m, "");
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m74459b(String str, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(this.f71331a, str)) {
            return;
        }
        this.f71331a = str;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(InterfaceC33611dg.f69604m, this.f71331a).apply();
        }
        if (sharedPreferences2 != null) {
            sharedPreferences2.edit().putString(C33577c3.f69334H, this.f71331a).apply();
        }
    }

    /* JADX INFO: renamed from: a */
    public String m74456a(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return null;
        }
        String string = sharedPreferences.getString(C33577c3.f69334H, "");
        return !TextUtils.isEmpty(string) ? string : sharedPreferences.getString(C33577c3.f69336J, "");
    }

    /* JADX INFO: renamed from: a */
    public String m74455a() {
        String string = UUID.randomUUID().toString();
        return !TextUtils.isEmpty(string) ? string.replaceAll(C33820nf.f71144W, "") : string;
    }
}
