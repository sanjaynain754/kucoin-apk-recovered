package com.kubi.utils;

import android.text.TextUtils;
import com.blankj.utilcode.util.C5259a0;
import com.blankj.utilcode.util.C5287o0;
import com.google.gson.reflect.TypeToken;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.kubi.utils.h0 */
/* JADX INFO: compiled from: PasswordUtils.java */
/* JADX INFO: loaded from: classes54.dex */
public class C27052h0 {

    /* JADX INFO: renamed from: com.kubi.utils.h0$a */
    /* JADX INFO: compiled from: PasswordUtils.java */
    public class a extends TypeToken<List<String>> {
    }

    /* JADX INFO: renamed from: b */
    public static boolean m66727b(String str) {
        return C5259a0.m6132b("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[\\S]{10,32}$", str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m66728c(CharSequence charSequence) {
        return C5259a0.m6132b("(?:[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\\.)+[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-zA-Z0-9-]*[a-zA-Z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", charSequence);
    }

    /* JADX INFO: renamed from: d */
    public static String m66729d(String str, int i11) {
        return m66730e(str, "_kucoin_", i11);
    }

    /* JADX INFO: renamed from: e */
    public static String m66730e(String str, String str2, int i11) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            sb2.append(str2);
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(sb2.toString().getBytes());
            sb2.setLength(0);
            for (byte b11 : bArrDigest) {
                String hexString = Integer.toHexString(b11 & 255);
                if (hexString.length() == 1) {
                    sb2.append(0);
                }
                sb2.append(hexString);
            }
            return i11 <= 0 ? sb2.toString() : m66730e(sb2.toString(), str2, i11 - 1);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m66726a(String str) {
        if (!TextUtils.isEmpty(str) && str.length() >= 6) {
            return !((ArrayList) C27099x.m66914d(C27101y.m66925a(C5287o0.m6331a(), "weak_pwd.json"), new a().getType())).contains(str);
        }
        return false;
    }
}
