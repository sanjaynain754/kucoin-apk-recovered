package com.geetest.captcha;

import android.content.Context;
import android.text.TextUtils;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.geetest.captcha.k */
/* JADX INFO: loaded from: classes45.dex */
public final class C6676k {
    /* JADX INFO: renamed from: a */
    public static void m12544a(Context context, long j11) {
        try {
            context.getSharedPreferences("gt_fp", 0).edit().putLong("gt_ts", j11).apply();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m12543a(Context context, String str) {
        String string;
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < bArrDigest.length; i11++) {
                char[] cArr = C6687s.f11197a;
                sb2.append(cArr[(bArrDigest[i11] >> 4) & 15]);
                sb2.append(cArr[bArrDigest[i11] & 15]);
            }
            string = sb2.toString();
        } catch (Exception unused) {
            string = null;
        }
        if (TextUtils.isEmpty(string) || "$unknown".equals(string)) {
            return null;
        }
        try {
            context.getSharedPreferences("gt_fp", 0).edit().putString("gt_fp", string).apply();
        } catch (Exception unused2) {
        }
        return string;
    }
}
